# ArrayBoard

- while, Scanner 이용 값 입력
- 객체 지향 함수 분리
- 임시 저장(Runtime Data)
- Arrays.sort 이용 최고값 리턴


```java

public void board(){

	scanner = new Scanner(System.in); //스캐너로 문자열 입력받는다
	sum = 0;
	avg = 0;

    while(run){
    	System.out.println("-------------------------------------------");
    	System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
    	System.out.println("-------------------------------------------");

    	select = scanner.nextLine();

    	//원하는 학생수 넣어주기
    	if(select.equals("1")){
    		inputStudentNo();
    	//성적 입력
    	} else if(select.equals("2")){
    		inputGrade();
    	//성적 리스트 확인
    	} else if(select.equals("3")){
    		checkGrade();
    	//성적 분석
    	} else if(select.equals("4")){
    		analyze();
    	//프로그램 종료
    	} else if(select.equals("5")){
    		exit();
    	}
    }
```
>학생 수 입력

```java
private void inputStudentNo() {
	System.out.println("선택>"+select);
	System.out.print("학생수 입력>");
	String num = scanner.nextLine();
	//입력받은 학생수를 int값으로 변환, int[]배열의 길이로 지정해 준다
	scores = new int[Integer.parseInt(num)];
	System.out.println("학생수 확인>"+num); //입력받은 학생 수 확인
	System.out.println();
}
```

>// 성적 입력

```java
private void inputGrade() {
	System.out.println("선택>"+select);
	//배열에 들어간 학생 수만큼 학생을 출력하고, 각각 점수를 부여한다. 점수는 scores 배열에 저장된다.
	int length = scores.length; //성적 배열로부터 학생 수를 알 수 있다.
	for(int i=0; i<length; i++){
		System.out.print("student["+(i+1)+"] : ");
		String score1 = scanner.nextLine();
		scores[i] = Integer.parseInt(score1); //입력받은 점수를 배열에 저장
	}
	System.out.println();
}
```

>성적 확인

```java
private void checkGrade() {
	System.out.println("선택>"+select);
	int length = scores.length;
	for(int i=0; i<length; i++){
		System.out.println("student["+(i+1)+"] : "+scores[i]);
	}
	System.out.println();
}
```

>분석

```java
private void analyze() {
	System.out.println("선택>"+select);
	Arrays.sort(scores); //sort 메소드를 통해 점수를 정렬하고, 마지막 항을 출력한다.
	int length = scores.length; //마지막 항-전체 길이에서 -1 해 준 값을 넣어준 값
	System.out.println("최고 점수 : "+scores[length-1]);
	//향상된 for문을통해 scores배열에 들어간 모든 값을 더해준다.
	for(int a : scores){
		sum = sum + a;
	}
	avg = (double)sum/length;  //평균값
	System.out.println("평균 점수 : "+avg);
	System.out.println();
}
```

>종료

```java
private void exit() {
	System.out.println("선택>"+select);
	System.out.println("프로그램을 종료합니다");
	run = false;
}
```
