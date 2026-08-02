package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 implements th0 {

    /* JADX INFO: renamed from: C */
    public static final C0953z8 f2928C = new C0953z8(19);

    /* JADX INFO: renamed from: A */
    public w40 f2929A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f2930B;

    /* JADX INFO: renamed from: j */
    public final bf0 f2933j;

    /* JADX INFO: renamed from: k */
    public final a22 f2934k;

    /* JADX INFO: renamed from: m */
    public final bf0 f2936m;

    /* JADX INFO: renamed from: n */
    public final aq0 f2937n;

    /* JADX INFO: renamed from: o */
    public final aq0 f2938o;

    /* JADX INFO: renamed from: p */
    public final aq0 f2939p;

    /* JADX INFO: renamed from: r */
    public gf0 f2941r;

    /* JADX INFO: renamed from: s */
    public boolean f2942s;

    /* JADX INFO: renamed from: t */
    public boolean f2943t;

    /* JADX INFO: renamed from: u */
    public d92 f2944u;

    /* JADX INFO: renamed from: v */
    public int f2945v;

    /* JADX INFO: renamed from: w */
    public boolean f2946w;

    /* JADX INFO: renamed from: x */
    public xp0 f2947x;

    /* JADX INFO: renamed from: y */
    public boolean f2948y;

    /* JADX INFO: renamed from: z */
    public hf0 f2949z;

    /* JADX INFO: renamed from: h */
    public final ef0 f2931h = new ef0(new ArrayList(2));

    /* JADX INFO: renamed from: i */
    public final su2 f2932i = new su2();

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f2940q = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    public final C0953z8 f2935l = f2928C;

    public ff0(aq0 aq0Var, aq0 aq0Var2, aq0 aq0Var3, aq0 aq0Var4, bf0 bf0Var, bf0 bf0Var2, C0043b5 c0043b5) {
        this.f2937n = aq0Var;
        this.f2938o = aq0Var2;
        this.f2939p = aq0Var4;
        this.f2936m = bf0Var;
        this.f2933j = bf0Var2;
        this.f2934k = c0043b5;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1600a(yq2 yq2Var, Executor executor) {
        try {
            this.f2932i.m5003a();
            this.f2931h.f2422h.add(new df0(yq2Var, executor));
            int i = 1;
            if (this.f2946w) {
                m1603d(1);
                executor.execute(new cf0(this, yq2Var, i));
            } else if (this.f2948y) {
                m1603d(1);
                executor.execute(new cf0(this, yq2Var, 0));
            } else {
                fg1.m1640o("Cannot add callbacks to a cancelled EngineJob", !this.f2930B);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1601b() {
        hf0 hf0Var;
        synchronized (this) {
            try {
                this.f2932i.m5003a();
                fg1.m1640o("Not yet complete!", m1604e());
                int iDecrementAndGet = this.f2940q.decrementAndGet();
                fg1.m1640o("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    hf0Var = this.f2949z;
                    m1605f();
                } else {
                    hf0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hf0Var != null) {
            hf0Var.m2154c();
        }
    }

    @Override // p000.th0
    /* JADX INFO: renamed from: c */
    public final su2 mo1602c() {
        return this.f2932i;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m1603d(int i) {
        hf0 hf0Var;
        fg1.m1640o("Not yet complete!", m1604e());
        if (this.f2940q.getAndAdd(i) == 0 && (hf0Var = this.f2949z) != null) {
            hf0Var.m2153a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1604e() {
        return this.f2948y || this.f2946w || this.f2930B;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m1605f() {
        boolean zM5621a;
        if (this.f2941r == null) {
            throw new IllegalArgumentException();
        }
        this.f2931h.f2422h.clear();
        this.f2941r = null;
        this.f2949z = null;
        this.f2944u = null;
        this.f2948y = false;
        this.f2930B = false;
        this.f2946w = false;
        w40 w40Var = this.f2929A;
        v40 v40Var = w40Var.f12334n;
        synchronized (v40Var) {
            v40Var.f11676a = true;
            zM5621a = v40Var.m5621a();
        }
        if (zM5621a) {
            w40Var.m5844k();
        }
        this.f2929A = null;
        this.f2947x = null;
        this.f2945v = 0;
        this.f2934k.mo18a(this);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m1606g(yq2 yq2Var) {
        try {
            this.f2932i.m5003a();
            this.f2931h.f2422h.remove(new df0(yq2Var, up0.f11396d));
            if (this.f2931h.f2422h.isEmpty()) {
                if (!m1604e()) {
                    this.f2930B = true;
                    w40 w40Var = this.f2929A;
                    w40Var.f12323J = true;
                    h40 h40Var = w40Var.f12321H;
                    if (h40Var != null) {
                        h40Var.cancel();
                    }
                    bf0 bf0Var = this.f2936m;
                    gf0 gf0Var = this.f2941r;
                    synchronized (bf0Var) {
                        l40 l40Var = bf0Var.f830a;
                        l40Var.getClass();
                        HashMap map = l40Var.f5918a;
                        if (this == map.get(gf0Var)) {
                            map.remove(gf0Var);
                        }
                    }
                }
                if (this.f2946w || this.f2948y) {
                    if (this.f2940q.get() == 0) {
                        m1605f();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
