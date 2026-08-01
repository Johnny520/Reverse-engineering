package kotlin.reflect.jvm.internal.impl.resolve.constants;

import io.ktor.util.C4210;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p079.AbstractC6988;
import p098.C7239;
import p175.AbstractC7738;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4758 extends AbstractC4767 {
    public C4758(C4687 c4687, int i) {
        super(new C4755(new C4748(c4687, i)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        AbstractC4881 abstractC4881M12443;
        interfaceC4485.getClass();
        C4873.f14171.getClass();
        C4873 c4873 = C4873.f14172;
        AbstractC6529 abstractC6529Mo9071 = interfaceC4485.mo9071();
        abstractC6529Mo9071.getClass();
        AbstractC6988 abstractC6988M11996 = abstractC6529Mo9071.m11996(AbstractC6526.f17863.m9329());
        if (abstractC6988M11996 == null) {
            AbstractC6529.m11977(21);
            throw null;
        }
        Object obj = this.f13901;
        AbstractC4754 abstractC4754 = (AbstractC4754) obj;
        if (abstractC4754 instanceof C4763) {
            abstractC4881M12443 = ((C4763) obj).f13898;
        } else {
            if (!(abstractC4754 instanceof C4755)) {
                C4210.m8621();
                return null;
            }
            C4748 c4748 = ((C4755) obj).f13895;
            C4687 c4687 = c4748.f13892;
            int i = c4748.f13891;
            AbstractC6988 abstractC6988M9087 = AbstractC4490.m9087(interfaceC4485, c4687);
            if (abstractC6988M9087 == null) {
                abstractC4881M12443 = C7239.m12443(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, c4687.toString(), String.valueOf(i));
            } else {
                AbstractC4877 abstractC4877Mo9035 = abstractC6988M9087.mo9035();
                abstractC4877Mo9035.getClass();
                AbstractC4881 abstractC4881M13033 = AbstractC7738.m13033(abstractC4877Mo9035);
                for (int i2 = 0; i2 < i; i2++) {
                    abstractC4881M13033 = interfaceC4485.mo9071().m11991(abstractC4881M13033, Variance.INVARIANT);
                }
                abstractC4881M12443 = abstractC4881M13033;
            }
        }
        return AbstractC4892.m9820(c4873, abstractC6988M11996, AbstractC8189.m13660(new C4884(abstractC4881M12443)));
    }
}
