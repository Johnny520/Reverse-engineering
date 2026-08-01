package p082;

import io.ktor.util.C4211;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7030 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4870 m12368(InterfaceC4463 interfaceC4463, C7034 c7034, C4871 c4871, AbstractC4882 abstractC4882) {
        c7034.getClass();
        c4871.getClass();
        if (!c7034.f18877) {
            c7034 = c7034.m12370(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = AbstractC7031.f18867[c7034.f18878.ordinal()];
        if (i == 1) {
            return new C4885(abstractC4882, Variance.INVARIANT);
        }
        if (i != 2 && i != 3) {
            C4211.m8611();
            return null;
        }
        if (!interfaceC4463.mo9003().getAllowsOutPosition()) {
            return new C4885(AbstractC4773.m9499(interfaceC4463).m12031(), Variance.INVARIANT);
        }
        List parameters = abstractC4882.mo9722().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new C4885(abstractC4882, Variance.OUT_VARIANCE) : AbstractC4917.m9851(interfaceC4463, c7034);
    }
}
