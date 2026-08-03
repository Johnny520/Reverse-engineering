package p249qg;

import wf.InterfaceC5557c;

/* JADX INFO: renamed from: qg.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3604v0 extends C3564g {

    /* JADX INFO: renamed from: o */
    public final C3579l f11629o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3604v0(InterfaceC5557c interfaceC5557c, C3579l c3579l) {
        super(1, interfaceC5557c);
        this.f11629o = c3579l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3564g
    /* JADX INFO: renamed from: n */
    public final Throwable mo7511n(C3610y0 c3610y0) {
        Throwable thM7574c;
        C3579l c3579l = this.f11629o;
        c3579l.getClass();
        Object obj = C3610y0.f11641g.get(c3579l);
        return (!(obj instanceof C3608x0) || (thM7574c = ((C3608x0) obj).m7574c()) == null) ? obj instanceof C3585n ? ((C3585n) obj).f11599a : c3610y0.mo7489h() : thM7574c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3564g
    /* JADX INFO: renamed from: v */
    public final String mo7518v() {
        return "AwaitContinuation";
    }
}
