package p047I0;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import p211o0.AbstractC2767z;
import p211o0.C2730E;

/* JADX INFO: renamed from: I0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0735i0 implements InterfaceC0732h0 {

    /* JADX INFO: renamed from: a */
    public final int[] f2312a;

    /* JADX INFO: renamed from: b */
    public final float[] f2313b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0735i0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f2312a = new int[size];
        this.f2313b = new float[size];
        for (int i5 = 0; i5 < size; i5++) {
            this.f2312a[i5] = ((Integer) arrayList.get(i5)).intValue();
            this.f2313b[i5] = ((Float) arrayList2.get(i5)).floatValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.InterfaceC0732h0
    /* JADX INFO: renamed from: a */
    public void mo1229a(View view, float[] fArr) {
        C2730E.m4785d(fArr);
        m1231b(view, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m1231b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z5 = parent instanceof View;
        float[] fArr2 = this.f2313b;
        if (z5) {
            m1231b((View) parent, fArr);
            C2730E.m4785d(fArr2);
            C2730E.m4787f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC0681L.m1193o(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C2730E.m4785d(fArr2);
            C2730E.m4787f(fArr2, left, top);
            AbstractC0681L.m1193o(fArr, fArr2);
        } else {
            int[] iArr = this.f2312a;
            view.getLocationInWindow(iArr);
            C2730E.m4785d(fArr2);
            C2730E.m4787f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC0681L.m1193o(fArr, fArr2);
            float f2 = iArr[0];
            float f5 = iArr[1];
            C2730E.m4785d(fArr2);
            C2730E.m4787f(fArr2, f2, f5);
            AbstractC0681L.m1193o(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC2767z.m4946q(matrix, fArr2);
        AbstractC0681L.m1193o(fArr, fArr2);
    }

    public C0735i0(int i5, int i6) {
        this.f2312a = new int[]{i5, i6};
        this.f2313b = new float[]{0.0f, 1.0f};
    }

    public C0735i0(int i5, int i6, int i7) {
        this.f2312a = new int[]{i5, i6, i7};
        this.f2313b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0735i0(float[] fArr) {
        this.f2313b = fArr;
        this.f2312a = new int[2];
    }
}
