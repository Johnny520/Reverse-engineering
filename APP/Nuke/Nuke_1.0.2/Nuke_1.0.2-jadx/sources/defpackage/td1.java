package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 {
    public final sz0 a = new sz0(20);
    public final sd1 b = new sd1(0);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public td1(int i) {
        this.e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, Class cls) {
        NavigableMap navigableMapF = f(cls);
        Integer num = (Integer) navigableMapF.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapF.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapF.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        while (this.f > i) {
            Object objM = this.a.M();
            fg1.p(objM);
            wn wnVarD = d(objM.getClass());
            this.f -= wnVarD.b() * wnVarD.a(objM);
            a(wnVarD.a(objM), objM.getClass());
            if (Log.isLoggable(wnVarD.c(), 2)) {
                Log.v(wnVarD.c(), "evicted: " + wnVarD.a(objM));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Object c(int i, Class cls) {
        rd1 rd1Var;
        int i2;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f) == 0 || this.e / i2 >= 2 || num.intValue() <= i * 8);
            sd1 sd1Var = this.b;
            if (z) {
                int iIntValue = num.intValue();
                y12 y12VarK = (y12) ((ArrayDeque) sd1Var.h).poll();
                if (y12VarK == null) {
                    y12VarK = sd1Var.k();
                }
                rd1Var = (rd1) y12VarK;
                rd1Var.b = iIntValue;
                rd1Var.c = cls;
            } else {
                y12 y12VarK2 = (y12) ((ArrayDeque) sd1Var.h).poll();
                if (y12VarK2 == null) {
                    y12VarK2 = sd1Var.k();
                }
                rd1Var = (rd1) y12VarK2;
                rd1Var.b = i;
                rd1Var.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(rd1Var, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wn d(Class cls) {
        wn wnVar;
        HashMap map = this.d;
        wn wnVar2 = (wn) map.get(cls);
        if (wnVar2 != null) {
            return wnVar2;
        }
        if (cls.equals(int[].class)) {
            wnVar = new wn(1);
        } else {
            if (!cls.equals(byte[].class)) {
                s.j("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            wnVar = new wn(0);
        }
        map.put(cls, wnVar);
        return wnVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e(rd1 rd1Var, Class cls) {
        wn wnVarD = d(cls);
        Object objE = this.a.E(rd1Var);
        if (objE != null) {
            this.f -= wnVarD.b() * wnVarD.a(objE);
            a(wnVarD.a(objE), cls);
        }
        if (objE != null) {
            return objE;
        }
        if (Log.isLoggable(wnVarD.c(), 2)) {
            Log.v(wnVarD.c(), "Allocated " + rd1Var.b + " bytes");
        }
        int i = rd1Var.b;
        switch (wnVarD.a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NavigableMap f(Class cls) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        wn wnVarD = d(cls);
        int iA = wnVarD.a(obj);
        int iB = wnVarD.b() * iA;
        if (iB <= this.e / 2) {
            sd1 sd1Var = this.b;
            y12 y12VarK = (y12) ((ArrayDeque) sd1Var.h).poll();
            if (y12VarK == null) {
                y12VarK = sd1Var.k();
            }
            rd1 rd1Var = (rd1) y12VarK;
            rd1Var.b = iA;
            rd1Var.c = cls;
            this.a.J(rd1Var, obj);
            NavigableMap navigableMapF = f(cls);
            Integer num = (Integer) navigableMapF.get(Integer.valueOf(rd1Var.b));
            Integer numValueOf = Integer.valueOf(rd1Var.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapF.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            b(this.e);
        }
    }
}
