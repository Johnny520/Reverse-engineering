package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1764;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0584 extends AbstractC2128 implements InterfaceC1764 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0608 f1632;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC0608 f1633;

    public AbstractC0584() {
        C0605 c0605 = AbstractC0628.f1772;
        this.f1632 = c0605;
        this.f1633 = c0605;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public abstract InterfaceC0608 mo1357(InterfaceC0608 interfaceC0608);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public void mo1358() {
        this.f1633 = mo1357(this.f1632);
        AbstractC1785.m3334(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C0583(this, 0));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1119() {
        this.f1632 = AbstractC0628.f1772;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public void mo1126() {
        this.f1633 = this.f1632;
        AbstractC1785.m3334(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C0583(this, 0));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public void mo1101() {
        AbstractC1785.m3336(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C0583(this, 1));
        mo1358();
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object mo1359() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
