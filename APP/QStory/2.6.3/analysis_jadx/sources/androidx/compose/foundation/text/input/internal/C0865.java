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
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0865 extends AbstractC2128 implements InterfaceC1857, InterfaceC1783, InterfaceC1782, InterfaceC0853 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0860 f2421;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC1395 f2422 = AbstractC1367.m2474(null);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0882 f2423;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0943 f2424;

    public C0865(C0860 c0860, C0943 c0943, C0882 c0882) {
        this.f2421 = c0860;
        this.f2424 = c0943;
        this.f2423 = c0882;
    }

    @Override // androidx.compose.ui.node.InterfaceC1782
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo1638(AbstractC1794 abstractC1794) {
        ((AbstractC1347) this.f2422).setValue(abstractC1794);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        this.f2421.m1689(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        C0860 c0860 = this.f2421;
        if (c0860.f2416 != null) {
            AbstractC7741.m13095("Expected textInputModifierNode to be null");
        }
        c0860.f2416 = this;
    }
}
