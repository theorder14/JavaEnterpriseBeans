package ejbProject;

import javax.ejb.Stateless;

@Stateless
public class SessionBean implements SessionBeanRemote, SessionBeanLo{

	
	private static final long serialVersionUID = 3446815880879723491L;


	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.print("Hello EJB");
		
	}
 }

