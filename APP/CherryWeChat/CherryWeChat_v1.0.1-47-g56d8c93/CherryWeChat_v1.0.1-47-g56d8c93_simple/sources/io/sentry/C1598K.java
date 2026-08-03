package io.sentry;

import io.sentry.util.C2029a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1598K {

    /* JADX INFO: renamed from: g */
    public static final long f5762g = 0;

    /* JADX INFO: renamed from: h */
    public static final long f5763h = 0;

    /* JADX INFO: renamed from: i */
    public static volatile C1598K f5764i;

    /* JADX INFO: renamed from: j */
    public static final C2029a f5765j = null;

    /* JADX INFO: renamed from: a */
    public final long f5766a;

    /* JADX INFO: renamed from: b */
    public volatile String f5767b;

    /* JADX INFO: renamed from: c */
    public volatile long f5768c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f5769d;

    /* JADX INFO: renamed from: e */
    public final CallableC1590I f5770e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f5771f;

    static {
        f5762g = TimeUnit.HOURS.toMillis(5);
        f5763h = TimeUnit.SECONDS.toMillis(1);
        f5765j = new C2029a();
    }

    public C1598K() {
        CallableC1590I r0 = new CallableC1590I(0);
        this.f5769d = new AtomicBoolean(false);
        this.f5771f = Executors.newSingleThreadExecutor(new ThreadFactoryC1594J(0));
        this.f5766a = f5762g;
        this.f5770e = r0;
        m3689a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3689a() {
        CallableC1604L1 r0 = new CallableC1604L1(16, this);
        this.f5771f.submit(r0).get(f5763h, TimeUnit.MILLISECONDS);     // Catch: Throwable -> L5 InterruptedException -> L6
        return;
    L6:
        Thread.currentThread().interrupt();
        long r3 = System.currentTimeMillis();
        this.f5768c = TimeUnit.SECONDS.toMillis(1) + r3;
        return;
    L5:
        long r32 = System.currentTimeMillis();
        this.f5768c = TimeUnit.SECONDS.toMillis(1) + r32;
    }
}
