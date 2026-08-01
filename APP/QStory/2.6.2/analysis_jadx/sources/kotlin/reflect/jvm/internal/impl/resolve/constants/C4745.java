package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6526;
import p079.AbstractC6988;
import p098.C7239;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4745 extends AbstractC4762 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13889 = 0;

    public C4745(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    public final String toString() {
        int i = this.f13889;
        Object obj = this.f13901;
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

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        AbstractC4877 abstractC4877Mo9035;
        AbstractC4877 abstractC4877Mo90352;
        AbstractC4877 abstractC4877Mo90353;
        AbstractC4877 abstractC4877Mo90354;
        int i = this.f13889;
        interfaceC4485.getClass();
        switch (i) {
            case 0:
                AbstractC6988 abstractC6988M9087 = AbstractC4490.m9087(interfaceC4485, AbstractC6526.f17865);
                return (abstractC6988M9087 == null || (abstractC4877Mo9035 = abstractC6988M9087.mo9035()) == null) ? C7239.m12443(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UByte") : abstractC4877Mo9035;
            case 1:
                AbstractC6988 abstractC6988M90872 = AbstractC4490.m9087(interfaceC4485, AbstractC6526.f17860);
                return (abstractC6988M90872 == null || (abstractC4877Mo90352 = abstractC6988M90872.mo9035()) == null) ? C7239.m12443(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : abstractC4877Mo90352;
            case 2:
                AbstractC6988 abstractC6988M90873 = AbstractC4490.m9087(interfaceC4485, AbstractC6526.f17861);
                return (abstractC6988M90873 == null || (abstractC4877Mo90353 = abstractC6988M90873.mo9035()) == null) ? C7239.m12443(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : abstractC4877Mo90353;
            default:
                AbstractC6988 abstractC6988M90874 = AbstractC4490.m9087(interfaceC4485, AbstractC6526.f17864);
                return (abstractC6988M90874 == null || (abstractC4877Mo90354 = abstractC6988M90874.mo9035()) == null) ? C7239.m12443(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UShort") : abstractC4877Mo90354;
        }
    }

    public C4745(short s) {
        super(Short.valueOf(s));
    }

    public C4745(int i) {
        super(Integer.valueOf(i));
    }

    public C4745(long j) {
        super(Long.valueOf(j));
    }
}
