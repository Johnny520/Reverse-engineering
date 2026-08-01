package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d90 extends android.graphics.drawable.Drawable.ConstantState {
    public final android.graphics.drawable.Drawable.ConstantState a;

    public d90(android.graphics.drawable.Drawable.ConstantState r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable$ConstantState r0 = r1.a
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable$ConstantState r0 = r1.a
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r2 = this;
            e90 r0 = new e90
            r0.<init>()
            android.graphics.drawable.Drawable$ConstantState r1 = r2.a
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
            r0.a = r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
            r2 = this;
            e90 r0 = new e90
            r0.<init>()
            android.graphics.drawable.Drawable$ConstantState r1 = r2.a
            android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
            android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
            r0.a = r3
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
            r2 = this;
            e90 r0 = new e90
            r0.<init>()
            android.graphics.drawable.Drawable$ConstantState r1 = r2.a
            android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
            android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
            r0.a = r3
            return r0
    }
}
