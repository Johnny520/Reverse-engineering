package androidx.compose.p001ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2658 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2657 f5658;

    public ChoreographerFrameCallbackC2658(C2657 c2657) {
        this.f5658 = c2657;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f5658.f5657.removeCallbacks(this);
        C2657.m4017(this.f5658);
        C2657 c2657 = this.f5658;
        synchronized (c2657.f5651) {
            if (c2657.f5653) {
                c2657.f5653 = false;
                ArrayList arrayList = c2657.f5654;
                c2657.f5654 = c2657.f5655;
                c2657.f5655 = arrayList;
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
        C2657.m4017(this.f5658);
        C2657 c2657 = this.f5658;
        synchronized (c2657.f5651) {
            if (c2657.f5654.isEmpty()) {
                c2657.f5656.removeFrameCallback(this);
                c2657.f5653 = false;
            }
        }
    }
}
