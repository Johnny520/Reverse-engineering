package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: pc */
/* JADX INFO: loaded from: classes.dex */
public final class C2369pc extends C1021Xq {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f8334H = 0;

    /* JADX INFO: renamed from: G */
    public C2318oc f8335G;

    @Override // p000.C1021Xq
    /* JADX INFO: renamed from: f */
    public final void mo1920f(Canvas canvas) {
        if (this.f8335G.f8164r.isEmpty()) {
            super.mo1920f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f8335G.f8164r);
        super.mo1920f(canvas);
        canvas.restore();
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f8335G = new C2318oc(this.f8335G);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final void m4797t(float f, float f2, float f3, float f4) {
        RectF rectF = this.f8335G.f8164r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
