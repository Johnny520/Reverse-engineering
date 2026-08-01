package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class l30 extends n30 {
    public static final RectF h = null;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    static {
        h = new RectF();
    }

    public l30(float r1, float r2, float r3, float r4) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
    }

    @Override // defpackage.n30
    public final void a(Matrix r6, Path r7) {
        Matrix r0 = this.a;
        r6.invert(r0);
        r7.transform(r0);
        float r02 = this.d;
        float r1 = this.e;
        RectF r2 = h;
        r2.set(this.b, this.c, r02, r1);
        r7.arcTo(r2, this.f, this.g, false);
        r7.transform(r6);
    }
}
