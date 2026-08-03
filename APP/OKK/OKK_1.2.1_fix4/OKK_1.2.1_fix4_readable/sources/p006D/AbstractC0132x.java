package p006D;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: D.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0132x {
    /* JADX INFO: renamed from: a */
    public static float m462a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    /* JADX INFO: renamed from: b */
    public static float m463b(VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m464c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
