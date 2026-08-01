package p069i;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: i.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0705p0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f2378a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f2379b = new int[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new Rect();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1336a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f2378a);
        } else {
            drawable.setState(f2379b);
        }
        drawable.setState(state);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m1337b(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
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
