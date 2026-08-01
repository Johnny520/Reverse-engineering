package androidx.compose.ui.adaptive;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import p053.AbstractC6560;
import top.linl.dexparser.bean.DexMap;

/* JADX INFO: renamed from: androidx.compose.ui.adaptive.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1402 implements InputManager.InputDeviceListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InputManager f4057;

    public C1402(InputManager inputManager, AbstractC1399 abstractC1399) {
        this.f4057 = inputManager;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        m2530();
        throw null;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        m2530();
        throw null;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        m2530();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2530() {
        InputManager inputManager = this.f4057;
        if (inputManager != null) {
            String str = "None";
            for (int i : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null) {
                    if (AbstractC6560.m12012(inputDevice, DexMap.TYPE_STRING_DATA_ITEM) || AbstractC6560.m12012(inputDevice, 16386) || AbstractC6560.m12012(inputDevice, 1048584)) {
                        break;
                    }
                    if (AbstractC6560.m12012(inputDevice, DexMap.TYPE_ANNOTATION_SET_REF_LIST)) {
                        str = "Coarse";
                    } else if (str.equals("None") && (AbstractC6560.m12012(inputDevice, 16777232) || AbstractC6560.m12012(inputDevice, 1025))) {
                        str = "Blunt";
                    }
                }
            }
        }
        throw null;
    }
}
