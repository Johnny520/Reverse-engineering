package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2616;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1875 extends AbstractC2961 implements InterfaceC2616 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC1420 f3390;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f3391;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f3392;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3393;

    public C1875(InterfaceC1420 interfaceC1420) {
        this.f3390 = interfaceC1420;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        AbstractC6231.m11036(m4427(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        C2593 c2593 = (C2593) interfaceC2341;
        c2593.m3871();
        C2342 c2342 = c2593.f5521;
        if (this.f3393) {
            InterfaceC2339.m3256(c2593, C2434.m3510(0.3f, C2434.f5041), c2342.mo3265(), 0.0f, null, 122);
        } else if (this.f3392 || this.f3391) {
            InterfaceC2339.m3256(c2593, C2434.m3510(0.1f, C2434.f5041), c2342.mo3265(), 0.0f, null, 122);
        }
    }
}
