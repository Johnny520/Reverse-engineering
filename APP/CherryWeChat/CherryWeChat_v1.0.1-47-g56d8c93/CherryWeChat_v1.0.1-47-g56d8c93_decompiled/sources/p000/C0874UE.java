package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: UE */
/* JADX INFO: loaded from: classes.dex */
public final class C0874UE extends C0831TE {
    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: A */
    public final float mo1251A(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: Q */
    public final void mo1252Q(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.C0831TE, p000.AbstractC0628Oj
    /* JADX INFO: renamed from: R */
    public final void mo1253R(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.C0831TE
    /* JADX INFO: renamed from: Z */
    public final void mo1656Z(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.C0831TE
    /* JADX INFO: renamed from: a0 */
    public final void mo1657a0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.C0831TE
    /* JADX INFO: renamed from: b0 */
    public final void mo1658b0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
