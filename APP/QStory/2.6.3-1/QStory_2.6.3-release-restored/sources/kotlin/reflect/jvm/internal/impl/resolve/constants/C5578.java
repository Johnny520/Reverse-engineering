package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p065.AbstractC7356;
import p095.AbstractC7818;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5578 extends AbstractC5595 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f14238 = 0;

    public C5578(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    public final String toString() {
        int i = this.f14238;
        Object obj = this.f14250;
        switch (i) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        AbstractC5710 abstractC5710Mo9584;
        AbstractC5710 abstractC5710Mo95842;
        AbstractC5710 abstractC5710Mo95843;
        AbstractC5710 abstractC5710Mo95844;
        int i = this.f14238;
        interfaceC5318.getClass();
        switch (i) {
            case 0:
                AbstractC7818 abstractC7818M9636 = AbstractC5323.m9636(interfaceC5318, AbstractC7356.f18206);
                return (abstractC7818M9636 == null || (abstractC5710Mo9584 = abstractC7818M9636.mo9584()) == null) ? C8069.m13029(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UByte") : abstractC5710Mo9584;
            case 1:
                AbstractC7818 abstractC7818M96362 = AbstractC5323.m9636(interfaceC5318, AbstractC7356.f18201);
                return (abstractC7818M96362 == null || (abstractC5710Mo95842 = abstractC7818M96362.mo9584()) == null) ? C8069.m13029(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : abstractC5710Mo95842;
            case 2:
                AbstractC7818 abstractC7818M96363 = AbstractC5323.m9636(interfaceC5318, AbstractC7356.f18202);
                return (abstractC7818M96363 == null || (abstractC5710Mo95843 = abstractC7818M96363.mo9584()) == null) ? C8069.m13029(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : abstractC5710Mo95843;
            default:
                AbstractC7818 abstractC7818M96364 = AbstractC5323.m9636(interfaceC5318, AbstractC7356.f18205);
                return (abstractC7818M96364 == null || (abstractC5710Mo95844 = abstractC7818M96364.mo9584()) == null) ? C8069.m13029(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UShort") : abstractC5710Mo95844;
        }
    }

    public C5578(short s) {
        super(Short.valueOf(s));
    }

    public C5578(int i) {
        super(Integer.valueOf(i));
    }

    public C5578(long j) {
        super(Long.valueOf(j));
    }
}
