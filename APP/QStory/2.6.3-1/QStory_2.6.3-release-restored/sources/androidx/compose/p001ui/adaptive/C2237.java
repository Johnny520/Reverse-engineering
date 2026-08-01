package androidx.compose.p001ui.adaptive;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import p050.AbstractC7176;
import top.linl.dexparser.bean.DexMap;

/* JADX INFO: renamed from: androidx.compose.ui.adaptive.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2237 implements InputManager.InputDeviceListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InputManager f4403;

    public C2237(InputManager inputManager, AbstractC2234 abstractC2234) {
        this.f4403 = inputManager;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        m3100();
        throw null;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        m3100();
        throw null;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        m3100();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3100() {
        InputManager inputManager = this.f4403;
        if (inputManager != null) {
            String str = "None";
            for (int i : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null) {
                    if (AbstractC7176.m12453(inputDevice, DexMap.TYPE_STRING_DATA_ITEM) || AbstractC7176.m12453(inputDevice, 16386) || AbstractC7176.m12453(inputDevice, 1048584)) {
                        break;
                    }
                    if (AbstractC7176.m12453(inputDevice, DexMap.TYPE_ANNOTATION_SET_REF_LIST)) {
                        str = "Coarse";
                    } else if (str.equals("None") && (AbstractC7176.m12453(inputDevice, 16777232) || AbstractC7176.m12453(inputDevice, 1025))) {
                        str = "Blunt";
                    }
                }
            }
        }
        throw null;
    }
}
