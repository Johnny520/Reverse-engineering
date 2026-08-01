package p000;

/* JADX INFO: renamed from: ij */
/* JADX INFO: loaded from: classes.dex */
public final class C0336ij extends AbstractRunnableC0376jj {

    /* JADX INFO: renamed from: c */
    public final C0698s8 f2545c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0450lj f2546d;

    public C0336ij(AbstractC0450lj abstractC0450lj, long j, C0698s8 c0698s8) {
        this.f2546d = abstractC0450lj;
        this.f2722a = j;
        this.f2723b = -1;
        this.f2545c = c0698s8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2545c.m2325s(this.f2546d);
    }

    @Override // p000.AbstractRunnableC0376jj
    public final String toString() {
        return super.toString() + this.f2545c;
    }
}
