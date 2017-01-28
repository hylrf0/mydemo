package mydemo.common.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import mydemo.common.aspect.AspectJAdvice;
import mydemo.study.CD;

/**
 * Created by linrufeng on 2017/1/19.
 */
@Configuration
@ComponentScan(basePackageClasses = {CD.class, AspectJAdvice.class})
@EnableAspectJAutoProxy
public class CDPlayerConfig {

}
