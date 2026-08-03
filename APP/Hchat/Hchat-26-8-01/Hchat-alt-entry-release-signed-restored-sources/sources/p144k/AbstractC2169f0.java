package p144k;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: k.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2169f0 {

    /* JADX INFO: renamed from: a */
    public static final float f7183a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f7184b;

    /* JADX INFO: renamed from: c */
    public static final double f7185c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f7184b = dLog;
        f7185c = dLog - 1.0d;
    }
}
