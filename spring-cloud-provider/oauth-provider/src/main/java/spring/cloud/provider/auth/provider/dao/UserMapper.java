package spring.cloud.provider.auth.provider.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import spring.cloud.provider.auth.provider.entity.User;

@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT id,username,password,enabled,account_non_expired,credentials_non_expired,account_non_locked,name,mobile,created_time,updated_time,created_by,updated_by" +
            " FROM users WHERE username = #{username}")
    User getByUsername(String username);
}