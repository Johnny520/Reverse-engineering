package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p049.AbstractC6530;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4751 extends AbstractC4763 {
    public C4751(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    public final String toString() {
        return ((Number) this.f13905).intValue() + ".toByte()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        interfaceC4486.getClass();
        AbstractC6530 abstractC6530Mo9061 = interfaceC4486.mo9061();
        abstractC6530Mo9061.getClass();
        return abstractC6530Mo9061.m12027(PrimitiveType.BYTE);
    }
}
