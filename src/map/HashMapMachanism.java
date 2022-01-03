package map;

import java.util.*;

class A{
    int data;
    public A(int data){
        this.data=data;
    }
}

class B{
    int data;
    public B(int data){
        this.data =data;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof B){
            this.data=((B)obj).data;
            return true;

        }
        return false;
    }
}

class C{
    int data;
    public C(int data){
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof C){
            this.data = ((C) obj).data;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}

public class HashMapMachanism {
    public static void main(String[] args) {
        Map<A, String> hashMap1 = new HashMap<>();
        A a1 = new A(3);
        A a2 = new A(3);
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode()+","+a2.hashCode());
        hashMap1.put(a1, "첫 번째");
        hashMap1.put(a2, "두 번째");
        System.out.println(hashMap1.size());
        System.out.println();
       /* Set<A> aSet = hashMap1.keySet();
        Iterator<A> iterator = aSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().data);
        }*/

        Map<B, String> hashMap2 = new HashMap<>();
        B b1 = new B(3);
        B b2 = new B(3);
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode()+","+a2.hashCode());
        hashMap2.put(b1, "첫 번째");
        hashMap2.put(b2, "두 번째");
        System.out.println(hashMap2.size());
        System.out.println();

        Map<C, String> hashMap3 = new HashMap<>();
        C c1 = new C(3);
        C c2 = new C(3);
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode()+","+c2.hashCode());
        hashMap3.put(c1, "첫 번째");
        hashMap3.put(c2, "두 번째");
        System.out.println(hashMap3.size());
        System.out.println();








    }
}
