package p179m2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import p265s1.AbstractC7117o0;

/* JADX INFO: renamed from: m2.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4835e1 implements InterfaceC4820b1 {

    /* JADX INFO: renamed from: a */
    public final Matrix f14383a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final int[] f14384b = new int[2];

    @Override // p179m2.InterfaceC4820b1
    /* JADX INFO: renamed from: a */
    public void mo19295a(View view, float[] fArr) {
        this.f14383a.reset();
        view.transformMatrixToGlobal(this.f14383a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f14384b);
        int[] iArr = this.f14384b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f14384b;
        this.f14383a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        AbstractC7117o0.m28051b(fArr, this.f14383a);
    }
}
