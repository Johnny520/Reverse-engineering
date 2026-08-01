package p000;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0344j6 implements cs0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: k */
    public static long f2737k;

    /* JADX INFO: renamed from: d */
    public final View f2738d;

    /* JADX INFO: renamed from: f */
    public boolean f2740f;

    /* JADX INFO: renamed from: i */
    public boolean f2743i;

    /* JADX INFO: renamed from: j */
    public long f2744j;

    /* JADX INFO: renamed from: e */
    public final PriorityQueue f2739e = new PriorityQueue(11, new C0272h6(0));

    /* JADX INFO: renamed from: g */
    public final Choreographer f2741g = Choreographer.getInstance();

    /* JADX INFO: renamed from: h */
    public final C0309i6 f2742h = new C0309i6();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnAttachStateChangeListenerC0344j6(View view) {
        float refreshRate;
        this.f2738d = view;
        if (f2737k == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                f2737k = (long) (1.0E9f / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                f2737k = (long) (1.0E9f / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f2743i = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.cs0
    /* JADX INFO: renamed from: a */
    public final void mo601a(bs0 bs0Var) {
        this.f2739e.add(new ms0(1, bs0Var));
        if (this.f2740f) {
            return;
        }
        this.f2740f = true;
        this.f2738d.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1677b() {
        C0309i6 c0309i6 = this.f2742h;
        long jM1558a = c0309i6.m1558a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jM1558a);
        boolean z = true;
        if (jM1558a > 0) {
            PriorityQueue priorityQueue = this.f2739e;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((ms0) objPeek).f4031b.m365c(c0309i6)) {
                priorityQueue.poll();
                z = false;
            }
            c0309i6.f2457a = false;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f2743i) {
            this.f2744j = j;
            this.f2738d.post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2743i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2743i = false;
        this.f2738d.removeCallbacks(this);
        this.f2741g.removeFrameCallback(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f2739e;
        if (!priorityQueue.isEmpty() && this.f2740f && this.f2743i) {
            View view = this.f2738d;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * f2737k) + nanos;
                C0309i6 c0309i6 = this.f2742h;
                c0309i6.f2457a = z;
                c0309i6.f2458b = Math.max(this.f2744j, nanos) + f2737k;
                boolean zM1677b = false;
                while (!priorityQueue.isEmpty() && !zM1677b) {
                    if (c0309i6.f2457a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM1677b = m1677b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zM1677b = m1677b();
                    }
                }
                if (zM1677b) {
                    this.f2741g.postFrameCallback(this);
                } else {
                    this.f2740f = false;
                }
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f2740f = false;
    }
}
