package p000a;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.x5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912x5 {

    /* JADX INFO: renamed from: a */
    public static final int[] f3515a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f3516b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f3517c = new Rect();

    /* JADX INFO: renamed from: a.x5$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final boolean f3518a;

        /* JADX INFO: renamed from: b */
        public static final Method f3519b;

        /* JADX INFO: renamed from: c */
        public static final Field f3520c;

        /* JADX INFO: renamed from: d */
        public static final Field f3521d;

        /* JADX INFO: renamed from: e */
        public static final Field f3522e;

        /* JADX INFO: renamed from: f */
        public static final Field f3523f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            field4 = null;
                            z = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            }
            if (z) {
                f3519b = method;
                f3520c = field;
                f3521d = field2;
                f3522e = field3;
                f3523f = field4;
                f3518a = true;
                return;
            }
            f3519b = null;
            f3520c = null;
            f3521d = null;
            f3522e = null;
            f3523f = null;
            f3518a = false;
        }
    }

    /* JADX INFO: renamed from: a.x5$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Insets m2201a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2198a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3515a);
        } else {
            drawable.setState(f3516b);
        }
        drawable.setState(state);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Rect m2199b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsM2201a = b.m2201a(drawable);
            return new Rect(insetsM2201a.left, insetsM2201a.top, insetsM2201a.right, insetsM2201a.bottom);
        }
        boolean z = drawable instanceof InterfaceC0886vh;
        Object objM2109a = drawable;
        if (z) {
            objM2109a = ((InterfaceC0886vh) drawable).m2109a();
        }
        if (i >= 29) {
            boolean z2 = a.f3518a;
        } else if (a.f3518a) {
            try {
                Object objInvoke = a.f3519b.invoke(objM2109a, null);
                if (objInvoke != null) {
                    return new Rect(a.f3520c.getInt(objInvoke), a.f3521d.getInt(objInvoke), a.f3522e.getInt(objInvoke), a.f3523f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f3517c;
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m2200c(int i, PorterDuff.Mode mode) {
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
