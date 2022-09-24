package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userRepository extends JpaRepository<User, Integer>{
	@Query(value = "select * from user where uid=?1;",nativeQuery = true)
	public User findUserObject(int uid);

}
