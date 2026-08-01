package p047I0;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: I0.X */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0704X implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0706Y f2231d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChoreographerFrameCallbackC0704X(C0706Y c0706y) {
        this.f2231d = c0706y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.f2231d.f2236g.removeCallbacks(this);
        C0706Y.m1206G(this.f2231d);
        C0706Y c0706y = this.f2231d;
        synchronized (c0706y.f2237h) {
            if (c0706y.f2242m) {
                c0706y.f2242m = false;
                ArrayList arrayList = c0706y.f2239j;
                c0706y.f2239j = c0706y.f2240k;
                c0706y.f2240k = arrayList;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((Choreographer.FrameCallback) arrayList.get(i5)).doFrame(j5);
                }
                arrayList.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0706Y.m1206G(this.f2231d);
        C0706Y c0706y = this.f2231d;
        synchronized (c0706y.f2237h) {
            if (c0706y.f2239j.isEmpty()) {
                c0706y.f2235f.removeFrameCallback(this);
                c0706y.f2242m = false;
            }
        }
    }
}
