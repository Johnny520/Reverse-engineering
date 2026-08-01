package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class rc0 {

    /* JADX INFO: renamed from: a */
    public final bd0 f4121a;

    /* JADX INFO: renamed from: b */
    public C0346ip[] f4122b;

    public rc0() {
        this(new bd0());
    }

    /* JADX INFO: renamed from: a */
    public final void m2287a() {
        C0346ip[] c0346ipArr = this.f4122b;
        if (c0346ipArr != null) {
            C0346ip c0346ipMo2368f = c0346ipArr[0];
            C0346ip c0346ipMo2368f2 = c0346ipArr[1];
            bd0 bd0Var = this.f4121a;
            if (c0346ipMo2368f2 == null) {
                c0346ipMo2368f2 = bd0Var.f724a.mo2368f(2);
            }
            if (c0346ipMo2368f == null) {
                c0346ipMo2368f = bd0Var.f724a.mo2368f(1);
            }
            mo1946g(C0346ip.m1523a(c0346ipMo2368f, c0346ipMo2368f2));
            C0346ip c0346ip = this.f4122b[AbstractC0387ju.m1627p(16)];
            if (c0346ip != null) {
                mo2085f(c0346ip);
            }
            C0346ip c0346ip2 = this.f4122b[AbstractC0387ju.m1627p(32)];
            if (c0346ip2 != null) {
                mo2084d(c0346ip2);
            }
            C0346ip c0346ip3 = this.f4122b[AbstractC0387ju.m1627p(64)];
            if (c0346ip3 != null) {
                mo2086h(c0346ip3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract bd0 mo1944b();

    /* JADX INFO: renamed from: c */
    public void mo2146c(int i, C0346ip c0346ip) {
        if (this.f4122b == null) {
            this.f4122b = new C0346ip[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f4122b[AbstractC0387ju.m1627p(i2)] = c0346ip;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo1945e(C0346ip c0346ip);

    /* JADX INFO: renamed from: g */
    public abstract void mo1946g(C0346ip c0346ip);

    public rc0(bd0 bd0Var) {
        this.f4121a = bd0Var;
    }

    /* JADX INFO: renamed from: d */
    public void mo2084d(C0346ip c0346ip) {
    }

    /* JADX INFO: renamed from: f */
    public void mo2085f(C0346ip c0346ip) {
    }

    /* JADX INFO: renamed from: h */
    public void mo2086h(C0346ip c0346ip) {
    }
}
