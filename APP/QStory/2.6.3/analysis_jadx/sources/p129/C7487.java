package p129;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p234.C8082;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7487 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f20282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20283;

    public /* synthetic */ C7487(Object obj, int i) {
        this.f20283 = i;
        this.f20282 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f20283) {
            case 0:
                return ((Drawable.ConstantState) this.f20282).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f20283) {
            case 0:
                return ((Drawable.ConstantState) this.f20282).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f20283) {
            case 0:
                C7486 c7486 = new C7486(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20282).newDrawable();
                c7486.f20334 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c7486.f20279);
                return c7486;
            default:
                return new C8082(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f20283) {
            case 0:
                C7486 c7486 = new C7486(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20282).newDrawable(resources);
                c7486.f20334 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c7486.f20279);
                return c7486;
            default:
                return new C8082(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f20283) {
            case 0:
                C7486 c7486 = new C7486(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20282).newDrawable(resources, theme);
                c7486.f20334 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c7486.f20279);
                return c7486;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
