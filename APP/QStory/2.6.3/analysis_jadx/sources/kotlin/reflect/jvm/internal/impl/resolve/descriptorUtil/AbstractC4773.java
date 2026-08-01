package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.alibaba.fastjson2.C2942;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p034.AbstractC6347;
import p046.InterfaceC6478;
import p049.AbstractC6530;
import p052.InterfaceC6558;
import p066.AbstractC6870;
import p079.AbstractC6986;
import p079.AbstractC6989;
import p079.AbstractC6994;
import p103.AbstractC7275;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4773 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f13909 = 0;

    static {
        C4691.m9330("value");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4688 m9498(InterfaceC4477 interfaceC4477) {
        InterfaceC4499 interfaceC4499Mo9028;
        C4688 c4688M9498;
        if (interfaceC4477 == null || (interfaceC4499Mo9028 = interfaceC4477.mo9028()) == null) {
            return null;
        }
        if (interfaceC4499Mo9028 instanceof InterfaceC4466) {
            C4687 c4687 = ((AbstractC6986) ((InterfaceC4466) interfaceC4499Mo9028)).f18687;
            C4691 name = interfaceC4477.getName();
            name.getClass();
            return new C4688(c4687, name);
        }
        if (!(interfaceC4499Mo9028 instanceof InterfaceC4496) || (c4688M9498 = m9498((InterfaceC4477) interfaceC4499Mo9028)) == null) {
            return null;
        }
        C4691 name2 = interfaceC4477.getName();
        name2.getClass();
        return c4688M9498.m9325(name2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC6530 m9499(InterfaceC4499 interfaceC4499) {
        interfaceC4499.getClass();
        InterfaceC4486 interfaceC4486M12104 = AbstractC6870.m12104(interfaceC4499);
        interfaceC4486M12104.getClass();
        return interfaceC4486M12104.mo9061();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final AbstractC6989 m9500(InterfaceC6478 interfaceC6478) {
        interfaceC6478.getClass();
        InterfaceC4477 interfaceC4477Mo9211 = interfaceC6478.getType().mo9722().mo9211();
        if (interfaceC4477Mo9211 instanceof AbstractC6989) {
            return (AbstractC6989) interfaceC4477Mo9211;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4687 m9501(InterfaceC4500 interfaceC4500) {
        interfaceC4500.getClass();
        C4686 c4686M12101 = AbstractC6870.m12101(interfaceC4500);
        c4686M12101.getClass();
        if (!c4686M12101.m9313()) {
            c4686M12101 = null;
        }
        if (c4686M12101 != null) {
            return c4686M12101.m9319();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4480 m9502(InterfaceC4480 interfaceC4480, InterfaceC6558 interfaceC6558) {
        interfaceC4480.getClass();
        return (InterfaceC4480) AbstractC7275.m12488(AbstractC6347.m11928(interfaceC4480), new C4776(1), new C4774(interfaceC6558, new Ref$ObjectRef()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m9503(InterfaceC4456 interfaceC4456) {
        Boolean boolM12492 = AbstractC7275.m12492(AbstractC6347.m11928(interfaceC4456), C4776.f13914, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        boolM12492.getClass();
        return boolM12492.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m9504(InterfaceC4486 interfaceC4486) {
        interfaceC4486.getClass();
        if (interfaceC4486.mo9065(AbstractC4860.f14143) == null) {
            return;
        }
        C2942.m6394();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4687 m9505(InterfaceC4499 interfaceC4499) {
        interfaceC4499.getClass();
        C4687 c4687M12114 = AbstractC6870.m12114(interfaceC4499);
        return c4687M12114 != null ? c4687M12114 : AbstractC6870.m12101(interfaceC4499.mo9028()).m9316(interfaceC4499.getName()).m9319();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC4480 m9506(InterfaceC4480 interfaceC4480) {
        interfaceC4480.getClass();
        if (!(interfaceC4480 instanceof AbstractC6994)) {
            return interfaceC4480;
        }
        InterfaceC4473 interfaceC4473M12326 = ((AbstractC6994) interfaceC4480).m12326();
        interfaceC4473M12326.getClass();
        return interfaceC4473M12326;
    }
}
