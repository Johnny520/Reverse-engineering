package p001;

import java.io.PrintWriter;

/* JADX INFO: renamed from: ۟.ga */
/* JADX INFO: loaded from: classes.dex */
public final class C0229ga {

    /* JADX INFO: renamed from: ۥ */
    public final int f814;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f815;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f1473;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final long f1474;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final long f1475;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final long f1476;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final long f1477;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final long f1478;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final long f1479;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final long f1480;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final int f1481;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final int f1482;

    /* JADX INFO: renamed from: ۥ۠ */
    public final int f816;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final long f1483;

    public C0229ga(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f814 = i;
        this.f815 = i2;
        this.f1473 = j;
        this.f1474 = j2;
        this.f1475 = j3;
        this.f1476 = j4;
        this.f1477 = j5;
        this.f1478 = j6;
        this.f1479 = j7;
        this.f1480 = j8;
        this.f1481 = i3;
        this.f1482 = i4;
        this.f816 = i5;
        this.f1483 = j9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1039 = C0167c4.m1039("StatsSnapshot{maxSize=");
        sbM1039.append(this.f814);
        sbM1039.append(", size=");
        sbM1039.append(this.f815);
        sbM1039.append(", cacheHits=");
        sbM1039.append(this.f1473);
        sbM1039.append(", cacheMisses=");
        sbM1039.append(this.f1474);
        sbM1039.append(", downloadCount=");
        sbM1039.append(this.f1481);
        sbM1039.append(", totalDownloadSize=");
        sbM1039.append(this.f1475);
        sbM1039.append(", averageDownloadSize=");
        sbM1039.append(this.f1478);
        sbM1039.append(", totalOriginalBitmapSize=");
        sbM1039.append(this.f1476);
        sbM1039.append(", totalTransformedBitmapSize=");
        sbM1039.append(this.f1477);
        sbM1039.append(", averageOriginalBitmapSize=");
        sbM1039.append(this.f1479);
        sbM1039.append(", averageTransformedBitmapSize=");
        sbM1039.append(this.f1480);
        sbM1039.append(", originalBitmapCount=");
        sbM1039.append(this.f1482);
        sbM1039.append(", transformedBitmapCount=");
        sbM1039.append(this.f816);
        sbM1039.append(", timeStamp=");
        sbM1039.append(this.f1483);
        sbM1039.append('}');
        return sbM1039.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m857(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f814);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f815);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f815 / this.f814) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f1473);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f1474);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f1481);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f1475);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f1478);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f1482);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f1476);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f816);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f1477);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f1479);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f1480);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }
}
