package retrofit2;

import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5786 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5777 f15882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15883;

    public /* synthetic */ C5786(InterfaceC5777 interfaceC5777, int i) {
        this.f15883 = i;
        this.f15882 = interfaceC5777;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f15883;
        C5175 c5175 = C5175.f14739;
        InterfaceC5777 interfaceC5777 = this.f15882;
        switch (i) {
            case 0:
                interfaceC5777.cancel();
                break;
            case 1:
                interfaceC5777.cancel();
                break;
            default:
                interfaceC5777.cancel();
                break;
        }
        return c5175;
    }
}
