package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: LD */
/* JADX INFO: loaded from: classes.dex */
public final class C0487LD extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f1600a;

    public C0487LD(Drawable.ConstantState constantState) {
        this.f1600a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1600a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1600a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0530MD c0530md = new C0530MD();
        c0530md.f373a = (VectorDrawable) this.f1600a.newDrawable();
        return c0530md;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0530MD c0530md = new C0530MD();
        c0530md.f373a = (VectorDrawable) this.f1600a.newDrawable(resources);
        return c0530md;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0530MD c0530md = new C0530MD();
        c0530md.f373a = (VectorDrawable) this.f1600a.newDrawable(resources, theme);
        return c0530md;
    }
}
