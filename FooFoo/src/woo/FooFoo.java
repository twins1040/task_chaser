package woo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FooFoo {
  public static void main(String args[]) {

    JFrame oFrame = new JFrame("�̰��� â �����Դϴ�."); // GUI�� �⺻ â �����
    JLabel oLabel = new JLabel("��â ������ �� ������ �־���.", JLabel.CENTER ); // ���� �� �� �ִ� �� �����

    oFrame.add(oLabel); // ���� �⺻ â�� �ٿ� �ֱ�
    oFrame.setSize(300, 400); // ũ�⸦ ������ ���� ������, â�� �ʹ� �۰� ����
    oFrame.setVisible(true); // â�� ���̰� �ϱ�. �⺻�����δ� ������ ����
    oFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ������ ���α׷� ����
  }
}