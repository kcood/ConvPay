# 개요

- 편의점 결제 시스템 연습
- 수업을 들을 당시, 첫 스프링 실습이라 제대로 이해를 못하고 넘어갔음
- 다시 제대로 복습해서 이해해보기!
- 깃헙에 커밋을 하지도 않았기에, 이번엔 나중에 배운대로 커밋해보기

![스크린샷 2022-08-30 오후 5 10 54](https://user-images.githubusercontent.com/100116834/187385177-86d1c0ce-1474-48a2-902a-8fcd3fec767c.png)

Use: Java -> Spring

Goal: 기능별 커밋 & 적절한 커밋 메시지

----
![스크린샷 2022-08-30 오후 5 14 28](https://user-images.githubusercontent.com/100116834/187385992-0ae35112-9e5a-45ca-b2d6-39379938a4d4.png)

feat:001~003

---
![스크린샷 2022-08-30 오후 8 26 10](https://user-images.githubusercontent.com/100116834/187425106-08d739d7-d437-4aa9-9385-03d652c45959.png)

![스크린샷 2022-08-30 오후 8 27 08](https://user-images.githubusercontent.com/100116834/187425116-bd77336b-f06c-44c4-99da-68daaac9506e.png)

feat:004~005

---

![스크린샷 2022-08-31 오전 11 00 17](https://user-images.githubusercontent.com/100116834/187576192-f26abb01-4ccc-4449-973a-0770be1de0b8.png)

![스크린샷 2022-08-31 오전 11 03 12](https://user-images.githubusercontent.com/100116834/187576473-20bae3b7-4127-454a-814b-c629b50dc3fa.png)

feat:006

---
![스크린샷 2022-08-31 오전 11 28 39](https://user-images.githubusercontent.com/100116834/187579350-2c3758f3-90e6-442c-a979-91c1c17dee13.png)

- 편결이가 구현체(money,card adaptor)를 다 들고있음
- SOLID 지켰다기엔 뭔가 부족함

![스크린샷 2022-08-31 오전 11 30 14](https://user-images.githubusercontent.com/100116834/187579538-276428fa-4b13-4b81-ba40-58d8bd41c0f6.png)

![스크린샷 2022-08-31 오전 11 30 58](https://user-images.githubusercontent.com/100116834/187579600-682392bf-1564-488f-a472-8d85b05bc7be.png)

- Config 클래스 만들어서 편결이가 어떤 구현체를 쓰는지 여기서 구성해주기
- 편결이는 paymentInterface 통해서 결제만 해주면 됨

feat:007

---
![스크린샷 2022-08-31 오후 12 46 29](https://user-images.githubusercontent.com/100116834/187588284-199bd926-8a41-471e-8d29-7512642b183c.png)


