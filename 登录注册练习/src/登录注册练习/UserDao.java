//package dao;
package µÇÂ¼×¢²áÁ·Ï°;
import  µÇÂ¼×¢²áÁ·Ï°.User;

public interface UserDao {
	public abstract boolean isLogin(String username,String password);
	public abstract void regist(User user);
}
