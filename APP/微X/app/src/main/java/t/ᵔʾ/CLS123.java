// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS123 {
    public final ConcurrentHashMap FLD907;
    public Object FLD908;
    public final ConcurrentHashMap FLD909;
    public final ConcurrentHashMap FLD910;
    public final ConcurrentHashMap FLD911;
    public static final CLS123 FLD912;

    static {
        CLS123.FLD912 = new CLS123();
    }

    public CLS123() {
        this.FLD907 = new ConcurrentHashMap();
        this.FLD910 = new ConcurrentHashMap();
        this.FLD909 = new ConcurrentHashMap();
        this.FLD911 = new ConcurrentHashMap();
    }

    // 此方法包含解密的字符串
    public final void MTH1997(String s, Object[] arr_object) {
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("p2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD908, "themes", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH1999(s, arr_object);
                return;
            }
            Method method1 = this.MTH2008("p");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD908, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public final ArrayList MTH1998(String s, Object[] arr_object) {
        CLS127 ˊﾞ0 = (CLS127)this.FLD910.get(s);
        return ˊﾞ0 == null ? new ArrayList() : ˊﾞ0.MTH2045(arr_object);
    }

    public final void MTH1999(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD907;
        if(concurrentHashMap0.containsKey(s)) {
            CLS139 ﾞٴ0 = (CLS139)concurrentHashMap0.get(s);
            if(ﾞٴ0 != null) {
                ﾞٴ0.MTH2155(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = this.FLD909;
            if(concurrentHashMap1.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        ((CLS139)object0).MTH2155(arr_object);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH2000(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD910;
        if(concurrentHashMap0.containsKey(s)) {
            CLS127 ˊﾞ0 = (CLS127)concurrentHashMap0.get(s);
            if(ˊﾞ0 != null) {
                Object object0 = ˊﾞ0.MTH2046(arr_object);
                if(object0 != null) {
                    return object0 instanceof String ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue();
                }
            }
            return false;
        }
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("gb");
            if(method0 != null) {
                try {
                    return ((Boolean)method0.invoke(this.FLD908, s, arr_object)).booleanValue();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final void MTH2001(String s, Object[] arr_object) {
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("pf2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD908, "themes", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH1999(s, arr_object);
                return;
            }
            Method method1 = this.MTH2008("pf");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD908, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2002(String s, CLS138 ﾞٴ$ˆٴ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            ConcurrentHashMap concurrentHashMap0 = this.FLD907;
            if(concurrentHashMap0.containsKey(s1)) {
                CLS139 ﾞٴ0 = (CLS139)concurrentHashMap0.get(s1);
                if(ﾞٴ0 != null) {
                    ArrayList arrayList0 = ﾞٴ0.FLD977;
                    if(!arrayList0.contains(ﾞٴ$ˆٴ0)) {
                        arrayList0.add(ﾞٴ$ˆٴ0);
                    }
                }
            }
            else {
                CLS139 ﾞٴ1 = new CLS139();
                ArrayList arrayList1 = ﾞٴ1.FLD977;
                if(!arrayList1.contains(ﾞٴ$ˆٴ0)) {
                    arrayList1.add(ﾞٴ$ˆٴ0);
                }
                concurrentHashMap0.put(s1, ﾞٴ1);
            }
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH2003(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD910;
        if(concurrentHashMap0.containsKey(s)) {
            CLS127 ˊﾞ0 = (CLS127)concurrentHashMap0.get(s);
            return ˊﾞ0 == null ? null : ˊﾞ0.MTH2046(arr_object);
        }
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("go");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD908, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH2004(String s, String s1, Object[] arr_object) {
        if(s.contains(",")) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                this.MTH2004(arr_s[v].trim(), s1, arr_object);
            }
            return;
        }
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("p3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD908, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH1997(s1, arr_object);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH2005(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD910;
        if(concurrentHashMap0.containsKey(s)) {
            CLS127 ˊﾞ0 = (CLS127)concurrentHashMap0.get(s);
            if(ˊﾞ0 != null) {
                Object object0 = ˊﾞ0.MTH2046(arr_object);
                return object0 == null ? "" : ((String)object0);
            }
            return "";
        }
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("gs");
            if(method0 != null) {
                try {
                    return (String)method0.invoke(this.FLD908, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH2006(String s, String s1, Object[] arr_object) {
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("pf3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD908, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH2001(s1, arr_object);
        }
    }

    // 此方法包含解密的字符串
    public final int MTH2007(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD910;
        if(concurrentHashMap0.containsKey(s)) {
            CLS127 ˊﾞ0 = (CLS127)concurrentHashMap0.get(s);
            if(ˊﾞ0 != null) {
                Object object0 = ˊﾞ0.MTH2046(arr_object);
                if(object0 != null) {
                    return object0 instanceof String ? Integer.parseInt(((String)object0)) : ((int)(((Integer)object0)));
                }
            }
            return 0;
        }
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("gi");
            if(method0 != null) {
                try {
                    return (int)(((Integer)method0.invoke(this.FLD908, s, arr_object)));
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    public final Method MTH2008(String s) {
        return this.FLD911.containsKey(s) ? ((Method)this.FLD911.get(s)) : null;
    }

    // 此方法包含解密的字符串
    public final void MTH2009(String s, CLS126 ˊﾞ$ˆٴ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            ConcurrentHashMap concurrentHashMap0 = this.FLD910;
            if(concurrentHashMap0.containsKey(s1)) {
                CLS127 ˊﾞ0 = (CLS127)concurrentHashMap0.get(s1);
                if(ˊﾞ0 != null) {
                    ArrayList arrayList0 = ˊﾞ0.FLD916;
                    if(!arrayList0.contains(ˊﾞ$ˆٴ0)) {
                        arrayList0.add(ˊﾞ$ˆٴ0);
                    }
                }
            }
            else {
                CLS127 ˊﾞ1 = new CLS127();
                ArrayList arrayList1 = ˊﾞ1.FLD916;
                if(!arrayList1.contains(ˊﾞ$ˆٴ0)) {
                    arrayList1.add(ˊﾞ$ˆٴ0);
                }
                concurrentHashMap0.put(s1, ˊﾞ1);
            }
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH2010(String s, String s1, Object[] arr_object) {
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("got");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD908, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                    return null;
                }
            }
            return this.MTH2003(s1, arr_object);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final Object MTH2011(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD910;
        if(concurrentHashMap0.containsKey(s)) {
            CLS127 ˊﾞ0 = (CLS127)concurrentHashMap0.get(s);
            if(ˊﾞ0 != null) {
                ArrayList arrayList0 = ˊﾞ0.MTH2045(arr_object);
                return arrayList0.isEmpty() ? null : arrayList0.get(0);
            }
            return null;
        }
        if(this.FLD908 != null) {
            Method method0 = this.MTH2008("gof");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD908, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }
}

