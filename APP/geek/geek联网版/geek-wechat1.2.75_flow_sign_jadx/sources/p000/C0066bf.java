package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: bf */
/* JADX INFO: loaded from: classes.dex */
public final class C0066bf extends C0311hu {

    /* JADX INFO: renamed from: q */
    public final RectF f726q;

    public C0066bf(m30 m30Var, RectF rectF) {
        super(m30Var);
        this.f726q = rectF;
    }

    @Override // p000.C0311hu, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0102cf c0102cf = new C0102cf(this);
        c0102cf.f893x = this;
        c0102cf.invalidateSelf();
        return c0102cf;
    }

    public C0066bf(C0066bf c0066bf) {
        super(c0066bf);
        this.f726q = c0066bf.f726q;
    }
}
