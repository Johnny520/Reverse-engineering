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

    public /* synthetic */ RunnableC2531t8(int i) {
        this.f8830a = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m5013a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8830a) {
            case 0:
                CherryDevServer.start$lambda$0();
                break;
            case 1:
                break;
            case 2:
                C1716d.f6224b = Process.myTid();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }
}
