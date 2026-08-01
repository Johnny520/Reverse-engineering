package androidx.compose.foundation;

import androidx.compose.ui.draw.C1435;
import androidx.compose.ui.draw.C1436;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.InterfaceC1944;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1057 extends AbstractC1788 implements InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1436 f3138;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1569 f3139;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1571 f3140;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f3141;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1062 f3142;

    public C1057(float f, C1571 c1571, InterfaceC1569 interfaceC1569) {
        this.f3141 = f;
        this.f3140 = c1571;
        this.f3139 = interfaceC1569;
        C1436 c1436 = new C1436(new C1435(), new C1067(this, 0));
        m3354(c1436);
        this.f3138 = c1436;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        AbstractC1946.m3634(interfaceC1944, this.f3139);
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo1964() {
        return false;
    }
}
