package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class mc0 {

    /* JADX INFO: renamed from: a */
    public final wc0 f3194a;

    /* JADX INFO: renamed from: b */
    public C0195ep[] f3195b;

    public mc0() {
        this(new wc0());
    }

    /* JADX INFO: renamed from: a */
    public final void m1819a() {
        C0195ep[] c0195epArr = this.f3195b;
        if (c0195epArr != null) {
            C0195ep c0195epMo1932f = c0195epArr[0];
            C0195ep c0195epMo1932f2 = c0195epArr[1];
            wc0 wc0Var = this.f3194a;
            if (c0195epMo1932f2 == null) {
                c0195epMo1932f2 = wc0Var.f4955a.mo1932f(2);
            }
            if (c0195epMo1932f == null) {
                c0195epMo1932f = wc0Var.f4955a.mo1932f(1);
            }
            mo1435g(C0195ep.m1049a(c0195epMo1932f, c0195epMo1932f2));
            C0195ep c0195ep = this.f3195b[AbstractC0126ct.m819q(16)];
            if (c0195ep != null) {
                mo1691f(c0195ep);
            }
            C0195ep c0195ep2 = this.f3195b[AbstractC0126ct.m819q(32)];
            if (c0195ep2 != null) {
                mo1690d(c0195ep2);
            }
            C0195ep c0195ep3 = this.f3195b[AbstractC0126ct.m819q(64)];
            if (c0195ep3 != null) {
                mo1692h(c0195ep3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract wc0 mo1433b();

    /* JADX INFO: renamed from: c */
    public void mo1758c(int i, C0195ep c0195ep) {
        if (this.f3195b == null) {
            this.f3195b = new C0195ep[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f3195b[AbstractC0126ct.m819q(i2)] = c0195ep;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo1434e(C0195ep c0195ep);

    /* JADX INFO: renamed from: g */
    public abstract void mo1435g(C0195ep c0195ep);

    public mc0(wc0 wc0Var) {
        this.f3194a = wc0Var;
    }

    /* JADX INFO: renamed from: d */
    public void mo1690d(C0195ep c0195ep) {
    }

    /* JADX INFO: renamed from: f */
    public void mo1691f(C0195ep c0195ep) {
    }

    /* JADX INFO: renamed from: h */
    public void mo1692h(C0195ep c0195ep) {
    }
}
