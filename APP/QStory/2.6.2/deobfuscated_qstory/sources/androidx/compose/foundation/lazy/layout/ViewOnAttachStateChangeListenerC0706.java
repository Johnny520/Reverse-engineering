package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.appcompat.app.C0109;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p316.C8675;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0706 implements InterfaceC0735, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static long f1986;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f1989;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public long f1990;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f1992;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View f1993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final PriorityQueue f1991 = new PriorityQueue(11, new C0707(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Choreographer f1988 = Choreographer.getInstance();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0109 f1987 = new C0109();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnAttachStateChangeListenerC0706(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f1993 = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏哲兰 r1 = new androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏哲兰
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f1991 = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f1988 = r0
            androidx.appcompat.app.飘花落叶言子苏楪世哲兰 r0 = new androidx.appcompat.app.飘花落叶言子苏楪世哲兰
            r0.<init>()
            r4.f1987 = r0
            long r0 = androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC0706.f1986
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
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
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC0706.f1986 = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.f1989 = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC0706.<init>(android.view.View):void");
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f1989) {
            this.f1990 = j;
            this.f1993.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1989 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1989 = false;
        this.f1993.removeCallbacks(this);
        this.f1988.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f1991;
        if (!priorityQueue.isEmpty() && this.f1992 && this.f1989) {
            View view = this.f1993;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * f1986) + nanos;
                C0109 c0109 = this.f1987;
                c0109.f323 = z;
                c0109.f322 = Math.max(this.f1990, nanos) + f1986;
                boolean zM1494 = false;
                while (!priorityQueue.isEmpty() && !zM1494) {
                    if (c0109.f323) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM1494 = m1494();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zM1494 = m1494();
                    }
                }
                if (zM1494) {
                    this.f1988.postFrameCallback(this);
                } else {
                    this.f1992 = false;
                }
                C8675.m14343(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f1992 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1494() {
        C0109 c0109 = this.f1987;
        long jM404 = c0109.m404();
        C8675.m14343(jM404, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jM404 > 0) {
            PriorityQueue priorityQueue = this.f1991;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((C0729) objPeek).f2041.m1522(c0109)) {
                priorityQueue.poll();
                z = false;
            }
            c0109.f323 = false;
        }
        return z;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0735
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo1495(C0730 c0730) {
        this.f1991.add(new C0729(1, c0730));
        if (this.f1992) {
            return;
        }
        this.f1992 = true;
        this.f1993.post(this);
    }
}
