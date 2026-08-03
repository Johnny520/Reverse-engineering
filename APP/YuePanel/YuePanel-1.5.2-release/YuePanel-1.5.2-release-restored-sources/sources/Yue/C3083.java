package Yue;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3083 extends Drawable {

    /* JADX INFO: renamed from: ۥ */
    public final ActionBarContainer f65;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۧ$ۥ */
    @InterfaceC7113(21)
    public static class C0043 {
        /* JADX INFO: renamed from: ۥ */
        public static void m169(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C3083(ActionBarContainer actionBarContainer) {
        this.f65 = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f65;
        if (actionBarContainer.f26115) {
            Drawable drawable = actionBarContainer.f26114;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f26112;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f65;
        Drawable drawable3 = actionBarContainer2.f26113;
        if (drawable3 == null || !actionBarContainer2.f26116) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC7113(21)
    public void getOutline(@InterfaceC6391 Outline outline) {
        ActionBarContainer actionBarContainer = this.f65;
        if (actionBarContainer.f26115) {
            if (actionBarContainer.f26114 != null) {
                C0043.m169(actionBarContainer.f26112, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f26112;
            if (drawable != null) {
                C0043.m169(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
