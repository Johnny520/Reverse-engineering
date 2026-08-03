package p089x0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: x0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1133q extends AbstractC1135s {

    /* JADX INFO: renamed from: h */
    public static final RectF f4378h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f4379b;

    /* JADX INFO: renamed from: c */
    public final float f4380c;

    /* JADX INFO: renamed from: d */
    public final float f4381d;

    /* JADX INFO: renamed from: e */
    public final float f4382e;

    /* JADX INFO: renamed from: f */
    public float f4383f;

    /* JADX INFO: renamed from: g */
    public float f4384g;

    public C1133q(float f2, float f3, float f4, float f5) {
        this.f4379b = f2;
        this.f4380c = f3;
        this.f4381d = f4;
        this.f4382e = f5;
    }

    @Override // p089x0.AbstractC1135s
    /* JADX INFO: renamed from: a */
    public final void mo2665a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4387a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f4378h;
        rectF.set(this.f4379b, this.f4380c, this.f4381d, this.f4382e);
        path.arcTo(rectF, this.f4383f, this.f4384g, false);
        path.transform(matrix);
    }
}
