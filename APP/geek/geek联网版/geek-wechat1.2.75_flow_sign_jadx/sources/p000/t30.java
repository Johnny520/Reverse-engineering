package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class t30 extends u30 {

    /* JADX INFO: renamed from: b */
    public float f4398b;

    /* JADX INFO: renamed from: c */
    public float f4399c;

    @Override // p000.u30
    /* JADX INFO: renamed from: a */
    public final void mo2303a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4624a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f4398b, this.f4399c);
        path.transform(matrix);
    }
}
