package retrofit2;

import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5787 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5778 f15882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15883;

    public /* synthetic */ C5787(InterfaceC5778 interfaceC5778, int i) {
        this.f15883 = i;
        this.f15882 = interfaceC5778;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f15883;
        C5176 c5176 = C5176.f14739;
        InterfaceC5778 interfaceC5778 = this.f15882;
        switch (i) {
            case 0:
                interfaceC5778.cancel();
                break;
            case 1:
                interfaceC5778.cancel();
                break;
            default:
                interfaceC5778.cancel();
                break;
        }
        return c5176;
    }
}
