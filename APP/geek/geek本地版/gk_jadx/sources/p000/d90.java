package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class d90 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f1407a;

    public d90(Drawable.ConstantState constantState) {
        this.f1407a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1407a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1407a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e90 e90Var = new e90();
        e90Var.f4819a = (VectorDrawable) this.f1407a.newDrawable();
        return e90Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e90 e90Var = new e90();
        e90Var.f4819a = (VectorDrawable) this.f1407a.newDrawable(resources);
        return e90Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e90 e90Var = new e90();
        e90Var.f4819a = (VectorDrawable) this.f1407a.newDrawable(resources, theme);
        return e90Var;
    }
}
