package yyds;

import android.os.SystemClock;

/* JADX INFO: renamed from: yyds.ᛶᛷᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1382 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final double f6428 = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ int f6429 = 0;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static double m2794(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f6428;
    }
}
