package ejbProject;

import javax.naming.InitialContext;
import javax.naming.NamingException;
      
 public class MyBeanClient {

    public static void main(String[] args) {
         try { 
          InitialContext ctx = new
          InitialContext(); 
          SessionBeanRemote bean = (SessionBeanRemote) ctx.lookup(SessionBeanRemote.class.getName()); 
          bean.doSomething(); 
         } 
         catch (NamingException e) { 
             e.printStackTrace(); 
         }
  }
}