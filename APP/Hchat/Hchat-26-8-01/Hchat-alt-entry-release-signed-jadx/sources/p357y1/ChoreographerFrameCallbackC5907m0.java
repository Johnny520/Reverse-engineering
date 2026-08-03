package p357y1;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: y1.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC5907m0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5911n0 f23977g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChoreographerFrameCallbackC5907m0(C5911n0 c5911n0) {
        this.f23977g = c5911n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f23977g.f23987j.removeCallbacks(this);
        C5911n0.m10622z(this.f23977g);
        C5911n0 c5911n0 = this.f23977g;
        synchronized (c5911n0.f23988k) {
            if (c5911n0.f23993p) {
                c5911n0.f23993p = false;
                ArrayList arrayList = c5911n0.f23990m;
                c5911n0.f23990m = c5911n0.f23991n;
                c5911n0.f23991n = arrayList;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((Choreographer.FrameCallback) arrayList.get(i9)).doFrame(j3);
                }
                arrayList.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C5911n0.m10622z(this.f23977g);
        C5911n0 c5911n0 = this.f23977g;
        synchronized (c5911n0.f23988k) {
            if (c5911n0.f23990m.isEmpty()) {
                c5911n0.f23986i.removeFrameCallback(this);
                c5911n0.f23993p = false;
            }
        }
    }
}
