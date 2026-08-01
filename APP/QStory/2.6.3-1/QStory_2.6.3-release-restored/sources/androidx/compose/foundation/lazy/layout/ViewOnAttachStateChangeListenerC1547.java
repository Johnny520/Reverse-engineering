package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.appcompat.app.C0956;
import com.bumptech.glide.AbstractC3889;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1547 implements InterfaceC1576, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static long f2332;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f2335;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public long f2336;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f2338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View f2339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final PriorityQueue f2337 = new PriorityQueue(11, new C1548(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Choreographer f2334 = Choreographer.getInstance();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0956 f2333 = new C0956();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnAttachStateChangeListenerC1547(View view) {
        float refreshRate;
        this.f2339 = view;
        if (f2332 == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                f2332 = (long) (1.0E9f / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                f2332 = (long) (1.0E9f / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f2335 = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f2335) {
            this.f2336 = j;
            this.f2339.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2335 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2335 = false;
        this.f2339.removeCallbacks(this);
        this.f2334.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f2337;
        if (!priorityQueue.isEmpty() && this.f2338 && this.f2335) {
            View view = this.f2339;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * f2332) + nanos;
                C0956 c0956 = this.f2333;
                c0956.f668 = z;
                c0956.f667 = Math.max(this.f2336, nanos) + f2332;
                boolean zM2064 = false;
                while (!priorityQueue.isEmpty() && !zM2064) {
                    if (c0956.f668) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM2064 = m2064();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zM2064 = m2064();
                    }
                }
                if (zM2064) {
                    this.f2334.postFrameCallback(this);
                } else {
                    this.f2338 = false;
                }
                AbstractC3889.m7293(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f2338 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m2064() {
        C0956 c0956 = this.f2333;
        long jM965 = c0956.m965();
        AbstractC3889.m7293(jM965, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jM965 > 0) {
            PriorityQueue priorityQueue = this.f2337;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((C1570) objPeek).f2387.m2092(c0956)) {
                priorityQueue.poll();
                z = false;
            }
            c0956.f668 = false;
        }
        return z;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1576
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2065(C1571 c1571) {
        this.f2337.add(new C1570(1, c1571));
        if (this.f2338) {
            return;
        }
        this.f2338 = true;
        this.f2339.post(this);
    }
}
