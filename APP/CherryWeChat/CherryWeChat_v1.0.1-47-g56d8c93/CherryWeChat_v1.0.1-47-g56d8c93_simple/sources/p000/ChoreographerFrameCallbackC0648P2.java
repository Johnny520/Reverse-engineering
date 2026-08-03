package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* JADX INFO: renamed from: P2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC0648P2 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2086b;

    public /* synthetic */ ChoreographerFrameCallbackC0648P2(ProfileInstallerInitializer r1, Context r2) {
        this.f2085a = 1;
        this.f2086b = r2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r5) {
        switch(this.f2085a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Context r52 = (Context) this.f2086b;
        Handler r6 = Handler.createAsync(Looper.getMainLooper());
        int r0 = new Random().nextInt(Math.max(1000, 1));
        r6.postDelayed(new RunnableC2126k3(r52, 1), r0 + 5000);
        return;
    L6:
        ((Runnable) this.f2086b).run();
    }

    public /* synthetic */ ChoreographerFrameCallbackC0648P2(Runnable r2) {
        this.f2085a = 0;
        this.f2086b = r2;
    }
}
