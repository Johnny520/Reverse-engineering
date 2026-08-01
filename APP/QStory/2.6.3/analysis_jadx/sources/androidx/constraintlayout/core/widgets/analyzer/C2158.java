package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2158 extends C2145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f6376;

    public C2158(AbstractC2154 abstractC2154) {
        super(abstractC2154);
        if (abstractC2154 instanceof C2160) {
            this.f6322 = DependencyNode$Type.HORIZONTAL_DIMENSION;
        } else {
            this.f6322 = DependencyNode$Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.C2145
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3878(int i) {
        if (this.f6332) {
            return;
        }
        this.f6332 = true;
        this.f6328 = i;
        for (InterfaceC2147 interfaceC2147 : this.f6329) {
            interfaceC2147.mo3881(interfaceC2147);
        }
    }
}
