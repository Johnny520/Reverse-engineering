package kotlin.reflect.jvm;

import io.ktor.util.C4210;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC5167;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.jvm.internal.AbstractC5066;
import kotlin.reflect.jvm.internal.C4939;
import kotlin.reflect.jvm.internal.C5003;
import kotlin.reflect.jvm.internal.C5025;
import kotlin.reflect.jvm.internal.C5073;
import kotlin.reflect.jvm.internal.InterfaceC5063;
import kotlin.reflect.jvm.internal.InterfaceC5074;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.types.AbstractC4925;
import p015.C6230;
import p047.InterfaceC6488;
import p067.C6884;
import p067.C6892;
import p070.C6897;

/* JADX INFO: renamed from: kotlin.reflect.jvm.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5080 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5092 m10088(InterfaceC5086 interfaceC5086) {
        interfaceC5086.getClass();
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        if (interfaceC5091Mo8909 != null) {
            return m10089(interfaceC5091Mo8909);
        }
        C4210.m8605(interfaceC5086, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5092 m10089(InterfaceC5091 interfaceC5091) {
        if (interfaceC5091 instanceof InterfaceC5092) {
            return (InterfaceC5092) interfaceC5091;
        }
        Object obj = null;
        if (!(interfaceC5091 instanceof AbstractC4393)) {
            C4210.m8605(interfaceC5091, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((AbstractC4393) interfaceC5091).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC5091 interfaceC5091Mo8909 = ((InterfaceC5086) next).mo8909();
            C5003 c5003 = interfaceC5091Mo8909 instanceof C5003 ? (C5003) interfaceC5091Mo8909 : null;
            if (c5003 != null && c5003.m9988() != ClassKind.INTERFACE && c5003.m9988() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        InterfaceC5086 interfaceC5086 = (InterfaceC5086) obj;
        if (interfaceC5086 == null) {
            interfaceC5086 = (InterfaceC5086) AbstractC4343.m8830(upperBounds);
        }
        return interfaceC5086 != null ? m10088(interfaceC5086) : AbstractC4395.f12971.mo8927(Object.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Type m10090(InterfaceC5086 interfaceC5086) {
        interfaceC5086.getClass();
        if (interfaceC5086 instanceof AbstractC4925) {
            C5073 c5073 = ((AbstractC4925) interfaceC5086).f14261;
            Type type = c5073 != null ? (Type) c5073.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return AbstractC5089.m10099(interfaceC5086, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Method m10091(InterfaceC5109 interfaceC5109) {
        InterfaceC6488 interfaceC6488Mo9944;
        interfaceC5109.getClass();
        InterfaceC5063 interfaceC5063M10061 = AbstractC5066.m10061(interfaceC5109);
        Member memberMo11953 = (interfaceC5063M10061 == null || (interfaceC6488Mo9944 = interfaceC5063M10061.mo9944()) == null) ? null : interfaceC6488Mo9944.mo11953();
        if (memberMo11953 instanceof Method) {
            return (Method) memberMo11953;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Field m10092(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        InterfaceC5074 interfaceC5074M10060 = AbstractC5066.m10060(interfaceC5087);
        if (interfaceC5074M10060 != null) {
            return interfaceC5074M10060.mo9943();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5109 m10093(Collection collection, Method method) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC5093 interfaceC5093 = (InterfaceC5093) it.next();
            if (interfaceC5093 instanceof InterfaceC5109) {
                InterfaceC5109 interfaceC5109 = (InterfaceC5109) interfaceC5093;
                if (AbstractC4394.m8917(interfaceC5109.getName(), method.getName()) && AbstractC4394.m8917(m10091(interfaceC5109), method)) {
                    return interfaceC5109;
                }
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC5093 interfaceC50932 = (InterfaceC5093) it2.next();
            if (interfaceC50932 instanceof InterfaceC5109) {
                InterfaceC5109 interfaceC51092 = (InterfaceC5109) interfaceC50932;
                if (!AbstractC4394.m8917(interfaceC51092.getName(), method.getName()) && AbstractC4394.m8917(m10091(interfaceC51092), method)) {
                    return interfaceC51092;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5025 m10094(InterfaceC5167 interfaceC5167) {
        Metadata metadata = (Metadata) interfaceC5167.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                Pair pairM12145 = C6892.m12145(strArrD1, metadata.d2());
                C6884 c6884 = (C6884) pairM12145.component1();
                ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) pairM12145.component2();
                C6897 c6897 = new C6897(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = interfaceC5167.getClass();
                ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
                typeTable.getClass();
                return new C5025(C4939.f14297, (InterfaceC4470) AbstractC5066.m10056(cls, C5079.f14630, protoBuf$Function, c6884, new C6230(typeTable), c6897, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m10095(InterfaceC5074 interfaceC5074) {
        if (interfaceC5074 instanceof InterfaceC5106) {
            Field fieldM10092 = m10092(interfaceC5074);
            if (!(fieldM10092 != null ? fieldM10092.isAccessible() : true)) {
                return false;
            }
            Method methodM10091 = m10091(interfaceC5074.getGetter());
            if (!(methodM10091 != null ? methodM10091.isAccessible() : true)) {
                return false;
            }
            Method methodM100912 = m10091(((InterfaceC5106) interfaceC5074).getSetter());
            if (!(methodM100912 != null ? methodM100912.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldM100922 = m10092(interfaceC5074);
            if (!(fieldM100922 != null ? fieldM100922.isAccessible() : true)) {
                return false;
            }
            Method methodM100913 = m10091(interfaceC5074.getGetter());
            if (!(methodM100913 != null ? methodM100913.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
