package p093S1;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p000A.C0038T0;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: S1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1294f {

    /* JADX INFO: renamed from: a */
    public final C0038T0 f4631a = new C0038T0(12);

    /* JADX INFO: renamed from: b */
    public final C1293e f4632b = new C1293e(0);

    /* JADX INFO: renamed from: c */
    public final HashMap f4633c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f4634d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f4635e;

    /* JADX INFO: renamed from: f */
    public int f4636f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1294f(int i5) {
        this.f4635e = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2382a(int i5, Class cls) {
        NavigableMap navigableMapM2387f = m2387f(cls);
        Integer num = (Integer) navigableMapM2387f.get(Integer.valueOf(i5));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM2387f.remove(Integer.valueOf(i5));
                return;
            } else {
                navigableMapM2387f.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i5 + ", this: " + this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2383b(int i5) {
        while (this.f4636f > i5) {
            Object objM30D = this.f4631a.m30D();
            AbstractC2503g.m4444b(objM30D);
            C1290b c1290bM2385d = m2385d(objM30D.getClass());
            this.f4636f -= c1290bM2385d.m2378b() * c1290bM2385d.m2377a(objM30D);
            m2382a(c1290bM2385d.m2377a(objM30D), objM30D.getClass());
            if (Log.isLoggable(c1290bM2385d.m2379c(), 2)) {
                Log.v(c1290bM2385d.m2379c(), "evicted: " + c1290bM2385d.m2377a(objM30D));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized Object m2384c(int i5, Class cls) {
        C1292d c1292d;
        int i6;
        try {
            Integer num = (Integer) m2387f(cls).ceilingKey(Integer.valueOf(i5));
            if (num == null || ((i6 = this.f4636f) != 0 && this.f4635e / i6 < 2 && num.intValue() > i5 * 8)) {
                C1293e c1293e = this.f4632b;
                InterfaceC1296h interfaceC1296hM2381f = (InterfaceC1296h) ((ArrayDeque) c1293e.f1354d).poll();
                if (interfaceC1296hM2381f == null) {
                    interfaceC1296hM2381f = c1293e.m2381f();
                }
                c1292d = (C1292d) interfaceC1296hM2381f;
                c1292d.f4628b = i5;
                c1292d.f4629c = cls;
            } else {
                C1293e c1293e2 = this.f4632b;
                int iIntValue = num.intValue();
                InterfaceC1296h interfaceC1296hM2381f2 = (InterfaceC1296h) ((ArrayDeque) c1293e2.f1354d).poll();
                if (interfaceC1296hM2381f2 == null) {
                    interfaceC1296hM2381f2 = c1293e2.m2381f();
                }
                c1292d = (C1292d) interfaceC1296hM2381f2;
                c1292d.f4628b = iIntValue;
                c1292d.f4629c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m2386e(c1292d, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C1290b m2385d(Class cls) {
        C1290b c1290b;
        HashMap map = this.f4634d;
        C1290b c1290b2 = (C1290b) map.get(cls);
        if (c1290b2 != null) {
            return c1290b2;
        }
        if (cls.equals(int[].class)) {
            c1290b = new C1290b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c1290b = new C1290b(0);
        }
        map.put(cls, c1290b);
        return c1290b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m2386e(C1292d c1292d, Class cls) {
        C1290b c1290bM2385d = m2385d(cls);
        Object objM53x = this.f4631a.m53x(c1292d);
        if (objM53x != null) {
            this.f4636f -= c1290bM2385d.m2378b() * c1290bM2385d.m2377a(objM53x);
            m2382a(c1290bM2385d.m2377a(objM53x), cls);
        }
        if (objM53x != null) {
            return objM53x;
        }
        if (Log.isLoggable(c1290bM2385d.m2379c(), 2)) {
            Log.v(c1290bM2385d.m2379c(), "Allocated " + c1292d.f4628b + " bytes");
        }
        int i5 = c1292d.f4628b;
        switch (c1290bM2385d.f4622a) {
            case 0:
                return new byte[i5];
            default:
                return new int[i5];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final NavigableMap m2387f(Class cls) {
        HashMap map = this.f4633c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m2388g(Object obj) {
        Class<?> cls = obj.getClass();
        C1290b c1290bM2385d = m2385d(cls);
        int iM2377a = c1290bM2385d.m2377a(obj);
        int iM2378b = c1290bM2385d.m2378b() * iM2377a;
        if (iM2378b <= this.f4635e / 2) {
            C1293e c1293e = this.f4632b;
            InterfaceC1296h interfaceC1296hM2381f = (InterfaceC1296h) ((ArrayDeque) c1293e.f1354d).poll();
            if (interfaceC1296hM2381f == null) {
                interfaceC1296hM2381f = c1293e.m2381f();
            }
            C1292d c1292d = (C1292d) interfaceC1296hM2381f;
            c1292d.f4628b = iM2377a;
            c1292d.f4629c = cls;
            this.f4631a.m28B(c1292d, obj);
            NavigableMap navigableMapM2387f = m2387f(cls);
            Integer num = (Integer) navigableMapM2387f.get(Integer.valueOf(c1292d.f4628b));
            Integer numValueOf = Integer.valueOf(c1292d.f4628b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM2387f.put(numValueOf, Integer.valueOf(iIntValue));
            this.f4636f += iM2378b;
            m2383b(this.f4635e);
        }
    }
}
