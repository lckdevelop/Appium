import common.util.CommonFunction;
import common.util.OsDriverConnector;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;

public class HpointIdPwLoginTest {
    private static IOSDriver driver;
    private CommonFunction commonFunction = new CommonFunction();

    /*
    * 테스팅 시뮬레이터 초기 세팅
    * @BeforeAll : 현재 클래스의 모든 테스트 메서드 실행 이전에 한 번만 실행
    *
    * */
    @BeforeAll
    public static void setUp() {
        driver = OsDriverConnector.iosSetUp("iPhone 16", "18.0");
        //driver = OsDriverConnector.iosSetUp("iPhone 15", "17.0.1");
    }

    @Test
    public void initLoadAndGoHomeTest() {
        commonFunction.getTerm(3000);

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

        commonFunction.getTerm(5000);

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
    }

    @Test
    public void hpointloginTest() {
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

        commonFunction.getTerm(1000);

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

        commonFunction.getTerm(1000);

        // 아이디 입력
        final PointerInput finger5 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint5 = new Point(156, 311);
        Sequence tap5 = new Sequence(finger5, 1);
        tap5.addAction(finger5.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint5.x, tapPoint5.y));
        tap5.addAction(finger5.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap5.addAction(new Pause(finger5, Duration.ofMillis(50)));
        tap5.addAction(finger5.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap5));

        commonFunction.getTerm(1000);


//        WebElement el1 = driver.findElement(AppiumBy.accessibilityId("아이디 입력"));
//        el1.sendKeys("123");

        // 영문으로 변환
        final PointerInput finger6 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint6 = new Point(45, 812);
        Sequence tap6 = new Sequence(finger6, 1);
        tap6.addAction(finger6.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint6.x, tapPoint6.y));
        tap6.addAction(finger6.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap6.addAction(new Pause(finger6, Duration.ofMillis(50)));
        tap6.addAction(finger6.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap6));

        // START : 아이디 키보드 입력
        final PointerInput finger7 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint7 = new Point(356, 644);
        Sequence tap7 = new Sequence(finger7, 1);
        tap7.addAction(finger7.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint7.x, tapPoint7.y));
        tap7.addAction(finger7.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap7.addAction(new Pause(finger7, Duration.ofMillis(50)));
        tap7.addAction(finger7.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap7));


        final PointerInput finger8 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint8 = new Point(104, 593);
        Sequence tap8 = new Sequence(finger8, 1);
        tap8.addAction(finger8.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint8.x, tapPoint8.y));
        tap8.addAction(finger8.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap8.addAction(new Pause(finger8, Duration.ofMillis(50)));
        tap8.addAction(finger8.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap8));


        final PointerInput finger9 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint9 = new Point(104, 593);
        Sequence tap9 = new Sequence(finger9, 1);
        tap9.addAction(finger9.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint9.x, tapPoint9.y));
        tap9.addAction(finger9.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap9.addAction(new Pause(finger9, Duration.ofMillis(50)));
        tap9.addAction(finger9.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap9));


        final PointerInput finger10 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint10 = new Point(158, 704);
        Sequence tap10 = new Sequence(finger10, 1);
        tap10.addAction(finger10.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint10.x, tapPoint10.y));
        tap10.addAction(finger10.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap10.addAction(new Pause(finger10, Duration.ofMillis(50)));
        tap10.addAction(finger10.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap10));


        final PointerInput finger11 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint = new Point(238, 647);
        Sequence tap11 = new Sequence(finger11, 1);
        tap11.addAction(finger11.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap11.addAction(finger11.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap11.addAction(new Pause(finger11, Duration.ofMillis(50)));
        tap11.addAction(finger11.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap11));


        final PointerInput finger12 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint12 = new Point(40, 646);
        Sequence tap12 = new Sequence(finger12, 1);
        tap12.addAction(finger12.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint12.x, tapPoint12.y));
        tap12.addAction(finger12.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap12.addAction(new Pause(finger12, Duration.ofMillis(50)));
        tap12.addAction(finger12.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap12));


        final PointerInput finger13 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint13 = new Point(104, 593);
        Sequence tap13 = new Sequence(finger13, 1);
        tap13.addAction(finger13.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint13.x, tapPoint13.y));
        tap13.addAction(finger13.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap13.addAction(new Pause(finger13, Duration.ofMillis(50)));
        tap13.addAction(finger13.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap13));


        final PointerInput finger14 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint14 = new Point(314, 648);
        Sequence tap14 = new Sequence(finger14, 1);
        tap14.addAction(finger14.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint14.x, tapPoint14.y));
        tap14.addAction(finger14.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap14.addAction(new Pause(finger14, Duration.ofMillis(50)));
        tap14.addAction(finger14.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap14));


        final PointerInput finger15 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint15 = new Point(216, 594);
        Sequence tap15 = new Sequence(finger15, 1);
        tap15.addAction(finger15.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint15.x, tapPoint15.y));
        tap15.addAction(finger15.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap15.addAction(new Pause(finger15, Duration.ofMillis(50)));
        tap15.addAction(finger15.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap15));

        // 키보드 리턴 버튼
        final PointerInput finger16 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint16 = new Point(352, 755);
        Sequence tap16 = new Sequence(finger16, 1);
        tap16.addAction(finger16.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint16.x, tapPoint16.y));
        tap16.addAction(finger16.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap16.addAction(new Pause(finger16, Duration.ofMillis(50)));
        tap16.addAction(finger16.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap16));

        // END : 아이디 키보드 입력

        // 비밀번호 입력 활성화
        final PointerInput finger17 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint17 = new Point(188, 376);
        Sequence tap17 = new Sequence(finger17, 1);
        tap17.addAction(finger17.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint17.x, tapPoint17.y));
        tap17.addAction(finger17.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap17.addAction(new Pause(finger17, Duration.ofMillis(50)));
        tap17.addAction(finger17.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap17));

        // START: 비밀번호 입력
        final PointerInput finger18 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint18 = new Point(127, 729);
        Sequence tap18 = new Sequence(finger18, 1);
        tap18.addAction(finger18.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint18.x, tapPoint18.y));
        tap18.addAction(finger18.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap18.addAction(new Pause(finger18, Duration.ofMillis(50)));
        tap18.addAction(finger18.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap18));


        final PointerInput finger19 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint19 = new Point(347, 608);
        Sequence tap19 = new Sequence(finger19, 1);
        tap19.addAction(finger19.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint19.x, tapPoint19.y));
        tap19.addAction(finger19.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap19.addAction(new Pause(finger19, Duration.ofMillis(50)));
        tap19.addAction(finger19.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap19));


        final PointerInput finger20 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint20 = new Point(132, 619);
        Sequence tap20 = new Sequence(finger20, 1);
        tap20.addAction(finger20.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint20.x, tapPoint20.y));
        tap20.addAction(finger20.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap20.addAction(new Pause(finger20, Duration.ofMillis(50)));
        tap20.addAction(finger20.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap20));


        final PointerInput finger21 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint21 = new Point(274, 611);
        Sequence tap21 = new Sequence(finger21, 1);
        tap21.addAction(finger21.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint21.x, tapPoint21.y));
        tap21.addAction(finger21.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap21.addAction(new Pause(finger21, Duration.ofMillis(50)));
        tap21.addAction(finger21.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap21));


        final PointerInput finger22 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint22 = new Point(94, 670);
        Sequence tap22 = new Sequence(finger22, 1);
        tap22.addAction(finger22.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint22.x, tapPoint22.y));
        tap22.addAction(finger22.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap22.addAction(new Pause(finger22, Duration.ofMillis(50)));
        tap22.addAction(finger22.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap22));


        final PointerInput finger23 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint23 = new Point(93, 671);
        Sequence tap23 = new Sequence(finger23, 1);
        tap23.addAction(finger23.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint23.x, tapPoint23.y));
        tap23.addAction(finger23.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap23.addAction(new Pause(finger23, Duration.ofMillis(50)));
        tap23.addAction(finger23.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap23));


        final PointerInput finger24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint24 = new Point(377, 671);
        Sequence tap24 = new Sequence(finger24, 1);
        tap24.addAction(finger24.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint24.x, tapPoint24.y));
        tap24.addAction(finger24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap24.addAction(new Pause(finger24, Duration.ofMillis(50)));
        tap24.addAction(finger24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap24));


        final PointerInput finger25 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint25 = new Point(107, 787);
        Sequence tap25 = new Sequence(finger25, 1);
        tap25.addAction(finger25.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint25.x, tapPoint25.y));
        tap25.addAction(finger25.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap25.addAction(new Pause(finger25, Duration.ofMillis(50)));
        tap25.addAction(finger25.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap25));


        final PointerInput finger26 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint26 = new Point(55, 558);
        Sequence tap26 = new Sequence(finger26, 1);
        tap26.addAction(finger26.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint26.x, tapPoint26.y));
        tap26.addAction(finger26.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap26.addAction(new Pause(finger26, Duration.ofMillis(50)));
        tap26.addAction(finger26.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap26));


        final PointerInput finger27 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint27 = new Point(98, 786);
        Sequence tap27 = new Sequence(finger27, 1);
        tap27.addAction(finger27.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint27.x, tapPoint27.y));
        tap27.addAction(finger27.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap27.addAction(new Pause(finger27, Duration.ofMillis(50)));
        tap27.addAction(finger27.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap27));
        // END: 비밀번호 입력


//
//        final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        var tapPoint = new Point(18, 548);
//        var tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap));
//
//
//        final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        var tapPoint = new Point(55, 550);
//        var tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap));
//
//
//        final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        var tapPoint = new Point(356, 791);
//        var tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap));
//
//        // hpoint 로그인 버튼 클릭
//        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        var tapPoint = new Point(192, 493);
//        var tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap));
//
//        try {
//            Thread.sleep(5000);
//            System.out.println("마케팅 알림 동의 노출");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // 마케팅 알림 동의 클릭
//        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        var tapPoint = new Point(279, 769);
//        var tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap));






        //////////////////////////////////////////////////////////
//        WebElement el1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"CenterPageView\"`]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView"));
//        el1.sendKeys("123");

//        WebElement el1 = driver.findElement(AppiumBy.accessibilityId("아이디 입력"));
//        el1.sendKeys("123");

        // 아이디입력 버튼 클릭
//        final PointerInput finger6 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Point tapPoint6 = new Point(112, 310);
//        Sequence tap6 = new Sequence(finger6, 1);
//        tap6.addAction(finger6.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint6.x, tapPoint6.y));
//        tap6.addAction(finger6.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap6.addAction(new Pause(finger6, Duration.ofMillis(50)));
//        tap6.addAction(finger6.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap6));


        // 비밀번호 버튼 클릭
//        final PointerInput finger7 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Point tapPoint7 = new Point(143, 373);
//        Sequence tap7 = new Sequence(finger7, 1);
//        tap7.addAction(finger7.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint7.x, tapPoint7.y));
//        tap7.addAction(finger7.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap7.addAction(new Pause(finger7, Duration.ofMillis(50)));
//        tap7.addAction(finger7.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap7));
//
//        WebElement el2 = driver.findElement(AppiumBy.accessibilityId("비밀번호"));
//        el2.sendKeys("leechaeky");

        // 로그인 버튼 클릭
//        final PointerInput finger8 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Point tapPoint8 = new Point(221, 487);
//        Sequence tap8 = new Sequence(finger8, 1);
//        tap8.addAction(finger8.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint8.x, tapPoint8.y));
//        tap8.addAction(finger8.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap8.addAction(new Pause(finger8, Duration.ofMillis(50)));
//        tap8.addAction(finger8.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap8));

    }

    /*
    * 테스팅 시뮬레이터 종료
    * 현재 클래스의 모든 테스트 메소드 실행 이후에 한번만 실행
    * */
//    @AfterAll
//    public static void tearDown() {
//        driver.quit();
//    }
}
