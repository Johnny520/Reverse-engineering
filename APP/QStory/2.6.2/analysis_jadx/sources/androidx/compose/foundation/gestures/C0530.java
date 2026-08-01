package androidx.compose.foundation.gestures;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0530 implements InterfaceC0531 {
    @Override // androidx.compose.foundation.gestures.InterfaceC0531
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo1312(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        float f5 = f3 - f4;
        if ((fAbs <= f3) && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
