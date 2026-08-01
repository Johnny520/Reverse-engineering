package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends android.graphics.drawable.Drawable.ConstantState {
    public final android.graphics.drawable.Drawable.ConstantState a;

    public m2(android.graphics.drawable.Drawable.ConstantState r1) {
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
    public final int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable$ConstantState r0 = r1.a
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r3 = this;
            n2 r0 = new n2
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            android.graphics.drawable.Drawable$ConstantState r1 = r3.a
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            r0.a = r1
            k2 r2 = r0.f
            r1.setCallback(r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r4) {
            r3 = this;
            n2 r0 = new n2
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            android.graphics.drawable.Drawable$ConstantState r1 = r3.a
            android.graphics.drawable.Drawable r4 = r1.newDrawable(r4)
            r0.a = r4
            k2 r1 = r0.f
            r4.setCallback(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r4, android.content.res.Resources.Theme r5) {
            r3 = this;
            n2 r0 = new n2
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            android.graphics.drawable.Drawable$ConstantState r1 = r3.a
            android.graphics.drawable.Drawable r4 = r1.newDrawable(r4, r5)
            r0.a = r4
            k2 r5 = r0.f
            r4.setCallback(r5)
            return r0
    }
}
