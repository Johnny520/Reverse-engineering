package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class c40 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0318i0 f818a;

    public c40(C0318i0 c0318i0) {
        this.f818a = c0318i0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0318i0 c0318i0 = this.f818a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (c0318i0.f2294a) {
            throw null;
        }
    }
}
