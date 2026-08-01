package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5178;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5948;
import kotlin.sequences.C5953;
import kotlin.sequences.C5956;
import kotlin.sequences.InterfaceC5959;
import p050.AbstractC7176;
import p082.C7706;
import p082.C7711;
import p082.InterfaceC7709;
import p095.AbstractC7818;
import p095.AbstractC7831;
import p095.C7835;
import p098.C7858;
import p098.C7864;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5455 implements InterfaceC7709 {
    @Override // p082.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ExternalOverridabilityCondition$Result mo9793(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132, AbstractC7818 abstractC7818) {
        interfaceC5313.getClass();
        interfaceC53132.getClass();
        if (interfaceC53132 instanceof C5397) {
            C5397 c5397 = (C5397) interfaceC53132;
            if (c5397.getTypeParameters().isEmpty()) {
                C7711 c7711M12707 = C7706.m12707(interfaceC5313, interfaceC53132);
                if ((c7711M12707 != null ? c7711M12707.m12718() : null) != null) {
                    return ExternalOverridabilityCondition$Result.UNKNOWN;
                }
                List listMo9594 = c5397.mo9594();
                listMo9594.getClass();
                C5953 c5953M10670 = AbstractC5954.m10670(new C5178(listMo9594, 1), C5440.f13804);
                AbstractC5714 abstractC5714 = c5397.f19130;
                abstractC5714.getClass();
                C5956 c5956M10675 = AbstractC5954.m10675(AbstractC5179.m9397(new InterfaceC5959[]{c5953M10670, new C5178(abstractC5714, 4)}));
                C7835 c7835 = c5397.f19128;
                List listM12489 = AbstractC7176.m12489(c7835 != null ? c7835.getType() : null);
                listM12489.getClass();
                C5948 c5948 = new C5948(AbstractC5954.m10675(AbstractC5179.m9397(new InterfaceC5959[]{c5956M10675, new C5178(listM12489, 1)})));
                while (c5948.hasNext()) {
                    AbstractC5714 abstractC57142 = (AbstractC5714) c5948.next();
                    if (!abstractC57142.mo10285().isEmpty() && !(abstractC57142.mo10331() instanceof C7864)) {
                        return ExternalOverridabilityCondition$Result.UNKNOWN;
                    }
                }
                InterfaceC5313 interfaceC5313Build = (InterfaceC5313) interfaceC5313.mo9564(new C5751(new C7858()));
                if (interfaceC5313Build == null) {
                    return ExternalOverridabilityCondition$Result.UNKNOWN;
                }
                if (interfaceC5313Build instanceof InterfaceC5303) {
                    InterfaceC5316 interfaceC5316 = (InterfaceC5303) interfaceC5313Build;
                    if (!((AbstractC7831) interfaceC5316).getTypeParameters().isEmpty()) {
                        interfaceC5313Build = interfaceC5316.mo9601().mo9644(EmptyList.INSTANCE).build();
                        interfaceC5313Build.getClass();
                    }
                }
                OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12718 = C7706.f18665.m12710(interfaceC5313Build, interfaceC53132, false).m12718();
                overridingUtil$OverrideCompatibilityInfo$ResultM12718.getClass();
                return AbstractC5456.f13877[overridingUtil$OverrideCompatibilityInfo$ResultM12718.ordinal()] == 1 ? ExternalOverridabilityCondition$Result.OVERRIDABLE : ExternalOverridabilityCondition$Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition$Result.UNKNOWN;
    }

    @Override // p082.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ExternalOverridabilityCondition$Contract mo9794() {
        return ExternalOverridabilityCondition$Contract.SUCCESS_ONLY;
    }
}
