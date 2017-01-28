package mydemo.study;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by linrufeng on 2017/1/19.
 */
@Component
@Profile("dev")
public class CDProfile {

  public void play(){
    System.out.println("CDProfile");
  }
}
