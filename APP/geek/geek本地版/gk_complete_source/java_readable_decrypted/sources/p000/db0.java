package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class db0 extends AbstractC0979zt {

    /* JADX INFO: renamed from: e */
    public static boolean f1408e = true;

    /* JADX INFO: renamed from: f */
    public static boolean f1409f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f1410g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f1411h = true;

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: O */
    public void mo933O(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo933O(view, i);
        } else if (f1411h) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f1411h = false;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void mo934T(View view, int i, int i2, int i3, int i4) {
        if (f1410g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f1410g = false;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo935U(View view, Matrix matrix) {
        if (f1408e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1408e = false;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo936V(View view, Matrix matrix) {
        if (f1409f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1409f = false;
            }
        }
    }
}
