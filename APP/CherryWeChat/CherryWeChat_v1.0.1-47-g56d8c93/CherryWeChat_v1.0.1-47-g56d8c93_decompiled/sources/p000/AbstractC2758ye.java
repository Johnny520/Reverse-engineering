package p000;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ye */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2758ye {

    /* JADX INFO: renamed from: a */
    public static final boolean f9387a;

    /* JADX INFO: renamed from: b */
    public static final Method f9388b;

    /* JADX INFO: renamed from: c */
    public static final Field f9389c;

    /* JADX INFO: renamed from: d */
    public static final Field f9390d;

    /* JADX INFO: renamed from: e */
    public static final Field f9391e;

    /* JADX INFO: renamed from: f */
    public static final Field f9392f;

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
            f9388b = method;
            f9389c = field;
            f9390d = field2;
            f9391e = field3;
            f9392f = field4;
            f9387a = true;
            return;
        }
        f9388b = null;
        f9389c = null;
        f9390d = null;
        f9391e = null;
        f9392f = null;
        f9387a = false;
    }
}
