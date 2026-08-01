package p085;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.C5694;
import p050.AbstractC7176;
import p065.AbstractC7359;

/* JADX INFO: renamed from: 飘花落叶言世楪兰苏子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7724 implements InterfaceC7725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5694 f18694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5702 f18695;

    public C7724(AbstractC5702 abstractC5702) {
        abstractC5702.getClass();
        this.f18695 = abstractC5702;
        abstractC5702.mo10301();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f18695 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo10052() {
        AbstractC7359 abstractC7359Mo10052 = this.f18695.mo10300().mo10281().mo10052();
        abstractC7359Mo10052.getClass();
        return abstractC7359Mo10052;
    }

    @Override // p085.InterfaceC7725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC5702 mo10279() {
        return this.f18695;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC5309 mo9770() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9771() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo10053() {
        AbstractC5702 abstractC5702 = this.f18695;
        AbstractC5714 abstractC5714Mo10300 = abstractC5702.mo10301() == Variance.OUT_VARIANCE ? abstractC5702.mo10300() : mo10052().m12592();
        abstractC5714Mo10300.getClass();
        return AbstractC7176.m12487(abstractC5714Mo10300);
    }
}
