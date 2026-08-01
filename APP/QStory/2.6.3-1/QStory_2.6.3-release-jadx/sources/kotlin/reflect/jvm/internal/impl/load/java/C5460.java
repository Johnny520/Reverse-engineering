package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import p082.InterfaceC7709;
import p095.AbstractC7818;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5460 implements InterfaceC7709 {
    @Override // p082.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ExternalOverridabilityCondition$Result mo9793(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132, AbstractC7818 abstractC7818) {
        interfaceC5313.getClass();
        interfaceC53132.getClass();
        if (!(interfaceC53132 instanceof InterfaceC5305) || !(interfaceC5313 instanceof InterfaceC5305)) {
            return ExternalOverridabilityCondition$Result.UNKNOWN;
        }
        InterfaceC5305 interfaceC5305 = (InterfaceC5305) interfaceC53132;
        InterfaceC5305 interfaceC53052 = (InterfaceC5305) interfaceC5313;
        return !AbstractC5227.m9466(interfaceC5305.getName(), interfaceC53052.getName()) ? ExternalOverridabilityCondition$Result.UNKNOWN : (C9496.m14938(interfaceC5305) && C9496.m14938(interfaceC53052)) ? ExternalOverridabilityCondition$Result.OVERRIDABLE : (C9496.m14938(interfaceC5305) || C9496.m14938(interfaceC53052)) ? ExternalOverridabilityCondition$Result.INCOMPATIBLE : ExternalOverridabilityCondition$Result.UNKNOWN;
    }

    @Override // p082.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ExternalOverridabilityCondition$Contract mo9794() {
        return ExternalOverridabilityCondition$Contract.BOTH;
    }
}
