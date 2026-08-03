package Yue;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۤۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C8378 extends C8374 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f24981 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean f24982 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean f24983 = true;

    /* JADX INFO: renamed from: Yue.ۥۢۤۨۥ$ۥ */
    @InterfaceC7113(29)
    public static class C1511 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4361(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4362(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27946(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // Yue.C8374
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo27940(@InterfaceC6391 View view, @InterfaceC6490 Matrix matrix) {
        if (f24981) {
            try {
                C1511.m4361(view, matrix);
            } catch (NoSuchMethodError unused) {
                f24981 = false;
            }
        }
    }

    @Override // Yue.C8374
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo27944(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        if (f24982) {
            try {
                C1511.m4362(view, matrix);
            } catch (NoSuchMethodError unused) {
                f24982 = false;
            }
        }
    }

    @Override // Yue.C8374
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo27945(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        if (f24983) {
            try {
                C1511.m27946(view, matrix);
            } catch (NoSuchMethodError unused) {
                f24983 = false;
            }
        }
    }
}
