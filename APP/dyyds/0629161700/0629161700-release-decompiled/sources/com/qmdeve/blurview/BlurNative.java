package com.qmdeve.blurview;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class BlurNative {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.util.concurrent.ExecutorService f416 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int f417 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f418;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f419;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public float f420;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r1 = 5
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            com.qmdeve.blurview.BlurNative.f417 = r0
            ᛸᛲᛶᛵ r1 = new ᛸᛲᛶᛵ
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0, r1)
            com.qmdeve.blurview.BlurNative.f416 = r0
            java.lang.String r0 = "QmBlur"
            java.lang.System.loadLibrary(r0)
            return
    }

    public BlurNative() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f419 = r0
            r0 = 1120403456(0x42c80000, float:100.0)
            r2.f420 = r0
            r0 = 2
            r2.f418 = r0
            return
    }

    public static native void blur(java.lang.Object r0, int r1, int r2, int r3, int r4);

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m284(android.graphics.Bitmap r7, android.graphics.Bitmap r8) {
            r6 = this;
            if (r7 == 0) goto L56
            if (r8 == 0) goto L56
            boolean r0 = r7.isRecycled()
            if (r0 != 0) goto L56
            boolean r0 = r8.isRecycled()
            if (r0 == 0) goto L11
            goto L56
        L11:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f419
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 != 0) goto L1c
            goto L56
        L1c:
            r3 = 0
            if (r7 == r8) goto L30
            r8.eraseColor(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5 = 0
            r4.drawBitmap(r7, r5, r5, r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            goto L30
        L2c:
            r6 = move-exception
            goto L52
        L2e:
            r6 = move-exception
            goto L43
        L30:
            r7 = r1
        L31:
            int r4 = r6.f418     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r7 >= r4) goto L3f
            r6.m285(r8, r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4 = 2
            r6.m285(r8, r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r7 = r7 + 1
            goto L31
        L3f:
            r0.set(r1)
            return
        L43:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2c
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L4e
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2c
        L4e:
            r0.set(r1)
            return
        L52:
            r0.set(r1)
            throw r6
        L56:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m285(android.graphics.Bitmap r8, int r9) {
            r7 = this;
            float r7 = r7.f420
            int r2 = (int) r7
            r7 = 0
            int r6 = com.qmdeve.blurview.BlurNative.f417
            r0 = 1
            if (r6 != r0) goto Ld
            blur(r8, r2, r0, r7, r9)
            return
        Ld:
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r5.<init>(r6)
            r3 = r7
        L13:
            if (r3 >= r6) goto L24
            ᛶᛵᛸᲇ r0 = new ᛶᛵᛸᲇ
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r7 = com.qmdeve.blurview.BlurNative.f416
            r7.execute(r0)
            int r3 = r3 + 1
            goto L13
        L24:
            r5.await()     // Catch: java.lang.InterruptedException -> L28
            return
        L28:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            return
    }
}
