package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5719 extends AbstractC5739 implements InterfaceC5750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5710 f14546;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5714 f14547;

    public C5719(AbstractC5710 abstractC5710, AbstractC5714 abstractC5714) {
        abstractC5710.getClass();
        abstractC5714.getClass();
        this.f14546 = abstractC5710;
        this.f14547 = abstractC5714;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f14547 + ")] " + this.f14546;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5750
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC5714 mo10336() {
        return this.f14547;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5750
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5746 mo10337() {
        return this.f14546;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        AbstractC5746 abstractC5746M10364 = AbstractC5725.m10364(this.f14546.mo10329(c5706), this.f14547);
        abstractC5746M10364.getClass();
        return (AbstractC5710) abstractC5746M10364;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10290(boolean z) {
        AbstractC5746 abstractC5746M10364 = AbstractC5725.m10364(this.f14546.mo10290(z), this.f14547.mo10331().mo10290(z));
        abstractC5746M10364.getClass();
        return (AbstractC5710) abstractC5746M10364;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5719 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = this.f14546;
        abstractC5710.getClass();
        AbstractC5714 abstractC5714 = this.f14547;
        abstractC5714.getClass();
        return new C5719(abstractC5710, abstractC5714);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC5739 mo10330(AbstractC5710 abstractC5710) {
        return new C5719(abstractC5710, this.f14547);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final AbstractC5710 mo10340() {
        return this.f14546;
    }
}
