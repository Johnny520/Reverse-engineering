package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6527;
import p079.AbstractC6989;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4746 extends AbstractC4763 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13893 = 0;

    public C4746(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    public final String toString() {
        int i = this.f13893;
        Object obj = this.f13905;
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

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        AbstractC4878 abstractC4878Mo9025;
        AbstractC4878 abstractC4878Mo90252;
        AbstractC4878 abstractC4878Mo90253;
        AbstractC4878 abstractC4878Mo90254;
        int i = this.f13893;
        interfaceC4486.getClass();
        switch (i) {
            case 0:
                AbstractC6989 abstractC6989M9077 = AbstractC4491.m9077(interfaceC4486, AbstractC6527.f17861);
                return (abstractC6989M9077 == null || (abstractC4878Mo9025 = abstractC6989M9077.mo9025()) == null) ? C7240.m12470(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UByte") : abstractC4878Mo9025;
            case 1:
                AbstractC6989 abstractC6989M90772 = AbstractC4491.m9077(interfaceC4486, AbstractC6527.f17856);
                return (abstractC6989M90772 == null || (abstractC4878Mo90252 = abstractC6989M90772.mo9025()) == null) ? C7240.m12470(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : abstractC4878Mo90252;
            case 2:
                AbstractC6989 abstractC6989M90773 = AbstractC4491.m9077(interfaceC4486, AbstractC6527.f17857);
                return (abstractC6989M90773 == null || (abstractC4878Mo90253 = abstractC6989M90773.mo9025()) == null) ? C7240.m12470(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : abstractC4878Mo90253;
            default:
                AbstractC6989 abstractC6989M90774 = AbstractC4491.m9077(interfaceC4486, AbstractC6527.f17860);
                return (abstractC6989M90774 == null || (abstractC4878Mo90254 = abstractC6989M90774.mo9025()) == null) ? C7240.m12470(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UShort") : abstractC4878Mo90254;
        }
    }

    public C4746(short s) {
        super(Short.valueOf(s));
    }

    public C4746(int i) {
        super(Integer.valueOf(i));
    }

    public C4746(long j) {
        super(Long.valueOf(j));
    }
}
