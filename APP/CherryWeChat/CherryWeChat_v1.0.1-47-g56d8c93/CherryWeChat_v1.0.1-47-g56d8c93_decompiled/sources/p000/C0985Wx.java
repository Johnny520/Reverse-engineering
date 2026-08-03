package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: Wx */
/* JADX INFO: loaded from: classes.dex */
public final class C0985Wx extends AbstractC1071Yx {

    /* JADX INFO: renamed from: h */
    public static final RectF f3094h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f3095b;

    /* JADX INFO: renamed from: c */
    public final float f3096c;

    /* JADX INFO: renamed from: d */
    public final float f3097d;

    /* JADX INFO: renamed from: e */
    public final float f3098e;

    /* JADX INFO: renamed from: f */
    public float f3099f;

    /* JADX INFO: renamed from: g */
    public float f3100g;

    public C0985Wx(float f, float f2, float f3, float f4) {
        this.f3095b = f;
        this.f3096c = f2;
        this.f3097d = f3;
        this.f3098e = f4;
    }

    @Override // p000.AbstractC1071Yx
    /* JADX INFO: renamed from: a */
    public final void mo1862a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3383a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f3097d;
        float f2 = this.f3098e;
        RectF rectF = f3094h;
        rectF.set(this.f3095b, this.f3096c, f, f2);
        path.arcTo(rectF, this.f3099f, this.f3100g, false);
        path.transform(matrix);
    }
}
