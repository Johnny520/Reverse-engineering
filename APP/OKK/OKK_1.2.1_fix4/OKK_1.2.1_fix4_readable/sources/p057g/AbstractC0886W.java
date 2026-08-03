package p057g;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import p087w.AbstractC1115e;
import p087w.InterfaceC1114d;

/* JADX INFO: renamed from: g.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0886W {

    /* JADX INFO: renamed from: a */
    public static final int[] f3156a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f3157b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f3158c = new Rect();

    /* JADX INFO: renamed from: a */
    public static void m2219a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3156a);
        } else {
            drawable.setState(f3157b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Rect m2220b(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Insets insetsM2218a = AbstractC0885V.m2218a(drawable);
            return new Rect(insetsM2218a.left, insetsM2218a.top, insetsM2218a.right, insetsM2218a.bottom);
        }
        boolean z2 = drawable instanceof InterfaceC1114d;
        Object obj = drawable;
        if (z2) {
            ((AbstractC1115e) ((InterfaceC1114d) drawable)).getClass();
            obj = null;
        }
        if (i2 >= 29) {
            boolean z3 = AbstractC0884U.f3150a;
        } else if (AbstractC0884U.f3150a) {
            try {
                Object objInvoke = AbstractC0884U.f3151b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC0884U.f3152c.getInt(objInvoke), AbstractC0884U.f3153d.getInt(objInvoke), AbstractC0884U.f3154e.getInt(objInvoke), AbstractC0884U.f3155f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f3158c;
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m2221c(int i2, PorterDuff.Mode mode) {
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
