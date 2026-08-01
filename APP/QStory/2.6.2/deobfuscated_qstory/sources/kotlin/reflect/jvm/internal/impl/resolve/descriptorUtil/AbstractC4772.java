package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.alibaba.fastjson2.C2941;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4859;
import p046.InterfaceC6477;
import p049.AbstractC6529;
import p052.InterfaceC6557;
import p066.AbstractC6869;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p079.AbstractC6993;
import p103.AbstractC7274;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4772 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f13905 = 0;

    static {
        C4690.m9340("value");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4687 m9508(InterfaceC4476 interfaceC4476) {
        InterfaceC4498 interfaceC4498Mo9038;
        C4687 c4687M9508;
        if (interfaceC4476 == null || (interfaceC4498Mo9038 = interfaceC4476.mo9038()) == null) {
            return null;
        }
        if (interfaceC4498Mo9038 instanceof InterfaceC4465) {
            C4686 c4686 = ((AbstractC6985) ((InterfaceC4465) interfaceC4498Mo9038)).f18692;
            C4690 name = interfaceC4476.getName();
            name.getClass();
            return new C4687(c4686, name);
        }
        if (!(interfaceC4498Mo9038 instanceof InterfaceC4495) || (c4687M9508 = m9508((InterfaceC4476) interfaceC4498Mo9038)) == null) {
            return null;
        }
        C4690 name2 = interfaceC4476.getName();
        name2.getClass();
        return c4687M9508.m9335(name2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC6529 m9509(InterfaceC4498 interfaceC4498) {
        interfaceC4498.getClass();
        InterfaceC4485 interfaceC4485M12076 = AbstractC6869.m12076(interfaceC4498);
        interfaceC4485M12076.getClass();
        return interfaceC4485M12076.mo9071();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final AbstractC6988 m9510(InterfaceC6477 interfaceC6477) {
        interfaceC6477.getClass();
        InterfaceC4476 interfaceC4476Mo9221 = interfaceC6477.getType().mo9732().mo9221();
        if (interfaceC4476Mo9221 instanceof AbstractC6988) {
            return (AbstractC6988) interfaceC4476Mo9221;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4686 m9511(InterfaceC4499 interfaceC4499) {
        interfaceC4499.getClass();
        C4685 c4685M12073 = AbstractC6869.m12073(interfaceC4499);
        c4685M12073.getClass();
        if (!c4685M12073.m9323()) {
            c4685M12073 = null;
        }
        if (c4685M12073 != null) {
            return c4685M12073.m9329();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4479 m9512(InterfaceC4479 interfaceC4479, InterfaceC6557 interfaceC6557) {
        interfaceC4479.getClass();
        return (InterfaceC4479) AbstractC7274.m12461(AbstractC8189.m13660(interfaceC4479), new C4775(1), new C4773(interfaceC6557, new Ref$ObjectRef()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m9513(InterfaceC4455 interfaceC4455) {
        Boolean boolM12465 = AbstractC7274.m12465(AbstractC8189.m13660(interfaceC4455), C4775.f13910, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        boolM12465.getClass();
        return boolM12465.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m9514(InterfaceC4485 interfaceC4485) {
        interfaceC4485.getClass();
        if (interfaceC4485.mo9075(AbstractC4859.f14139) == null) {
            return;
        }
        C2941.m6336();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4686 m9515(InterfaceC4498 interfaceC4498) {
        interfaceC4498.getClass();
        C4686 c4686M12086 = AbstractC6869.m12086(interfaceC4498);
        return c4686M12086 != null ? c4686M12086 : AbstractC6869.m12073(interfaceC4498.mo9038()).m9326(interfaceC4498.getName()).m9329();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC4479 m9516(InterfaceC4479 interfaceC4479) {
        interfaceC4479.getClass();
        if (!(interfaceC4479 instanceof AbstractC6993)) {
            return interfaceC4479;
        }
        InterfaceC4472 interfaceC4472M12299 = ((AbstractC6993) interfaceC4479).m12299();
        interfaceC4472M12299.getClass();
        return interfaceC4472M12299;
    }
}
