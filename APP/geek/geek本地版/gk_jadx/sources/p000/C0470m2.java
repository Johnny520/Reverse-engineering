package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0470m2 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f3125a;

    public C0470m2(Drawable.ConstantState constantState) {
        this.f3125a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3125a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3125a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0507n2 c0507n2 = new C0507n2(null, 0);
        Drawable drawableNewDrawable = this.f3125a.newDrawable();
        c0507n2.f4819a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0507n2.f3310f);
        return c0507n2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0507n2 c0507n2 = new C0507n2(null, 0);
        Drawable drawableNewDrawable = this.f3125a.newDrawable(resources);
        c0507n2.f4819a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0507n2.f3310f);
        return c0507n2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0507n2 c0507n2 = new C0507n2(null, 0);
        Drawable drawableNewDrawable = this.f3125a.newDrawable(resources, theme);
        c0507n2.f4819a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0507n2.f3310f);
        return c0507n2;
    }
}
