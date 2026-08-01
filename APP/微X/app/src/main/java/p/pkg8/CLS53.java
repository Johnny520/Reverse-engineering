// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS53 {
    public final ConcurrentHashMap FLD361;
    public static final CLS53 FLD362;
    public Object FLD363;
    public final ConcurrentHashMap FLD364;
    public final ConcurrentHashMap FLD365;
    public final ConcurrentHashMap FLD366;

    static {
        CLS53.FLD362 = new CLS53();
    }

    public CLS53() {
        this.FLD364 = new ConcurrentHashMap();
        this.FLD366 = new ConcurrentHashMap();
        this.FLD365 = new ConcurrentHashMap();
        this.FLD361 = new ConcurrentHashMap();
    }

    public final void MTH935(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD364;
        if(concurrentHashMap0.containsKey(s)) {
            CLS55 ﾞˈ0 = (CLS55)concurrentHashMap0.get(s);
            if(ﾞˈ0 != null) {
                ﾞˈ0.MTH950(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = this.FLD365;
            if(concurrentHashMap1.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        ((CLS55)object0).MTH950(arr_object);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH936(String s, Object[] arr_object) {
        if(this.FLD363 != null) {
            Method method0 = this.MTH945("pf2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD363, "vidurlparser", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH935(s, arr_object);
                return;
            }
            Method method1 = this.MTH945("pf");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD363, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH937(String s, Object[] arr_object) {
        if(this.FLD363 != null) {
            Method method0 = this.MTH945("p2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD363, "vidurlparser", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH935(s, arr_object);
                return;
            }
            Method method1 = this.MTH945("p");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD363, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH938(String s, CLS54 ﾞˈ$ٴʼ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            ConcurrentHashMap concurrentHashMap0 = this.FLD364;
            if(concurrentHashMap0.containsKey(s1)) {
                CLS55 ﾞˈ0 = (CLS55)concurrentHashMap0.get(s1);
                if(ﾞˈ0 != null) {
                    ArrayList arrayList0 = ﾞˈ0.FLD368;
                    if(!arrayList0.contains(ﾞˈ$ٴʼ0)) {
                        arrayList0.add(ﾞˈ$ٴʼ0);
                    }
                }
            }
            else {
                CLS55 ﾞˈ1 = new CLS55();
                ArrayList arrayList1 = ﾞˈ1.FLD368;
                if(!arrayList1.contains(ﾞˈ$ٴʼ0)) {
                    arrayList1.add(ﾞˈ$ٴʼ0);
                }
                concurrentHashMap0.put(s1, ﾞˈ1);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH939(String s, CLS46 ˎᵔ$ٴʼ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            ConcurrentHashMap concurrentHashMap0 = this.FLD366;
            if(concurrentHashMap0.containsKey(s1)) {
                CLS47 ˎᵔ0 = (CLS47)concurrentHashMap0.get(s1);
                if(ˎᵔ0 != null) {
                    ArrayList arrayList0 = ˎᵔ0.FLD338;
                    if(!arrayList0.contains(ˎᵔ$ٴʼ0)) {
                        arrayList0.add(ˎᵔ$ٴʼ0);
                    }
                }
            }
            else {
                CLS47 ˎᵔ1 = new CLS47();
                ArrayList arrayList1 = ˎᵔ1.FLD338;
                if(!arrayList1.contains(ˎᵔ$ٴʼ0)) {
                    arrayList1.add(ˎᵔ$ٴʼ0);
                }
                concurrentHashMap0.put(s1, ˎᵔ1);
            }
        }
    }

    // 此方法包含解密的字符串
    public final String MTH940(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD366;
        Object object0 = null;
        if(concurrentHashMap0.containsKey(s)) {
            CLS47 ˎᵔ0 = (CLS47)concurrentHashMap0.get(s);
            if(ˎᵔ0 != null) {
                ArrayList arrayList0 = ˎᵔ0.MTH907(arr_object);
                if(!arrayList0.isEmpty()) {
                    object0 = arrayList0.get(0);
                }
                return object0 == null ? "" : ((String)object0);
            }
            return "";
        }
        if(this.FLD363 != null) {
            Method method0 = this.MTH945("gs");
            if(method0 != null) {
                try {
                    return (String)method0.invoke(this.FLD363, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    public final void MTH941() {
        this.FLD365.clear();
        this.FLD364.clear();
        this.FLD366.clear();
    }

    // 此方法包含解密的字符串
    public final void MTH942(String s, String s1, Object[] arr_object) {
        if(s.contains(",")) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                this.MTH942(arr_s[v].trim(), s1, arr_object);
            }
            return;
        }
        if(this.FLD363 != null) {
            Method method0 = this.MTH945("p3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD363, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH937(s1, arr_object);
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH943(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD366;
        if(concurrentHashMap0.containsKey(s)) {
            CLS47 ˎᵔ0 = (CLS47)concurrentHashMap0.get(s);
            if(ˎᵔ0 != null) {
                ArrayList arrayList0 = ˎᵔ0.MTH907(arr_object);
                return arrayList0.isEmpty() ? null : arrayList0.get(0);
            }
            return null;
        }
        if(this.FLD363 != null) {
            Method method0 = this.MTH945("go");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD363, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH944(String s, String s1, Object[] arr_object) {
        if(this.FLD363 != null) {
            Method method0 = this.MTH945("pf3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD363, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH936(s1, arr_object);
        }
    }

    // 去混淆评级： 低(20)
    public final Method MTH945(String s) {
        return this.FLD361.containsKey(s) ? ((Method)this.FLD361.get(s)) : null;
    }
}

