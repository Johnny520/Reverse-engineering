package p000;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ub */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0767ub implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0804vb f11198h;

    public ChoreographerFrameCallbackC0767ub(C0804vb c0804vb) {
        this.f11198h = c0804vb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f11198h.f11875k.removeCallbacks(this);
        C0804vb.m5663G(this.f11198h);
        C0804vb c0804vb = this.f11198h;
        synchronized (c0804vb.f11876l) {
            if (c0804vb.f11881q) {
                c0804vb.f11881q = false;
                ArrayList arrayList = c0804vb.f11878n;
                c0804vb.f11878n = c0804vb.f11879o;
                c0804vb.f11879o = arrayList;
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
        C0804vb.m5663G(this.f11198h);
        C0804vb c0804vb = this.f11198h;
        synchronized (c0804vb.f11876l) {
            if (c0804vb.f11878n.isEmpty()) {
                c0804vb.f11874j.removeFrameCallback(this);
                c0804vb.f11881q = false;
            }
        }
    }
}
