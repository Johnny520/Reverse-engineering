package androidx.compose.material3;

import androidx.activity.compose.C0858;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.C2193;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1973 f3625;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1973 f3626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2193 f3627 = new C2193(new C0858(17));

    static {
        long j = C2434.f5042;
        f3626 = new C1973(Float.NaN, j, true);
        f3625 = new C1973(Float.NaN, j, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1973 m2578(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = C2434.f5042;
        return (C8722.m13877(f, Float.NaN) && C2434.m3509(j, j)) ? z ? f3626 : f3625 : new C1973(f, j, z);
    }
}
