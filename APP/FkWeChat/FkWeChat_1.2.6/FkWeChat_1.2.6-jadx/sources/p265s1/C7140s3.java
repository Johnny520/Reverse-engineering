package p265s1;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: renamed from: s1.s3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7140s3 {

    /* JADX INFO: renamed from: a */
    public Matrix f23672a;

    /* JADX INFO: renamed from: b */
    public Shader f23673b;

    /* JADX INFO: renamed from: a */
    public final Shader m28212a() {
        return this.f23673b;
    }

    /* JADX INFO: renamed from: b */
    public final Matrix m28213b() {
        Matrix matrix = this.f23672a;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.f23672a = matrix2;
        return matrix2;
    }

    /* JADX INFO: renamed from: c */
    public final void m28214c(Shader shader) {
        Matrix matrix = this.f23672a;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.f23673b = shader;
    }

    /* JADX INFO: renamed from: d */
    public final void m28215d(float[] fArr) {
        Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.f23672a = null;
        } else {
            Matrix matrixM28213b = m28213b();
            AbstractC7117o0.m28050a(matrixM28213b, fArr);
            matrix = matrixM28213b;
        }
        Shader shader = this.f23673b;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }
}
