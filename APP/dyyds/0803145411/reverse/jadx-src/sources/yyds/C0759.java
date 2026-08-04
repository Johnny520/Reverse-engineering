package yyds;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: yyds.ᛳᲈᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0759 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((InterfaceC2162) message.obj).mo1177();
        return true;
    }
}
