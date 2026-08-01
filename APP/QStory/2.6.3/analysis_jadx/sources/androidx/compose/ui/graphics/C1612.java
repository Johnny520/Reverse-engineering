package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1612 implements InterfaceC1578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PathMeasure f4720;

    public C1612(PathMeasure pathMeasure) {
        this.f4720 = pathMeasure;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2976(float f, float f2, C1614 c1614) {
        if (c1614 != null) {
            return this.f4720.getSegment(f, f2, c1614.f4725, true);
        }
        C5925.m11308("Unable to obtain android.graphics.Path");
        return false;
    }
}
