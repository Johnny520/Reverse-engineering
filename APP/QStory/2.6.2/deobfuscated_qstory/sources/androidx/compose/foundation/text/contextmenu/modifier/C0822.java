package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.layout.InterfaceC1695;
import io.ktor.util.C4210;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p112.C7327;
import p121.C7387;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822 implements InterfaceC0827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0821 f2337;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f2338;

    public C0822(C0821 c0821, long j) {
        this.f2337 = c0821;
        this.f2338 = j;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C7387 mo1629() {
        return AbstractC0825.m1635(this.f2337);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final long mo1630(InterfaceC1695 interfaceC1695) {
        InterfaceC1695 interfaceC16952 = (InterfaceC1695) ((AbstractC1347) this.f2337.f2335).getValue();
        if (interfaceC16952 != null) {
            return interfaceC1695.mo3071(interfaceC16952, this.f2338);
        }
        AbstractC7740.m13066("Tried to open context menu before the anchor was placed.");
        C4210.m8612();
        return 0L;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final C7327 mo1631(InterfaceC1695 interfaceC1695) {
        return AbstractC5061.m10034(mo1630(interfaceC1695), 0L);
    }
}
