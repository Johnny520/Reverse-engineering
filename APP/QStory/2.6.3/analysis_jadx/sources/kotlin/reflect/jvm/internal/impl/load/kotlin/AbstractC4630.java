package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.window.area.AbstractC2567;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3057;
import com.bumptech.glide.load.engine.C3005;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4611;
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
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4808;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4820;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812;
import kotlin.text.AbstractC5144;
import p007.C6157;
import p050.AbstractC6536;
import p067.AbstractC6889;
import p067.C6886;
import p067.C6893;
import p070.AbstractC6899;
import p070.AbstractC6912;
import p070.InterfaceC6908;
import p071.AbstractC6913;
import p077.C6970;
import p077.C6971;
import p077.C6972;
import p251.AbstractC8175;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4630 implements InterfaceC4812 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6971 f13544;

    public AbstractC4630(C6971 c6971) {
        this.f13544 = c6971;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C4639 m9239(InterfaceC4701 interfaceC4701, InterfaceC6908 interfaceC6908, C6157 c6157, AnnotatedCallableKind annotatedCallableKind, boolean z) throws IOException {
        interfaceC4701.getClass();
        interfaceC6908.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4701 instanceof ProtoBuf$Constructor) {
            C4726 c4726 = C6893.f18347;
            C6886 c6886M12171 = C6893.m12171((ProtoBuf$Constructor) interfaceC4701, interfaceC6908, c6157);
            if (c6886M12171 == null) {
                return null;
            }
            return AbstractC3056.m6712(c6886M12171);
        }
        if (interfaceC4701 instanceof ProtoBuf$Function) {
            C4726 c47262 = C6893.f18347;
            C6886 c6886M12169 = C6893.m12169((ProtoBuf$Function) interfaceC4701, interfaceC6908, c6157);
            if (c6886M12169 == null) {
                return null;
            }
            return AbstractC3056.m6712(c6886M12169);
        }
        if (!(interfaceC4701 instanceof ProtoBuf$Property)) {
            return null;
        }
        C4725 c4725 = AbstractC6913.f18429;
        c4725.getClass();
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC6912.m12204((GeneratedMessageLite.ExtendableMessage) interfaceC4701, c4725);
        if (jvmProtoBuf$JvmPropertySignature == null) {
            return null;
        }
        int i = AbstractC4631.f13545[annotatedCallableKind.ordinal()];
        if (i == 1) {
            if (!jvmProtoBuf$JvmPropertySignature.hasGetter()) {
                return null;
            }
            JvmProtoBuf$JvmMethodSignature getter = jvmProtoBuf$JvmPropertySignature.getGetter();
            getter.getClass();
            return new C4639(interfaceC6908.getString(getter.getName()).concat(interfaceC6908.getString(getter.getDesc())));
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return AbstractC2567.m5081((ProtoBuf$Property) interfaceC4701, interfaceC6908, c6157, true, true, z);
        }
        if (!jvmProtoBuf$JvmPropertySignature.hasSetter()) {
            return null;
        }
        JvmProtoBuf$JvmMethodSignature setter = jvmProtoBuf$JvmPropertySignature.getSetter();
        setter.getClass();
        return new C4639(interfaceC6908.getString(setter.getName()).concat(interfaceC6908.getString(setter.getDesc())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ List m9240(AbstractC4630 abstractC4630, AbstractC4808 abstractC4808, C4639 c4639, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractC4630.m9244(abstractC4808, c4639, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final List mo2407(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind) {
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        return m9246(abstractC4808, interfaceC4701, annotatedCallableKind, interfaceC4701 instanceof ProtoBuf$Function ? ((ProtoBuf$Function) interfaceC4701).getContextParameterCount() : interfaceC4701 instanceof ProtoBuf$Property ? ((ProtoBuf$Property) interfaceC4701).getContextParameterCount() : 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final List mo2408(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        return !AbstractC6899.f18382.mo12181(protoBuf$Property.getFlags()).booleanValue() ? EmptyList.INSTANCE : m9245(abstractC4808, protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final List mo2410(AbstractC4808 abstractC4808, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        abstractC4808.getClass();
        return m9240(this, abstractC4808, new C4639(AbstractC0053.m164('#', abstractC4808.f14019.getString(protoBuf$EnumEntry.getName()), AbstractC6889.m12161(((C4820) abstractC4808).f14042.m9326()))), null, false, 60);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3005 m9241(C4688 c4688, C6972 c6972, List list) {
        list.getClass();
        if (AbstractC6536.f17935.contains(c4688)) {
            return null;
        }
        return mo9242(c4688, c6972, list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract C3005 mo9242(C4688 c4688, InterfaceC4462 interfaceC4462, List list);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m9243(C4688 c4688) {
        if (c4688.m9324() != null && AbstractC4395.m8907(c4688.m9323().m9335(), "Container")) {
            C6970 c6970M6754 = AbstractC3057.m6754(this.f13544, c4688, ((C4648) this).f13581);
            if (c6970M6754 != null) {
                LinkedHashSet linkedHashSet = AbstractC6536.f17935;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Class cls = c6970M6754.f18661;
                cls.getClass();
                Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    if (AbstractC4431.m8977(AbstractC3057.m6756(AbstractC3057.m6759(annotation))).equals(AbstractC4611.f13471)) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m9244(kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4808 r9, kotlin.reflect.jvm.internal.impl.load.kotlin.C4639 r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
        /*
            r8 = this;
            r0 = r8
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏世哲兰 r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4648) r0
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r7 = r0.f13581
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世苏兰哲 r6 = r8.f13544
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4632.m9247(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != 0) goto L2a
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4820
            r9 = 0
            if (r8 == 0) goto L29
            r8 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏 r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4820) r8
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪苏兰 r8 = r8.f14017
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.C4635
            if (r11 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏 r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4635) r8
            goto L24
        L23:
            r8 = r9
        L24:
            if (r8 == 0) goto L29
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r8 = r8.f13554
            goto L2a
        L29:
            r8 = r9
        L2a:
            if (r8 != 0) goto L2f
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.INSTANCE
            return r8
        L2f:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪世兰苏哲 r9 = r0.f13582
            java.lang.Object r8 = r9.invoke(r8)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世兰哲苏 r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4629) r8
            java.util.HashMap r8 = r8.f13543
            java.lang.Object r8 = r8.get(r10)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L43
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.INSTANCE
        L43:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4630.m9244(kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪苏哲兰, kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏世哲, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo2419(C4820 c4820) throws InvocationTargetException {
        c4820.getClass();
        if (!AbstractC6899.f18382.mo12181(c4820.f14044.getFlags()).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        InterfaceC4462 interfaceC4462 = c4820.f14017;
        C4635 c4635 = interfaceC4462 instanceof C4635 ? (C4635) interfaceC4462 : null;
        C6970 c6970 = c4635 != null ? c4635.f13554 : null;
        if (c6970 == null) {
            C0276.m845(c4820.f14042.m9327(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = c6970.f18661;
        cls.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsM6756 = AbstractC3057.m6756(AbstractC3057.m6759(annotation));
            C3005 c3005M9241 = m9241(AbstractC4431.m8977(clsM6756), new C6972(annotation), arrayList);
            if (c3005M9241 != null) {
                AbstractC8175.m13629(c3005M9241, annotation, clsM6756);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final List mo2420(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        return !AbstractC6899.f18382.mo12181(protoBuf$ValueParameter != null ? protoBuf$ValueParameter.getFlags() : 0).booleanValue() ? EmptyList.INSTANCE : m9246(abstractC4808, interfaceC4701, annotatedCallableKind, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ArrayList mo2421(ProtoBuf$Type protoBuf$Type, InterfaceC6908 interfaceC6908) {
        protoBuf$Type.getClass();
        interfaceC6908.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$Type.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(annotationList, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            protoBuf$Annotation.getClass();
            arrayList.add(((C4648) this).f13579.m9554(protoBuf$Annotation, interfaceC6908));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final List mo2422(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        return !AbstractC6899.f18382.mo12181(protoBuf$ValueParameter.getFlags()).booleanValue() ? EmptyList.INSTANCE : (List) new C4633(this, abstractC4808, interfaceC4701, annotatedCallableKind, i).invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List m9245(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement abstractBinaryClassAnnotationLoader$PropertyRelatedElement) {
        C6157 c6157 = abstractC4808.f14018;
        Boolean boolMo12181 = AbstractC6899.f18367.mo12181(protoBuf$Property.getFlags());
        boolean zM12168 = C6893.m12168(protoBuf$Property);
        AbstractBinaryClassAnnotationLoader$PropertyRelatedElement abstractBinaryClassAnnotationLoader$PropertyRelatedElement2 = AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.PROPERTY;
        InterfaceC6908 interfaceC6908 = abstractC4808.f14019;
        if (abstractBinaryClassAnnotationLoader$PropertyRelatedElement == abstractBinaryClassAnnotationLoader$PropertyRelatedElement2) {
            C4639 c4639M5081 = AbstractC2567.m5081(protoBuf$Property, interfaceC6908, c6157, (40 & 8) == 0, (40 & 16) == 0, true);
            return c4639M5081 == null ? EmptyList.INSTANCE : m9240(this, abstractC4808, c4639M5081, boolMo12181, zM12168, 8);
        }
        C4639 c4639M50812 = AbstractC2567.m5081(protoBuf$Property, interfaceC6908, c6157, (40 & 8) == 0, (40 & 16) == 0, true);
        if (c4639M50812 == null) {
            return EmptyList.INSTANCE;
        }
        return AbstractC5144.m10176(c4639M50812.f13565, "$delegate", false) != (abstractBinaryClassAnnotationLoader$PropertyRelatedElement == AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.DELEGATE_FIELD) ? EmptyList.INSTANCE : m9244(abstractC4808, c4639M50812, true, true, boolMo12181, zM12168);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List m9246(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind, int i) throws IOException {
        C4639 c4639M9239 = m9239(interfaceC4701, abstractC4808.f14019, abstractC4808.f14018, annotatedCallableKind, false);
        if (c4639M9239 == null) {
            return EmptyList.INSTANCE;
        }
        return m9240(this, abstractC4808, new C4639(c4639M9239.f13565 + '@' + i), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final List mo2424(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind) throws IOException {
        int setterFlags;
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4701 instanceof ProtoBuf$Constructor) {
            setterFlags = ((ProtoBuf$Constructor) interfaceC4701).getFlags();
        } else if (interfaceC4701 instanceof ProtoBuf$Function) {
            setterFlags = ((ProtoBuf$Function) interfaceC4701).getFlags();
        } else if (interfaceC4701 instanceof ProtoBuf$Property) {
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) interfaceC4701;
            int i = AbstractC4631.f13545[annotatedCallableKind.ordinal()];
            setterFlags = i != 1 ? (i == 2 && protoBuf$Property.hasSetterFlags()) ? protoBuf$Property.getSetterFlags() : protoBuf$Property.getFlags() : protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : protoBuf$Property.getFlags();
        } else {
            setterFlags = 0;
        }
        if (!AbstractC6899.f18382.mo12181(setterFlags).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return m9245(abstractC4808, (ProtoBuf$Property) interfaceC4701, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.PROPERTY);
        }
        C4639 c4639M9239 = m9239(interfaceC4701, abstractC4808.f14019, abstractC4808.f14018, annotatedCallableKind, false);
        return c4639M9239 == null ? EmptyList.INSTANCE : m9240(this, abstractC4808, c4639M9239, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final List mo2426(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        return !AbstractC6899.f18382.mo12181(protoBuf$Property.getFlags()).booleanValue() ? EmptyList.INSTANCE : m9245(abstractC4808, protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final ArrayList mo2427(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC6908 interfaceC6908) {
        protoBuf$TypeParameter.getClass();
        interfaceC6908.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$TypeParameter.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(annotationList, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            protoBuf$Annotation.getClass();
            arrayList.add(((C4648) this).f13579.m9554(protoBuf$Annotation, interfaceC6908));
        }
        return arrayList;
    }
}
