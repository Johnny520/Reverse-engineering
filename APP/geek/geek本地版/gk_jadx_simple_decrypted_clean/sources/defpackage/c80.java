package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c80 extends ct {
    public static Class k;
    public static Constructor l;
    public static Method m;
    public static Method n;
    public static boolean o;
    public final Class d;
    public final Constructor e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;

    public c80() {
        Class<?> r0 = null;
        Class<?> r1 = Class.forName("android.graphics.FontFamily");     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Constructor<?> r2 = r1.getConstructor(null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r3 = E(r1);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Class r6 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r4 = r1.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, r6, FontVariationAxis[].class, r6, r6});     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r5 = r1.getMethod("freeze", null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r62 = r1.getMethod("abortCreation", null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r12 = F(r1);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        r0 = r1;
    L9:
        this.d = r0;
        this.e = r2;
        this.f = r3;
        this.g = r4;
        this.h = r5;
        this.i = r62;
        this.j = r12;
        return;
    L7:
        e = move-exception;
        Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
        r12 = null;
        r2 = null;
        r3 = null;
        r4 = null;
        r5 = null;
        r62 = null;
        goto L9
    }

    public static boolean A(Object r1, String r2, int r3, boolean r4) {
        D();
        return ((Boolean) m.invoke(r1, new Object[]{r2, Integer.valueOf(r3), Boolean.valueOf(r4)})).booleanValue();
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static void D() {
        if (o == false) goto L5;
        return;
    L5:
        o = true;
        Constructor<?> r1 = null;
        Class<?> r2 = Class.forName("android.graphics.FontFamily");     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Constructor<?> r3 = r2.getConstructor(null);     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Method r4 = r2.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Method r0 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r2, 1).getClass()});     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        r1 = r3;
    L12:
        l = r1;
        k = r2;
        m = r4;
        n = r0;
        return;
    L8:
        e = move-exception;
        Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
        r0 = null;
        r2 = null;
        r4 = null;
        goto L12
    }

    public static Method E(Class r8) {
        Class r3 = Boolean.TYPE;
        Class r2 = Integer.TYPE;
        return r8.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, r2, r3, r2, r2, r2, FontVariationAxis[].class});
    }

    public Typeface B(Object r5) {
        Object r2 = Array.newInstance(this.d, 1);     // Catch: Throwable -> L5
        Array.set(r2, 0, r5);     // Catch: Throwable -> L5
        return (Typeface) this.j.invoke(null, new Object[]{r2, -1, -1});
    L5:
        return null;
    }

    public final boolean C(Object r3) {
        return ((Boolean) this.h.invoke(r3, null)).booleanValue();
    L4:
        return false;
    }

    public Method F(Class r4) {
        Class<?> r42 = Array.newInstance(r4, 1).getClass();
        Class r1 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r42, r1, r1});
        r43.setAccessible(true);
        return r43;
    }

    @Override // defpackage.ct
    public final Typeface g(Context r10, dl r11, Resources r12, int r13) {
        Method r132 = this.f;
        if (r132 != null) goto L5;
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L5:
        if (r132 != null) goto L60;
        D();
        Object r102 = l.newInstance(null);     // Catch: Throwable -> L50 InstantiationException -> L52 IllegalAccessException -> L54
        el[] r112 = r11.a;
        int r0 = r112.length;
        int r4 = 0;
    L27:
        if (r4 >= r0) goto L41;
        el r5 = r112[r4];
        File r6 = gt.k(r10);
        if (r6 == null) goto L76;
        if (gt.f(r6, r12, r5.f) == false) goto L33;
        if (A(r102, r6.getPath(), r5.b, r5.c) == false) goto L33;
        r6.delete();
        r4 = r4 + 1;
        goto L27
    L38:
        th = move-exception;
        r6.delete();
        throw th;
    L33:
        r6.delete();
        return null;
    L76:
        return null;
    L41:
        D();
        Object r113 = Array.newInstance(k, 1);     // Catch: InvocationTargetException -> L44 Throwable -> L46
        Array.set(r113, 0, r102);     // Catch: InvocationTargetException -> L44 Throwable -> L46
        return (Typeface) n.invoke(null, new Object[]{r113});
    L46:
        e = move-exception;
        throw new RuntimeException(e);
    L50:
        e = move-exception;
        throw new RuntimeException(e);
    L60:
        Object r3 = this.e.newInstance(null);     // Catch: Throwable -> L9
    L10:
        if (r3 == null) goto L21;
        el[] r114 = r11.a;
        int r133 = r114.length;
        int r02 = 0;
    L13:
        if (r02 >= r133) goto L20;
        el r1 = r114[r02];
        String r42 = r1.a;
        int r52 = r1.e;
        int r62 = r1.b;
        boolean r7 = r1.c;
        Context r2 = r10;
        if (z(r2, r3, r42, r52, r62, r7 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(r1.d)) == false) goto L62;
        r02 = r02 + 1;
        r10 = r2;
        goto L13
    L62:
        this.i.invoke(r3, null);     // Catch: Throwable -> L58
        goto L21
    L20:
        if (C(r3) == false) goto L21;
        return B(r3);
    L21:
        return null;
    L9:
        r3 = null;
        goto L10
    }

    @Override // defpackage.ct
    public final Typeface h(Context r13, gl[] r14, int r15) {
        if (r14.length < 1) goto L64;
        Method r0 = this.f;
        if (r0 != null) goto L72;
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L72:
        if (r0 == null) goto L50;
        HashMap r02 = new HashMap();
        int r3 = r14.length;
        int r5 = 0;
    L10:
        if (r5 >= r3) goto L19;
        gl r6 = r14[r5];
        if (r6.e != 0) goto L18;
        Uri r62 = r6.a;
        if (r02.containsKey(r62) == true) goto L18;
        r02.put(r62, gt.o(r13, r62));
    L18:
        r5 = r5 + 1;
        goto L10
    L19:
        Map r132 = Collections.unmodifiableMap(r02);
        Object r03 = this.e.newInstance(null);     // Catch: Throwable -> L22
    L23:
        if (r03 == null) goto L64;
        int r32 = r14.length;
        int r52 = 0;
        boolean r63 = false;
    L26:
        Method r7 = this.i;
        if (r52 >= r32) goto L39;
        gl r8 = r14[r52];
        ByteBuffer r9 = (ByteBuffer) r132.get(r8.a);
        if (r9 == null) goto L38;
        boolean r64 = ((Boolean) this.g.invoke(r03, new Object[]{r9, Integer.valueOf(r8.b), null, Integer.valueOf(r8.c), Integer.valueOf(r8.d ? 1 : 0)})).booleanValue();     // Catch: Throwable -> L34
    L35:
        if (r64 == false) goto L36;
        r63 = true;
        goto L38
    L36:
        r7.invoke(r03, null);     // Catch: Throwable -> L65
    L34:
        r64 = false;
    L38:
        r52 = r52 + 1;     // Catch: Throwable -> L65
        r63 = r63;
        goto L26
    L39:
        if (r63 == true) goto L43;
        r7.invoke(r03, null);     // Catch: Throwable -> L65
        goto L64
    L43:
        if (C(r03) == false) goto L64;
        Typeface r133 = B(r03);
        if (r133 == null) goto L64;
        return Typeface.create(r133, r15);
    L22:
        r03 = null;
        goto L23
    L50:
        gl r142 = l(r15, r14);
        ParcelFileDescriptor r134 = r13.getContentResolver().openFileDescriptor(r142.a, "r", null);
        if (r134 != null) goto L66;
        if (r134 == null) goto L64;
        r134.close();
        return null;
    L66:
        Typeface r143 = new Typeface.Builder(r134.getFileDescriptor()).setWeight(r142.c).setItalic(r142.d).build();     // Catch: Throwable -> L58
        r134.close();     // Catch: Throwable -> L65
        return r143;
    L58:
        th = move-exception;
        r134.close();     // Catch: Throwable -> L61
    L63:
        throw th;     // Catch: Throwable -> L65
    L61:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L65
    L64:
        return null;
    }

    @Override // defpackage.ct
    public final Typeface i(Context r10, Resources r11, int r12, String r13, int r14) {
        Method r0 = this.f;
        if (r0 != null) goto L5;
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L5:
        if (r0 == null) goto L22;
        Object r2 = this.e.newInstance(null);     // Catch: Throwable -> L9
    L10:
        if (r2 != null) goto L13;
    L18:
        return null;
    L13:
        if (z(r10, r2, r13, 0, -1, -1, null) == true) goto L17;
        this.i.invoke(r2, null);     // Catch: Throwable -> L23
        goto L18
    L17:
        if (C(r2) == false) goto L18;
        return B(r2);
    L9:
        r2 = null;
        goto L10
    L22:
        return super.i(r10, r11, r12, r13, r14);
    }

    public final boolean z(Context r11, Object r12, String r13, int r14, int r15, int r16, FontVariationAxis[] r17) {
        return ((Boolean) this.f.invoke(r12, new Object[]{r11.getAssets(), r13, 0, Boolean.FALSE, Integer.valueOf(r14), Integer.valueOf(r15), Integer.valueOf(r16), r17})).booleanValue();
    L5:
        return false;
    }
}
