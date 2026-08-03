package com.abc.core.features;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670k1 {

    /* JADX INFO: renamed from: a */
    public static final C0670k1 f2084a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2085b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2086c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2087d = null;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2088e = null;

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f2089f = null;

    /* JADX INFO: renamed from: g */
    public static volatile WeakReference f2090g;

    /* JADX INFO: renamed from: h */
    public static volatile Method f2091h;

    static {
        f2084a = new C0670k1();
        f2085b = new AtomicBoolean(false);
        f2086c = new AtomicBoolean(false);
        f2087d = new AtomicBoolean(false);
        f2088e = new AtomicBoolean(false);
        f2089f = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m1679a(View r2) {
        if (r2 == null) goto L18;
        int r02 = 0;
        Object r22 = r2;
    L6:
        if ((r22 instanceof View) == false) goto L14;
        if (r02 >= 20) goto L14;
        if (m1683e(r22) == true) goto L19;
        r02 = r02 + 1;
        r22 = ((View) r22).getParent();
        goto L6
    L19:
        return r22;
    L14:
        return m1681c();
    L18:
        return m1681c();
    }

    /* JADX INFO: renamed from: b */
    public static final int m1680b(Method r3) {
        if (r3.getDeclaringClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == false) goto L5;
        int r02 = 50;
    L6:
        int r1 = r3.getName().length();
        if (r1 != 1) goto L9;
        int r03 = r02 - 30;
    L13:
        String r32 = r3.getName();
        if (r32 == null) goto L33;
        int r12 = r32.hashCode();
        if (r12 == 3055) goto L30;
        if (r12 == 3459) goto L26;
        if (r12 == 3675) goto L23;
        return r03;
    L23:
        if (r32.equals("u0") == true) goto L32;
        return r03;
    L32:
        return r03 - 40;
    L26:
        if (r32.equals("n1") == true) goto L34;
        return r03;
    L34:
        return r03 + 80;
    L30:
        if (r32.equals("a0") == true) goto L32;
        return r03;
    L33:
        return r03;
    L9:
        if (r1 == 2) goto L11;
        r03 = r02 + 10;
        goto L13
    L11:
        r03 = r02 + 5;
        goto L13
    L5:
        r02 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public static Object m1681c() {
        WeakReference r02 = f2090g;
        if (r02 == null) goto L5;
        Object r03 = r02.get();
    L7:
        if ((r03 instanceof View) == true) goto L9;
    L13:
        if (r03 != null) goto L15;
    L17:
        return null;
    L15:
        if (m1683e(r03) == false) goto L17;
        return r03;
    L9:
        if (((View) r03).isAttachedToWindow() == false) goto L13;
        if (m1683e(r03) == false) goto L13;
        return r03;
    L5:
        r03 = null;
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public static Method m1682d(ClassLoader r11, String r12) {
        int r02 = AbstractC0425j.m1011P0(r12, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1010O0(r12, '(', r02, false, 4);
        if (r02 <= 1) goto L27;
        if (r2 <= r02) goto L27;
        String r4 = r12.substring(1, r02 - 1);
        AbstractC0307g.m702d(r4, "substring(...)");
        String r42 = AbstractC0433r.m1032G0(r4, '/', '.');
        String r03 = r12.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "substring(...)");
        String r22 = r12.substring(r2);
        AbstractC0307g.m702d(r22, "substring(...)");
        Class<?> r112 = r11.loadClass(r42);
    L6:
        if (r112 == null) goto L25;
        Method[] r43 = r112.getDeclaredMethods();
        AbstractC0307g.m702d(r43, "getDeclaredMethods(...)");
        int r5 = r43.length;
        int r6 = 0;
    L8:
        if (r6 >= r5) goto L19;
        Method r7 = r43[r6];
        if (AbstractC0307g.m699a(r7.getName(), r03) == false) goto L18;
        StringBuilder r8 = new StringBuilder("(");
        C0172c r9 = AbstractC0317q.m714c(r7.getParameterTypes());
    L13:
        if (r9.hasNext() == false) goto L15;
        Class r10 = (Class) r9.next();
        AbstractC0307g.m700b(r10);
        r8.append(m1690l(r10));
        goto L13
    L15:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1690l(r92));
        String r82 = r8.toString();
        AbstractC0307g.m702d(r82, "toString(...)");
        if (r82.equals(r22) == false) goto L18;
    L20:
        if (r7 != null) goto L21;
        r112 = r112.getSuperclass();
        goto L6
    L21:
        r7.setAccessible(true);
        return r7;
    L18:
        r6 = r6 + 1;
        goto L8
    L19:
        r7 = null;
        goto L20
    L25:
        throw new NoSuchMethodException(r12);
    L27:
        throw new IllegalArgumentException(r12.toString());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1683e(Object r3) {
        if (r3 != null) goto L5;
        return false;
    L5:
        Class<?> r32 = r3.getClass();
    L6:
        if (r32 == null) goto L14;
        if (r32.equals(Object.class) == true) goto L14;
        if (r32.getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == true) goto L11;
        r32 = r32.getSuperclass();
        goto L6
    L11:
        return true;
    L14:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1684f(Method r7) {
        if (Modifier.isStatic(r7.getModifiers()) == false) goto L6;
        return false;
    L6:
        if (AbstractC0307g.m699a(r7.getReturnType(), Void.TYPE) == false) goto L8;
    L10:
        Class<?>[] r02 = r7.getParameterTypes();
        if (r02.length == 2) goto L13;
        return false;
    L13:
        Class<?> r2 = r02[0];
        AbstractC0307g.m702d(r2, "get(...)");
        Class r4 = Boolean.TYPE;
        if (r2.equals(r4) == false) goto L16;
    L17:
        Class<?> r03 = r02[1];
        AbstractC0307g.m702d(r03, "get(...)");
        if (r03.equals(r4) == false) goto L20;
    L23:
        String r04 = r7.getDeclaringClass().getName();
        if (r04.equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == false) goto L26;
    L28:
        String r72 = r7.getName();
        AbstractC0307g.m700b(r72);
        if (AbstractC0433r.m1033H0(r72, "set", false) == true) goto L31;
    L33:
        return true;
    L31:
        if (r72.length() <= 6) goto L33;
        return false;
    L26:
        if (AbstractC0433r.m1033H0(r04, "com.tencent.mm.pluginsdk.ui.chat.", false) == true) goto L28;
        return false;
    L20:
        if (r03.equals(Boolean.class) == true) goto L23;
    L22:
        return false;
    L16:
        if (r2.equals(Boolean.class) == false) goto L22;
    L8:
        if (AbstractC0307g.m699a(r7.getReturnType(), Void.class) == true) goto L10;
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1685g() {
        ConfigStore r02 = ConfigStore.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(ConfigStore.m1661c("quote_delete_clear", false));     // Catch: Throwable -> L4
    L6:
        Object r1 = Boolean.FALSE;
        if ((r03 instanceof C0140f) == false) goto L10;
        r03 = r1;
    L10:
        return ((Boolean) r03).booleanValue();
    L4:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L6
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1686h(View r5, Object r6) {
        boolean r02 = r5 instanceof TextView;
        String r1 = null;
        if (r02 == false) goto L13;
        CharSequence r3 = ((TextView) r5).getText();
        if (r3 == null) goto L7;
        String r32 = r3.toString();
    L8:
        if (r32 == null) goto L13;
        if (r32.length() == 0) goto L13;
        return false;
    L7:
        r32 = null;
    L13:
        if (r6 != null) goto L15;
        r6 = m1681c();
    L15:
        if (r6 == null) goto L36;
        Object r33 = AbstractC0358S.m887g(r6, "getLastText", new Object[0]);     // Catch: Throwable -> L20
        if ((r33 instanceof CharSequence) == false) goto L22;
        Object r34 = (CharSequence) r33;     // Catch: Throwable -> L20
    L25:
        if ((r34 instanceof C0140f) == false) goto L27;
        r34 = null;
    L27:
        CharSequence r35 = (CharSequence) r34;
        if (r35 == null) goto L30;
        r1 = r35.toString();
    L30:
        if (r1 == null) goto L36;
        if (r1.length() == 0) goto L36;
        return false;
    L22:
        r34 = null;
    L20:
        th = move-exception;
        r34 = AbstractC0040p.m116u(th);
    L36:
        if (r02 == false) goto L43;
        CharSequence r52 = ((TextView) r5).getText();
        if (r52 == null) goto L42;
        if (r52.length() == 0) goto L42;
        return false;
    L42:
        return true;
    L43:
        if (r6 != null) goto L45;
        return false;
    L45:
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static void m1687i(Context r8, String r9) {
        Object r02 = C0146l.f339a;
        AtomicBoolean r2 = f2088e;
        if (r2.get() == false) goto L64;
        return;
    L64:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L7
        Object r3 = r02;
    L10:
        if ((!(r3 instanceof C0140f)) == false) goto L13;
        C0146l r32 = (C0146l) r3;
        r2.set(true);
        return;
    L13:
        if (r9 != null) goto L16;
        return;
    L16:
        if (Process.is64Bit() == false) goto L20;
        String[] r33 = Build.SUPPORTED_64_BIT_ABIS;
        AbstractC0307g.m702d(r33, "SUPPORTED_64_BIT_ABIS");
        String r34 = (String) AbstractC0179j.m536m0(r33);
        if (r34 != null) goto L23;
        r34 = "arm64-v8a";
    L23:
        File r4 = new File(r8.getCacheDir(), AbstractC0324d.m723f("abc_", r34, "_libdexkit.so"));
        ZipFile r82 = new ZipFile(r9);     // Catch: Throwable -> L30
        ZipEntry r92 = r82.getEntry("lib/" + r34 + "/libdexkit.so");     // Catch: Throwable -> L39
        if (r92 != null) goto L32;
        AbstractC0040p.m108m(r82, null);     // Catch: Throwable -> L30
        return;
    L32:
        InputStream r93 = r82.getInputStream(r92);     // Catch: Throwable -> L39
        FileOutputStream r35 = new FileOutputStream(r4);     // Catch: Throwable -> L41
        AbstractC0307g.m700b(r93);     // Catch: Throwable -> L43
        AbstractC0040p.m115t(r93, r35, 8192);     // Catch: Throwable -> L43
        AbstractC0040p.m108m(r35, null);     // Catch: Throwable -> L41
        AbstractC0040p.m108m(r93, null);     // Catch: Throwable -> L39
        AbstractC0040p.m108m(r82, null);     // Catch: Throwable -> L30
        System.load(r4.getAbsolutePath());     // Catch: Throwable -> L30
        r2.set(true);     // Catch: Throwable -> L30
    L57:
        Throwable r83 = AbstractC0141g.m465a(r02);
        if (r83 == null) goto L74;
        m1691m("load dexkit native fail: " + r83.getMessage());
        return;
    L74:
        return;
    L43:
        th = move-exception;
        throw th;     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        AbstractC0040p.m108m(r35, th);     // Catch: Throwable -> L41
        throw th;     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        throw th;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        AbstractC0040p.m108m(r93, th);     // Catch: Throwable -> L39
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        throw th;     // Catch: Throwable -> L53
    L53:
        th = move-exception;
        AbstractC0040p.m108m(r82, th);     // Catch: Throwable -> L30
        throw th;     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        r02 = AbstractC0040p.m116u(th);
        goto L57
    L20:
        String[] r36 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r36, "SUPPORTED_32_BIT_ABIS");
        r34 = (String) AbstractC0179j.m536m0(r36);
        if (r34 != null) goto L23;
        r34 = "armeabi-v7a";
    L7:
        th = move-exception;
        r3 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX INFO: renamed from: j */
    public static void m1688j(Class r7) {
        if (f2091h == null) goto L5;
        return;
    L5:
        ArrayList r1 = new ArrayList();
    L6:
        if (r7 == null) goto L17;
        if (r7.equals(Object.class) == true) goto L17;
        C0172c r02 = AbstractC0317q.m714c(r7.getDeclaredMethods());
    L11:
        if (r02.hasNext() == false) goto L15;
        Method r2 = (Method) r02.next();
        AbstractC0307g.m700b(r2);
        if (m1684f(r2) == false) goto L11;
        r1.add(r2);
        goto L11
    L15:
        r7 = r7.getSuperclass();
    L17:
        if (r1.isEmpty() == false) goto L19;
        return;
    L19:
        Iterator r72 = r1.iterator();
        if (r72.hasNext() == true) goto L22;
        Object r73 = null;
    L35:
        Method r74 = (Method) r73;
        if (r74 == null) goto L51;
        r74.setAccessible(true);
        f2091h = r74;
        m1691m("resolved clearQuote by score: " + r74.getName() + " from=" + AbstractC0181l.m546r0(r1, null, null, null, new C0570A(21), 31));
        return;
    L51:
        return;
    L22:
        Object r03 = r72.next();
    L24:
        if (r72.hasNext() == false) goto L34;
        Object r22 = r72.next();
        Method r3 = (Method) r03;
        Method r5 = (Method) r22;
        int r4 = AbstractC0040p.m112q(Integer.valueOf(m1680b(r3)), Integer.valueOf(m1680b(r5)));
        if (r4 != 0) goto L29;
        r4 = AbstractC0040p.m112q(Integer.valueOf(r5.getName().length()), Integer.valueOf(r3.getName().length()));
    L29:
        if (r4 != 0) goto L32;
        r4 = AbstractC0040p.m112q(r3.getName(), r5.getName());
    L32:
        if (r4 >= 0) goto L24;
        r03 = r22;
        goto L24
    L34:
        r73 = r03;
        goto L35
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1689k(Object r10, String r11) {
        if (r10 != null) goto L7;
        r10 = m1681c();
        if (r10 != null) goto L7;
        return false;
    L7:
        Method r3 = f2091h;
        if (r3 != null) goto L10;
        m1688j(r10.getClass());
        r3 = f2091h;
    L10:
        if (r3 != null) goto L53;
        m1691m("clear quote: no method (" + r11 + ")");
        return false;
    L53:
        r3.setAccessible(true);     // Catch: Throwable -> L41
        boolean[][] r02 = {new boolean[]{false, true}, new boolean[]{true, true}, new boolean[]{false, false}};     // Catch: Throwable -> L41
        int r5 = 0;
        Throwable r6 = null;
    L15:
        if (r5 >= 3) goto L44;
        boolean[] r7 = r02[r5];     // Catch: Throwable -> L41
        r3.invoke(r10, new Object[]{Boolean.valueOf(r7[0]), Boolean.valueOf(r7[1])});     // Catch: Throwable -> L19
        Object r8 = Boolean.TRUE;     // Catch: Throwable -> L19
    L21:
        Throwable r9 = AbstractC0141g.m465a(r8);     // Catch: Throwable -> L41
        if (r9 == null) goto L26;
        r8 = Boolean.FALSE;     // Catch: Throwable -> L41
        r6 = r9;
    L26:
        if (((Boolean) r8).booleanValue() == true) goto L28;
        r5 = r5 + 1;     // Catch: Throwable -> L41
        goto L15
    L28:
        if ((r10 instanceof View) == false) goto L39;
        View r102 = (View) r10;     // Catch: Throwable -> L41
        int r03 = 0;
    L31:
        if (r102 == null) goto L39;
        if (r03 >= 5) goto L39;
        r102.requestLayout();     // Catch: Throwable -> L41
        r102.invalidate();     // Catch: Throwable -> L41
        Object r103 = r102.getParent();     // Catch: Throwable -> L41
        if ((r103 instanceof View) == false) goto L37;
        r102 = (View) r103;     // Catch: Throwable -> L41
    L38:
        r03 = r03 + 1;     // Catch: Throwable -> L41
        goto L31
    L37:
        r102 = null;
    L39:
        m1691m("clear quote ok via " + r11 + " method=" + r3.getName() + " args=" + r7[0] + "," + r7[1]);     // Catch: Throwable -> L41
        return true;
    L19:
        th = move-exception;
        r8 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L41
        goto L21
    L44:
        if (r6 == null) goto L46;
        throw r6;     // Catch: Throwable -> L41
    L46:
        throw new IllegalStateException("clear quote invoke failed");     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        Object r104 = AbstractC0040p.m116u(th);
        Throwable r112 = AbstractC0141g.m465a(r104);
        if (r112 == null) goto L52;
        m1691m("clear quote fail: " + r112.getMessage());
        r104 = Boolean.FALSE;
    L52:
        return ((Boolean) r104).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public static String m1690l(Class r2) {
        if (r2.isPrimitive() == false) goto L31;
        if (r2.equals(Boolean.TYPE) == false) goto L8;
        return "Z";
    L8:
        if (r2.equals(Byte.TYPE) == false) goto L11;
        return "B";
    L11:
        if (r2.equals(Character.TYPE) == false) goto L14;
        return "C";
    L14:
        if (r2.equals(Short.TYPE) == false) goto L17;
        return "S";
    L17:
        if (r2.equals(Integer.TYPE) == false) goto L20;
        return "I";
    L20:
        if (r2.equals(Long.TYPE) == false) goto L23;
        return "J";
    L23:
        if (r2.equals(Float.TYPE) == false) goto L26;
        return "F";
    L26:
        if (r2.equals(Double.TYPE) == false) goto L28;
        return "D";
    L28:
        r2.equals(Void.TYPE);
        return "V";
    L31:
        if (r2.isArray() == false) goto L35;
        Class<?> r22 = r2.getComponentType();
        AbstractC0307g.m700b(r22);
        return AbstractC0324d.m725h("[", m1690l(r22));
    L35:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r2.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: m */
    public static void m1691m(String r2) {
        AbstractC0762d.m1954d("[OKK-QuoteDelClear] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
