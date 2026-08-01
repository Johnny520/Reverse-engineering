package p317;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.activity.AbstractC0053;
import p157.InterpolatorC7623;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8680 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinearInterpolator f24476 = new LinearInterpolator();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterpolatorC7623 f24475 = new InterpolatorC7623(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterpolatorC7623 f24474 = new InterpolatorC7623(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterpolatorC7623 f24473 = new InterpolatorC7623(InterpolatorC7623.f20661);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m14376(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m14377(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m14378(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static float m14378(float f, float f2, float f3) {
        return AbstractC0053.m145(f2, f, f3, f);
    }
}
