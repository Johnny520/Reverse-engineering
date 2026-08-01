package p128;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7472 extends C7471 {
    @Override // p128.C7471
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo12663(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p128.C7471
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final void mo12664(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p128.C7471
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo12665(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo9904(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final float mo9908(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p128.C7471
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final void mo12666(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
