package com.codingsonic.androidpractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codingsonic.androidpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        // ---------------------------------------------------------------

        // 섹션 1. 안드로이드 스튜디오 설치 및 설정

        // 1. 프로젝트 생성 시 액티비티
        // 뷰 방식과 컴포즈 방식의 차이
        // Empty View Activity와 Empty Activity

        // 2. 프로젝트 생성 시 패키지명

        // 3. Logcat (로그캣)
        // 런타임 시에 로그를 확인할 수 있음

        // 4. SDK
        // settings - Language & Framework 확인
        // 안드로이드 에뮬레이터를 실행시키려면 SDK Tools 확인요
        // 인텔이면 에뮬레이터 엑셀레이터, AMD면 하이퍼바이저 드라이버 설치돼있으면 됩니다

        // 5. 다크모드, 폰트크기, 자동 import 등 원하는대로 설정하십쇼

        // ---------------------------------------------------------------

        // 섹션 2. AVD 구성 및 실행, 폰 테스트

        // 가상머신(애뮬레이터)에서 테스트하기
        // 1. Android Virtual Device아니면 흔히 Emulator라고 부름

        // 2. 네비게이션 모드 : 제스쳐 네비게이션, 3-button 네비게이션
        // 편한걸로 설정하십쇼

        // 3. Run 버튼 누르면 일어나는 일?
        // 빌드 진행 후 디바이스에 설치함

        // 실제 스마트폰에서 테스트하기
        // 1. 설정에서 USB 디버깅 허용해주면 됩니다
        // 삼성 안드로이드 USB 드라이버 다운받기
        // 설정 - 휴대전화 정보 - 소프트웨어 정보 - 빌드번호 7번 터치해서 개발자모드 활성화하면
        // 이제부터 개발자 옵션이 보이기 시작하구요
        // 중간에 내려보면 USB 디버깅 허용해주시면 됨

        // ---------------------------------------------------------------

        // 섹션 3. 앱 출시하기 관련 용어 정리 등

        // 1. 배포 파일을 추출해야 합니다.
        // APK 아니면 AAB 파일
        // APK와 AAB 차이는 뭘까요?
        // APK : Android Application Package는 옛날 방식이구요 요즘 사람들은
        // ABB : Android App Bundle은 2018년 구글에서 발표한 새로운 방식을 사용합니다
        // 이 방식이 주는 이점은 개발자가 파일을 100개 준비하더라도 사용자가 100개를 다운받도록 하지 않구요
        // 유저가 필요한 파일만 추출해서 다운로드 받게 한다는 것임
        //
        // 2. 앱을 배포하기 위해선 키로 서명되어있어야 함
        // 서명 방법
        // 이것도 예전이랑 바뀌었음
        // 옛날 방식은 배포할때 쓰는 키도 개발자가 만들고
        // 유저가 다운로드 받을때 쓰는 키도 개발자가 만듦
        // 그런데 키가 분실되거나 유출돼버리면 어떡할까요?
        // 업데이트가 불가능해짐. 새로 키를 만들어서 배포하면 이건 예전 앱과 다른 새로운 앱이 됨요.
        // 그래서 서명 방식이 바뀌었는데
        // 개발자가 쓰는 업로드 키, 구글에서 유저가 다운로드 할때 알아서 발급해주는 키를 따로 분리해서
        // 구글이 알아서 유저가 사용할 키를 발급해주는 방식이 됨요
        // 이 방식으로 바꿔서 관리가 편해졌음
        // 개념상으로만 알아두시면 됩니다.

        // 3. 앱 출시 준비물 ( 구글 플레이 스토어에서 정해놓은 방식임 )
        // AAB 파일
        // 앱 아이콘 이미지 : 스마트폰에서 보이는 이미지 아니구요. 플레이 스토어에서 보이는 앱 아이콘 이미지임
        // 그래픽 이미지 : 프로모션할때 보여지는 이미지구요. 어그로를 끌어야하니까 화려하게 ㄱㄱ
        // 스마트폰 스크린샷
        // 7인치, 10인치 태블릿 스크린샷 : 호환되는 기기 스크린샷 당연히 올리셔야합니다.

        // 4. AAB 배포 파일 만들기
        //
        // 1) 패키지명 변경
        // 패키지명이 고유해야 플레이스토어에 올릴 수 있다고 했습니다.
        // build.gradle.kts 파일에서 android - defaultConfig에서 패키지명 바꾸시면 됨요
        // com.example.xx 이런식이면 플레이스토어에서 거부하구요
        // 2) AAB 배포 파일 만들기
        // 3) 키 저장소와 업로드 키 만들기
        // 4) 앱 서명하기
        // 5) 릴리스용으로 빌드하기
        // 6) 빌드된 파일 확인 ( release 폴더에 있음 )

        // 5. 앱 출시하기
        // 앱을 올리려면 먼저 구글 플레이스토어에 개발자 계정을 생성해야합니다
        // 25달러를 내야 개발자 계정을 등록할 수 있구요
        // 비싸니까 25 달러 이상은 벌 수 있게 제대로 만들어 봅시다
        // 가이드 라인에 따라서 하라는 거 다하고 업로드 하시면 됩니다

    }
}