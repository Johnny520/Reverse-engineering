package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 implements e70 {
    public te A;
    public int h;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = 1.0f;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public long t;
    public eq2 u;
    public boolean v;
    public long w;
    public e70 x;
    public d61 y;
    public int z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ca2() {
        long j = tq0.a;
        this.n = j;
        this.o = j;
        this.s = 8.0f;
        this.t = m33.b;
        this.u = sp0.h;
        this.w = 9205357640488583168L;
        this.x = up0.a();
        this.y = d61.h;
        this.z = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        k(1.0f);
        l(1.0f);
        c(1.0f);
        s(0.0f);
        n(0.0f);
        long j = tq0.a;
        e(j);
        q(j);
        h(0.0f);
        i(0.0f);
        j(0.0f);
        f(8.0f);
        r(m33.b);
        p(sp0.h);
        g(false);
        if (this.z != 3) {
            this.h |= 524288;
            this.z = 3;
        }
        this.w = 9205357640488583168L;
        this.A = null;
        this.h = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.x.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(float f) {
        if (this.k == f) {
            return;
        }
        this.h |= 4;
        this.k = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j) {
        if (ju.c(this.n, j)) {
            return;
        }
        this.h |= 64;
        this.n = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(float f) {
        if (this.s == f) {
            return;
        }
        this.h |= 2048;
        this.s = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z) {
        if (this.v != z) {
            this.h |= 16384;
            this.v = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(float f) {
        if (this.p == f) {
            return;
        }
        this.h |= 256;
        this.p = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(float f) {
        if (this.q == f) {
            return;
        }
        this.h |= AIChatConfig.DefaultMaxTokens;
        this.q = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(float f) {
        if (this.r == f) {
            return;
        }
        this.h |= 1024;
        this.r = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(float f) {
        if (this.i == f) {
            return;
        }
        this.h |= 1;
        this.i = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(float f) {
        if (this.j == f) {
            return;
        }
        this.h |= 2;
        this.j = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.x.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(float f) {
        if (this.m == f) {
            return;
        }
        this.h |= 32;
        this.m = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(eq2 eq2Var) {
        if (t11.l(this.u, eq2Var)) {
            return;
        }
        this.h |= 8192;
        this.u = eq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(long j) {
        if (ju.c(this.o, j)) {
            return;
        }
        this.h |= 128;
        this.o = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(long j) {
        if (m33.a(this.t, j)) {
            return;
        }
        this.h |= 4096;
        this.t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(float f) {
        if (this.l == f) {
            return;
        }
        this.h |= 16;
        this.l = f;
    }
}
