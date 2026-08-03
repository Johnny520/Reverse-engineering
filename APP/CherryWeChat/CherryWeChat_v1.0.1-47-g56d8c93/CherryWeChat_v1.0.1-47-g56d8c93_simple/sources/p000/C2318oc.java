package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: oc */
/* JADX INFO: loaded from: classes.dex */
public final class C2318oc extends C0935Vq {

    /* JADX INFO: renamed from: r */
    public final RectF f8164r;

    public C2318oc(C0728Qx r1, RectF r2) {
        super(r1);
        this.f8164r = r2;
    }

    @Override // p000.C0935Vq, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2369pc r0 = new C2369pc(this);
        r0.f8335G = this;
        r0.invalidateSelf();
        return r0;
    }

    public C2318oc(C2318oc r1) {
        super(r1);
        this.f8164r = r1.f8164r;
    }
}
