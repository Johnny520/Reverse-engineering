package p001;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: ۟.hc */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0245hc extends Handler {
    public HandlerC0245hc(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
