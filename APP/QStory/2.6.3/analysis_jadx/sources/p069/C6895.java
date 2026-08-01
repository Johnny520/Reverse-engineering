package p069;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.C4862;
import p034.AbstractC6347;
import p049.AbstractC6530;

/* JADX INFO: renamed from: 飘花落叶言世楪兰苏子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6895 implements InterfaceC6896 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C4862 f18349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4870 f18350;

    public C6895(AbstractC4870 abstractC4870) {
        abstractC4870.getClass();
        this.f18350 = abstractC4870;
        abstractC4870.mo9742();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f18350 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9493() {
        AbstractC6530 abstractC6530Mo9493 = this.f18350.mo9741().mo9722().mo9493();
        abstractC6530Mo9493.getClass();
        return abstractC6530Mo9493;
    }

    @Override // p069.InterfaceC6896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC4870 mo9720() {
        return this.f18350;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC4477 mo9211() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9494() {
        AbstractC4870 abstractC4870 = this.f18350;
        AbstractC4882 abstractC4882Mo9741 = abstractC4870.mo9742() == Variance.OUT_VARIANCE ? abstractC4870.mo9741() : mo9493().m12033();
        abstractC4882Mo9741.getClass();
        return AbstractC6347.m11928(abstractC4882Mo9741);
    }
}
