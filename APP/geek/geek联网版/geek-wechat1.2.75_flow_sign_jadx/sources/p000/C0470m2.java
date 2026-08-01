package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0470m2 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f3057a;

    public C0470m2(Drawable.ConstantState constantState) {
        this.f3057a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3057a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3057a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0507n2 c0507n2 = new C0507n2(null, 0);
        Drawable drawableNewDrawable = this.f3057a.newDrawable();
        c0507n2.f55a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0507n2.f3210f);
        return c0507n2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0507n2 c0507n2 = new C0507n2(null, 0);
        Drawable drawableNewDrawable = this.f3057a.newDrawable(resources);
        c0507n2.f55a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0507n2.f3210f);
        return c0507n2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0507n2 c0507n2 = new C0507n2(null, 0);
        Drawable drawableNewDrawable = this.f3057a.newDrawable(resources, theme);
        c0507n2.f55a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0507n2.f3210f);
        return c0507n2;
    }
}
