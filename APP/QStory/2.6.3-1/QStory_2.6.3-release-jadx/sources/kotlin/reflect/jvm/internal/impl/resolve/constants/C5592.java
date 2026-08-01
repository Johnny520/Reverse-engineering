package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p065.AbstractC7359;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5592 extends AbstractC5595 {
    public C5592(long j) {
        super(Long.valueOf(j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    public final String toString() {
        return ((Number) this.f14250).longValue() + ".toLong()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        interfaceC5318.getClass();
        AbstractC7359 abstractC7359Mo9620 = interfaceC5318.mo9620();
        abstractC7359Mo9620.getClass();
        return abstractC7359Mo9620.m12586(PrimitiveType.LONG);
    }
}
