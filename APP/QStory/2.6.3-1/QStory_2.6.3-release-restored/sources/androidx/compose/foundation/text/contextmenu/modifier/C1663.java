package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.C1868;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.foundation.text.selection.C1752;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2197;
import kotlinx.coroutines.C6249;
import p068.InterfaceC7387;
import p128.C8157;
import p137.C8217;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1663 extends AbstractC2623 implements InterfaceC2618, InterfaceC1667 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C6249 f2687;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1752 f2688;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public InterfaceC7387 f2689;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC7387 f2690;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1664 f2691;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2197 f2686 = AbstractC2202.m3056(new C1868(this, 4));

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C8157 f2685 = C8157.f19881;

    public C1663(C1664 c1664, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, C1752 c1752) {
        this.f2691 = c1664;
        this.f2690 = interfaceC7387;
        this.f2689 = interfaceC73872;
        this.f2688 = c1752;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final C8217 mo2199() {
        return (C8217) this.f2686.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo2200(InterfaceC2530 interfaceC2530) {
        return mo2201(interfaceC2530).m13077();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        C1664 c1664 = this.f2691;
        c1664.f2692 = ToolbarHandlerState.Detached;
        c1664.f2693 = null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        C1664 c1664 = this.f2691;
        c1664.f2692 = ToolbarHandlerState.Attached;
        c1664.f2693 = this;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final C8157 mo2201(InterfaceC2530 interfaceC2530) {
        if (!this.f6624) {
            return this.f2685;
        }
        C8157 c8157 = (C8157) this.f2688.invoke(interfaceC2530);
        if (c8157 == null) {
            return this.f2685;
        }
        this.f2685 = c8157;
        return c8157;
    }
}
