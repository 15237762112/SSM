package com.zhiyou.mapper;

import java.util.List;


import com.zhiyou.model.User;
// ���ֽӿڵ�Ȩ�޶�����mapper�е�namespaceһ��
public interface UserMapper {
	void add(User user);	//�������������Ӧmapper�е�idһ��
	void update(User user); //������mapper�е�parameterTypeһ��
	void delete(int id);
	List<User> selectAll(); //����ֵ��mapper�е�resultTypeһ��	
	User selectByID(int id);
}
