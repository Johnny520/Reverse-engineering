package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class i90 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f2358a;

    public i90(Drawable.ConstantState constantState) {
        this.f2358a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f2358a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2358a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        j90 j90Var = new j90();
        j90Var.f55a = (VectorDrawable) this.f2358a.newDrawable();
        return j90Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        j90 j90Var = new j90();
        j90Var.f55a = (VectorDrawable) this.f2358a.newDrawable(resources);
        return j90Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        j90 j90Var = new j90();
        j90Var.f55a = (VectorDrawable) this.f2358a.newDrawable(resources, theme);
        return j90Var;
    }
}
