package kotlin.reflect.jvm.internal.impl.load.java;

import com.bumptech.glide.AbstractC3054;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import p066.InterfaceC6879;
import p079.AbstractC6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4627 implements InterfaceC6879 {
    @Override // p066.InterfaceC6879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ExternalOverridabilityCondition$Result mo9244(InterfaceC4480 interfaceC4480, InterfaceC4480 interfaceC44802, AbstractC6988 abstractC6988) {
        interfaceC4480.getClass();
        interfaceC44802.getClass();
        if (!(interfaceC44802 instanceof InterfaceC4472) || !(interfaceC4480 instanceof InterfaceC4472)) {
            return ExternalOverridabilityCondition$Result.UNKNOWN;
        }
        InterfaceC4472 interfaceC4472 = (InterfaceC4472) interfaceC44802;
        InterfaceC4472 interfaceC44722 = (InterfaceC4472) interfaceC4480;
        return !AbstractC4394.m8917(interfaceC4472.getName(), interfaceC44722.getName()) ? ExternalOverridabilityCondition$Result.UNKNOWN : (AbstractC3054.m6601(interfaceC4472) && AbstractC3054.m6601(interfaceC44722)) ? ExternalOverridabilityCondition$Result.OVERRIDABLE : (AbstractC3054.m6601(interfaceC4472) || AbstractC3054.m6601(interfaceC44722)) ? ExternalOverridabilityCondition$Result.INCOMPATIBLE : ExternalOverridabilityCondition$Result.UNKNOWN;
    }

    @Override // p066.InterfaceC6879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ExternalOverridabilityCondition$Contract mo9245() {
        return ExternalOverridabilityCondition$Contract.BOTH;
    }
}
