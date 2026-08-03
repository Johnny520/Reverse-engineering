package p049b0;

import android.content.Context;
import android.os.Build;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p009E0.C0180k;
import p009E0.C0184o;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p040V0.C0398a;
import p040V0.InterfaceC0405h;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553c {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f1646a = null;

    static {
        f1646a = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static Class m1362a(Context r2, ClassLoader r3, String r4, String... r5) {
        AbstractC0307g.m703e(r2, "context");
        AbstractC0307g.m703e(r3, "classLoader");
        return (Class) m1367f(r2, r3, r4, new C0552b(r3, r5, 0));
    }

    /* JADX INFO: renamed from: b */
    public static List m1363b(Context r1, ClassLoader r2, String r3, String... r4) {
        AbstractC0307g.m703e(r2, "classLoader");
        List r12 = (List) m1367f(r1, r2, r3, new C0552b(r4, r2));
        if (r12 == null) goto L5;
        return r12;
    L5:
        return C0190u.f401a;
    }

    /* JADX INFO: renamed from: c */
    public static Class m1364c(DexKitBridge r4, ClassLoader r5, String... r6) {
        AbstractC0307g.m703e(r4, "bridge");
        AbstractC0307g.m703e(r5, "classLoader");
        AbstractC0307g.m703e(r6, "strings");
        Object r02 = null;
        FindClass r1 = new FindClass();     // Catch: Throwable -> L7
        ClassMatcher r2 = new ClassMatcher();     // Catch: Throwable -> L7
        r2.usingStrings((String[]) Arrays.copyOf(r6, r6.length));     // Catch: Throwable -> L7
        r1.matcher(r2);     // Catch: Throwable -> L7
        ClassData r12 = r4.findClass(r1).firstOrNull();     // Catch: Throwable -> L7
        if (r12 == null) goto L9;
        Object r13 = r12.getName();     // Catch: Throwable -> L7
    L12:
        if ((r13 instanceof C0140f) == false) goto L14;
        r13 = null;
    L14:
        Class r14 = m1366e(r5, (String) r13);
        if (r14 == null) goto L31;
        return r14;
    L31:
        FindMethod r15 = new FindMethod();     // Catch: Throwable -> L21
        MethodMatcher r22 = new MethodMatcher();     // Catch: Throwable -> L21
        r22.usingStrings((String[]) Arrays.copyOf(r6, r6.length));     // Catch: Throwable -> L21
        r15.matcher(r22);     // Catch: Throwable -> L21
        MethodData r42 = r4.findMethod(r15).firstOrNull();     // Catch: Throwable -> L21
        if (r42 == null) goto L23;
        Object r43 = r42.getClassName();     // Catch: Throwable -> L21
    L26:
        if ((r43 instanceof C0140f) == true) goto L30;
        r02 = r43;
    L30:
        return m1366e(r5, (String) r02);
    L23:
        r43 = null;
    L21:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L26
    L9:
        r13 = null;
    L7:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: d */
    public static void m1365d(Context r8, String r9) {
        System.loadLibrary("dexkit");     // Catch: Throwable -> L4
        m1368g("loaded via library path");     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        AbstractC0040p.m116u(th);
        if (r9 != null) goto L8;
    L14:
        r9 = r8.getApplicationInfo().sourceDir;
    L15:
        String[] r1 = Build.SUPPORTED_ABIS;
        if (r1 != null) goto L18;
        r1 = new String[0];
    L18:
        int r3 = r1.length;
        int r4 = 0;
    L19:
        String r5 = "arm64-v8a";
        if (r4 >= r3) goto L25;
        String r6 = r1[r4];
        AbstractC0307g.m700b(r6);
        if (AbstractC0425j.m1005J0(r6, "arm64", false) == true) goto L43;
        r4 = r4 + 1;
    L43:
        File r12 = new File(r8.getCacheDir(), "achat_dexkit");
        r12.mkdirs();
        File r82 = new File(r12, "libdexkit.so");
        if (r82.isFile() == true) goto L46;
    L47:
        ZipFile r13 = new ZipFile(r9);
        ZipEntry r92 = r13.getEntry("lib/" + r5 + "/libdexkit.so");     // Catch: Throwable -> L60
        if (r92 != null) goto L68;
        Enumeration<? extends ZipEntry> r93 = r13.entries();     // Catch: Throwable -> L60
        AbstractC0307g.m702d(r93, "entries(...)");     // Catch: Throwable -> L60
        InterfaceC0405h r94 = new C0180k(5, new C0184o(r93));     // Catch: Throwable -> L60
        if ((r94 instanceof C0398a) == true) goto L54;
        r94 = new C0398a(r94);     // Catch: Throwable -> L60
    L54:
        Iterator r95 = ((C0398a) r94).iterator();     // Catch: Throwable -> L60
    L56:
        if (r95.hasNext() == false) goto L62;
        Object r32 = r95.next();     // Catch: Throwable -> L60
        String r42 = ((ZipEntry) r32).getName();     // Catch: Throwable -> L60
        AbstractC0307g.m702d(r42, "getName(...)");     // Catch: Throwable -> L60
        if (AbstractC0433r.m1028C0(r42, "libdexkit.so") == false) goto L56;
    L63:
        r92 = (ZipEntry) r32;     // Catch: Throwable -> L60
        if (r92 != null) goto L68;
        throw new IllegalStateException("libdexkit.so not in module apk".toString());     // Catch: Throwable -> L60
    L62:
        r32 = null;
    L68:
        InputStream r96 = r13.getInputStream(r92);     // Catch: Throwable -> L60
        FileOutputStream r2 = new FileOutputStream(r82);     // Catch: Throwable -> L76
        AbstractC0307g.m700b(r96);     // Catch: Throwable -> L78
        AbstractC0040p.m115t(r96, r2, 8192);     // Catch: Throwable -> L78
        AbstractC0040p.m108m(r2, null);     // Catch: Throwable -> L76
        AbstractC0040p.m108m(r96, null);     // Catch: Throwable -> L60
        AbstractC0040p.m108m(r13, null);
    L74:
        System.load(r82.getAbsolutePath());
        m1368g("loaded from module apk abi=".concat(r5));
        return;
    L78:
        th = move-exception;
        throw th;     // Catch: Throwable -> L80
    L80:
        th = move-exception;
        AbstractC0040p.m108m(r2, th);     // Catch: Throwable -> L76
        throw th;     // Catch: Throwable -> L76
    L76:
        th = move-exception;
        throw th;     // Catch: Throwable -> L84
    L84:
        th = move-exception;
        AbstractC0040p.m108m(r96, th);     // Catch: Throwable -> L60
        throw th;     // Catch: Throwable -> L60
    L60:
        th = move-exception;
        throw th;     // Catch: Throwable -> L88
    L88:
        th = move-exception;
        AbstractC0040p.m108m(r13, th);
        throw th;
    L46:
        if (r82.length() != 0) goto L74;
    L25:
        int r33 = r1.length;
        int r43 = 0;
    L26:
        if (r43 >= r33) goto L31;
        String r62 = r1[r43];
        AbstractC0307g.m700b(r62);
        if (AbstractC0425j.m1005J0(r62, "armeabi", false) == true) goto L29;
        r43 = r43 + 1;
        goto L26
    L29:
        r5 = "armeabi-v7a";
        goto L43
    L31:
        int r34 = r1.length;
        int r44 = 0;
    L32:
        if (r44 >= r34) goto L37;
        String r63 = r1[r44];
        AbstractC0307g.m700b(r63);
        String r7 = "x86_64";
        if (AbstractC0425j.m1005J0(r63, "x86_64", false) == true) goto L35;
        r44 = r44 + 1;
    L35:
        r5 = r7;
        goto L43
    L37:
        int r35 = r1.length;
        int r45 = 0;
    L38:
        if (r45 >= r35) goto L43;
        String r64 = r1[r45];
        AbstractC0307g.m700b(r64);
        r7 = "x86";
        if (AbstractC0425j.m1005J0(r64, "x86", false) == true) goto L35;
        r45 = r45 + 1;
        goto L38
    L8:
        if ((!AbstractC0425j.m1013R0(r9)) == true) goto L10;
    L12:
        r9 = null;
    L13:
        if (r9 != null) goto L15;
    L10:
        if (new File(r9).isFile() == false) goto L12;
        goto L12
    }

    /* JADX INFO: renamed from: e */
    public static Class m1366e(ClassLoader r3, String r4) {
        Object r02 = null;
        if (r4 != null) goto L5;
        return null;
    L5:
        if (AbstractC0425j.m1013R0(r4) == false) goto L18;
        return null;
    L18:
        Object r32 = Class.forName(AbstractC0433r.m1032G0(AbstractC0425j.m1017V0(AbstractC0425j.m1016U0(r4, "L"), ";"), '/', '.'), false, r3);     // Catch: Throwable -> L10
    L13:
        if ((r32 instanceof C0140f) == true) goto L17;
        r02 = r32;
    L17:
        return (Class) r02;
    L10:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L13
    }

    /* JADX INFO: renamed from: f */
    public static Object m1367f(Context r3, ClassLoader r4, String r5, InterfaceC0286l r6) {
        AbstractC0307g.m703e(r3, "context");
        AbstractC0307g.m703e(r4, "classLoader");
        AtomicBoolean r02 = f1646a;
        if (r02.get() == false) goto L42;
        boolean r32 = true;
    L15:
        if (r32 == true) goto L37;
        return null;
    L37:
        DexKitBridge r33 = DexKitBridge.Companion.create(r4, true);     // Catch: Throwable -> L21
        Object r42 = r6.invoke(r33);     // Catch: Throwable -> L23
        AbstractC0040p.m108m(r33, null);     // Catch: Throwable -> L21
    L29:
        Throwable r34 = AbstractC0141g.m465a(r42);
        if (r34 == null) goto L33;
        m1368g("bridge fail: " + r34.getClass().getSimpleName() + ": " + r34.getMessage());
    L33:
        if ((r42 instanceof C0140f) == false) goto L36;
        return null;
    L36:
        return r42;
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        AbstractC0040p.m108m(r33, th);     // Catch: Throwable -> L21
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L29
    L42:
        m1365d(r3, r5);     // Catch: Throwable -> L7
        r02.set(true);     // Catch: Throwable -> L7
        Object r35 = Boolean.TRUE;     // Catch: Throwable -> L7
    L9:
        Throwable r52 = AbstractC0141g.m465a(r35);
        if (r52 == null) goto L13;
        m1368g("native load fail: " + r52.getMessage());
        r35 = Boolean.FALSE;
    L13:
        r32 = ((Boolean) r35).booleanValue();
    L7:
        th = move-exception;
        r35 = AbstractC0040p.m116u(th);
        goto L9
    }

    /* JADX INFO: renamed from: g */
    public static void m1368g(String r2) {
        AbstractC0762d.m1954d("[OKK-DexKit] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
