package Yue;

import android.graphics.Matrix;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class C6133 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Matrix m2629(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f, f2, f3);
        return matrix;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Matrix m2630(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return m2629(f, f2, f3);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Matrix m18851(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Matrix m18852(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return m18851(f, f2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Matrix m18853(@InterfaceC6399 Matrix matrix, @InterfaceC6399 Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Matrix m18854(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f, f2);
        return matrix;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Matrix m18855(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m18854(f, f2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final float[] m18856(@InterfaceC6399 Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
