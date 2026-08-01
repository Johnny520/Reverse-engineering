package p047I0;

import android.os.Process;
import android.view.MotionEvent;
import com.bumptech.glide.ComponentCallbacks2C1947p;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.dartcv.nuke.BuildConfig;
import p000A.C0072l0;
import p088R1.C1201b;
import p117X2.AbstractC1665j;
import p133a4.AbstractC1805a;
import p133a4.C1807c;
import p133a4.C1808d;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: I0.v */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0766v implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2390d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2391e;

    public /* synthetic */ RunnableC0766v(int i5, Object obj) {
        this.f2390d = i5;
        this.f2391e = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1805a abstractC1805aM3281b;
        long jNanoTime;
        switch (this.f2390d) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f2391e;
                viewTreeObserverOnGlobalLayoutListenerC0772y.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0772y.f2506x0;
                if (motionEvent != null) {
                    boolean z5 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z5) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i5 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i5 = 2;
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = (ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f2391e;
                    viewTreeObserverOnGlobalLayoutListenerC0772y2.m1302J(motionEvent, i5, viewTreeObserverOnGlobalLayoutListenerC0772y2.f2508y0, false);
                    return;
                }
                return;
            case BuildConfig.VERSION_CODE /* 1 */:
                Process.setThreadPriority(10);
                ((Runnable) this.f2391e).run();
                return;
            case 2:
                C0072l0 c0072l0 = (C0072l0) this.f2391e;
                c0072l0.getClass();
                while (true) {
                    try {
                        c0072l0.m102f((C1201b) ((ReferenceQueue) c0072l0.f308f).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 3:
                C1808d c1808d = (C1808d) this.f2391e;
                synchronized (c1808d) {
                    c1808d.f6168g++;
                    abstractC1805aM3281b = c1808d.m3281b();
                }
                if (abstractC1805aM3281b == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    AbstractC1805a abstractC1805a = abstractC1805aM3281b;
                    try {
                        threadCurrentThread.setName(abstractC1805a.f6148a);
                        Logger logger = ((C1808d) this.f2391e).f6163b;
                        C1807c c1807c = abstractC1805a.f6150c;
                        AbstractC1665j.m2982b(c1807c);
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            AbstractC2352g.m4191d(logger, abstractC1805a, c1807c, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jMo3274a = abstractC1805a.mo3274a();
                            if (zIsLoggable) {
                                AbstractC2352g.m4191d(logger, abstractC1805a, c1807c, "finished run in " + AbstractC2352g.m4204q(System.nanoTime() - jNanoTime));
                            }
                            C1808d c1808d2 = (C1808d) this.f2391e;
                            synchronized (c1808d2) {
                                C1808d.m3280a(c1808d2, abstractC1805a, jMo3274a, true);
                                abstractC1805aM3281b = c1808d2.m3281b();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                AbstractC2352g.m4191d(logger, abstractC1805a, c1807c, "failed a run in " + AbstractC2352g.m4204q(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            C1808d c1808d3 = (C1808d) this.f2391e;
                            synchronized (c1808d3) {
                                C1808d.m3280a(c1808d3, abstractC1805a, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (abstractC1805aM3281b != null);
                threadCurrentThread.setName(name);
                return;
            default:
                ComponentCallbacks2C1947p componentCallbacks2C1947p = (ComponentCallbacks2C1947p) this.f2391e;
                componentCallbacks2C1947p.f6610f.m2850k(componentCallbacks2C1947p);
                return;
        }
    }
}
