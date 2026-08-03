package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.C1743q;
import io.sentry.config.AbstractC1856a;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1727o implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n */
    public static final long f6254n = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: o */
    public static final long f6255o = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f6256p = 0;

    /* JADX INFO: renamed from: a */
    public final C1666I f6257a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet f6258b;

    /* JADX INFO: renamed from: c */
    public final ILogger f6259c;

    /* JADX INFO: renamed from: d */
    public final Handler f6260d;

    /* JADX INFO: renamed from: e */
    public WeakReference f6261e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f6262f;

    /* JADX INFO: renamed from: g */
    public final boolean f6263g;

    /* JADX INFO: renamed from: h */
    public final C1715c f6264h;

    /* JADX INFO: renamed from: i */
    public final WindowOnFrameMetricsAvailableListenerC1725m f6265i;

    /* JADX INFO: renamed from: j */
    public Choreographer f6266j;

    /* JADX INFO: renamed from: k */
    public final Field f6267k;

    /* JADX INFO: renamed from: l */
    public long f6268l;

    /* JADX INFO: renamed from: m */
    public long f6269m;

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.m] */
    public C1727o(Context context, final C1743q c1743q, final C1666I c1666i) {
        C1715c c1715c = new C1715c();
        this.f6258b = new CopyOnWriteArraySet();
        this.f6262f = new ConcurrentHashMap();
        this.f6263g = false;
        this.f6268l = 0L;
        this.f6269m = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        AbstractC1856a.m4048D("Logger is required", c1743q);
        this.f6259c = c1743q;
        AbstractC1856a.m4048D("BuildInfoProvider is required", c1666i);
        this.f6257a = c1666i;
        this.f6264h = c1715c;
        if (context instanceof Application) {
            this.f6263g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.l
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    c1743q.mo3683r(EnumC1657a2.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.f6260d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(25, this, c1743q));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f6267k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                c1743q.mo3683r(EnumC1657a2.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.f6265i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.m
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    long jNanoTime = System.nanoTime();
                    c1666i.getClass();
                    float refreshRate = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
                    float f = C1727o.f6254n;
                    long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                    long jMax = Math.max(0L, metric - ((long) (f / refreshRate)));
                    C1727o c1727o = this.f6252a;
                    c1727o.f6257a.getClass();
                    long metric2 = frameMetrics.getMetric(10);
                    if (metric2 < 0) {
                        metric2 = jNanoTime - metric;
                    }
                    long jMax2 = Math.max(metric2, c1727o.f6269m);
                    if (jMax2 == c1727o.f6268l) {
                        return;
                    }
                    c1727o.f6268l = jMax2;
                    c1727o.f6269m = jMax2 + metric;
                    boolean z = metric > ((long) (f / (refreshRate - 1.0f)));
                    boolean z2 = z && metric > C1727o.f6255o;
                    Iterator it = c1727o.f6262f.values().iterator();
                    while (it.hasNext()) {
                        long j = metric;
                        long j2 = jMax;
                        long j3 = jMax2;
                        ((InterfaceC1726n) it.next()).mo3870c(j3, c1727o.f6269m, j, j2, z, z2, refreshRate);
                        c1727o = c1727o;
                        jMax2 = j3;
                        jMax = j2;
                        metric = j;
                    }
                }
            };
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3906a(String str) {
        if (this.f6263g) {
            ConcurrentHashMap concurrentHashMap = this.f6262f;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f6261e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC1723k(this, window, 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3907b() {
        WeakReference weakReference = this.f6261e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f6263g || this.f6262f.isEmpty() || this.f6260d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC1723k(this, window, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f6261e;
        if (weakReference == null || weakReference.get() != window) {
            this.f6261e = new WeakReference(window);
            m3907b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1723k(this, activity.getWindow(), 1));
        WeakReference weakReference = this.f6261e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f6261e = null;
    }
}
