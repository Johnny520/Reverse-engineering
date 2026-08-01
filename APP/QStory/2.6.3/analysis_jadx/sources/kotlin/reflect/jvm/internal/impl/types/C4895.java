package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4895 extends AbstractC4907 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4878 f14214;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4878 f14215;

    public C4895(AbstractC4878 abstractC4878, AbstractC4878 abstractC48782) {
        abstractC4878.getClass();
        abstractC48782.getClass();
        this.f14214 = abstractC4878;
        this.f14215 = abstractC48782;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4878 mo9770(C4874 c4874) {
        c4874.getClass();
        return new C4895(this.f14214.mo9770(c4874), this.f14215);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4895 mo9730(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        AbstractC4878 abstractC4878 = this.f14214;
        abstractC4878.getClass();
        AbstractC4878 abstractC48782 = this.f14215;
        abstractC48782.getClass();
        return new C4895(abstractC4878, abstractC48782);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4895 mo9731(boolean z) {
        return new C4895(this.f14214.mo9731(z), this.f14215.mo9731(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4907 mo9771(AbstractC4878 abstractC4878) {
        return new C4895(abstractC4878, this.f14215);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4907
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4878 mo9781() {
        return this.f14214;
    }
}
