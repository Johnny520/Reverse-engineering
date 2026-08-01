package p000;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684rc implements zj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5349a;

    /* JADX INFO: renamed from: b */
    public final Object f5350b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0684rc(int i, Object obj) {
        this.f5349a = i;
        this.f5350b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.f5349a;
        Object obj = this.f5350b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC0742sw) obj).getClass().getSimpleName() + '@' + AbstractC0398kl.m1927m(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC0622po) obj) + ']';
        }
    }
}
