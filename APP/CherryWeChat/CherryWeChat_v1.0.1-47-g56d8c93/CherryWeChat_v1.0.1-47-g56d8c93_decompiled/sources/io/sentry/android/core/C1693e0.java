package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1693e0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f6103a;

    /* JADX INFO: renamed from: b */
    public final long f6104b;

    /* JADX INFO: renamed from: c */
    public final long f6105c;

    /* JADX INFO: renamed from: d */
    public final long f6106d;

    /* JADX INFO: renamed from: e */
    public final boolean f6107e;

    /* JADX INFO: renamed from: f */
    public final boolean f6108f;

    /* JADX INFO: renamed from: g */
    public final long f6109g;

    public C1693e0(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f6104b, ((C1693e0) obj).f6104b);
    }

    public C1693e0(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.f6103a = j;
        this.f6104b = j2;
        this.f6105c = j3;
        this.f6106d = j4;
        this.f6107e = z;
        this.f6108f = z2;
        this.f6109g = j5;
    }
}
