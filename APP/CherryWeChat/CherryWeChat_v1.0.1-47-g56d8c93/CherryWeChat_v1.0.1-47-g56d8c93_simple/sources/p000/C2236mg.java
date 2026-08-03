package p000;

/* JADX INFO: renamed from: mg */
/* JADX INFO: loaded from: classes.dex */
public final class C2236mg implements InterfaceC2389pw {

    /* JADX INFO: renamed from: a */
    public final boolean f7877a;

    /* JADX INFO: renamed from: b */
    public final boolean f7878b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2389pw f7879c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2193lg f7880d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0802Sm f7881e;

    /* JADX INFO: renamed from: f */
    public int f7882f;

    /* JADX INFO: renamed from: g */
    public boolean f7883g;

    public C2236mg(InterfaceC2389pw r2, boolean r3, boolean r4, InterfaceC0802Sm r5, InterfaceC2193lg r6) {
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        this.f7879c = r2;
        this.f7877a = r3;
        this.f7878b = r4;
        this.f7881e = r5;
        AbstractC0714Qj.m1488j("Argument must not be null", r6);
        this.f7880d = r6;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4539a() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f7883g == true) goto L11;
        this.f7882f++;
        monitor-exit(this);
        return;
    L11:
        throw new IllegalStateException("Cannot acquire a recycled resource");     // Catch: Throwable -> L8
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        return this.f7879c.mo116b();
    }

    /* JADX INFO: renamed from: c */
    public final void m4540c() {
        monitor-enter(this);
        int r0 = this.f7882f;     // Catch: Throwable -> L13
        if (r0 <= 0) goto L16;
        boolean r1 = true;
        int r02 = r0 - 1;     // Catch: Throwable -> L13
        this.f7882f = r02;     // Catch: Throwable -> L13
        if (r02 == 0) goto L9;
        r1 = false;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L13
        if (r1 == false) goto L20;
        InterfaceC2193lg r03 = this.f7880d;
        C1264cg r04 = (C1264cg) r03;
        r04.m2404d(this.f7881e, this);
        return;
    L20:
        return;
    L16:
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        return this.f7879c.mo117d();
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final synchronized void mo118e() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.f7882f > 0) goto L18;
        if (this.f7883g == true) goto L16;
        this.f7883g = true;     // Catch: Throwable -> L11
        if (this.f7878b == false) goto L13;
        this.f7879c.mo118e();     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);
        return;
    L16:
        throw new IllegalStateException("Cannot recycle a resource that has already been recycled");     // Catch: Throwable -> L11
    L18:
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");     // Catch: Throwable -> L11
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        return this.f7879c.get();
    }

    public final synchronized String toString() {
        monitor-enter(this);
        String r0 = "EngineResource{isMemoryCacheable=" + this.f7877a + ", listener=" + this.f7880d + ", key=" + this.f7881e + ", acquired=" + this.f7882f + ", isRecycled=" + this.f7883g + ", resource=" + this.f7879c + '}';     // Catch: Throwable -> L7
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }
}
