package p128;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7473 extends C7472 {
    @Override // p128.C7472
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo12690(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p128.C7472
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final void mo12691(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p128.C7472
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo12692(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p175.AbstractC7739
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo12694(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p175.AbstractC7739
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final float mo12695(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p128.C7472
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final void mo12693(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
