package defpackage;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class eh {
    public static final int[] a = null;
    public static final int[] b = null;

    static {
        a = new int[]{R.attr.state_checked};
        b = new int[0];
        new Rect();
    }

    public static void a(Drawable r3) {
        String r0 = r3.getClass().getName();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 29) goto L5;
        return;
    L5:
        if (r1 < 31) goto L7;
        return;
    L7:
        if ("android.graphics.drawable.ColorStateListDrawable".equals(r0) == false) goto L19;
        int[] r02 = r3.getState();
        if (r02 != null) goto L11;
    L14:
        r3.setState(a);
    L15:
        r3.setState(r02);
        return;
    L11:
        if (r02.length == 0) goto L14;
        r3.setState(b);
        goto L15
    }

    public static PorterDuff.Mode b(int r1, PorterDuff.Mode r2) {
        if (r1 == 3) goto L21;
        if (r1 == 5) goto L19;
        if (r1 == 9) goto L17;
        switch(r1) {
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            default: goto L9;
        };
    L9:
        return r2;
    L11:
        return PorterDuff.Mode.ADD;
    L13:
        return PorterDuff.Mode.SCREEN;
    L15:
        return PorterDuff.Mode.MULTIPLY;
    L17:
        return PorterDuff.Mode.SRC_ATOP;
    L19:
        return PorterDuff.Mode.SRC_IN;
    L21:
        return PorterDuff.Mode.SRC_OVER;
    }
}
