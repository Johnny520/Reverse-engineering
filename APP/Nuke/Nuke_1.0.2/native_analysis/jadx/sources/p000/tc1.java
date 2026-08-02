package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tc1 {

    /* JADX INFO: renamed from: a */
    public static final double f10677a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f10678b = 0;

    /* JADX INFO: renamed from: a */
    public static double m5161a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f10677a;
    }
}
