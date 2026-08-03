package p092z0;

import android.os.Handler;
import android.os.Message;
import p008E.C0158l;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: z0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1147e implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0158l f4414a;

    public C1147e(C0158l c0158l) {
        this.f4414a = c0158l;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0158l c0158l = this.f4414a;
        AbstractC0324d.m726i(message.obj);
        synchronized (c0158l.f362a) {
            throw null;
        }
    }
}
