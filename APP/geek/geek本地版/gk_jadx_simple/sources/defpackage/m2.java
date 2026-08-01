package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public m2(Drawable.ConstantState r1) {
        this.a = r1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        n2 r0 = new n2(null, 0);
        Drawable r1 = this.a.newDrawable();
        r0.a = r1;
        r1.setCallback(r0.f);
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r4) {
        n2 r0 = new n2(null, 0);
        Drawable r42 = this.a.newDrawable(r4);
        r0.a = r42;
        r42.setCallback(r0.f);
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r4, Resources.Theme r5) {
        n2 r0 = new n2(null, 0);
        Drawable r42 = this.a.newDrawable(r4, r5);
        r0.a = r42;
        r42.setCallback(r0.f);
        return r0;
    }
}
