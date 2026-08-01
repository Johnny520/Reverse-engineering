package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2599;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1425 extends AbstractC2961 implements InterfaceC2599 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC1449 f1977;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1449 f1978;

    public AbstractC1425() {
        C1446 c1446 = AbstractC1469.f2117;
        this.f1977 = c1446;
        this.f1978 = c1446;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public abstract InterfaceC1449 mo1917(InterfaceC1449 interfaceC1449);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public void mo1918() {
        this.f1978 = mo1917(this.f1977);
        AbstractC2620.m3894(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C1424(this, 0));
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1679() {
        this.f1977 = AbstractC1469.f2117;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public void mo1686() {
        this.f1978 = this.f1977;
        AbstractC2620.m3894(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C1424(this, 0));
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public void mo1661() {
        AbstractC2620.m3896(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C1424(this, 1));
        mo1918();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object mo1919() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
