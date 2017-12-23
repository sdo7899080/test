package cn.itsparrow.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cn.itsparrow.springboot"})
public class Application {

	public static void main(String[] args) {
		//运行springboot应用
//		SpringApplication.run(Application.class, args);
		
		//创建SpringApplication对象
		SpringApplication springApplication = new SpringApplication(Application.class);
		//设置横幅模式
		springApplication.setBannerMode(Banner.Mode.OFF);
		//运行
		springApplication.run(args);
		
	}
}
