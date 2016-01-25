package woo;

import javax.swing.*;

import java.awt.*;



public class MySolution { // 메인 클래스

	public static void main(String[] args) { // 메인 메소드

		// TODO Auto-generated method stub

		MyFrame2 f = new MyFrame2();

	}

}

class MyFrame2 extends JFrame { // JFrame을 상속받은 MyFrame클래스

	/* 생성자에서 초기화후 프레임 생성(최상위 컨테이너) */

	public MyFrame2() { // 생성자

		setSize(600, 600); // 프레임 크기 설정

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Frame Test"); // 프레임 제목 설정

		/* 패널 객체 생성  */

		JPanel panel = new JPanel();
		
		JPanel panel2 = new JPanel();

		StatusPanel panelA = new StatusPanel("13:00","공부중", "15:00");
		StatusPanel panelB = new StatusPanel("15:00","청소중", "17:00");

		/* 패널 색상 변경 */

		panel.setBackground(Color.BLUE);

		panel2.setBackground(Color.RED);
		
		panelA.setBackground(Color.CYAN);
		panelB.setBackground(Color.RED);

		


		/* panel에 panelA,B추가 */

		panel.add(panelA);
		panel.add(panelB);

		/* 프레임에 panel을 추가 */

		add(panel);
//		add(panel2);

		setVisible(true);

	}

}