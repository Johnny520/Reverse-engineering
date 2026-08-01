package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.alibaba.fastjson2.C3775;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5692;
import p050.AbstractC7176;
import p062.InterfaceC7307;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p082.AbstractC7699;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p095.AbstractC7823;
import p119.AbstractC8104;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5605 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f14254 = 0;

    static {
        C5523.m9889("value");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5520 m10057(InterfaceC5309 interfaceC5309) {
        InterfaceC5331 interfaceC5331Mo9587;
        C5520 c5520M10057;
        if (interfaceC5309 == null || (interfaceC5331Mo9587 = interfaceC5309.mo9587()) == null) {
            return null;
        }
        if (interfaceC5331Mo9587 instanceof InterfaceC5298) {
            C5519 c5519 = ((AbstractC7815) ((InterfaceC5298) interfaceC5331Mo9587)).f19032;
            C5523 name = interfaceC5309.getName();
            name.getClass();
            return new C5520(c5519, name);
        }
        if (!(interfaceC5331Mo9587 instanceof InterfaceC5328) || (c5520M10057 = m10057((InterfaceC5309) interfaceC5331Mo9587)) == null) {
            return null;
        }
        C5523 name2 = interfaceC5309.getName();
        name2.getClass();
        return c5520M10057.m9884(name2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC7359 m10058(InterfaceC5331 interfaceC5331) {
        interfaceC5331.getClass();
        InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(interfaceC5331);
        interfaceC5318M12663.getClass();
        return interfaceC5318M12663.mo9620();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final AbstractC7818 m10059(InterfaceC7307 interfaceC7307) {
        interfaceC7307.getClass();
        InterfaceC5309 interfaceC5309Mo9770 = interfaceC7307.getType().mo10281().mo9770();
        if (interfaceC5309Mo9770 instanceof AbstractC7818) {
            return (AbstractC7818) interfaceC5309Mo9770;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5519 m10060(InterfaceC5332 interfaceC5332) {
        interfaceC5332.getClass();
        C5518 c5518M12660 = AbstractC7699.m12660(interfaceC5332);
        c5518M12660.getClass();
        if (!c5518M12660.m9872()) {
            c5518M12660 = null;
        }
        if (c5518M12660 != null) {
            return c5518M12660.m9878();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5312 m10061(InterfaceC5312 interfaceC5312, InterfaceC7387 interfaceC7387) {
        interfaceC5312.getClass();
        return (InterfaceC5312) AbstractC8104.m13047(AbstractC7176.m12487(interfaceC5312), new C5608(1), new C5606(interfaceC7387, new Ref$ObjectRef()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m10062(InterfaceC5288 interfaceC5288) {
        Boolean boolM13051 = AbstractC8104.m13051(AbstractC7176.m12487(interfaceC5288), C5608.f14259, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        boolM13051.getClass();
        return boolM13051.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m10063(InterfaceC5318 interfaceC5318) {
        interfaceC5318.getClass();
        if (interfaceC5318.mo9624(AbstractC5692.f14488) == null) {
            return;
        }
        C3775.m6954();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5519 m10064(InterfaceC5331 interfaceC5331) {
        interfaceC5331.getClass();
        C5519 c5519M12673 = AbstractC7699.m12673(interfaceC5331);
        return c5519M12673 != null ? c5519M12673 : AbstractC7699.m12660(interfaceC5331.mo9587()).m9875(interfaceC5331.getName()).m9878();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC5312 m10065(InterfaceC5312 interfaceC5312) {
        interfaceC5312.getClass();
        if (!(interfaceC5312 instanceof AbstractC7823)) {
            return interfaceC5312;
        }
        InterfaceC5305 interfaceC5305M12885 = ((AbstractC7823) interfaceC5312).m12885();
        interfaceC5305M12885.getClass();
        return interfaceC5305M12885;
    }
}
