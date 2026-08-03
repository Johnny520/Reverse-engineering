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

    public C1693e0(long r14) {
        this(r14, r14, 0, 0, false, false, 0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        return Long.compare(this.f6104b, ((C1693e0) r5).f6104b);
    }

    public C1693e0(long r1, long r3, long r5, long r7, boolean r9, boolean r10, long r11) {
        this.f6103a = r1;
        this.f6104b = r3;
        this.f6105c = r5;
        this.f6106d = r7;
        this.f6107e = r9;
        this.f6108f = r10;
        this.f6109g = r11;
    }
}
