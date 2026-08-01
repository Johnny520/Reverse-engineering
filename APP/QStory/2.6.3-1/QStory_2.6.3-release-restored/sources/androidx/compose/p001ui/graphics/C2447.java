package androidx.compose.p001ui.graphics;

import android.graphics.PathMeasure;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2447 implements InterfaceC2413 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PathMeasure f5065;

    public C2447(PathMeasure pathMeasure) {
        this.f5065 = pathMeasure;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m3536(float f, float f2, C2449 c2449) {
        if (c2449 != null) {
            return this.f5065.getSegment(f, f2, c2449.f5070, true);
        }
        C6755.m11867("Unable to obtain android.graphics.Path");
        return false;
    }
}
