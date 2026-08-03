package p000;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: Ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107Ce {

    /* JADX INFO: renamed from: a */
    public static final int[] f250a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f251b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f252c = new Rect();

    /* JADX INFO: renamed from: a */
    public static void m159a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f250a);
        } else {
            drawable.setState(f251b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Rect m160b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsM5373a = AbstractC2801ze.m5373a(drawable);
            return new Rect(insetsM5373a.left, insetsM5373a.top, insetsM5373a.right, insetsM5373a.bottom);
        }
        boolean z = drawable instanceof InterfaceC0704QF;
        Object obj = drawable;
        if (z) {
            ((AbstractC0746RF) ((InterfaceC0704QF) drawable)).getClass();
            obj = null;
        }
        if (i >= 29) {
            boolean z2 = AbstractC2758ye.f9387a;
        } else if (AbstractC2758ye.f9387a) {
            try {
                Object objInvoke = AbstractC2758ye.f9388b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC2758ye.f9389c.getInt(objInvoke), AbstractC2758ye.f9390d.getInt(objInvoke), AbstractC2758ye.f9391e.getInt(objInvoke), AbstractC2758ye.f9392f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f252c;
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m161c(int i, PorterDuff.Mode mode) {
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
