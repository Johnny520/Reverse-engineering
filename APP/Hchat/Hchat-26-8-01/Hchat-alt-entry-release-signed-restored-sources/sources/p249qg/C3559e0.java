package p249qg;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: qg.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3559e0 extends AbstractC3602u0 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f11560k;

    /* JADX INFO: renamed from: l */
    public final Object f11561l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3559e0(Object obj, int i9) {
        this.f11560k = i9;
        this.f11561l = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: k */
    public final boolean mo7495k() {
        switch (this.f11560k) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: l */
    public final void mo7496l(Throwable th2) {
        switch (this.f11560k) {
            case 0:
                ((InterfaceC3556d0) this.f11561l).mo7492a();
                break;
            case 1:
                ((InterfaceC1231l) this.f11561l).invoke(th2);
                break;
            default:
                Object obj = C3610y0.f11641g.get(m7546j());
                boolean z9 = obj instanceof C3585n;
                C3604v0 c3604v0 = (C3604v0) this.f11561l;
                if (!z9) {
                    c3604v0.resumeWith(AbstractC3603v.m7568v(obj));
                } else {
                    c3604v0.resumeWith(AbstractC1089i.m2785q(((C3585n) obj).f11599a));
                }
                break;
        }
    }
}
