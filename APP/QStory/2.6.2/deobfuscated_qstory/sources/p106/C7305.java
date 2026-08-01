package p106;

import android.view.KeyEvent;
import androidx.compose.ui.AbstractC2128;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7305 extends AbstractC2128 implements InterfaceC7306 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6557 f19454;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC6557 f19455;

    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo1280(KeyEvent keyEvent) {
        InterfaceC6557 interfaceC6557 = this.f19454;
        if (interfaceC6557 != null) {
            return ((Boolean) interfaceC6557.invoke(new C7309(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1285(KeyEvent keyEvent) {
        InterfaceC6557 interfaceC6557 = this.f19455;
        if (interfaceC6557 != null) {
            return ((Boolean) interfaceC6557.invoke(new C7309(keyEvent))).booleanValue();
        }
        return false;
    }
}
