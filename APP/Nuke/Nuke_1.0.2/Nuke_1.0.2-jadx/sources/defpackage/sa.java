package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sa implements q22, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long o;
    public final View h;
    public boolean j;
    public boolean m;
    public long n;
    public final PriorityQueue i = new PriorityQueue(11, new qa(0));
    public final Choreographer k = Choreographer.getInstance();
    public final ra l = new ra();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sa(View view) {
        float refreshRate;
        this.h = view;
        if (o == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                o = (long) (1.0E9f / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                o = (long) (1.0E9f / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.m = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q22
    public final void a(p22 p22Var) {
        this.i.add(new j32(1, p22Var));
        if (this.j) {
            return;
        }
        this.j = true;
        this.h.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        ra raVar = this.l;
        long jA = raVar.a();
        tp0.R("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.i;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((j32) objPeek).b.b(raVar)) {
                priorityQueue.poll();
                z = false;
            }
            raVar.a = false;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.m) {
            this.n = j;
            this.h.post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.m = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.m = false;
        this.h.removeCallbacks(this);
        this.k.removeFrameCallback(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.i;
        if (!priorityQueue.isEmpty() && this.j && this.m) {
            View view = this.h;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * o) + nanos;
                ra raVar = this.l;
                raVar.a = z;
                raVar.b = Math.max(this.n, nanos) + o;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (raVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.k.postFrameCallback(this);
                } else {
                    this.j = false;
                }
                tp0.R("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.j = false;
    }
}
