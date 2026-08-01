package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2158 extends C2145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f6375;

    public C2158(AbstractC2154 abstractC2154) {
        super(abstractC2154);
        if (abstractC2154 instanceof C2160) {
            this.f6321 = DependencyNode$Type.HORIZONTAL_DIMENSION;
        } else {
            this.f6321 = DependencyNode$Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.C2145
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3868(int i) {
        if (this.f6331) {
            return;
        }
        this.f6331 = true;
        this.f6327 = i;
        for (InterfaceC2147 interfaceC2147 : this.f6328) {
            interfaceC2147.mo3871(interfaceC2147);
        }
    }
}
