package androidx.compose.p001ui.graphics.colorspace;

import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2335 implements InterfaceC2332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2330 f4618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4619;

    public /* synthetic */ C2335(C2330 c2330, int i) {
        this.f4619 = i;
        this.f4618 = c2330;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final double mo1413(double d) {
        int i = this.f4619;
        C2330 c2330 = this.f4618;
        switch (i) {
            case 0:
                return AbstractC3400.m5632(c2330.f4602.mo1413(d), c2330.f4593, c2330.f4592);
            default:
                return c2330.f4595.mo1413(AbstractC3400.m5632(d, c2330.f4593, c2330.f4592));
        }
    }
}
