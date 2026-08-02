package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 implements d92 {
    public final boolean h;
    public final boolean i;
    public final d92 j;
    public final bf0 k;
    public final a51 l;
    public int m;
    public boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hf0(d92 d92Var, boolean z, boolean z2, a51 a51Var, bf0 bf0Var) {
        fg1.q("Argument must not be null", d92Var);
        this.j = d92Var;
        this.h = z;
        this.i = z2;
        this.l = a51Var;
        fg1.q("Argument must not be null", bf0Var);
        this.k = bf0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a() {
        if (this.n) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.m++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final int b() {
        return this.j.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.m;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.m = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.k.f(this.l, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Class d() {
        return this.j.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final synchronized void e() {
        if (this.m > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.n) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.n = true;
        if (this.i) {
            this.j.e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Object get() {
        return this.j.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.h + ", listener=" + this.k + ", key=" + this.l + ", acquired=" + this.m + ", isRecycled=" + this.n + ", resource=" + this.j + '}';
    }
}
