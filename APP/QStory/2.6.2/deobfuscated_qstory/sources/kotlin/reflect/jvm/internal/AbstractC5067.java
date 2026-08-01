package kotlin.reflect.jvm.internal;

import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4210;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4440;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4441;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4445;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4610;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4563;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4567;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4792;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4784;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798;
import p000.AbstractC6087;
import p066.AbstractC6869;
import p066.AbstractC6878;
import p067.C6885;
import p067.C6892;
import p070.AbstractC6911;
import p071.AbstractC6912;
import p077.C6972;
import p079.AbstractC7008;
import p079.C6989;
import p079.C6990;
import p251.AbstractC8174;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5067 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 f14609;

    static {
        C4686 c4686 = new C4686("java.lang.Void");
        f14609 = new C4687(c4686.m9330(), c4686.f13692.m9328());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC8174 m10075(InterfaceC4483 interfaceC4483) throws IOException {
        interfaceC4483.getClass();
        InterfaceC4483 interfaceC4483Mo9012 = ((InterfaceC4483) AbstractC6869.m12082(interfaceC4483)).mo9012();
        interfaceC4483Mo9012.getClass();
        if (interfaceC4483Mo9012 instanceof InterfaceC4784) {
            InterfaceC4798 interfaceC4798 = (InterfaceC4798) interfaceC4483Mo9012;
            InterfaceC4700 interfaceC4700Mo9526 = interfaceC4798.mo9526();
            if (interfaceC4700Mo9526 instanceof ProtoBuf$Function) {
                C4725 c4725 = C6892.f18352;
                C6885 c6885M12141 = C6892.m12141((ProtoBuf$Function) interfaceC4700Mo9526, interfaceC4798.mo9524(), interfaceC4798.mo9522());
                if (c6885M12141 != null) {
                    return new C5035(c6885M12141);
                }
            }
            if (interfaceC4700Mo9526 instanceof ProtoBuf$Constructor) {
                C4725 c47252 = C6892.f18352;
                C6885 c6885M12143 = C6892.m12143((ProtoBuf$Constructor) interfaceC4700Mo9526, interfaceC4798.mo9524(), interfaceC4798.mo9522());
                if (c6885M12143 != null) {
                    InterfaceC4498 interfaceC4498Mo9038 = interfaceC4483.mo9038();
                    interfaceC4498Mo9038.getClass();
                    return AbstractC6878.m12128(interfaceC4498Mo9038) ? new C5035(c6885M12143) : new C5036(c6885M12143);
                }
            }
            return m10077(interfaceC4483Mo9012);
        }
        if (interfaceC4483Mo9012 instanceof C4564) {
            InterfaceC4461 interfaceC4461Mo9036 = ((C4564) interfaceC4483Mo9012).mo9036();
            C6972 c6972 = interfaceC4461Mo9036 instanceof C6972 ? (C6972) interfaceC4461Mo9036 : null;
            AbstractC4440 abstractC4440 = c6972 != null ? c6972.f18669 : null;
            C4435 c4435 = abstractC4440 instanceof C4435 ? (C4435) abstractC4440 : null;
            if (c4435 != null) {
                return new C5037(c4435.f13062);
            }
            C4210.m8605(interfaceC4483Mo9012, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(interfaceC4483Mo9012 instanceof C4567)) {
            return m10077(interfaceC4483Mo9012);
        }
        InterfaceC4461 interfaceC4461Mo90362 = ((C4567) interfaceC4483Mo9012).mo9036();
        C6972 c69722 = interfaceC4461Mo90362 instanceof C6972 ? (C6972) interfaceC4461Mo90362 : null;
        AbstractC4440 abstractC44402 = c69722 != null ? c69722.f18669 : null;
        if (abstractC44402 instanceof C4441) {
            return new C5038(((C4441) abstractC44402).f13067);
        }
        if (abstractC44402 instanceof C4451) {
            Class cls = ((C4451) abstractC44402).f13079;
            if (cls.isAnnotation()) {
                return new C5039(cls);
            }
        }
        C4210.m8623("Incorrect resolution sequence for Java constructor ", interfaceC4483Mo9012, " (", abstractC44402);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC8189 m10076(InterfaceC4472 interfaceC4472) {
        interfaceC4472.getClass();
        InterfaceC4472 interfaceC4472Mo9012 = ((InterfaceC4472) AbstractC6869.m12082(interfaceC4472)).mo9012();
        interfaceC4472Mo9012.getClass();
        if (interfaceC4472Mo9012 instanceof C4792) {
            C4792 c4792 = (C4792) interfaceC4472Mo9012;
            ProtoBuf$Property protoBuf$Property = c4792.f13963;
            C4724 c4724 = AbstractC6912.f18434;
            c4724.getClass();
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC6911.m12176(protoBuf$Property, c4724);
            if (jvmProtoBuf$JvmPropertySignature != null) {
                return new C5048(interfaceC4472Mo9012, protoBuf$Property, jvmProtoBuf$JvmPropertySignature, c4792.f13960, c4792.f13959);
            }
        } else if (interfaceC4472Mo9012 instanceof C4563) {
            C4563 c4563 = (C4563) interfaceC4472Mo9012;
            InterfaceC4461 interfaceC4461Mo9036 = c4563.mo9036();
            C6972 c6972 = interfaceC4461Mo9036 instanceof C6972 ? (C6972) interfaceC4461Mo9036 : null;
            AbstractC4440 abstractC4440 = c6972 != null ? c6972.f18669 : null;
            if (abstractC4440 instanceof C4445) {
                return new C5051(((C4445) abstractC4440).f13070);
            }
            if (!(abstractC4440 instanceof C4435)) {
                C4210.m8623("Incorrect resolution sequence for Java field ", interfaceC4472Mo9012, " (source = ", abstractC4440);
                return null;
            }
            Method method = ((C4435) abstractC4440).f13062;
            C6989 c6989 = c4563.f18718;
            InterfaceC4461 interfaceC4461Mo90362 = c6989 != null ? c6989.mo9036() : null;
            C6972 c69722 = interfaceC4461Mo90362 instanceof C6972 ? (C6972) interfaceC4461Mo90362 : null;
            AbstractC4440 abstractC44402 = c69722 != null ? c69722.f18669 : null;
            C4435 c4435 = abstractC44402 instanceof C4435 ? (C4435) abstractC44402 : null;
            return new C5052(method, c4435 != null ? c4435.f13062 : null);
        }
        C6990 getter = interfaceC4472Mo9012.getGetter();
        getter.getClass();
        C5035 c5035M10077 = m10077(getter);
        C6989 setter = interfaceC4472Mo9012.getSetter();
        return new C5047(c5035M10077, setter != null ? m10077(setter) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5035 m10077(InterfaceC4483 interfaceC4483) {
        String strM6261 = AbstractC2904.m6261(interfaceC4483);
        if (strM6261 == null) {
            if (interfaceC4483 instanceof C6990) {
                String strM9345 = AbstractC4772.m9516(interfaceC4483).getName().m9345();
                strM9345.getClass();
                strM6261 = AbstractC4610.m9240(strM9345);
            } else if (interfaceC4483 instanceof C6989) {
                String strM93452 = AbstractC4772.m9516(interfaceC4483).getName().m9345();
                strM93452.getClass();
                strM6261 = "set".concat(AbstractC4610.m9239(strM93452) ? strM93452.substring(2) : AbstractC3056.m6678(strM93452));
            } else {
                strM6261 = ((AbstractC7008) interfaceC4483).getName().m9345();
                strM6261.getClass();
            }
        }
        return new C5035(new C6885(strM6261, AbstractC6087.m11410(interfaceC4483, 1)));
    }
}
