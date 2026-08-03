package Yue;

import Yue.InterfaceC7144;
import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C4533 {

    /* JADX INFO: renamed from: ۥ */
    public static final int[] f945 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int[] f946 = new int[0];

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Rect f9687 = new Rect();

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۡۥ$ۥ */
    public static class C0428 {

        /* JADX INFO: renamed from: ۥ */
        public static final boolean f947;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final Method f948;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final Field f9688;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final Field f9689;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final Field f9690;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final Field f9691;

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
                f948 = method;
                f9688 = field;
                f9689 = field2;
                f9690 = field3;
                f9691 = field4;
                f947 = true;
                return;
            }
            f948 = null;
            f9688 = null;
            f9689 = null;
            f9690 = null;
            f9691 = null;
            f947 = false;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public static Rect m1470(@InterfaceC6391 Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f947) {
                try {
                    Object objInvoke = f948.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f9688.getInt(objInvoke), f9689.getInt(objInvoke), f9690.getInt(objInvoke), f9691.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C4533.f9687;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۡۥ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0429 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Insets m1471(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static boolean m1468(@InterfaceC6391 Drawable drawable) {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1469(@InterfaceC6391 Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        m13287(drawable);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m13287(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f945);
        } else {
            drawable.setState(f946);
        }
        drawable.setState(state);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Rect m13288(@InterfaceC6391 Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C0428.m1470(C4520.m13238(drawable));
        }
        Insets insetsM1471 = C0429.m1471(drawable);
        return new Rect(insetsM1471.left, insetsM1471.top, insetsM1471.right, insetsM1471.bottom);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static PorterDuff.Mode m13289(int i, PorterDuff.Mode mode) {
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
