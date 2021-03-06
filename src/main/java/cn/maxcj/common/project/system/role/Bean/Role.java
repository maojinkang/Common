package cn.maxcj.common.project.system.role.Bean;

import cn.maxcj.common.framework.web.Bean.BaseEntity;

/**
 * @author: Maxcj
 * @email: 903283542@qq.com
 */
public class Role extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 角色ID */
    //@Excel(name = "角色序号")
    private Long roleId;

    /** 角色名称 */
    //@Excel(name = "角色名称")
    private String roleName;

    /** 角色权限 */
    //@Excel(name = "角色权限")
    private String roleKey;

    /** 角色排序 */
    //@Excel(name = "角色排序")
    private String roleSort;

    /** 数据范围（1：所有数据权限；2：自定数据权限） */
    //@Excel(name = "数据范围")
    private String dataScope;

    /** 角色状态（0正常 1停用） */
    //@Excel(name = "角色状态")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 用户是否存在此角色标识 默认不存在 */
    private boolean flag = false;

    /** 菜单组 */
    private Long[] menuIds;

    /** 部门组（数据权限） */
    private Long[] deptIds;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public String getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(String roleSort) {
        this.roleSort = roleSort;
    }

    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Long[] getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(Long[] menuIds) {
        this.menuIds = menuIds;
    }

    public Long[] getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(Long[] deptIds) {
        this.deptIds = deptIds;
    }
}

