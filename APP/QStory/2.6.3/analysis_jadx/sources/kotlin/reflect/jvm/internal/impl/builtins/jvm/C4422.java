package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p049.AbstractC6526;
import p049.AbstractC6527;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p079.C6988;
import p079.C7016;
import p080.InterfaceC7022;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4422 implements InterfaceC7022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4688 f13032;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4691 f13033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4847 f13034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f13035 = C4408.f12979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6988 f13036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13030 = {new PropertyReference1Impl(C4422.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4409 f13031 = new C4409();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4687 f13029 = AbstractC6526.f17853;

    static {
        C4686 c4686 = AbstractC6527.f17883;
        f13033 = c4686.m9318();
        C4687 c4687M9319 = c4686.m9319();
        f13032 = new C4688(c4687M9319.m9320(), c4687M9319.f13696.m9318());
    }

    public C4422(C4845 c4845, C6988 c6988) {
        this.f13036 = c6988;
        this.f13034 = new C4847(c4845, new C5028(this, 3, c4845));
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC6989 mo8964(C4688 c4688) {
        c4688.getClass();
        if (!c4688.equals(f13032)) {
            return null;
        }
        return (C7016) AbstractC6253.m11749(this.f13034, f13030[0]);
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo8965(C4687 c4687, C4691 c4691) {
        c4687.getClass();
        c4691.getClass();
        return c4691.equals(f13033) && c4687.equals(f13029);
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Collection mo8966(C4687 c4687) {
        c4687.getClass();
        if (!c4687.equals(f13029)) {
            return EmptySet.INSTANCE;
        }
        return AbstractC7739.m13055((C7016) AbstractC6253.m11749(this.f13034, f13030[0]));
    }
}
