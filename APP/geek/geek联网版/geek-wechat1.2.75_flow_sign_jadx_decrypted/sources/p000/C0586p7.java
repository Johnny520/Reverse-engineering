package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0586p7 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
