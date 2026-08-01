package p018b3;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: b3.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0941c0 extends AbstractC0938b0 {
    public AbstractC0941c0(InputConnection inputConnection, InterfaceC0184l interfaceC0184l) {
        super(inputConnection, interfaceC0184l);
    }

    @Override // p018b3.AbstractC0938b0
    /* JADX INFO: renamed from: b */
    public final void mo3457b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnectionM3458c = m3458c();
        if (inputConnectionM3458c != null) {
            return inputConnectionM3458c.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnectionM3458c = m3458c();
        if (inputConnectionM3458c != null) {
            return inputConnectionM3458c.getHandler();
        }
        return null;
    }
}
