package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.bumptech.glide.AbstractC3064;
import com.bumptech.glide.load.engine.C3004;
import io.ktor.client.plugins.AbstractC3932;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4610;
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
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5143;
import p015.C6230;
import p050.AbstractC6535;
import p053.AbstractC6560;
import p067.AbstractC6888;
import p067.C6885;
import p067.C6892;
import p070.AbstractC6898;
import p070.AbstractC6911;
import p070.InterfaceC6907;
import p071.AbstractC6912;
import p077.C6969;
import p077.C6970;
import p077.C6971;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4629 implements InterfaceC4811 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6970 f13540;

    public AbstractC4629(C6970 c6970) {
        this.f13540 = c6970;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C4638 m9249(InterfaceC4700 interfaceC4700, InterfaceC6907 interfaceC6907, C6230 c6230, AnnotatedCallableKind annotatedCallableKind, boolean z) throws IOException {
        interfaceC4700.getClass();
        interfaceC6907.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4700 instanceof ProtoBuf$Constructor) {
            C4725 c4725 = C6892.f18352;
            C6885 c6885M12143 = C6892.m12143((ProtoBuf$Constructor) interfaceC4700, interfaceC6907, c6230);
            if (c6885M12143 == null) {
                return null;
            }
            return AbstractC4921.m9891(c6885M12143);
        }
        if (interfaceC4700 instanceof ProtoBuf$Function) {
            C4725 c47252 = C6892.f18352;
            C6885 c6885M12141 = C6892.m12141((ProtoBuf$Function) interfaceC4700, interfaceC6907, c6230);
            if (c6885M12141 == null) {
                return null;
            }
            return AbstractC4921.m9891(c6885M12141);
        }
        if (!(interfaceC4700 instanceof ProtoBuf$Property)) {
            return null;
        }
        C4724 c4724 = AbstractC6912.f18434;
        c4724.getClass();
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC6911.m12176((GeneratedMessageLite.ExtendableMessage) interfaceC4700, c4724);
        if (jvmProtoBuf$JvmPropertySignature == null) {
            return null;
        }
        int i = AbstractC4630.f13541[annotatedCallableKind.ordinal()];
        if (i == 1) {
            if (!jvmProtoBuf$JvmPropertySignature.hasGetter()) {
                return null;
            }
            JvmProtoBuf$JvmMethodSignature getter = jvmProtoBuf$JvmPropertySignature.getGetter();
            getter.getClass();
            return new C4638(interfaceC6907.getString(getter.getName()).concat(interfaceC6907.getString(getter.getDesc())));
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return AbstractC3064.m6760((ProtoBuf$Property) interfaceC4700, interfaceC6907, c6230, true, true, z);
        }
        if (!jvmProtoBuf$JvmPropertySignature.hasSetter()) {
            return null;
        }
        JvmProtoBuf$JvmMethodSignature setter = jvmProtoBuf$JvmPropertySignature.getSetter();
        setter.getClass();
        return new C4638(interfaceC6907.getString(setter.getName()).concat(interfaceC6907.getString(setter.getDesc())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ List m9250(AbstractC4629 abstractC4629, AbstractC4807 abstractC4807, C4638 c4638, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractC4629.m9254(abstractC4807, c4638, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final List mo2397(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind) {
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        return m9256(abstractC4807, interfaceC4700, annotatedCallableKind, interfaceC4700 instanceof ProtoBuf$Function ? ((ProtoBuf$Function) interfaceC4700).getContextParameterCount() : interfaceC4700 instanceof ProtoBuf$Property ? ((ProtoBuf$Property) interfaceC4700).getContextParameterCount() : 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final List mo2398(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        return !AbstractC6898.f18387.mo12153(protoBuf$Property.getFlags()).booleanValue() ? EmptyList.INSTANCE : m9255(abstractC4807, protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final List mo2400(AbstractC4807 abstractC4807, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        abstractC4807.getClass();
        return m9250(this, abstractC4807, new C4638(AbstractC0053.m163('#', abstractC4807.f14015.getString(protoBuf$EnumEntry.getName()), AbstractC6888.m12133(((C4819) abstractC4807).f14038.m9336()))), null, false, 60);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3004 m9251(C4687 c4687, C6971 c6971, List list) {
        list.getClass();
        if (AbstractC6535.f17939.contains(c4687)) {
            return null;
        }
        return mo9252(c4687, c6971, list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract C3004 mo9252(C4687 c4687, InterfaceC4461 interfaceC4461, List list);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m9253(C4687 c4687) {
        if (c4687.m9334() != null && AbstractC4394.m8917(c4687.m9333().m9345(), "Container")) {
            C6969 c6969M10040 = AbstractC5061.m10040(this.f13540, c4687, ((C4647) this).f13577);
            if (c6969M10040 != null) {
                LinkedHashSet linkedHashSet = AbstractC6535.f17939;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Class cls = c6969M10040.f18666;
                cls.getClass();
                Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    if (AbstractC4430.m8987(AbstractC6560.m12029(AbstractC6560.m12033(annotation))).equals(AbstractC4610.f13467)) {
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
    public final java.util.List m9254(kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807 r9, kotlin.reflect.jvm.internal.impl.load.kotlin.C4638 r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
        /*
            r8 = this;
            r0 = r8
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏世哲兰 r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4647) r0
            飘花落叶言世楪哲兰子苏.飘花落叶言子楪世兰哲苏 r7 = r0.f13577
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世苏兰哲 r6 = r8.f13540
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4631.m9257(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != 0) goto L2a
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819
            r9 = 0
            if (r8 == 0) goto L29
            r8 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏 r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819) r8
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪苏兰 r8 = r8.f14013
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.C4634
            if (r11 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰世哲苏 r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4634) r8
            goto L24
        L23:
            r8 = r9
        L24:
            if (r8 == 0) goto L29
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r8 = r8.f13550
            goto L2a
        L29:
            r8 = r9
        L2a:
            if (r8 != 0) goto L2f
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.INSTANCE
            return r8
        L2f:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪世兰苏哲 r9 = r0.f13578
            java.lang.Object r8 = r9.invoke(r8)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世兰哲苏 r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.C4628) r8
            java.util.HashMap r8 = r8.f13539
            java.lang.Object r8 = r8.get(r10)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L43
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.INSTANCE
        L43:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4629.m9254(kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪苏哲兰, kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏世哲, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo2409(C4819 c4819) throws InvocationTargetException {
        c4819.getClass();
        if (!AbstractC6898.f18387.mo12153(c4819.f14040.getFlags()).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        InterfaceC4461 interfaceC4461 = c4819.f14013;
        C4634 c4634 = interfaceC4461 instanceof C4634 ? (C4634) interfaceC4461 : null;
        C6969 c6969 = c4634 != null ? c4634.f13550 : null;
        if (c6969 == null) {
            C0276.m844(c4819.f14038.m9337(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = c6969.f18666;
        cls.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsM12029 = AbstractC6560.m12029(AbstractC6560.m12033(annotation));
            C3004 c3004M9251 = m9251(AbstractC4430.m8987(clsM12029), new C6971(annotation), arrayList);
            if (c3004M9251 != null) {
                AbstractC3932.m8299(c3004M9251, annotation, clsM12029);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final List mo2410(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        return !AbstractC6898.f18387.mo12153(protoBuf$ValueParameter != null ? protoBuf$ValueParameter.getFlags() : 0).booleanValue() ? EmptyList.INSTANCE : m9256(abstractC4807, interfaceC4700, annotatedCallableKind, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final ArrayList mo2411(ProtoBuf$Type protoBuf$Type, InterfaceC6907 interfaceC6907) {
        protoBuf$Type.getClass();
        interfaceC6907.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$Type.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(annotationList, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            protoBuf$Annotation.getClass();
            arrayList.add(((C4647) this).f13575.m9564(protoBuf$Annotation, interfaceC6907));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final List mo2412(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        return !AbstractC6898.f18387.mo12153(protoBuf$ValueParameter.getFlags()).booleanValue() ? EmptyList.INSTANCE : (List) new C4632(this, abstractC4807, interfaceC4700, annotatedCallableKind, i).invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List m9255(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement abstractBinaryClassAnnotationLoader$PropertyRelatedElement) {
        C6230 c6230 = abstractC4807.f14014;
        Boolean boolMo12153 = AbstractC6898.f18372.mo12153(protoBuf$Property.getFlags());
        boolean zM12140 = C6892.m12140(protoBuf$Property);
        AbstractBinaryClassAnnotationLoader$PropertyRelatedElement abstractBinaryClassAnnotationLoader$PropertyRelatedElement2 = AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.PROPERTY;
        InterfaceC6907 interfaceC6907 = abstractC4807.f14015;
        if (abstractBinaryClassAnnotationLoader$PropertyRelatedElement == abstractBinaryClassAnnotationLoader$PropertyRelatedElement2) {
            C4638 c4638M6760 = AbstractC3064.m6760(protoBuf$Property, interfaceC6907, c6230, (40 & 8) == 0, (40 & 16) == 0, true);
            return c4638M6760 == null ? EmptyList.INSTANCE : m9250(this, abstractC4807, c4638M6760, boolMo12153, zM12140, 8);
        }
        C4638 c4638M67602 = AbstractC3064.m6760(protoBuf$Property, interfaceC6907, c6230, (40 & 8) == 0, (40 & 16) == 0, true);
        if (c4638M67602 == null) {
            return EmptyList.INSTANCE;
        }
        return AbstractC5143.m10171(c4638M67602.f13561, "$delegate", false) != (abstractBinaryClassAnnotationLoader$PropertyRelatedElement == AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.DELEGATE_FIELD) ? EmptyList.INSTANCE : m9254(abstractC4807, c4638M67602, true, true, boolMo12153, zM12140);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List m9256(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i) throws IOException {
        C4638 c4638M9249 = m9249(interfaceC4700, abstractC4807.f14015, abstractC4807.f14014, annotatedCallableKind, false);
        if (c4638M9249 == null) {
            return EmptyList.INSTANCE;
        }
        return m9250(this, abstractC4807, new C4638(c4638M9249.f13561 + '@' + i), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final List mo2414(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind) throws IOException {
        int setterFlags;
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4700 instanceof ProtoBuf$Constructor) {
            setterFlags = ((ProtoBuf$Constructor) interfaceC4700).getFlags();
        } else if (interfaceC4700 instanceof ProtoBuf$Function) {
            setterFlags = ((ProtoBuf$Function) interfaceC4700).getFlags();
        } else if (interfaceC4700 instanceof ProtoBuf$Property) {
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) interfaceC4700;
            int i = AbstractC4630.f13541[annotatedCallableKind.ordinal()];
            setterFlags = i != 1 ? (i == 2 && protoBuf$Property.hasSetterFlags()) ? protoBuf$Property.getSetterFlags() : protoBuf$Property.getFlags() : protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : protoBuf$Property.getFlags();
        } else {
            setterFlags = 0;
        }
        if (!AbstractC6898.f18387.mo12153(setterFlags).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return m9255(abstractC4807, (ProtoBuf$Property) interfaceC4700, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.PROPERTY);
        }
        C4638 c4638M9249 = m9249(interfaceC4700, abstractC4807.f14015, abstractC4807.f14014, annotatedCallableKind, false);
        return c4638M9249 == null ? EmptyList.INSTANCE : m9250(this, abstractC4807, c4638M9249, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final List mo2416(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        return !AbstractC6898.f18387.mo12153(protoBuf$Property.getFlags()).booleanValue() ? EmptyList.INSTANCE : m9255(abstractC4807, protoBuf$Property, AbstractBinaryClassAnnotationLoader$PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final ArrayList mo2417(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC6907 interfaceC6907) {
        protoBuf$TypeParameter.getClass();
        interfaceC6907.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$TypeParameter.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(annotationList, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            protoBuf$Annotation.getClass();
            arrayList.add(((C4647) this).f13575.m9564(protoBuf$Annotation, interfaceC6907));
        }
        return arrayList;
    }
}
