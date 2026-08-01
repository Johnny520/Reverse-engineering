package kotlin.reflect.jvm;

import io.ktor.util.C5043;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC6000;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5939;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5772;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5858;
import kotlin.reflect.jvm.internal.C5906;
import kotlin.reflect.jvm.internal.InterfaceC5896;
import kotlin.reflect.jvm.internal.InterfaceC5907;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.p009km.ClassKind;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import p023.C6986;
import p063.InterfaceC7318;
import p083.C7714;
import p083.C7722;
import p086.C7727;

/* JADX INFO: renamed from: kotlin.reflect.jvm.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5913 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5925 m10651(InterfaceC5919 interfaceC5919) {
        interfaceC5919.getClass();
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        if (interfaceC5924Mo9458 != null) {
            return m10652(interfaceC5924Mo9458);
        }
        C5043.m9154(interfaceC5919, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5925 m10652(InterfaceC5924 interfaceC5924) {
        if (interfaceC5924 instanceof InterfaceC5925) {
            return (InterfaceC5925) interfaceC5924;
        }
        Object obj = null;
        if (!(interfaceC5924 instanceof AbstractC5226)) {
            C5043.m9154(interfaceC5924, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((AbstractC5226) interfaceC5924).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC5924 interfaceC5924Mo9458 = ((InterfaceC5919) next).mo9458();
            C5836 c5836 = interfaceC5924Mo9458 instanceof C5836 ? (C5836) interfaceC5924Mo9458 : null;
            if (c5836 != null && c5836.m10544() != ClassKind.INTERFACE && c5836.m10544() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        InterfaceC5919 interfaceC5919 = (InterfaceC5919) obj;
        if (interfaceC5919 == null) {
            interfaceC5919 = (InterfaceC5919) AbstractC5176.m9374(upperBounds);
        }
        return interfaceC5919 != null ? m10651(interfaceC5919) : AbstractC5228.f13320.mo9476(Object.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Type m10653(InterfaceC5919 interfaceC5919) {
        interfaceC5919.getClass();
        if (interfaceC5919 instanceof AbstractC5758) {
            C5906 c5906 = ((AbstractC5758) interfaceC5919).f14608;
            Type type = c5906 != null ? (Type) c5906.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return AbstractC5922.m10662(interfaceC5919, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Method m10654(InterfaceC5942 interfaceC5942) {
        InterfaceC7318 interfaceC7318Mo10500;
        interfaceC5942.getClass();
        InterfaceC5896 interfaceC5896M10624 = AbstractC5899.m10624(interfaceC5942);
        Member memberMo12555 = (interfaceC5896M10624 == null || (interfaceC7318Mo10500 = interfaceC5896M10624.mo10500()) == null) ? null : interfaceC7318Mo10500.mo12555();
        if (memberMo12555 instanceof Method) {
            return (Method) memberMo12555;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Field m10655(InterfaceC5920 interfaceC5920) {
        interfaceC5920.getClass();
        InterfaceC5907 interfaceC5907M10623 = AbstractC5899.m10623(interfaceC5920);
        if (interfaceC5907M10623 != null) {
            return interfaceC5907M10623.mo10499();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5942 m10656(Collection collection, Method method) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC5926 interfaceC5926 = (InterfaceC5926) it.next();
            if (interfaceC5926 instanceof InterfaceC5942) {
                InterfaceC5942 interfaceC5942 = (InterfaceC5942) interfaceC5926;
                if (AbstractC5227.m9466(interfaceC5942.getName(), method.getName()) && AbstractC5227.m9466(m10654(interfaceC5942), method)) {
                    return interfaceC5942;
                }
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC5926 interfaceC59262 = (InterfaceC5926) it2.next();
            if (interfaceC59262 instanceof InterfaceC5942) {
                InterfaceC5942 interfaceC59422 = (InterfaceC5942) interfaceC59262;
                if (!AbstractC5227.m9466(interfaceC59422.getName(), method.getName()) && AbstractC5227.m9466(m10654(interfaceC59422), method)) {
                    return interfaceC59422;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5858 m10657(InterfaceC6000 interfaceC6000) {
        Metadata metadata = (Metadata) interfaceC6000.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrM150d1 = metadata.m150d1();
            if (strArrM150d1.length == 0) {
                strArrM150d1 = null;
            }
            if (strArrM150d1 != null) {
                Pair pairM12732 = C7722.m12732(strArrM150d1, metadata.m151d2());
                C7714 c7714 = (C7714) pairM12732.component1();
                ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) pairM12732.component2();
                C7727 c7727 = new C7727(metadata.m153mv(), (metadata.m155xi() & 8) != 0);
                Class<?> cls = interfaceC6000.getClass();
                ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
                typeTable.getClass();
                return new C5858(C5772.f14644, (InterfaceC5303) AbstractC5899.m10619(cls, C5912.f14975, protoBuf$Function, c7714, new C6986(typeTable), c7727, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m10658(InterfaceC5907 interfaceC5907) {
        if (interfaceC5907 instanceof InterfaceC5939) {
            Field fieldM10655 = m10655(interfaceC5907);
            if (!(fieldM10655 != null ? fieldM10655.isAccessible() : true)) {
                return false;
            }
            Method methodM10654 = m10654(interfaceC5907.getGetter());
            if (!(methodM10654 != null ? methodM10654.isAccessible() : true)) {
                return false;
            }
            Method methodM106542 = m10654(((InterfaceC5939) interfaceC5907).getSetter());
            if (!(methodM106542 != null ? methodM106542.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldM106552 = m10655(interfaceC5907);
            if (!(fieldM106552 != null ? fieldM106552.isAccessible() : true)) {
                return false;
            }
            Method methodM106543 = m10654(interfaceC5907.getGetter());
            if (!(methodM106543 != null ? methodM106543.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
