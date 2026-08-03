package p174m;

import p085fg.InterfaceC1220a;
import sg.C3977i;
import sg.InterfaceC3975g;

/* JADX INFO: renamed from: m.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2603g1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8434g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC3975g f8435h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2603g1(InterfaceC3975g interfaceC3975g, int i9) {
        this.f8434g = i9;
        this.f8435h = interfaceC3975g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f8434g) {
            case 0:
                Object objMo8197d = this.f8435h.mo8197d();
                if (objMo8197d instanceof C3977i) {
                    objMo8197d = null;
                }
                return (C2608h1) objMo8197d;
            default:
                Object objMo8197d2 = this.f8435h.mo8197d();
                if (objMo8197d2 instanceof C3977i) {
                    objMo8197d2 = null;
                }
                return (C2580b3) objMo8197d2;
        }
    }
}
