package com.driver.repositories;

import com.driver.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where blog_id:=userID",nativeQuery = true)
    public Blog findUser(int userID);

}
