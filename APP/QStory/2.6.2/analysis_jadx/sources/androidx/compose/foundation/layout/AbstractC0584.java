package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1764;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0584 extends AbstractC2128 implements InterfaceC1764 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0608 f1631;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC0608 f1632;

    public AbstractC0584() {
        C0605 c0605 = AbstractC0628.f1771;
        this.f1631 = c0605;
        this.f1632 = c0605;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public abstract InterfaceC0608 mo1347(InterfaceC0608 interfaceC0608);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public void mo1348() {
        this.f1632 = mo1347(this.f1631);
        AbstractC1785.m3324(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C0583(this, 0));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1118() {
        this.f1631 = AbstractC0628.f1771;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public void mo1125() {
        this.f1632 = this.f1631;
        AbstractC1785.m3324(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C0583(this, 0));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public void mo1100() {
        AbstractC1785.m3326(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C0583(this, 1));
        mo1348();
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object mo1349() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
