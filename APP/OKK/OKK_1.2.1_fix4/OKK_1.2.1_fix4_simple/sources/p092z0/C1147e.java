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

    public C1147e(C0158l r1) {
        this.f4414a = r1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r2) {
        if (r2.what == 0) goto L6;
        return false;
    L6:
        C0158l r02 = this.f4414a;
        AbstractC0324d.m726i(r2.obj);
        monitor-enter(r02.f362a);
        throw null;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }
}
