package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import p079.AbstractC6989;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5045 extends AbstractC5002 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f14536 = {new PropertyReference1Impl(C5045.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(C5045.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new PropertyReference1Impl(C5045.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new PropertyReference1Impl(C5045.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new PropertyReference1Impl(C5045.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new PropertyReference1Impl(C5045.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new PropertyReference1Impl(C5045.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new PropertyReference1Impl(C5045.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new PropertyReference1Impl(C5045.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "inheritedNonStaticMembers_k1Impl", "getInheritedNonStaticMembers_k1Impl()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "inheritedStaticMembers_k1Impl", "getInheritedStaticMembers_k1Impl()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new PropertyReference1Impl(C5045.class, "fakeOverrideMembers", "getFakeOverrideMembers$kotlin_reflection()Lkotlin/reflect/jvm/internal/FakeOverrideMembers;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5074 f14537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5074 f14538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5074 f14539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f14540;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5074 f14541;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5074 f14542;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5074 f14543;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C5004 f14544;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5074 f14545;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5074 f14546;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f14547;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C5074 f14548;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5074 f14549;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5074 f14550;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5074 f14551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5074 f14552;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5074 f14553;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5074 f14554;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5074 f14555;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5074 f14556;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5074 f14557;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5184 f14558;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5045(C5004 c5004) {
        super(c5004);
        this.f14544 = c5004;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        int i = 0;
        this.f14540 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5046(c5004, this, i));
        int i2 = 5;
        this.f14539 = C8667.m14378(null, new C5047(c5004, i2));
        int i3 = 7;
        this.f14538 = C8667.m14378(null, new C5047(c5004, this, i3));
        int i4 = 8;
        this.f14537 = C8667.m14378(null, new C5047(c5004, this, i4));
        int i5 = 9;
        this.f14554 = C8667.m14378(null, new C5047(c5004, i5));
        this.f14553 = C8667.m14378(null, new C5046(c5004, this, i2));
        int i6 = 6;
        this.f14557 = C8667.m14378(null, new C5046(this, c5004, i6));
        this.f14558 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5046(this, c5004, i3));
        this.f14555 = C8667.m14378(null, new C5046(this, c5004, i4));
        this.f14556 = C8667.m14378(null, new C5046(this, c5004, i5));
        int i7 = 1;
        this.f14548 = C8667.m14378(null, new C5046(c5004, this, i7));
        int i8 = 2;
        C8667.m14378(null, new C5046(c5004, this, i8));
        int i9 = 3;
        this.f14547 = AbstractC5187.m10215(lazyThreadSafetyMode, new C5046(this, c5004, i9));
        this.f14551 = C8667.m14378(null, new C5047(c5004, i));
        this.f14552 = C8667.m14378(null, new C5047(c5004, i7));
        this.f14549 = C8667.m14378(null, new C5047(c5004, i8));
        this.f14550 = C8667.m14378(null, new C5047(c5004, i9));
        this.f14542 = C8667.m14378(null, new C5043(this, i));
        this.f14541 = C8667.m14378(null, new C5043(this, i7));
        this.f14545 = C8667.m14378(null, new C5043(this, i8));
        this.f14546 = C8667.m14378(null, new C5046(this, c5004, 4));
        this.f14543 = C8667.m14378(null, new C5047(c5004, i6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m9996() {
        if (!AbstractC5073.f14621 || AbstractC5073.f14622) {
            return true;
        }
        C4397 c4397 = AbstractC4396.f12975;
        InterfaceC5093 interfaceC5093Mo8917 = c4397.mo8917(Iterable.class);
        C5004 c5004 = this.f14544;
        return AbstractC4406.m8936(c5004, interfaceC5093Mo8917) || AbstractC4406.m8936(c5004, c4397.mo8917(Map.class)) || AbstractC4406.m8936(c5004, c4397.mo8917(CharSequence.class)) || AbstractC4406.m8936(c5004, c4397.mo8917(Number.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5070 m9997() {
        InterfaceC5088 interfaceC5088 = f14536[7];
        Object objInvoke = this.f14556.invoke();
        objInvoke.getClass();
        return (C5070) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4549 m9998() {
        return (C4549) this.f14540.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC6989 m9999() {
        InterfaceC5088 interfaceC5088 = f14536[0];
        Object objInvoke = this.f14539.invoke();
        objInvoke.getClass();
        return (AbstractC6989) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Collection m10000() {
        InterfaceC5088 interfaceC5088 = f14536[17];
        Object objInvoke = this.f14546.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }
}
