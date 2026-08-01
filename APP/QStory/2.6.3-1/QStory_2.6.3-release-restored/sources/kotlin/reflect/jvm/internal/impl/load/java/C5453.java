package kotlin.reflect.jvm.internal.impl.load.java;

import com.bumptech.glide.AbstractC3887;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5432;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import p050.AbstractC7176;
import p065.AbstractC7359;
import p082.InterfaceC7709;
import p095.AbstractC7818;
import p095.AbstractC7838;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5453 implements InterfaceC7709 {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r4.equals(com.bumptech.glide.AbstractC3887.m7220(r0, 2)) != false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // p082.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExternalOverridabilityCondition$Result mo9793(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132, AbstractC7818 abstractC7818) {
        interfaceC5313.getClass();
        interfaceC53132.getClass();
        if ((interfaceC5313 instanceof InterfaceC5312) && (interfaceC53132 instanceof InterfaceC5316) && !AbstractC7359.m12571(interfaceC53132)) {
            int i = AbstractC5439.f13803;
            InterfaceC5316 interfaceC5316 = (InterfaceC5316) interfaceC53132;
            AbstractC7838 abstractC7838 = (AbstractC7838) interfaceC5316;
            C5523 name = abstractC7838.getName();
            name.getClass();
            if (!AbstractC5434.f13784.contains(name)) {
                ArrayList arrayList = AbstractC5434.f13788;
                C5523 name2 = abstractC7838.getName();
                name2.getClass();
                if (AbstractC5434.f13793.contains(name2)) {
                    InterfaceC5312 interfaceC5312M13634 = AbstractC8568.m13634((InterfaceC5312) interfaceC5313);
                    boolean z = interfaceC5313 instanceof InterfaceC5316;
                    InterfaceC5316 interfaceC53162 = z ? (InterfaceC5316) interfaceC5313 : null;
                    if ((interfaceC53162 != null && interfaceC5316.mo9599() == interfaceC53162.mo9599()) || (interfaceC5312M13634 != null && interfaceC5316.mo9599())) {
                        if ((abstractC7818 instanceof C5432) && interfaceC5316.mo9597() == null && interfaceC5312M13634 != null && !AbstractC8568.m13618(abstractC7818, interfaceC5312M13634)) {
                            if ((interfaceC5312M13634 instanceof InterfaceC5316) && z && AbstractC5439.m9776((InterfaceC5316) interfaceC5312M13634) != null) {
                                String strM7220 = AbstractC3887.m7220(interfaceC5316, 2);
                                InterfaceC5316 interfaceC5316Mo9561 = ((InterfaceC5316) interfaceC5313).mo9561();
                                interfaceC5316Mo9561.getClass();
                            }
                        }
                    }
                    return ExternalOverridabilityCondition$Result.INCOMPATIBLE;
                }
            }
        }
        return AbstractC7176.m12466(interfaceC5313, interfaceC53132) ? ExternalOverridabilityCondition$Result.INCOMPATIBLE : ExternalOverridabilityCondition$Result.UNKNOWN;
    }

    @Override // p082.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ExternalOverridabilityCondition$Contract mo9794() {
        return ExternalOverridabilityCondition$Contract.CONFLICTS_ONLY;
    }
}
