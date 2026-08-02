package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ub implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ vb h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ub(vb vbVar) {
        this.h = vbVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.h.k.removeCallbacks(this);
        vb.G(this.h);
        vb vbVar = this.h;
        synchronized (vbVar.l) {
            if (vbVar.q) {
                vbVar.q = false;
                ArrayList arrayList = vbVar.n;
                vbVar.n = vbVar.o;
                vbVar.o = arrayList;
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
        vb.G(this.h);
        vb vbVar = this.h;
        synchronized (vbVar.l) {
            if (vbVar.n.isEmpty()) {
                vbVar.j.removeFrameCallback(this);
                vbVar.q = false;
            }
        }
    }
}
