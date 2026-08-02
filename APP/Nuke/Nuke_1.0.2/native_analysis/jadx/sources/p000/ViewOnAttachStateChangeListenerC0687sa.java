package p000;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: sa */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0687sa implements q22, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: o */
    public static long f9999o;

    /* JADX INFO: renamed from: h */
    public final View f10000h;

    /* JADX INFO: renamed from: j */
    public boolean f10002j;

    /* JADX INFO: renamed from: m */
    public boolean f10005m;

    /* JADX INFO: renamed from: n */
    public long f10006n;

    /* JADX INFO: renamed from: i */
    public final PriorityQueue f10001i = new PriorityQueue(11, new C0612qa(0));

    /* JADX INFO: renamed from: k */
    public final Choreographer f10003k = Choreographer.getInstance();

    /* JADX INFO: renamed from: l */
    public final C0649ra f10004l = new C0649ra();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnAttachStateChangeListenerC0687sa(View view) {
        float refreshRate;
        this.f10000h = view;
        if (f9999o == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                f9999o = (long) (1.0E9f / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                f9999o = (long) (1.0E9f / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f10005m = true;
        }
    }

    @Override // p000.q22
    /* JADX INFO: renamed from: a */
    public final void mo4046a(p22 p22Var) {
        this.f10001i.add(new j32(1, p22Var));
        if (this.f10002j) {
            return;
        }
        this.f10002j = true;
        this.f10000h.post(this);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4778b() {
        C0649ra c0649ra = this.f10004l;
        long jM4417a = c0649ra.m4417a();
        tp0.m5354R("compose:lazy:prefetch:available_time_nanos", jM4417a);
        boolean z = true;
        if (jM4417a > 0) {
            PriorityQueue priorityQueue = this.f10001i;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((j32) objPeek).f4887b.m3682b(c0649ra)) {
                priorityQueue.poll();
                z = false;
            }
            c0649ra.f9482a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f10005m) {
            this.f10006n = j;
            this.f10000h.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10005m = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10005m = false;
        this.f10000h.removeCallbacks(this);
        this.f10003k.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f10001i;
        if (!priorityQueue.isEmpty() && this.f10002j && this.f10005m) {
            View view = this.f10000h;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * f9999o) + nanos;
                C0649ra c0649ra = this.f10004l;
                c0649ra.f9482a = z;
                c0649ra.f9483b = Math.max(this.f10006n, nanos) + f9999o;
                boolean zM4778b = false;
                while (!priorityQueue.isEmpty() && !zM4778b) {
                    if (c0649ra.f9482a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM4778b = m4778b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zM4778b = m4778b();
                    }
                }
                if (zM4778b) {
                    this.f10003k.postFrameCallback(this);
                } else {
                    this.f10002j = false;
                }
                tp0.m5354R("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f10002j = false;
    }
}
