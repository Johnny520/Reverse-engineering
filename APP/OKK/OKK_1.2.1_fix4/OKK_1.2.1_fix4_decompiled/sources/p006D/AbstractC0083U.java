package p006D;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: D.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0083U {
    /* JADX INFO: renamed from: a */
    public static int m297a(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static int m298b(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i4);
    }
}
