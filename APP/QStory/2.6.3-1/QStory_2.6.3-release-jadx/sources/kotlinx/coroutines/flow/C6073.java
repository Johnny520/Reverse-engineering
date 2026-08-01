package kotlinx.coroutines.flow;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.C6068;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6073 implements InterfaceC6151 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f15187;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6068 f15188;

    public C6073(C6068 c6068, InterfaceC7383 interfaceC7383) {
        this.f15188 = c6068;
        this.f15187 = interfaceC7383;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objMo9012 = this.f15188.mo9012(new C6072(new Ref$BooleanRef(), interfaceC6150, this.f15187), interfaceC5189);
        return objMo9012 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9012 : C6008.f15084;
    }
}
