package 登录注册练习;
import java.util.Scanner;
import 登录注册练习.UserDaoImp;
import 登录注册练习.User;

public class UserText {
	public static void main(String arge[]) {
		while(true){
			System.out.println("欢迎来到我的网站");
			System.out.println("1：网站");
			System.out.println("2:注册");
			System.out.println("3:退出");
			System.out.println("请选择:");
			Scanner sc =new Scanner(System.in);
			String line=sc.nextLine();//nextLine()的输入是碰到回车就终止输入，而next()方法是碰到空格，回车，Tab键都会被视为终止符。
										//所以next()不会得到带空格的字符串，而nextLine()可以得到带空格的字符串。
			switch(line)
			{case "1":
				System.out.println("欢迎登陆");
				System.out.println("请输入用户名");
				String name=sc.nextLine();
				System.out.println("请输入密码");
				String password=sc.nextLine();
				UserDaoImp udi=new UserDaoImp();
				boolean flag=udi.isLogin(name, password);
				if (flag) {
					System.out.println("登陆成功");
				} else {
					System.out.println("登录失败");
				}
				break;
			case "2":
				System.out.println("欢迎登陆");
				System.out.println("请输入用户名");
				String newname=sc.nextLine();
				System.out.println("请输入密码");
				String newpassword=sc.nextLine();
				System.out.println("请输入邮箱");
				String newemail=sc.nextLine();
				System.out.println("请输入电话");
				String newphone=sc.nextLine();
				User user=new User();
				user.setUsername(newname);
				user.setPassword(newpassword);
				user.setEmail(newemail);
				user.setPhone(newphone);
				UserDaoImp newudi=new UserDaoImp();
				newudi.regist(user);//regist注册
				System.out.println("注册成功");
				break;
			case "3":
				System.out.println("退出");
				System.exit(0);//终止当前正在运行的Java虑拟机，exit(0)代表正常退出，其它数值为非正常退出
				break;
			default:
				System.out.println("退出");
				System.exit(0);
				break;
				}
			
		}
	}
}
