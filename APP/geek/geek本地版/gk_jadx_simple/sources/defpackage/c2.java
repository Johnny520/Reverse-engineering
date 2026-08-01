package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends Handler {
    public WeakReference a;

    @Override // android.os.Handler
    public final void handleMessage(Message r3) {
        int r0 = r3.what;
        if (r0 != (-3)) goto L5;
    L13:
        ((DialogInterface.OnClickListener) r3.obj).onClick((DialogInterface) this.a.get(), r3.what);
        return;
    L5:
        if (r0 == (-2)) goto L13;
        if (r0 == (-1)) goto L13;
        if (r0 == 1) goto L11;
        return;
    L11:
        ((DialogInterface) r3.obj).dismiss();
    }
}
