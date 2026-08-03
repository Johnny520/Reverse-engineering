package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ic {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.StringBuilder f502 = null;

    public static class a extends java.lang.Thread {
        public a(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r1 = this;
                r0 = 10
                android.os.Process.setThreadPriority(r0)
                super.run()
                return
        }
    }

    public static class b implements java.util.concurrent.ThreadFactory {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable r2) {
                r1 = this;
                ۟.ic$a r0 = new ۟.ic$a
                r0.<init>(r2)
                return r0
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            p000.ic.f502 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static long m200(java.io.File r7) {
            r0 = 5242880(0x500000, double:2.590327E-317)
            android.os.StatFs r2 = new android.os.StatFs     // Catch: java.lang.IllegalArgumentException -> L1b
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.IllegalArgumentException -> L1b
            r2.<init>(r7)     // Catch: java.lang.IllegalArgumentException -> L1b
            int r7 = r2.getBlockCount()     // Catch: java.lang.IllegalArgumentException -> L1b
            long r3 = (long) r7     // Catch: java.lang.IllegalArgumentException -> L1b
            int r7 = r2.getBlockSize()     // Catch: java.lang.IllegalArgumentException -> L1b
            long r5 = (long) r7     // Catch: java.lang.IllegalArgumentException -> L1b
            long r3 = r3 * r5
            r5 = 50
            long r3 = r3 / r5
            goto L1c
        L1b:
            r3 = r0
        L1c:
            r5 = 52428800(0x3200000, double:2.5903269E-316)
            long r2 = java.lang.Math.min(r3, r5)
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m201(android.graphics.Bitmap r3) {
            int r0 = r3.getByteCount()
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Negative size: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m202(p000.c0 r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = m203(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static java.lang.String m203(p000.c0 r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            ۟.f r5 = r4.f185
            if (r5 == 0) goto L12
            ۟.w8 r1 = r5.f314
            java.lang.String r1 = r1.m454()
            r0.append(r1)
        L12:
            java.util.ArrayList r4 = r4.f186
            if (r4 == 0) goto L38
            r1 = 0
            int r2 = r4.size()
        L1b:
            if (r1 >= r2) goto L38
            if (r1 > 0) goto L21
            if (r5 == 0) goto L26
        L21:
            java.lang.String r3 = ", "
            r0.append(r3)
        L26:
            java.lang.Object r3 = r4.get(r1)
            ۟.f r3 = (p000.f) r3
            ۟.w8 r3 = r3.f314
            java.lang.String r3 = r3.m454()
            r0.append(r3)
            int r1 = r1 + 1
            goto L1b
        L38:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
