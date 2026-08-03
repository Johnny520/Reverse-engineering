package p357y1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import p071f1.AbstractC0996c0;

/* JADX INFO: renamed from: y1.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5947w0 implements InterfaceC5943v0 {

    /* JADX INFO: renamed from: g */
    public final Matrix f24173g = new Matrix();

    /* JADX INFO: renamed from: h */
    public final int[] f24174h = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5943v0
    /* JADX INFO: renamed from: h */
    public void mo7026h(View view, float[] fArr) {
        Matrix matrix = this.f24173g;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f24174h;
        view.getLocationOnScreen(iArr);
        int i9 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i9, iArr[1] - i10);
        AbstractC0996c0.m2520q(matrix, fArr);
    }
}
