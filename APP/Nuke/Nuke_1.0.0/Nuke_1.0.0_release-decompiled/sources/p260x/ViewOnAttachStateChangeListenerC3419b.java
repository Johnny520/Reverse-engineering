package p260x;

import android.os.Trace;
import android.view.Choreographer;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnAttachStateChangeListenerC3419b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f10689d = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            H0.A r1 = new H0.A
            r2 = 3
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f10690e = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f10692g = r0
            x.a r0 = new x.a
            r0.<init>()
            r4.f10693h = r0
            long r0 = p260x.ViewOnAttachStateChangeListenerC3419b.f10688k
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            p260x.ViewOnAttachStateChangeListenerC3419b.f10688k = r0
        L4a:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L56
            r5 = 1
            r4.f10694i = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260x.ViewOnAttachStateChangeListenerC3419b.<init>(android.view.View):void");
    }

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

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        if (this.f10694i) {
            this.f10695j = j5;
            this.f10689d.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10694i = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10694i = false;
        this.f10689d.removeCallbacks(this);
        this.f10692g.removeFrameCallback(this);
    }

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
