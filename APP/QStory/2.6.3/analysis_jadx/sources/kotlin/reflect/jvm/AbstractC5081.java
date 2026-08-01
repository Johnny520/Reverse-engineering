package kotlin.reflect.jvm;

import io.ktor.util.C4211;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC5168;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.jvm.internal.AbstractC5067;
import kotlin.reflect.jvm.internal.C4940;
import kotlin.reflect.jvm.internal.C5004;
import kotlin.reflect.jvm.internal.C5026;
import kotlin.reflect.jvm.internal.C5074;
import kotlin.reflect.jvm.internal.InterfaceC5064;
import kotlin.reflect.jvm.internal.InterfaceC5075;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import p007.C6157;
import p047.InterfaceC6489;
import p067.C6885;
import p067.C6893;
import p070.C6898;

/* JADX INFO: renamed from: kotlin.reflect.jvm.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5081 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5093 m10092(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        if (interfaceC5092Mo8899 != null) {
            return m10093(interfaceC5092Mo8899);
        }
        C4211.m8595(interfaceC5087, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5093 m10093(InterfaceC5092 interfaceC5092) {
        if (interfaceC5092 instanceof InterfaceC5093) {
            return (InterfaceC5093) interfaceC5092;
        }
        Object obj = null;
        if (!(interfaceC5092 instanceof AbstractC4394)) {
            C4211.m8595(interfaceC5092, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((AbstractC4394) interfaceC5092).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC5092 interfaceC5092Mo8899 = ((InterfaceC5087) next).mo8899();
            C5004 c5004 = interfaceC5092Mo8899 instanceof C5004 ? (C5004) interfaceC5092Mo8899 : null;
            if (c5004 != null && c5004.m9985() != ClassKind.INTERFACE && c5004.m9985() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        InterfaceC5087 interfaceC5087 = (InterfaceC5087) obj;
        if (interfaceC5087 == null) {
            interfaceC5087 = (InterfaceC5087) AbstractC4344.m8815(upperBounds);
        }
        return interfaceC5087 != null ? m10092(interfaceC5087) : AbstractC4396.f12975.mo8917(Object.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Type m10094(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        if (interfaceC5087 instanceof AbstractC4926) {
            C5074 c5074 = ((AbstractC4926) interfaceC5087).f14263;
            Type type = c5074 != null ? (Type) c5074.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return AbstractC5090.m10103(interfaceC5087, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Method m10095(InterfaceC5110 interfaceC5110) {
        InterfaceC6489 interfaceC6489Mo9941;
        interfaceC5110.getClass();
        InterfaceC5064 interfaceC5064M10065 = AbstractC5067.m10065(interfaceC5110);
        Member memberMo11996 = (interfaceC5064M10065 == null || (interfaceC6489Mo9941 = interfaceC5064M10065.mo9941()) == null) ? null : interfaceC6489Mo9941.mo11996();
        if (memberMo11996 instanceof Method) {
            return (Method) memberMo11996;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Field m10096(InterfaceC5088 interfaceC5088) {
        interfaceC5088.getClass();
        InterfaceC5075 interfaceC5075M10064 = AbstractC5067.m10064(interfaceC5088);
        if (interfaceC5075M10064 != null) {
            return interfaceC5075M10064.mo9940();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5110 m10097(Collection collection, Method method) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC5094 interfaceC5094 = (InterfaceC5094) it.next();
            if (interfaceC5094 instanceof InterfaceC5110) {
                InterfaceC5110 interfaceC5110 = (InterfaceC5110) interfaceC5094;
                if (AbstractC4395.m8907(interfaceC5110.getName(), method.getName()) && AbstractC4395.m8907(m10095(interfaceC5110), method)) {
                    return interfaceC5110;
                }
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC5094 interfaceC50942 = (InterfaceC5094) it2.next();
            if (interfaceC50942 instanceof InterfaceC5110) {
                InterfaceC5110 interfaceC51102 = (InterfaceC5110) interfaceC50942;
                if (!AbstractC4395.m8907(interfaceC51102.getName(), method.getName()) && AbstractC4395.m8907(m10095(interfaceC51102), method)) {
                    return interfaceC51102;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5026 m10098(InterfaceC5168 interfaceC5168) {
        Metadata metadata = (Metadata) interfaceC5168.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                Pair pairM12173 = C6893.m12173(strArrD1, metadata.d2());
                C6885 c6885 = (C6885) pairM12173.component1();
                ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) pairM12173.component2();
                C6898 c6898 = new C6898(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = interfaceC5168.getClass();
                ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
                typeTable.getClass();
                return new C5026(C4940.f14299, (InterfaceC4471) AbstractC5067.m10060(cls, C5080.f14630, protoBuf$Function, c6885, new C6157(typeTable), c6898, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m10099(InterfaceC5075 interfaceC5075) {
        if (interfaceC5075 instanceof InterfaceC5107) {
            Field fieldM10096 = m10096(interfaceC5075);
            if (!(fieldM10096 != null ? fieldM10096.isAccessible() : true)) {
                return false;
            }
            Method methodM10095 = m10095(interfaceC5075.getGetter());
            if (!(methodM10095 != null ? methodM10095.isAccessible() : true)) {
                return false;
            }
            Method methodM100952 = m10095(((InterfaceC5107) interfaceC5075).getSetter());
            if (!(methodM100952 != null ? methodM100952.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldM100962 = m10096(interfaceC5075);
            if (!(fieldM100962 != null ? fieldM100962.isAccessible() : true)) {
                return false;
            }
            Method methodM100953 = m10095(interfaceC5075.getGetter());
            if (!(methodM100953 != null ? methodM100953.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
