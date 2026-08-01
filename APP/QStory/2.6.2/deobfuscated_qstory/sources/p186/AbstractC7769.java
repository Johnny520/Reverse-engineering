package p186;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7769 extends Drawable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final double f21070 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m13091(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f21070) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static float m13092(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f21070) * ((double) f2)) + ((double) f));
    }
}
