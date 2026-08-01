package p069i;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0662b extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f2233a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0662b(ActionBarContainer actionBarContainer) {
        this.f2233a = actionBarContainer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2233a;
        if (actionBarContainer.f951h) {
            Drawable drawable = actionBarContainer.f950g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f948e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f949f;
        if (drawable3 == null || !actionBarContainer.f952i) {
            return;
        }
        drawable3.draw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f2233a;
        if (actionBarContainer.f951h) {
            if (actionBarContainer.f950g != null) {
                actionBarContainer.f948e.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f948e;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
