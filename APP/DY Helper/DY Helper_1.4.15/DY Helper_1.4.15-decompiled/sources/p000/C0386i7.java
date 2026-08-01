package p000;

/* JADX INFO: renamed from: i7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0386i7 extends p000.m42 {

    /* JADX INFO: renamed from: θ */
    public static final p000.C0891v f4931 = null;

    /* JADX INFO: renamed from: ι */
    public static p000.C0386i7 f4932;

    /* JADX INFO: renamed from: κ */
    public static final java.util.concurrent.locks.ReentrantLock f4933 = null;

    /* JADX INFO: renamed from: λ */
    public static final java.util.concurrent.locks.Condition f4934 = null;

    /* JADX INFO: renamed from: μ */
    public static final long f4935 = 0;

    /* JADX INFO: renamed from: ν */
    public static final long f4936 = 0;

    /* JADX INFO: renamed from: ε */
    public int f4937;

    /* JADX INFO: renamed from: ζ */
    public int f4938;

    /* JADX INFO: renamed from: η */
    public long f4939;

    static {
            v r0 = new v
            r0.<init>()
            r1 = 8
            i7[] r1 = new p000.C0386i7[r1]
            r0.f11045 = r1
            p000.C0386i7.f4931 = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            p000.C0386i7.f4933 = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            r0.getClass()
            p000.C0386i7.f4934 = r0
            r0 = 60000(0xea60, double:2.9644E-319)
            p000.C0386i7.f4935 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            p000.C0386i7.f4936 = r0
            return
    }

    public C0386i7() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f4938 = r0
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m2628() {
            r5 = this;
            long r0 = r5.f6938
            boolean r2 = r5.f6936
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.locks.ReentrantLock r0 = p000.C0386i7.f4933
            r0.lock()
            int r1 = r5.f4937     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            r1 = 1
            r5.f4937 = r1     // Catch: java.lang.Throwable -> L20
            p000.C0381i2.m2586(r5)     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return
        L20:
            r5 = move-exception
            goto L2a
        L22:
            java.lang.String r5 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L2a:
            r0.unlock()
            throw r5
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m2629() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = p000.C0386i7.f4933
            r0.lock()
            int r1 = r4.f4937     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r4.f4937 = r2     // Catch: java.lang.Throwable -> L16
            r3 = 1
            if (r1 != r3) goto L18
            v r1 = p000.C0386i7.f4931     // Catch: java.lang.Throwable -> L16
            r1.m6014(r4)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return r2
        L16:
            r4 = move-exception
            goto L20
        L18:
            r4 = 2
            if (r1 != r4) goto L1c
            r2 = r3
        L1c:
            r0.unlock()
            return r2
        L20:
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: κ */
    public java.io.IOException mo2630(java.io.IOException r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: λ */
    public void mo2631() {
            r0 = this;
            return
    }
}
