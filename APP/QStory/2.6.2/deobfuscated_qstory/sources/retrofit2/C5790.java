package retrofit2;

import com.bumptech.glide.AbstractC3054;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C5443;
import p015.C6200;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5790 extends AbstractC5783 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5795 f15886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15887;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5790(C5755 c5755, C6200 c6200, InterfaceC5788 interfaceC5788, InterfaceC5795 interfaceC5795, int i) {
        super(c5755, c6200, interfaceC5788);
        this.f15887 = i;
        this.f15886 = interfaceC5795;
    }

    @Override // retrofit2.AbstractC5783
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo11117(C5767 c5767, Object[] objArr) {
        int i = this.f15887;
        InterfaceC5795 interfaceC5795 = this.f15886;
        switch (i) {
            case 0:
                return interfaceC5795.mo9762(c5767);
            default:
                InterfaceC5777 interfaceC5777 = (InterfaceC5777) interfaceC5795.mo9762(c5767);
                InterfaceC4356 interfaceC4356 = (InterfaceC4356) objArr[objArr.length - 1];
                try {
                    C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
                    c5443.m10539();
                    c5443.m10537(new C5786(interfaceC5777, 2));
                    interfaceC5777.mo11106(new C5787(c5443, 2));
                    Object objM10536 = c5443.m10536();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM10536;
                } catch (Exception e) {
                    return AbstractC5784.m11126(e, interfaceC4356);
                }
        }
    }
}
