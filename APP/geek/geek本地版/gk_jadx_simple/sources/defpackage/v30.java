package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class v30 implements Handler.Callback {
    public final /* synthetic */ i0 a;

    public v30(i0 r1) {
        this.a = r1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r2) {
        if (r2.what == 0) goto L6;
        return false;
    L6:
        i0 r0 = this.a;
        if (r2.obj != null) goto L16;
        monitor-enter(r0.a);
        throw null;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    L16:
        throw new ClassCastException();
    }
}
