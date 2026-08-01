package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2991 extends C2978 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f6721;

    public C2991(AbstractC2987 abstractC2987) {
        super(abstractC2987);
        if (abstractC2987 instanceof C2993) {
            this.f6667 = DependencyNode$Type.HORIZONTAL_DIMENSION;
        } else {
            this.f6667 = DependencyNode$Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.C2978
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4438(int i) {
        if (this.f6677) {
            return;
        }
        this.f6677 = true;
        this.f6673 = i;
        for (InterfaceC2980 interfaceC2980 : this.f6674) {
            interfaceC2980.mo4441(interfaceC2980);
        }
    }
}
