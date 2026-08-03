package p043Y;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: Y.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0438D extends C0437C {
    @Override // p043Y.C0437C
    /* JADX INFO: renamed from: A0 */
    public final void mo1037A0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: k0 */
    public final void mo924k0(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p043Y.C0437C, p037U.AbstractC0358S
    /* JADX INFO: renamed from: l0 */
    public final void mo925l0(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // p043Y.C0437C
    /* JADX INFO: renamed from: y0 */
    public final void mo1038y0(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: z */
    public final float mo926z(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p043Y.C0437C
    /* JADX INFO: renamed from: z0 */
    public final void mo1039z0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
