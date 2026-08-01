package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4886 extends AbstractC4906 implements InterfaceC4917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4877 f14197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4881 f14198;

    public C4886(AbstractC4877 abstractC4877, AbstractC4881 abstractC4881) {
        abstractC4877.getClass();
        abstractC4881.getClass();
        this.f14197 = abstractC4877;
        this.f14198 = abstractC4881;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f14198 + ")] " + this.f14197;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4917
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC4881 mo9783() {
        return this.f14198;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4917
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4913 mo9784() {
        return this.f14197;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        AbstractC4913 abstractC4913M9811 = AbstractC4892.m9811(this.f14197.mo9776(c4873), this.f14198);
        abstractC4913M9811.getClass();
        return (AbstractC4877) abstractC4913M9811;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4877 mo9741(boolean z) {
        AbstractC4913 abstractC4913M9811 = AbstractC4892.m9811(this.f14197.mo9741(z), this.f14198.mo9778().mo9741(z));
        abstractC4913M9811.getClass();
        return (AbstractC4877) abstractC4913M9811;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4886 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        AbstractC4877 abstractC4877 = this.f14197;
        abstractC4877.getClass();
        AbstractC4881 abstractC4881 = this.f14198;
        abstractC4881.getClass();
        return new C4886(abstractC4877, abstractC4881);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC4906 mo9777(AbstractC4877 abstractC4877) {
        return new C4886(abstractC4877, this.f14198);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4906
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final AbstractC4877 mo9787() {
        return this.f14197;
    }
}
