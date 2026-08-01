package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class m30 extends n30 {

    /* JADX INFO: renamed from: b */
    public float f3130b;

    /* JADX INFO: renamed from: c */
    public float f3131c;

    @Override // p000.n30
    /* JADX INFO: renamed from: a */
    public final void mo1741a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3325a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3130b, this.f3131c);
        path.transform(matrix);
    }
}
