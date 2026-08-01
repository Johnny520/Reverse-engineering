package kotlinx.coroutines;

import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6274 implements InterfaceC6278 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15433;

    public /* synthetic */ C6274(Object obj, int i) {
        this.f15433 = i;
        this.f15432 = obj;
    }

    public final String toString() {
        int i = this.f15433;
        Object obj = this.f15432;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC7387) obj).getClass().getSimpleName() + '@' + AbstractC6231.m11060(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC6230) obj) + ']';
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6278
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10974(Throwable th) {
        int i = this.f15433;
        Object obj = this.f15432;
        switch (i) {
            case 0:
                ((InterfaceC7387) obj).invoke(th);
                break;
            default:
                ((InterfaceC6230) obj).dispose();
                break;
        }
    }
}
