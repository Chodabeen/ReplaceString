# ReplaceString

# H08 -  문자열 바꾸기
사용자에게 문자열과 찾을 문자열, 바꿀 문자열을 입력 받아서 원본 문자열에서 찾을 문자열을 찾을 후 바꿀 문자열로 변경하도록 한다. 이때 몇 번 변경되었는지 출력하도록 한다. 프로그램은 입력받는 문자열에 x가 들어오면 종료되도록 한다.

변수는 다음과 같이 사용하라.

String input; // 입력받는 문자열

String findStr; // 찾을 문자열

String replaceStr; // 바꾸고자 하는 문자열

int i; // 반복문에 사용되는 변수

실행예시
```
===============================
=> Enter a sentence ('x' for exit) > It is more embarrassing not to trust a frind than to be deceived by a frind.
=> Enter a sentence to find > frind
=> Enter a sentence to replace > friend
=> The replacement occurred 2 times
=> It is more embarrassing not to trust a friend than to be deceived by a friend.
===============================
=> Enter a sentence ('x' for exit) > abc abc abc wef wef wef
=> Enter a sentence to find > abc
=> Enter a sentence to replace > xyz
=> The replacement occurred 3 times
=> xyz xyz xyz wef wef wef
===============================
=> Enter a sentence ('x' for exit) > x
Exit program
```