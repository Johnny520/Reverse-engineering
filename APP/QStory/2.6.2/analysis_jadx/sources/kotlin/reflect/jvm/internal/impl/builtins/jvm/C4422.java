package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import io.ktor.util.C4210;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p049.AbstractC6529;
import p079.C6987;
import p080.InterfaceC7020;
import p080.InterfaceC7022;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4422 extends AbstractC6529 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13033 = {new PropertyReference1Impl(C4422.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4420 f13034;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4846 f13035;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4422(C4844 c4844, JvmBuiltIns$Kind jvmBuiltIns$Kind) {
        super(c4844);
        jvmBuiltIns$Kind.getClass();
        this.f13035 = new C4846(c4844, new C5027(this, 4, c4844));
        int i = AbstractC4425.f13039[jvmBuiltIns$Kind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m11983(false);
            } else if (i == 3) {
                m11983(true);
            } else {
                C4210.m8621();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C4419 m8977() {
        return (C4419) AbstractC9124.m14672(this.f13035, f13033[0]);
    }

    @Override // p049.AbstractC6529
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7022 mo8978() {
        return m8977();
    }

    @Override // p049.AbstractC6529
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Iterable mo8979() {
        Iterable iterableMo8979 = super.mo8979();
        C6987 c6987M11994 = m11994();
        c6987M11994.getClass();
        return AbstractC4343.m8824(iterableMo8979, new C4421(this.f17925, c6987M11994));
    }

    @Override // p049.AbstractC6529
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7020 mo8958() {
        return m8977();
    }
}
