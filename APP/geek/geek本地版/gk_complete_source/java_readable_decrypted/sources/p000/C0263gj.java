package p000;

/* JADX INFO: renamed from: gj */
/* JADX INFO: loaded from: classes.dex */
public final class C0263gj extends AbstractRunnableC0300hj {

    /* JADX INFO: renamed from: c */
    public final C0326i8 f2133c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0376jj f2134d;

    public C0263gj(AbstractC0376jj abstractC0376jj, long j, C0326i8 c0326i8) {
        this.f2134d = abstractC0376jj;
        this.f2279a = j;
        this.f2280b = -1;
        this.f2133c = c0326i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2133c.m1416s(this.f2134d);
    }

    @Override // p000.AbstractRunnableC0300hj
    public final String toString() {
        return super.toString() + this.f2133c;
    }
}
