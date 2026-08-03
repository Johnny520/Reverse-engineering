package p265s;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2Connection;
import p023b8.C0205c;
import p077f8.AbstractC1089i;

/* JADX INFO: renamed from: s.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3815b implements InterfaceC3814a1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: n */
    public static long f12509n;

    /* JADX INFO: renamed from: g */
    public final View f12510g;

    /* JADX INFO: renamed from: i */
    public boolean f12512i;

    /* JADX INFO: renamed from: l */
    public boolean f12515l;

    /* JADX INFO: renamed from: m */
    public long f12516m;

    /* JADX INFO: renamed from: h */
    public final PriorityQueue f12511h = new PriorityQueue(11, new C0205c(9));

    /* JADX INFO: renamed from: j */
    public final Choreographer f12513j = Choreographer.getInstance();

    /* JADX INFO: renamed from: k */
    public final C3812a f12514k = new C3812a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnAttachStateChangeListenerC3815b(View view) {
        float refreshRate;
        this.f12510g = view;
        if (f12509n == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                f12509n = (long) (Http2Connection.DEGRADED_PONG_TIMEOUT_NS / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                f12509n = (long) (Http2Connection.DEGRADED_PONG_TIMEOUT_NS / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f12515l = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p265s.InterfaceC3814a1
    /* JADX INFO: renamed from: a */
    public final void mo8002a(C3870z0 c3870z0) {
        this.f12511h.add(new C3823d1(1, c3870z0));
        if (this.f12512i) {
            return;
        }
        this.f12512i = true;
        this.f12510g.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m8003b() {
        C3812a c3812a = this.f12514k;
        long jM8001a = c3812a.m8001a();
        AbstractC1089i.m2736K0(jM8001a, "compose:lazy:prefetch:available_time_nanos");
        boolean z9 = true;
        if (jM8001a > 0) {
            PriorityQueue priorityQueue = this.f12511h;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((C3823d1) objPeek).f12537b.m8049c(c3812a)) {
                priorityQueue.poll();
                z9 = false;
            }
            c3812a.f12502a = false;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.f12515l) {
            this.f12516m = j3;
            this.f12510g.post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12515l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f12515l = false;
        this.f12510g.removeCallbacks(this);
        this.f12513j.removeFrameCallback(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f12511h;
        if (!priorityQueue.isEmpty() && this.f12512i && this.f12515l) {
            View view = this.f12510g;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z9 = System.nanoTime() > (((long) 2) * f12509n) + nanos;
                C3812a c3812a = this.f12514k;
                c3812a.f12502a = z9;
                c3812a.f12503b = Math.max(this.f12516m, nanos) + f12509n;
                boolean zM8003b = false;
                while (!priorityQueue.isEmpty() && !zM8003b) {
                    if (c3812a.f12502a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM8003b = m8003b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zM8003b = m8003b();
                    }
                }
                if (zM8003b) {
                    this.f12513j.postFrameCallback(this);
                } else {
                    this.f12512i = false;
                }
                AbstractC1089i.m2736K0(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f12512i = false;
    }
}
