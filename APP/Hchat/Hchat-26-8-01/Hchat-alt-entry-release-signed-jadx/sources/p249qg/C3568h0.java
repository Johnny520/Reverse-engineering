package p249qg;

import p276sf.C3967n;

/* JADX INFO: renamed from: qg.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3568h0 extends AbstractRunnableC3574j0 {

    /* JADX INFO: renamed from: i */
    public final C3564g f11573i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC3580l0 f11574j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3568h0(AbstractC3580l0 abstractC3580l0, long j3, C3564g c3564g) {
        super(j3);
        this.f11574j = abstractC3580l0;
        this.f11573i = c3564g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f11573i.m7504B(this.f11574j, C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractRunnableC3574j0
    public final String toString() {
        return super.toString() + this.f11573i;
    }
}
