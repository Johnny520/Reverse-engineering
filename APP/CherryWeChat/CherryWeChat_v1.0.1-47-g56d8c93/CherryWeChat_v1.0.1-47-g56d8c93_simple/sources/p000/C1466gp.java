package p000;

/* JADX INFO: renamed from: gp */
/* JADX INFO: loaded from: classes.dex */
public final class C1466gp implements InterfaceC2389pw, InterfaceC1097Zg {

    /* JADX INFO: renamed from: e */
    public static final C2656w4 f5197e = null;

    /* JADX INFO: renamed from: a */
    public final C1432fz f5198a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2389pw f5199b;

    /* JADX INFO: renamed from: c */
    public boolean f5200c;

    /* JADX INFO: renamed from: d */
    public boolean f5201d;

    static {
        f5197e = AbstractC0714Qj.m1478I(20, new C0668Pg(17));
    }

    public C1466gp() {
        this.f5198a = new C1432fz();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2819a() {
        monitor-enter(this);
        this.f5198a.m2744a();     // Catch: Throwable -> L9
        if (this.f5200c == false) goto L14;
        this.f5200c = false;     // Catch: Throwable -> L9
        if (this.f5201d == false) goto L11;
        mo118e();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L14:
        throw new IllegalStateException("Already unlocked");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
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
        monitor-enter(this);
        this.f5198a.m2744a();     // Catch: Throwable -> L7
        this.f5201d = true;     // Catch: Throwable -> L7
        if (this.f5200c == true) goto L9;
        this.f5199b.mo118e();     // Catch: Throwable -> L7
        this.f5199b = null;     // Catch: Throwable -> L7
        f5197e.mo1934a(this);     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        return this.f5199b.get();
    }
}
