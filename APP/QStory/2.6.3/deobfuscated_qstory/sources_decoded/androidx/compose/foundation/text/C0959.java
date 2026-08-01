package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.InterfaceC1485;
import androidx.compose.ui.platform.C1901;
import androidx.compose.ui.platform.InterfaceC1871;
import p052.InterfaceC6558;
import p106.AbstractC7308;
import p106.C7310;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0959 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0943 f2734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2736 = 0;

    public C0959(C0943 c0943, C0882 c0882) {
        this.f2734 = c0943;
        this.f2735 = c0882;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2736;
        C0943 c0943 = this.f2734;
        boolean zM2647 = false;
        Object obj2 = this.f2735;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((C7310) obj).f19453;
                if (c0943.m1868() == HandleState.Selection && keyEvent.getKeyCode() == 4 && AbstractC7308.m12503(keyEvent) == 1) {
                    ((C0882) obj2).m1773(null);
                    zM2647 = true;
                }
                return Boolean.valueOf(zM2647);
            default:
                KeyEvent keyEvent2 = ((C7310) obj).f19453;
                InterfaceC1485 interfaceC1485 = (InterfaceC1485) obj2;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && AbstractC7308.m12503(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (AbstractC0983.m1911(19, keyEvent2)) {
                        zM2647 = ((C1478) interfaceC1485).m2647(5, true);
                    } else if (AbstractC0983.m1911(20, keyEvent2)) {
                        zM2647 = ((C1478) interfaceC1485).m2647(6, true);
                    } else if (AbstractC0983.m1911(21, keyEvent2)) {
                        zM2647 = ((C1478) interfaceC1485).m2647(3, true);
                    } else if (AbstractC0983.m1911(22, keyEvent2)) {
                        zM2647 = ((C1478) interfaceC1485).m2647(4, true);
                    } else if (AbstractC0983.m1911(23, keyEvent2)) {
                        InterfaceC1871 interfaceC1871 = c0943.f2668;
                        if (interfaceC1871 != null) {
                            ((C1901) interfaceC1871).m3595();
                        }
                        zM2647 = true;
                    }
                }
                return Boolean.valueOf(zM2647);
        }
    }

    public C0959(InterfaceC1485 interfaceC1485, C0943 c0943) {
        this.f2735 = interfaceC1485;
        this.f2734 = c0943;
    }
}
