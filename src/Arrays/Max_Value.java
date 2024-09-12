package Arrays;

public class Max_Value {

	public static void main(String[] args) {
		int[] arr= {3,5,1,7,8,6};
		System.out.println(max(arr));
		

	}
	public static int max(int[]arr) {
		//int Max=Integer.MIN_VALUE;
		//-2^31
		int Max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
			//m=Math.max(m,arr[i]);
		}
		return Max;
		
	}

}
