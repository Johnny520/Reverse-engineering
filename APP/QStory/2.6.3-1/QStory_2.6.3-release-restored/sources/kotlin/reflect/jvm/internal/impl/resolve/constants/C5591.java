package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.C5043;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p050.AbstractC7176;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p095.AbstractC7818;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5591 extends AbstractC5600 {
    public C5591(C5520 c5520, int i) {
        super(new C5588(new C5581(c5520, i)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        AbstractC5714 abstractC5714M13029;
        interfaceC5318.getClass();
        C5706.f14520.getClass();
        C5706 c5706 = C5706.f14521;
        AbstractC7359 abstractC7359Mo9620 = interfaceC5318.mo9620();
        abstractC7359Mo9620.getClass();
        AbstractC7818 abstractC7818M12598 = abstractC7359Mo9620.m12598(AbstractC7356.f18204.m9878());
        if (abstractC7818M12598 == null) {
            AbstractC7359.m12579(21);
            throw null;
        }
        Object obj = this.f14250;
        AbstractC5587 abstractC5587 = (AbstractC5587) obj;
        if (abstractC5587 instanceof C5596) {
            abstractC5714M13029 = ((C5596) obj).f14247;
        } else {
            if (!(abstractC5587 instanceof C5588)) {
                C5043.m9170();
                return null;
            }
            C5581 c5581 = ((C5588) obj).f14244;
            C5520 c5520 = c5581.f14241;
            int i = c5581.f14240;
            AbstractC7818 abstractC7818M9636 = AbstractC5323.m9636(interfaceC5318, c5520);
            if (abstractC7818M9636 == null) {
                abstractC5714M13029 = C8069.m13029(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, c5520.toString(), String.valueOf(i));
            } else {
                AbstractC5710 abstractC5710Mo9584 = abstractC7818M9636.mo9584();
                abstractC5710Mo9584.getClass();
                AbstractC5714 abstractC5714M6898 = AbstractC3738.m6898(abstractC5710Mo9584);
                for (int i2 = 0; i2 < i; i2++) {
                    abstractC5714M6898 = interfaceC5318.mo9620().m12593(abstractC5714M6898, Variance.INVARIANT);
                }
                abstractC5714M13029 = abstractC5714M6898;
            }
        }
        return AbstractC5725.m10373(c5706, abstractC7818M12598, AbstractC7176.m12487(new C5717(abstractC5714M13029)));
    }
}
