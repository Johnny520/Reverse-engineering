package p050c0;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0668k {

    /* JADX INFO: renamed from: a */
    public static final C0668k f2076a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2077b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2078c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2079d = null;

    static {
        f2076a = new C0668k();
        f2077b = new AtomicBoolean(false);
        f2078c = new AtomicBoolean(false);
        f2079d = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static Method m1668a(ClassLoader r13, String r14) {
        int r02 = AbstractC0425j.m1011P0(r14, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1010O0(r14, '(', r02, false, 4);
        if (r02 <= 1) goto L26;
        if (r2 <= r02) goto L26;
        String r4 = r14.substring(1, r02 - 1);
        AbstractC0307g.m702d(r4, "substring(...)");
        String r42 = AbstractC0433r.m1032G0(r4, '/', '.');
        String r03 = r14.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "substring(...)");
        String r22 = r14.substring(r2);
        AbstractC0307g.m702d(r22, "substring(...)");
        Class<?> r132 = r13.loadClass(r42);
    L6:
        if (r132 == null) goto L24;
        Method[] r43 = r132.getDeclaredMethods();
        AbstractC0307g.m702d(r43, "getDeclaredMethods(...)");
        int r5 = r43.length;
        int r6 = 0;
    L8:
        if (r6 >= r5) goto L18;
        Method r7 = r43[r6];
        if (AbstractC0307g.m699a(r7.getName(), r03) == false) goto L17;
        StringBuilder r8 = new StringBuilder("(");
        Class<?>[] r9 = r7.getParameterTypes();
        AbstractC0307g.m702d(r9, "getParameterTypes(...)");
        int r10 = r9.length;
        int r11 = 0;
    L12:
        if (r11 >= r10) goto L14;
        Class<?> r12 = r9[r11];
        AbstractC0307g.m700b(r12);
        r8.append(m1674j(r12));
        r11 = r11 + 1;
        goto L12
    L14:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1674j(r92));
        String r82 = r8.toString();
        AbstractC0307g.m702d(r82, "toString(...)");
        if (r82.equals(r22) == false) goto L17;
    L19:
        if (r7 != null) goto L20;
        r132 = r132.getSuperclass();
        goto L6
    L20:
        r7.setAccessible(true);
        return r7;
    L17:
        r6 = r6 + 1;
        goto L8
    L18:
        r7 = null;
        goto L19
    L24:
        throw new NoSuchMethodException(r14);
    L26:
        throw new IllegalArgumentException(r14.toString());
    }

    /* JADX INFO: renamed from: b */
    public static Method m1669b(Class r10) {
        Method[] r02 = r10.getMethods();
        AbstractC0307g.m702d(r02, "getMethods(...)");
        int r1 = r02.length;
        int r3 = 0;
    L3:
        Method r5 = null;
        if (r3 >= r1) goto L13;
        Method r8 = r02[r3];
        if (AbstractC0307g.m699a(r8.getName(), "parseFrom") == false) goto L12;
        if (r8.getParameterTypes().length != 1) goto L12;
        if (AbstractC0307g.m699a(r8.getParameterTypes()[0], byte[].class) == false) goto L12;
    L14:
        if (r8 != null) goto L37;
        Method[] r102 = r10.getDeclaredMethods();
        AbstractC0307g.m702d(r102, "getDeclaredMethods(...)");
        int r03 = r102.length;
        int r12 = 0;
    L16:
        if (r12 >= r03) goto L26;
        Method r32 = r102[r12];
        if (AbstractC0307g.m699a(r32.getName(), "parseFrom") == false) goto L24;
        if (r32.getParameterTypes().length != 1) goto L24;
        if (AbstractC0307g.m699a(r32.getParameterTypes()[0], byte[].class) == false) goto L24;
        r5 = r32;
    L24:
        r12 = r12 + 1;
    L26:
        return r5;
    L37:
        return r8;
    L12:
        r3 = r3 + 1;
        goto L3
    L13:
        r8 = null;
        goto L14
    }

    /* JADX INFO: renamed from: c */
    public static Method m1670c(Class r10) {
        Method[] r02 = r10.getMethods();
        AbstractC0307g.m702d(r02, "getMethods(...)");
        int r1 = r02.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        Method r4 = null;
        if (r3 >= r1) goto L13;
        Method r8 = r02[r3];
        if (AbstractC0307g.m699a(r8.getName(), "toByteArray") == false) goto L12;
        Class<?>[] r9 = r8.getParameterTypes();
        AbstractC0307g.m702d(r9, "getParameterTypes(...)");
        if (r9.length != 0) goto L12;
        if (AbstractC0307g.m699a(r8.getReturnType(), byte[].class) == false) goto L12;
    L14:
        if (r8 != null) goto L37;
        Method[] r102 = r10.getDeclaredMethods();
        AbstractC0307g.m702d(r102, "getDeclaredMethods(...)");
        int r03 = r102.length;
    L16:
        if (r2 >= r03) goto L26;
        Method r12 = r102[r2];
        if (AbstractC0307g.m699a(r12.getName(), "toByteArray") == false) goto L24;
        Class<?>[] r32 = r12.getParameterTypes();
        AbstractC0307g.m702d(r32, "getParameterTypes(...)");
        if (r32.length != 0) goto L24;
        if (AbstractC0307g.m699a(r12.getReturnType(), byte[].class) == false) goto L24;
        r4 = r12;
    L24:
        r2 = r2 + 1;
    L26:
        return r4;
    L37:
        return r8;
    L12:
        r3 = r3 + 1;
        goto L3
    L13:
        r8 = null;
        goto L14
    }

    /* JADX INFO: renamed from: f */
    public static int m1671f(DexKitBridge r4, ClassLoader r5, List r6, String r7, InterfaceC0286l r8) {
        int r02 = 0;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L5
        r1.searchPackages(new String[]{"com.tencent.mm.plugin.sns.storage"});     // Catch: Throwable -> L5
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L5
        String[] r62 = (String[]) r6.toArray(new String[0]);     // Catch: Throwable -> L5
        r2.usingStrings((String[]) Arrays.copyOf(r62, r62.length));     // Catch: Throwable -> L5
        r1.matcher(r2);     // Catch: Throwable -> L5
        Object r42 = r4.findMethod(r1);     // Catch: Throwable -> L5
    L8:
        if ((r42 instanceof C0140f) == false) goto L10;
        r42 = null;
    L10:
        List r43 = (List) r42;
        if (r43 != null) goto L14;
        r43 = C0190u.f401a;
    L14:
        if (r43.isEmpty() == false) goto L17;
        m1675k("DexKit missed ".concat(r7));
        return 0;
    L17:
        Iterator r44 = r43.iterator();
    L19:
        if (r44.hasNext() == false) goto L33;
        Object r63 = m1668a(r5, ((MethodData) r44.next()).getDescriptor());     // Catch: Throwable -> L23
    L26:
        if ((r63 instanceof C0140f) == false) goto L28;
        r63 = null;
    L28:
        Method r64 = (Method) r63;
        if (r64 == null) goto L19;
        if (((Boolean) r8.invoke(r64)).booleanValue() == false) goto L19;
        r02 = r02 + 1;
    L23:
        th = move-exception;
        r63 = AbstractC0040p.m116u(th);
        goto L26
    L33:
        return r02;
    L5:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1672g(String r4, Method r5) {
        r5.setAccessible(true);     // Catch: Throwable -> L5
        AbstractC0762d.m1952b(r5, new C0665j(0, false));     // Catch: Throwable -> L5
        m1675k("hooked rawQuery via " + r4);     // Catch: Throwable -> L5
        Object r52 = Boolean.TRUE;     // Catch: Throwable -> L5
    L7:
        Throwable r02 = AbstractC0141g.m465a(r52);
        if (r02 == null) goto L10;
        m1675k("hook rawQuery failed " + r4 + ": " + r02.getMessage());
    L10:
        Boolean r42 = Boolean.FALSE;
        if ((r52 instanceof C0140f) == false) goto L14;
        r52 = r42;
    L14:
        return ((Boolean) r52).booleanValue();
    L5:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: i */
    public static void m1673i(Context r7, String r8) {
        AtomicBoolean r1 = f2078c;
        if (r1.get() == false) goto L58;
        return;
    L58:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L7
        Object r2 = C0146l.f339a;     // Catch: Throwable -> L7
    L10:
        if ((!(r2 instanceof C0140f)) == false) goto L13;
        C0146l r22 = (C0146l) r2;
        r1.set(true);
        m1675k("DexKit native loaded via library path");
        return;
    L13:
        if (r8 == null) goto L53;
        if (Process.is64Bit() == false) goto L19;
        String[] r23 = Build.SUPPORTED_64_BIT_ABIS;
        AbstractC0307g.m702d(r23, "SUPPORTED_64_BIT_ABIS");
        String r24 = (String) AbstractC0179j.m536m0(r23);
        if (r24 != null) goto L22;
        r24 = "arm64-v8a";
    L22:
        File r3 = new File(r7.getCacheDir(), AbstractC0324d.m723f("abc_moments_", r24, "_libdexkit.so"));
        ZipFile r72 = new ZipFile(r8);
        ZipEntry r82 = r72.getEntry("lib/" + r24 + "/libdexkit.so");     // Catch: Throwable -> L33
        if (r82 == null) goto L47;
        InputStream r83 = r72.getInputStream(r82);     // Catch: Throwable -> L33
        FileOutputStream r02 = new FileOutputStream(r3);     // Catch: Throwable -> L35
        AbstractC0307g.m700b(r83);     // Catch: Throwable -> L37
        AbstractC0040p.m115t(r83, r02, 8192);     // Catch: Throwable -> L37
    L29:
        AbstractC0040p.m108m(r02, null);     // Catch: Throwable -> L35
        AbstractC0040p.m108m(r83, null);     // Catch: Throwable -> L33
        AbstractC0040p.m108m(r72, null);
        System.load(r3.getAbsolutePath());
        r1.set(true);
        m1675k("DexKit native loaded from module apk");
        return;
    L37:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        AbstractC0040p.m108m(r02, th);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        AbstractC0040p.m108m(r83, th);     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L47:
        throw new IllegalStateException("lib/" + r24 + "/libdexkit.so not found in module apk");     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        AbstractC0040p.m108m(r72, th);
        throw th;
    L19:
        String[] r25 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r25, "SUPPORTED_32_BIT_ABIS");
        r24 = (String) AbstractC0179j.m536m0(r25);
        if (r24 != null) goto L22;
        r24 = "armeabi-v7a";
        goto L22
    L53:
        throw new IllegalStateException("module path unavailable for libdexkit.so");
    L7:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX INFO: renamed from: j */
    public static String m1674j(Class r2) {
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
        return AbstractC0324d.m725h("[", m1674j(r22));
    L37:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r2.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: k */
    public static void m1675k(String r2) {
        AbstractC0762d.m1954d("[OKK-AntiMoments] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1676d(String r4, Method r5) {
        r5.setAccessible(true);     // Catch: Throwable -> L5
        AbstractC0762d.m1952b(r5, new C0662i(this, r4, 0));     // Catch: Throwable -> L5
        m1675k("hooked delete via ".concat(r4));     // Catch: Throwable -> L5
        Object r52 = Boolean.TRUE;     // Catch: Throwable -> L5
    L7:
        Throwable r02 = AbstractC0141g.m465a(r52);
        if (r02 == null) goto L10;
        m1675k("hook delete failed " + r4 + ": " + r02.getMessage());
    L10:
        Boolean r42 = Boolean.FALSE;
        if ((r52 instanceof C0140f) == false) goto L14;
        r52 = r42;
    L14:
        return ((Boolean) r52).booleanValue();
    L5:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1677e(String r4, Method r5) {
        r5.setAccessible(true);     // Catch: Throwable -> L5
        AbstractC0762d.m1952b(r5, new C0662i(this, r4, 1));     // Catch: Throwable -> L5
        m1675k("hooked execSQL via " + r4);     // Catch: Throwable -> L5
        Object r52 = Boolean.TRUE;     // Catch: Throwable -> L5
    L7:
        Throwable r02 = AbstractC0141g.m465a(r52);
        if (r02 == null) goto L10;
        m1675k("hook execSQL failed " + r4 + ": " + r02.getMessage());
    L10:
        Boolean r42 = Boolean.FALSE;
        if ((r52 instanceof C0140f) == false) goto L14;
        r52 = r42;
    L14:
        return ((Boolean) r52).booleanValue();
    L5:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1678h(String r4, Method r5) {
        r5.setAccessible(true);     // Catch: Throwable -> L5
        AbstractC0762d.m1952b(r5, new C0662i(this, r4, 2));     // Catch: Throwable -> L5
        m1675k("hooked update via " + r4);     // Catch: Throwable -> L5
        Object r52 = Boolean.TRUE;     // Catch: Throwable -> L5
    L7:
        Throwable r02 = AbstractC0141g.m465a(r52);
        if (r02 == null) goto L10;
        m1675k("hook update failed " + r4 + ": " + r02.getMessage());
    L10:
        Boolean r42 = Boolean.FALSE;
        if ((r52 instanceof C0140f) == false) goto L14;
        r52 = r42;
    L14:
        return ((Boolean) r52).booleanValue();
    L5:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L7
    }
}
