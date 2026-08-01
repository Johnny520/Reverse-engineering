package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.InterfaceC1782;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.platform.InterfaceC1857;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0865 extends AbstractC2128 implements InterfaceC1857, InterfaceC1783, InterfaceC1782, InterfaceC0853 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0860 f2420;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC1395 f2421 = AbstractC1367.m2465(null);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0882 f2422;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0943 f2423;

    public C0865(C0860 c0860, C0943 c0943, C0882 c0882) {
        this.f2420 = c0860;
        this.f2423 = c0943;
        this.f2422 = c0882;
    }

    @Override // androidx.compose.ui.node.InterfaceC1782
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo1628(AbstractC1794 abstractC1794) {
        ((AbstractC1347) this.f2421).setValue(abstractC1794);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        this.f2420.m1679(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        C0860 c0860 = this.f2420;
        if (c0860.f2415 != null) {
            AbstractC7740.m13067("Expected textInputModifierNode to be null");
        }
        c0860.f2415 = this;
    }
}
