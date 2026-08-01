package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import io.ktor.util.C5043;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p065.AbstractC7359;
import p095.C7817;
import p096.InterfaceC7850;
import p096.InterfaceC7852;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5255 extends AbstractC7359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13382 = {new PropertyReference1Impl(C5255.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C5253 f13383;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5679 f13384;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5255(C5677 c5677, JvmBuiltIns$Kind jvmBuiltIns$Kind) {
        super(c5677);
        jvmBuiltIns$Kind.getClass();
        this.f13384 = new C5679(c5677, new C5860(this, 4, c5677));
        int i = AbstractC5258.f13388[jvmBuiltIns$Kind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m12585(false);
            } else if (i == 3) {
                m12585(true);
            } else {
                C5043.m9170();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C5252 m9526() {
        return (C5252) AbstractC7082.m12308(this.f13384, f13382[0]);
    }

    @Override // p065.AbstractC7359
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7852 mo9527() {
        return m9526();
    }

    @Override // p065.AbstractC7359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Iterable mo9528() {
        Iterable iterableMo9528 = super.mo9528();
        C7817 c7817M12596 = m12596();
        c7817M12596.getClass();
        return AbstractC5176.m9348(iterableMo9528, new C5254(this.f18266, c7817M12596));
    }

    @Override // p065.AbstractC7359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7850 mo9507() {
        return m9526();
    }
}
