package codingtest.lv1;

public class BubbleSort {
	public String solution(String s) {
		// 문자열 내림차순으로 배치하기-프로그래머스 1단계
		String answer = "";
		char[] array = s.toCharArray();
		char temp = ' '; // 데이터를 교환하기 위한 임시 저장소

		// 버블 정렬 사용
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			answer += array[i];
		}

		return answer;
	}
}