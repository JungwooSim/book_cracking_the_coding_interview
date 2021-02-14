package chapter_9.Java_13;

import java.util.stream.Stream;

public class problem {
    public static void main(String[] srgs) {

    }
    /*
    6. 객체 리플레션
    - 자바의 객체 리플렉션(object reflection)을 설명하고, 이것이 유용한 이유를 나열하라.

    객체 리플레션은 자바 클래스와 객체애 대한 정보를 프로그램 내에서 동적으로 알아낼 수 있도록 하는 기능이다.
    1. 프로그램 실행 시간(runtime)에 클래스 내부의 메서드와 필드에 대한 정보를 얻을 수 있다.
    2. 클래스의 객체를 생성할 수 있다.
    3. 객체 필드의 접근 제어자(access modifier)에 관계없이, 그 필드에 대한 참조를 얻어내어 값을 가져오거나(getter) 설정(setter) 할수 있다.

    자료
    - https://medium.com/msolo021015/자바-reflection이란-ee71caf7eec5

    * 복습 필요...
     */

    public void problem_06 () {
        // 인자(parameters)
        Object[] doubleArgs = new Object[] {4.2, 3.9};

        // 클래스 가져오기
//        Class rectangleDefinition = Class.forName("Myproj.Rectangle");
    }

    /*
    7. 람다표현식
    - Country라는 클래스에 getContinent()와 getPopulation()이라는 메서드가 있다.
    대륙의 이름과 국가의 리스트가 주어졌을 때 주어진 대륙의 총 인구수를 계산하는 메서드
    getPopulation(List<Country> countries, String continent)를 작성하라.
     */
//    public void plobelm_07 (List<Country> countries, String continent) {
//
//        // 국가 필터
//        Stream<Country> nortAmerica = countries.stream().filter(
//            country -> {
//                return country.getContinent().equals(continent);
//            }
//        );
//
//        // 인구수 리스트 변환
//        Stream<Integer> populations = northAmerica.map(
//                c -> c.getPopulation()
//        );
//
//        // 리스트 합계
//        int population = populations.reduce(0, (a, b) -> a + b);
//
//        System.out.println("합계 : "+population);
//    }

}
