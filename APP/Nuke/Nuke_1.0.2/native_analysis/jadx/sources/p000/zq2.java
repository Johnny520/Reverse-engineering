package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zq2 extends AbstractC0696sj {

    /* JADX INFO: renamed from: i */
    public Object f14065i;

    /* JADX INFO: renamed from: j */
    public Object f14066j;

    /* JADX INFO: renamed from: k */
    public sk1 f14067k;

    /* JADX INFO: renamed from: l */
    public sk1 f14068l;

    /* JADX INFO: renamed from: m */
    public ho2 f14069m;

    /* JADX INFO: renamed from: n */
    public final xq2 f14070n;

    /* JADX INFO: renamed from: o */
    public final rl1 f14071o;

    public zq2() {
        super(4);
        this.f14070n = new xq2(1, this);
        C0686s9 c0686s9 = new C0686s9(19, this);
        ds2.m1121e(ds2.f2179a);
        synchronized (ds2.f2181c) {
            ds2.f2186h = AbstractC0142du.m1169y0(ds2.f2186h, c0686s9);
        }
        this.f14071o = new rl1(c0686s9);
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: c */
    public final void mo4188c(ho2 ho2Var) {
        this.f14066j = null;
        this.f14068l = null;
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: d */
    public final void mo4189d() {
        synchronized (this.f10161h) {
            try {
                this.f14065i = this.f14066j;
                if (this.f14068l == null) {
                    this.f14067k = null;
                } else {
                    if (this.f14067k == null) {
                        sk1 sk1Var = fd2.f2911a;
                        this.f14067k = new sk1();
                    }
                    sk1 sk1Var2 = this.f14067k;
                    this.f14067k = this.f14068l;
                    this.f14068l = sk1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: e */
    public final void mo4190e() {
        this.f14071o.m4512a();
        this.f14066j = null;
        this.f14068l = null;
        synchronized (this.f10161h) {
            this.f14069m = null;
            this.f14065i = null;
            this.f14067k = null;
        }
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: i */
    public final in0 mo4191i(ho2 ho2Var) {
        ho2 ho2Var2 = this.f14069m;
        if (ho2Var2 != null && !ho2Var2.equals(ho2Var)) {
            j22.m2430b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f14069m = ho2Var;
        return this.f14070n;
    }

    @Override // p000.AbstractC0696sj
    /* JADX INFO: renamed from: j */
    public final void mo4192j(InterfaceC0212fq interfaceC0212fq) {
        this.f14069m = null;
        this.f14066j = null;
        this.f14068l = null;
        mo4189d();
    }
}
