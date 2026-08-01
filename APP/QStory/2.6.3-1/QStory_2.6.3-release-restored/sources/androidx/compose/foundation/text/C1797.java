package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.focus.InterfaceC2320;
import androidx.compose.p001ui.platform.C2736;
import androidx.compose.p001ui.platform.InterfaceC2706;
import p068.InterfaceC7387;
import p122.AbstractC8137;
import p122.C8139;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1797 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1781 f3079;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3080;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3081 = 0;

    public C1797(C1781 c1781, C1720 c1720) {
        this.f3079 = c1781;
        this.f3080 = c1720;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f3081;
        C1781 c1781 = this.f3079;
        boolean zM3207 = false;
        Object obj2 = this.f3080;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((C8139) obj).f19798;
                if (c1781.m2428() == HandleState.Selection && keyEvent.getKeyCode() == 4 && AbstractC8137.m13062(keyEvent) == 1) {
                    ((C1720) obj2).m2333(null);
                    zM3207 = true;
                }
                return Boolean.valueOf(zM3207);
            default:
                KeyEvent keyEvent2 = ((C8139) obj).f19798;
                InterfaceC2320 interfaceC2320 = (InterfaceC2320) obj2;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && AbstractC8137.m13062(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (AbstractC1821.m2471(19, keyEvent2)) {
                        zM3207 = ((C2313) interfaceC2320).m3207(5, true);
                    } else if (AbstractC1821.m2471(20, keyEvent2)) {
                        zM3207 = ((C2313) interfaceC2320).m3207(6, true);
                    } else if (AbstractC1821.m2471(21, keyEvent2)) {
                        zM3207 = ((C2313) interfaceC2320).m3207(3, true);
                    } else if (AbstractC1821.m2471(22, keyEvent2)) {
                        zM3207 = ((C2313) interfaceC2320).m3207(4, true);
                    } else if (AbstractC1821.m2471(23, keyEvent2)) {
                        InterfaceC2706 interfaceC2706 = c1781.f3013;
                        if (interfaceC2706 != null) {
                            ((C2736) interfaceC2706).m4155();
                        }
                        zM3207 = true;
                    }
                }
                return Boolean.valueOf(zM3207);
        }
    }

    public C1797(InterfaceC2320 interfaceC2320, C1781 c1781) {
        this.f3080 = interfaceC2320;
        this.f3079 = c1781;
    }
}
