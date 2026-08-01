package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5825 extends AbstractC5834 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14751 = {new PropertyReference1Impl(C5825.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0), new PropertyReference1Impl(C5825.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0), new PropertyReference1Impl(C5825.class, "members", "getMembers()Ljava/util/Collection;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f14752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5906 f14753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5906 f14754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f14755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5906 f14756;

    public C5825(C5824 c5824) {
        super(c5824);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14755 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5822(c5824, this));
        int i = 1;
        this.f14754 = C9496.m14937(null, new C5823(c5824, i));
        this.f14753 = C9496.m14937(null, new C5844(this, 8));
        this.f14752 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5822(this, c5824, i));
        this.f14756 = C9496.m14937(null, new C5822(this, c5824, 2));
    }
}
