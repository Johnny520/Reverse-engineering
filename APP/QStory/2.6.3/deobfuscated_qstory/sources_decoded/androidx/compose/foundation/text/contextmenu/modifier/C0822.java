package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.layout.InterfaceC1695;
import io.ktor.util.C4211;
import p112.C7328;
import p121.C7388;
import p175.AbstractC7739;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822 implements InterfaceC0827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0821 f2338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f2339;

    public C0822(C0821 c0821, long j) {
        this.f2338 = c0821;
        this.f2339 = j;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C7388 mo1639() {
        return AbstractC0825.m1645(this.f2338);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final long mo1640(InterfaceC1695 interfaceC1695) {
        InterfaceC1695 interfaceC16952 = (InterfaceC1695) ((AbstractC1347) this.f2338.f2336).getValue();
        if (interfaceC16952 != null) {
            return interfaceC1695.mo3081(interfaceC16952, this.f2339);
        }
        AbstractC7741.m13094("Tried to open context menu before the anchor was placed.");
        C4211.m8602();
        return 0L;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final C7328 mo1641(InterfaceC1695 interfaceC1695) {
        return AbstractC7739.m13070(mo1640(interfaceC1695), 0L);
    }
}
