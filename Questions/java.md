# һ��Java ����֪ʶ
## 1. ��������
### 1.1 Java ���Ե��ŵ�
* ���������
* ƽ̨�޹أ����������ԣ��������� Java �������ֽ��롰�м���롱�� JVM ��ִ�У�
* �ṩ�˺ܶ����õ���⣨synchronized �̡ܳ�GC��
* �ṩ�˶� Web Ӧ�ÿ�����֧��
* �Ϻõİ�ȫ�Ժͽ�׳�ԣ�����߽��⡢BytecodeУ�飻ǿ���ͻ��ơ�GC���쳣������ȫ�����ƣ�
* ȥ���� C++ �н��ѵ�ͷ�ļ���ָ�롢�ṹ����Ԫ����������ء���������ṹ�����ؼ̳е�
<br/>
        
### 1.2 Java �� C++ ��ʲô��ͬ
* Java Ϊ���������ԣ�C++ Ϊ���������ԣ���������Ӻ����ɿ�ִ�еĶ����ƴ��룩��Java��ִ���ٶ������ܿ�ƽ̨
* Java Ϊ������������ԣ����д������������ʵ�֣����������������⣬�������Ͷ����ࡣJava �в�����ȫ�ֱ�����ȫ�ֺ���
* Java û��ָ�룬�������ȫ
* Java ��֧�ֶ��ؼ̳У����������˽ӿڵĸ������ʵ�ֶ���ӿ�
* C++ ��Ҫ�����߹����ڴ�ķ��䣬��������������Java ͨ�� GC �Զ����գ����������������������� finalize()����
* Java �� import ���ƴ����� C++ ��Ԥ�����ܣ�Java ��֧����������أ�Java ��֧�� goto ��䣬�������Ǳ����֣�Java ��֧��ǿ������ת������Ҫ��ʽ��ǿ������ת����
* Java ����ƽ̨�޹��ԣ���ÿ���������Ͷ�����̶����ȣ��� int ռ 32 λ
* Java �кܶ��׼��Ͷ�ע���ĵ����ڽ�֧�� javadoc
<br/>
                        
### 1.3 Ϊʲô��Ҫ```public static void main (String[] args)```�������
���� Java �������ڷ�����
* JVM ����ʱ�����ҵ� main() ��һ������������
* public ��Ȩ�����η��������κ������󶼿��Է������������
* static ���� main() ������һ����̬���������洢�ھ�̬�洢����ֱ�ӿ���ͨ������.main()ֱ�ӷ��ʣ�
* args Ϊ���������������ṩ�����ֶΡ�
<br/>

���꣺
1. ������ final��synchronized ������ main()���������� abstract ������ؼ��������Σ�û�з����壩��
2. ÿ���඼���Զ��� main() ����������ֻ�����ļ�����ͬ���� public ���ε����е� main() ����������Ϊ������ڡ�
<br/>
        
### 1.4 ����� mian() ����ִ��ǰ�����Ϣ
��̬�����౻����ʱ�ͻᱻ����
```java
public class Test{
    static{ 
        System.out.println("hello 1"); // ����ʾ
    }
    public static void main(String[] args){ 
        System.out.println("hello 2"); // ����ʾ
    }
}
```
<br/>
        
### 1.5 Java �����ʼ��˳��
1. ��̬��
    * ���ྲ̬��>���ྲ̬��
2. ��̬����
    * ����>�����>����
3. ��̬����
    * ����>�����>����
4. �Ǿ�̬����
    * ����>�����>����
5. �Ǿ�̬����
    * ����>�����>����
<br/> 
        
### 1.6 Java �е�������
���������ͣ�
```java
class Person{
    String name;    // ��Ա����/ʵ������
    static int age; // ��̬����/�����
    public void study(){
        float time; // �ֲ�����
    }
}
```    
��Ա������������   
private����ǰ�ࣩ��default��+ ͬһ package����protected��+ ���ࣩ��public��+ ���� package��     
        
�ڲ��ࣺ���е��࣬�ſ����� private��protected ���Σ�ֻ�� public��abstract��final �������ⲿ�ࡣ
<br/>
        
### 1.7 һ�� Java �ļ����Ƿ���Զ�������
* һ�� Java �ļ����Զ������࣬�������ֻ����һ���౻ public ���Σ���������������Ҫ���ļ�����ͬ�����ʾ��ÿ�����뵥Ԫ���е�һ�Ĺ����ӿڣ���Ҳ����û�� public �ࡣ     
* ���� javac ָ����� .java �ļ�ʱ�������ÿһ��������һ����Ӧ�� .class �ļ���
<br/>
        
### 1.8 ʲô�ǹ��캯��
* ���캯�����������������ͬ���������з���ֵ void ��
* ÿ��������ж�� ���캯������������û���ṩʱ���������ڱ���Դ��ʱ���Զ�����һ���޲εĹ��캯��������ִ���κδ��롣����������ṩ�ˣ���ô�������Ͳ��ᴴ��
* ��Ҫ��������ɶ���ĳ�ʼ������
* ���캯�����ܱ��̳У����ǿ��Ա�����
* �������ͨ�� super ����ʽ�ص��ø���Ĺ��캯����������û���ṩ�޲εĹ��캯�������������ʽ���ø���Ĺ��캯��
* ���캯�����ǰ��� new ����һ����ϵͳ���ã��ڶ���ʵ����ʱֻ����һ��
<br/>
        
### 1.9 Ϊʲô��Щ�ӿ�û���κη���
* Ϊ�˿˷����̳е�ȱ�㣬Java �����˽ӿڵĸ��    
* �ӿ��г�Ա�����������η����� public������ֵĬ��ʹ�� public static final ���Ρ�  
* �ӿ��ǳ��󷽷�����ļ��ϣ�ֻ���������Ķ��壬û�з�����ʵ�֡�û���κη��������Ľӿڳ�Ϊ��ʶ�ӿڡ�ʹ�� instanceof ���ж�ʵ������������Ƿ�ʵ����һ�������ı�ʶ�ӿڡ�
<br/>
        
### 1.10 clone ����������
* Java û����ȷ�ṩָ��ĸ�����÷�����ʵ����ÿ�� new ��䷵�صĶ���һ��ָ������á�  
* Java �ڴ��������������ʱ�����ǲ��ð�ֵ���ݣ�����֮����������Ͷ��ǰ����ô��ݣ�����ʹ�� = Ҳ�����ô��ݣ���
* Java �����е��඼�̳� Object �࣬�����ṩ��һ�� clone() ����������һ��**�µĶ���**������һ�����á�
~~~
1. ʵ�� clone ������Ҫ�̳� Cloneable ��ʶ�ӿڣ�
2. ��������д Object ���е� clone() ������
3. �� clone �����е��� super.clone()��
4. ��ǳ���Ƶ�����ָ��ԭ�Ͷ����µĿ�¡�塣�磺Object b = (Obj)a.clone();
~~~
��**���а���һЩ����ʱ**����Ҫ�õ���ơ��ڶԶ������ clone() ������ɸ��ƺ󣬽��ŶԶ����еķǻ������͵�����Ҳ���� clone() �������磺o.getDate = (Date)this.getDate().clone();
<br/>
        
### 1.11 �������
���ܣ�     
* ������ʱ�ж�����һ�������������ࣻ
* ������ʱ��������һ����Ķ���
* ������ʱ�ж�����һ���������еĳ�Ա�����ͷ�����
* ������ʱ��������һ������ĳ�Ա�����ͷ�����
* ���ɶ�̬����
```java
public class Test{
    // ͨ��������ƴ�������
    public void Test() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        // ���� com.ustc.test.Person ��
        Class clazz = com.ustc.test.Person.class;             // Class<com.ustc.test.Person> clazz = com.ustc.test.Person.class;
        com.ustc.test.Person p = (com.ustc.test.Person)clazz.newInstance(); // clazz.newInstance();

        // ���� public ���͵ĳ�Ա����
        Field f = clazz.getField("name");
        f.set(p, "Matthew");

        // ���� private ���͵ķ���
        Method m = clazz.getDeclaredMethod("speak", String.class);
        m.setAccessible(true);  // �ܹ����� com.ustc.test.Person ���ж���ĳ�Ա�����ͷ���
        m.invoke(p, "China");
    }
}
```
��� Class ��ķ�����  
* Class.forName("���·��")
* ����.Class
* ʵ��.getClass()     

Java ��������ķ�����       
* ͨ�� new ���ʵ����һ������
* ͨ��������ƴ�������
* ͨ�� clone() ��ʽ����һ������
* ͨ�������л��ķ�����������
<br/>
        
### 1.12 package ��ʲô����
�� .java��.class��resource �ļ�������ؽ���һ����֯���Թ�ʹ�á�  
package ������Ҫ���ڴ�����ǰ�棬��һ����ͽӿ���ɡ�
<br/>
        
### 1.13 ���ʵ�������� C �����к���ָ��Ĺ���
Java ���ýӿں���ʵ�ֺ���ָ���Ч�������ڲ������ģʽ��˼�롣   
```java
interface IntCompare{
    public int cmp(int a, int b);
}

class Cmp1 implements IntCompare{
    @Override
    public int cmp(int a, int b){return a;}
}

class Cmp2 implements IntCompare{
    @Override
    public int cmp(int a, int b){return b;}
}

public class Test{
    public void test(int[] a, IntCompare cmp){  // ���ƺ���ָ��
        // do something
    }
}
```
