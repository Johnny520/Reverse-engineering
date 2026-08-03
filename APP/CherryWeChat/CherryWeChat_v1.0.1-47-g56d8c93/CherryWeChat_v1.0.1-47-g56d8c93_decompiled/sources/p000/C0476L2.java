package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: L2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0476L2 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1571a;

    /* JADX INFO: renamed from: b */
    public final Object f1572b;

    public /* synthetic */ C0476L2(int i, Object obj) {
        this.f1571a = i;
        this.f1572b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f1571a) {
            case 0:
                return ((Drawable.ConstantState) this.f1572b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f1571a) {
            case 0:
                return ((Drawable.ConstantState) this.f1572b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f1571a) {
            case 0:
                C0519M2 c0519m2 = new C0519M2(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1572b).newDrawable();
                c0519m2.f373a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0519m2.f1696f);
                return c0519m2;
            default:
                return new C0026Aj(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f1571a) {
            case 0:
                C0519M2 c0519m2 = new C0519M2(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1572b).newDrawable(resources);
                c0519m2.f373a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0519m2.f1696f);
                return c0519m2;
            default:
                return new C0026Aj(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f1571a) {
            case 0:
                C0519M2 c0519m2 = new C0519M2(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1572b).newDrawable(resources, theme);
                c0519m2.f373a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0519m2.f1696f);
                return c0519m2;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
