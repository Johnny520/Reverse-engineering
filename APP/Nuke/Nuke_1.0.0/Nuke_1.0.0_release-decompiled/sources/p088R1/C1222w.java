package p088R1;

import p078P1.InterfaceC1144f;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: R1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1222w implements InterfaceC1194D {

    /* JADX INFO: renamed from: d */
    public final boolean f4079d;

    /* JADX INFO: renamed from: e */
    public final boolean f4080e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1194D f4081f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1221v f4082g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1144f f4083h;

    /* JADX INFO: renamed from: i */
    public int f4084i;

    /* JADX INFO: renamed from: j */
    public boolean f4085j;

    public C1222w(InterfaceC1194D interfaceC1194D, boolean z5, boolean z6, InterfaceC1144f interfaceC1144f, InterfaceC1221v interfaceC1221v) {
        AbstractC2503g.m4445c(interfaceC1194D, "Argument must not be null");
        this.f4081f = interfaceC1194D;
        this.f4079d = z5;
        this.f4080e = z6;
        this.f4083h = interfaceC1144f;
        AbstractC2503g.m4445c(interfaceC1221v, "Argument must not be null");
        this.f4082g = interfaceC1221v;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2303a() {
        if (this.f4085j) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4084i++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2304b() {
        boolean z5;
        synchronized (this) {
            int i5 = this.f4084i;
            if (i5 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z5 = true;
            int i6 = i5 - 1;
            this.f4084i = i6;
            if (i6 != 0) {
                z5 = false;
            }
        }
        if (z5) {
            ((C1214o) this.f4082g).m2294e(this.f4083h, this);
        }
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: c */
    public final int mo2254c() {
        return this.f4081f.mo2254c();
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: d */
    public final Class mo2255d() {
        return this.f4081f.mo2255d();
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: e */
    public final synchronized void mo2256e() {
        if (this.f4084i > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4085j) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4085j = true;
        if (this.f4080e) {
            this.f4081f.mo2256e();
        }
    }

    @Override // p088R1.InterfaceC1194D
    public final Object get() {
        return this.f4081f.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4079d + ", listener=" + this.f4082g + ", key=" + this.f4083h + ", acquired=" + this.f4084i + ", isRecycled=" + this.f4085j + ", resource=" + this.f4081f + '}';
    }
}
