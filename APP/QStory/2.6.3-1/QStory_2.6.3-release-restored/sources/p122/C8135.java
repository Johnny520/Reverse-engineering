package p122;

import android.view.KeyEvent;
import androidx.compose.p001ui.AbstractC2961;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8135 extends AbstractC2961 implements InterfaceC8136 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7387 f19794;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC7387 f19795;

    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo1850(KeyEvent keyEvent) {
        InterfaceC7387 interfaceC7387 = this.f19794;
        if (interfaceC7387 != null) {
            return ((Boolean) interfaceC7387.invoke(new C8139(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1855(KeyEvent keyEvent) {
        InterfaceC7387 interfaceC7387 = this.f19795;
        if (interfaceC7387 != null) {
            return ((Boolean) interfaceC7387.invoke(new C8139(keyEvent))).booleanValue();
        }
        return false;
    }
}
