package p082;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4915;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.reflect.jvm.internal.types.C4934;
import p049.AbstractC6529;
import p079.AbstractC6988;
import p098.C7239;
import p101.InterfaceC7253;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7028 extends AbstractC4915 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7033 f18869;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7033 f18870;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4870 f18871 = new C4870(new C7029());

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f18870 = AbstractC4921.m9872(typeUsage, false, null, 5).m12343(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f18869 = AbstractC4921.m9872(typeUsage, false, null, 5).m12343(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4869 mo9742(AbstractC4881 abstractC4881) {
        return new C4884(m12339(abstractC4881, new C7033(TypeUsage.COMMON, false, false, null, 62)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC4881 m12339(AbstractC4881 abstractC4881, C7033 c7033) {
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        if (interfaceC4476Mo9221 instanceof InterfaceC4462) {
            c7033.getClass();
            return m12339(this.f18871.m9763((InterfaceC4462) interfaceC4476Mo9221, C7033.m12342(c7033, null, true, null, null, 59)), c7033);
        }
        if (!(interfaceC4476Mo9221 instanceof AbstractC6988)) {
            C4210.m8602(interfaceC4476Mo9221, "Unexpected declaration kind: ");
            return null;
        }
        InterfaceC4476 interfaceC4476Mo92212 = AbstractC4892.m9813(abstractC4881).mo9732().mo9221();
        if (interfaceC4476Mo92212 instanceof AbstractC6988) {
            Pair pairM12340 = m12340(AbstractC4892.m9832(abstractC4881), (AbstractC6988) interfaceC4476Mo9221, f18870);
            AbstractC4877 abstractC4877 = (AbstractC4877) pairM12340.component1();
            boolean zBooleanValue = ((Boolean) pairM12340.component2()).booleanValue();
            Pair pairM123402 = m12340(AbstractC4892.m9813(abstractC4881), (AbstractC6988) interfaceC4476Mo92212, f18869);
            AbstractC4877 abstractC48772 = (AbstractC4877) pairM123402.component1();
            return (zBooleanValue || ((Boolean) pairM123402.component2()).booleanValue()) ? new C7034(abstractC4877, abstractC48772) : AbstractC4892.m9815(abstractC4877, abstractC48772);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC4476Mo92212 + "\" while for lower it's \"" + interfaceC4476Mo9221 + '\"').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Pair m12340(AbstractC4877 abstractC4877, AbstractC6988 abstractC6988, C7033 c7033) {
        if (abstractC4877.mo9732().getParameters().isEmpty()) {
            return new Pair(abstractC4877, Boolean.FALSE);
        }
        if (AbstractC6529.m11970(abstractC4877)) {
            AbstractC4869 abstractC4869 = (AbstractC4869) abstractC4877.mo9736().get(0);
            Variance varianceMo9752 = abstractC4869.mo9752();
            AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9751();
            abstractC4881Mo9751.getClass();
            return new Pair(AbstractC4892.m9824(AbstractC8189.m13660(new C4884(m12339(abstractC4881Mo9751, c7033), varianceMo9752)), abstractC4877.mo9733(), abstractC4877.mo9732(), abstractC4877.mo9735()), Boolean.FALSE);
        }
        if (AbstractC4892.m9835(abstractC4877)) {
            return new Pair(C7239.m12443(ErrorTypeKind.ERROR_RAW_TYPE, abstractC4877.mo9732().toString()), Boolean.FALSE);
        }
        InterfaceC7253 interfaceC7253Mo12282 = abstractC6988.mo12282(this);
        interfaceC7253Mo12282.getClass();
        C4873 c4873Mo9733 = abstractC4877.mo9733();
        InterfaceC4872 interfaceC4872Mo9011 = abstractC6988.mo9011();
        interfaceC4872Mo9011.getClass();
        List<InterfaceC4462> parameters = abstractC6988.mo9011().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(parameters, 10));
        for (InterfaceC4462 interfaceC4462 : parameters) {
            interfaceC4462.getClass();
            C4870 c4870 = this.f18871;
            arrayList.add(C7029.m12341(interfaceC4462, c7033, c4870, c4870.m9763(interfaceC4462, c7033)));
        }
        return new Pair(AbstractC4892.m9822(c4873Mo9733, interfaceC4872Mo9011, arrayList, abstractC4877.mo9735(), interfaceC7253Mo12282, new C4934(abstractC6988, this, abstractC4877, c7033)), Boolean.TRUE);
    }
}
