package p089x0;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: x0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1134r extends AbstractC1135s {

    /* JADX INFO: renamed from: b */
    public float f4385b;

    /* JADX INFO: renamed from: c */
    public float f4386c;

    @Override // p089x0.AbstractC1135s
    /* JADX INFO: renamed from: a */
    public final void mo2665a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4387a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f4385b, this.f4386c);
        path.transform(matrix);
    }
}
