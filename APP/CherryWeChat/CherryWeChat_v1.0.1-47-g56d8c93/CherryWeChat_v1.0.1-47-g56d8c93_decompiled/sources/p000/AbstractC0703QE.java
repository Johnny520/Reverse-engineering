package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: QE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0703QE {
    /* JADX INFO: renamed from: a */
    public static void m1449a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* JADX INFO: renamed from: b */
    public static void m1450b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX INFO: renamed from: c */
    public static void m1451c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
