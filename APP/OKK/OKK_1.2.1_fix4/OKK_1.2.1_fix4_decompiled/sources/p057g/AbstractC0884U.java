package p057g;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: g.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0884U {

    /* JADX INFO: renamed from: a */
    public static final boolean f3150a;

    /* JADX INFO: renamed from: b */
    public static final Method f3151b;

    /* JADX INFO: renamed from: c */
    public static final Field f3152c;

    /* JADX INFO: renamed from: d */
    public static final Field f3153d;

    /* JADX INFO: renamed from: e */
    public static final Field f3154e;

    /* JADX INFO: renamed from: f */
    public static final Field f3155f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z2;
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
                        z2 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field4 = null;
                        z2 = false;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused6) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchFieldException unused7) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchMethodException unused8) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        } catch (NoSuchFieldException unused10) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        } catch (NoSuchMethodException unused11) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        }
        if (z2) {
            f3151b = method;
            f3152c = field;
            f3153d = field2;
            f3154e = field3;
            f3155f = field4;
            f3150a = true;
            return;
        }
        f3151b = null;
        f3152c = null;
        f3153d = null;
        f3154e = null;
        f3155f = null;
        f3150a = false;
    }
}
