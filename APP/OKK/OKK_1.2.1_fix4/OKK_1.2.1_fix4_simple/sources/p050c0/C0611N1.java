package p050c0;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.result.MethodDataList;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.C0190u;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.N1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611N1 {

    /* JADX INFO: renamed from: a */
    public static final C0611N1 f1883a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1884b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1885c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1886d = null;

    /* JADX INFO: renamed from: e */
    public static final Set f1887e = null;

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f1888f = null;

    static {
        f1883a = new C0611N1();
        f1884b = new AtomicBoolean(false);
        f1885c = new AtomicBoolean(false);
        f1886d = new AtomicBoolean(false);
        Set r02 = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(r02, "newSetFromMap(...)");
        f1887e = r02;
        f1888f = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static Method m1507a(ClassLoader r13, String r14) {
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
        r8.append(m1510e(r12));
        r11 = r11 + 1;
        goto L12
    L14:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1510e(r92));
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
    public static void m1508b(Class r11) {
        Set r02 = f1887e;
        monitor-enter(r02);
    L47:
        th = move-exception;
        throw th;
    L5:
        if (r02.contains(r11) == false) goto L8;
        monitor-exit(r02);
        return;
    L8:
        r02.add(r11);     // Catch: Throwable -> L47
        monitor-exit(r02);
        Iterator r03 = AbstractC0182m.m556h0(new String[]{"getLatitude", "getLongitude"}).iterator();
        int r2 = 0;
    L12:
        if (r03.hasNext() == false) goto L37;
        String r3 = (String) r03.next();
        Method[] r4 = r11.getDeclaredMethods();
        AbstractC0307g.m702d(r4, "getDeclaredMethods(...)");
        ArrayList r5 = new ArrayList();
        int r6 = r4.length;
        int r7 = 0;
    L14:
        if (r7 >= r6) goto L29;
        Method r8 = r4[r7];
        if (AbstractC0307g.m699a(r8.getName(), r3) == false) goto L28;
        Class<?>[] r9 = r8.getParameterTypes();
        AbstractC0307g.m702d(r9, "getParameterTypes(...)");
        if (r9.length != 0) goto L28;
        if (AbstractC0307g.m699a(r8.getReturnType(), Double.TYPE) == false) goto L22;
    L27:
        r5.add(r8);
        goto L28
    L22:
        if (AbstractC0307g.m699a(r8.getReturnType(), Double.class) == true) goto L27;
        if (AbstractC0307g.m699a(r8.getReturnType(), Float.TYPE) == true) goto L27;
        if (AbstractC0307g.m699a(r8.getReturnType(), Float.class) == true) goto L27;
    L28:
        r7 = r7 + 1;
        goto L14
    L29:
        Iterator r42 = r5.iterator();
    L31:
        if (r42.hasNext() == false) goto L12;
        Method r52 = (Method) r42.next();
        r52.setAccessible(true);     // Catch: Throwable -> L35
        AbstractC0762d.m1952b(r52, new C0608M1(AbstractC0307g.m699a(r3, "getLatitude"), r52));     // Catch: Throwable -> L35
        r2 = r2 + 1;
    L35:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L31
    L37:
        Class r04 = r11.getSuperclass();
        if (r04 != null) goto L40;
    L44:
        if (r2 <= 0) goto L65;
        m1511f("hooked " + r2 + " getters on " + r11.getName());
        return;
    L65:
        return;
    L40:
        if (r04.equals(Object.class) == true) goto L44;
        if (r04.getName().equals("java.lang.Object") == true) goto L44;
        m1508b(r04);
        goto L44
    }

    /* JADX INFO: renamed from: d */
    public static void m1509d(Context r7, String r8) {
        AtomicBoolean r1 = f1886d;
        if (r1.get() == false) goto L55;
        return;
    L55:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L7
        Object r2 = C0146l.f339a;     // Catch: Throwable -> L7
    L10:
        if ((!(r2 instanceof C0140f)) == false) goto L13;
        C0146l r22 = (C0146l) r2;
        r1.set(true);
        return;
    L13:
        if (r8 != null) goto L16;
        return;
    L16:
        if (Process.is64Bit() == false) goto L20;
        String[] r23 = Build.SUPPORTED_64_BIT_ABIS;
        AbstractC0307g.m702d(r23, "SUPPORTED_64_BIT_ABIS");
        String r24 = (String) AbstractC0179j.m536m0(r23);
        if (r24 != null) goto L23;
        r24 = "arm64-v8a";
    L23:
        File r3 = new File(r7.getCacheDir(), AbstractC0324d.m723f("abc_", r24, "_libdexkit.so"));
        ZipFile r72 = new ZipFile(r8);
        ZipEntry r82 = r72.getEntry("lib/" + r24 + "/libdexkit.so");     // Catch: Throwable -> L36
        if (r82 != null) goto L29;
        AbstractC0040p.m108m(r72, null);
        return;
    L29:
        InputStream r83 = r72.getInputStream(r82);     // Catch: Throwable -> L36
        FileOutputStream r25 = new FileOutputStream(r3);     // Catch: Throwable -> L38
        AbstractC0307g.m700b(r83);     // Catch: Throwable -> L40
        AbstractC0040p.m115t(r83, r25, 8192);     // Catch: Throwable -> L40
        AbstractC0040p.m108m(r25, null);     // Catch: Throwable -> L38
        AbstractC0040p.m108m(r83, null);     // Catch: Throwable -> L36
        AbstractC0040p.m108m(r72, null);
        System.load(r3.getAbsolutePath());
        r1.set(true);
        return;
    L40:
        th = move-exception;
        throw th;     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        AbstractC0040p.m108m(r25, th);     // Catch: Throwable -> L38
        throw th;     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        throw th;     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        AbstractC0040p.m108m(r83, th);     // Catch: Throwable -> L36
        throw th;     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        throw th;     // Catch: Throwable -> L50
    L50:
        th = move-exception;
        AbstractC0040p.m108m(r72, th);
        throw th;
    L20:
        String[] r26 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r26, "SUPPORTED_32_BIT_ABIS");
        r24 = (String) AbstractC0179j.m536m0(r26);
        if (r24 != null) goto L23;
        r24 = "armeabi-v7a";
    L7:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX INFO: renamed from: e */
    public static String m1510e(Class r3) {
        if (r3.isPrimitive() == false) goto L35;
        if (r3.equals(Integer.TYPE) == false) goto L8;
        return "I";
    L8:
        if (r3.equals(Void.TYPE) == false) goto L11;
        return "V";
    L11:
        if (r3.equals(Boolean.TYPE) == false) goto L14;
        return "Z";
    L14:
        if (r3.equals(Character.TYPE) == false) goto L17;
        return "C";
    L17:
        if (r3.equals(Byte.TYPE) == false) goto L20;
        return "B";
    L20:
        if (r3.equals(Short.TYPE) == false) goto L23;
        return "S";
    L23:
        if (r3.equals(Float.TYPE) == false) goto L26;
        return "F";
    L26:
        if (r3.equals(Long.TYPE) == false) goto L29;
        return "J";
    L29:
        if (r3.equals(Double.TYPE) == false) goto L33;
        return "D";
    L33:
        throw new IllegalStateException(("Unknown primitive " + r3).toString());
    L35:
        if (r3.isArray() == false) goto L39;
        return AbstractC0433r.m1032G0(r3.getName(), '.', '/');
    L39:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r3.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: f */
    public static void m1511f(String r2) {
        AbstractC0762d.m1954d("[OKK-VirtualLoc] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX INFO: renamed from: c */
    public final int m1512c(DexKitBridge r7, ClassLoader r8, String r9, String... r10) {
        FindMethod r02 = new FindMethod();     // Catch: Throwable -> L7
        MethodMatcher r1 = new MethodMatcher();     // Catch: Throwable -> L7
        r1.setName("onLocationChanged");     // Catch: Throwable -> L7
        r1.usingEqStrings((String[]) Arrays.copyOf(r10, r10.length));     // Catch: Throwable -> L7
        r02.matcher(r1);     // Catch: Throwable -> L7
        MethodDataList r72 = r7.findMethod(r02);     // Catch: Throwable -> L7
        ?? r102 = new ArrayList(AbstractC0183n.m559k0(r72, 10));     // Catch: Throwable -> L7
        Iterator<MethodData> r73 = r72.iterator();     // Catch: Throwable -> L7
    L3:
        if (r73.hasNext() == false) goto L9;
        r102.add(r73.next().getDescriptor());     // Catch: Throwable -> L7
    L9:
        C0190u r74 = C0190u.f401a;
        boolean r03 = r102 instanceof C0140f;
        ?? r103 = r102;
        if (r03 == false) goto L12;
        r103 = r74;
    L12:
        List r104 = (List) r103;
        Iterator r75 = AbstractC0181l.m543o0(r104).iterator();
        int r04 = 0;
    L14:
        if (r75.hasNext() == false) goto L38;
        Object r12 = m1507a(r8, (String) r75.next());     // Catch: Throwable -> L18
    L21:
        if ((r12 instanceof C0140f) == false) goto L23;
        r12 = null;
    L23:
        Method r13 = (Method) r12;
        if (r13 == null) goto L14;
        String r2 = AbstractC0324d.m725h("DexKit:", r9);
        r13.setAccessible(true);     // Catch: Throwable -> L29
        AbstractC0762d.m1952b(r13, new C0674m(7, this));     // Catch: Throwable -> L29
        m1511f("hooked onLocationChanged via " + r2 + " -> " + r13.getDeclaringClass().getName() + "." + r13.getName());     // Catch: Throwable -> L29
        Object r14 = Boolean.TRUE;     // Catch: Throwable -> L29
    L31:
        Object r22 = Boolean.FALSE;
        if ((r14 instanceof C0140f) == false) goto L35;
        r14 = r22;
    L35:
        if (((Boolean) r14).booleanValue() == false) goto L14;
        r04 = r04 + 1;
    L29:
        th = move-exception;
        r14 = AbstractC0040p.m116u(th);
    L18:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L21
    L38:
        if (r104.isEmpty() == false) goto L40;
        m1511f("DexKit miss onLocationChanged label=" + r9);
    L40:
        return r04;
    L7:
        th = move-exception;
        r102 = AbstractC0040p.m116u(th);
        goto L9
    }
}
