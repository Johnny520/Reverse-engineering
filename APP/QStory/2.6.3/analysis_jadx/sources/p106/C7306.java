package p106;

import android.view.KeyEvent;
import androidx.compose.ui.AbstractC2128;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7306 extends AbstractC2128 implements InterfaceC7307 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f19449;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC6558 f19450;

    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo1290(KeyEvent keyEvent) {
        InterfaceC6558 interfaceC6558 = this.f19449;
        if (interfaceC6558 != null) {
            return ((Boolean) interfaceC6558.invoke(new C7310(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1295(KeyEvent keyEvent) {
        InterfaceC6558 interfaceC6558 = this.f19450;
        if (interfaceC6558 != null) {
            return ((Boolean) interfaceC6558.invoke(new C7310(keyEvent))).booleanValue();
        }
        return false;
    }
}
