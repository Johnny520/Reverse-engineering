package p216p;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: p.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2808A {

    /* JADX INFO: renamed from: a */
    public static final float f8838a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f8839b;

    /* JADX INFO: renamed from: c */
    public static final double f8840c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f8839b = dLog;
        f8840c = dLog - 1.0d;
    }
}
