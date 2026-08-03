package p006D;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: D.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0132x {
    /* JADX INFO: renamed from: a */
    public static float m462a(VelocityTracker r02, int r1) {
        return r02.getAxisVelocity(r1);
    }

    /* JADX INFO: renamed from: b */
    public static float m463b(VelocityTracker r02, int r1, int r2) {
        return r02.getAxisVelocity(r1, r2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m464c(VelocityTracker r02, int r1) {
        return r02.isAxisSupported(r1);
    }
}
