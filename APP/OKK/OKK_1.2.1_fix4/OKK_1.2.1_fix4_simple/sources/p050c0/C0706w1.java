package p050c0;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.widget.ImageView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0179j;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0706w1 {

    /* JADX INFO: renamed from: a */
    public static final C0706w1 f2217a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2218b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2219c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f2220d = null;

    /* JADX INFO: renamed from: e */
    public static volatile Method f2221e;

    static {
        f2217a = new C0706w1();
        f2218b = new AtomicBoolean(false);
        f2219c = new AtomicBoolean(false);
        f2220d = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1797a(C0706w1 r4, Object r5, float r6) {
        r4.getClass();
        if (r5 == null) goto L61;
        Class<?> r42 = r5.getClass();     // Catch: Throwable -> L19
    L6:
        if (r42 == null) goto L62;
        if (r42.equals(Object.class) == true) goto L63;
        C0172c r02 = AbstractC0317q.m714c(r42.getDeclaredFields());     // Catch: Throwable -> L19
    L11:
        if (r02.hasNext() == false) goto L36;
        Field r1 = (Field) r02.next();     // Catch: Throwable -> L19
        if (Modifier.isStatic(r1.getModifiers()) == true) goto L11;
        if (AbstractC0307g.m699a(r1.getType(), Float.TYPE) == true) goto L21;
        if (AbstractC0307g.m699a(r1.getType(), Float.class) == false) goto L11;
    L21:
        r1.setAccessible(true);     // Catch: Throwable -> L19
        Object r2 = Float.valueOf(r1.getFloat(r5));     // Catch: Throwable -> L24
    L27:
        if ((r2 instanceof C0140f) == false) goto L29;
        r2 = null;
    L29:
        Float r22 = (Float) r2;     // Catch: Throwable -> L19
        if (r22 == null) goto L11;
        float r23 = r22.floatValue();     // Catch: Throwable -> L19
        if (0.0f > r23) goto L11;
        if (r23 > 1.01f) goto L11;
        r1.setFloat(r5, r6);     // Catch: Throwable -> L19
    L24:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L19
        goto L27
    L36:
        r42 = r42.getSuperclass();     // Catch: Throwable -> L19
        goto L6
    L63:
        return;
    L62:
        return;
    L19:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1798b(C0706w1 r2, String r3, float r4) {
        r2.getClass();
        int r22 = f2220d.incrementAndGet();
        if (r22 > 25) goto L5;
    L6:
        m1804i("APPLY #" + r22 + " " + r3 + " radius=" + r4);
        return;
    L5:
        if ((r22 % 200) == 0) goto L6;
    }

    /* JADX INFO: renamed from: c */
    public static Method m1799c(ClassLoader r13, String r14) {
        int r02 = AbstractC0425j.m1011P0(r14, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1010O0(r14, '(', r02, false, 4);
        String r3 = r14.substring(1, r02 - 1);
        AbstractC0307g.m702d(r3, "substring(...)");
        String r32 = AbstractC0433r.m1032G0(r3, '/', '.');
        String r03 = r14.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "substring(...)");
        String r22 = r14.substring(r2);
        AbstractC0307g.m702d(r22, "substring(...)");
        Class<?> r132 = r13.loadClass(r32);
    L3:
        if (r132 == null) goto L21;
        Method[] r33 = r132.getDeclaredMethods();
        AbstractC0307g.m702d(r33, "getDeclaredMethods(...)");
        int r5 = r33.length;
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L15;
        Method r7 = r33[r6];
        if (AbstractC0307g.m699a(r7.getName(), r03) == false) goto L14;
        StringBuilder r8 = new StringBuilder("(");
        Class<?>[] r9 = r7.getParameterTypes();
        AbstractC0307g.m702d(r9, "getParameterTypes(...)");
        int r10 = r9.length;
        int r11 = 0;
    L9:
        if (r11 >= r10) goto L11;
        Class<?> r12 = r9[r11];
        AbstractC0307g.m700b(r12);
        r8.append(m1803h(r12));
        r11 = r11 + 1;
        goto L9
    L11:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1803h(r92));
        String r82 = r8.toString();
        AbstractC0307g.m702d(r82, "toString(...)");
        if (r82.equals(r22) == false) goto L14;
    L16:
        if (r7 != null) goto L17;
        r132 = r132.getSuperclass();
        goto L3
    L17:
        r7.setAccessible(true);
        return r7;
    L14:
        r6 = r6 + 1;
        goto L5
    L15:
        r7 = null;
        goto L16
    L21:
        throw new NoSuchMethodException(r14);
    }

    /* JADX INFO: renamed from: d */
    public static Class m1800d(ClassLoader r02, String r1) {
        Object r03 = AbstractC0358S.m906r(r02, r1);     // Catch: Throwable -> L4
    L7:
        if ((r03 instanceof C0140f) == false) goto L10;
        r03 = null;
    L10:
        return (Class) r03;
    L4:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1801f(Method r5) {
        if (Modifier.isStatic(r5.getModifiers()) == true) goto L5;
        return false;
    L5:
        Class<?>[] r52 = r5.getParameterTypes();
        if (r52.length == 4) goto L8;
        return false;
    L8:
        if (ImageView.class.isAssignableFrom(r52[0]) == true) goto L10;
        return false;
    L10:
        if (AbstractC0307g.m699a(r52[1], String.class) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(r52[2], Float.TYPE) == true) goto L16;
        if (AbstractC0307g.m699a(r52[2], Float.class) == true) goto L16;
        return false;
    L16:
        if (AbstractC0307g.m699a(r52[3], Boolean.TYPE) == true) goto L20;
        if (AbstractC0307g.m699a(r52[3], Boolean.class) == true) goto L20;
        return false;
    L20:
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static void m1802g(Context r7, String r8) {
        AtomicBoolean r1 = f2219c;
        if (r1.get() == false) goto L54;
        return;
    L54:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L8
        r1.set(true);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        AbstractC0040p.m116u(th);
        if (r8 != null) goto L13;
        return;
    L13:
        if (Process.is64Bit() == false) goto L17;
        String[] r3 = Build.SUPPORTED_64_BIT_ABIS;
        AbstractC0307g.m702d(r3, "SUPPORTED_64_BIT_ABIS");
        String r32 = (String) AbstractC0179j.m536m0(r3);
        if (r32 != null) goto L20;
        r32 = "arm64-v8a";
    L20:
        File r4 = new File(r7.getCacheDir(), AbstractC0324d.m723f("abc_avatar_", r32, "_libdexkit.so"));
        ZipFile r72 = new ZipFile(r8);
        ZipEntry r82 = r72.getEntry("lib/" + r32 + "/libdexkit.so");     // Catch: Throwable -> L33
        if (r82 != null) goto L26;
        AbstractC0040p.m108m(r72, null);
        return;
    L26:
        InputStream r83 = r72.getInputStream(r82);     // Catch: Throwable -> L33
        FileOutputStream r33 = new FileOutputStream(r4);     // Catch: Throwable -> L35
        AbstractC0307g.m700b(r83);     // Catch: Throwable -> L37
        AbstractC0040p.m115t(r83, r33, 8192);     // Catch: Throwable -> L37
        AbstractC0040p.m108m(r33, null);     // Catch: Throwable -> L35
        AbstractC0040p.m108m(r83, null);     // Catch: Throwable -> L33
        AbstractC0040p.m108m(r72, null);
        System.load(r4.getAbsolutePath());
        r1.set(true);
        return;
    L37:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        AbstractC0040p.m108m(r33, th);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        AbstractC0040p.m108m(r83, th);     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L47
    L47:
        th = move-exception;
        AbstractC0040p.m108m(r72, th);
        throw th;
    L17:
        String[] r34 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r34, "SUPPORTED_32_BIT_ABIS");
        r32 = (String) AbstractC0179j.m536m0(r34);
        if (r32 != null) goto L20;
        r32 = "armeabi-v7a";
        goto L20
    }

    /* JADX INFO: renamed from: h */
    public static String m1803h(Class r2) {
        if (r2.isPrimitive() == false) goto L33;
        if (r2.equals(Integer.TYPE) == false) goto L8;
        return "I";
    L8:
        if (r2.equals(Void.TYPE) == false) goto L11;
    L39:
        return "V";
    L11:
        if (r2.equals(Boolean.TYPE) == false) goto L14;
        return "Z";
    L14:
        if (r2.equals(Byte.TYPE) == false) goto L17;
        return "B";
    L17:
        if (r2.equals(Character.TYPE) == false) goto L20;
        return "C";
    L20:
        if (r2.equals(Short.TYPE) == false) goto L23;
        return "S";
    L23:
        if (r2.equals(Long.TYPE) == false) goto L26;
        return "J";
    L26:
        if (r2.equals(Float.TYPE) == false) goto L29;
        return "F";
    L29:
        if (r2.equals(Double.TYPE) == false) goto L39;
        return "D";
    L33:
        if (r2.isArray() == false) goto L37;
        Class<?> r22 = r2.getComponentType();
        AbstractC0307g.m700b(r22);
        return AbstractC0324d.m725h("[", m1803h(r22));
    L37:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r2.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: i */
    public static void m1804i(String r2) {
        AbstractC0762d.m1954d("[OKK-RoundAvatar] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1805e(String r4, Method r5) {
        r5.setAccessible(true);     // Catch: Throwable -> L5
        AbstractC0762d.m1952b(r5, new C0653f(this, r4, 5));     // Catch: Throwable -> L5
        m1804i("hooked ".concat(r4));     // Catch: Throwable -> L5
        Object r42 = Boolean.TRUE;     // Catch: Throwable -> L5
    L7:
        Object r52 = Boolean.FALSE;
        if ((r42 instanceof C0140f) == false) goto L11;
        r42 = r52;
    L11:
        return ((Boolean) r42).booleanValue();
    L5:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L7
    }
}
