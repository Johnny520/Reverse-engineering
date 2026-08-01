package p195l2;

import android.os.SystemClock;

/* JADX INFO: renamed from: l2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2505i {

    /* JADX INFO: renamed from: a */
    public static final double f8017a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f8018b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static double m4446a(long j5) {
        return (SystemClock.elapsedRealtimeNanos() - j5) * f8017a;
    }
}
