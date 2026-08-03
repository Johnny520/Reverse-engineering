package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: renamed from: P2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC0648P2 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2085a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2086b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f2085a) {
            case 0:
                ((Runnable) this.f2086b).run();
                break;
            default:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new RunnableC2126k3((Context) this.f2086b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ ChoreographerFrameCallbackC0648P2(Runnable runnable) {
        this.f2086b = runnable;
    }
}
