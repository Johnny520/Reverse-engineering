package androidx.compose.foundation.gestures;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1371 implements InterfaceC1372 {
    @Override // androidx.compose.foundation.gestures.InterfaceC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo1882(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        float f5 = f3 - f4;
        if ((fAbs <= f3) && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
