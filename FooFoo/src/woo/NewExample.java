package woo;

import javax.swing.*;

import java.awt.*;



public class NewExample { // ���� Ŭ����

	public static void main(String[] args) { // ���� �޼ҵ�

		// TODO Auto-generated method stub

		MyFrame f = new MyFrame();

	}

}

class MyFrame extends JFrame { // JFrame�� ��ӹ��� MyFrameŬ����

	/* �����ڿ��� �ʱ�ȭ�� ������ ����(�ֻ��� �����̳�) */

	public MyFrame() { // ������

		setSize(600, 150); // ������ ũ�� ����

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Frame Test"); // ������ ���� ����

		/* �г� ��ü ����  */

		JPanel panel = new JPanel();

		JPanel panelA = new JPanel();

		JPanel panelB = new JPanel();

		/* �г� ���� ���� */

		panel.setBackground(Color.BLUE);

		panelA.setBackground(Color.CYAN);

		panelB.setBackground(Color.GREEN);

		/* �� ��ü ����, panelA�� label�߰� */

		JLabel label = new JLabel ("�ڹ� ���ڿ� ����  ���� ȯ�� �մϴ�. ������ ������ �����Ͻÿ�.");

		panelA.add(label);

		/* ��ư ��ü ���� */

		JButton button1 = new JButton("�޺�����");

		JButton button2 = new JButton("������������");

		JButton button3 = new JButton("�Ұ������");

		/* panelB�� button1,2,3�߰� */

		panelB.add(button1);

		panelB.add(button2);

		panelB.add(button3);

		/* panel�� panelA,B�߰� */

		panel.add(panelA);

		panel.add(panelB);

		/* �����ӿ� panel�� �߰� */

		add(panel);

		setVisible(true);

	}

}