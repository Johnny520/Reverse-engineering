// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import b.ⁱᵔ.CLS431;
import b.ⁱᵔ.CLS502;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS21 {
    public final ConcurrentHashMap FLD71;
    public Object FLD72;
    public final ConcurrentHashMap FLD73;
    public final ConcurrentHashMap FLD74;
    public final ConcurrentHashMap FLD75;
    public static final CLS21 FLD76;

    static {
        CLS21.FLD76 = new CLS21();
    }

    public CLS21() {
        this.FLD71 = new ConcurrentHashMap();
        this.FLD74 = new ConcurrentHashMap();
        this.FLD73 = new ConcurrentHashMap();
        this.FLD75 = new ConcurrentHashMap();
    }

    public final ArrayList MTH813(String s, Object[] arr_object) {
        CLS38 ﾞᐧ0 = (CLS38)this.FLD74.get(s);
        return ﾞᐧ0 == null ? new ArrayList() : ﾞᐧ0.MTH1110(arr_object);
    }

    // 此方法包含解密的字符串
    public final void MTH814(String s) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            this.FLD71.remove(s1);
            this.FLD73.remove(s1);
            this.FLD74.remove(s1);
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH815(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD74;
        if(concurrentHashMap0.containsKey(s)) {
            CLS38 ﾞᐧ0 = (CLS38)concurrentHashMap0.get(s);
            if(ﾞᐧ0 != null) {
                ArrayList arrayList0 = ﾞᐧ0.MTH1110(arr_object);
                return arrayList0.isEmpty() ? null : arrayList0.get(0);
            }
            return null;
        }
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("gof");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD72, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final Object MTH816(String s, String s1, Object[] arr_object) {
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("got");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD72, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                    return null;
                }
            }
            return this.MTH836(s1, arr_object);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH817(String s, String s1, Object[] arr_object) {
        if(s.contains(",")) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                this.MTH817(arr_s[v].trim(), s1, arr_object);
            }
            return;
        }
        if("core".equals(s)) {
            this.MTH831(s, s1, arr_object);
            return;
        }
        if(s.equals("base")) {
            this.MTH818(s1, arr_object);
            return;
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if((CLS502.MTH6934(ˎᵢ0.MTH925("fp", ""), new String[]{s}) || CLS502.MTH6934(ˎᵢ0.MTH925("fp_async", ""), new String[]{s})) && CLS31.MTH1001(new File(CLS27.FLD105, CLS431.MTH6160(("FP_" + s))))) {
            this.MTH831(s, s1, arr_object);
        }
    }

    public final void MTH818(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD71;
        if(concurrentHashMap0.containsKey(s)) {
            CLS36 ﾞٴ0 = (CLS36)concurrentHashMap0.get(s);
            if(ﾞٴ0 != null) {
                ﾞٴ0.MTH1105(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = this.FLD73;
            if(concurrentHashMap1.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        ((CLS36)object0).MTH1105(arr_object);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH819(String s, Object[] arr_object) {
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("p2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD72, "base", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH818(s, arr_object);
                return;
            }
            Method method1 = this.MTH837("p");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD72, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public final void MTH820() {
        this.FLD73.clear();
        this.FLD71.clear();
        this.FLD74.clear();
    }

    public static CLS21 MTH821() {
        return CLS21.FLD76;
    }

    // 此方法包含解密的字符串
    public final void MTH822(String s, Object[] arr_object) {
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("pf2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD72, "base", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH818(s, arr_object);
                return;
            }
            Method method1 = this.MTH837("pf");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD72, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH823(String s, Object[] arr_object) {
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("pinc2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD72, "base", s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH835(s, arr_object);
                return;
            }
            Method method1 = this.MTH837("pinc");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD72, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH824(String s, int v, CLS35 ﾞٴ$ˆٴ0) {
        String[] arr_s = s.split(",");
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = arr_s[v1];
            ConcurrentHashMap concurrentHashMap0 = this.FLD73;
            if(concurrentHashMap0.containsKey(s1)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap0.get(s1);
                if(arrayList0 != null) {
                    Iterator iterator0 = arrayList0.iterator();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        if(((CLS36)object0).FLD150 == v) {
                            iterator0.remove();
                        }
                    }
                    CLS36 ﾞٴ0 = new CLS36(v);
                    ﾞٴ0.MTH1106(ﾞٴ$ˆٴ0);
                    arrayList0.add(ﾞٴ0);
                }
            }
            else {
                CLS36 ﾞٴ1 = new CLS36(v);
                ﾞٴ1.MTH1106(ﾞٴ$ˆٴ0);
                ArrayList arrayList1 = new ArrayList();
                arrayList1.add(ﾞٴ1);
                concurrentHashMap0.put(s1, arrayList1);
            }
        }
    }

    public final void MTH825(String s, int v, Object[] arr_object) {
        CLS36 ﾞٴ0 = null;
        ConcurrentHashMap concurrentHashMap0 = this.FLD73;
        if(concurrentHashMap0.containsKey(s)) {
            if(concurrentHashMap0.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap0.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        CLS36 ﾞٴ1 = (CLS36)object0;
                        if(ﾞٴ1.FLD150 == v) {
                            ﾞٴ0 = ﾞٴ1;
                            break;
                        }
                    }
                }
            }
            if(ﾞٴ0 != null) {
                ﾞٴ0.MTH1105(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    public final String MTH826(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD74;
        if(concurrentHashMap0.containsKey(s)) {
            CLS38 ﾞᐧ0 = (CLS38)concurrentHashMap0.get(s);
            if(ﾞᐧ0 != null) {
                Object object0 = ﾞᐧ0.MTH1111(arr_object);
                return object0 == null ? "" : ((String)object0);
            }
            return "";
        }
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("gs");
            if(method0 != null) {
                try {
                    return (String)method0.invoke(this.FLD72, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH827(String s, String s1, Object[] arr_object) {
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("pf3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD72, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH822(s1, arr_object);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH828(String s, CLS35 ﾞٴ$ˆٴ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            ConcurrentHashMap concurrentHashMap0 = this.FLD71;
            if(concurrentHashMap0.containsKey(s1)) {
                CLS36 ﾞٴ0 = (CLS36)concurrentHashMap0.get(s1);
                if(ﾞٴ0 != null) {
                    ﾞٴ0.MTH1106(ﾞٴ$ˆٴ0);
                }
            }
            else {
                CLS36 ﾞٴ1 = new CLS36();
                ﾞٴ1.MTH1106(ﾞٴ$ˆٴ0);
                concurrentHashMap0.put(s1, ﾞٴ1);
            }
        }
    }

    public final void MTH829(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD71;
        if(concurrentHashMap0.containsKey(s)) {
            CLS36 ﾞٴ0 = (CLS36)concurrentHashMap0.get(s);
            if(ﾞٴ0 != null) {
                ﾞٴ0.MTH1107(arr_object);
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap1 = this.FLD73;
            if(concurrentHashMap1.containsKey(s)) {
                ArrayList arrayList0 = (ArrayList)concurrentHashMap1.get(s);
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        CLS36 ﾞٴ1 = (CLS36)object0;
                        if(ﾞٴ1 != null) {
                            ﾞٴ1.MTH1107(arr_object);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH830(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD74;
        if(concurrentHashMap0.containsKey(s)) {
            CLS38 ﾞᐧ0 = (CLS38)concurrentHashMap0.get(s);
            if(ﾞᐧ0 != null) {
                Object object0 = ﾞᐧ0.MTH1111(arr_object);
                if(object0 != null) {
                    return object0 instanceof String ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue();
                }
            }
            return false;
        }
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("gb");
            if(method0 != null) {
                try {
                    return ((Boolean)method0.invoke(this.FLD72, s, arr_object)).booleanValue();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final void MTH831(String s, String s1, Object[] arr_object) {
        if(s.contains(",")) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                this.MTH831(arr_s[v].trim(), s1, arr_object);
            }
            return;
        }
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("p3");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD72, s, s1, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            this.MTH819(s1, arr_object);
        }
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH832(String s, Object[] arr_object) {
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("gd2");
            if(method0 != null) {
                ArrayList arrayList0 = new ArrayList();
                try {
                    arrayList0.addAll(((ArrayList)method0.invoke(this.FLD72, "base", s, arr_object)));
                }
                catch(Throwable unused_ex) {
                }
                arrayList0.addAll(this.MTH813(s, arr_object));
                return arrayList0;
            }
            Method method1 = this.MTH837("gd");
            if(method1 != null) {
                try {
                    return (ArrayList)method1.invoke(this.FLD72, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return this.MTH813(s, arr_object);
    }

    // 此方法包含解密的字符串
    public final void MTH833(String s, CLS37 ﾞᐧ$ˆٴ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            ConcurrentHashMap concurrentHashMap0 = this.FLD74;
            if(concurrentHashMap0.containsKey(s1)) {
                CLS38 ﾞᐧ0 = (CLS38)concurrentHashMap0.get(s1);
                if(ﾞᐧ0 != null) {
                    ArrayList arrayList0 = ﾞᐧ0.FLD151;
                    if(!arrayList0.contains(ﾞᐧ$ˆٴ0)) {
                        arrayList0.add(ﾞᐧ$ˆٴ0);
                    }
                }
            }
            else {
                CLS38 ﾞᐧ1 = new CLS38();
                ArrayList arrayList1 = ﾞᐧ1.FLD151;
                if(!arrayList1.contains(ﾞᐧ$ˆٴ0)) {
                    arrayList1.add(ﾞᐧ$ˆٴ0);
                }
                concurrentHashMap0.put(s1, ﾞᐧ1);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH834(String s, int v, Object[] arr_object) {
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("pi2");
            if(method0 != null) {
                try {
                    method0.invoke(this.FLD72, "base", s, v, arr_object);
                }
                catch(Throwable unused_ex) {
                }
                this.MTH825(s, v, arr_object);
                return;
            }
            Method method1 = this.MTH837("pi");
            if(method1 != null) {
                try {
                    method1.invoke(this.FLD72, s, v, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public final void MTH835(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD71;
        if(concurrentHashMap0.containsKey(s)) {
            CLS36 ﾞٴ0 = (CLS36)concurrentHashMap0.get(s);
            if(ﾞٴ0 != null) {
                int v = (int)(((Integer)arr_object[0]));
                for(Object object0: ﾞٴ0.FLD149) {
                    CLS35 ﾞٴ$ˆٴ0 = (CLS35)object0;
                    try {
                        arr_object[0] = v;
                        ﾞٴ$ˆٴ0.MTH1102(arr_object);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    ++v;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH836(String s, Object[] arr_object) {
        ConcurrentHashMap concurrentHashMap0 = this.FLD74;
        if(concurrentHashMap0.containsKey(s)) {
            CLS38 ﾞᐧ0 = (CLS38)concurrentHashMap0.get(s);
            return ﾞᐧ0 == null ? null : ﾞᐧ0.MTH1111(arr_object);
        }
        if(this.FLD72 != null) {
            Method method0 = this.MTH837("go");
            if(method0 != null) {
                try {
                    return method0.invoke(this.FLD72, s, arr_object);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public final Method MTH837(String s) {
        return this.FLD75.containsKey(s) ? ((Method)this.FLD75.get(s)) : null;
    }
}

