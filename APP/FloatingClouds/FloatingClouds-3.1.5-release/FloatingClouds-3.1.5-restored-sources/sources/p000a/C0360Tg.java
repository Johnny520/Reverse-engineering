package p000a;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: a.Tg */
/* JADX INFO: loaded from: classes.dex */
public class C0360Tg extends C0342Sg {

    /* JADX INFO: renamed from: d */
    public static boolean f1359d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f1360e = true;

    /* JADX INFO: renamed from: a.Tg$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m975a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        /* JADX INFO: renamed from: b */
        public static void m976b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        /* JADX INFO: renamed from: c */
        public static void m977c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public void mo973d(View view, Matrix matrix) {
        if (f1359d) {
            try {
                a.m976b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1359d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void mo974e(View view, Matrix matrix) {
        if (f1360e) {
            try {
                a.m977c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1360e = false;
            }
        }
    }
}
