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

    public C2236mg(InterfaceC2389pw interfaceC2389pw, boolean z, boolean z2, InterfaceC0802Sm interfaceC0802Sm, InterfaceC2193lg interfaceC2193lg) {
        AbstractC0714Qj.m1488j("Argument must not be null", interfaceC2389pw);
        this.f7879c = interfaceC2389pw;
        this.f7877a = z;
        this.f7878b = z2;
        this.f7881e = interfaceC0802Sm;
        AbstractC0714Qj.m1488j("Argument must not be null", interfaceC2193lg);
        this.f7880d = interfaceC2193lg;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4539a() {
        if (this.f7883g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f7882f++;
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        return this.f7879c.mo116b();
    }

    /* JADX INFO: renamed from: c */
    public final void m4540c() {
        boolean z;
        synchronized (this) {
            int i = this.f7882f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f7882f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C1264cg) this.f7880d).m2404d(this.f7881e, this);
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        return this.f7879c.mo117d();
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final synchronized void mo118e() {
        if (this.f7882f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f7883g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f7883g = true;
        if (this.f7878b) {
            this.f7879c.mo118e();
        }
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        return this.f7879c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f7877a + ", listener=" + this.f7880d + ", key=" + this.f7881e + ", acquired=" + this.f7882f + ", isRecycled=" + this.f7883g + ", resource=" + this.f7879c + '}';
    }
}
