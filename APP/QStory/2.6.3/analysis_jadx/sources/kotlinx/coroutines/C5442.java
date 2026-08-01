package kotlinx.coroutines;

import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5442 implements InterfaceC5446 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15087;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15088;

    public /* synthetic */ C5442(Object obj, int i) {
        this.f15088 = i;
        this.f15087 = obj;
    }

    public final String toString() {
        int i = this.f15088;
        Object obj = this.f15087;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC6558) obj).getClass().getSimpleName() + '@' + AbstractC5399.m10501(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC5398) obj) + ']';
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10415(Throwable th) {
        int i = this.f15088;
        Object obj = this.f15087;
        switch (i) {
            case 0:
                ((InterfaceC6558) obj).invoke(th);
                break;
            default:
                ((InterfaceC5398) obj).dispose();
                break;
        }
    }
}
