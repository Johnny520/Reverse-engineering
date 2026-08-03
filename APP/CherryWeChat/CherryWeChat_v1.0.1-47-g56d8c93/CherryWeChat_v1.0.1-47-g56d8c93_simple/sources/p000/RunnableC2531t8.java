package p000;

import android.os.Process;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import io.sentry.android.core.internal.util.C1716d;
import io.sentry.android.ndk.SentryNdk;

/* JADX INFO: renamed from: t8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2531t8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8830a;

    public /* synthetic */ RunnableC2531t8(int r1) {
        this.f8830a = r1;
    }

    /* JADX INFO: renamed from: a */
    private final void m5013a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f8830a) {
            case 0: goto L8;
            case 1: goto L10;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        SentryNdk.m3938a();
        return;
    L6:
        C1716d.f6224b = Process.myTid();
        return;
    L8:
        CherryDevServer.m3524g();
        return;
    }
}
