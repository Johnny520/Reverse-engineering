package p043Y;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: Y.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0467z {
    /* JADX INFO: renamed from: a */
    public static void m1099a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* JADX INFO: renamed from: b */
    public static void m1100b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX INFO: renamed from: c */
    public static void m1101c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
