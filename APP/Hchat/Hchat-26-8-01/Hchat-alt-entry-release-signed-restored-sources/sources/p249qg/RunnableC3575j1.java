package p249qg;

import vg.C4567p;

/* JADX INFO: renamed from: qg.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3575j1 extends C4567p implements Runnable {

    /* JADX INFO: renamed from: k */
    public final long f11582k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC3575j1(long j3, C3578k1 c3578k1) {
        super(c3578k1, c3578k1.getContext());
        this.f11582k = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: P */
    public final String mo7530P() {
        return super.mo7530P() + "(timeMillis=" + this.f11582k + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3603v.m7555i(this.f11548i);
        m7595v(new C3572i1("Timed out waiting for " + this.f11582k + " ms", this));
    }
}
