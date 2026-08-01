package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: af */
/* JADX INFO: loaded from: classes.dex */
public final class C0016af extends C0163du {

    /* JADX INFO: renamed from: q */
    public final RectF f137q;

    public C0016af(f30 f30Var, RectF rectF) {
        super(f30Var);
        this.f137q = rectF;
    }

    @Override // p000.C0163du, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0066bf c0066bf = new C0066bf(this);
        c0066bf.f811x = this;
        c0066bf.invalidateSelf();
        return c0066bf;
    }

    public C0016af(C0016af c0016af) {
        super(c0016af);
        this.f137q = c0016af.f137q;
    }
}
