package tk.mybatis.simple.generator.dao;

import java.util.List;
import tk.mybatis.simple.generator.model.SysUserRole;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    List<SysUserRole> selectAll();
}