package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ib0 extends AbstractC0274gu {

    /* JADX INFO: renamed from: f */
    public static boolean f2361f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f2362g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f2363h = true;

    /* JADX INFO: renamed from: i */
    public static boolean f2364i = true;

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: J */
    public void mo1325J(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo1325J(view, i);
        } else if (f2364i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f2364i = false;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void mo1498P(View view, int i, int i2, int i3, int i4) {
        if (f2363h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2363h = false;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo1499Q(View view, Matrix matrix) {
        if (f2361f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2361f = false;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void mo1500R(View view, Matrix matrix) {
        if (f2362g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2362g = false;
            }
        }
    }
}
