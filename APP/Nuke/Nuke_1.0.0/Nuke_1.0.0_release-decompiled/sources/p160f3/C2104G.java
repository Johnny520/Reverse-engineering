package p160f3;

/* JADX INFO: renamed from: f3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2104G extends AbstractRunnableC2106I {

    /* JADX INFO: renamed from: f */
    public final C2135g f7033f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC2108K f7034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2104G(AbstractC2108K abstractC2108K, long j5, C2135g c2135g) {
        super(j5);
        this.f7034g = abstractC2108K;
        this.f7033f = c2135g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7033f.m3960E(this.f7034g);
    }

    @Override // p160f3.AbstractRunnableC2106I
    public final String toString() {
        return super.toString() + this.f7033f;
    }
}
