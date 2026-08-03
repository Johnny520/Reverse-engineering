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
    public final void mo1920f(Canvas r2) {
        if (this.f8335G.f8164r.isEmpty() == false) goto L6;
        super.mo1920f(r2);
        return;
    L6:
        r2.save();
        r2.clipOutRect(this.f8335G.f8164r);
        super.mo1920f(r2);
        r2.restore();
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f8335G = new C2318oc(this.f8335G);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final void m4797t(float r3, float r4, float r5, float r6) {
        RectF r0 = this.f8335G.f8164r;
        if (r3 == r0.left) goto L5;
    L12:
        r0.set(r3, r4, r5, r6);
        invalidateSelf();
        return;
    L5:
        if (r4 != r0.top) goto L12;
        if (r5 != r0.right) goto L12;
        if (r6 != r0.bottom) goto L12;
    }
}
