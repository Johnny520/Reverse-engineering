package p000;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: eh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0187eh {

    /* JADX INFO: renamed from: a */
    public static final int[] f1774a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f1775b = new int[0];

    static {
        new Rect();
    }

    /* JADX INFO: renamed from: a */
    public static void m1027a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1774a);
        } else {
            drawable.setState(f1775b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m1028b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
