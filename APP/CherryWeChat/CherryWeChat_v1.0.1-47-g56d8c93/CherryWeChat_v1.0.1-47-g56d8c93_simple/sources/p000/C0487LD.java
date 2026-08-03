package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: LD */
/* JADX INFO: loaded from: classes.dex */
public final class C0487LD extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f1600a;

    public C0487LD(Drawable.ConstantState r1) {
        this.f1600a = r1;
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
        C0530MD r0 = new C0530MD();
        r0.f373a = (VectorDrawable) this.f1600a.newDrawable();
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r3) {
        C0530MD r0 = new C0530MD();
        r0.f373a = (VectorDrawable) this.f1600a.newDrawable(r3);
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r3, Resources.Theme r4) {
        C0530MD r0 = new C0530MD();
        r0.f373a = (VectorDrawable) this.f1600a.newDrawable(r3, r4);
        return r0;
    }
}
