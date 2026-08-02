package p000;

/* JADX INFO: renamed from: hp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0285hp implements InterfaceC0321ip {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4096a;

    /* JADX INFO: renamed from: b */
    public final Object f4097b;

    public /* synthetic */ C0285hp(int i, Object obj) {
        this.f4096a = i;
        this.f4097b = obj;
    }

    @Override // p000.InterfaceC0321ip
    /* JADX INFO: renamed from: a */
    public final void mo2226a(Throwable th) {
        int i = this.f4096a;
        Object obj = this.f4097b;
        switch (i) {
            case 0:
                ((in0) obj).mo5j(th);
                break;
            default:
                ((ca0) obj).mo717a();
                break;
        }
    }

    public final String toString() {
        int i = this.f4096a;
        Object obj = this.f4097b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((in0) obj).getClass().getSimpleName() + '@' + p40.m3740x(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ca0) obj) + ']';
        }
    }
}
