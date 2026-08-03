package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2300o0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f8060a;

    public C2300o0(ActionBarContainer actionBarContainer) {
        this.f8060a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f8060a;
        if (actionBarContainer.f3722g) {
            Drawable drawable = actionBarContainer.f3721f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3719d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f3720e;
        if (drawable3 == null || !actionBarContainer.f3723h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f8060a;
        if (actionBarContainer.f3722g) {
            if (actionBarContainer.f3721f != null) {
                actionBarContainer.f3719d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f3719d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
