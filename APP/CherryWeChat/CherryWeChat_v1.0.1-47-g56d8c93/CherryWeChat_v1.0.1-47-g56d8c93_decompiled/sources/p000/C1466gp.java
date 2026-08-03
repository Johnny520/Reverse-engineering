package p000;

/* JADX INFO: renamed from: gp */
/* JADX INFO: loaded from: classes.dex */
public final class C1466gp implements InterfaceC2389pw, InterfaceC1097Zg {

    /* JADX INFO: renamed from: e */
    public static final C2656w4 f5197e = AbstractC0714Qj.m1478I(20, new C0668Pg(17));

    /* JADX INFO: renamed from: a */
    public final C1432fz f5198a = new C1432fz();

    /* JADX INFO: renamed from: b */
    public InterfaceC2389pw f5199b;

    /* JADX INFO: renamed from: c */
    public boolean f5200c;

    /* JADX INFO: renamed from: d */
    public boolean f5201d;

    /* JADX INFO: renamed from: a */
    public final synchronized void m2819a() {
        this.f5198a.m2744a();
        if (!this.f5200c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f5200c = false;
        if (this.f5201d) {
            mo118e();
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        return this.f5199b.mo116b();
    }

    @Override // p000.InterfaceC1097Zg
    /* JADX INFO: renamed from: c */
    public final C1432fz mo672c() {
        return this.f5198a;
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        return this.f5199b.mo117d();
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final synchronized void mo118e() {
        this.f5198a.m2744a();
        this.f5201d = true;
        if (!this.f5200c) {
            this.f5199b.mo118e();
            this.f5199b = null;
            f5197e.mo1934a(this);
        }
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        return this.f5199b.get();
    }
}
