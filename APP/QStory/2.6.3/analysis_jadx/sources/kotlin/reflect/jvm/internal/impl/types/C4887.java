package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4887 extends AbstractC4907 implements InterfaceC4918 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4878 f14201;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4882 f14202;

    public C4887(AbstractC4878 abstractC4878, AbstractC4882 abstractC4882) {
        abstractC4878.getClass();
        abstractC4882.getClass();
        this.f14201 = abstractC4878;
        this.f14202 = abstractC4882;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f14202 + ")] " + this.f14201;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4918
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC4882 mo9777() {
        return this.f14202;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4918
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4914 mo9778() {
        return this.f14201;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4878 mo9770(C4874 c4874) {
        c4874.getClass();
        AbstractC4914 abstractC4914M9805 = AbstractC4893.m9805(this.f14201.mo9770(c4874), this.f14202);
        abstractC4914M9805.getClass();
        return (AbstractC4878) abstractC4914M9805;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9731(boolean z) {
        AbstractC4914 abstractC4914M9805 = AbstractC4893.m9805(this.f14201.mo9731(z), this.f14202.mo9772().mo9731(z));
        abstractC4914M9805.getClass();
        return (AbstractC4878) abstractC4914M9805;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4887 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4878 abstractC4878 = this.f14201;
        abstractC4878.getClass();
        AbstractC4882 abstractC4882 = this.f14202;
        abstractC4882.getClass();
        return new C4887(abstractC4878, abstractC4882);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4907 mo9771(AbstractC4878 abstractC4878) {
        return new C4887(abstractC4878, this.f14202);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final AbstractC4878 mo9781() {
        return this.f14201;
    }
}
