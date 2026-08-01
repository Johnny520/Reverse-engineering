package androidx.compose.ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1823 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1822 f5312;

    public ChoreographerFrameCallbackC1823(C1822 c1822) {
        this.f5312 = c1822;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f5312.f5311.removeCallbacks(this);
        C1822.m3447(this.f5312);
        C1822 c1822 = this.f5312;
        synchronized (c1822.f5305) {
            if (c1822.f5307) {
                c1822.f5307 = false;
                ArrayList arrayList = c1822.f5308;
                c1822.f5308 = c1822.f5309;
                c1822.f5309 = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1822.m3447(this.f5312);
        C1822 c1822 = this.f5312;
        synchronized (c1822.f5305) {
            if (c1822.f5308.isEmpty()) {
                c1822.f5310.removeFrameCallback(this);
                c1822.f5307 = false;
            }
        }
    }
}
