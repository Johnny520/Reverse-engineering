package p000;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: dr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0138dr {

    /* JADX INFO: renamed from: a */
    public static final float f1167a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f1168b;

    /* JADX INFO: renamed from: c */
    public static final double f1169c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f1168b = dLog;
        f1169c = dLog - 1.0d;
    }
}
