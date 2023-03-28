# GIT 컨벤션

### 1. branch

```bash
|-- main

		|-- front
		    |-- FE/feature1
		    |-- FE/feature2

		|-- back
		    |-- BE/feature1
		    |-- BE/feature2
```

같은 기능을 여러 명이 만질 때는 기능 뒤에 /이름 추가

ex)

```bash
FE/feature1/junbong
```

### 2. commit message

```bash
# ✨ : 새로운 기능 추가
# 🐛 : 버그 수정
# 📚 : 문서 수정
# 🚨 : 테스트 코드 추가
# 🔨 : 코드 리팩토링
# 📝 : 코드 의미에 영향을 주지 않는 변경사항
# 🔧 : 기타 변경사항, 프로덕션 코드 변경사항 없음
```