package p260x;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import com.bumptech.glide.AbstractC1926h;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p041H0.C0549A;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: x.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3419b implements InterfaceC3411Q, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: k */
    public static long f10688k;

    /* JADX INFO: renamed from: d */
    public final View f10689d;

    /* JADX INFO: renamed from: f */
    public boolean f10691f;

    /* JADX INFO: renamed from: i */
    public boolean f10694i;

    /* JADX INFO: renamed from: j */
    public long f10695j;

    /* JADX INFO: renamed from: e */
    public final PriorityQueue f10690e = new PriorityQueue(11, new C0549A(3));

    /* JADX INFO: renamed from: g */
    public final Choreographer f10692g = Choreographer.getInstance();

    /* JADX INFO: renamed from: h */
    public final C3418a f10693h = new C3418a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnAttachStateChangeListenerC3419b(View view) {
        float refreshRate;
        this.f10689d = view;
        if (f10688k == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                f10688k = (long) (1000000000 / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                f10688k = (long) (1000000000 / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f10694i = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p260x.InterfaceC3411Q
    /* JADX INFO: renamed from: a */
    public void mo5683a(C3410P c3410p) {
        this.f10690e.add(new C3414U(1, c3410p));
        if (this.f10691f) {
            return;
        }
        this.f10691f = true;
        this.f10689d.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5685b() {
        C3418a c3418a = this.f10693h;
        long jM5684a = c3418a.m5684a();
        AbstractC1926h.m3556I("compose:lazy:prefetch:available_time_nanos", jM5684a);
        boolean z5 = true;
        if (jM5684a > 0) {
            PriorityQueue priorityQueue = this.f10690e;
            Object objPeek = priorityQueue.peek();
            AbstractC1665j.m2982b(objPeek);
            if (!((C3414U) objPeek).f10682b.m5676c(c3418a)) {
                priorityQueue.poll();
                z5 = false;
            }
            c3418a.f10686a = false;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        if (this.f10694i) {
            this.f10695j = j5;
            this.f10689d.post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10694i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10694i = false;
        this.f10689d.removeCallbacks(this);
        this.f10692g.removeFrameCallback(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f10690e;
        if (!priorityQueue.isEmpty() && this.f10691f && this.f10694i) {
            View view = this.f10689d;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z5 = System.nanoTime() > (((long) 2) * f10688k) + nanos;
                C3418a c3418a = this.f10693h;
                c3418a.f10686a = z5;
                c3418a.f10687b = Math.max(this.f10695j, nanos) + f10688k;
                boolean zM5685b = false;
                while (!priorityQueue.isEmpty() && !zM5685b) {
                    if (c3418a.f10686a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM5685b = m5685b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zM5685b = m5685b();
                    }
                }
                if (zM5685b) {
                    this.f10692g.postFrameCallback(this);
                } else {
                    this.f10691f = false;
                }
                AbstractC1926h.m3556I("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f10691f = false;
    }
}
