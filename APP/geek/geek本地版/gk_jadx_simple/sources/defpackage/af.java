package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class af extends du {
    public final RectF q;

    public af(f30 r1, RectF r2) {
        super(r1);
        this.q = r2;
    }

    @Override // defpackage.du, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        bf r0 = new bf(this);
        r0.x = this;
        r0.invalidateSelf();
        return r0;
    }

    public af(af r1) {
        super(r1);
        this.q = r1.q;
    }
}
