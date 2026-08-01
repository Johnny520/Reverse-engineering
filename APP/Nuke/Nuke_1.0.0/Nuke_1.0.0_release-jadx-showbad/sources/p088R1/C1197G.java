package p088R1;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: R1.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1197G implements Handler.Callback {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((InterfaceC1194D) message.obj).mo2256e();
        return true;
    }
}
