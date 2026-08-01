package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.load.engine.C3837;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5443;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5640;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5652;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644;
import kotlin.text.AbstractC5976;
import p023.C6986;
import p066.AbstractC7365;
import p083.AbstractC7718;
import p083.C7715;
import p083.C7722;
import p086.AbstractC7728;
import p086.AbstractC7741;
import p086.InterfaceC7737;
import p087.AbstractC7742;
import p093.C7799;
import p093.C7800;
import p093.C7801;
import p267.AbstractC9004;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5462 implements InterfaceC5644 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7800 f13889;

    public AbstractC5462(C7800 c7800) {
        this.f13889 = c7800;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C5471 m9798(InterfaceC5533 interfaceC5533, InterfaceC7737 interfaceC7737, C6986 c6986, AnnotatedCallableKind annotatedCallableKind, boolean z) throws IOException {
        interfaceC5533.getClass();
        interfaceC7737.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC5533 instanceof ProtoBuf$Constructor) {
            C5558 c5558 = C7722.f18692;
            C7715 c7715M12730 = C7722.m12730((ProtoBuf$Constructor) interfaceC5533, interfaceC7737, c6986);
            if (c7715M12730 == null) {
                return null;
            }
            return AbstractC3888.m7272(c7715M12730);
        }
        if (interfaceC5533 instanceof ProtoBuf$Function) {
            C5558 c55582 = C7722.f18692;
            C7715 c7715M12728 = C7722.m12728((ProtoBuf$Function) interfaceC5533, interfaceC7737, c6986);
            if (c7715M12728 == null) {
                return null;
            }
            return AbstractC3888.m7272(c7715M12728);
        }
        if (!(interfaceC5533 instanceof ProtoBuf$Property)) {
            return null;
        }
        C5557 c5557 = AbstractC7742.f18774;
        c5557.getClass();
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC7741.m12763((GeneratedMessageLite.ExtendableMessage) interfaceC5533, c5557);
        if (jvmProtoBuf$JvmPropertySignature == null) {
            return null;
        }
        int i = AbstractC5463.f13890[annotatedCallableKind.ordinal()];
        if (i == 1) {
            if (!jvmProtoBuf$JvmPropertySignature.hasGetter()) {
                return null;
            }
            JvmProtoBuf$JvmMethodSignature getter = jvmProtoBuf$JvmPropertySignature.getGetter();
            getter.getClass();
            return new C5471(interfaceC7737.getString(getter.getName()).concat(interfaceC7737.getString(getter.getDesc())));
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return AbstractC3400.m5641((ProtoBuf$Property) interfaceC5533, interfaceC7737, c6986, true, true, z);
        }
        if (!jvmProtoBuf$JvmPropertySignature.hasSetter()) {
            return null;
        }
        JvmProtoBuf$JvmMethodSignature setter = jvmProtoBuf$JvmPropertySignature.getSetter();
        setter.getClass();
        return new C5471(interfaceC7737.getString(setter.getName()).concat(interfaceC7737.getString(setter.getDesc())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ List m9799(AbstractC5462 abstractC5462, AbstractC5640 abstractC5640, C5471 c5471, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractC5462.m9803(abstractC5640, c5471, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final List mo2967(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind) {
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        return m9805(abstractC5640, interfaceC5533, annotatedCallableKind, interfaceC5533 instanceof ProtoBuf$Function ? ((ProtoBuf$Function) interfaceC5533).getContextParameterCount() : interfaceC5533 instanceof ProtoBuf$Property ? ((ProtoBuf$Property) interfaceC5533).getContextParameterCount() : 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final List mo2968(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        return !AbstractC7728.f18727.mo12740(protoBuf$Property.getFlags()).booleanValue() ? EmptyList.INSTANCE : m9804(abstractC5640, protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final List mo2970(AbstractC5640 abstractC5640, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        abstractC5640.getClass();
        return m9799(this, abstractC5640, new C5471(AbstractC0900.m724('#', abstractC5640.f14364.getString(protoBuf$EnumEntry.getName()), AbstractC7718.m12720(((C5652) abstractC5640).f14387.m9885()))), null, false, 60);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3837 m9800(C5520 c5520, C7801 c7801, List list) {
        list.getClass();
        if (AbstractC7365.f18280.contains(c5520)) {
            return null;
        }
        return mo9801(c5520, c7801, list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract C3837 mo9801(C5520 c5520, InterfaceC5294 interfaceC5294, List list);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m9802(C5520 c5520) {
        if (c5520.m9883() != null && AbstractC5227.m9466(c5520.m9882().m9894(), "Container")) {
            C7799 c7799M7314 = AbstractC3889.m7314(this.f13889, c5520, ((C5480) this).f13926);
            if (c7799M7314 != null) {
                LinkedHashSet linkedHashSet = AbstractC7365.f18280;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Class cls = c7799M7314.f19006;
                cls.getClass();
                Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    if (AbstractC5263.m9536(AbstractC3889.m7316(AbstractC3889.m7319(annotation))).equals(AbstractC5443.f13816)) {
                        ref$BooleanRef.element = true;
                    }
                }
                if (ref$BooleanRef.element) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m9803(AbstractC5640 abstractC5640, C5471 c5471, boolean z, boolean z2, Boolean bool, boolean z3) {
        C5480 c5480 = (C5480) this;
        C7799 c7799M9806 = AbstractC5464.m9806(abstractC5640, z, z2, bool, z3, this.f13889, c5480.f13926);
        if (c7799M9806 == null) {
            if (abstractC5640 instanceof C5652) {
                InterfaceC5294 interfaceC5294 = ((C5652) abstractC5640).f14362;
                C5467 c5467 = interfaceC5294 instanceof C5467 ? (C5467) interfaceC5294 : null;
                c7799M9806 = c5467 != null ? c5467.f13899 : null;
            }
        }
        if (c7799M9806 == null) {
            return EmptyList.INSTANCE;
        }
        List list = (List) ((C5461) c5480.f13927.invoke(c7799M9806)).f13888.get(c5471);
        return list == null ? EmptyList.INSTANCE : list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo2979(C5652 c5652) throws InvocationTargetException {
        c5652.getClass();
        if (!AbstractC7728.f18727.mo12740(c5652.f14389.getFlags()).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        InterfaceC5294 interfaceC5294 = c5652.f14362;
        C5467 c5467 = interfaceC5294 instanceof C5467 ? (C5467) interfaceC5294 : null;
        C7799 c7799 = c5467 != null ? c5467.f13899 : null;
        if (c7799 == null) {
            C1123.m1405(c5652.f14387.m9886(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = c7799.f19006;
        cls.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsM7316 = AbstractC3889.m7316(AbstractC3889.m7319(annotation));
            C3837 c3837M9800 = m9800(AbstractC5263.m9536(clsM7316), new C7801(annotation), arrayList);
            if (c3837M9800 != null) {
                AbstractC9004.m14188(c3837M9800, annotation, clsM7316);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final List mo2980(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        return !AbstractC7728.f18727.mo12740(protoBuf$ValueParameter != null ? protoBuf$ValueParameter.getFlags() : 0).booleanValue() ? EmptyList.INSTANCE : m9805(abstractC5640, interfaceC5533, annotatedCallableKind, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ArrayList mo2981(ProtoBuf$Type protoBuf$Type, InterfaceC7737 interfaceC7737) {
        protoBuf$Type.getClass();
        interfaceC7737.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$Type.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(annotationList, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            protoBuf$Annotation.getClass();
            arrayList.add(((C5480) this).f13924.m10113(protoBuf$Annotation, interfaceC7737));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final List mo2982(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        return !AbstractC7728.f18727.mo12740(protoBuf$ValueParameter.getFlags()).booleanValue() ? EmptyList.INSTANCE : (List) new C5465(this, abstractC5640, interfaceC5533, annotatedCallableKind, i).invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List m9804(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement abstractBinaryClassAnnotationLoader$PropertyRelatedElement) {
        C6986 c6986 = abstractC5640.f14363;
        Boolean boolMo12740 = AbstractC7728.f18712.mo12740(protoBuf$Property.getFlags());
        boolean zM12727 = C7722.m12727(protoBuf$Property);
        AbstractBinaryClassAnnotationLoader$PropertyRelatedElement abstractBinaryClassAnnotationLoader$PropertyRelatedElement2 = AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.PROPERTY;
        InterfaceC7737 interfaceC7737 = abstractC5640.f14364;
        if (abstractBinaryClassAnnotationLoader$PropertyRelatedElement == abstractBinaryClassAnnotationLoader$PropertyRelatedElement2) {
            C5471 c5471M5641 = AbstractC3400.m5641(protoBuf$Property, interfaceC7737, c6986, (40 & 8) == 0, (40 & 16) == 0, true);
            return c5471M5641 == null ? EmptyList.INSTANCE : m9799(this, abstractC5640, c5471M5641, boolMo12740, zM12727, 8);
        }
        C5471 c5471M56412 = AbstractC3400.m5641(protoBuf$Property, interfaceC7737, c6986, (40 & 8) == 0, (40 & 16) == 0, true);
        if (c5471M56412 == null) {
            return EmptyList.INSTANCE;
        }
        return AbstractC5976.m10735(c5471M56412.f13910, "$delegate", false) != (abstractBinaryClassAnnotationLoader$PropertyRelatedElement == AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.DELEGATE_FIELD) ? EmptyList.INSTANCE : m9803(abstractC5640, c5471M56412, true, true, boolMo12740, zM12727);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List m9805(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i) throws IOException {
        C5471 c5471M9798 = m9798(interfaceC5533, abstractC5640.f14364, abstractC5640.f14363, annotatedCallableKind, false);
        if (c5471M9798 == null) {
            return EmptyList.INSTANCE;
        }
        return m9799(this, abstractC5640, new C5471(c5471M9798.f13910 + '@' + i), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final List mo2984(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind) throws IOException {
        int setterFlags;
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC5533 instanceof ProtoBuf$Constructor) {
            setterFlags = ((ProtoBuf$Constructor) interfaceC5533).getFlags();
        } else if (interfaceC5533 instanceof ProtoBuf$Function) {
            setterFlags = ((ProtoBuf$Function) interfaceC5533).getFlags();
        } else if (interfaceC5533 instanceof ProtoBuf$Property) {
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) interfaceC5533;
            int i = AbstractC5463.f13890[annotatedCallableKind.ordinal()];
            setterFlags = i != 1 ? (i == 2 && protoBuf$Property.hasSetterFlags()) ? protoBuf$Property.getSetterFlags() : protoBuf$Property.getFlags() : protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : protoBuf$Property.getFlags();
        } else {
            setterFlags = 0;
        }
        if (!AbstractC7728.f18727.mo12740(setterFlags).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return m9804(abstractC5640, (ProtoBuf$Property) interfaceC5533, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.PROPERTY);
        }
        C5471 c5471M9798 = m9798(interfaceC5533, abstractC5640.f14364, abstractC5640.f14363, annotatedCallableKind, false);
        return c5471M9798 == null ? EmptyList.INSTANCE : m9799(this, abstractC5640, c5471M9798, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final List mo2986(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        return !AbstractC7728.f18727.mo12740(protoBuf$Property.getFlags()).booleanValue() ? EmptyList.INSTANCE : m9804(abstractC5640, protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final ArrayList mo2987(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC7737 interfaceC7737) {
        protoBuf$TypeParameter.getClass();
        interfaceC7737.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$TypeParameter.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(annotationList, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            protoBuf$Annotation.getClass();
            arrayList.add(((C5480) this).f13924.m10113(protoBuf$Annotation, interfaceC7737));
        }
        return arrayList;
    }
}
