package p321w;

import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: w.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4637t0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15394g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4647y0 f15395h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4637t0(InterfaceC4647y0 interfaceC4647y0, int i9) {
        this.f15394g = i9;
        this.f15395h = interfaceC4647y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f15394g) {
            case 0:
                this.f15395h.mo4010b();
                break;
            default:
                this.f15395h.onCancel();
                break;
        }
        return C3967n.f12976a;
    }
}
