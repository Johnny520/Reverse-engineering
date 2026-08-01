package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3898;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.InterfaceC5230;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5247;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.text.AbstractC5971;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p065.AbstractC7355;
import p065.AbstractC7356;
import p066.AbstractC7365;
import p087.AbstractC7742;
import p093.C7796;
import p095.AbstractC7818;
import p095.C7845;
import p113.InterfaceC8060;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5836 extends AbstractC5835 implements InterfaceC5230, InterfaceC5925, InterfaceC5843, InterfaceC8060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final HashSet f14768;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f14769;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6016 f14770;

    static {
        LinkedHashSet linkedHashSet = AbstractC7365.f18280;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((C5520) it.next()).m9886().f14041.toString());
        }
        f14768 = hashSet;
    }

    public C5836(Class cls) {
        cls.getClass();
        this.f14769 = cls;
        this.f14770 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5879(this, 4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static C7845 m10539(C5520 c5520, C7796 c7796) {
        C5665 c5665 = c7796.f19001;
        C5247 c5247 = new C5247(c5665.f14436, c5520.f14044, 1);
        C5523 c5523M9882 = c5520.m9882();
        Modality modality = Modality.FINAL;
        ClassKind classKind = ClassKind.CLASS;
        List listM12487 = AbstractC7176.m12487(c5665.f14436.mo9620().m12595("Any").mo9584());
        C5677 c5677 = c5665.f14437;
        C7845 c7845 = new C7845(c5247, c5523M9882, modality, classKind, listM12487, c5677);
        c7845.m12916(new C5833(c5677, c7845, 0), EmptySet.INSTANCE, null);
        return c7845;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m10540(C5836 c5836, InterfaceC8083 interfaceC8083, KClassImpl$MemberBelonginess kClassImpl$MemberBelonginess) {
        AbstractC5856 abstractC5856;
        c5836.getClass();
        C5832 c5832 = new C5832(c5836, 0);
        Collection<InterfaceC5331> collectionM7420 = AbstractC3898.m7420(interfaceC8083, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5331 interfaceC5331 : collectionM7420) {
            if (interfaceC5331 instanceof InterfaceC5312) {
                InterfaceC5312 interfaceC5312 = (InterfaceC5312) interfaceC5331;
                abstractC5856 = (AbstractC5227.m9466(interfaceC5312.getVisibility(), AbstractC5321.f13469) || !kClassImpl$MemberBelonginess.accept(interfaceC5312)) ? null : (AbstractC5856) interfaceC5331.mo9586(c5832, C6008.f15084);
            }
            if (abstractC5856 != null) {
                arrayList.add(abstractC5856);
            }
        }
        return AbstractC5176.m9356(arrayList);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5836) && AbstractC3889.m7317(this).equals(AbstractC3889.m7317((InterfaceC5925) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC5230
    public final GenericDeclaration findJavaDeclaration() {
        return this.f14769;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        C5906 c5906 = ((C5877) this.f14770.getValue()).f14883;
        InterfaceC5920 interfaceC5920 = C5877.f14881[1];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final String getSimpleName() {
        C5906 c5906 = ((C5877) this.f14770.getValue()).f14882;
        InterfaceC5920 interfaceC5920 = C5877.f14881[2];
        return (String) c5906.invoke();
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final List getTypeParameters() {
        C5906 c5906 = ((C5877) this.f14770.getValue()).f14900;
        InterfaceC5920 interfaceC5920 = C5877.f14881[6];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final int hashCode() {
        return AbstractC3889.m7317(this).hashCode();
    }

    @Override // kotlin.reflect.InterfaceC5925
    public final boolean isInstance(Object obj) {
        List list = AbstractC5263.f13400;
        Class cls = this.f14769;
        cls.getClass();
        Integer num = (Integer) AbstractC5263.f13397.get(cls);
        if (num != null) {
            return AbstractC5220.m9453(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC5263.f13398.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    public final String toString() {
        C5520 c5520M10543 = m10543();
        C5519 c5519 = c5520M10543.f14044;
        return "class ".concat((c5519.f14041.m9873() ? "" : AbstractC0900.m708(new StringBuilder(), c5519.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).concat(AbstractC5971.m10688(c5520M10543.f14043.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$')));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C5381 m10541() {
        return ((C5877) this.f14770.getValue()).m10557();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final AbstractC7818 m10542() {
        return ((C5877) this.f14770.getValue()).m10558();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C5520 m10543() {
        PrimitiveType primitiveType;
        C5520 c5520 = AbstractC5900.f14954;
        Class cls = this.f14769;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            if (primitiveType != null) {
                return new C5520(AbstractC7355.f18198, primitiveType.getArrayTypeName());
            }
            C5519 c5519M9878 = AbstractC7356.f18244.m9878();
            return new C5520(c5519M9878.m9879(), c5519M9878.f14041.m9877());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC5900.f14954;
        }
        primitiveType = cls.isPrimitive() ? JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new C5520(AbstractC7355.f18198, primitiveType.getTypeName());
        }
        C5520 c5520M9536 = AbstractC5263.m9536(cls);
        if (!c5520M9536.f14042) {
            String str = C5242.f13332;
            C5520 c5520M9505 = C5242.m9505(c5520M9536.m9886());
            if (c5520M9505 != null) {
                return c5520M9505;
            }
        }
        return c5520M9536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final kotlin.reflect.jvm.internal.impl.p009km.ClassKind m10544() {
        kotlin.reflect.jvm.internal.impl.p009km.ClassKind classKindM9692;
        C5381 c5381M10541 = m10541();
        if (c5381M10541 != null && (classKindM9692 = AbstractC5377.m9692(c5381M10541)) != null) {
            return classKindM9692;
        }
        Class cls = this.f14769;
        return cls.isAnnotation() ? kotlin.reflect.jvm.internal.impl.p009km.ClassKind.ANNOTATION_CLASS : cls.isInterface() ? kotlin.reflect.jvm.internal.impl.p009km.ClassKind.INTERFACE : cls.isEnum() ? kotlin.reflect.jvm.internal.impl.p009km.ClassKind.ENUM_CLASS : cls.getSuperclass().isEnum() ? kotlin.reflect.jvm.internal.impl.p009km.ClassKind.ENUM_ENTRY : kotlin.reflect.jvm.internal.impl.p009km.ClassKind.CLASS;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final Collection mo10490(C5523 c5523) {
        InterfaceC8083 interfaceC8083Mo10283 = m10542().mo9584().mo10283();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection collectionMo9726 = interfaceC8083Mo10283.mo9726(c5523, noLookupLocation);
        InterfaceC8083 interfaceC8083Mo9565 = m10542().mo9565();
        interfaceC8083Mo9565.getClass();
        return AbstractC5176.m9352(interfaceC8083Mo9565.mo9726(c5523, noLookupLocation), collectionMo9726);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final C5368 mo10491(int i) {
        ArrayList arrayList;
        C5381 c5381M10541 = m10541();
        if (c5381M10541 == null || (arrayList = AbstractC3888.m7276(c5381M10541).f19299) == null) {
            return null;
        }
        return (C5368) AbstractC5176.m9377(i, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC5305 mo10492(int i) {
        AbstractC7818 abstractC7818M10542 = m10542();
        C5633 c5633 = abstractC7818M10542 instanceof C5633 ? (C5633) abstractC7818M10542 : null;
        if (c5633 != null) {
            ProtoBuf$Class protoBuf$Class = c5633.f14348;
            C5557 c5557 = AbstractC7742.f18778;
            c5557.getClass();
            protoBuf$Class.getClass();
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) (i < protoBuf$Class.getExtensionCount(c5557) ? protoBuf$Class.getExtension(c5557, i) : null);
            if (protoBuf$Property != null) {
                C5806 c5806 = new C5806(this);
                C5656 c5656 = c5633.f14339;
                return (InterfaceC5305) AbstractC5899.m10619(this.f14769, c5806, protoBuf$Property, c5656.f14406, c5656.f14404, c5633.f14351, C5882.f14917);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final Collection mo10493(C5523 c5523) {
        InterfaceC8083 interfaceC8083Mo10283 = m10542().mo9584().mo10283();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection collectionMo9724 = interfaceC8083Mo10283.mo9724(c5523, noLookupLocation);
        InterfaceC8083 interfaceC8083Mo9565 = m10542().mo9565();
        interfaceC8083Mo9565.getClass();
        return AbstractC5176.m9352(interfaceC8083Mo9565.mo9724(c5523, noLookupLocation), collectionMo9724);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Collection mo10494() {
        Collection collectionMo9566 = m10542().mo9566();
        collectionMo9566.getClass();
        return collectionMo9566;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo9436() {
        C5381 c5381M10541 = m10541();
        return (c5381M10541 != null ? AbstractC5377.m9692(c5381M10541) : null) == kotlin.reflect.jvm.internal.impl.p009km.ClassKind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Collection mo9437() {
        return ((C5877) this.f14770.getValue()).m10559();
    }

    @Override // kotlin.jvm.internal.InterfaceC5219
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo9438() {
        return this.f14769;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo9439() {
        return ((C5877) this.f14770.getValue()).f14903.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo9440() {
        C5906 c5906 = ((C5877) this.f14770.getValue()).f14893;
        InterfaceC5920 interfaceC5920 = C5877.f14881[8];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9441() {
        C5381 c5381M10541 = m10541();
        if (c5381M10541 != null) {
            return AbstractC5377.f13604.m1137(c5381M10541, AbstractC5377.f13608[10]);
        }
        Class cls = this.f14769;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Collection mo9442() {
        C5906 c5906 = ((C5877) this.f14770.getValue()).f14898;
        InterfaceC5920 interfaceC5920 = C5877.f14881[4];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo9443() {
        C5381 c5381M10541 = m10541();
        return c5381M10541 != null && AbstractC5377.f13603.m1137(c5381M10541, AbstractC5377.f13608[14]);
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo9444() {
        C5906 c5906 = ((C5877) this.f14770.getValue()).f14899;
        InterfaceC5920 interfaceC5920 = C5877.f14881[3];
        return (String) c5906.invoke();
    }

    @Override // kotlin.reflect.InterfaceC5925
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9445() {
        C5906 c5906 = ((C5877) this.f14770.getValue()).f14902;
        InterfaceC5920 interfaceC5920 = C5877.f14881[5];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }
}
