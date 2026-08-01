package p099y;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: y.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1088t {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static float m2361a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static float m2362b(VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m2363c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
