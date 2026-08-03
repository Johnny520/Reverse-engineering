package p190n2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import p036c9.RunnableC0476p1;
import p249qg.AbstractC3553c0;
import p249qg.C3564g;
import p353xg.C5808e;
import vg.AbstractC4564m;

/* JADX INFO: renamed from: n2.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC2889x implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9341g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f9342h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ChoreographerFrameCallbackC2889x(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f9341g = 2;
        this.f9342h = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        int i9 = this.f9341g;
        Object obj = this.f9342h;
        switch (i9) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                C5808e c5808e = AbstractC3553c0.f11555a;
                ((C3564g) obj).m7504B(AbstractC4564m.f15049a, Long.valueOf(j3));
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0476p1((Context) obj, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ ChoreographerFrameCallbackC2889x(Runnable runnable, int i9) {
        this.f9341g = i9;
        this.f9342h = runnable;
    }
}
