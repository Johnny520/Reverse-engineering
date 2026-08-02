package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 implements d92 {

    /* JADX INFO: renamed from: h */
    public final boolean f3985h;

    /* JADX INFO: renamed from: i */
    public final boolean f3986i;

    /* JADX INFO: renamed from: j */
    public final d92 f3987j;

    /* JADX INFO: renamed from: k */
    public final bf0 f3988k;

    /* JADX INFO: renamed from: l */
    public final a51 f3989l;

    /* JADX INFO: renamed from: m */
    public int f3990m;

    /* JADX INFO: renamed from: n */
    public boolean f3991n;

    public hf0(d92 d92Var, boolean z, boolean z2, a51 a51Var, bf0 bf0Var) {
        fg1.m1642q("Argument must not be null", d92Var);
        this.f3987j = d92Var;
        this.f3985h = z;
        this.f3986i = z2;
        this.f3989l = a51Var;
        fg1.m1642q("Argument must not be null", bf0Var);
        this.f3988k = bf0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2153a() {
        if (this.f3991n) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f3990m++;
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: b */
    public final int mo190b() {
        return this.f3987j.mo190b();
    }

    /* JADX INFO: renamed from: c */
    public final void m2154c() {
        boolean z;
        synchronized (this) {
            int i = this.f3990m;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f3990m = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f3988k.m527f(this.f3989l, this);
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: d */
    public final Class mo191d() {
        return this.f3987j.mo191d();
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: e */
    public final synchronized void mo192e() {
        if (this.f3990m > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f3991n) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f3991n = true;
        if (this.f3986i) {
            this.f3987j.mo192e();
        }
    }

    @Override // p000.d92
    public final Object get() {
        return this.f3987j.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3985h + ", listener=" + this.f3988k + ", key=" + this.f3989l + ", acquired=" + this.f3990m + ", isRecycled=" + this.f3991n + ", resource=" + this.f3987j + '}';
    }
}
