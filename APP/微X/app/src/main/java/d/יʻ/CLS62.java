// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS62 {
    public final ConcurrentHashMap FLD312;
    public Object FLD313;
    public final ConcurrentHashMap FLD314;
    public final ConcurrentHashMap FLD315;
    public final ConcurrentHashMap FLD316;
    public static final CLS62 FLD317 = new CLS62();

    public CLS62() {
        this.FLD314 = new ConcurrentHashMap();
        this.FLD312 = new ConcurrentHashMap();
        this.FLD316 = new ConcurrentHashMap();
        this.FLD315 = new ConcurrentHashMap();
    }

    public final void MTH753(String s, CLS65.CLS64 ˑʽ$ᐧי0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            ConcurrentHashMap concurrentHashMap0 = this.FLD314;
            if(concurrentHashMap0.containsKey(s1)) {
                CLS65 ˑʽ0 = (CLS65)concurrentHashMap0.get(s1);
                if(ˑʽ0 != null) {
                    ArrayList arrayList0 = ˑʽ0.FLD319;
                    if(!arrayList0.contains(ˑʽ$ᐧי0)) {
                        arrayList0.add(ˑʽ$ᐧי0);
                    }
                }
            }
            else {
                CLS65 ˑʽ1 = new CLS65();
                ArrayList arrayList1 = ˑʽ1.FLD319;
                if(!arrayList1.contains(ˑʽ$ᐧי0)) {
                    arrayList1.add(ˑʽ$ᐧי0);
                }
                concurrentHashMap0.put(s1, ˑʽ1);
            }
        }
    }

    public final void MTH754(String s, String s1, Object[] arr_object) {
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("pf3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD313, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH755(s1, arr_object);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH755(String s, Object[] arr_object) {
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("pf2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD313, "donation", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH763(s, arr_object);
                return;
            }
            Method method1 = this.MTH762("pf");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD313, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public final String MTH756(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD312;
        if(concurrentHashMap0.containsKey(s)) {
            CLS73 ⁱﾞ0 = (CLS73)concurrentHashMap0.get(s);
            if(ⁱﾞ0 != null) {
                Object object0 = ⁱﾞ0.MTH836(arr_object);
                return object0 == null ? "" : ((String)object0);
            }
            return "";
        }
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("gs");
            if(method0 != null) {
                try {
                    return (String)method0.invoke(this.FLD313, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    public final Object MTH757(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD312;
        if(concurrentHashMap0.containsKey(s)) {
            CLS73 ⁱﾞ0 = (CLS73)concurrentHashMap0.get(s);
            if(ⁱﾞ0 != null) {
                ArrayList arrayList0 = ⁱﾞ0.MTH837(arr_object);
                return arrayList0.isEmpty() ? null : arrayList0.get(0);
            }
            return null;
        }
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("gof");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD313, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH758(String s, Object[] arr_object) {
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("p2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD313, "donation", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH763(s, arr_object);
                return;
            }
            Method method1 = this.MTH762("p");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD313, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public final void MTH759(String s, String s1, Object[] arr_object) {
        if(s.contains(",")) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                this.MTH759(arr_s[v].trim(), s1, arr_object);
            }
            return;
        }
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("p3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD313, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH758(s1, arr_object);
        }
    }

    public final boolean MTH760(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD312;
        if(concurrentHashMap0.containsKey(s)) {
            CLS73 ⁱﾞ0 = (CLS73)concurrentHashMap0.get(s);
            if(ⁱﾞ0 != null) {
                Object object0 = ⁱﾞ0.MTH836(arr_object);
                if(object0 != null) {
                    return object0 instanceof String ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue();
                }
            }
            return false;
        }
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("gb");
            if(method0 != null) {
                try {
                    return ((Boolean)method0.invoke(this.FLD313, s, arr_object)).booleanValue();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return false;
    }

    public final Object MTH761(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD312;
        if(concurrentHashMap0.containsKey(s)) {
            CLS73 ⁱﾞ0 = (CLS73)concurrentHashMap0.get(s);
            return ⁱﾞ0 == null ? null : ⁱﾞ0.MTH836(arr_object);
        }
        if(this.FLD313 != null) {
            Method method0 = this.MTH762("go");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD313, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public final Method MTH762(String s) {
        return this.FLD315.containsKey(s) ? ((Method)this.FLD315.get(s)) : null;
    }

    public final void MTH763(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD314;
        if(concurrentHashMap0.containsKey(s)) {
            CLS65 ˑʽ0 = (CLS65)concurrentHashMap0.get(s);
            if(ˑʽ0 != null) {
                ˑʽ0.MTH777(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = this.FLD316;
            if(concurrentHashMap1.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        ((CLS65)object0).MTH777(arr_object);
                    }
                }
            }
        }
    }
}

