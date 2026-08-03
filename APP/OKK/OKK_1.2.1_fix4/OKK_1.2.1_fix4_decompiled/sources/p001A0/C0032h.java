package p001A0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p089x0.C1122f;
import p089x0.C1127k;

/* JADX INFO: renamed from: A0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0032h extends C1122f {

    /* JADX INFO: renamed from: v */
    public final RectF f84v;

    public C0032h(C1127k c1127k, RectF rectF) {
        super(c1127k);
        this.f84v = rectF;
    }

    @Override // p089x0.C1122f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0033i c0033i = new C0033i(this);
        c0033i.invalidateSelf();
        return c0033i;
    }

    public C0032h(C0032h c0032h) {
        super(c0032h);
        this.f84v = c0032h.f84v;
    }
}
