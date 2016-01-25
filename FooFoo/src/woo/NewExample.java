package woo;

import javax.swing.*;

import java.awt.*;



public class NewExample { // 메인 클래스

	public static void main(String[] args) { // 메인 메소드

		// TODO Auto-generated method stub

		MyFrame f = new MyFrame();

	}

}

class MyFrame extends JFrame { // JFrame을 상속받은 MyFrame클래스

	/* 생성자에서 초기화후 프레임 생성(최상위 컨테이너) */

	public MyFrame() { // 생성자

		setSize(600, 150); // 프레임 크기 설정

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Frame Test"); // 프레임 제목 설정

		/* 패널 객체 생성  */

		JPanel panel = new JPanel();

		JPanel panelA = new JPanel();

		JPanel panelB = new JPanel();

		/* 패널 색상 변경 */

		panel.setBackground(Color.BLUE);

		panelA.setBackground(Color.CYAN);

		panelB.setBackground(Color.GREEN);

		/* 라벨 객체 생성, panelA에 label추가 */

		JLabel label = new JLabel ("자바 피자에 오신  것을 환영 합니다. 피자의 종류를 선택하시오.");

		panelA.add(label);

		/* 버튼 객체 생성 */

		JButton button1 = new JButton("콤보피자");

		JButton button2 = new JButton("포테이토피자");

		JButton button3 = new JButton("불고기피자");

		/* panelB에 button1,2,3추가 */

		panelB.add(button1);

		panelB.add(button2);

		panelB.add(button3);

		/* panel에 panelA,B추가 */

		panel.add(panelA);

		panel.add(panelB);

		/* 프레임에 panel을 추가 */

		add(panel);

		setVisible(true);

	}

}