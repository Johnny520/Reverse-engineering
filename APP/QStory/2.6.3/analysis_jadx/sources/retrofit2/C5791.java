package retrofit2;

import androidx.window.area.AbstractC2567;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C5444;
import p007.C6127;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5791 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5796 f15886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15887;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5791(C5756 c5756, C6127 c6127, InterfaceC5789 interfaceC5789, InterfaceC5796 interfaceC5796, int i) {
        super(c5756, c6127, interfaceC5789);
        this.f15887 = i;
        this.f15886 = interfaceC5796;
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo11174(C5768 c5768, Object[] objArr) {
        int i = this.f15887;
        InterfaceC5796 interfaceC5796 = this.f15886;
        switch (i) {
            case 0:
                return interfaceC5796.mo9754(c5768);
            default:
                InterfaceC5778 interfaceC5778 = (InterfaceC5778) interfaceC5796.mo9754(c5768);
                InterfaceC4357 interfaceC4357 = (InterfaceC4357) objArr[objArr.length - 1];
                try {
                    C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
                    c5444.m10543();
                    c5444.m10541(new C5787(interfaceC5778, 2));
                    interfaceC5778.mo11163(new C5788(c5444, 2));
                    Object objM10540 = c5444.m10540();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM10540;
                } catch (Exception e) {
                    return AbstractC5785.m11183(e, interfaceC4357);
                }
        }
    }
}
