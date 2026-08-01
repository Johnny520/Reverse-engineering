package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 extends ib0 {
    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: I */
    public final void mo1324I(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.ib0, p000.AbstractC0274gu
    /* JADX INFO: renamed from: J */
    public final void mo1325J(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.ib0
    /* JADX INFO: renamed from: P */
    public final void mo1498P(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.ib0
    /* JADX INFO: renamed from: Q */
    public final void mo1499Q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.ib0
    /* JADX INFO: renamed from: R */
    public final void mo1500R(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: u */
    public final float mo1337u(View view) {
        return view.getTransitionAlpha();
    }
}
