package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class l30 extends n30 {

    /* JADX INFO: renamed from: h */
    public static final RectF f3002h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f3003b;

    /* JADX INFO: renamed from: c */
    public final float f3004c;

    /* JADX INFO: renamed from: d */
    public final float f3005d;

    /* JADX INFO: renamed from: e */
    public final float f3006e;

    /* JADX INFO: renamed from: f */
    public float f3007f;

    /* JADX INFO: renamed from: g */
    public float f3008g;

    public l30(float f, float f2, float f3, float f4) {
        this.f3003b = f;
        this.f3004c = f2;
        this.f3005d = f3;
        this.f3006e = f4;
    }

    @Override // p000.n30
    /* JADX INFO: renamed from: a */
    public final void mo1741a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3325a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f3005d;
        float f2 = this.f3006e;
        RectF rectF = f3002h;
        rectF.set(this.f3003b, this.f3004c, f, f2);
        path.arcTo(rectF, this.f3007f, this.f3008g, false);
        path.transform(matrix);
    }
}
