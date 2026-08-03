package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: oc */
/* JADX INFO: loaded from: classes.dex */
public final class C2318oc extends C0935Vq {

    /* JADX INFO: renamed from: r */
    public final RectF f8164r;

    public C2318oc(C0728Qx c0728Qx, RectF rectF) {
        super(c0728Qx);
        this.f8164r = rectF;
    }

    @Override // p000.C0935Vq, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2369pc c2369pc = new C2369pc(this);
        c2369pc.f8335G = this;
        c2369pc.invalidateSelf();
        return c2369pc;
    }

    public C2318oc(C2318oc c2318oc) {
        super(c2318oc);
        this.f8164r = c2318oc.f8164r;
    }
}
