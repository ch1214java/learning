
public class _03ZuoYe {

	/***
	 * ========================================������================================================
1.����һ������getMax,��������int����,��������һ����(�ͼ�)
	����ʹ����Ŀ����
	
2.����һ������,��������int����,������С��һ����(�ͼ�)


3.���һ����3��int���ͻ��ķ���,�����������(�ͼ�)

4.���һ������������һ��int�����飬���ظ�����������ֵ(�м�)

========================================ѡ��================================================

5.���һ����������ѯ������һ���ַ����ַ������е�һ�γ��ֵ�λ��(�߼�)
	char arr = {'a','b','c','a','g'};
	char c = 'a';

	��Ҫ�أ�
		����ֵ���ͣ�int 
		��������getIndexInArray()
		�β��б���char c,char[] arr
		�����壺
			�����������飬��c �� arr[i] �����ȣ������±�i
			��������꣬û���ҵ������� -1  �±귶Χ��0,n


6.���һ������,ͳ�Ʒ���һ���ַ����ַ������г��ֵĴ���(�߼�)

7.���һ������,��֪��������������  int[] arr = {1,2,3,4,5,6,7,8,9,11,12}�������е�������

8.���������� double[] scores = {11,34,76,77,88,99,58,97,56};����һ������ͳ�Ʋ���ӡ��ÿһ���׶�ѧ����
��(�ֶη�ʽ��0-60;60-80;80-100)(�߼�)


	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int[] b = getJi(a);
		String str = "{";
		for(int i = 0;i<b.length;i++){
			
			if(i==b.length-1){
				str += b[i]+"}";
			}else{
				str += b[i]+",";
			}
			System.out.println(b[i]);
		}
		System.out.println(str);
	}
	//9.���һ������������һ��int���飬��ת�������е�Ԫ�أ����ҷ��ط�ת�������(ţƤ��)
	public static int[] getJi(int[] a){
		
		for(int i=0;i<a.length;i++){
			
		}
		
		for(int i = 0;i<a.length;i++){
			int temp=0;
			int j = a.length-1-i;
			if(i<=j){//i=j��ʱ����һ���ٽ���ʾi��j�Լ����Լ�����
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			System.out.println("arr[i]="+a[i]+" arr[j]="+a[j]);
		}
		return a;
	}
	

}