package p129;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7494 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Drawable.ConstantState f20324;

    public C7494(Drawable.ConstantState constantState) {
        this.f20324 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f20324.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f20324.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C7495 c7495 = new C7495();
        c7495.f20334 = (VectorDrawable) this.f20324.newDrawable();
        return c7495;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C7495 c7495 = new C7495();
        c7495.f20334 = (VectorDrawable) this.f20324.newDrawable(resources);
        return c7495;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C7495 c7495 = new C7495();
        c7495.f20334 = (VectorDrawable) this.f20324.newDrawable(resources, theme);
        return c7495;
    }
}
