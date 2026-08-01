package androidx.core.view;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2239 extends C2236 {
    public C2239(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List<Rect> mo4039(int i) {
        return this.f6508.getBoundingRects(AbstractC2224.m4061(i));
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public List<Rect> mo4051(int i) {
        return this.f6508.getBoundingRectsIgnoringVisibility(AbstractC2224.m4061(i));
    }

    public C2239(C2225 c2225, C2239 c2239) {
        super(c2225, c2239);
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4048() {
    }
}
