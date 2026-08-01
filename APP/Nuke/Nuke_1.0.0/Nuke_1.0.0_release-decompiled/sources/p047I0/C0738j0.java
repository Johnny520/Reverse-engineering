package p047I0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: I0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0738j0 implements InterfaceC0732h0 {

    /* JADX INFO: renamed from: a */
    public final Matrix f2316a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final int[] f2317b = new int[2];

    @Override // p047I0.InterfaceC0732h0
    /* JADX INFO: renamed from: a */
    public void mo1229a(View view, float[] fArr) {
        Matrix matrix = this.f2316a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f2317b;
        view.getLocationOnScreen(iArr);
        int i5 = iArr[0];
        int i6 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i5, iArr[1] - i6);
        AbstractC2767z.m4946q(matrix, fArr);
    }
}
