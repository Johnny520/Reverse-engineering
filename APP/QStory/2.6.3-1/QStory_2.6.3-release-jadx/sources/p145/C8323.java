package p145;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8323 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Drawable.ConstantState f20669;

    public C8323(Drawable.ConstantState constantState) {
        this.f20669 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f20669.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f20669.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C8324 c8324 = new C8324();
        c8324.f20679 = (VectorDrawable) this.f20669.newDrawable();
        return c8324;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C8324 c8324 = new C8324();
        c8324.f20679 = (VectorDrawable) this.f20669.newDrawable(resources);
        return c8324;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C8324 c8324 = new C8324();
        c8324.f20679 = (VectorDrawable) this.f20669.newDrawable(resources, theme);
        return c8324;
    }
}
