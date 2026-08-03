package p092z0;

import android.os.Handler;
import android.os.Message;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1143a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            AbstractC0324d.m726i(message.obj);
            throw null;
        }
        if (i2 != 1) {
            return false;
        }
        AbstractC0324d.m726i(message.obj);
        throw null;
    }
}
