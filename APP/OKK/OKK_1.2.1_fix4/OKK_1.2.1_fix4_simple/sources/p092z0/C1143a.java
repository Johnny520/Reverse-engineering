package p092z0;

import android.os.Handler;
import android.os.Message;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1143a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r4) {
        int r02 = r4.what;
        if (r02 != 0) goto L5;
        AbstractC0324d.m726i(r4.obj);
        throw null;
    L5:
        if (r02 == 1) goto L8;
        return false;
    L8:
        AbstractC0324d.m726i(r4.obj);
        throw null;
    }
}
