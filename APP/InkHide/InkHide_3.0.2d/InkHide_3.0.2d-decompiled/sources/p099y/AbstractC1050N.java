package p099y;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: y.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1050N {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m2294a(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m2295b(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i4);
    }
}
