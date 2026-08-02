package p000;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: uo */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0780uo implements InterfaceC0741to {

    /* JADX INFO: renamed from: a */
    public final int[] f11383a;

    /* JADX INFO: renamed from: b */
    public final float[] f11384b;

    public C0780uo(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f11383a = new int[size];
        this.f11384b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f11383a[i] = ((Integer) arrayList.get(i)).intValue();
            this.f11384b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // p000.InterfaceC0741to
    /* JADX INFO: renamed from: a */
    public void mo5336a(View view, float[] fArr) {
        hf1.m2158d(fArr);
        m5521b(view, fArr);
    }

    /* JADX INFO: renamed from: b */
    public void m5521b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.f11384b;
        if (z) {
            m5521b((View) parent, fArr);
            hf1.m2158d(fArr2);
            hf1.m2160f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC0570p7.m3754J(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            hf1.m2158d(fArr2);
            hf1.m2160f(fArr2, left, top);
            AbstractC0570p7.m3754J(fArr, fArr2);
        } else {
            int[] iArr = this.f11383a;
            view.getLocationInWindow(iArr);
            hf1.m2158d(fArr2);
            hf1.m2160f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC0570p7.m3754J(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            hf1.m2158d(fArr2);
            hf1.m2160f(fArr2, f, f2);
            AbstractC0570p7.m3754J(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        ci0.m797V(matrix, fArr2);
        AbstractC0570p7.m3754J(fArr, fArr2);
    }

    public C0780uo(int i, int i2) {
        this.f11383a = new int[]{i, i2};
        this.f11384b = new float[]{0.0f, 1.0f};
    }

    public C0780uo(int i, int i2, int i3) {
        this.f11383a = new int[]{i, i2, i3};
        this.f11384b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0780uo(float[] fArr) {
        this.f11384b = fArr;
        this.f11383a = new int[2];
    }
}
