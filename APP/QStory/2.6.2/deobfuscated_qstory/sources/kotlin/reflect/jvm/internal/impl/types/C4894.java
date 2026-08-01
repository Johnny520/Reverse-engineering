package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4894 extends AbstractC4906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4877 f14210;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4877 f14211;

    public C4894(AbstractC4877 abstractC4877, AbstractC4877 abstractC48772) {
        abstractC4877.getClass();
        abstractC48772.getClass();
        this.f14210 = abstractC4877;
        this.f14211 = abstractC48772;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        return new C4894(this.f14210.mo9776(c4873), this.f14211);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4894 mo9740(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = this.f14210;
        abstractC4877.getClass();
        AbstractC4877 abstractC48772 = this.f14211;
        abstractC48772.getClass();
        return new C4894(abstractC4877, abstractC48772);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4894 mo9741(boolean z) {
        return new C4894(this.f14210.mo9741(z), this.f14211.mo9741(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4906 mo9777(AbstractC4877 abstractC4877) {
        return new C4894(abstractC4877, this.f14211);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC4877 mo9787() {
        return this.f14210;
    }
}
