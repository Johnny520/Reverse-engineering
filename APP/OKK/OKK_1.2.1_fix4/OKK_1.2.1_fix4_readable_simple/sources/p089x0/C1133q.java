package p089x0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: x0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1133q extends AbstractC1135s {

    /* JADX INFO: renamed from: h */
    public static final RectF f4378h = null;

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

    static {
        f4378h = new RectF();
    }

    public C1133q(float r1, float r2, float r3, float r4) {
        this.f4379b = r1;
        this.f4380c = r2;
        this.f4381d = r3;
        this.f4382e = r4;
    }

    @Override // p089x0.AbstractC1135s
    /* JADX INFO: renamed from: a */
    public final void mo2665a(Matrix r6, Path r7) {
        Matrix r02 = this.f4387a;
        r6.invert(r02);
        r7.transform(r02);
        RectF r03 = f4378h;
        r03.set(this.f4379b, this.f4380c, this.f4381d, this.f4382e);
        r7.arcTo(r03, this.f4383f, this.f4384g, false);
        r7.transform(r6);
    }
}
