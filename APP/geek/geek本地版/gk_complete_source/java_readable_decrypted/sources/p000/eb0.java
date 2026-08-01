package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class eb0 extends db0 {
    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: N */
    public final void mo1007N(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.db0, p000.AbstractC0979zt
    /* JADX INFO: renamed from: O */
    public final void mo933O(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: T */
    public final void mo934T(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: U */
    public final void mo935U(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: V */
    public final void mo936V(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: x */
    public final float mo1008x(View view) {
        return view.getTransitionAlpha();
    }
}
