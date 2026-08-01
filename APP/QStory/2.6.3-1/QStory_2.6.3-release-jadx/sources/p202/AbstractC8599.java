package p202;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8599 extends Drawable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final double f21412 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m13678(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f21412) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static float m13679(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f21412) * ((double) f2)) + ((double) f));
    }
}
