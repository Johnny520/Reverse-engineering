package p160f3;

import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: f3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2131e implements InterfaceC2132e0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7072a;

    /* JADX INFO: renamed from: b */
    public final Object f7073b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2131e(int i5, Object obj) {
        this.f7072a = i5;
        this.f7073b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f7072a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC1601c) this.f7073b).getClass().getSimpleName() + '@' + AbstractC2162v.m3987i(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC2101D) this.f7073b) + ']';
        }
    }
}
