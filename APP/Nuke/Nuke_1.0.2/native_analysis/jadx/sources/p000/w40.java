package p000;

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

    /* JADX INFO: renamed from: O */
    public static final mv1 f12313O = new mv1("glide_thread_priority_override", null, mv1.f6895e);

    /* JADX INFO: renamed from: A */
    public C0485n4 f12314A;

    /* JADX INFO: renamed from: B */
    public Supplier f12315B;

    /* JADX INFO: renamed from: C */
    public Thread f12316C;

    /* JADX INFO: renamed from: D */
    public a51 f12317D;

    /* JADX INFO: renamed from: E */
    public a51 f12318E;

    /* JADX INFO: renamed from: F */
    public Object f12319F;

    /* JADX INFO: renamed from: G */
    public f40 f12320G;

    /* JADX INFO: renamed from: H */
    public volatile h40 f12321H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f12322I;

    /* JADX INFO: renamed from: J */
    public volatile boolean f12323J;

    /* JADX INFO: renamed from: K */
    public boolean f12324K;

    /* JADX INFO: renamed from: L */
    public int f12325L;

    /* JADX INFO: renamed from: M */
    public int f12326M;

    /* JADX INFO: renamed from: N */
    public int f12327N;

    /* JADX INFO: renamed from: k */
    public final af0 f12331k;

    /* JADX INFO: renamed from: l */
    public final a22 f12332l;

    /* JADX INFO: renamed from: o */
    public vp0 f12335o;

    /* JADX INFO: renamed from: p */
    public a51 f12336p;

    /* JADX INFO: renamed from: q */
    public i32 f12337q;

    /* JADX INFO: renamed from: r */
    public gf0 f12338r;

    /* JADX INFO: renamed from: s */
    public int f12339s;

    /* JADX INFO: renamed from: t */
    public int f12340t;

    /* JADX INFO: renamed from: u */
    public b90 f12341u;

    /* JADX INFO: renamed from: v */
    public ov1 f12342v;

    /* JADX INFO: renamed from: w */
    public ff0 f12343w;

    /* JADX INFO: renamed from: x */
    public int f12344x;

    /* JADX INFO: renamed from: y */
    public long f12345y;

    /* JADX INFO: renamed from: z */
    public Object f12346z;

    /* JADX INFO: renamed from: h */
    public final t40 f12328h = new t40();

    /* JADX INFO: renamed from: i */
    public final ArrayList f12329i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final su2 f12330j = new su2();

    /* JADX INFO: renamed from: m */
    public final C0043b5 f12333m = new C0043b5(6);

    /* JADX INFO: renamed from: n */
    public final v40 f12334n = new v40();

    public w40(af0 af0Var, C0043b5 c0043b5) {
        this.f12331k = af0Var;
        this.f12332l = c0043b5;
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: a */
    public final void mo1801a(a51 a51Var, Object obj, f40 f40Var, int i, a51 a51Var2) {
        this.f12317D = a51Var;
        this.f12319F = obj;
        this.f12320G = f40Var;
        this.f12327N = i;
        this.f12318E = a51Var2;
        this.f12324K = a51Var != this.f12328h.m5116a().get(0);
        if (Thread.currentThread() == this.f12316C) {
            m5839f();
            return;
        }
        this.f12326M = 3;
        ff0 ff0Var = this.f12343w;
        (ff0Var.f2943t ? ff0Var.f2939p : ff0Var.f2938o).execute(this);
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: b */
    public final void mo1802b(a51 a51Var, Exception exc, f40 f40Var, int i) {
        f40Var.mo1372b();
        xp0 xp0Var = new xp0("Fetching data failed", Collections.singletonList(exc));
        Class clsMo1371a = f40Var.mo1371a();
        xp0Var.f13100i = a51Var;
        xp0Var.f13101j = i;
        xp0Var.f13102k = clsMo1371a;
        this.f12329i.add(xp0Var);
        if (Thread.currentThread() == this.f12316C) {
            m5846m();
            return;
        }
        this.f12326M = 2;
        ff0 ff0Var = this.f12343w;
        (ff0Var.f2943t ? ff0Var.f2939p : ff0Var.f2938o).execute(this);
    }

    @Override // p000.th0
    /* JADX INFO: renamed from: c */
    public final su2 mo1602c() {
        return this.f12330j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w40 w40Var = (w40) obj;
        int iCompareTo = this.f12337q.compareTo(w40Var.f12337q);
        return iCompareTo == 0 ? this.f12344x - w40Var.f12344x : iCompareTo;
    }

    /* JADX INFO: renamed from: d */
    public final d92 m5837d(f40 f40Var, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i2 = tc1.f10678b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            d92 d92VarM5838e = m5838e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m5842i("Decoded result " + d92VarM5838e, jElapsedRealtimeNanos, null);
            }
            return d92VarM5838e;
        } finally {
            f40Var.mo1372b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final d92 m5838e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        t40 t40Var = this.f12328h;
        wb1 wb1VarM5118c = t40Var.m5118c(cls);
        ov1 ov1Var = this.f12342v;
        boolean z = i == 4 || t40Var.f10554r;
        mv1 mv1Var = xa0.f12921i;
        Boolean bool = (Boolean) ov1Var.m3643c(mv1Var);
        if (bool == null || (bool.booleanValue() && !z)) {
            ov1Var = new ov1();
            C0663ro c0663ro = this.f12342v.f7858b;
            C0663ro c0663ro2 = ov1Var.f7858b;
            c0663ro2.mo4513g(c0663ro);
            c0663ro2.put(mv1Var, Boolean.valueOf(z));
        }
        ov1 ov1Var2 = ov1Var;
        k40 k40VarM5647g = this.f12335o.m5748a().m5647g(obj);
        try {
            return wb1VarM5118c.m5864a(this.f12339s, this.f12340t, new C0133dk(i, 4, this), k40VarM5647g, ov1Var2);
        } finally {
            k40VarM5647g.mo872b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5839f() {
        d92 d92VarM5837d;
        boolean zM5621a;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m5842i("Retrieved data", this.f12345y, "data: " + this.f12319F + ", cache key: " + this.f12317D + ", fetcher: " + this.f12320G);
        }
        sc1 sc1Var = null;
        if (((Map) this.f12314A.f6983i).containsKey(AbstractC0179eu.class) && (supplier = this.f12315B) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f12315B.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f12315B = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            d92VarM5837d = m5837d(this.f12320G, this.f12319F, this.f12327N);
        } catch (xp0 e2) {
            a51 a51Var = this.f12318E;
            int i = this.f12327N;
            e2.f13100i = a51Var;
            e2.f13101j = i;
            e2.f13102k = null;
            this.f12329i.add(e2);
            d92VarM5837d = null;
        }
        if (d92VarM5837d == null) {
            m5846m();
            return;
        }
        int i2 = this.f12327N;
        if (d92VarM5837d instanceof fz0) {
            ((fz0) d92VarM5837d).mo189a();
        }
        int i3 = 1;
        if (((sc1) this.f12333m.f564k) != null) {
            sc1Var = (sc1) sc1.f10033l.mo19c();
            sc1Var.f10037k = false;
            sc1Var.f10036j = true;
            sc1Var.f10035i = d92VarM5837d;
            d92VarM5837d = sc1Var;
        }
        if (((Map) this.f12314A.f6983i).containsKey(AbstractC0179eu.class)) {
            m5845l();
        }
        m5848o();
        ff0 ff0Var = this.f12343w;
        synchronized (ff0Var) {
            ff0Var.f2944u = d92VarM5837d;
            ff0Var.f2945v = i2;
        }
        synchronized (ff0Var) {
            try {
                ff0Var.f2932i.m5003a();
                if (ff0Var.f2930B) {
                    ff0Var.f2944u.mo192e();
                    ff0Var.m1605f();
                } else {
                    if (ff0Var.f2931h.f2422h.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (ff0Var.f2946w) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C0953z8 c0953z8 = ff0Var.f2935l;
                    d92 d92Var = ff0Var.f2944u;
                    boolean z = ff0Var.f2942s;
                    gf0 gf0Var = ff0Var.f2941r;
                    bf0 bf0Var = ff0Var.f2933j;
                    c0953z8.getClass();
                    ff0Var.f2949z = new hf0(d92Var, z, true, gf0Var, bf0Var);
                    ff0Var.f2946w = true;
                    ef0 ef0Var = ff0Var.f2931h;
                    ef0Var.getClass();
                    ArrayList<df0> arrayList = new ArrayList(ef0Var.f2422h);
                    ff0Var.m1603d(arrayList.size() + 1);
                    ff0Var.f2936m.m526e(ff0Var, ff0Var.f2941r, ff0Var.f2949z);
                    for (df0 df0Var : arrayList) {
                        df0Var.f2016b.execute(new cf0(ff0Var, df0Var.f2015a, i3));
                    }
                    ff0Var.m1601b();
                }
            } finally {
            }
        }
        int i4 = 5;
        this.f12325L = 5;
        try {
            C0043b5 c0043b5 = this.f12333m;
            if (((sc1) c0043b5.f564k) != null) {
                try {
                    this.f12331k.m145a().mo113j((a51) c0043b5.f562i, new C0043b5((j92) c0043b5.f563j, (sc1) c0043b5.f564k, this.f12342v, i4));
                    ((sc1) c0043b5.f564k).m4792a();
                } catch (Throwable th) {
                    ((sc1) c0043b5.f564k).m4792a();
                    throw th;
                }
            }
            if (sc1Var != null) {
                sc1Var.m4792a();
            }
            v40 v40Var = this.f12334n;
            synchronized (v40Var) {
                v40Var.f11677b = true;
                zM5621a = v40Var.m5621a();
            }
            if (zM5621a) {
                m5844k();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: g */
    public final h40 m5840g() {
        int iM5702u = vi0.m5702u(this.f12325L);
        t40 t40Var = this.f12328h;
        if (iM5702u == 1) {
            return new e92(t40Var, this);
        }
        if (iM5702u == 2) {
            return new c40(t40Var.m5116a(), t40Var, this);
        }
        if (iM5702u == 3) {
            return new it2(t40Var, this);
        }
        if (iM5702u == 5) {
            return null;
        }
        C0676s.m4653l("Unrecognized stage: ".concat(vi0.m5704w(this.f12325L)));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final int m5841h(int i) {
        int iM5702u = vi0.m5702u(i);
        boolean z = false;
        if (iM5702u == 0) {
            switch (this.f12341u.f745a) {
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
            return m5841h(2);
        }
        if (iM5702u != 1) {
            if (iM5702u == 2) {
                return 4;
            }
            if (iM5702u == 3 || iM5702u == 5) {
                return 6;
            }
            C0676s.m4651j("Unrecognized stage: ".concat(vi0.m5704w(i)));
            return 0;
        }
        switch (this.f12341u.f745a) {
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
        return m5841h(3);
    }

    /* JADX INFO: renamed from: i */
    public final void m5842i(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(tc1.m5161a(j));
        sb.append(", load key: ");
        sb.append(this.f12338r);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public final void m5843j() {
        boolean zM5621a;
        if (((Map) this.f12314A.f6983i).containsKey(AbstractC0179eu.class)) {
            m5845l();
        }
        m5848o();
        xp0 xp0Var = new xp0("Failed to load resource", new ArrayList(this.f12329i));
        ff0 ff0Var = this.f12343w;
        synchronized (ff0Var) {
            ff0Var.f2947x = xp0Var;
        }
        synchronized (ff0Var) {
            try {
                ff0Var.f2932i.m5003a();
                if (ff0Var.f2930B) {
                    ff0Var.m1605f();
                } else {
                    if (ff0Var.f2931h.f2422h.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (ff0Var.f2948y) {
                        throw new IllegalStateException("Already failed once");
                    }
                    ff0Var.f2948y = true;
                    gf0 gf0Var = ff0Var.f2941r;
                    ef0 ef0Var = ff0Var.f2931h;
                    ef0Var.getClass();
                    ArrayList<df0> arrayList = new ArrayList(ef0Var.f2422h);
                    ff0Var.m1603d(arrayList.size() + 1);
                    ff0Var.f2936m.m526e(ff0Var, gf0Var, null);
                    for (df0 df0Var : arrayList) {
                        df0Var.f2016b.execute(new cf0(ff0Var, df0Var.f2015a, 0));
                    }
                    ff0Var.m1601b();
                }
            } finally {
            }
        }
        v40 v40Var = this.f12334n;
        synchronized (v40Var) {
            v40Var.f11678c = true;
            zM5621a = v40Var.m5621a();
        }
        if (zM5621a) {
            m5844k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5844k() {
        v40 v40Var = this.f12334n;
        synchronized (v40Var) {
            v40Var.f11677b = false;
            v40Var.f11676a = false;
            v40Var.f11678c = false;
        }
        C0043b5 c0043b5 = this.f12333m;
        c0043b5.f562i = null;
        c0043b5.f563j = null;
        c0043b5.f564k = null;
        t40 t40Var = this.f12328h;
        t40Var.f10539c = null;
        t40Var.f10540d = null;
        t40Var.f10550n = null;
        t40Var.f10543g = null;
        t40Var.f10547k = null;
        t40Var.f10545i = null;
        t40Var.f10551o = null;
        t40Var.f10546j = null;
        t40Var.f10552p = null;
        t40Var.f10537a.clear();
        t40Var.f10548l = false;
        t40Var.f10538b.clear();
        t40Var.f10549m = false;
        this.f12322I = false;
        this.f12335o = null;
        this.f12336p = null;
        this.f12342v = null;
        this.f12337q = null;
        this.f12338r = null;
        this.f12343w = null;
        this.f12325L = 0;
        this.f12321H = null;
        this.f12316C = null;
        this.f12317D = null;
        this.f12319F = null;
        this.f12327N = 0;
        this.f12320G = null;
        this.f12345y = 0L;
        this.f12323J = false;
        this.f12346z = null;
        this.f12329i.clear();
        this.f12332l.mo18a(this);
    }

    /* JADX INFO: renamed from: l */
    public final void m5845l() {
        if (!((Map) this.f12314A.f6983i).containsKey(AbstractC0179eu.class)) {
            C0676s.m4653l("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.f12315B;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f12315B = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5846m() {
        this.f12316C = Thread.currentThread();
        int i = tc1.f10678b;
        this.f12345y = SystemClock.elapsedRealtimeNanos();
        boolean zMo634c = false;
        while (!this.f12323J && this.f12321H != null && !(zMo634c = this.f12321H.mo634c())) {
            this.f12325L = m5841h(this.f12325L);
            this.f12321H = m5840g();
            if (this.f12325L == 4) {
                this.f12326M = 2;
                ff0 ff0Var = this.f12343w;
                (ff0Var.f2943t ? ff0Var.f2939p : ff0Var.f2938o).execute(this);
                return;
            }
        }
        if ((this.f12325L == 6 || this.f12323J) && !zMo634c) {
            m5843j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5847n() {
        int iM5702u = vi0.m5702u(this.f12326M);
        if (iM5702u == 0) {
            this.f12325L = m5841h(1);
            this.f12321H = m5840g();
            m5846m();
        } else if (iM5702u == 1) {
            m5846m();
        } else if (iM5702u == 2) {
            m5839f();
        } else {
            int i = this.f12326M;
            C0676s.m4653l("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5848o() {
        Throwable th;
        this.f12330j.m5003a();
        if (!this.f12322I) {
            this.f12322I = true;
            return;
        }
        if (this.f12329i.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f12329i;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f40 f40Var = this.f12320G;
        try {
            try {
                if (this.f12323J) {
                    m5843j();
                    if (f40Var != null) {
                        f40Var.mo1372b();
                        return;
                    }
                    return;
                }
                m5847n();
                if (f40Var != null) {
                    f40Var.mo1372b();
                }
            } catch (Throwable th) {
                if (f40Var != null) {
                    f40Var.mo1372b();
                }
                throw th;
            }
        } catch (C0174ep e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f12323J + ", stage: " + vi0.m5704w(this.f12325L), th2);
            }
            if (this.f12325L != 5) {
                this.f12329i.add(th2);
                m5843j();
            }
            if (!this.f12323J) {
                throw th2;
            }
            throw th2;
        }
    }
}
