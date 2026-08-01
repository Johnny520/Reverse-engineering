package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.AbstractC4347;
import kotlin.collections.C4346;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5116;
import kotlin.sequences.C5121;
import kotlin.sequences.C5124;
import kotlin.sequences.InterfaceC5127;
import p034.AbstractC6347;
import p066.C6877;
import p066.C6882;
import p066.InterfaceC6880;
import p079.AbstractC6989;
import p079.AbstractC7002;
import p079.C7006;
import p082.C7029;
import p082.C7035;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4623 implements InterfaceC6880 {
    @Override // p066.InterfaceC6880
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ExternalOverridabilityCondition$Result mo9234(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812, AbstractC6989 abstractC6989) {
        interfaceC4481.getClass();
        interfaceC44812.getClass();
        if (interfaceC44812 instanceof C4565) {
            C4565 c4565 = (C4565) interfaceC44812;
            if (c4565.getTypeParameters().isEmpty()) {
                C6882 c6882M12148 = C6877.m12148(interfaceC4481, interfaceC44812);
                if ((c6882M12148 != null ? c6882M12148.m12159() : null) != null) {
                    return ExternalOverridabilityCondition$Result.UNKNOWN;
                }
                List listMo9035 = c4565.mo9035();
                listMo9035.getClass();
                C5121 c5121M10111 = AbstractC5122.m10111(new C4346(listMo9035, 1), C4608.f13459);
                AbstractC4882 abstractC4882 = c4565.f18785;
                abstractC4882.getClass();
                C5124 c5124M10116 = AbstractC5122.m10116(AbstractC4347.m8838(new InterfaceC5127[]{c5121M10111, new C4346(abstractC4882, 4)}));
                C7006 c7006 = c4565.f18783;
                List listM11930 = AbstractC6347.m11930(c7006 != null ? c7006.getType() : null);
                listM11930.getClass();
                C5116 c5116 = new C5116(AbstractC5122.m10116(AbstractC4347.m8838(new InterfaceC5127[]{c5124M10116, new C4346(listM11930, 1)})));
                while (c5116.hasNext()) {
                    AbstractC4882 abstractC48822 = (AbstractC4882) c5116.next();
                    if (!abstractC48822.mo9726().isEmpty() && !(abstractC48822.mo9772() instanceof C7035)) {
                        return ExternalOverridabilityCondition$Result.UNKNOWN;
                    }
                }
                InterfaceC4481 interfaceC4481Build = (InterfaceC4481) interfaceC4481.mo9005(new C4919(new C7029()));
                if (interfaceC4481Build == null) {
                    return ExternalOverridabilityCondition$Result.UNKNOWN;
                }
                if (interfaceC4481Build instanceof InterfaceC4471) {
                    InterfaceC4484 interfaceC4484 = (InterfaceC4471) interfaceC4481Build;
                    if (!((AbstractC7002) interfaceC4484).getTypeParameters().isEmpty()) {
                        interfaceC4481Build = interfaceC4484.mo9042().mo9085(EmptyList.INSTANCE).build();
                        interfaceC4481Build.getClass();
                    }
                }
                OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12159 = C6877.f18320.m12151(interfaceC4481Build, interfaceC44812, false).m12159();
                overridingUtil$OverrideCompatibilityInfo$ResultM12159.getClass();
                return AbstractC4624.f13532[overridingUtil$OverrideCompatibilityInfo$ResultM12159.ordinal()] == 1 ? ExternalOverridabilityCondition$Result.OVERRIDABLE : ExternalOverridabilityCondition$Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition$Result.UNKNOWN;
    }

    @Override // p066.InterfaceC6880
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ExternalOverridabilityCondition$Contract mo9235() {
        return ExternalOverridabilityCondition$Contract.SUCCESS_ONLY;
    }
}
