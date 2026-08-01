package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3887;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.C5874;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5259;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5268;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5271;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5278;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5282;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5283;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5396;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.checker.C5687;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5683;
import p065.AbstractC7358;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p081.C7698;
import p082.AbstractC7699;
import p082.AbstractC7705;
import p093.C7797;
import p093.C7802;
import p095.AbstractC7818;
import p095.C7821;
import p099.C7868;
import p099.C7870;
import p100.C7877;
import p267.AbstractC9004;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5419 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5407 f13720;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13721;

    public /* synthetic */ C5419(AbstractC5407 abstractC5407, int i) {
        this.f13721 = i;
        this.f13720 = abstractC5407;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026a  */
    /* JADX WARN: Type inference failed for: r5v29, types: [T, 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏哲兰楪] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, kotlin.reflect.jvm.internal.impl.load.java.descriptors.飘花落叶言子楪世兰哲苏, 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏哲兰楪] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws Throwable {
        char c;
        C7870 c7870;
        boolean z;
        AbstractC5269 c5271;
        int i = this.f13721;
        AbstractC5407 abstractC5407 = this.f13720;
        switch (i) {
            case 0:
                C5523 c5523 = (C5523) obj;
                c5523.getClass();
                AbstractC5407 abstractC54072 = abstractC5407.f13680;
                if (abstractC54072 != null) {
                    return (Collection) abstractC54072.f13677.invoke(c5523);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((InterfaceC5413) abstractC5407.f13678.invoke()).mo9740(c5523).iterator();
                while (it.hasNext()) {
                    C5397 c5397M9729 = abstractC5407.m9729((C5268) it.next());
                    if (abstractC5407.mo9730(c5397M9729)) {
                        ((C7870) abstractC5407.f13681.f1440).f19253.getClass();
                        arrayList.add(c5397M9729);
                    }
                }
                abstractC5407.mo9721(arrayList, c5523);
                return arrayList;
            case 1:
                C5523 c55232 = (C5523) obj;
                c55232.getClass();
                AbstractC5407 abstractC54073 = abstractC5407.f13680;
                if (abstractC54073 != null) {
                    return (InterfaceC5305) abstractC54073.f13683.invoke(c55232);
                }
                C5278 c5278Mo9743 = ((InterfaceC5413) abstractC5407.f13678.invoke()).mo9743(c55232);
                if (c5278Mo9743 != null) {
                    Field field = c5278Mo9743.f13419;
                    if (!field.isEnumConstant()) {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        boolean z2 = !Modifier.isFinal(((Field) c5278Mo9743.mo9538()).getModifiers());
                        C1171 c1171 = abstractC5407.f13681;
                        C7868 c7868M5620 = AbstractC3400.m5620(c1171, c5278Mo9743);
                        C7870 c78702 = (C7870) c1171.f1440;
                        InterfaceC5331 interfaceC5331Mo9716 = abstractC5407.mo9716();
                        Modality modality = Modality.FINAL;
                        C5322 c5322M14185 = AbstractC9004.m14185(c5278Mo9743.m9541());
                        C5523 c5523M9543 = c5278Mo9743.m9543();
                        c78702.f19257.getClass();
                        C7802 c7802M12843 = C7797.m12843(c5278Mo9743);
                        if (Modifier.isFinal(((Field) c5278Mo9743.mo9538()).getModifiers()) && Modifier.isStatic(((Field) c5278Mo9743.mo9538()).getModifiers())) {
                            c = 1;
                            c7870 = c78702;
                            z = true;
                        } else {
                            c = 1;
                            c7870 = c78702;
                            z = false;
                        }
                        ?? M9694 = C5396.m9694(interfaceC5331Mo9716, c7868M5620, modality, c5322M14185, z2, c5523M9543, c7802M12843, z);
                        ref$ObjectRef.element = M9694;
                        M9694.m12880(null, null, null, null);
                        C0955 c0955 = (C0955) c1171.f1438;
                        Type genericType = field.getGenericType();
                        genericType.getClass();
                        boolean z3 = genericType instanceof Class;
                        if (z3) {
                            Class cls = (Class) genericType;
                            c5271 = cls.isPrimitive() ? new C5271(cls) : ((genericType instanceof GenericArrayType) || (z3 && ((Class) genericType).isArray())) ? new C5283(genericType) : genericType instanceof WildcardType ? new C5259((WildcardType) genericType) : new C5282(genericType);
                        }
                        AbstractC5714 abstractC5714M917 = c0955.m917(c5271, C9496.m14920(TypeUsage.COMMON, false, null, 7));
                        if ((AbstractC7359.m12576(abstractC5714M917) || AbstractC7359.m12575(abstractC5714M917)) && Modifier.isFinal(((Field) c5278Mo9743.mo9538()).getModifiers())) {
                            Modifier.isStatic(((Field) c5278Mo9743.mo9538()).getModifiers());
                        }
                        C7821 c7821 = (C7821) ref$ObjectRef.element;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        c7821.m12879(abstractC5714M917, emptyList, abstractC5407.mo9712(), null, emptyList);
                        InterfaceC5331 interfaceC5331Mo97162 = abstractC5407.mo9716();
                        AbstractC7818 abstractC7818 = interfaceC5331Mo97162 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5331Mo97162 : null;
                        if (abstractC7818 != null) {
                            ref$ObjectRef.element = ((C7698) c7870.f19243).m12658(abstractC7818, (C7821) ref$ObjectRef.element, c1171);
                        }
                        T t = ref$ObjectRef.element;
                        InterfaceC5287 interfaceC5287 = (InterfaceC5287) t;
                        AbstractC5714 type = ((C7821) t).getType();
                        if (interfaceC5287 == null) {
                            AbstractC7699.m12665(65);
                            throw null;
                        }
                        if (type == null) {
                            AbstractC7699.m12665(66);
                            throw null;
                        }
                        int i2 = AbstractC7699.f18657;
                        if (!interfaceC5287.mo9554() && !AbstractC5725.m10388(type)) {
                            if (AbstractC5749.m10406(type)) {
                                ((C7821) ref$ObjectRef.element).m12881(null, new C5874(abstractC5407, c5278Mo9743, ref$ObjectRef, 5));
                            } else {
                                AbstractC7359 abstractC7359M10058 = AbstractC5605.m10058(interfaceC5287);
                                if (!AbstractC7359.m12576(type)) {
                                    C5687 c5687 = InterfaceC5683.f14478;
                                    if (c5687.m10158(abstractC7359M10058.m12588(), type) || c5687.m10158(abstractC7359M10058.m12595("Number").mo9584(), type) || c5687.m10158(abstractC7359M10058.m12584(), type) || AbstractC7358.m12566(type)) {
                                    }
                                }
                            }
                        }
                        C7877 c7877 = c7870.f19253;
                        InterfaceC5305 interfaceC5305 = (InterfaceC5305) ref$ObjectRef.element;
                        c7877.getClass();
                        if (interfaceC5305 != null) {
                            return (InterfaceC5305) ref$ObjectRef.element;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[c] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                C5523 c55233 = (C5523) obj;
                c55233.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) abstractC5407.f13677.invoke(c55233));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String strM7220 = AbstractC3887.m7220((InterfaceC5303) obj2, 2);
                    Object arrayList2 = linkedHashMap.get(strM7220);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strM7220, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionM12686 = AbstractC7705.m12686(list, C5431.f13762);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionM12686);
                    }
                }
                abstractC5407.mo9715(linkedHashSet, c55233);
                C1171 c11712 = abstractC5407.f13681;
                return AbstractC5176.m9356(((C7870) c11712.f1440).f19249.m12783(c11712, linkedHashSet));
            default:
                C5523 c55234 = (C5523) obj;
                c55234.getClass();
                ArrayList arrayList3 = new ArrayList();
                Object objInvoke = abstractC5407.f13683.invoke(c55234);
                if (objInvoke != null) {
                    arrayList3.add(objInvoke);
                }
                abstractC5407.mo9711(arrayList3, c55234);
                InterfaceC5331 interfaceC5331Mo97163 = abstractC5407.mo9716();
                int i3 = AbstractC7699.f18657;
                if (AbstractC7699.m12675(interfaceC5331Mo97163, ClassKind.ANNOTATION_CLASS)) {
                    return AbstractC5176.m9356(arrayList3);
                }
                C1171 c11713 = abstractC5407.f13681;
                return AbstractC5176.m9356(((C7870) c11713.f1440).f19249.m12783(c11713, arrayList3));
        }
    }
}
