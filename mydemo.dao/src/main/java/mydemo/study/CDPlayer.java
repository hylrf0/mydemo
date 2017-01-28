package mydemo.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by linrufeng on 2017/1/19.
 */
@Component
@Profile("qa")
@Conditional(CDPlayerExistsCondition.class)
public class CDPlayer {

  @Autowired
  private CD cd;

  public void play(){
    cd.play();
  }
}
