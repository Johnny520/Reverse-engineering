package androidx.compose.foundation;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double f3040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final double f3041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f3042 = ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f3041 = dLog;
        f3040 = dLog - 1.0d;
    }
}
