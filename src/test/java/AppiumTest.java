import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

public class AppiumTest {

    private IOSDriver driver;

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 초기 세팅
    @Before
    public void setUp() {
        BaseOptions options = new BaseOptions()
                .amend("platformName", "ios")
                .amend("appium:automationName", "XCUITest")
                .amend("appium:deviceName", "iPhone 16")
                .amend("appium:platformVersion", "18.0")
                .amend("appium:app", "com.ehyundai.mcard")
                .amend("appium:includeSafariInWebviews", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        driver = new IOSDriver(this.getUrl(), options); // ios driver 실행(앱 실행)
    }



    @Test
    public void sampleTest() {
        try {
            // 5초(5000 밀리초) 동안 대기
            Thread.sleep(3000);
            System.out.println("3초가 지난 후 운영계 선택");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 운영계 선택
        final PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint1 = new Point(198, 687);
        Sequence tap1 = new Sequence(finger1, 1);
        tap1.addAction(finger1.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint1.x, tapPoint1.y));
        tap1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap1.addAction(new Pause(finger1, Duration.ofMillis(50)));
        tap1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap1));

        try {
            // 5초(5000 밀리초) 동안 대기
            Thread.sleep(5000);
            System.out.println("팝업 노출시 팝업 닫기 선택");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 팝업 닫기
        final PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint2 = new Point(322, 776);
        Sequence tap2 = new Sequence(finger2, 1);
        tap2.addAction(finger2.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint2.x, tapPoint2.y));
        tap2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap2.addAction(new Pause(finger2, Duration.ofMillis(50)));
        tap2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap2));

        // 본인인증 로그인 창
        final PointerInput finger3 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint3 = new Point(199, 221);
        Sequence tap3 = new Sequence(finger3, 1);
        tap3.addAction(finger3.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint3.x, tapPoint3.y));
        tap3.addAction(finger3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap3.addAction(new Pause(finger3, Duration.ofMillis(50)));
        tap3.addAction(finger3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap3));

        //hpoint 로그인 하기
        final PointerInput finger4 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint4 = new Point(115, 367);
        Sequence tap4 = new Sequence(finger4, 1);
        tap4.addAction(finger4.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint4.x, tapPoint4.y));
        tap4.addAction(finger4.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap4.addAction(new Pause(finger4, Duration.ofMillis(50)));
        tap4.addAction(finger4.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap4));

        // 아이디 입력
        final PointerInput finger5 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint5 = new Point(223, 310);
        Sequence tap5 = new Sequence(finger5, 1);
        tap5.addAction(finger5.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint5.x, tapPoint5.y));
        tap5.addAction(finger5.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap5.addAction(new Pause(finger5, Duration.ofMillis(50)));
        tap5.addAction(finger5.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap5));



    }

    // 앱 종료
    @After
    public void tearDown() {
        driver.quit();
    }
}
