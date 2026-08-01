package retrofit2;

import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6617 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6608 f16227;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16228;

    public /* synthetic */ C6617(InterfaceC6608 interfaceC6608, int i) {
        this.f16228 = i;
        this.f16227 = interfaceC6608;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f16228;
        C6008 c6008 = C6008.f15084;
        InterfaceC6608 interfaceC6608 = this.f16227;
        switch (i) {
            case 0:
                interfaceC6608.cancel();
                break;
            case 1:
                interfaceC6608.cancel();
                break;
            default:
                interfaceC6608.cancel();
                break;
        }
        return c6008;
    }
}
