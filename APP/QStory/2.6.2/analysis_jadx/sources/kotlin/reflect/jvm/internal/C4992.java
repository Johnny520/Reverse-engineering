package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3055;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4992 extends AbstractC5001 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f14404 = {new PropertyReference1Impl(C4992.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0), new PropertyReference1Impl(C4992.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0), new PropertyReference1Impl(C4992.class, "members", "getMembers()Ljava/util/Collection;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f14405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5073 f14406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5073 f14407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f14408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5073 f14409;

    public C4992(C4991 c4991) {
        super(c4991);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14408 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4989(c4991, this));
        int i = 1;
        this.f14407 = AbstractC3055.m6635(null, new C4990(c4991, i));
        this.f14406 = AbstractC3055.m6635(null, new C5011(this, 8));
        this.f14405 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4989(this, c4991, i));
        this.f14409 = AbstractC3055.m6635(null, new C4989(this, c4991, 2));
    }
}
