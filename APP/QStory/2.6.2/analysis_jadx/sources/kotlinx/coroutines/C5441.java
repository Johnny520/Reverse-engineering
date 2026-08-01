package kotlinx.coroutines;

import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5441 implements InterfaceC5445 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15087;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15088;

    public /* synthetic */ C5441(Object obj, int i) {
        this.f15088 = i;
        this.f15087 = obj;
    }

    public final String toString() {
        int i = this.f15088;
        Object obj = this.f15087;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC6557) obj).getClass().getSimpleName() + '@' + AbstractC5398.m10497(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC5397) obj) + ']';
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5445
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10411(Throwable th) {
        int i = this.f15088;
        Object obj = this.f15087;
        switch (i) {
            case 0:
                ((InterfaceC6557) obj).invoke(th);
                break;
            default:
                ((InterfaceC5397) obj).dispose();
                break;
        }
    }
}
