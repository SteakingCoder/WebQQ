package com.wang.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.wang.DBConnection.MySqlConnection;
import com.wang.bean.User;
import com.wang.model.IconImageModel;
import com.wang.service.ImageService;

public interface IUserDAO{

	public User getUser(@Param("id")String id);
	
	public void createRecordTable(@Param("dbName")String dbName);
	
	public void addFriend(@Param("dbName")String dbName, @Param("friendId")String friendId, @Param("friendImageUri")String friendImgUri);
		
//TODO 原始addFriend逻辑 在Service中实现
	//createRecordTable
	//addFriend
//		String create_record_sql = "create table if not exists "+record_dbName+"(srcId varchar(20), dstId varchar(20), content varchar(512), timestamp Date,constraint foreign key (srcId) references User(id), foreign key (dstId) references User(id));";
//		
//		String add_friend_sql_1 = "insert into friend_"+id+" values('"+friendId+"', '"+imageUri_2+"');";
//		String add_friend_sql_2 = "insert into friend_"+friendId+" values('"+id+"', '"+imageUri_1+"');";

	

	public boolean deleteUser(@Param("id")String id);

	public List<User> getAllUsers();

	public void applyAccount(@Param("userId")String userId);
	public String requireAccount();
	//TODO 原始applyAccount逻辑
	//requireAccount
	//applyAccount
		
//			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("select * from user_set where flag=0 limit 0,1");
//			if(resultSet.next()){
//				userId = resultSet.getString(1);
//				System.out.println("queryed userID " + userId);
//				statement.execute("update user_set set flag=1 where id='"+userId+"'");
//				//添加用户记录
//				statement.execute("insert into user values('"+userId+"', 'http://localhost:8080/SpringMVC/images/defaultIcon.jpg', 'woman', 0, 'signature', null);");
//				//添加未读消息记录表
//				statement.executeUpdate("create table history_"+userId+"(friendId varchar(20), content varchar(512), timestamp datetime) character set = utf8;");
//				//添加好友记录表
//				statement.executeUpdate("create table friend_"+userId+"(friendId varchar(20) DEFAULT NULL, friendImgUri varchar(200) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8");
	
	public boolean updateUser(@Param("user")User user);
	


}
