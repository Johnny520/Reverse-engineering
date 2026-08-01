package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.C1030;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.foundation.text.selection.C0914;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1783;
import kotlinx.coroutines.C5416;
import p052.InterfaceC6557;
import p112.C7327;
import p121.C7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0823 extends AbstractC1788 implements InterfaceC1783, InterfaceC0827 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C5416 f2341;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0914 f2342;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public InterfaceC6557 f2343;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC6557 f2344;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0824 f2345;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1362 f2340 = AbstractC1367.m2486(new C1030(this, 4));

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C7327 f2339 = C7327.f19541;

    public C0823(C0824 c0824, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, C0914 c0914) {
        this.f2345 = c0824;
        this.f2344 = interfaceC6557;
        this.f2343 = interfaceC65572;
        this.f2342 = c0914;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final C7387 mo1629() {
        return (C7387) this.f2340.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo1630(InterfaceC1695 interfaceC1695) {
        return mo1631(interfaceC1695).m12491();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        C0824 c0824 = this.f2345;
        c0824.f2346 = ToolbarHandlerState.Detached;
        c0824.f2347 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        C0824 c0824 = this.f2345;
        c0824.f2346 = ToolbarHandlerState.Attached;
        c0824.f2347 = this;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final C7327 mo1631(InterfaceC1695 interfaceC1695) {
        if (!this.f6278) {
            return this.f2339;
        }
        C7327 c7327 = (C7327) this.f2342.invoke(interfaceC1695);
        if (c7327 == null) {
            return this.f2339;
        }
        this.f2339 = c7327;
        return c7327;
    }
}
