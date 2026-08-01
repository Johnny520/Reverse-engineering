package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.InterfaceC1485;
import androidx.compose.ui.platform.C1901;
import androidx.compose.ui.platform.InterfaceC1871;
import p052.InterfaceC6557;
import p106.AbstractC7307;
import p106.C7309;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0959 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0943 f2733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2735 = 0;

    public C0959(C0943 c0943, C0882 c0882) {
        this.f2733 = c0943;
        this.f2734 = c0882;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2735;
        C0943 c0943 = this.f2733;
        boolean zM2637 = false;
        Object obj2 = this.f2734;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((C7309) obj).f19458;
                if (c0943.m1858() == HandleState.Selection && keyEvent.getKeyCode() == 4 && AbstractC7307.m12476(keyEvent) == 1) {
                    ((C0882) obj2).m1763(null);
                    zM2637 = true;
                }
                return Boolean.valueOf(zM2637);
            default:
                KeyEvent keyEvent2 = ((C7309) obj).f19458;
                InterfaceC1485 interfaceC1485 = (InterfaceC1485) obj2;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && AbstractC7307.m12476(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (AbstractC0983.m1901(19, keyEvent2)) {
                        zM2637 = ((C1478) interfaceC1485).m2637(5, true);
                    } else if (AbstractC0983.m1901(20, keyEvent2)) {
                        zM2637 = ((C1478) interfaceC1485).m2637(6, true);
                    } else if (AbstractC0983.m1901(21, keyEvent2)) {
                        zM2637 = ((C1478) interfaceC1485).m2637(3, true);
                    } else if (AbstractC0983.m1901(22, keyEvent2)) {
                        zM2637 = ((C1478) interfaceC1485).m2637(4, true);
                    } else if (AbstractC0983.m1901(23, keyEvent2)) {
                        InterfaceC1871 interfaceC1871 = c0943.f2667;
                        if (interfaceC1871 != null) {
                            ((C1901) interfaceC1871).m3585();
                        }
                        zM2637 = true;
                    }
                }
                return Boolean.valueOf(zM2637);
        }
    }

    public C0959(InterfaceC1485 interfaceC1485, C0943 c0943) {
        this.f2734 = interfaceC1485;
        this.f2733 = c0943;
    }
}
