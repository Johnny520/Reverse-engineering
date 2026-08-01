package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.C1030;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.foundation.text.selection.C0914;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1783;
import kotlinx.coroutines.C5417;
import p052.InterfaceC6558;
import p112.C7328;
import p121.C7388;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0823 extends AbstractC1788 implements InterfaceC1783, InterfaceC0827 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C5417 f2342;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0914 f2343;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public InterfaceC6558 f2344;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC6558 f2345;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0824 f2346;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1362 f2341 = AbstractC1367.m2496(new C1030(this, 4));

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C7328 f2340 = C7328.f19536;

    public C0823(C0824 c0824, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, C0914 c0914) {
        this.f2346 = c0824;
        this.f2345 = interfaceC6558;
        this.f2344 = interfaceC65582;
        this.f2343 = c0914;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final C7388 mo1639() {
        return (C7388) this.f2341.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo1640(InterfaceC1695 interfaceC1695) {
        return mo1641(interfaceC1695).m12518();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        C0824 c0824 = this.f2346;
        c0824.f2347 = ToolbarHandlerState.Detached;
        c0824.f2348 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        C0824 c0824 = this.f2346;
        c0824.f2347 = ToolbarHandlerState.Attached;
        c0824.f2348 = this;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final C7328 mo1641(InterfaceC1695 interfaceC1695) {
        if (!this.f6279) {
            return this.f2340;
        }
        C7328 c7328 = (C7328) this.f2343.invoke(interfaceC1695);
        if (c7328 == null) {
            return this.f2340;
        }
        this.f2340 = c7328;
        return c7328;
    }
}
