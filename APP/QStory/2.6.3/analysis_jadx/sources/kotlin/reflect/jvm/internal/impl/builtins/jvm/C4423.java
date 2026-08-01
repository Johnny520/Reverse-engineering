package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import io.ktor.util.C4211;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p049.AbstractC6530;
import p079.C6988;
import p080.InterfaceC7021;
import p080.InterfaceC7023;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4423 extends AbstractC6530 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13037 = {new PropertyReference1Impl(C4423.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4421 f13038;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4847 f13039;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4423(C4845 c4845, JvmBuiltIns$Kind jvmBuiltIns$Kind) {
        super(c4845);
        jvmBuiltIns$Kind.getClass();
        this.f13039 = new C4847(c4845, new C5028(this, 4, c4845));
        int i = AbstractC4426.f13043[jvmBuiltIns$Kind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m12026(false);
            } else if (i == 3) {
                m12026(true);
            } else {
                C4211.m8611();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C4420 m8967() {
        return (C4420) AbstractC6253.m11749(this.f13039, f13037[0]);
    }

    @Override // p049.AbstractC6530
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7023 mo8968() {
        return m8967();
    }

    @Override // p049.AbstractC6530
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Iterable mo8969() {
        Iterable iterableMo8969 = super.mo8969();
        C6988 c6988M12037 = m12037();
        c6988M12037.getClass();
        return AbstractC4344.m8789(iterableMo8969, new C4422(this.f17921, c6988M12037));
    }

    @Override // p049.AbstractC6530
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7021 mo8948() {
        return m8967();
    }
}
