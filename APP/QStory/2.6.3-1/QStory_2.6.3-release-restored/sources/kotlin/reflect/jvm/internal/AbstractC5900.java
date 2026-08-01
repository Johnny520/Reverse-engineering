package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3887;
import io.ktor.util.C5043;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5273;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5268;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5274;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5278;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5443;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5396;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5400;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5625;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5617;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631;
import p034.AbstractC7082;
import p050.AbstractC7173;
import p082.AbstractC7699;
import p082.AbstractC7708;
import p083.C7715;
import p083.C7722;
import p086.AbstractC7741;
import p087.AbstractC7742;
import p093.C7802;
import p095.AbstractC7838;
import p095.C7819;
import p095.C7820;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5520 f14954;

    static {
        C5519 c5519 = new C5519("java.lang.Void");
        f14954 = new C5520(c5519.m9879(), c5519.f14041.m9877());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC7082 m10638(InterfaceC5316 interfaceC5316) throws IOException {
        interfaceC5316.getClass();
        InterfaceC5316 interfaceC5316Mo9561 = ((InterfaceC5316) AbstractC7699.m12669(interfaceC5316)).mo9561();
        interfaceC5316Mo9561.getClass();
        if (interfaceC5316Mo9561 instanceof InterfaceC5617) {
            InterfaceC5631 interfaceC5631 = (InterfaceC5631) interfaceC5316Mo9561;
            InterfaceC5533 interfaceC5533Mo10075 = interfaceC5631.mo10075();
            if (interfaceC5533Mo10075 instanceof ProtoBuf$Function) {
                C5558 c5558 = C7722.f18692;
                C7715 c7715M12728 = C7722.m12728((ProtoBuf$Function) interfaceC5533Mo10075, interfaceC5631.mo10073(), interfaceC5631.mo10071());
                if (c7715M12728 != null) {
                    return new C5868(c7715M12728);
                }
            }
            if (interfaceC5533Mo10075 instanceof ProtoBuf$Constructor) {
                C5558 c55582 = C7722.f18692;
                C7715 c7715M12730 = C7722.m12730((ProtoBuf$Constructor) interfaceC5533Mo10075, interfaceC5631.mo10073(), interfaceC5631.mo10071());
                if (c7715M12730 != null) {
                    InterfaceC5331 interfaceC5331Mo9587 = interfaceC5316.mo9587();
                    interfaceC5331Mo9587.getClass();
                    return AbstractC7708.m12715(interfaceC5331Mo9587) ? new C5868(c7715M12730) : new C5869(c7715M12730);
                }
            }
            return m10640(interfaceC5316Mo9561);
        }
        if (interfaceC5316Mo9561 instanceof C5397) {
            InterfaceC5294 interfaceC5294Mo9585 = ((C5397) interfaceC5316Mo9561).mo9585();
            C7802 c7802 = interfaceC5294Mo9585 instanceof C7802 ? (C7802) interfaceC5294Mo9585 : null;
            AbstractC5273 abstractC5273 = c7802 != null ? c7802.f19009 : null;
            C5268 c5268 = abstractC5273 instanceof C5268 ? (C5268) abstractC5273 : null;
            if (c5268 != null) {
                return new C5870(c5268.f13411);
            }
            C5043.m9154(interfaceC5316Mo9561, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(interfaceC5316Mo9561 instanceof C5400)) {
            return m10640(interfaceC5316Mo9561);
        }
        InterfaceC5294 interfaceC5294Mo95852 = ((C5400) interfaceC5316Mo9561).mo9585();
        C7802 c78022 = interfaceC5294Mo95852 instanceof C7802 ? (C7802) interfaceC5294Mo95852 : null;
        AbstractC5273 abstractC52732 = c78022 != null ? c78022.f19009 : null;
        if (abstractC52732 instanceof C5274) {
            return new C5871(((C5274) abstractC52732).f13416);
        }
        if (abstractC52732 instanceof C5284) {
            Class cls = ((C5284) abstractC52732).f13428;
            if (cls.isAnnotation()) {
                return new C5872(cls);
            }
        }
        C5043.m9172("Incorrect resolution sequence for Java constructor ", interfaceC5316Mo9561, " (", abstractC52732);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC7173 m10639(InterfaceC5305 interfaceC5305) {
        interfaceC5305.getClass();
        InterfaceC5305 interfaceC5305Mo9561 = ((InterfaceC5305) AbstractC7699.m12669(interfaceC5305)).mo9561();
        interfaceC5305Mo9561.getClass();
        if (interfaceC5305Mo9561 instanceof C5625) {
            C5625 c5625 = (C5625) interfaceC5305Mo9561;
            ProtoBuf$Property protoBuf$Property = c5625.f14312;
            C5557 c5557 = AbstractC7742.f18774;
            c5557.getClass();
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC7741.m12763(protoBuf$Property, c5557);
            if (jvmProtoBuf$JvmPropertySignature != null) {
                return new C5881(interfaceC5305Mo9561, protoBuf$Property, jvmProtoBuf$JvmPropertySignature, c5625.f14309, c5625.f14308);
            }
        } else if (interfaceC5305Mo9561 instanceof C5396) {
            C5396 c5396 = (C5396) interfaceC5305Mo9561;
            InterfaceC5294 interfaceC5294Mo9585 = c5396.mo9585();
            C7802 c7802 = interfaceC5294Mo9585 instanceof C7802 ? (C7802) interfaceC5294Mo9585 : null;
            AbstractC5273 abstractC5273 = c7802 != null ? c7802.f19009 : null;
            if (abstractC5273 instanceof C5278) {
                return new C5884(((C5278) abstractC5273).f13419);
            }
            if (!(abstractC5273 instanceof C5268)) {
                C5043.m9172("Incorrect resolution sequence for Java field ", interfaceC5305Mo9561, " (source = ", abstractC5273);
                return null;
            }
            Method method = ((C5268) abstractC5273).f13411;
            C7819 c7819 = c5396.f19058;
            InterfaceC5294 interfaceC5294Mo95852 = c7819 != null ? c7819.mo9585() : null;
            C7802 c78022 = interfaceC5294Mo95852 instanceof C7802 ? (C7802) interfaceC5294Mo95852 : null;
            AbstractC5273 abstractC52732 = c78022 != null ? c78022.f19009 : null;
            C5268 c5268 = abstractC52732 instanceof C5268 ? (C5268) abstractC52732 : null;
            return new C5885(method, c5268 != null ? c5268.f13411 : null);
        }
        C7820 getter = interfaceC5305Mo9561.getGetter();
        getter.getClass();
        C5868 c5868M10640 = m10640(getter);
        C7819 setter = interfaceC5305Mo9561.getSetter();
        return new C5880(c5868M10640, setter != null ? m10640(setter) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5868 m10640(InterfaceC5316 interfaceC5316) {
        String strM13636 = AbstractC8568.m13636(interfaceC5316);
        if (strM13636 == null) {
            if (interfaceC5316 instanceof C7820) {
                String strM9894 = AbstractC5605.m10065(interfaceC5316).getName().m9894();
                strM9894.getClass();
                strM13636 = AbstractC5443.m9789(strM9894);
            } else if (interfaceC5316 instanceof C7819) {
                String strM98942 = AbstractC5605.m10065(interfaceC5316).getName().m9894();
                strM98942.getClass();
                strM13636 = "set".concat(AbstractC5443.m9788(strM98942) ? strM98942.substring(2) : AbstractC5894.m10594(strM98942));
            } else {
                strM13636 = ((AbstractC7838) interfaceC5316).getName().m9894();
                strM13636.getClass();
            }
        }
        return new C5868(new C7715(strM13636, AbstractC3887.m7220(interfaceC5316, 1)));
    }
}
