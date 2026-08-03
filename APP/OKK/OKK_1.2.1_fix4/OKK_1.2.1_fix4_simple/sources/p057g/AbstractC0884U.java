package p057g;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: g.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0884U {

    /* JADX INFO: renamed from: a */
    public static final boolean f3150a = false;

    /* JADX INFO: renamed from: b */
    public static final Method f3151b = null;

    /* JADX INFO: renamed from: c */
    public static final Field f3152c = null;

    /* JADX INFO: renamed from: d */
    public static final Field f3153d = null;

    /* JADX INFO: renamed from: e */
    public static final Field f3154e = null;

    /* JADX INFO: renamed from: f */
    public static final Field f3155f = null;

    static {
        Class<?> r3 = Class.forName("android.graphics.Insets");     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
        Method r4 = Drawable.class.getMethod("getOpticalInsets", null);     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
    L37:
        Field r5 = r3.getField("left");     // Catch: NoSuchFieldException -> L14 ClassNotFoundException -> L16 NoSuchMethodException -> L18
        Field r6 = r3.getField("top");     // Catch: NoSuchFieldException -> L10 ClassNotFoundException -> L12 NoSuchMethodException -> L13
        Field r7 = r3.getField("right");     // Catch: Throwable -> L9
        Field r32 = r3.getField("bottom");     // Catch: Throwable -> L28
        boolean r8 = true;
    L24:
        if (r8 == false) goto L26;
        f3151b = r4;
        f3152c = r5;
        f3153d = r6;
        f3154e = r7;
        f3155f = r32;
        f3150a = true;
        return;
    L26:
        f3151b = null;
        f3152c = null;
        f3153d = null;
        f3154e = null;
        f3155f = null;
        f3150a = false;
        return;
    L23:
        r32 = null;
        r8 = false;
    L9:
        r7 = null;
        goto L23
    L12:
        r6 = null;
    L11:
        r7 = r6;
    L10:
        r6 = null;
    L13:
        r6 = null;
        goto L11
    L16:
        r5 = null;
    L17:
        r6 = r5;
    L14:
        r5 = null;
    L15:
        r6 = r5;
    L18:
        r5 = null;
    L19:
        r6 = r5;
    L21:
        r4 = null;
        r5 = null;
    L20:
        r4 = null;
        r5 = null;
    L22:
        r4 = null;
        r5 = null;
        goto L19
    }
}
