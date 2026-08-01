package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4872;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p097.InterfaceC7219;
import p097.InterfaceC7220;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4854 extends AbstractC4877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C4919 f14134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4853 f14135;

    public C4854(InterfaceC4853 interfaceC4853, C4919 c4919) {
        this.f14135 = interfaceC4853;
        this.f14134 = c4919;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4893
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC7219 mo9597(C4872 c4872, InterfaceC7220 interfaceC7220) {
        c4872.getClass();
        interfaceC7220.getClass();
        InterfaceC4853 interfaceC4853 = this.f14135;
        AbstractC4878 abstractC4878Mo9591 = interfaceC4853.mo9591(this.f14134.m9861((AbstractC4882) interfaceC4853.mo9605(interfaceC7220), Variance.INVARIANT));
        abstractC4878Mo9591.getClass();
        return abstractC4878Mo9591;
    }
}
