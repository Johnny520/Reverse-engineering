package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1718f {

    /* JADX INFO: renamed from: a */
    public final long f6228a;

    /* JADX INFO: renamed from: d */
    public final int f6231d;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f6230c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public final AtomicLong f6232e = new AtomicLong(0);

    /* JADX INFO: renamed from: b */
    public final C1715c f6229b = C1715c.f6222a;

    public C1718f(int i, long j) {
        this.f6228a = j;
        this.f6231d = i <= 0 ? 1 : i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3904a() {
        this.f6229b.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.f6232e;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.f6230c;
        if (j == 0 || atomicLong.get() + this.f6228a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f6231d) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }
}
