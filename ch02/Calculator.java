package ch02;

public class Calculator {
    private static int result; // ��̬���������ڴ洢���н��
    public void add(int n) {
        result = result + n;
    }
    public void substract(int n) {
        result = result - n;  
    }
    public void multiply(int n) {
    	result=result*n;
    }         // �˷�����δд�ã��벹��
    public void divide(int n) {
    	if(n==0) {
    		System.out.println("The question has no solution!");
    	}
    	else {
    		result=result/n;
    	}
    	          // �˷�����δд�ã��벹��
    }
    public void square() {
    	result=result*result;
    	         // �˷�����δд�ã��벹��
    }
    public void power(int n) {
    	int PriResult=result;
    	for(int i=1;i<n;i++) {
    		result*=PriResult;
    	}
             // �˷�����δд�ã��벹��
    }
    public void clear() {     // ���������
        result = 0;
    }
    public int getResult() {
        return result;
    }
}
