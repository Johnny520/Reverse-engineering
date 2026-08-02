package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w40 implements g40, Runnable, Comparable, th0 {
    public static final mv1 O = new mv1("glide_thread_priority_override", null, mv1.e);
    public n4 A;
    public Supplier B;
    public Thread C;
    public a51 D;
    public a51 E;
    public Object F;
    public f40 G;
    public volatile h40 H;
    public volatile boolean I;
    public volatile boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public final af0 k;
    public final a22 l;
    public vp0 o;
    public a51 p;
    public i32 q;
    public gf0 r;
    public int s;
    public int t;
    public b90 u;
    public ov1 v;
    public ff0 w;
    public int x;
    public long y;
    public Object z;
    public final t40 h = new t40();
    public final ArrayList i = new ArrayList();
    public final su2 j = new su2();
    public final b5 m = new b5(6);
    public final v40 n = new v40();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w40(af0 af0Var, b5 b5Var) {
        this.k = af0Var;
        this.l = b5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g40
    public final void a(a51 a51Var, Object obj, f40 f40Var, int i, a51 a51Var2) {
        this.D = a51Var;
        this.F = obj;
        this.G = f40Var;
        this.N = i;
        this.E = a51Var2;
        this.K = a51Var != this.h.a().get(0);
        if (Thread.currentThread() == this.C) {
            f();
            return;
        }
        this.M = 3;
        ff0 ff0Var = this.w;
        (ff0Var.t ? ff0Var.p : ff0Var.o).execute(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g40
    public final void b(a51 a51Var, Exception exc, f40 f40Var, int i) {
        f40Var.b();
        xp0 xp0Var = new xp0("Fetching data failed", Collections.singletonList(exc));
        Class clsA = f40Var.a();
        xp0Var.i = a51Var;
        xp0Var.j = i;
        xp0Var.k = clsA;
        this.i.add(xp0Var);
        if (Thread.currentThread() == this.C) {
            m();
            return;
        }
        this.M = 2;
        ff0 ff0Var = this.w;
        (ff0Var.t ? ff0Var.p : ff0Var.o).execute(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th0
    public final su2 c() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w40 w40Var = (w40) obj;
        int iCompareTo = this.q.compareTo(w40Var.q);
        return iCompareTo == 0 ? this.x - w40Var.x : iCompareTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d92 d(f40 f40Var, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i2 = tc1.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            d92 d92VarE = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + d92VarE, jElapsedRealtimeNanos, null);
            }
            return d92VarE;
        } finally {
            f40Var.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d92 e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        t40 t40Var = this.h;
        wb1 wb1VarC = t40Var.c(cls);
        ov1 ov1Var = this.v;
        boolean z = i == 4 || t40Var.r;
        mv1 mv1Var = xa0.i;
        Boolean bool = (Boolean) ov1Var.c(mv1Var);
        if (bool == null || (bool.booleanValue() && !z)) {
            ov1Var = new ov1();
            ro roVar = this.v.b;
            ro roVar2 = ov1Var.b;
            roVar2.g(roVar);
            roVar2.put(mv1Var, Boolean.valueOf(z));
        }
        ov1 ov1Var2 = ov1Var;
        k40 k40VarG = this.o.a().g(obj);
        try {
            return wb1VarC.a(this.s, this.t, new dk(i, 4, this), k40VarG, ov1Var2);
        } finally {
            k40VarG.b();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void f() {
        d92 d92VarD;
        boolean zA;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", this.y, "data: " + this.F + ", cache key: " + this.D + ", fetcher: " + this.G);
        }
        sc1 sc1Var = null;
        if (((Map) this.A.i).containsKey(eu.class) && (supplier = this.B) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.B.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.B = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            d92VarD = d(this.G, this.F, this.N);
        } catch (xp0 e2) {
            a51 a51Var = this.E;
            int i = this.N;
            e2.i = a51Var;
            e2.j = i;
            e2.k = null;
            this.i.add(e2);
            d92VarD = null;
        }
        if (d92VarD == null) {
            m();
            return;
        }
        int i2 = this.N;
        if (d92VarD instanceof fz0) {
            ((fz0) d92VarD).a();
        }
        int i3 = 1;
        if (((sc1) this.m.k) != null) {
            sc1Var = (sc1) sc1.l.c();
            sc1Var.k = false;
            sc1Var.j = true;
            sc1Var.i = d92VarD;
            d92VarD = sc1Var;
        }
        if (((Map) this.A.i).containsKey(eu.class)) {
            l();
        }
        o();
        ff0 ff0Var = this.w;
        synchronized (ff0Var) {
            ff0Var.u = d92VarD;
            ff0Var.v = i2;
        }
        synchronized (ff0Var) {
            try {
                ff0Var.i.a();
                if (ff0Var.B) {
                    ff0Var.u.e();
                    ff0Var.f();
                } else {
                    if (ff0Var.h.h.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (ff0Var.w) {
                        throw new IllegalStateException("Already have resource");
                    }
                    z8 z8Var = ff0Var.l;
                    d92 d92Var = ff0Var.u;
                    boolean z = ff0Var.s;
                    gf0 gf0Var = ff0Var.r;
                    bf0 bf0Var = ff0Var.j;
                    z8Var.getClass();
                    ff0Var.z = new hf0(d92Var, z, true, gf0Var, bf0Var);
                    ff0Var.w = true;
                    ef0 ef0Var = ff0Var.h;
                    ef0Var.getClass();
                    ArrayList<df0> arrayList = new ArrayList(ef0Var.h);
                    ff0Var.d(arrayList.size() + 1);
                    ff0Var.m.e(ff0Var, ff0Var.r, ff0Var.z);
                    for (df0 df0Var : arrayList) {
                        df0Var.b.execute(new cf0(ff0Var, df0Var.a, i3));
                    }
                    ff0Var.b();
                }
            } finally {
            }
        }
        int i4 = 5;
        this.L = 5;
        try {
            b5 b5Var = this.m;
            if (((sc1) b5Var.k) != null) {
                try {
                    this.k.a().j((a51) b5Var.i, new b5((j92) b5Var.j, (sc1) b5Var.k, this.v, i4));
                    ((sc1) b5Var.k).a();
                } catch (Throwable th) {
                    ((sc1) b5Var.k).a();
                    throw th;
                }
            }
            if (sc1Var != null) {
                sc1Var.a();
            }
            v40 v40Var = this.n;
            synchronized (v40Var) {
                v40Var.b = true;
                zA = v40Var.a();
            }
            if (zA) {
                k();
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h40 g() {
        int iU = vi0.u(this.L);
        t40 t40Var = this.h;
        if (iU == 1) {
            return new e92(t40Var, this);
        }
        if (iU == 2) {
            return new c40(t40Var.a(), t40Var, this);
        }
        if (iU == 3) {
            return new it2(t40Var, this);
        }
        if (iU == 5) {
            return null;
        }
        s.l("Unrecognized stage: ".concat(vi0.w(this.L)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h(int i) {
        int iU = vi0.u(i);
        boolean z = false;
        if (iU == 0) {
            switch (this.u.a) {
                case 0:
                case 1:
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return h(2);
        }
        if (iU != 1) {
            if (iU == 2) {
                return 4;
            }
            if (iU == 3 || iU == 5) {
                return 6;
            }
            s.j("Unrecognized stage: ".concat(vi0.w(i)));
            return 0;
        }
        switch (this.u.a) {
            case 0:
                break;
            case 1:
            default:
                z = true;
                break;
        }
        if (z) {
            return 3;
        }
        return h(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(tc1.a(j));
        sb.append(", load key: ");
        sb.append(this.r);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        boolean zA;
        if (((Map) this.A.i).containsKey(eu.class)) {
            l();
        }
        o();
        xp0 xp0Var = new xp0("Failed to load resource", new ArrayList(this.i));
        ff0 ff0Var = this.w;
        synchronized (ff0Var) {
            ff0Var.x = xp0Var;
        }
        synchronized (ff0Var) {
            try {
                ff0Var.i.a();
                if (ff0Var.B) {
                    ff0Var.f();
                } else {
                    if (ff0Var.h.h.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (ff0Var.y) {
                        throw new IllegalStateException("Already failed once");
                    }
                    ff0Var.y = true;
                    gf0 gf0Var = ff0Var.r;
                    ef0 ef0Var = ff0Var.h;
                    ef0Var.getClass();
                    ArrayList<df0> arrayList = new ArrayList(ef0Var.h);
                    ff0Var.d(arrayList.size() + 1);
                    ff0Var.m.e(ff0Var, gf0Var, null);
                    for (df0 df0Var : arrayList) {
                        df0Var.b.execute(new cf0(ff0Var, df0Var.a, 0));
                    }
                    ff0Var.b();
                }
            } finally {
            }
        }
        v40 v40Var = this.n;
        synchronized (v40Var) {
            v40Var.c = true;
            zA = v40Var.a();
        }
        if (zA) {
            k();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        v40 v40Var = this.n;
        synchronized (v40Var) {
            v40Var.b = false;
            v40Var.a = false;
            v40Var.c = false;
        }
        b5 b5Var = this.m;
        b5Var.i = null;
        b5Var.j = null;
        b5Var.k = null;
        t40 t40Var = this.h;
        t40Var.c = null;
        t40Var.d = null;
        t40Var.n = null;
        t40Var.g = null;
        t40Var.k = null;
        t40Var.i = null;
        t40Var.o = null;
        t40Var.j = null;
        t40Var.p = null;
        t40Var.a.clear();
        t40Var.l = false;
        t40Var.b.clear();
        t40Var.m = false;
        this.I = false;
        this.o = null;
        this.p = null;
        this.v = null;
        this.q = null;
        this.r = null;
        this.w = null;
        this.L = 0;
        this.H = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.N = 0;
        this.G = null;
        this.y = 0L;
        this.J = false;
        this.z = null;
        this.i.clear();
        this.l.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        if (!((Map) this.A.i).containsKey(eu.class)) {
            s.l("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.B;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.B = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        this.C = Thread.currentThread();
        int i = tc1.b;
        this.y = SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.J && this.H != null && !(zC = this.H.c())) {
            this.L = h(this.L);
            this.H = g();
            if (this.L == 4) {
                this.M = 2;
                ff0 ff0Var = this.w;
                (ff0Var.t ? ff0Var.p : ff0Var.o).execute(this);
                return;
            }
        }
        if ((this.L == 6 || this.J) && !zC) {
            j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        int iU = vi0.u(this.M);
        if (iU == 0) {
            this.L = h(1);
            this.H = g();
            m();
        } else if (iU == 1) {
            m();
        } else if (iU == 2) {
            f();
        } else {
            int i = this.M;
            s.l("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        Throwable th;
        this.j.a();
        if (!this.I) {
            this.I = true;
            return;
        }
        if (this.i.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.i;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() {
        f40 f40Var = this.G;
        try {
            try {
                if (this.J) {
                    j();
                    if (f40Var != null) {
                        f40Var.b();
                        return;
                    }
                    return;
                }
                n();
                if (f40Var != null) {
                    f40Var.b();
                }
            } catch (Throwable th) {
                if (f40Var != null) {
                    f40Var.b();
                }
                throw th;
            }
        } catch (ep e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.J + ", stage: " + vi0.w(this.L), th2);
            }
            if (this.L != 5) {
                this.i.add(th2);
                j();
            }
            if (!this.J) {
                throw th2;
            }
            throw th2;
        }
    }
}
