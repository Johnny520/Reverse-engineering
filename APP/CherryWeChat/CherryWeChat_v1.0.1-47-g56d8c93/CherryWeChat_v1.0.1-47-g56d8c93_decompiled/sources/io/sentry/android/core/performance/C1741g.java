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
        long j = this.f6323d;
        if (j != 0) {
            return j - this.f6322c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3919b() {
        return this.f6322c != 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m3920c(long j) {
        this.f6322c = j;
        this.f6321b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f6322c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f6321b, ((C1741g) obj).f6321b);
    }
}
