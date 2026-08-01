package p129;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p234.C8081;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7486 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f20287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20288;

    public /* synthetic */ C7486(Object obj, int i) {
        this.f20288 = i;
        this.f20287 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f20288) {
            case 0:
                return ((Drawable.ConstantState) this.f20287).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f20288) {
            case 0:
                return ((Drawable.ConstantState) this.f20287).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f20288) {
            case 0:
                C7485 c7485 = new C7485(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20287).newDrawable();
                c7485.f20339 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c7485.f20284);
                return c7485;
            default:
                return new C8081(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f20288) {
            case 0:
                C7485 c7485 = new C7485(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20287).newDrawable(resources);
                c7485.f20339 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c7485.f20284);
                return c7485;
            default:
                return new C8081(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f20288) {
            case 0:
                C7485 c7485 = new C7485(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20287).newDrawable(resources, theme);
                c7485.f20339 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c7485.f20284);
                return c7485;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
