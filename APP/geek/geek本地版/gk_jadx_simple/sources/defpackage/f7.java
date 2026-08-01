package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class f7 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r3) {
        int r0 = r3.what;
        if (r0 != 0) goto L5;
        r3.obj.getClass();
        throw new ClassCastException();
    L5:
        if (r0 == 1) goto L8;
        return false;
    L8:
        r3.obj.getClass();
        throw new ClassCastException();
    }
}
