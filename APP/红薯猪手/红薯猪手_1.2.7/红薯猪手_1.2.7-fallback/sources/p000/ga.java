package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ga {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f401;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f402;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f403;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final long f404;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final long f405;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final long f406;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final long f407;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final long f408;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final long f409;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final long f410;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final int f411;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final int f412;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public final int f413;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final long f414;

    public ga(int r4, int r5, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20, int r22, int r23, int r24, long r25) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.f401 = r1
            r1 = r5
            r0.f402 = r1
            r1 = r6
            r0.f403 = r1
            r1 = r8
            r0.f404 = r1
            r1 = r10
            r0.f405 = r1
            r1 = r12
            r0.f406 = r1
            r1 = r14
            r0.f407 = r1
            r1 = r16
            r0.f408 = r1
            r1 = r18
            r0.f409 = r1
            r1 = r20
            r0.f410 = r1
            r1 = r22
            r0.f411 = r1
            r1 = r23
            r0.f412 = r1
            r1 = r24
            r0.f413 = r1
            r1 = r25
            r0.f414 = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "StatsSnapshot{maxSize="
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            int r1 = r3.f401
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r3.f402
            r0.append(r1)
            java.lang.String r1 = ", cacheHits="
            r0.append(r1)
            long r1 = r3.f403
            r0.append(r1)
            java.lang.String r1 = ", cacheMisses="
            r0.append(r1)
            long r1 = r3.f404
            r0.append(r1)
            java.lang.String r1 = ", downloadCount="
            r0.append(r1)
            int r1 = r3.f411
            r0.append(r1)
            java.lang.String r1 = ", totalDownloadSize="
            r0.append(r1)
            long r1 = r3.f405
            r0.append(r1)
            java.lang.String r1 = ", averageDownloadSize="
            r0.append(r1)
            long r1 = r3.f408
            r0.append(r1)
            java.lang.String r1 = ", totalOriginalBitmapSize="
            r0.append(r1)
            long r1 = r3.f406
            r0.append(r1)
            java.lang.String r1 = ", totalTransformedBitmapSize="
            r0.append(r1)
            long r1 = r3.f407
            r0.append(r1)
            java.lang.String r1 = ", averageOriginalBitmapSize="
            r0.append(r1)
            long r1 = r3.f409
            r0.append(r1)
            java.lang.String r1 = ", averageTransformedBitmapSize="
            r0.append(r1)
            long r1 = r3.f410
            r0.append(r1)
            java.lang.String r1 = ", originalBitmapCount="
            r0.append(r1)
            int r1 = r3.f412
            r0.append(r1)
            java.lang.String r1 = ", transformedBitmapCount="
            r0.append(r1)
            int r1 = r3.f413
            r0.append(r1)
            java.lang.String r1 = ", timeStamp="
            r0.append(r1)
            long r1 = r3.f414
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m167(java.io.PrintWriter r3) {
            r2 = this;
            java.lang.String r0 = "===============BEGIN PICASSO STATS ==============="
            r3.println(r0)
            java.lang.String r0 = "Memory Cache Stats"
            r3.println(r0)
            java.lang.String r0 = "  Max Cache Size: "
            r3.print(r0)
            int r0 = r2.f401
            r3.println(r0)
            java.lang.String r0 = "  Cache Size: "
            r3.print(r0)
            int r0 = r2.f402
            r3.println(r0)
            java.lang.String r0 = "  Cache % Full: "
            r3.print(r0)
            int r0 = r2.f402
            float r0 = (float) r0
            int r1 = r2.f401
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r3.println(r0)
            java.lang.String r0 = "  Cache Hits: "
            r3.print(r0)
            long r0 = r2.f403
            r3.println(r0)
            java.lang.String r0 = "  Cache Misses: "
            r3.print(r0)
            long r0 = r2.f404
            r3.println(r0)
            java.lang.String r0 = "Network Stats"
            r3.println(r0)
            java.lang.String r0 = "  Download Count: "
            r3.print(r0)
            int r0 = r2.f411
            r3.println(r0)
            java.lang.String r0 = "  Total Download Size: "
            r3.print(r0)
            long r0 = r2.f405
            r3.println(r0)
            java.lang.String r0 = "  Average Download Size: "
            r3.print(r0)
            long r0 = r2.f408
            r3.println(r0)
            java.lang.String r0 = "Bitmap Stats"
            r3.println(r0)
            java.lang.String r0 = "  Total Bitmaps Decoded: "
            r3.print(r0)
            int r0 = r2.f412
            r3.println(r0)
            java.lang.String r0 = "  Total Bitmap Size: "
            r3.print(r0)
            long r0 = r2.f406
            r3.println(r0)
            java.lang.String r0 = "  Total Transformed Bitmaps: "
            r3.print(r0)
            int r0 = r2.f413
            r3.println(r0)
            java.lang.String r0 = "  Total Transformed Bitmap Size: "
            r3.print(r0)
            long r0 = r2.f407
            r3.println(r0)
            java.lang.String r0 = "  Average Bitmap Size: "
            r3.print(r0)
            long r0 = r2.f409
            r3.println(r0)
            java.lang.String r0 = "  Average Transformed Bitmap Size: "
            r3.print(r0)
            long r0 = r2.f410
            r3.println(r0)
            java.lang.String r0 = "===============END PICASSO STATS ==============="
            r3.println(r0)
            r3.flush()
            return
    }
}
