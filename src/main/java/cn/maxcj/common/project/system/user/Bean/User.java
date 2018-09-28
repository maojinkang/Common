package cn.maxcj.common.project.system.user.Bean;

import cn.maxcj.common.framework.web.Bean.BaseEntity;
import cn.maxcj.common.project.system.dept.Bean.Dept;
import cn.maxcj.common.project.system.role.Bean.Role;

import java.util.Date;
import java.util.List;

/**
 * @author: Maxcj
 * @email: 903283542@qq.com
 */


public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    //@Excel(name = "用户序号")
    private Long userId;

    /** 部门ID */
    private Long deptId;

    /** 部门父ID */
    private Long parentId;

    /** 登录名称 */
    //@Excel(name = "登录名称")
    private String loginName;

    /** 用户名称 */
    //@Excel(name = "用户名称")
    private String userName;

    /** 用户邮箱 */
    //@Excel(name = "用户邮箱")
    private String email;

    /** 手机号码 */
    //@Excel(name = "手机号码")
    private String phonenumber;

    /** 用户性别 */
    //@Excel(name = "用户性别")
    private String sex;

    /** 用户头像 */
    private String avatar;

    /** 密码 */
    private String password;

    /** 盐加密 */
    private String salt;

    /** 帐号状态（0正常 1停用） */
   // @Excel(name = "帐号状态")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 最后登陆IP */
    //@Excel(name = "最后登陆IP")
    private String loginIp;

    /** 最后登陆时间 */
   // @Excel(name = "最后登陆时间")
    private Date loginDate;

    /** 部门对象 */
    private Dept dept;

    /** 角色集合 */
    private List<Role> roles;

    /** 角色组 */
    private Long[] roleIds;

    /** 岗位组 */
    private Long[] postIds;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Long[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Long[] roleIds) {
        this.roleIds = roleIds;
    }

    public Long[] getPostIds() {
        return postIds;
    }

    public void setPostIds(Long[] postIds) {
        this.postIds = postIds;
    }
}
