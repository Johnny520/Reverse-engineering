package androidx.compose.ui.adaptive;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import p034.AbstractC6347;
import top.linl.dexparser.bean.DexMap;

/* JADX INFO: renamed from: androidx.compose.ui.adaptive.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1402 implements InputManager.InputDeviceListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InputManager f4058;

    public C1402(InputManager inputManager, AbstractC1399 abstractC1399) {
        this.f4058 = inputManager;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        m2540();
        throw null;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        m2540();
        throw null;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        m2540();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2540() {
        InputManager inputManager = this.f4058;
        if (inputManager != null) {
            String str = "None";
            for (int i : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null) {
                    if (AbstractC6347.m11894(inputDevice, DexMap.TYPE_STRING_DATA_ITEM) || AbstractC6347.m11894(inputDevice, 16386) || AbstractC6347.m11894(inputDevice, 1048584)) {
                        break;
                    }
                    if (AbstractC6347.m11894(inputDevice, DexMap.TYPE_ANNOTATION_SET_REF_LIST)) {
                        str = "Coarse";
                    } else if (str.equals("None") && (AbstractC6347.m11894(inputDevice, 16777232) || AbstractC6347.m11894(inputDevice, 1025))) {
                        str = "Blunt";
                    }
                }
            }
        }
        throw null;
    }
}
