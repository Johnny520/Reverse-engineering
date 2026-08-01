package androidx.compose.foundation.gestures;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0539 f1548 = C0539.f1564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default float mo1312(float f, float f2, float f3) {
        f1548.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
