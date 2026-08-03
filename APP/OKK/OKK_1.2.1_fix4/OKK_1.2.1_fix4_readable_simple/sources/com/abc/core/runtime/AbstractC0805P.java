package com.abc.core.runtime;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p000A.C0011l;
import p002B.AbstractC0053c;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.AbstractC0093c;
import p010F.AbstractC0196a;
import p018J0.C0234d;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p065k.AbstractFutureC0975g;
import p065k.C0971c;
import p065k.C0974f;
import p072n0.C1008c;
import p079r0.C1065a;
import p082t.AbstractC1081b;
import p083u.AbstractC1084c;
import p083u.AbstractC1091j;
import p083u.AbstractC1094m;
import p083u.C1087f;
import p083u.C1092k;
import p083u.C1093l;
import p085v.AbstractC1100a;
import p085v.C1105f;
import p089x0.C1120d;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1125i;
import p089x0.C1137u;

/* JADX INFO: renamed from: f0.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0805P {

    /* JADX INFO: renamed from: a */
    public static volatile String f2920a;

    public AbstractC0805P() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: C */
    public static File m2030C(Context r5) {
        File r52 = r5.getCacheDir();
        if (r52 != null) goto L5;
        return null;
    L5:
        String r1 = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int r2 = 0;
    L7:
        if (r2 >= 100) goto L13;
        File r3 = new File(r52, r1 + r2);
        if (r3.createNewFile() == false) goto L12;
        return r3;
    L12:
        r2 = r2 + 1;
        goto L7
    L13:
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m2031E(Context r1) {
        if (r1.getResources().getConfiguration().fontScale < 1.3f) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m2032F(String r1, String r2) {
        if (r1.startsWith(r2.concat("(")) == true) goto L5;
    L7:
        return false;
    L5:
        if (r1.endsWith(")") == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static int m2033I(int r1, int r2, float r3) {
        return AbstractC1100a.m2593b(AbstractC1100a.m2595d(r2, Math.round(Color.alpha(r2) * r3)), r1);
    }

    /* JADX INFO: renamed from: J */
    public static Typeface m2034J(Configuration r2, Typeface r3) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return null;
    L5:
        if (AbstractC0093c.m324a(r2) != Integer.MAX_VALUE) goto L7;
        return null;
    L7:
        if (AbstractC0093c.m324a(r2) == 0) goto L14;
        if (r3 == null) goto L15;
        int r02 = AbstractC0053c.m170a(r3);
        return AbstractC0053c.m174e(r3, m2043f(AbstractC0093c.m324a(r2) + r02, 1, 1000), r3.isItalic());
    L15:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static MappedByteBuffer m2035K(Context r8, Uri r9) {
        ParcelFileDescriptor r82 = r8.getContentResolver().openFileDescriptor(r9, "r", null);     // Catch: IOException -> L26
        if (r82 != null) goto L29;
        if (r82 == null) goto L7;
        r82.close();     // Catch: IOException -> L26
    L7:
        return null;
    L29:
        FileInputStream r92 = new FileInputStream(r82.getFileDescriptor());     // Catch: Throwable -> L13
        FileChannel r2 = r92.getChannel();     // Catch: Throwable -> L15
        long r6 = r2.size();     // Catch: Throwable -> L15
        MappedByteBuffer r1 = r2.map(FileChannel.MapMode.READ_ONLY, 0, r6);     // Catch: Throwable -> L15
        r92.close();     // Catch: Throwable -> L13
        r82.close();     // Catch: IOException -> L26
        return r1;
    L15:
        th = move-exception;
        r92.close();     // Catch: Throwable -> L18
    L20:
        throw th;     // Catch: Throwable -> L13
    L18:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r82.close();     // Catch: Throwable -> L23
    L25:
        throw th;     // Catch: IOException -> L26
    L23:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L26
    L26:
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static void m2036L(InputConnection r02, EditorInfo r1, View r2) {
        if (r02 != null) goto L4;
        return;
    L4:
        if (r1.hintText != null) goto L11;
        ViewParent r03 = r2.getParent();
    L7:
        if ((r03 instanceof View) == false) goto L12;
        r03 = r03.getParent();
        goto L7
    L12:
        return;
    }

    /* JADX INFO: renamed from: Q */
    public static TypedValue m2037Q(Context r2, int r3) {
        TypedValue r02 = new TypedValue();
        if (r2.getTheme().resolveAttribute(r3, r02, true) == false) goto L5;
        return r02;
    L5:
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static int m2038R(Context r1, int r2, int r3) {
        TypedValue r12 = m2037Q(r1, r2);
        if (r12 != null) goto L5;
        return r3;
    L5:
        if (r12.type == 16) goto L7;
        return r3;
    L7:
        return r12.data;
    }

    /* JADX INFO: renamed from: S */
    public static TimeInterpolator m2039S(Context r18, int r19, Interpolator r20) {
        TypedValue r02 = new TypedValue();
        if (r18.getTheme().resolveAttribute(r19, r02, true) == true) goto L6;
        return r20;
    L6:
        if (r02.type != 3) goto L103;
        String r1 = String.valueOf(r02.string);
        if (m2032F(r1, "cubic-bezier") == true) goto L15;
        if (m2032F(r1, "path") == true) goto L15;
        return AnimationUtils.loadInterpolator(r18, r02.resourceId);
    L15:
        if (m2032F(r1, "cubic-bezier") == false) goto L22;
        String[] r03 = r1.substring(13, r1.length() - 1).split(",");
        if (r03.length != 4) goto L20;
        return AbstractC0196a.m567b(m2053w(r03, 0), m2053w(r03, 1), m2053w(r03, 2), m2053w(r03, 3));
    L20:
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + r03.length);
    L22:
        if (m2032F(r1, "path") == false) goto L101;
        String r12 = r1.substring(5, r1.length() - 1);
        Path r04 = new Path();
        ArrayList r2 = new ArrayList();
        int r3 = 0;
        int r6 = 0;
        int r5 = 1;
    L25:
        if (r5 >= r12.length()) goto L88;
    L27:
        if (r5 >= r12.length()) goto L36;
        char r7 = r12.charAt(r5);
        if (((r7 - 'Z') * (r7 - 'A')) > 0) goto L31;
    L32:
        if (r7 == 'e') goto L35;
        if (r7 != 'E') goto L36;
    L35:
        r5 = r5 + 1;
        goto L27
    L31:
        if (((r7 - 'z') * (r7 - 'a')) > 0) goto L35;
    L36:
        String r62 = r12.substring(r6, r5).trim();
        if (r62.isEmpty() == true) goto L86;
        if (r62.charAt(r3) != 'z') goto L41;
    L84:
        float[] r4 = new float[r3];
    L85:
        r2.add(new C1105f(r62.charAt(r3), r4));
        goto L86
    L41:
        if (r62.charAt(r3) == 'Z') goto L84;
        float[] r72 = new float[r62.length()];     // Catch: NumberFormatException -> L68
        int r10 = r62.length();     // Catch: NumberFormatException -> L68
        int r122 = r3;
        int r11 = 1;
    L44:
        if (r11 >= r10) goto L74;
        int r14 = r3;
        int r15 = r14;
        int r16 = r15;
        int r17 = r16;
        int r13 = r11;
    L47:
        if (r13 >= r62.length()) goto L66;
        char r42 = r62.charAt(r13);     // Catch: NumberFormatException -> L68
        if (r42 == ' ') goto L62;
        if (r42 == 'E') goto L61;
        if (r42 == 'e') goto L61;
        switch(r42) {
            case 44: goto L62;
            case 45: goto L57;
            case 46: goto L54;
            default: goto L60;
        };     // Catch: NumberFormatException -> L68
    L54:
        if (r15 != 0) goto L56;
        r14 = 0;
        r15 = 1;
    L63:
        if (r16 != 0) goto L66;
        r13 = r13 + 1;     // Catch: NumberFormatException -> L68
    L56:
        r14 = 0;
        r16 = 1;
        r17 = 1;
        goto L63
    L57:
        if (r13 == r11) goto L60;
        if (r14 == 0) goto L56;
    L60:
        r14 = 0;
    L61:
        r14 = 1;
    L62:
        r14 = 0;
        r16 = 1;
    L66:
        if (r11 >= r13) goto L70;
        r72[r122] = Float.parseFloat(r62.substring(r11, r13));     // Catch: NumberFormatException -> L68
        r122 = r122 + 1;     // Catch: NumberFormatException -> L68
    L70:
        if (r17 == 0) goto L73;
        r11 = r13;
    L72:
        r3 = 0;
        goto L44
    L73:
        r11 = r13 + 1;     // Catch: NumberFormatException -> L68
        goto L72
    L74:
        if (r122 < 0) goto L81;
        int r32 = r72.length;     // Catch: NumberFormatException -> L68
        if (r32 < 0) goto L79;
        r4 = new float[r122];     // Catch: NumberFormatException -> L68
        System.arraycopy(r72, 0, r4, 0, Math.min(r122, r32));     // Catch: NumberFormatException -> L68
        r3 = 0;
        goto L85
    L79:
        throw new ArrayIndexOutOfBoundsException();     // Catch: NumberFormatException -> L68
    L81:
        throw new IllegalArgumentException();     // Catch: NumberFormatException -> L68
    L68:
        e = move-exception;
        throw new RuntimeException(AbstractC0324d.m723f("error in parsing \"", r62, "\""), e);
    L86:
        r6 = r5;
        r5 = r5 + 1;
        r3 = 0;
        goto L25
    L88:
        if ((r5 - r6) == 1) goto L90;
    L92:
        int r43 = 0;
    L104:
        C1105f.m2603b((C1105f[]) r2.toArray(new C1105f[r43]), r04);     // Catch: RuntimeException -> L97
        return AbstractC0196a.m568c(r04);
    L97:
        e = move-exception;
        throw new RuntimeException("Error in parsing ".concat(r12), e);
    L90:
        if (r6 >= r12.length()) goto L92;
        r43 = 0;
        r2.add(new C1105f(r12.charAt(r6), new float[0]));
        goto L104
    L101:
        throw new IllegalArgumentException("Invalid motion easing type: ".concat(r1));
    L103:
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    /* JADX INFO: renamed from: T */
    public static TypedValue m2040T(Context r1, int r2, String r3) {
        TypedValue r02 = m2037Q(r1, r2);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{r3, r1.getResources().getResourceName(r2)}));
    }

    /* JADX INFO: renamed from: U */
    public static void m2041U(String r02) {
        f2920a = r02;
    }

    /* JADX INFO: renamed from: V */
    public static void m2042V(View r3, C1123g r4) {
        C1065a r02 = r4.f4312a.f4291b;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f4085a == false) goto L16;
        ViewParent r32 = r3.getParent();
        float r03 = 0.0f;
    L8:
        if ((r32 instanceof View) == false) goto L10;
        Field r2 = AbstractC0080Q.f219a;
        r03 = r03 + AbstractC0070G.m219i((View) r32);
        r32 = r32.getParent();
        goto L8
    L10:
        C1122f r33 = r4.f4312a;
        if (r33.f4302m == r03) goto L17;
        r33.f4302m = r03;
        r4.m2654n();
        return;
    L17:
        return;
    }

    /* JADX INFO: renamed from: f */
    public static int m2043f(int r02, int r1, int r2) {
        if (r02 >= r1) goto L4;
        return r1;
    L4:
        if (r02 <= r2) goto L6;
        return r2;
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: g */
    public static void m2044g(Closeable r02) {
        if (r02 == null) goto L8;
        r02.close();     // Catch: IOException -> L5
        return;
    L9:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: h */
    public static boolean m2045h(File r4, Resources r5, int r6) {
        InputStream r52 = r5.openRawResource(r6);     // Catch: Throwable -> L29
        StrictMode.ThreadPolicy r62 = StrictMode.allowThreadDiskWrites();     // Catch: Throwable -> L27
        boolean r02 = false;
        ?? r1 = 0;
        FileOutputStream r12 = null;
        FileOutputStream r2 = new FileOutputStream(r4, false);     // Catch: Throwable -> L18 IOException -> L20
        byte[] r42 = new byte[1024];     // Catch: Throwable -> L12 IOException -> L14
    L8:
        int r13 = r52.read(r42);     // Catch: Throwable -> L12 IOException -> L14
        if (r13 == (-1)) goto L16;
        r2.write(r42, 0, r13);     // Catch: Throwable -> L12 IOException -> L14
        goto L8
    L16:
        m2044g(r2);     // Catch: Throwable -> L27
        StrictMode.setThreadPolicy(r62);     // Catch: Throwable -> L27
        r02 = true;
        r1 = r13;
    L23:
        m2044g(r52);
        return r02;
    L14:
        e = e;
        r12 = r2;
    L21:
        e.getMessage();     // Catch: Throwable -> L18
        m2044g(r12);     // Catch: Throwable -> L27
        StrictMode.setThreadPolicy(r62);     // Catch: Throwable -> L27
        r1 = r12;
    L12:
        th = th;
        r1 = r2;
    L25:
        m2044g(r1);     // Catch: Throwable -> L27
        StrictMode.setThreadPolicy(r62);     // Catch: Throwable -> L27
        throw th;     // Catch: Throwable -> L27
    L18:
        th = th;
    L20:
        e = e;
    L27:
        th = th;
    L31:
        m2044g(r52);
        throw th;
    L29:
        th = th;
        r52 = null;
        goto L31
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC0805P m2046i(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return new C1125i();
    L8:
        return new C1120d();
    L10:
        return new C1125i();
    }

    /* JADX INFO: renamed from: n */
    public static int m2047n(Context r1, int r2, int r3) {
        TypedValue r22 = m2037Q(r1, r2);
        if (r22 == null) goto L9;
        int r02 = r22.resourceId;
        if (r02 == 0) goto L7;
        int r12 = AbstractC1081b.m2562a(r1, r02);
    L8:
        Integer r13 = Integer.valueOf(r12);
    L10:
        if (r13 != null) goto L12;
        return r3;
    L12:
        return r13.intValue();
    L7:
        r12 = r22.data;
        goto L8
    L9:
        r13 = null;
        goto L10
    }

    /* JADX INFO: renamed from: o */
    public static int m2048o(View r2, int r3) {
        Context r02 = r2.getContext();
        TypedValue r22 = m2040T(r2.getContext(), r3, r2.getClass().getCanonicalName());
        int r32 = r22.resourceId;
        if (r32 == 0) goto L6;
        return AbstractC1081b.m2562a(r02, r32);
    L6:
        return r22.data;
    }

    /* JADX INFO: renamed from: p */
    public static ColorStateList m2049p(Context r8, int r9) {
        Resources r02 = r8.getResources();
        Resources.Theme r82 = r8.getTheme();
        C1093l r1 = new C1093l(r02, r82);
        Object r2 = AbstractC1094m.f4212c;
        monitor-enter(r2);
        SparseArray r3 = (SparseArray) AbstractC1094m.f4211b.get(r1);     // Catch: Throwable -> L16
        ColorStateList r4 = null;
        if (r3 != null) goto L7;
    L25:
        monitor-exit(r2);     // Catch: Throwable -> L16
        ColorStateList r32 = null;
    L27:
        if (r32 != null) goto L63;
        ThreadLocal r22 = AbstractC1094m.f4210a;
        TypedValue r33 = (TypedValue) r22.get();
        if (r33 != null) goto L32;
        r33 = new TypedValue();
        r22.set(r33);
    L32:
        r02.getValue(r9, r33, true);
        int r23 = r33.type;
        if (r23 < 28) goto L57;
        if (r23 > 31) goto L57;
    L39:
        if (r4 == null) goto L53;
        Object r24 = AbstractC1094m.f4212c;
        monitor-enter(r24);
        WeakHashMap r03 = AbstractC1094m.f4211b;     // Catch: Throwable -> L45
        SparseArray r34 = (SparseArray) r03.get(r1);     // Catch: Throwable -> L45
        if (r34 != null) goto L47;
        r34 = new SparseArray();     // Catch: Throwable -> L45
        r03.put(r1, r34);     // Catch: Throwable -> L45
    L47:
        r34.append(r9, new C1092k(r4, r1.f4208a.getConfiguration(), r82));     // Catch: Throwable -> L45
        monitor-exit(r24);     // Catch: Throwable -> L45
        return r4;
    L45:
        th = move-exception;
        throw th;
    L53:
        return AbstractC1091j.m2582b(r02, r9, r82);
    L57:
        r4 = AbstractC1084c.m2577a(r02, r02.getXml(r9), r82);     // Catch: Exception -> L56
        goto L39
    L63:
        return r32;
    L7:
        if (r3.size() <= 0) goto L25;
        C1092k r5 = (C1092k) r3.get(r9);     // Catch: Throwable -> L16
        if (r5 == null) goto L25;
        if (r5.f4206b.equals(r02.getConfiguration()) == false) goto L24;
        if (r82 == null) goto L14;
    L18:
        if (r82 == null) goto L24;
        if (r5.f4207c != r82.hashCode()) goto L24;
    L21:
        r32 = r5.f4205a;     // Catch: Throwable -> L16
        monitor-exit(r2);     // Catch: Throwable -> L16
        goto L27
    L14:
        if (r5.f4207c == 0) goto L21;
    L24:
        r3.remove(r9);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: q */
    public static ColorStateList m2050q(Context r2, C0234d r3, int r4) {
        TypedArray r02 = (TypedArray) r3.f475c;
        if (r02.hasValue(r4) == false) goto L10;
        int r03 = r02.getResourceId(r4, 0);
        if (r03 == 0) goto L10;
        ColorStateList r22 = m2049p(r2, r03);
        if (r22 == null) goto L10;
        return r22;
    L10:
        return r3.m645h(r4);
    }

    /* JADX INFO: renamed from: r */
    public static ColorStateList m2051r(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r02 = r2.getResourceId(r3, 0);
        if (r02 == 0) goto L10;
        ColorStateList r12 = m2049p(r1, r02);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r2.getColorStateList(r3);
    }

    /* JADX INFO: renamed from: t */
    public static Drawable m2052t(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r02 = r2.getResourceId(r3, 0);
        if (r02 == 0) goto L10;
        Drawable r12 = AbstractC0358S.m916w(r1, r02);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r2.getDrawable(r3);
    }

    /* JADX INFO: renamed from: w */
    public static float m2053w(String[] r2, int r3) {
        float r22 = Float.parseFloat(r2[r3]);
        if (r22 < 0.0f) goto L8;
        if (r22 > 1.0f) goto L8;
        return r22;
    L8:
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + r22);
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo2054A(CoordinatorLayout r1);

    /* JADX INFO: renamed from: B */
    public abstract int mo2055B();

    /* JADX INFO: renamed from: D */
    public abstract boolean mo2056D(float r1);

    /* JADX INFO: renamed from: G */
    public abstract boolean mo2057G(View r1);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo2058H(float r1, float r2);

    /* JADX INFO: renamed from: M */
    public abstract void mo2059M(int r1);

    /* JADX INFO: renamed from: N */
    public abstract void mo2060N(Typeface r1, boolean r2);

    /* JADX INFO: renamed from: O */
    public abstract void mo2061O(C0974f r1, C0974f r2);

    /* JADX INFO: renamed from: P */
    public abstract void mo2062P(C0974f r1, Thread r2);

    /* JADX INFO: renamed from: W */
    public abstract boolean mo2063W(View r1, float r2);

    /* JADX INFO: renamed from: X */
    public abstract void mo2064X(ViewGroup.MarginLayoutParams r1, int r2, int r3);

    /* JADX INFO: renamed from: a */
    public abstract int mo2065a(ViewGroup.MarginLayoutParams r1);

    /* JADX INFO: renamed from: b */
    public abstract float mo2066b(int r1);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2067c(AbstractFutureC0975g r1, C0971c r2);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2068d(AbstractFutureC0975g r1, Object r2, Object r3);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2069e(AbstractFutureC0975g r1, C0974f r2, C0974f r3);

    /* JADX INFO: renamed from: j */
    public abstract Typeface mo2070j(Context r1, C1087f r2, Resources r3, int r4);

    /* JADX INFO: renamed from: k */
    public abstract Typeface mo2071k(Context r1, C0011l[] r2, int r3);

    /* JADX INFO: renamed from: l */
    public Typeface mo2072l(Context r1, Resources r2, int r3, String r4, int r5) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
            	at java.base/java.util.Objects.checkIndex(Unknown Source)
            	at java.base/java.util.ArrayList.get(Unknown Source)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:368)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:330)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:293)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*
            this = this;
            java.io.File r1 = m2030C(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = m2045h(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.abc.core.runtime.AbstractC0805P.mo2072l(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }

    /* JADX INFO: renamed from: m */
    public C0011l mo2073m(int r12, C0011l[] r13) {
        C1008c r02 = new C1008c();
        if ((r12 & 1) != 0) goto L5;
        int r1 = 400;
    L7:
        if ((r12 & 2) == 0) goto L9;
        boolean r122 = true;
    L10:
        int r4 = r13.length;
        C0011l r5 = null;
        int r6 = Integer.MAX_VALUE;
        int r7 = 0;
    L11:
        if (r7 >= r4) goto L21;
        C0011l r8 = r13[r7];
        int r9 = Math.abs(r02.m2438a(r8) - r1) * 2;
        if (r02.m2439b(r8) != r122) goto L15;
        int r10 = 0;
    L16:
        int r92 = r9 + r10;
        if (r5 == null) goto L19;
        if (r6 > r92) goto L19;
    L20:
        r7 = r7 + 1;
    L19:
        r5 = r8;
        r6 = r92;
        goto L20
    L15:
        r10 = 1;
        goto L16
    L21:
        return r5;
    L9:
        r122 = false;
        goto L10
    L5:
        r1 = 700;
        goto L7
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo2074s(C1137u r1, float r2, float r3);

    /* JADX INFO: renamed from: u */
    public abstract int mo2075u();

    /* JADX INFO: renamed from: v */
    public abstract int mo2076v();

    /* JADX INFO: renamed from: x */
    public abstract int mo2077x();

    /* JADX INFO: renamed from: y */
    public abstract int mo2078y();

    /* JADX INFO: renamed from: z */
    public abstract int mo2079z(View r1);
}
