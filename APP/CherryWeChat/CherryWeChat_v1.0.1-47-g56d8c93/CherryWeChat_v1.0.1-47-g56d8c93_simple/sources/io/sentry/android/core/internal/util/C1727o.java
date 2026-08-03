package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Window;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.C1743q;
import io.sentry.config.AbstractC1856a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1727o implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n */
    public static final long f6254n = 0;

    /* JADX INFO: renamed from: o */
    public static final long f6255o = 0;

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

    static {
        f6254n = TimeUnit.SECONDS.toNanos(1);
        f6255o = TimeUnit.MILLISECONDS.toNanos(700);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.m] */
    public C1727o(Context r4, final C1743q r5, final C1666I r6) {
        C1715c r0 = new C1715c();
        this.f6258b = new CopyOnWriteArraySet();
        this.f6262f = new ConcurrentHashMap();
        this.f6263g = false;
        this.f6268l = 0;
        this.f6269m = 0;
        Context r1 = r4.getApplicationContext();
        if (r1 == null) goto L5;
        r4 = r1;
    L5:
        AbstractC1856a.m4048D("Logger is required", r5);
        this.f6259c = r5;
        AbstractC1856a.m4048D("BuildInfoProvider is required", r6);
        this.f6257a = r6;
        this.f6264h = r0;
        if ((r4 instanceof Application) == true) goto L8;
        return;
    L8:
        this.f6263g = true;
        HandlerThread r12 = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
        r12.setUncaughtExceptionHandler(new C1724l(r5));
        r12.start();
        this.f6260d = new Handler(r12.getLooper());
        ((Application) r4).registerActivityLifecycleCallbacks(this);
        new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(25, this, r5));
        Field r42 = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");     // Catch: NoSuchFieldException -> L11
        this.f6267k = r42;     // Catch: NoSuchFieldException -> L11
        r42.setAccessible(true);     // Catch: NoSuchFieldException -> L11
    L13:
        this.f6265i = new WindowOnFrameMetricsAvailableListenerC1725m(this, r6);
        return;
    L11:
        e = move-exception;
        r5.mo3683r(EnumC1657a2.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
        goto L13
    }

    /* JADX INFO: renamed from: a */
    public final void m3906a(String r4) {
        if (this.f6263g == false) goto L19;
        ConcurrentHashMap r0 = this.f6262f;
        if (r4 == null) goto L8;
        r0.remove(r4);
    L8:
        WeakReference r42 = this.f6261e;
        if (r42 == null) goto L11;
        Window r43 = (Window) r42.get();
    L12:
        if (r43 != null) goto L14;
        return;
    L14:
        if (r0.isEmpty() == false) goto L18;
        new Handler(Looper.getMainLooper()).post(new RunnableC1723k(this, r43, 1));
        return;
    L18:
        return;
    L11:
        r43 = null;
        goto L12
    }

    /* JADX INFO: renamed from: b */
    public final void m3907b() {
        WeakReference r0 = this.f6261e;
        if (r0 == null) goto L5;
        Window r02 = (Window) r0.get();
    L6:
        if (r02 != null) goto L8;
        return;
    L8:
        if (this.f6263g == true) goto L11;
        return;
    L11:
        if (this.f6262f.isEmpty() == false) goto L14;
        return;
    L14:
        if (this.f6260d == null) goto L18;
        new Handler(Looper.getMainLooper()).post(new RunnableC1723k(this, r02, 0));
        return;
    L18:
        return;
    L5:
        r02 = null;
        goto L6
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r2) {
        Window r22 = r2.getWindow();
        WeakReference r0 = this.f6261e;
        if (r0 != null) goto L5;
    L7:
        this.f6261e = new WeakReference(r22);
        m3907b();
        return;
    L5:
        if (r0.get() != r22) goto L7;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r5) {
        Window r0 = r5.getWindow();
        new Handler(Looper.getMainLooper()).post(new RunnableC1723k(this, r0, 1));
        WeakReference r02 = this.f6261e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.get() != r5.getWindow()) goto L9;
        this.f6261e = null;
        return;
    }
}
