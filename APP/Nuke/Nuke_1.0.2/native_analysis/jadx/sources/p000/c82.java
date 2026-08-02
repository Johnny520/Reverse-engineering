package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c82 implements j20, a82 {

    /* JADX INFO: renamed from: k */
    public static final C0588pp f1232k = new C0588pp(0);

    /* JADX INFO: renamed from: h */
    public final a20 f1233h;

    /* JADX INFO: renamed from: i */
    public final c82 f1234i = this;

    /* JADX INFO: renamed from: j */
    public volatile a20 f1235j;

    public c82(a20 a20Var) {
        this.f1233h = a20Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m704b() {
        synchronized (this.f1234i) {
            try {
                a20 a20Var = this.f1235j;
                if (a20Var == null) {
                    this.f1235j = f1232k;
                } else {
                    mm0 mm0Var = new mm0(0);
                    k21 k21Var = (k21) a20Var.mo15o(C0700sn.f10207K);
                    if (k21Var != null) {
                        k21Var.mo1704c(mm0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: d */
    public final void mo110d() {
        m704b();
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: f */
    public final void mo111f() {
        m704b();
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public final a20 mo705g() {
        a20 a20VarMo14k;
        a20 a20Var = this.f1235j;
        if (a20Var == null || a20Var == f1232k) {
            C0110cy c0110cy = (C0110cy) this.f1233h.mo15o(C0110cy.f1773i);
            a20 b82Var = c0110cy != null ? new b82(c0110cy, this) : zd0.f13837h;
            synchronized (this.f1234i) {
                try {
                    a20 a20Var2 = this.f1235j;
                    if (a20Var2 == null) {
                        a20 a20Var3 = this.f1233h;
                        a20VarMo14k = a20Var3.mo14k(new m21((k21) a20Var3.mo15o(C0700sn.f10207K))).mo14k(zd0.f13837h).mo14k(b82Var);
                    } else if (a20Var2 == f1232k) {
                        a20 a20Var4 = this.f1233h;
                        m21 m21Var = new m21((k21) a20Var4.mo15o(C0700sn.f10207K));
                        m21Var.m4326z(new mm0(0));
                        a20VarMo14k = a20Var4.mo14k(m21Var).mo14k(zd0.f13837h).mo14k(b82Var);
                    } else {
                        a20VarMo14k = a20Var2;
                    }
                    this.f1235j = a20VarMo14k;
                } catch (Throwable th) {
                    throw th;
                }
            }
            a20Var = a20VarMo14k;
        }
        a20Var.getClass();
        return a20Var;
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }
}
