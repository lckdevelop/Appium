package com.hdapp.appium.domain.login;

import com.hdapp.appium.global.common.OsDriverConnectorImpl;
import com.hdapp.appium.global.util.CommonFunction;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HpointIdPwLoginTest {
    private static IOSDriver driver;
    private static OsDriverConnectorImpl osDriverConnector;
    private CommonFunction commonFunction = new CommonFunction();
    /*
    * 테스팅 시뮬레이터 초기 세팅
    * @BeforeAll : 현재 클래스의 모든 테스트 메서드 실행 이전에 한 번만 실행
    * */
    @BeforeSuite
    public static void setUp() {
        //driver = OsDriverConnector.iosSetUp("iPhone 16", "18.0");
        //driver = OsDriverConnector.iosSetUp("iPhone 15", "17.0");

        try {
            if (osDriverConnector == null) {
                osDriverConnector = new OsDriverConnectorImpl();  // 객체 생성
            }

            driver = osDriverConnector.setUp("iPhone 13 mini", "16.0");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void initLoadAndGoHomeTest() {
        Actions actions = new Actions(driver);

//        commonFunction.getTerm(3000);
//
//
//
//        final PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Point tapPoint1 = new Point(198, 687);
//        Sequence tap1 = new Sequence(finger1, 1);
//        tap1.addAction(finger1.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(), tapPoint1.x, tapPoint1.y));
//        tap1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap1.addAction(new Pause(finger1, Duration.ofMillis(50)));
//        tap1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(tap1));

        // 운영계 선택
//        WebElement serverType = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"운영계\"`]"));
//
//        actions.click(serverType);
//        actions.perform();




        // 선택적 권한 동의
//        WebElement authConfirmBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"확인\"`]"));
//        actions.click(authConfirmBtn);
//        actions.perform();
//
//        // 	skip 버튼
//        WebElement skipBTn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
//        actions.click(skipBTn);
//        actions.perform();
//
//        // 	둘러보기 버튼
//        commonFunction.getTerm(1000);
//
//        WebElement takeLookBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton"));
//        actions.click(takeLookBtn);
//        actions.perform();


        commonFunction.getTerm(3000);

        // 	팝업 닫기 버튼
        WebElement popupCloseBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"닫기\"`]"));
        actions.click(popupCloseBtn);
        actions.perform();

        // 	배너 정지 버튼
        WebElement bannerStopBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == \"iconIndicatorStop12Black\"`]"));
        actions.click(bannerStopBtn);
        actions.perform();
    }

    @Test
    public void hpointloginTest() {
        Actions actions = new Actions(driver);

        while(true) {
            try {
                WebElement firstBanner = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"1\"`]"));

                break;
            } catch (NoSuchElementException e) {
                // 	배너 재생 버튼
                WebElement bannerPlayBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeImage"));
                actions.click(bannerPlayBtn);
                actions.perform();

                commonFunction.getTerm(10000);

                // 	배너 정지 버튼
                WebElement bannerStopBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeImage"));
                actions.click(bannerStopBtn);
                actions.perform();
            }
        }

        // 	본인인증 로그인(흰디) 버튼
        WebElement loginBannerBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]"));
        actions.click(loginBannerBtn);
        actions.perform();

        commonFunction.getTerm(1000);

        //hpoint 로그인 하기
        WebElement hpointLoginBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"H.Point 로그인\"`]"));
        actions.click(hpointLoginBtn);
        actions.perform();

        commonFunction.getTerm(1000);



        // 아이디 입력
        WebElement idBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton"));
        actions.click(idBtn);
        actions.perform();

        commonFunction.getTerm(2000);

        // 영문으로 변환
        WebElement changeLanguageBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"다음 키보드\"`]"));
        actions.click(changeLanguageBtn);
        actions.perform();

        // START : 아이디 키보드 입력
        WebElement idElement1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"l\"`]"));
        actions.click(idElement1);
        actions.perform();
        WebElement idElement2 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"e\"`]"));
        actions.click(idElement2);
        actions.perform();
        WebElement idElement3 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"e\"`]"));
        actions.click(idElement3);
        actions.perform();
        WebElement idElement4 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"c\"`]"));
        actions.click(idElement4);
        actions.perform();
        WebElement idElement5 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"h\"`]"));
        actions.click(idElement5);
        actions.perform();
        WebElement idElement6 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"a\"`]"));
        actions.click(idElement6);
        actions.perform();
        WebElement idElement7 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"e\"`]"));
        actions.click(idElement7);
        actions.perform();
        WebElement idElement8 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"k\"`]"));
        actions.click(idElement8);
        actions.perform();
        WebElement idElement9 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`name == \"y\"`]"));
        actions.click(idElement9);
        actions.perform();

        WebElement returnBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Return\"`]"));
        actions.click(returnBtn);
        actions.perform();
        // END : 아이디 키보드 입력

        // 한글 감지하기
//        commonFunction.getTerm(1000);
//        try {
//
//
//            String initCharacterInId = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"ㅣ\"`]")).getText();
//            System.out.println( "lcklck: " + initCharacterInId);
//
//            // 영문으로 변환
//            final PointerInput finger6 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//            Point tapPoint6 = new Point(45, 812);
//            Sequence tap6 = new Sequence(finger6, 1);
//            tap6.addAction(finger6.createPointerMove(Duration.ofMillis(0),
//                    PointerInput.Origin.viewport(), tapPoint6.x, tapPoint6.y));
//            tap6.addAction(finger6.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//            tap6.addAction(new Pause(finger6, Duration.ofMillis(50)));
//            tap6.addAction(finger6.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//            driver.perform(Arrays.asList(tap6));
//
//            final PointerInput finger7_2 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//            Point tapPoint7_2 = new Point(356, 644);
//            Sequence tap7_2 = new Sequence(finger7_2, 1);
//            tap7_2.addAction(finger7_2.createPointerMove(Duration.ofMillis(0),
//                    PointerInput.Origin.viewport(), tapPoint7_2.x, tapPoint7_2.y));
//            tap7_2.addAction(finger7_2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//            tap7_2.addAction(new Pause(finger7, Duration.ofMillis(50)));
//            tap7_2.addAction(finger7_2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//            driver.perform(Arrays.asList(tap7_2));
//        } catch(NoSuchElementException e) {
//            final PointerInput finger7_2 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//            Point tapPoint7_2 = new Point(356, 644);
//            Sequence tap7_2 = new Sequence(finger7_2, 1);
//            tap7_2.addAction(finger7_2.createPointerMove(Duration.ofMillis(0),
//                    PointerInput.Origin.viewport(), tapPoint7_2.x, tapPoint7_2.y));
//            tap7_2.addAction(finger7_2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//            tap7_2.addAction(new Pause(finger7, Duration.ofMillis(50)));
//            tap7_2.addAction(finger7_2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//            driver.perform(Arrays.asList(tap7_2));
//
//        }


        // 비밀번호 입력 활성화
        WebElement passwordBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton"));
        actions.click(passwordBtn);
        actions.perform();

        WebElement pwElement1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[33]"));
        pwElement1.sendKeys("");

        WebElement pwElement2 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[19]"));
        pwElement2.sendKeys("");

        WebElement pwElement3 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[14]"));
        pwElement3.sendKeys("");

        WebElement pwElement4 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[17]"));
        pwElement4.sendKeys("");

        WebElement pwElement5 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[23]"));
        pwElement5.sendKeys("");

        WebElement pwElement6 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[23]"));
        pwElement6.sendKeys("");

        WebElement pwElement7 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[29]"));
        pwElement7.sendKeys("");

        // 특수문자 전환 키패드
        WebElement specialCharacterBtn1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"특수문자 키보드 변경\"`]"));
        actions.click(specialCharacterBtn1);
        actions.perform();

        WebElement pwElement8 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
        pwElement8.sendKeys("");

        // 특수문자 전환 키패드
        WebElement specialCharacterBtn2 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"영문 키보드 변경\"`]"));
        actions.click(specialCharacterBtn2);
        actions.perform();

        WebElement pwElement9 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[1]"));
        pwElement9.sendKeys("");

        WebElement pwElement10 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
        pwElement10.sendKeys("");

        WebElement inputCompleteBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"입력완료\"`]"));
        actions.click(inputCompleteBtn);
        actions.perform();

        // 자동로그인 체크박스
//        WebElement autoLoginCheckBox = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == \"iconCheckboxH1Unselected\"`]"));
//        actions.click(autoLoginCheckBox);
//        actions.perform();

        // 로그인 버튼
        WebElement loginBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"로그인\"`]"));
        actions.click(loginBtn);
        actions.perform();
    }

    @Test
    public void loginCompleteTest() {
        Actions actions = new Actions(driver);

        commonFunction.getTerm(3000);

        // 	팝업 닫기 버튼
        WebElement popupCloseBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"닫기\"`]"));
        actions.click(popupCloseBtn);
        actions.perform();

//        WebElement marketingAlertConfirmBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"마케팅 알림 동의\"`]"));
//        actions.click(marketingAlertConfirmBtn);
//        actions.perform();
    }

    /*
    * 테스팅 시뮬레이터 종료
    * AfterAll : 현재 클래스의 모든 테스트 메소드 실행 이후에 한번만 실행
    * */
    @AfterSuite
    public static void tearDown() {
        driver.quit();
    }
}