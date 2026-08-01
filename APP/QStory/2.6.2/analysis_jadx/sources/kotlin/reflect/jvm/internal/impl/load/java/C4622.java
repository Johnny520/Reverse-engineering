package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.collections.C4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5115;
import kotlin.sequences.C5120;
import kotlin.sequences.C5123;
import kotlin.sequences.InterfaceC5126;
import p066.C6876;
import p066.C6881;
import p066.InterfaceC6879;
import p079.AbstractC6988;
import p079.AbstractC7001;
import p079.C7005;
import p082.C7028;
import p082.C7034;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4622 implements InterfaceC6879 {
    @Override // p066.InterfaceC6879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ExternalOverridabilityCondition$Result mo9244(InterfaceC4480 interfaceC4480, InterfaceC4480 interfaceC44802, AbstractC6988 abstractC6988) {
        interfaceC4480.getClass();
        interfaceC44802.getClass();
        if (interfaceC44802 instanceof C4564) {
            C4564 c4564 = (C4564) interfaceC44802;
            if (c4564.getTypeParameters().isEmpty()) {
                C6881 c6881M12120 = C6876.m12120(interfaceC4480, interfaceC44802);
                if ((c6881M12120 != null ? c6881M12120.m12131() : null) != null) {
                    return ExternalOverridabilityCondition$Result.UNKNOWN;
                }
                List listMo9045 = c4564.mo9045();
                listMo9045.getClass();
                C5120 c5120M10111 = AbstractC5121.m10111(new C4345(listMo9045, 1), C4607.f13455);
                AbstractC4881 abstractC4881 = c4564.f18790;
                abstractC4881.getClass();
                C5123 c5123M10108 = AbstractC5121.m10108(AbstractC4346.m8841(new InterfaceC5126[]{c5120M10111, new C4345(abstractC4881, 4)}));
                C7005 c7005 = c4564.f18788;
                List listM13658 = AbstractC8189.m13658(c7005 != null ? c7005.getType() : null);
                listM13658.getClass();
                C5115 c5115 = new C5115(AbstractC5121.m10108(AbstractC4346.m8841(new InterfaceC5126[]{c5123M10108, new C4345(listM13658, 1)})));
                while (c5115.hasNext()) {
                    AbstractC4881 abstractC48812 = (AbstractC4881) c5115.next();
                    if (!abstractC48812.mo9736().isEmpty() && !(abstractC48812.mo9778() instanceof C7034)) {
                        return ExternalOverridabilityCondition$Result.UNKNOWN;
                    }
                }
                InterfaceC4480 interfaceC4480Build = (InterfaceC4480) interfaceC4480.mo9015(new C4918(new C7028()));
                if (interfaceC4480Build == null) {
                    return ExternalOverridabilityCondition$Result.UNKNOWN;
                }
                if (interfaceC4480Build instanceof InterfaceC4470) {
                    InterfaceC4483 interfaceC4483 = (InterfaceC4470) interfaceC4480Build;
                    if (!((AbstractC7001) interfaceC4483).getTypeParameters().isEmpty()) {
                        interfaceC4480Build = interfaceC4483.mo9052().mo9095(EmptyList.INSTANCE).build();
                        interfaceC4480Build.getClass();
                    }
                }
                OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12131 = C6876.f18325.m12123(interfaceC4480Build, interfaceC44802, false).m12131();
                overridingUtil$OverrideCompatibilityInfo$ResultM12131.getClass();
                return AbstractC4623.f13528[overridingUtil$OverrideCompatibilityInfo$ResultM12131.ordinal()] == 1 ? ExternalOverridabilityCondition$Result.OVERRIDABLE : ExternalOverridabilityCondition$Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition$Result.UNKNOWN;
    }

    @Override // p066.InterfaceC6879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ExternalOverridabilityCondition$Contract mo9245() {
        return ExternalOverridabilityCondition$Contract.SUCCESS_ONLY;
    }
}
