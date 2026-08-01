package p098;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5748;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.types.C5767;
import p050.AbstractC7176;
import p065.AbstractC7359;
import p095.AbstractC7818;
import p114.C8069;
import p117.InterfaceC8083;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7858 extends AbstractC5748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7863 f19209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7863 f19210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5703 f19211 = new C5703(new C7859());

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f19210 = C9496.m14920(typeUsage, false, null, 5).m12929(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f19209 = C9496.m14920(typeUsage, false, null, 5).m12929(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC5702 mo10291(AbstractC5714 abstractC5714) {
        return new C5717(m12925(abstractC5714, new C7863(TypeUsage.COMMON, false, false, null, 62)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC5714 m12925(AbstractC5714 abstractC5714, C7863 c7863) {
        InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
        if (interfaceC5309Mo9770 instanceof InterfaceC5295) {
            c7863.getClass();
            return m12925(this.f19211.m10314((InterfaceC5295) interfaceC5309Mo9770, C7863.m12928(c7863, null, true, null, null, 59)), c7863);
        }
        if (!(interfaceC5309Mo9770 instanceof AbstractC7818)) {
            C5043.m9151(interfaceC5309Mo9770, "Unexpected declaration kind: ");
            return null;
        }
        InterfaceC5309 interfaceC5309Mo97702 = AbstractC5725.m10366(abstractC5714).mo10281().mo9770();
        if (interfaceC5309Mo97702 instanceof AbstractC7818) {
            Pair pairM12926 = m12926(AbstractC5725.m10385(abstractC5714), (AbstractC7818) interfaceC5309Mo9770, f19210);
            AbstractC5710 abstractC5710 = (AbstractC5710) pairM12926.component1();
            boolean zBooleanValue = ((Boolean) pairM12926.component2()).booleanValue();
            Pair pairM129262 = m12926(AbstractC5725.m10366(abstractC5714), (AbstractC7818) interfaceC5309Mo97702, f19209);
            AbstractC5710 abstractC57102 = (AbstractC5710) pairM129262.component1();
            return (zBooleanValue || ((Boolean) pairM129262.component2()).booleanValue()) ? new C7864(abstractC5710, abstractC57102) : AbstractC5725.m10368(abstractC5710, abstractC57102);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC5309Mo97702 + "\" while for lower it's \"" + interfaceC5309Mo9770 + '\"').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Pair m12926(AbstractC5710 abstractC5710, AbstractC7818 abstractC7818, C7863 c7863) {
        if (abstractC5710.mo10281().getParameters().isEmpty()) {
            return new Pair(abstractC5710, Boolean.FALSE);
        }
        if (AbstractC7359.m12572(abstractC5710)) {
            AbstractC5702 abstractC5702 = (AbstractC5702) abstractC5710.mo10285().get(0);
            Variance varianceMo10301 = abstractC5702.mo10301();
            AbstractC5714 abstractC5714Mo10300 = abstractC5702.mo10300();
            abstractC5714Mo10300.getClass();
            return new Pair(AbstractC5725.m10377(AbstractC7176.m12487(new C5717(m12925(abstractC5714Mo10300, c7863), varianceMo10301)), abstractC5710.mo10282(), abstractC5710.mo10281(), abstractC5710.mo10284()), Boolean.FALSE);
        }
        if (AbstractC5725.m10388(abstractC5710)) {
            return new Pair(C8069.m13029(ErrorTypeKind.ERROR_RAW_TYPE, abstractC5710.mo10281().toString()), Boolean.FALSE);
        }
        InterfaceC8083 interfaceC8083Mo12868 = abstractC7818.mo12868(this);
        interfaceC8083Mo12868.getClass();
        C5706 c5706Mo10282 = abstractC5710.mo10282();
        InterfaceC5705 interfaceC5705Mo9560 = abstractC7818.mo9560();
        interfaceC5705Mo9560.getClass();
        List<InterfaceC5295> parameters = abstractC7818.mo9560().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(parameters, 10));
        for (InterfaceC5295 interfaceC5295 : parameters) {
            interfaceC5295.getClass();
            C5703 c5703 = this.f19211;
            arrayList.add(C7859.m12927(interfaceC5295, c7863, c5703, c5703.m10314(interfaceC5295, c7863)));
        }
        return new Pair(AbstractC5725.m10375(c5706Mo10282, interfaceC5705Mo9560, arrayList, abstractC5710.mo10284(), interfaceC8083Mo12868, new C5767(abstractC7818, this, abstractC5710, c7863)), Boolean.TRUE);
    }
}
