package androidx.compose.material3;

import androidx.activity.compose.C0011;
import androidx.compose.runtime.C1358;
import androidx.compose.ui.graphics.C1599;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1142 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1138 f3280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1138 f3281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1358 f3282 = new C1358(new C0011(17));

    static {
        long j = C1599.f4697;
        f3281 = new C1138(Float.NaN, j, true);
        f3280 = new C1138(Float.NaN, j, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1138 m2018(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = C1599.f4697;
        return (C7893.m13318(f, Float.NaN) && C1599.m2949(j, j)) ? z ? f3281 : f3280 : new C1138(f, j, z);
    }
}
