package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import p066.InterfaceC6880;
import p079.AbstractC6989;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4628 implements InterfaceC6880 {
    @Override // p066.InterfaceC6880
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ExternalOverridabilityCondition$Result mo9234(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812, AbstractC6989 abstractC6989) {
        interfaceC4481.getClass();
        interfaceC44812.getClass();
        if (!(interfaceC44812 instanceof InterfaceC4473) || !(interfaceC4481 instanceof InterfaceC4473)) {
            return ExternalOverridabilityCondition$Result.UNKNOWN;
        }
        InterfaceC4473 interfaceC4473 = (InterfaceC4473) interfaceC44812;
        InterfaceC4473 interfaceC44732 = (InterfaceC4473) interfaceC4481;
        return !AbstractC4395.m8907(interfaceC4473.getName(), interfaceC44732.getName()) ? ExternalOverridabilityCondition$Result.UNKNOWN : (C8667.m14379(interfaceC4473) && C8667.m14379(interfaceC44732)) ? ExternalOverridabilityCondition$Result.OVERRIDABLE : (C8667.m14379(interfaceC4473) || C8667.m14379(interfaceC44732)) ? ExternalOverridabilityCondition$Result.INCOMPATIBLE : ExternalOverridabilityCondition$Result.UNKNOWN;
    }

    @Override // p066.InterfaceC6880
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ExternalOverridabilityCondition$Contract mo9235() {
        return ExternalOverridabilityCondition$Contract.BOTH;
    }
}
