package ��¼ע����ϰ;
import java.util.Scanner;
import ��¼ע����ϰ.UserDaoImp;
import ��¼ע����ϰ.User;

public class UserText {
	public static void main(String arge[]) {
		while(true){
			System.out.println("��ӭ�����ҵ���վ");
			System.out.println("1����վ");
			System.out.println("2:ע��");
			System.out.println("3:�˳�");
			System.out.println("��ѡ��:");
			Scanner sc =new Scanner(System.in);
			String line=sc.nextLine();//nextLine()�������������س�����ֹ���룬��next()�����������ո񣬻س���Tab�����ᱻ��Ϊ��ֹ����
										//����next()����õ����ո���ַ�������nextLine()���Եõ����ո���ַ�����
			switch(line)
			{case "1":
				System.out.println("��ӭ��½");
				System.out.println("�������û���");
				String name=sc.nextLine();
				System.out.println("����������");
				String password=sc.nextLine();
				UserDaoImp udi=new UserDaoImp();
				boolean flag=udi.isLogin(name, password);
				if (flag) {
					System.out.println("��½�ɹ�");
				} else {
					System.out.println("��¼ʧ��");
				}
				break;
			case "2":
				System.out.println("��ӭ��½");
				System.out.println("�������û���");
				String newname=sc.nextLine();
				System.out.println("����������");
				String newpassword=sc.nextLine();
				System.out.println("����������");
				String newemail=sc.nextLine();
				System.out.println("������绰");
				String newphone=sc.nextLine();
				User user=new User();
				user.setUsername(newname);
				user.setPassword(newpassword);
				user.setEmail(newemail);
				user.setPhone(newphone);
				UserDaoImp newudi=new UserDaoImp();
				newudi.regist(user);//registע��
				System.out.println("ע��ɹ�");
				break;
			case "3":
				System.out.println("�˳�");
				System.exit(0);//��ֹ��ǰ�������е�Java�������exit(0)���������˳���������ֵΪ�������˳�
				break;
			default:
				System.out.println("�˳�");
				System.exit(0);
				break;
				}
			
		}
	}
}
