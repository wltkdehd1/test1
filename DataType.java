class DataType{
	public static void main(String[] args){
		short sh = 500;
		int iNum = 50000;
		
		//iNum = sh;//작은 자료형이 큰자료형에....
			  //자동형변환(묵시적형변환)된다

		sh = (short)iNum; //작은 자료형에다가 큰자료형을 데입할때
				  //명시적 형변형을 해야한다. 데이터 손실이 발생한다.
		System.out.println("sh = " + sh);
		System.out.println("iNum = " + iNum);
	}//main end
}//class end