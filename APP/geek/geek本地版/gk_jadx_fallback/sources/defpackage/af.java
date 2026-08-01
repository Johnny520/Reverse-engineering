package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class af extends defpackage.du {
    public final android.graphics.RectF q;

    public af(defpackage.af r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.RectF r1 = r1.q
            r0.q = r1
            return
    }

    public af(defpackage.f30 r1, android.graphics.RectF r2) {
            r0 = this;
            r0.<init>(r1)
            r0.q = r2
            return
    }

    @Override // defpackage.du, android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            bf r0 = new bf
            r0.<init>(r1)
            r0.x = r1
            r0.invalidateSelf()
            return r0
    }
}
