import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mydemo.common.configuration.CDPlayerConfig;
import mydemo.study.CD;
import mydemo.study.CDPlayer;

/**
 * Created by linrufeng on 2017/1/19.
 * 验证Java装配
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@ActiveProfiles("qa")
public class CDPlayerTest {

  @Autowired
  private CDPlayer cdPlayer;

  @Test
  public void testCDPlayer() {
    cdPlayer.play();
  }
}
