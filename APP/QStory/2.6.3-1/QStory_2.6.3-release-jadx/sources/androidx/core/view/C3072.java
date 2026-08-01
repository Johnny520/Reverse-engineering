package androidx.core.view;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3072 extends C3069 {
    public C3072(C3058 c3058, WindowInsets windowInsets) {
        super(c3058, windowInsets);
    }

    @Override // androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List<Rect> mo4599(int i) {
        return this.f6853.getBoundingRects(AbstractC3057.m4621(i));
    }

    @Override // androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public List<Rect> mo4611(int i) {
        return this.f6853.getBoundingRectsIgnoringVisibility(AbstractC3057.m4621(i));
    }

    public C3072(C3058 c3058, C3072 c3072) {
        super(c3058, c3072);
    }

    @Override // androidx.core.view.C3055, androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4608() {
    }
}
