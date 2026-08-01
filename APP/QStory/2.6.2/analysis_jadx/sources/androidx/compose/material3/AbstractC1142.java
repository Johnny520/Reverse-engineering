package androidx.compose.material3;

import androidx.activity.compose.C0011;
import androidx.compose.runtime.C1358;
import androidx.compose.ui.graphics.C1599;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1142 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1138 f3279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1138 f3280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1358 f3281 = new C1358(new C0011(17));

    static {
        long j = C1599.f4696;
        f3280 = new C1138(Float.NaN, j, true);
        f3279 = new C1138(Float.NaN, j, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1138 m2008(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = C1599.f4696;
        return (C7892.m13290(f, Float.NaN) && C1599.m2939(j, j)) ? z ? f3280 : f3279 : new C1138(f, j, z);
    }
}
