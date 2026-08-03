package Yue;

import Yue.InterfaceC7144;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC8871;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3303 extends DialogInterfaceOnCancelListenerC8871 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3303() {
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    @InterfaceC6391
    public Dialog onCreateDialog(@InterfaceC6490 Bundle bundle) {
        return new DialogC3302(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@InterfaceC6391 Dialog dialog, int i) {
        if (!(dialog instanceof DialogC3302)) {
            super.setupDialog(dialog, i);
            return;
        }
        DialogC3302 dialogC3302 = (DialogC3302) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC3302.supportRequestWindowFeature(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3303(@InterfaceC5683 int i) {
        super(i);
    }
}
