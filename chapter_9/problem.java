class problem {
	public static void main(String[] args) {
		problem_1_solution("asdfqwerr");
	}

	// 1.1 중복이 없는가 : 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라. 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
	public static void problem_1_me(String sentence) {
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
}