package µÇÂ¼×¢²áÁ·Ï°;
import µÇÂ¼×¢²áÁ·Ï°.UserDao;
import µÇÂ¼×¢²áÁ·Ï°.User;
public  class UserDaoImp implements UserDao{
	private static User[] users=new User[5];
	private static int  index=0;
	@Override
	public boolean isLogin(String username,String password) {
		boolean flag=false;
		for (int x = 0; x < users.length; x++) {
			User user=users[x];
			if (user != null) {
				if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
					flag=true;
				}
			}	
		}
		return flag;
	
}
	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		users[index++]=user;
	}
}
