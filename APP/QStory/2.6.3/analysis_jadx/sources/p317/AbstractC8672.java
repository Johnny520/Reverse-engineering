package p317;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.activity.AbstractC0053;
import p157.InterpolatorC7624;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8672 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinearInterpolator f24468 = new LinearInterpolator();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterpolatorC7624 f24467 = new InterpolatorC7624(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterpolatorC7624 f24466 = new InterpolatorC7624(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterpolatorC7624 f24465 = new InterpolatorC7624(InterpolatorC7624.f20656);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m14396(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m14397(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m14398(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static float m14398(float f, float f2, float f3) {
        return AbstractC0053.m146(f2, f, f3, f);
    }
}
