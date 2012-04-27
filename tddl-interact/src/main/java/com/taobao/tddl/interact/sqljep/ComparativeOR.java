/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.util.Comparator;
/**
 * AND�ڵ�
 * ��ʵ�ʵ�SQL�У�ʵ����������
 * [Comparative]              [comparative]
 * 			\                  /
 * 			  \				  /
 *             [ComparativeOR]
 *             
 * ���������Ľڵ����
 * 
 * @author shenxun
 *
 */
public class ComparativeOR extends ComparativeBaseList{
	
	public ComparativeOR(int function, Comparable<?> value) {
		super(function, value);
	}
	
	public ComparativeOR(){};
	
	public ComparativeOR(Comparative item){
		super(item);
	}
	public ComparativeOR(int capacity){
		super(capacity);
	}
//	@SuppressWarnings("unchecked")
//	public boolean intersect(int function,Comparable other,Comparator comparator){
//		//�����и����⣬
//		for(Comparative source :list){
//			if(source.intersect(function, other, comparator)){
//				return true;
//			}
//		}
//		return false;
//	}
	@Override
	protected String getRelation() {
		return " or ";
	}
}