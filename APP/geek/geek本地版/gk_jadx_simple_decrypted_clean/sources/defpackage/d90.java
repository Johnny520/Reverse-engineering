package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class d90 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public d90(Drawable.ConstantState r1) {
        this.a = r1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e90 r0 = new e90();
        r0.a = (VectorDrawable) this.a.newDrawable();
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r3) {
        e90 r0 = new e90();
        r0.a = (VectorDrawable) this.a.newDrawable(r3);
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r3, Resources.Theme r4) {
        e90 r0 = new e90();
        r0.a = (VectorDrawable) this.a.newDrawable(r3, r4);
        return r0;
    }
}
