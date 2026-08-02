package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: vo */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0817vo implements InterfaceC0741to {

    /* JADX INFO: renamed from: a */
    public final Matrix f12084a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final int[] f12085b = new int[2];

    @Override // p000.InterfaceC0741to
    /* JADX INFO: renamed from: a */
    public void mo5336a(View view, float[] fArr) {
        Matrix matrix = this.f12084a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f12085b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        ci0.m797V(matrix, fArr);
    }
}
