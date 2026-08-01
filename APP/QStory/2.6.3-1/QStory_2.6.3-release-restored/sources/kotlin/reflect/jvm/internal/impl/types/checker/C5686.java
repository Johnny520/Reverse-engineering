package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.AbstractC5709;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5704;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p113.InterfaceC8048;
import p113.InterfaceC8049;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5686 extends AbstractC5709 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5751 f14479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5685 f14480;

    public C5686(InterfaceC5685 interfaceC5685, C5751 c5751) {
        this.f14480 = interfaceC5685;
        this.f14479 = c5751;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5725
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC8048 mo10156(C5704 c5704, InterfaceC8049 interfaceC8049) {
        c5704.getClass();
        interfaceC8049.getClass();
        InterfaceC5685 interfaceC5685 = this.f14480;
        AbstractC5710 abstractC5710Mo10150 = interfaceC5685.mo10150(this.f14479.m10420((AbstractC5714) interfaceC5685.mo10164(interfaceC8049), Variance.INVARIANT));
        abstractC5710Mo10150.getClass();
        return abstractC5710Mo10150;
    }
}
