package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: Wx */
/* JADX INFO: loaded from: classes.dex */
public final class C0985Wx extends AbstractC1071Yx {

    /* JADX INFO: renamed from: h */
    public static final RectF f3094h = null;

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

    static {
        f3094h = new RectF();
    }

    public C0985Wx(float r1, float r2, float r3, float r4) {
        this.f3095b = r1;
        this.f3096c = r2;
        this.f3097d = r3;
        this.f3098e = r4;
    }

    @Override // p000.AbstractC1071Yx
    /* JADX INFO: renamed from: a */
    public final void mo1862a(Matrix r6, Path r7) {
        Matrix r0 = this.f3383a;
        r6.invert(r0);
        r7.transform(r0);
        float r02 = this.f3097d;
        float r1 = this.f3098e;
        RectF r2 = f3094h;
        r2.set(this.f3095b, this.f3096c, r02, r1);
        r7.arcTo(r2, this.f3099f, this.f3100g, false);
        r7.transform(r6);
    }
}
