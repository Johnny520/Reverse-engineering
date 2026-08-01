package androidx.compose.foundation;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double f3041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final double f3042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f3043 = ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f3042 = dLog;
        f3041 = dLog - 1.0d;
    }
}
