package p000;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class id0 {

    /* JADX INFO: renamed from: a */
    public static final float f4566a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f4567b;

    /* JADX INFO: renamed from: c */
    public static final double f4568c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f4567b = dLog;
        f4568c = dLog - 1.0d;
    }
}
