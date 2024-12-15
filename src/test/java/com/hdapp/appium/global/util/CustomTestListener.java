package com.hdapp.appium.global.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        // 테스트 시작 시 동작
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // 테스트 성공 시 동작
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // 테스트 실패 시 동작
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // 테스트 스킵 시 동작
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // 테스트 실패했지만 성공한 비율 내에 있을 경우 동작
    }

    @Override
    public void onStart(ITestContext context) {
        // 테스트 시작 시 동작
    }

    @Override
    public void onFinish(ITestContext context) {
        // 테스트 종료 시 동작
        /*
         * 파일을 기존 파일명에 덮어쓰지 않고 계속해서 쌓기 위해서 테스트가 종료되는 시점에
         * 파일명을 변경해서 결과 로그를 새로 써준다.
         * */
        // 여기서 HTML 파일 이름을 현재 시간 또는 고유한 값으로 바꿀 수 있음
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String newFileName = "HpointIdPwLoginTest-report_" + timestamp + ".html";

        // 기존 testng-results.html 파일
        File oldFile = new File("src/test/test-output/emailable-report.html");

        // 새로운 고유한 파일 경로
        File newFile = new File("src/test/test-output/" + newFileName);

        if (oldFile.exists()) {
            // renameTo()는 실패할 수 있기 때문에 결과를 확인하고 로그를 추가
            boolean renamed = oldFile.renameTo(newFile);

            if (renamed) {
                System.out.println("파일이 성공적으로 이름이 변경되었습니다: " + newFileName);
            } else {
                System.out.println("파일 이름 변경에 실패했습니다.");
            }
        } else {
            System.out.println("기존 파일이 존재하지 않습니다.");
        }
    }
}
