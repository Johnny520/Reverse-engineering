package p000;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: zp */
/* JADX INFO: loaded from: classes.dex */
public final class C2812zp {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f9526a = new C0649P3(21);

    /* JADX INFO: renamed from: b */
    public final C2769yp f9527b = new C2769yp(0);

    /* JADX INFO: renamed from: c */
    public final HashMap f9528c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f9529d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f9530e;

    /* JADX INFO: renamed from: f */
    public int f9531f;

    public C2812zp(int i) {
        this.f9530e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5439a(int i, Class cls) {
        NavigableMap navigableMapM5444f = m5444f(cls);
        Integer num = (Integer) navigableMapM5444f.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM5444f.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM5444f.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final void m5440b(int i) {
        String str;
        while (this.f9531f > i) {
            Object objM1287R = this.f9526a.m1287R();
            AbstractC0714Qj.m1487i(objM1287R);
            C1352e6 c1352e6M5442d = m5442d(objM1287R.getClass());
            this.f9531f -= c1352e6M5442d.m2622b() * c1352e6M5442d.m2621a(objM1287R);
            m5439a(c1352e6M5442d.m2621a(objM1287R), objM1287R.getClass());
            switch (c1352e6M5442d.f4855a) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                c1352e6M5442d.m2621a(objM1287R);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Object m5441c(int i, Class cls) {
        C2726xp c2726xp;
        int i2;
        try {
            Integer num = (Integer) m5444f(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f9531f) != 0 && this.f9530e / i2 < 2 && num.intValue() > i * 8)) {
                C2769yp c2769yp = this.f9527b;
                InterfaceC0938Vt interfaceC0938VtM5340g = (InterfaceC0938Vt) ((ArrayDeque) c2769yp.f9067a).poll();
                if (interfaceC0938VtM5340g == null) {
                    interfaceC0938VtM5340g = c2769yp.m5340g();
                }
                c2726xp = (C2726xp) interfaceC0938VtM5340g;
                c2726xp.f9312b = i;
                c2726xp.f9313c = cls;
            } else {
                C2769yp c2769yp2 = this.f9527b;
                int iIntValue = num.intValue();
                InterfaceC0938Vt interfaceC0938VtM5340g2 = (InterfaceC0938Vt) ((ArrayDeque) c2769yp2.f9067a).poll();
                if (interfaceC0938VtM5340g2 == null) {
                    interfaceC0938VtM5340g2 = c2769yp2.m5340g();
                }
                c2726xp = (C2726xp) interfaceC0938VtM5340g2;
                c2726xp.f9312b = iIntValue;
                c2726xp.f9313c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m5443e(c2726xp, cls);
    }

    /* JADX INFO: renamed from: d */
    public final C1352e6 m5442d(Class cls) {
        C1352e6 c1352e6;
        HashMap map = this.f9529d;
        C1352e6 c1352e62 = (C1352e6) map.get(cls);
        if (c1352e62 != null) {
            return c1352e62;
        }
        if (cls.equals(int[].class)) {
            c1352e6 = new C1352e6(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c1352e6 = new C1352e6(0);
        }
        map.put(cls, c1352e6);
        return c1352e6;
    }

    /* JADX INFO: renamed from: e */
    public final Object m5443e(C2726xp c2726xp, Class cls) {
        C1352e6 c1352e6M5442d = m5442d(cls);
        Object objM1272B = this.f9526a.m1272B(c2726xp);
        if (objM1272B != null) {
            this.f9531f -= c1352e6M5442d.m2622b() * c1352e6M5442d.m2621a(objM1272B);
            m5439a(c1352e6M5442d.m2621a(objM1272B), cls);
        }
        if (objM1272B != null) {
            return objM1272B;
        }
        int i = c2726xp.f9312b;
        switch (c1352e6M5442d.f4855a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: f */
    public final NavigableMap m5444f(Class cls) {
        HashMap map = this.f9528c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m5445g(Object obj) {
        Class<?> cls = obj.getClass();
        C1352e6 c1352e6M5442d = m5442d(cls);
        int iM2621a = c1352e6M5442d.m2621a(obj);
        int iM2622b = c1352e6M5442d.m2622b() * iM2621a;
        if (iM2622b <= this.f9530e / 2) {
            C2769yp c2769yp = this.f9527b;
            InterfaceC0938Vt interfaceC0938VtM5340g = (InterfaceC0938Vt) ((ArrayDeque) c2769yp.f9067a).poll();
            if (interfaceC0938VtM5340g == null) {
                interfaceC0938VtM5340g = c2769yp.m5340g();
            }
            C2726xp c2726xp = (C2726xp) interfaceC0938VtM5340g;
            c2726xp.f9312b = iM2621a;
            c2726xp.f9313c = cls;
            this.f9526a.m1283N(c2726xp, obj);
            NavigableMap navigableMapM5444f = m5444f(cls);
            Integer num = (Integer) navigableMapM5444f.get(Integer.valueOf(c2726xp.f9312b));
            Integer numValueOf = Integer.valueOf(c2726xp.f9312b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM5444f.put(numValueOf, Integer.valueOf(iIntValue));
            this.f9531f += iM2622b;
            m5440b(this.f9530e);
        }
    }
}
