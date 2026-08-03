package p249qg;

import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: qg.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3558e implements InterfaceC3557d1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11558a;

    /* JADX INFO: renamed from: b */
    public final Object f11559b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3558e(Object obj, int i9) {
        this.f11558a = i9;
        this.f11559b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f11558a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC1231l) this.f11559b).getClass().getSimpleName() + '@' + AbstractC3603v.m7556j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC3556d0) this.f11559b) + ']';
        }
    }
}
