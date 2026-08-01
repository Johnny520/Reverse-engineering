package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import p095.AbstractC7818;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5877 extends AbstractC5834 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14881 = {new PropertyReference1Impl(C5877.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(C5877.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new PropertyReference1Impl(C5877.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new PropertyReference1Impl(C5877.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new PropertyReference1Impl(C5877.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new PropertyReference1Impl(C5877.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new PropertyReference1Impl(C5877.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new PropertyReference1Impl(C5877.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new PropertyReference1Impl(C5877.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "inheritedNonStaticMembers_k1Impl", "getInheritedNonStaticMembers_k1Impl()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "inheritedStaticMembers_k1Impl", "getInheritedStaticMembers_k1Impl()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5877.class, "fakeOverrideMembers", "getFakeOverrideMembers$kotlin_reflection()Lkotlin/reflect/jvm/internal/FakeOverrideMembers;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5906 f14882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5906 f14883;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5906 f14884;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f14885;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5906 f14886;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5906 f14887;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5906 f14888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C5836 f14889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5906 f14890;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5906 f14891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f14892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C5906 f14893;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5906 f14894;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5906 f14895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5906 f14896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5906 f14897;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5906 f14898;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5906 f14899;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5906 f14900;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5906 f14901;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5906 f14902;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6016 f14903;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5877(C5836 c5836) {
        super(c5836);
        this.f14889 = c5836;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        int i = 0;
        this.f14885 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5878(c5836, this, i));
        int i2 = 5;
        this.f14884 = C9496.m14937(null, new C5879(c5836, i2));
        int i3 = 7;
        this.f14883 = C9496.m14937(null, new C5879(c5836, this, i3));
        int i4 = 8;
        this.f14882 = C9496.m14937(null, new C5879(c5836, this, i4));
        int i5 = 9;
        this.f14899 = C9496.m14937(null, new C5879(c5836, i5));
        this.f14898 = C9496.m14937(null, new C5878(c5836, this, i2));
        int i6 = 6;
        this.f14902 = C9496.m14937(null, new C5878(this, c5836, i6));
        this.f14903 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5878(this, c5836, i3));
        this.f14900 = C9496.m14937(null, new C5878(this, c5836, i4));
        this.f14901 = C9496.m14937(null, new C5878(this, c5836, i5));
        int i7 = 1;
        this.f14893 = C9496.m14937(null, new C5878(c5836, this, i7));
        int i8 = 2;
        C9496.m14937(null, new C5878(c5836, this, i8));
        int i9 = 3;
        this.f14892 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5878(this, c5836, i9));
        this.f14896 = C9496.m14937(null, new C5879(c5836, i));
        this.f14897 = C9496.m14937(null, new C5879(c5836, i7));
        this.f14894 = C9496.m14937(null, new C5879(c5836, i8));
        this.f14895 = C9496.m14937(null, new C5879(c5836, i9));
        this.f14887 = C9496.m14937(null, new C5875(this, i));
        this.f14886 = C9496.m14937(null, new C5875(this, i7));
        this.f14890 = C9496.m14937(null, new C5875(this, i8));
        this.f14891 = C9496.m14937(null, new C5878(this, c5836, 4));
        this.f14888 = C9496.m14937(null, new C5879(c5836, i6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m10555() {
        if (!AbstractC5905.f14966 || AbstractC5905.f14967) {
            return true;
        }
        C5229 c5229 = AbstractC5228.f13320;
        InterfaceC5925 interfaceC5925Mo9476 = c5229.mo9476(Iterable.class);
        C5836 c5836 = this.f14889;
        return AbstractC5238.m9495(c5836, interfaceC5925Mo9476) || AbstractC5238.m9495(c5836, c5229.mo9476(Map.class)) || AbstractC5238.m9495(c5836, c5229.mo9476(CharSequence.class)) || AbstractC5238.m9495(c5836, c5229.mo9476(Number.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5902 m10556() {
        InterfaceC5920 interfaceC5920 = f14881[7];
        Object objInvoke = this.f14901.invoke();
        objInvoke.getClass();
        return (C5902) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5381 m10557() {
        return (C5381) this.f14885.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7818 m10558() {
        InterfaceC5920 interfaceC5920 = f14881[0];
        Object objInvoke = this.f14884.invoke();
        objInvoke.getClass();
        return (AbstractC7818) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Collection m10559() {
        InterfaceC5920 interfaceC5920 = f14881[17];
        Object objInvoke = this.f14891.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }
}
