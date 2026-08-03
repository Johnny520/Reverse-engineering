package io.sentry.android.core.performance;

import android.os.SystemClock;

/* JADX INFO: renamed from: io.sentry.android.core.performance.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1741g implements Comparable {

    /* JADX INFO: renamed from: a */
    public String f6320a;

    /* JADX INFO: renamed from: b */
    public long f6321b;

    /* JADX INFO: renamed from: c */
    public long f6322c;

    /* JADX INFO: renamed from: d */
    public long f6323d;

    /* JADX INFO: renamed from: a */
    public final long m3918a() {
        long r0 = this.f6323d;
        if (r0 != 0) goto L5;
        return 0;
    L5:
        return r0 - this.f6322c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3919b() {
        if (this.f6322c == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m3920c(long r3) {
        this.f6322c = r3;
        long r32 = SystemClock.uptimeMillis() - this.f6322c;
        this.f6321b = System.currentTimeMillis() - r32;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        return Long.compare(this.f6321b, ((C1741g) r5).f6321b);
    }
}
