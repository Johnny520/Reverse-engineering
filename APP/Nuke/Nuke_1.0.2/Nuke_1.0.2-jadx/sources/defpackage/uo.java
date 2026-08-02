package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uo implements to {
    public final int[] a;
    public final float[] b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uo(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.to
    public void a(View view, float[] fArr) {
        hf1.d(fArr);
        b(view, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            hf1.d(fArr2);
            hf1.f(fArr2, -view.getScrollX(), -view.getScrollY());
            p7.J(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            hf1.d(fArr2);
            hf1.f(fArr2, left, top);
            p7.J(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            hf1.d(fArr2);
            hf1.f(fArr2, -view.getScrollX(), -view.getScrollY());
            p7.J(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            hf1.d(fArr2);
            hf1.f(fArr2, f, f2);
            p7.J(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        ci0.V(matrix, fArr2);
        p7.J(fArr, fArr2);
    }

    public uo(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public uo(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public uo(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
