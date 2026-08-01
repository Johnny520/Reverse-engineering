package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4211;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4441;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4436;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4442;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4446;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4611;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4568;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4793;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4785;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799;
import p018.AbstractC6253;
import p034.AbstractC6344;
import p066.AbstractC6870;
import p066.AbstractC6879;
import p067.C6886;
import p067.C6893;
import p070.AbstractC6912;
import p071.AbstractC6913;
import p077.C6973;
import p079.AbstractC7009;
import p079.C6990;
import p079.C6991;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5068 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4688 f14609;

    static {
        C4687 c4687 = new C4687("java.lang.Void");
        f14609 = new C4688(c4687.m9320(), c4687.f13696.m9318());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC6253 m10079(InterfaceC4484 interfaceC4484) throws IOException {
        interfaceC4484.getClass();
        InterfaceC4484 interfaceC4484Mo9002 = ((InterfaceC4484) AbstractC6870.m12110(interfaceC4484)).mo9002();
        interfaceC4484Mo9002.getClass();
        if (interfaceC4484Mo9002 instanceof InterfaceC4785) {
            InterfaceC4799 interfaceC4799 = (InterfaceC4799) interfaceC4484Mo9002;
            InterfaceC4701 interfaceC4701Mo9516 = interfaceC4799.mo9516();
            if (interfaceC4701Mo9516 instanceof ProtoBuf$Function) {
                C4726 c4726 = C6893.f18347;
                C6886 c6886M12169 = C6893.m12169((ProtoBuf$Function) interfaceC4701Mo9516, interfaceC4799.mo9514(), interfaceC4799.mo9512());
                if (c6886M12169 != null) {
                    return new C5036(c6886M12169);
                }
            }
            if (interfaceC4701Mo9516 instanceof ProtoBuf$Constructor) {
                C4726 c47262 = C6893.f18347;
                C6886 c6886M12171 = C6893.m12171((ProtoBuf$Constructor) interfaceC4701Mo9516, interfaceC4799.mo9514(), interfaceC4799.mo9512());
                if (c6886M12171 != null) {
                    InterfaceC4499 interfaceC4499Mo9028 = interfaceC4484.mo9028();
                    interfaceC4499Mo9028.getClass();
                    return AbstractC6879.m12156(interfaceC4499Mo9028) ? new C5036(c6886M12171) : new C5037(c6886M12171);
                }
            }
            return m10081(interfaceC4484Mo9002);
        }
        if (interfaceC4484Mo9002 instanceof C4565) {
            InterfaceC4462 interfaceC4462Mo9026 = ((C4565) interfaceC4484Mo9002).mo9026();
            C6973 c6973 = interfaceC4462Mo9026 instanceof C6973 ? (C6973) interfaceC4462Mo9026 : null;
            AbstractC4441 abstractC4441 = c6973 != null ? c6973.f18664 : null;
            C4436 c4436 = abstractC4441 instanceof C4436 ? (C4436) abstractC4441 : null;
            if (c4436 != null) {
                return new C5038(c4436.f13066);
            }
            C4211.m8595(interfaceC4484Mo9002, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(interfaceC4484Mo9002 instanceof C4568)) {
            return m10081(interfaceC4484Mo9002);
        }
        InterfaceC4462 interfaceC4462Mo90262 = ((C4568) interfaceC4484Mo9002).mo9026();
        C6973 c69732 = interfaceC4462Mo90262 instanceof C6973 ? (C6973) interfaceC4462Mo90262 : null;
        AbstractC4441 abstractC44412 = c69732 != null ? c69732.f18664 : null;
        if (abstractC44412 instanceof C4442) {
            return new C5039(((C4442) abstractC44412).f13071);
        }
        if (abstractC44412 instanceof C4452) {
            Class cls = ((C4452) abstractC44412).f13083;
            if (cls.isAnnotation()) {
                return new C5040(cls);
            }
        }
        C4211.m8613("Incorrect resolution sequence for Java constructor ", interfaceC4484Mo9002, " (", abstractC44412);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC6344 m10080(InterfaceC4473 interfaceC4473) {
        interfaceC4473.getClass();
        InterfaceC4473 interfaceC4473Mo9002 = ((InterfaceC4473) AbstractC6870.m12110(interfaceC4473)).mo9002();
        interfaceC4473Mo9002.getClass();
        if (interfaceC4473Mo9002 instanceof C4793) {
            C4793 c4793 = (C4793) interfaceC4473Mo9002;
            ProtoBuf$Property protoBuf$Property = c4793.f13967;
            C4725 c4725 = AbstractC6913.f18429;
            c4725.getClass();
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC6912.m12204(protoBuf$Property, c4725);
            if (jvmProtoBuf$JvmPropertySignature != null) {
                return new C5049(interfaceC4473Mo9002, protoBuf$Property, jvmProtoBuf$JvmPropertySignature, c4793.f13964, c4793.f13963);
            }
        } else if (interfaceC4473Mo9002 instanceof C4564) {
            C4564 c4564 = (C4564) interfaceC4473Mo9002;
            InterfaceC4462 interfaceC4462Mo9026 = c4564.mo9026();
            C6973 c6973 = interfaceC4462Mo9026 instanceof C6973 ? (C6973) interfaceC4462Mo9026 : null;
            AbstractC4441 abstractC4441 = c6973 != null ? c6973.f18664 : null;
            if (abstractC4441 instanceof C4446) {
                return new C5052(((C4446) abstractC4441).f13074);
            }
            if (!(abstractC4441 instanceof C4436)) {
                C4211.m8613("Incorrect resolution sequence for Java field ", interfaceC4473Mo9002, " (source = ", abstractC4441);
                return null;
            }
            Method method = ((C4436) abstractC4441).f13066;
            C6990 c6990 = c4564.f18713;
            InterfaceC4462 interfaceC4462Mo90262 = c6990 != null ? c6990.mo9026() : null;
            C6973 c69732 = interfaceC4462Mo90262 instanceof C6973 ? (C6973) interfaceC4462Mo90262 : null;
            AbstractC4441 abstractC44412 = c69732 != null ? c69732.f18664 : null;
            C4436 c4436 = abstractC44412 instanceof C4436 ? (C4436) abstractC44412 : null;
            return new C5053(method, c4436 != null ? c4436.f13066 : null);
        }
        C6991 getter = interfaceC4473Mo9002.getGetter();
        getter.getClass();
        C5036 c5036M10081 = m10081(getter);
        C6990 setter = interfaceC4473Mo9002.getSetter();
        return new C5048(c5036M10081, setter != null ? m10081(setter) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5036 m10081(InterfaceC4484 interfaceC4484) {
        String strM13077 = AbstractC7739.m13077(interfaceC4484);
        if (strM13077 == null) {
            if (interfaceC4484 instanceof C6991) {
                String strM9335 = AbstractC4773.m9506(interfaceC4484).getName().m9335();
                strM9335.getClass();
                strM13077 = AbstractC4611.m9230(strM9335);
            } else if (interfaceC4484 instanceof C6990) {
                String strM93352 = AbstractC4773.m9506(interfaceC4484).getName().m9335();
                strM93352.getClass();
                strM13077 = "set".concat(AbstractC4611.m9229(strM93352) ? strM93352.substring(2) : AbstractC5062.m10035(strM93352));
            } else {
                strM13077 = ((AbstractC7009) interfaceC4484).getName().m9335();
                strM13077.getClass();
            }
        }
        return new C5036(new C6886(strM13077, AbstractC3055.m6660(interfaceC4484, 1)));
    }
}
