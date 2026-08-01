package androidx.compose.foundation;

import androidx.compose.p001ui.draw.C2270;
import androidx.compose.p001ui.draw.C2271;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.InterfaceC2779;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1895 extends AbstractC2623 implements InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C2271 f3484;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC2404 f3485;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2406 f3486;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f3487;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1900 f3488;

    public C1895(float f, C2406 c2406, InterfaceC2404 interfaceC2404) {
        this.f3487 = f;
        this.f3486 = c2406;
        this.f3485 = interfaceC2404;
        C2271 c2271 = new C2271(new C2270(), new C1905(this, 0));
        m3924(c2271);
        this.f3484 = c2271;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        AbstractC2781.m4204(interfaceC2779, this.f3485);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo2534() {
        return false;
    }
}
