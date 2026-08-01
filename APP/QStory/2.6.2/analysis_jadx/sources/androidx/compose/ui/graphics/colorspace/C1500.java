package androidx.compose.ui.graphics.colorspace;

import p000.AbstractC6087;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1500 implements InterfaceC1497 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1495 f4272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4273;

    public /* synthetic */ C1500(C1495 c1495, int i) {
        this.f4273 = i;
        this.f4272 = c1495;
    }

    @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final double mo852(double d) {
        int i = this.f4273;
        C1495 c1495 = this.f4272;
        switch (i) {
            case 0:
                return AbstractC6087.m11415(c1495.f4256.mo852(d), c1495.f4247, c1495.f4246);
            default:
                return c1495.f4249.mo852(AbstractC6087.m11415(d, c1495.f4247, c1495.f4246));
        }
    }
}
