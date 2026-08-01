package p018b3;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: b3.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0944d0 extends AbstractC0941c0 {
    public C0944d0(InputConnection inputConnection, InterfaceC0184l interfaceC0184l) {
        super(inputConnection, interfaceC0184l);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection inputConnectionM3458c = m3458c();
        if (inputConnectionM3458c != null) {
            return inputConnectionM3458c.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
