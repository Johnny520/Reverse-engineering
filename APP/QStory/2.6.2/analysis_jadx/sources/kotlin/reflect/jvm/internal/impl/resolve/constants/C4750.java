package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p049.AbstractC6529;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4750 extends AbstractC4762 {
    public C4750(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    public final String toString() {
        return ((Number) this.f13901).intValue() + ".toByte()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        interfaceC4485.getClass();
        AbstractC6529 abstractC6529Mo9071 = interfaceC4485.mo9071();
        abstractC6529Mo9071.getClass();
        return abstractC6529Mo9071.m11984(PrimitiveType.BYTE);
    }
}
