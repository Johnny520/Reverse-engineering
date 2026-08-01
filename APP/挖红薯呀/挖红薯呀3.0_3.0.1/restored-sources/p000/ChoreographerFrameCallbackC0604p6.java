package p000;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0604p6 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0641q6 f4765d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChoreographerFrameCallbackC0604p6(C0641q6 c0641q6) {
        this.f4765d = c0641q6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f4765d.f5047g.removeCallbacks(this);
        C0641q6.m3194j(this.f4765d);
        C0641q6 c0641q6 = this.f4765d;
        synchronized (c0641q6.f5048h) {
            if (c0641q6.f5053m) {
                c0641q6.f5053m = false;
                ArrayList arrayList = c0641q6.f5050j;
                c0641q6.f5050j = c0641q6.f5051k;
                c0641q6.f5051k = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0641q6.m3194j(this.f4765d);
        C0641q6 c0641q6 = this.f4765d;
        synchronized (c0641q6.f5048h) {
            if (c0641q6.f5050j.isEmpty()) {
                c0641q6.f5046f.removeFrameCallback(this);
                c0641q6.f5053m = false;
            }
        }
    }
}
