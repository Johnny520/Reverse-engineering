package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.InterfaceC4397;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4414;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.text.AbstractC5138;
import net.bytebuddy.pool.TypePool;
import p049.AbstractC6525;
import p049.AbstractC6526;
import p050.AbstractC6535;
import p053.AbstractC6560;
import p071.AbstractC6912;
import p077.C6966;
import p079.AbstractC6988;
import p079.C7015;
import p097.InterfaceC7230;
import p101.InterfaceC7253;
import p251.AbstractC8174;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5003 extends AbstractC5002 implements InterfaceC4397, InterfaceC5092, InterfaceC5010, InterfaceC7230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final HashSet f14421;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f14422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5183 f14423;

    static {
        LinkedHashSet linkedHashSet = AbstractC6535.f17939;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((C4687) it.next()).m9337().f13692.toString());
        }
        f14421 = hashSet;
    }

    public C5003(Class cls) {
        cls.getClass();
        this.f14422 = cls;
        this.f14423 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5046(this, 4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static C7015 m9983(C4687 c4687, C6966 c6966) {
        C4832 c4832 = c6966.f18661;
        C4414 c4414 = new C4414(c4832.f14087, c4687.f13695, 1);
        C4690 c4690M9333 = c4687.m9333();
        Modality modality = Modality.FINAL;
        ClassKind classKind = ClassKind.CLASS;
        List listM13660 = AbstractC8189.m13660(c4832.f14087.mo9071().m11993("Any").mo9035());
        C4844 c4844 = c4832.f14088;
        C7015 c7015 = new C7015(c4414, c4690M9333, modality, classKind, listM13660, c4844);
        c7015.m12330(new C5000(c4844, c7015, 0), EmptySet.INSTANCE, null);
        return c7015;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m9984(kotlin.reflect.jvm.internal.C5003 r6, p101.InterfaceC7253 r7, kotlin.reflect.jvm.internal.KClassImpl$MemberBelonginess r8) {
        /*
            r6.getClass()
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪世兰苏 r0 = new kotlin.reflect.jvm.internal.飘花落叶言子哲楪世兰苏
            r1 = 0
            r0.<init>(r6, r1)
            r6 = 3
            r1 = 0
            java.util.Collection r6 = androidx.compose.foundation.draganddrop.AbstractC0455.m1162(r7, r1, r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪苏哲世兰 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479
            if (r3 == 0) goto L48
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲苏兰 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479) r3
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世苏兰 r4 = r3.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世苏兰 r5 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488.f13120
            boolean r4 = kotlin.jvm.internal.AbstractC4394.m8917(r4, r5)
            if (r4 != 0) goto L48
            boolean r3 = r8.accept(r3)
            if (r3 == 0) goto L48
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
            java.lang.Object r2 = r2.mo9037(r0, r3)
            kotlin.reflect.jvm.internal.飘花落叶言子楪哲世兰苏 r2 = (kotlin.reflect.jvm.internal.AbstractC5023) r2
            goto L49
        L48:
            r2 = r1
        L49:
            if (r2 == 0) goto L1a
            r7.add(r2)
            goto L1a
        L4f:
            java.util.List r6 = kotlin.collections.AbstractC4343.m8804(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C5003.m9984(kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏世兰, 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲世兰苏, kotlin.reflect.jvm.internal.KClassImpl$MemberBelonginess):java.util.List");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5003) && AbstractC6560.m12026(this).equals(AbstractC6560.m12026((InterfaceC5092) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC4397
    public final GenericDeclaration findJavaDeclaration() {
        return this.f14422;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        C5073 c5073 = ((C5044) this.f14423.getValue()).f14536;
        InterfaceC5087 interfaceC5087 = C5044.f14534[1];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final String getSimpleName() {
        C5073 c5073 = ((C5044) this.f14423.getValue()).f14535;
        InterfaceC5087 interfaceC5087 = C5044.f14534[2];
        return (String) c5073.invoke();
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final List getTypeParameters() {
        C5073 c5073 = ((C5044) this.f14423.getValue()).f14553;
        InterfaceC5087 interfaceC5087 = C5044.f14534[6];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final int hashCode() {
        return AbstractC6560.m12026(this).hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5092
    public final boolean isInstance(Object obj) {
        List list = AbstractC4430.f13051;
        Class cls = this.f14422;
        cls.getClass();
        Integer num = (Integer) AbstractC4430.f13048.get(cls);
        if (num != null) {
            return AbstractC4387.m8904(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC4430.f13049.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    public final String toString() {
        C4687 c4687M9987 = m9987();
        C4686 c4686 = c4687M9987.f13695;
        return "class ".concat((c4686.f13692.m9324() ? "" : AbstractC0053.m155(new StringBuilder(), c4686.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).concat(AbstractC5138.m10129(c4687M9987.f13694.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$')));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C4548 m9985() {
        return ((C5044) this.f14423.getValue()).m10001();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final AbstractC6988 m9986() {
        return ((C5044) this.f14423.getValue()).m10002();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C4687 m9987() {
        PrimitiveType primitiveType;
        C4687 c4687 = AbstractC5067.f14609;
        Class cls = this.f14422;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            if (primitiveType != null) {
                return new C4687(AbstractC6525.f17857, primitiveType.getArrayTypeName());
            }
            C4686 c4686M9329 = AbstractC6526.f17903.m9329();
            return new C4687(c4686M9329.m9330(), c4686M9329.f13692.m9328());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC5067.f14609;
        }
        primitiveType = cls.isPrimitive() ? JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new C4687(AbstractC6525.f17857, primitiveType.getTypeName());
        }
        C4687 c4687M8987 = AbstractC4430.m8987(cls);
        if (!c4687M8987.f13693) {
            String str = C4409.f12983;
            C4687 c4687M8956 = C4409.m8956(c4687M8987.m9337());
            if (c4687M8956 != null) {
                return c4687M8956;
            }
        }
        return c4687M8987;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final kotlin.reflect.jvm.internal.impl.km.ClassKind m9988() {
        kotlin.reflect.jvm.internal.impl.km.ClassKind classKindM9143;
        C4548 c4548M9985 = m9985();
        if (c4548M9985 != null && (classKindM9143 = AbstractC4544.m9143(c4548M9985)) != null) {
            return classKindM9143;
        }
        Class cls = this.f14422;
        return cls.isAnnotation() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS : cls.isInterface() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE : cls.isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_CLASS : cls.getSuperclass().isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_ENTRY : kotlin.reflect.jvm.internal.impl.km.ClassKind.CLASS;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final Collection mo9934(C4690 c4690) {
        InterfaceC7253 interfaceC7253Mo9734 = m9986().mo9035().mo9734();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection collectionMo9177 = interfaceC7253Mo9734.mo9177(c4690, noLookupLocation);
        InterfaceC7253 interfaceC7253Mo9016 = m9986().mo9016();
        interfaceC7253Mo9016.getClass();
        return AbstractC4343.m8825(interfaceC7253Mo9016.mo9177(c4690, noLookupLocation), collectionMo9177);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final C4535 mo9935(int i) {
        ArrayList arrayList;
        C4548 c4548M9985 = m9985();
        if (c4548M9985 == null || (arrayList = AbstractC8174.m13619(c4548M9985).f18959) == null) {
            return null;
        }
        return (C4535) AbstractC4343.m8831(i, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC4472 mo9936(int i) {
        AbstractC6988 abstractC6988M9986 = m9986();
        C4800 c4800 = abstractC6988M9986 instanceof C4800 ? (C4800) abstractC6988M9986 : null;
        if (c4800 != null) {
            ProtoBuf$Class protoBuf$Class = c4800.f13999;
            C4724 c4724 = AbstractC6912.f18438;
            c4724.getClass();
            protoBuf$Class.getClass();
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) (i < protoBuf$Class.getExtensionCount(c4724) ? protoBuf$Class.getExtension(c4724, i) : null);
            if (protoBuf$Property != null) {
                C4973 c4973 = new C4973(this);
                C4823 c4823 = c4800.f13990;
                return (InterfaceC4472) AbstractC5066.m10056(this.f14422, c4973, protoBuf$Property, c4823.f14057, c4823.f14055, c4800.f14002, C5049.f14570);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final Collection mo9937(C4690 c4690) {
        InterfaceC7253 interfaceC7253Mo9734 = m9986().mo9035().mo9734();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection collectionMo9175 = interfaceC7253Mo9734.mo9175(c4690, noLookupLocation);
        InterfaceC7253 interfaceC7253Mo9016 = m9986().mo9016();
        interfaceC7253Mo9016.getClass();
        return AbstractC4343.m8825(interfaceC7253Mo9016.mo9175(c4690, noLookupLocation), collectionMo9175);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Collection mo9938() {
        Collection collectionMo9017 = m9986().mo9017();
        collectionMo9017.getClass();
        return collectionMo9017;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo8887() {
        C4548 c4548M9985 = m9985();
        return (c4548M9985 != null ? AbstractC4544.m9143(c4548M9985) : null) == kotlin.reflect.jvm.internal.impl.km.ClassKind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Collection mo8888() {
        return ((C5044) this.f14423.getValue()).m10003();
    }

    @Override // kotlin.jvm.internal.InterfaceC4386
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo8889() {
        return this.f14422;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo8890() {
        return ((C5044) this.f14423.getValue()).f14556.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8891() {
        C5073 c5073 = ((C5044) this.f14423.getValue()).f14546;
        InterfaceC5087 interfaceC5087 = C5044.f14534[8];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8892() {
        C4548 c4548M9985 = m9985();
        if (c4548M9985 != null) {
            return AbstractC4544.f13255.m576(c4548M9985, AbstractC4544.f13259[10]);
        }
        Class cls = this.f14422;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Collection mo8893() {
        C5073 c5073 = ((C5044) this.f14423.getValue()).f14551;
        InterfaceC5087 interfaceC5087 = C5044.f14534[4];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo8894() {
        C4548 c4548M9985 = m9985();
        return c4548M9985 != null && AbstractC4544.f13254.m576(c4548M9985, AbstractC4544.f13259[14]);
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8895() {
        C5073 c5073 = ((C5044) this.f14423.getValue()).f14552;
        InterfaceC5087 interfaceC5087 = C5044.f14534[3];
        return (String) c5073.invoke();
    }

    @Override // kotlin.reflect.InterfaceC5092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8896() {
        C5073 c5073 = ((C5044) this.f14423.getValue()).f14555;
        InterfaceC5087 interfaceC5087 = C5044.f14534[5];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }
}
