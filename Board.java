package com.nadan.java.arrayboard;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
	
	//���� ���� ���α׷�
	public void board(){
		
		Scanner scanner = new Scanner(System.in); //��ĳ�ʷ� ���ڿ� �Է¹޴´�
		boolean run = true; 
		int[] scores = new int[0];  //�л� ������ ������ �迭
		int sum = 0;  //��ü �л� ���� �м��� ���� �� ��
		double avg = 0;  //��հ�
		
		while(run){
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			
			String select = scanner.nextLine();
			
			//���ϴ� �л��� �־��ֱ�
			if(select.equals("1")){
				System.out.println("����>"+select);
				System.out.print("�л��� �Է�>");
				String num = scanner.nextLine();
				//�Է¹��� �л����� int������ ��ȯ, int[]�迭�� ���̷� ������ �ش�
				scores = new int[Integer.parseInt(num)];
				System.out.println("�л��� Ȯ��>"+num); //�Է¹��� �л� �� Ȯ��
				System.out.println();
			//���� �Է�
			} else if(select.equals("2")){
				System.out.println("����>"+select);
				//�迭�� �� �л� ����ŭ �л��� ����ϰ�, ���� ������ �ο��Ѵ�. ������ scores �迭�� ����ȴ�.
				int length = scores.length; //���� �迭�κ��� �л� ���� �� �� �ִ�.
				for(int i=0; i<length; i++){
					System.out.print("student["+(i+1)+"] : ");
					String score1 = scanner.nextLine();
					scores[i] = Integer.parseInt(score1); //�Է¹��� ������ �迭�� ����
				}
				System.out.println();
			//���� ����Ʈ Ȯ��
			} else if(select.equals("3")){
				System.out.println("����>"+select);
				int length = scores.length;
				for(int i=0; i<length; i++){
					System.out.println("student["+(i+1)+"] : "+scores[i]);
				}
				System.out.println();
			
			//���� �м�
			} else if(select.equals("4")){
				System.out.println("����>"+select);
				Arrays.sort(scores); //sort �޼ҵ带 ���� ������ �����ϰ�, ������ ���� ����Ѵ�.
				int length = scores.length; //������ ��-��ü ���̿��� -1 �� �� ���� �־��� ��
				System.out.println("�ְ� ���� : "+scores[length-1]);
				//���� for�������� scores�迭�� �� ��� ���� �����ش�.
				for(int a : scores){
					sum = sum + a;
				}
				avg = (double)sum/length;  //��հ�
				System.out.println("��� ���� : "+avg);
				System.out.println();
			
			//���α׷� ����
			} else if(select.equals("5")){
				System.out.println("����>"+select);
				System.out.println("���α׷��� �����մϴ�");
				run = false; 
				
			}
			
		}
		scanner.close();
		
		
		
	}

}
