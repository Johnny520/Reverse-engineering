package p000;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 {

    /* JADX INFO: renamed from: a */
    public final sz0 f10681a = new sz0(20);

    /* JADX INFO: renamed from: b */
    public final sd1 f10682b = new sd1(0);

    /* JADX INFO: renamed from: c */
    public final HashMap f10683c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f10684d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f10685e;

    /* JADX INFO: renamed from: f */
    public int f10686f;

    public td1(int i) {
        this.f10685e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5165a(int i, Class cls) {
        NavigableMap navigableMapM5170f = m5170f(cls);
        Integer num = (Integer) navigableMapM5170f.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM5170f.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM5170f.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final void m5166b(int i) {
        while (this.f10686f > i) {
            Object objM5040M = this.f10681a.m5040M();
            fg1.m1641p(objM5040M);
            C0853wn c0853wnM5168d = m5168d(objM5040M.getClass());
            this.f10686f -= c0853wnM5168d.m5945b() * c0853wnM5168d.m5944a(objM5040M);
            m5165a(c0853wnM5168d.m5944a(objM5040M), objM5040M.getClass());
            if (Log.isLoggable(c0853wnM5168d.m5946c(), 2)) {
                Log.v(c0853wnM5168d.m5946c(), "evicted: " + c0853wnM5168d.m5944a(objM5040M));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Object m5167c(int i, Class cls) {
        rd1 rd1Var;
        int i2;
        try {
            Integer num = (Integer) m5170f(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f10686f) == 0 || this.f10685e / i2 >= 2 || num.intValue() <= i * 8);
            sd1 sd1Var = this.f10682b;
            if (z) {
                int iIntValue = num.intValue();
                y12 y12VarM4809k = (y12) ((ArrayDeque) sd1Var.f10161h).poll();
                if (y12VarM4809k == null) {
                    y12VarM4809k = sd1Var.m4809k();
                }
                rd1Var = (rd1) y12VarM4809k;
                rd1Var.f9519b = iIntValue;
                rd1Var.f9520c = cls;
            } else {
                y12 y12VarM4809k2 = (y12) ((ArrayDeque) sd1Var.f10161h).poll();
                if (y12VarM4809k2 == null) {
                    y12VarM4809k2 = sd1Var.m4809k();
                }
                rd1Var = (rd1) y12VarM4809k2;
                rd1Var.f9519b = i;
                rd1Var.f9520c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m5169e(rd1Var, cls);
    }

    /* JADX INFO: renamed from: d */
    public final C0853wn m5168d(Class cls) {
        C0853wn c0853wn;
        HashMap map = this.f10684d;
        C0853wn c0853wn2 = (C0853wn) map.get(cls);
        if (c0853wn2 != null) {
            return c0853wn2;
        }
        if (cls.equals(int[].class)) {
            c0853wn = new C0853wn(1);
        } else {
            if (!cls.equals(byte[].class)) {
                C0676s.m4651j("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            c0853wn = new C0853wn(0);
        }
        map.put(cls, c0853wn);
        return c0853wn;
    }

    /* JADX INFO: renamed from: e */
    public final Object m5169e(rd1 rd1Var, Class cls) {
        C0853wn c0853wnM5168d = m5168d(cls);
        Object objM5032E = this.f10681a.m5032E(rd1Var);
        if (objM5032E != null) {
            this.f10686f -= c0853wnM5168d.m5945b() * c0853wnM5168d.m5944a(objM5032E);
            m5165a(c0853wnM5168d.m5944a(objM5032E), cls);
        }
        if (objM5032E != null) {
            return objM5032E;
        }
        if (Log.isLoggable(c0853wnM5168d.m5946c(), 2)) {
            Log.v(c0853wnM5168d.m5946c(), "Allocated " + rd1Var.f9519b + " bytes");
        }
        int i = rd1Var.f9519b;
        switch (c0853wnM5168d.f12594a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: f */
    public final NavigableMap m5170f(Class cls) {
        HashMap map = this.f10683c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m5171g(Object obj) {
        Class<?> cls = obj.getClass();
        C0853wn c0853wnM5168d = m5168d(cls);
        int iM5944a = c0853wnM5168d.m5944a(obj);
        int iM5945b = c0853wnM5168d.m5945b() * iM5944a;
        if (iM5945b <= this.f10685e / 2) {
            sd1 sd1Var = this.f10682b;
            y12 y12VarM4809k = (y12) ((ArrayDeque) sd1Var.f10161h).poll();
            if (y12VarM4809k == null) {
                y12VarM4809k = sd1Var.m4809k();
            }
            rd1 rd1Var = (rd1) y12VarM4809k;
            rd1Var.f9519b = iM5944a;
            rd1Var.f9520c = cls;
            this.f10681a.m5037J(rd1Var, obj);
            NavigableMap navigableMapM5170f = m5170f(cls);
            Integer num = (Integer) navigableMapM5170f.get(Integer.valueOf(rd1Var.f9519b));
            Integer numValueOf = Integer.valueOf(rd1Var.f9519b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM5170f.put(numValueOf, Integer.valueOf(iIntValue));
            this.f10686f += iM5945b;
            m5166b(this.f10685e);
        }
    }
}
