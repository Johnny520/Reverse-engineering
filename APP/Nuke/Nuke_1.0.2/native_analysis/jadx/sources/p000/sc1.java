package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sc1 implements d92, th0 {

    /* JADX INFO: renamed from: l */
    public static final C0043b5 f10033l = s11.m4711o0(20, new j51(2));

    /* JADX INFO: renamed from: h */
    public final su2 f10034h = new su2();

    /* JADX INFO: renamed from: i */
    public d92 f10035i;

    /* JADX INFO: renamed from: j */
    public boolean f10036j;

    /* JADX INFO: renamed from: k */
    public boolean f10037k;

    /* JADX INFO: renamed from: a */
    public final synchronized void m4792a() {
        this.f10034h.m5003a();
        if (!this.f10036j) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f10036j = false;
        if (this.f10037k) {
            mo192e();
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: b */
    public final int mo190b() {
        return this.f10035i.mo190b();
    }

    @Override // p000.th0
    /* JADX INFO: renamed from: c */
    public final su2 mo1602c() {
        return this.f10034h;
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: d */
    public final Class mo191d() {
        return this.f10035i.mo191d();
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: e */
    public final synchronized void mo192e() {
        this.f10034h.m5003a();
        this.f10037k = true;
        if (!this.f10036j) {
            this.f10035i.mo192e();
            this.f10035i = null;
            f10033l.mo18a(this);
        }
    }

    @Override // p000.d92
    public final Object get() {
        return this.f10035i.get();
    }
}
