package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1718f {

    /* JADX INFO: renamed from: a */
    public final long f6228a;

    /* JADX INFO: renamed from: b */
    public final C1715c f6229b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f6230c;

    /* JADX INFO: renamed from: d */
    public final int f6231d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f6232e;

    public C1718f(int r4, long r5) {
        this.f6230c = new AtomicInteger(0);
        this.f6232e = new AtomicLong(0);
        this.f6229b = C1715c.f6222a;
        this.f6228a = r5;
        if (r4 > 0) goto L5;
        r4 = 1;
    L5:
        this.f6231d = r4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3904a() {
        this.f6229b.getClass();
        long r0 = SystemClock.uptimeMillis();
        AtomicLong r2 = this.f6232e;
        long r3 = r2.get();
        AtomicInteger r4 = this.f6230c;
        if (r3 != 0) goto L5;
    L12:
        r4.set(0);
        r2.set(r0);
        return false;
    L5:
        if ((r2.get() + this.f6228a) <= r0) goto L12;
        if (r4.incrementAndGet() >= this.f6231d) goto L10;
        return false;
    L10:
        r4.set(0);
        return true;
    }
}
