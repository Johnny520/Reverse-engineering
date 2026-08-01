package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.InterfaceC4398;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4415;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.text.AbstractC5139;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;
import p049.AbstractC6526;
import p049.AbstractC6527;
import p050.AbstractC6536;
import p071.AbstractC6913;
import p077.C6967;
import p079.AbstractC6989;
import p079.C7016;
import p097.InterfaceC7231;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5004 extends AbstractC5003 implements InterfaceC4398, InterfaceC5093, InterfaceC5011, InterfaceC7231 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final HashSet f14423;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f14424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5184 f14425;

    static {
        LinkedHashSet linkedHashSet = AbstractC6536.f17935;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((C4688) it.next()).m9327().f13696.toString());
        }
        f14423 = hashSet;
    }

    public C5004(Class cls) {
        cls.getClass();
        this.f14424 = cls;
        this.f14425 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5047(this, 4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static C7016 m9980(C4688 c4688, C6967 c6967) {
        C4833 c4833 = c6967.f18656;
        C4415 c4415 = new C4415(c4833.f14091, c4688.f13699, 1);
        C4691 c4691M9323 = c4688.m9323();
        Modality modality = Modality.FINAL;
        ClassKind classKind = ClassKind.CLASS;
        List listM11928 = AbstractC6347.m11928(c4833.f14091.mo9061().m12036("Any").mo9025());
        C4845 c4845 = c4833.f14092;
        C7016 c7016 = new C7016(c4415, c4691M9323, modality, classKind, listM11928, c4845);
        c7016.m12357(new C5001(c4845, c7016, 0), EmptySet.INSTANCE, null);
        return c7016;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m9981(kotlin.reflect.jvm.internal.C5004 r6, p101.InterfaceC7254 r7, kotlin.reflect.jvm.internal.KClassImpl$MemberBelonginess r8) {
        /*
            r6.getClass()
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪世兰苏 r0 = new kotlin.reflect.jvm.internal.飘花落叶言子哲楪世兰苏
            r1 = 0
            r0.<init>(r6, r1)
            r6 = 3
            r1 = 0
            java.util.Collection r6 = com.bumptech.glide.AbstractC3066.m6860(r7, r1, r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
            if (r3 == 0) goto L48
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲苏兰 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480) r3
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世苏兰 r4 = r3.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世苏兰 r5 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489.f13124
            boolean r4 = kotlin.jvm.internal.AbstractC4395.m8907(r4, r5)
            if (r4 != 0) goto L48
            boolean r3 = r8.accept(r3)
            if (r3 == 0) goto L48
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
            java.lang.Object r2 = r2.mo9027(r0, r3)
            kotlin.reflect.jvm.internal.飘花落叶言子楪哲世兰苏 r2 = (kotlin.reflect.jvm.internal.AbstractC5024) r2
            goto L49
        L48:
            r2 = r1
        L49:
            if (r2 == 0) goto L1a
            r7.add(r2)
            goto L1a
        L4f:
            java.util.List r6 = kotlin.collections.AbstractC4344.m8797(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C5004.m9981(kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏世兰, 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲世兰苏, kotlin.reflect.jvm.internal.KClassImpl$MemberBelonginess):java.util.List");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5004) && AbstractC3057.m6757(this).equals(AbstractC3057.m6757((InterfaceC5093) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC4398
    public final GenericDeclaration findJavaDeclaration() {
        return this.f14424;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        C5074 c5074 = ((C5045) this.f14425.getValue()).f14538;
        InterfaceC5088 interfaceC5088 = C5045.f14536[1];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getSimpleName() {
        C5074 c5074 = ((C5045) this.f14425.getValue()).f14537;
        InterfaceC5088 interfaceC5088 = C5045.f14536[2];
        return (String) c5074.invoke();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        C5074 c5074 = ((C5045) this.f14425.getValue()).f14555;
        InterfaceC5088 interfaceC5088 = C5045.f14536[6];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final int hashCode() {
        return AbstractC3057.m6757(this).hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isInstance(Object obj) {
        List list = AbstractC4431.f13055;
        Class cls = this.f14424;
        cls.getClass();
        Integer num = (Integer) AbstractC4431.f13052.get(cls);
        if (num != null) {
            return AbstractC4388.m8894(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC4431.f13053.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    public final String toString() {
        C4688 c4688M9984 = m9984();
        C4687 c4687 = c4688M9984.f13699;
        return "class ".concat((c4687.f13696.m9314() ? "" : AbstractC0053.m148(new StringBuilder(), c4687.f13696.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).concat(AbstractC5139.m10129(c4688M9984.f13698.f13696.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$')));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C4549 m9982() {
        return ((C5045) this.f14425.getValue()).m9998();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final AbstractC6989 m9983() {
        return ((C5045) this.f14425.getValue()).m9999();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C4688 m9984() {
        PrimitiveType primitiveType;
        C4688 c4688 = AbstractC5068.f14609;
        Class cls = this.f14424;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            if (primitiveType != null) {
                return new C4688(AbstractC6526.f17853, primitiveType.getArrayTypeName());
            }
            C4687 c4687M9319 = AbstractC6527.f17899.m9319();
            return new C4688(c4687M9319.m9320(), c4687M9319.f13696.m9318());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC5068.f14609;
        }
        primitiveType = cls.isPrimitive() ? JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new C4688(AbstractC6526.f17853, primitiveType.getTypeName());
        }
        C4688 c4688M8977 = AbstractC4431.m8977(cls);
        if (!c4688M8977.f13697) {
            String str = C4410.f12987;
            C4688 c4688M8946 = C4410.m8946(c4688M8977.m9327());
            if (c4688M8946 != null) {
                return c4688M8946;
            }
        }
        return c4688M8977;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final kotlin.reflect.jvm.internal.impl.km.ClassKind m9985() {
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKindM9133;
        C4549 c4549M9982 = m9982();
        if (c4549M9982 != null && (classKindM9133 = AbstractC4545.m9133(c4549M9982)) != null) {
            return classKindM9133;
        }
        Class cls = this.f14424;
        return cls.isAnnotation() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS : cls.isInterface() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE : cls.isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_CLASS : cls.getSuperclass().isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_ENTRY : kotlin.reflect.jvm.internal.impl.km.ClassKind.CLASS;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final Collection mo9931(C4691 c4691) {
        InterfaceC7254 interfaceC7254Mo9724 = m9983().mo9025().mo9724();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection collectionMo9167 = interfaceC7254Mo9724.mo9167(c4691, noLookupLocation);
        InterfaceC7254 interfaceC7254Mo9006 = m9983().mo9006();
        interfaceC7254Mo9006.getClass();
        return AbstractC4344.m8793(interfaceC7254Mo9006.mo9167(c4691, noLookupLocation), collectionMo9167);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final C4536 mo9932(int i) {
        ArrayList arrayList;
        C4549 c4549M9982 = m9982();
        if (c4549M9982 == null || (arrayList = AbstractC3056.m6716(c4549M9982).f18954) == null) {
            return null;
        }
        return (C4536) AbstractC4344.m8818(i, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC4473 mo9933(int i) {
        AbstractC6989 abstractC6989M9983 = m9983();
        C4801 c4801 = abstractC6989M9983 instanceof C4801 ? (C4801) abstractC6989M9983 : null;
        if (c4801 != null) {
            ProtoBuf$Class protoBuf$Class = c4801.f14003;
            C4725 c4725 = AbstractC6913.f18433;
            c4725.getClass();
            protoBuf$Class.getClass();
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) (i < protoBuf$Class.getExtensionCount(c4725) ? protoBuf$Class.getExtension(c4725, i) : null);
            if (protoBuf$Property != null) {
                C4974 c4974 = new C4974(this);
                C4824 c4824 = c4801.f13994;
                return (InterfaceC4473) AbstractC5067.m10060(this.f14424, c4974, protoBuf$Property, c4824.f14061, c4824.f14059, c4801.f14006, C5050.f14572);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final Collection mo9934(C4691 c4691) {
        InterfaceC7254 interfaceC7254Mo9724 = m9983().mo9025().mo9724();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection collectionMo9165 = interfaceC7254Mo9724.mo9165(c4691, noLookupLocation);
        InterfaceC7254 interfaceC7254Mo9006 = m9983().mo9006();
        interfaceC7254Mo9006.getClass();
        return AbstractC4344.m8793(interfaceC7254Mo9006.mo9165(c4691, noLookupLocation), collectionMo9165);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Collection mo9935() {
        Collection collectionMo9007 = m9983().mo9007();
        collectionMo9007.getClass();
        return collectionMo9007;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo8877() {
        C4549 c4549M9982 = m9982();
        return (c4549M9982 != null ? AbstractC4545.m9133(c4549M9982) : null) == kotlin.reflect.jvm.internal.impl.km.ClassKind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Collection mo8878() {
        return ((C5045) this.f14425.getValue()).m10000();
    }

    @Override // kotlin.jvm.internal.InterfaceC4387
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo8879() {
        return this.f14424;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo8880() {
        return ((C5045) this.f14425.getValue()).f14558.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8881() {
        C5074 c5074 = ((C5045) this.f14425.getValue()).f14548;
        InterfaceC5088 interfaceC5088 = C5045.f14536[8];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8882() {
        C4549 c4549M9982 = m9982();
        if (c4549M9982 != null) {
            return AbstractC4545.f13259.m577(c4549M9982, AbstractC4545.f13263[10]);
        }
        Class cls = this.f14424;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Collection mo8883() {
        C5074 c5074 = ((C5045) this.f14425.getValue()).f14553;
        InterfaceC5088 interfaceC5088 = C5045.f14536[4];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo8884() {
        C4549 c4549M9982 = m9982();
        return c4549M9982 != null && AbstractC4545.f13258.m577(c4549M9982, AbstractC4545.f13263[14]);
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8885() {
        C5074 c5074 = ((C5045) this.f14425.getValue()).f14554;
        InterfaceC5088 interfaceC5088 = C5045.f14536[3];
        return (String) c5074.invoke();
    }

    @Override // kotlin.reflect.InterfaceC5093
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8886() {
        C5074 c5074 = ((C5045) this.f14425.getValue()).f14557;
        InterfaceC5088 interfaceC5088 = C5045.f14536[5];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }
}
