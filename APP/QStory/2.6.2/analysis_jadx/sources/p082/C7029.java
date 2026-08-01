package p082;

import io.ktor.util.C4210;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7029 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4869 m12341(InterfaceC4462 interfaceC4462, C7033 c7033, C4870 c4870, AbstractC4881 abstractC4881) {
        c7033.getClass();
        c4870.getClass();
        if (!c7033.f18882) {
            c7033 = c7033.m12343(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = AbstractC7030.f18872[c7033.f18883.ordinal()];
        if (i == 1) {
            return new C4884(abstractC4881, Variance.INVARIANT);
        }
        if (i != 2 && i != 3) {
            C4210.m8621();
            return null;
        }
        if (!interfaceC4462.mo9013().getAllowsOutPosition()) {
            return new C4884(AbstractC4772.m9509(interfaceC4462).m11988(), Variance.INVARIANT);
        }
        List parameters = abstractC4881.mo9732().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new C4884(abstractC4881, Variance.OUT_VARIANCE) : AbstractC4916.m9857(interfaceC4462, c7033);
    }
}
