package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a12 {
    /* JADX INFO: renamed from: α */
    public static int m14(int r0, int r1, int r2) {
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static int m15(int r0, int r1, java.lang.String r2) {
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static int m16(java.util.List r0, int r1, int r2) {
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m17(java.lang.String r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m18(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.StringBuilder m19(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.StringBuilder m20(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static void m21(int r0, android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r2 = r2.concat(r3)
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r0)
            r0.show()
            return
    }

    /* JADX INFO: renamed from: ι */
    public static /* synthetic */ void m22(java.lang.AutoCloseable r5) {
            boolean r0 = r5 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto L8
            r5.close()
            return
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L3b
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L15
            goto L3a
        L15:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L3a
            r5.shutdown()
            r1 = 0
        L1f:
            if (r0 != 0) goto L31
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L2a
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L2a
            goto L1f
        L2a:
            if (r1 != 0) goto L1f
            r5.shutdownNow()
            r1 = 1
            goto L1f
        L31:
            if (r1 == 0) goto L3a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L3a:
            return
        L3b:
            boolean r0 = r5 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L45
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r5.recycle()
            return
        L45:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }
}
