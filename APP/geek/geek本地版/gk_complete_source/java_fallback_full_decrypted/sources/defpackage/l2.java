package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends android.graphics.drawable.Drawable.ConstantState {
    public defpackage.e90 a;
    public android.animation.AnimatorSet b;
    public java.util.ArrayList c;
    public defpackage.n6 d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No constant state support for SDK < 24."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "No constant state support for SDK < 24."
            r2.<init>(r0)
            throw r2
    }
}
