package p144;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8302 extends C8301 {
    @Override // p144.C8301
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo13249(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p144.C8301
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final void mo13250(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p144.C8301
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo13251(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p191.AbstractC8568
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo13253(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p191.AbstractC8568
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final float mo13254(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p144.C8301
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final void mo13252(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
