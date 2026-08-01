package p098;

import io.ktor.util.C5043;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7859 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC5702 m12927(InterfaceC5295 interfaceC5295, C7863 c7863, C5703 c5703, AbstractC5714 abstractC5714) {
        c7863.getClass();
        c5703.getClass();
        if (!c7863.f19222) {
            c7863 = c7863.m12929(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = AbstractC7860.f19212[c7863.f19223.ordinal()];
        if (i == 1) {
            return new C5717(abstractC5714, Variance.INVARIANT);
        }
        if (i != 2 && i != 3) {
            C5043.m9170();
            return null;
        }
        if (!interfaceC5295.mo9562().getAllowsOutPosition()) {
            return new C5717(AbstractC5605.m10058(interfaceC5295).m12590(), Variance.INVARIANT);
        }
        List parameters = abstractC5714.mo10281().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new C5717(abstractC5714, Variance.OUT_VARIANCE) : AbstractC5749.m10410(interfaceC5295, c7863);
    }
}
