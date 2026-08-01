package p082;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.types.C4935;
import p034.AbstractC6347;
import p049.AbstractC6530;
import p079.AbstractC6989;
import p098.C7240;
import p101.InterfaceC7254;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7029 extends AbstractC4916 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7034 f18864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7034 f18865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4871 f18866 = new C4871(new C7030());

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f18865 = C8667.m14361(typeUsage, false, null, 5).m12370(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f18864 = C8667.m14361(typeUsage, false, null, 5).m12370(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4870 mo9732(AbstractC4882 abstractC4882) {
        return new C4885(m12366(abstractC4882, new C7034(TypeUsage.COMMON, false, false, null, 62)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC4882 m12366(AbstractC4882 abstractC4882, C7034 c7034) {
        InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
        if (interfaceC4477Mo9211 instanceof InterfaceC4463) {
            c7034.getClass();
            return m12366(this.f18866.m9755((InterfaceC4463) interfaceC4477Mo9211, C7034.m12369(c7034, null, true, null, null, 59)), c7034);
        }
        if (!(interfaceC4477Mo9211 instanceof AbstractC6989)) {
            C4211.m8592(interfaceC4477Mo9211, "Unexpected declaration kind: ");
            return null;
        }
        InterfaceC4477 interfaceC4477Mo92112 = AbstractC4893.m9807(abstractC4882).mo9722().mo9211();
        if (interfaceC4477Mo92112 instanceof AbstractC6989) {
            Pair pairM12367 = m12367(AbstractC4893.m9826(abstractC4882), (AbstractC6989) interfaceC4477Mo9211, f18865);
            AbstractC4878 abstractC4878 = (AbstractC4878) pairM12367.component1();
            boolean zBooleanValue = ((Boolean) pairM12367.component2()).booleanValue();
            Pair pairM123672 = m12367(AbstractC4893.m9807(abstractC4882), (AbstractC6989) interfaceC4477Mo92112, f18864);
            AbstractC4878 abstractC48782 = (AbstractC4878) pairM123672.component1();
            return (zBooleanValue || ((Boolean) pairM123672.component2()).booleanValue()) ? new C7035(abstractC4878, abstractC48782) : AbstractC4893.m9809(abstractC4878, abstractC48782);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC4477Mo92112 + "\" while for lower it's \"" + interfaceC4477Mo9211 + '\"').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Pair m12367(AbstractC4878 abstractC4878, AbstractC6989 abstractC6989, C7034 c7034) {
        if (abstractC4878.mo9722().getParameters().isEmpty()) {
            return new Pair(abstractC4878, Boolean.FALSE);
        }
        if (AbstractC6530.m12013(abstractC4878)) {
            AbstractC4870 abstractC4870 = (AbstractC4870) abstractC4878.mo9726().get(0);
            Variance varianceMo9742 = abstractC4870.mo9742();
            AbstractC4882 abstractC4882Mo9741 = abstractC4870.mo9741();
            abstractC4882Mo9741.getClass();
            return new Pair(AbstractC4893.m9818(AbstractC6347.m11928(new C4885(m12366(abstractC4882Mo9741, c7034), varianceMo9742)), abstractC4878.mo9723(), abstractC4878.mo9722(), abstractC4878.mo9725()), Boolean.FALSE);
        }
        if (AbstractC4893.m9829(abstractC4878)) {
            return new Pair(C7240.m12470(ErrorTypeKind.ERROR_RAW_TYPE, abstractC4878.mo9722().toString()), Boolean.FALSE);
        }
        InterfaceC7254 interfaceC7254Mo12309 = abstractC6989.mo12309(this);
        interfaceC7254Mo12309.getClass();
        C4874 c4874Mo9723 = abstractC4878.mo9723();
        InterfaceC4873 interfaceC4873Mo9001 = abstractC6989.mo9001();
        interfaceC4873Mo9001.getClass();
        List<InterfaceC4463> parameters = abstractC6989.mo9001().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(parameters, 10));
        for (InterfaceC4463 interfaceC4463 : parameters) {
            interfaceC4463.getClass();
            C4871 c4871 = this.f18866;
            arrayList.add(C7030.m12368(interfaceC4463, c7034, c4871, c4871.m9755(interfaceC4463, c7034)));
        }
        return new Pair(AbstractC4893.m9816(c4874Mo9723, interfaceC4873Mo9001, arrayList, abstractC4878.mo9725(), interfaceC7254Mo12309, new C4935(abstractC6989, this, abstractC4878, c7034)), Boolean.TRUE);
    }
}
