package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 implements e70 {

    /* JADX INFO: renamed from: A */
    public AbstractC0731te f1260A;

    /* JADX INFO: renamed from: h */
    public int f1261h;

    /* JADX INFO: renamed from: i */
    public float f1262i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f1263j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f1264k = 1.0f;

    /* JADX INFO: renamed from: l */
    public float f1265l;

    /* JADX INFO: renamed from: m */
    public float f1266m;

    /* JADX INFO: renamed from: n */
    public long f1267n;

    /* JADX INFO: renamed from: o */
    public long f1268o;

    /* JADX INFO: renamed from: p */
    public float f1269p;

    /* JADX INFO: renamed from: q */
    public float f1270q;

    /* JADX INFO: renamed from: r */
    public float f1271r;

    /* JADX INFO: renamed from: s */
    public float f1272s;

    /* JADX INFO: renamed from: t */
    public long f1273t;

    /* JADX INFO: renamed from: u */
    public eq2 f1274u;

    /* JADX INFO: renamed from: v */
    public boolean f1275v;

    /* JADX INFO: renamed from: w */
    public long f1276w;

    /* JADX INFO: renamed from: x */
    public e70 f1277x;

    /* JADX INFO: renamed from: y */
    public d61 f1278y;

    /* JADX INFO: renamed from: z */
    public int f1279z;

    public ca2() {
        long j = tq0.f10898a;
        this.f1267n = j;
        this.f1268o = j;
        this.f1272s = 8.0f;
        this.f1273t = m33.f6464b;
        this.f1274u = sp0.f10267h;
        this.f1276w = 9205357640488583168L;
        this.f1277x = up0.m5536a();
        this.f1278y = d61.f1885h;
        this.f1279z = 3;
    }

    /* JADX INFO: renamed from: a */
    public final void m718a() {
        m726k(1.0f);
        m727l(1.0f);
        m719c(1.0f);
        m732s(0.0f);
        m728n(0.0f);
        long j = tq0.f10898a;
        m720e(j);
        m730q(j);
        m723h(0.0f);
        m724i(0.0f);
        m725j(0.0f);
        m721f(8.0f);
        m731r(m33.f6464b);
        m729p(sp0.f10267h);
        m722g(false);
        if (this.f1279z != 3) {
            this.f1261h |= 524288;
            this.f1279z = 3;
        }
        this.f1276w = 9205357640488583168L;
        this.f1260A = null;
        this.f1261h = 0;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f1277x.mo693b();
    }

    /* JADX INFO: renamed from: c */
    public final void m719c(float f) {
        if (this.f1264k == f) {
            return;
        }
        this.f1261h |= 4;
        this.f1264k = f;
    }

    /* JADX INFO: renamed from: e */
    public final void m720e(long j) {
        if (C0363ju.m2566c(this.f1267n, j)) {
            return;
        }
        this.f1261h |= 64;
        this.f1267n = j;
    }

    /* JADX INFO: renamed from: f */
    public final void m721f(float f) {
        if (this.f1272s == f) {
            return;
        }
        this.f1261h |= 2048;
        this.f1272s = f;
    }

    /* JADX INFO: renamed from: g */
    public final void m722g(boolean z) {
        if (this.f1275v != z) {
            this.f1261h |= 16384;
            this.f1275v = z;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m723h(float f) {
        if (this.f1269p == f) {
            return;
        }
        this.f1261h |= 256;
        this.f1269p = f;
    }

    /* JADX INFO: renamed from: i */
    public final void m724i(float f) {
        if (this.f1270q == f) {
            return;
        }
        this.f1261h |= AIChatConfig.DefaultMaxTokens;
        this.f1270q = f;
    }

    /* JADX INFO: renamed from: j */
    public final void m725j(float f) {
        if (this.f1271r == f) {
            return;
        }
        this.f1261h |= 1024;
        this.f1271r = f;
    }

    /* JADX INFO: renamed from: k */
    public final void m726k(float f) {
        if (this.f1262i == f) {
            return;
        }
        this.f1261h |= 1;
        this.f1262i = f;
    }

    /* JADX INFO: renamed from: l */
    public final void m727l(float f) {
        if (this.f1263j == f) {
            return;
        }
        this.f1261h |= 2;
        this.f1263j = f;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f1277x.mo697m();
    }

    /* JADX INFO: renamed from: n */
    public final void m728n(float f) {
        if (this.f1266m == f) {
            return;
        }
        this.f1261h |= 32;
        this.f1266m = f;
    }

    /* JADX INFO: renamed from: p */
    public final void m729p(eq2 eq2Var) {
        if (t11.m5086l(this.f1274u, eq2Var)) {
            return;
        }
        this.f1261h |= 8192;
        this.f1274u = eq2Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m730q(long j) {
        if (C0363ju.m2566c(this.f1268o, j)) {
            return;
        }
        this.f1261h |= 128;
        this.f1268o = j;
    }

    /* JADX INFO: renamed from: r */
    public final void m731r(long j) {
        if (m33.m3029a(this.f1273t, j)) {
            return;
        }
        this.f1261h |= 4096;
        this.f1273t = j;
    }

    /* JADX INFO: renamed from: s */
    public final void m732s(float f) {
        if (this.f1265l == f) {
            return;
        }
        this.f1261h |= 16;
        this.f1265l = f;
    }
}
