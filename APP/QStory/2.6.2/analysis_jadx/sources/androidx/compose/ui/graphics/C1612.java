package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1612 implements InterfaceC1578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PathMeasure f4719;

    public C1612(PathMeasure pathMeasure) {
        this.f4719 = pathMeasure;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2966(float f, float f2, C1614 c1614) {
        if (c1614 != null) {
            return this.f4719.getSegment(f, f2, c1614.f4724, true);
        }
        C5919.m11247("Unable to obtain android.graphics.Path");
        return false;
    }
}
