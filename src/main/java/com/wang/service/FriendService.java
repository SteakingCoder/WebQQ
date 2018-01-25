package com.wang.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.wang.bean.Friend;
import com.wang.dao.IFriendDAO;

@Service("friendService")
public class FriendService{

	@Resource
	private IFriendDAO friendDAO;

	public void deleteFriend(String userId, String friendId){
		friendDAO.deleteFriend("friend_"+userId, friendId);
	}
	
	
	public List<Friend> getAllFriends(String id) {
		return friendDAO.getAllFriends("friend_"+id);
	}
	
	public void addFriend(String id, String friendId, String groupName) {
		friendDAO.addFriend("friend_"+id, friendId, groupName);
	}

	public List<String> getAlivedFriends(String userId){
		return friendDAO.getAlivedFriends(userId);
	}



}
