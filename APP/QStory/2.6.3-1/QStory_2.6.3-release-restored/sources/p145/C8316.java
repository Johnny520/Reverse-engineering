package p145;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p250.C8911;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8316 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f20627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20628;

    public /* synthetic */ C8316(Object obj, int i) {
        this.f20628 = i;
        this.f20627 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f20628) {
            case 0:
                return ((Drawable.ConstantState) this.f20627).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f20628) {
            case 0:
                return ((Drawable.ConstantState) this.f20627).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f20628) {
            case 0:
                C8315 c8315 = new C8315(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20627).newDrawable();
                c8315.f20679 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c8315.f20624);
                return c8315;
            default:
                return new C8911(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f20628) {
            case 0:
                C8315 c8315 = new C8315(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20627).newDrawable(resources);
                c8315.f20679 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c8315.f20624);
                return c8315;
            default:
                return new C8911(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f20628) {
            case 0:
                C8315 c8315 = new C8315(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f20627).newDrawable(resources, theme);
                c8315.f20679 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c8315.f20624);
                return c8315;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
