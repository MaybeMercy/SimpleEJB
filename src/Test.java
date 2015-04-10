import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.rmb.RMBConvert;

public class Test {
	public static void main(String[] args) {  
		  
        /** 
         * 硬编码模式 
         */  
        try {  
            Properties props = new Properties();  
            // 设置JNDI驱动的类名  
            props.setProperty("java.naming.factory.initial",  
                    "org.jnp.interfaces.NamingContextFactory");  
            // 提供命名服务的URL  
            props.setProperty("java.naming.provider.url", "localhost:1099");  
            InitialContext ctx = new InitialContext(props);  
            RMBConvert rmb = (RMBConvert) ctx  
                    .lookup("RMBConvertBean/remote");  
            System.out.println(rmb.DollarToRMB(1));
            System.out.println(rmb.RMBToEruo(1));
        } catch (NamingException e) {  
            System.out.println(e.getMessage());  
        }  
  
        /** 
         * 通过src下的jndi.properties进行初始化 
         */  
        try {  
            InitialContext ctx = new InitialContext();  
            RMBConvert rmb = (RMBConvert) ctx  
                    .lookup("RMBConvertBean/remote");  
            System.out.println(rmb.DollarToRMB(1));
            System.out.println(rmb.RMBToEruo(1));
        } catch (NamingException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
}
