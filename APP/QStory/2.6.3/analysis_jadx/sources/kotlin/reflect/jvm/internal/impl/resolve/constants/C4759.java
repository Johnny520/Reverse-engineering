package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.util.C4211;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p034.AbstractC6347;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p079.AbstractC6989;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4759 extends AbstractC4768 {
    public C4759(C4688 c4688, int i) {
        super(new C4756(new C4749(c4688, i)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        AbstractC4882 abstractC4882M12470;
        interfaceC4486.getClass();
        C4874.f14175.getClass();
        C4874 c4874 = C4874.f14176;
        AbstractC6530 abstractC6530Mo9061 = interfaceC4486.mo9061();
        abstractC6530Mo9061.getClass();
        AbstractC6989 abstractC6989M12039 = abstractC6530Mo9061.m12039(AbstractC6527.f17859.m9319());
        if (abstractC6989M12039 == null) {
            AbstractC6530.m12020(21);
            throw null;
        }
        Object obj = this.f13905;
        AbstractC4755 abstractC4755 = (AbstractC4755) obj;
        if (abstractC4755 instanceof C4764) {
            abstractC4882M12470 = ((C4764) obj).f13902;
        } else {
            if (!(abstractC4755 instanceof C4756)) {
                C4211.m8611();
                return null;
            }
            C4749 c4749 = ((C4756) obj).f13899;
            C4688 c4688 = c4749.f13896;
            int i = c4749.f13895;
            AbstractC6989 abstractC6989M9077 = AbstractC4491.m9077(interfaceC4486, c4688);
            if (abstractC6989M9077 == null) {
                abstractC4882M12470 = C7240.m12470(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, c4688.toString(), String.valueOf(i));
            } else {
                AbstractC4878 abstractC4878Mo9025 = abstractC6989M9077.mo9025();
                abstractC4878Mo9025.getClass();
                AbstractC4882 abstractC4882M6338 = AbstractC2905.m6338(abstractC4878Mo9025);
                for (int i2 = 0; i2 < i; i2++) {
                    abstractC4882M6338 = interfaceC4486.mo9061().m12034(abstractC4882M6338, Variance.INVARIANT);
                }
                abstractC4882M12470 = abstractC4882M6338;
            }
        }
        return AbstractC4893.m9814(c4874, abstractC6989M12039, AbstractC6347.m11928(new C4885(abstractC4882M12470)));
    }
}
