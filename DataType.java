class DataType{
	public static void main(String[] args){
		short sh = 500;
		int iNum = 50000;
		
		//iNum = sh;//���� �ڷ����� ū�ڷ�����....
			  //�ڵ�����ȯ(����������ȯ)�ȴ�

		sh = (short)iNum; //���� �ڷ������ٰ� ū�ڷ����� �����Ҷ�
				  //����� �������� �ؾ��Ѵ�. ������ �ս��� �߻��Ѵ�.
		System.out.println("sh = " + sh);
		System.out.println("iNum = " + iNum);
	}//main end
}//class end