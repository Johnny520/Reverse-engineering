package retrofit2;

import androidx.window.area.AbstractC3400;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C6276;
import p023.C6956;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6621 extends AbstractC6614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6626 f16231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f16232;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6621(C6586 c6586, C6956 c6956, InterfaceC6619 interfaceC6619, InterfaceC6626 interfaceC6626, int i) {
        super(c6586, c6956, interfaceC6619);
        this.f16232 = i;
        this.f16231 = interfaceC6626;
    }

    @Override // retrofit2.AbstractC6614
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo11733(C6598 c6598, Object[] objArr) {
        int i = this.f16232;
        InterfaceC6626 interfaceC6626 = this.f16231;
        switch (i) {
            case 0:
                return interfaceC6626.mo10313(c6598);
            default:
                InterfaceC6608 interfaceC6608 = (InterfaceC6608) interfaceC6626.mo10313(c6598);
                InterfaceC5189 interfaceC5189 = (InterfaceC5189) objArr[objArr.length - 1];
                try {
                    C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
                    c6276.m11102();
                    c6276.m11100(new C6617(interfaceC6608, 2));
                    interfaceC6608.mo11722(new C6618(c6276, 2));
                    Object objM11099 = c6276.m11099();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM11099;
                } catch (Exception e) {
                    return AbstractC6615.m11742(e, interfaceC5189);
                }
        }
    }
}
