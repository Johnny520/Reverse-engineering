package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4993 extends AbstractC5002 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f14406 = {new PropertyReference1Impl(C4993.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0), new PropertyReference1Impl(C4993.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0), new PropertyReference1Impl(C4993.class, "members", "getMembers()Ljava/util/Collection;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f14407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5074 f14408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5074 f14409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f14410;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5074 f14411;

    public C4993(C4992 c4992) {
        super(c4992);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14410 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4990(c4992, this));
        int i = 1;
        this.f14409 = C8667.m14378(null, new C4991(c4992, i));
        this.f14408 = C8667.m14378(null, new C5012(this, 8));
        this.f14407 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4990(this, c4992, i));
        this.f14411 = C8667.m14378(null, new C4990(this, c4992, 2));
    }
}
