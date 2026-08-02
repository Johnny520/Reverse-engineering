package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 implements th0 {
    public static final z8 C = new z8(19);
    public w40 A;
    public volatile boolean B;
    public final bf0 j;
    public final a22 k;
    public final bf0 m;
    public final aq0 n;
    public final aq0 o;
    public final aq0 p;
    public gf0 r;
    public boolean s;
    public boolean t;
    public d92 u;
    public int v;
    public boolean w;
    public xp0 x;
    public boolean y;
    public hf0 z;
    public final ef0 h = new ef0(new ArrayList(2));
    public final su2 i = new su2();
    public final AtomicInteger q = new AtomicInteger();
    public final z8 l = C;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ff0(aq0 aq0Var, aq0 aq0Var2, aq0 aq0Var3, aq0 aq0Var4, bf0 bf0Var, bf0 bf0Var2, b5 b5Var) {
        this.n = aq0Var;
        this.o = aq0Var2;
        this.p = aq0Var4;
        this.m = bf0Var;
        this.j = bf0Var2;
        this.k = b5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a(yq2 yq2Var, Executor executor) {
        try {
            this.i.a();
            this.h.h.add(new df0(yq2Var, executor));
            int i = 1;
            if (this.w) {
                d(1);
                executor.execute(new cf0(this, yq2Var, i));
            } else if (this.y) {
                d(1);
                executor.execute(new cf0(this, yq2Var, 0));
            } else {
                fg1.o("Cannot add callbacks to a cancelled EngineJob", !this.B);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        hf0 hf0Var;
        synchronized (this) {
            try {
                this.i.a();
                fg1.o("Not yet complete!", e());
                int iDecrementAndGet = this.q.decrementAndGet();
                fg1.o("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    hf0Var = this.z;
                    f();
                } else {
                    hf0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hf0Var != null) {
            hf0Var.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th0
    public final su2 c() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void d(int i) {
        hf0 hf0Var;
        fg1.o("Not yet complete!", e());
        if (this.q.getAndAdd(i) == 0 && (hf0Var = this.z) != null) {
            hf0Var.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return this.y || this.w || this.B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void f() {
        boolean zA;
        if (this.r == null) {
            throw new IllegalArgumentException();
        }
        this.h.h.clear();
        this.r = null;
        this.z = null;
        this.u = null;
        this.y = false;
        this.B = false;
        this.w = false;
        w40 w40Var = this.A;
        v40 v40Var = w40Var.n;
        synchronized (v40Var) {
            v40Var.a = true;
            zA = v40Var.a();
        }
        if (zA) {
            w40Var.k();
        }
        this.A = null;
        this.x = null;
        this.v = 0;
        this.k.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void g(yq2 yq2Var) {
        try {
            this.i.a();
            this.h.h.remove(new df0(yq2Var, up0.d));
            if (this.h.h.isEmpty()) {
                if (!e()) {
                    this.B = true;
                    w40 w40Var = this.A;
                    w40Var.J = true;
                    h40 h40Var = w40Var.H;
                    if (h40Var != null) {
                        h40Var.cancel();
                    }
                    bf0 bf0Var = this.m;
                    gf0 gf0Var = this.r;
                    synchronized (bf0Var) {
                        l40 l40Var = bf0Var.a;
                        l40Var.getClass();
                        HashMap map = l40Var.a;
                        if (this == map.get(gf0Var)) {
                            map.remove(gf0Var);
                        }
                    }
                }
                if (this.w || this.y) {
                    if (this.q.get() == 0) {
                        f();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
