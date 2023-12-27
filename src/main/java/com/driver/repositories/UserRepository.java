package com.driver.repositories;

import com.driver.models.Blog;
import com.driver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Transactional
    @Modifying
    @Query(value = "update user set password:=pass where userID:=id",nativeQuery = true)
    public  void updateUser(int id,String pass);



    @Query(value = "select * from user where user_id:=userID",nativeQuery = true)
    public User findUser(int userID);
}
