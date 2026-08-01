package p061e;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: e.d */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0528d extends Handler {

    /* JADX INFO: renamed from: a */
    public WeakReference f1722a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == -3 || i2 == -2 || i2 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1722a.get(), message.what);
        } else {
            if (i2 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
