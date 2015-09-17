package org.andy.shop.service;
import java.util.List;  

import org.andy.shop.model.UserInfo;





public interface UserService {
	
	   UserInfo getUserById(int id);  
	      
	   List<UserInfo> getUsers();  
	      
	   int insert(UserInfo userInfo); 

}
