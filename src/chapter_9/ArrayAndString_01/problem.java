package chapter_9.ArrayAndString_01;

class problem {
	public static void main(String[] args) {
		// result = problem_2("dew", "wde");
		// System.out.println(result);

		// 문제 2
		// System.out.println(problem_2_2("dew", "wde"));

		//문제 3
		problem_3("Mr John Smith", 13);
	}

	/*
	1.1 중복이 없는가
	 - 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라. 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
	*/
	public static void problem_1(String sentence) {
		for (int i = 0; i < sentence.length(); i++) {
			for (int j = 0; j < sentence.length(); j++) {
				if (i != j && sentence.charAt(i) == sentence.charAt(j)) {
					System.out.println(sentence.charAt(i) + "와" + sentence.charAt(j) +" : 중복!");
				}
			}
		}
	}

	// ASCII 문자열이라는 가정이 있을때
	// 시간복잡도 O(n) - n은 문자열 길이
	public static void problem_1_solution(String sentence) {
		if (sentence.length() > 128) {
			System.out.println("문자의 개수는 128개 이므로 128개가 넘어가면 무조건 중복이 발생할 수 밖에 없음.");
		}

		boolean[] char_set = new boolean[128];

		for (int i = 0; i < sentence.length(); i++) {
			if (char_set[sentence.charAt(i)]) {
				System.out.println("중복 : "+sentence.charAt(i));
			}
			char_set[sentence.charAt(i)] = true;
		}
	}

	/*
	1.2 순열 확인
	 - 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라
	*/

	// 정렬 후 같은지 비교. (정렬하는 비용 발생)
	public static boolean problem_2_1(String str_1, String str_2) {
		str_1 = problem_2_sort(str_1);
		str_2 = problem_2_sort(str_2);

		if (str_1.length() != str_1.length()) {
			return false;
		}

		return str_1.equals(str_2);
	}

	// 문자열에 포함된 문자의 개수가 같은지 비교
	// ASCII 가정
	public static boolean problem_2_2(String str_1, String str_2) {
		if (str_1.length() != str_1.length()) {
			return false;
		}

		int[] letters = new int[128];

		char[] s_array = str_1.toCharArray();
		for (char c : str_1.toCharArray()) {
			letters[c]++;
		}

		for (int i = 0; i < str_2.length(); i++) {
			int c = (int) str_2.charAt(i);

			letters[c]--;

			if (letters[c] < 0) {
				return false;
			}
		}

		return true;
	}

	public static String problem_2_sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);

		return new String(content);
	}

	/*
	1.3 URL화: 문자열에 들어 있는 모든 공백을 '%20'으로 바꿔 주는 메서드를 작성하라.
			   최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보 되어 있으며
			   문자열의 최종 길이가 함께 주어진다고 가정해도 된다.
			   (자바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열(character array)를 이용하길 바란다.)
	*/
	public static void problem_3(String content, int trueLength) {
		int spaceCount = 0;
		int index;
		int i = 0;

		char[] str = content.toCharArray();

		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;

		if (trueLength < str.length) {
			str[trueLength] = '\0';
		}

		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
		System.out.println(str);
	}
}