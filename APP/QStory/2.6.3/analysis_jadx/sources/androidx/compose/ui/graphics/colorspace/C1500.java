package androidx.compose.ui.graphics.colorspace;

import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1500 implements InterfaceC1497 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1495 f4273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4274;

    public /* synthetic */ C1500(C1495 c1495, int i) {
        this.f4274 = i;
        this.f4273 = c1495;
    }

    @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final double mo853(double d) {
        int i = this.f4274;
        C1495 c1495 = this.f4273;
        switch (i) {
            case 0:
                return AbstractC2567.m5072(c1495.f4257.mo853(d), c1495.f4248, c1495.f4247);
            default:
                return c1495.f4250.mo853(AbstractC2567.m5072(d, c1495.f4248, c1495.f4247));
        }
    }
}
