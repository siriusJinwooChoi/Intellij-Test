package collection;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 진우 on 2016-07-17.
 */
//ArrayList, Stack - Test
/* (자바에서의 자료구조)
 * 1. 순서가 있는 목록인 List형
 * 2. 순서가 중요하지 않은 목록인 Set형
 * 3. 먼저 들어온 것이 먼저 나가는 Queue형
 * 4. 키-값(key-value)으로 저장되는 Map형
 */

//List인터페이스를 주로 구현한 java.util패키지 : ArrayList, Vector, Stack, LinkedList

/*
 * List의 특징 : 배열처럼 순서가 있다.
 * ArrayList와 Vector클래스의 사용법은 거의 동일하고 기능도 비슷.
 * 이 두 클래스는 "크기 확장이 가능한 배열" 이라 보면 된다.
 * ArrayList : 이 객체는 여러명이 달려들어 값을 변경하려하면 문제가 발생할 수 있다.(Thread Safe하지 않다.)
 * Vector : 위 문제가 발생하지 않는다.(Thread Safe하다.)
 *
 * Stack클래스는 Vector클래스를 확장하여 만들었는데, LIFO를 지원하기 위해 만들어짐
 */
public class MyListTest {
    public static void main(String[] args) {
        MyListTest test = new MyListTest();
        //test.checkArrayList1();
        //test.checkArrayList2();
        //test.checkArrayList3();
        //test.checkArrayList4();
        test.checkStack();
        test.checkStack();
    }

    ///////////////////////////////////////////////////////
    public void checkArrayList1() {
        ArrayList list1 = new ArrayList();
        System.out.println(list1);
        list1.add(new Object());
        System.out.println(list1);
        list1.add("ArrayListSample");
        System.out.println(list1);
        list1.add(new Double(1));
        System.out.println(list1);
    }
    ///////////////////////////////////////////////////////
    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jinwoo");
        list.add("Choi");
        list.add("HUFS");
        list.add("ICE");
        list.add("Suwon");
        list.add(1, "Sirius");

		for(String tempData:list)
			System.out.print(tempData + " ");
        System.out.println();
        /*
		ArrayList<String> jwlist = new ArrayList<String>();
		jwlist.add("0 ");
		jwlist.addAll(list);             //list에 있는 전부를 list2에 add.
		for(String jinwooData:jwlist)
			System.out.println("New List : "+ jinwooData);
        */

        ArrayList<String> jwlist = list; //list2는 list의 주소까지도 사용함.
        list.add("Bye!");
        for(String jinwooData:jwlist)
            System.out.println("New List : " + jinwooData);
    }
    ///////////////////////////////////////////////////////
    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

		int listSize = list.size();
		for(int loop=0; loop<listSize; loop++)
			System.out.println("list.get("+loop+")="+list.get(loop));
		String[] strList=list.toArray(new String[0]);

        //String[] tempArray=new String[7]; //String[list.size()]로 하면 맞음.
        //String[] strList = list.toArray(tempArray);
        for(String temp:strList)
            System.out.println(temp);
    }
    ///////////////////////////////////////////////////////
    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");

        //System.out.println("Removed "+list.remove(0));
        //System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("A");
        list.removeAll(temp);

        for (int loop = 0; loop < list.size(); loop++)
            System.out.println("list.get(" + loop + ")=" + list.get(loop));
    }

    ////////////////////////////////////////////////////////////
    public void checkStack() {
        Stack<Integer> myStack = new Stack<Integer>();
        for(int loop=0; loop<5; loop++) {
            myStack.push(loop);
            System.out.println(myStack.peek());
        }
        while(!myStack.empty()) {
            System.out.println(myStack.pop());
        }
    }
}