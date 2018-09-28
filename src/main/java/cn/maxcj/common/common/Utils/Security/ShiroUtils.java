package cn.maxcj.common.common.Utils.Security;

import cn.maxcj.common.common.Utils.Bean.BeanUtils;
import cn.maxcj.common.common.Utils.StringUtils;
import cn.maxcj.common.project.system.user.Bean.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;

/**
 * @author: Maxcj
 * @email: 903283542@qq.com
 */
public class ShiroUtils {
    public static Subject getSubjct()
    {
        return SecurityUtils.getSubject();
    }

    public static Session getSession()
    {
        return SecurityUtils.getSubject().getSession();
    }

    public static void logout()
    {
        getSubjct().logout();
    }

    public static User getUser()
    {
        User user = null;
        Object obj = getSubjct().getPrincipal();
        if (StringUtils.isNotNull(obj))
        {
            user = new User();
            BeanUtils.copyBeanProp(user, obj);
        }
        return user;
    }

    public static void setUser(User user)
    {
        Subject subject = getSubjct();
        PrincipalCollection principalCollection = subject.getPrincipals();
        String realmName = principalCollection.getRealmNames().iterator().next();
        PrincipalCollection newPrincipalCollection = new SimplePrincipalCollection(user, realmName);
        // 重新加载Principal
        subject.runAs(newPrincipalCollection);
    }

    public static void clearCachedAuthorizationInfo()
    {
        RealmSecurityManager rsm = (RealmSecurityManager) SecurityUtils.getSecurityManager();
        UserRealm realm = (UserRealm) rsm.getRealms().iterator().next();
        realm.clearCachedAuthorizationInfo();
    }

    public static Long getUserId()
    {
        return getUser().getUserId().longValue();
    }

    public static String getLoginName()
    {
        return getUser().getLoginName();
    }

    public static String getIp()
    {
        return getSubjct().getSession().getHost();
    }

    public static String getSessionId()
    {
        return String.valueOf(getSubjct().getSession().getId());
    }
}
