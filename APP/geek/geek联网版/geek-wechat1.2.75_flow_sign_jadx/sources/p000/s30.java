package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class s30 extends u30 {

    /* JADX INFO: renamed from: h */
    public static final RectF f4195h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f4196b;

    /* JADX INFO: renamed from: c */
    public final float f4197c;

    /* JADX INFO: renamed from: d */
    public final float f4198d;

    /* JADX INFO: renamed from: e */
    public final float f4199e;

    /* JADX INFO: renamed from: f */
    public float f4200f;

    /* JADX INFO: renamed from: g */
    public float f4201g;

    public s30(float f, float f2, float f3, float f4) {
        this.f4196b = f;
        this.f4197c = f2;
        this.f4198d = f3;
        this.f4199e = f4;
    }

    @Override // p000.u30
    /* JADX INFO: renamed from: a */
    public final void mo2303a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4624a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f4198d;
        float f2 = this.f4199e;
        RectF rectF = f4195h;
        rectF.set(this.f4196b, this.f4197c, f, f2);
        path.arcTo(rectF, this.f4200f, this.f4201g, false);
        path.transform(matrix);
    }
}
