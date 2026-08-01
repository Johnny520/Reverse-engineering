package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p049.AbstractC6525;
import p049.AbstractC6526;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p079.C6987;
import p079.C7015;
import p080.InterfaceC7021;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4421 implements InterfaceC7021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4687 f13028;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4690 f13029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4846 f13030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f13031 = C4407.f12975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6987 f13032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13026 = {new PropertyReference1Impl(C4421.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4408 f13027 = new C4408();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4686 f13025 = AbstractC6525.f17857;

    static {
        C4685 c4685 = AbstractC6526.f17887;
        f13029 = c4685.m9328();
        C4686 c4686M9329 = c4685.m9329();
        f13028 = new C4687(c4686M9329.m9330(), c4686M9329.f13692.m9328());
    }

    public C4421(C4844 c4844, C6987 c6987) {
        this.f13032 = c6987;
        this.f13030 = new C4846(c4844, new C5027(this, 3, c4844));
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC6988 mo8974(C4687 c4687) {
        c4687.getClass();
        if (!c4687.equals(f13028)) {
            return null;
        }
        return (C7015) AbstractC9124.m14672(this.f13030, f13026[0]);
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo8975(C4686 c4686, C4690 c4690) {
        c4686.getClass();
        c4690.getClass();
        return c4690.equals(f13029) && c4686.equals(f13025);
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Collection mo8976(C4686 c4686) {
        c4686.getClass();
        if (!c4686.equals(f13025)) {
            return EmptySet.INSTANCE;
        }
        return AbstractC0455.m1140((C7015) AbstractC9124.m14672(this.f13030, f13026[0]));
    }
}
