package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import de.robv.android.xposed.XposedHelpers;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public abstract class gt {
    public static TypedValue A(Context r1, int r2, String r3) {
        TypedValue r0 = y(r1, r2);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{r3, r1.getResources().getResourceName(r2)}));
    }

    public static void D(View r3, eu r4) {
        xh r0 = r4.a.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.a == false) goto L16;
        ViewParent r32 = r3.getParent();
        float r02 = 0.0f;
    L8:
        if ((r32 instanceof View) == false) goto L10;
        WeakHashMap r2 = ja0.a;
        r02 = r02 + y90.i((View) r32);
        r32 = r32.getParent();
        goto L8
    L10:
        du r33 = r4.a;
        if (r33.l == r02) goto L17;
        r33.l = r02;
        r4.m();
        return;
    L17:
        return;
    }

    public static final long E(String r4, long r5, long r7, long r9) {
        int r0 = r50.a;
        String r02 = System.getProperty(r4);     // Catch: SecurityException -> L5
    L6:
        if (r02 != null) goto L8;
        return r5;
    L8:
        Long r52 = b50.S(r02);
        if (r52 == null) goto L18;
        long r2 = r52.longValue();
        if (r7 > r2) goto L16;
        if (r2 > r9) goto L16;
        return r2;
    L16:
        throw new IllegalStateException(("System property '" + r4 + "' should be in range " + r7 + ".." + r9 + ", but is '" + r2 + '\'').toString());
    L18:
        throw new IllegalStateException(("System property '" + r4 + "' has unrecognized value '" + r02 + '\'').toString());
    L5:
        r02 = null;
        goto L6
    }

    public static int F(String r7, int r8, int r9) {
        if ((r9 & 8) == 0) goto L5;
        int r92 = Integer.MAX_VALUE;
    L7:
        return (int) E(r7, r8, 1, r92);
    L5:
        r92 = 2097150;
        goto L7
    }

    public static final void G(i00 r5, View r6) {
        if (r5.b == null) goto L6;
        return;
    L6:
        if (r6.getClass().getName().equals(pb0.i0) == false) goto L10;
        r5.b = r6;
        return;
    L10:
        if ((r6 instanceof ViewGroup) == false) goto L14;
        ViewGroup r62 = (ViewGroup) r6;
        int r0 = r62.getChildCount();
        int r1 = 0;
    L12:
        if (r1 >= r0) goto L17;
        View r2 = r62.getChildAt(r1);
        ip.n(u40.a("njrBEZzoeLm4K5182q89\n", "+V+1UvSBFN0=\n"), r2);
        G(r5, r2);
        r1 = r1 + 1;
        goto L12
    L17:
        return;
    }

    public static int a(Context r6, String r7) {
        int r0 = Process.myPid();
        int r1 = Process.myUid();
        String r2 = r6.getPackageName();
        if (r6.checkPermission(r7, r0, r1) == (-1)) goto L15;
        String r72 = w5.d(r7);
        if (r72 == null) goto L29;
        if (r2 != null) goto L16;
        String[] r22 = r6.getPackageManager().getPackagesForUid(r1);
        if (r22 == null) goto L15;
        if (r22.length <= 0) goto L15;
        r2 = r22[0];
    L16:
        int r3 = Process.myUid();
        String r4 = r6.getPackageName();
        if (r3 == r1) goto L19;
    L27:
        int r23 = w5.c((AppOpsManager) w5.a(r6, AppOpsManager.class), r72, r2);
    L28:
        if (r23 == 0) goto L29;
        return -2;
    L19:
        if (pw.a(r4, r2) == false) goto L27;
        if (Build.VERSION.SDK_INT < 29) goto L26;
        AppOpsManager r32 = x5.c(r6);
        r23 = x5.a(r32, r72, Binder.getCallingUid(), r2);
        if (r23 != 0) goto L28;
        r23 = x5.a(r32, r72, r1, x5.b(r6));
        goto L28
    L26:
        r23 = w5.c((AppOpsManager) w5.a(r6, AppOpsManager.class), r72, r2);
    L29:
        return 0;
    L15:
        return -1;
    }

    public static void d(Closeable r0) {
        if (r0 == null) goto L8;
        r0.close();     // Catch: IOException -> L5
        return;
    L9:
        return;
    }

    public static int e(int r2, int r3) {
        if (r3 < 0) goto L10;
        if (r2 >= 0) goto L6;
        return 0;
    L6:
        if (r2 <= r3) goto L8;
        return r3;
    L8:
        return r2;
    L10:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r3 + " is less than minimum 0.");
    }

    public static boolean f(File r0, Resources r1, int r2) {
        InputStream r12 = r1.openRawResource(r2);     // Catch: Throwable -> L8
        boolean r02 = g(r0, r12);     // Catch: Throwable -> L6
        d(r12);
        return r02;
    L6:
        th = th;
    L10:
        d(r12);
        throw th;
    L8:
        th = th;
        r12 = null;
        goto L10
    }

    public static boolean g(File r5, InputStream r6) {
        StrictMode.ThreadPolicy r0 = StrictMode.allowThreadDiskWrites();
        FileOutputStream r2 = null;
        FileOutputStream r3 = new FileOutputStream(r5, false);     // Catch: Throwable -> L16 IOException -> L18
        byte[] r52 = new byte[1024];     // Catch: Throwable -> L10 IOException -> L12
    L6:
        int r22 = r6.read(r52);     // Catch: Throwable -> L10 IOException -> L12
        if (r22 == (-1)) goto L14;
        r3.write(r52, 0, r22);     // Catch: Throwable -> L10 IOException -> L12
        goto L6
    L14:
        d(r3);
        StrictMode.setThreadPolicy(r0);
        return true;
    L12:
        e = e;
        r2 = r3;
    L19:
        Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());     // Catch: Throwable -> L16
        d(r2);
        StrictMode.setThreadPolicy(r0);
        return false;
    L10:
        th = th;
        r2 = r3;
    L22:
        d(r2);
        StrictMode.setThreadPolicy(r0);
        throw th;
    L18:
        e = e;
    L16:
        th = th;
        goto L22
    }

    public static ip h(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return new h10();
    L8:
        return new ze();
    L10:
        return new h10();
    }

    public static boolean i(String r3) {
        ip.o(u40.a("ggWA\n", "6WD5BmkcYhM=\n"), r3);
        gn.a.getClass();     // Catch: Throwable -> L5
        return gn.e(r3);
    L17:
        gn r1 = gn.a;     // Catch: Throwable -> L16
        String r2 = String.valueOf(false);     // Catch: Throwable -> L16
        r1.getClass();     // Catch: Throwable -> L16
        String r32 = gn.d(r3, r2);     // Catch: Throwable -> L16
        if (r32.equals("true") == false) goto L10;
        Boolean r33 = Boolean.TRUE;     // Catch: Throwable -> L16
    L13:
        if (r33 == null) goto L21;
        return r33.booleanValue();
    L21:
        return false;
    L10:
        if (r32.equals("false") == false) goto L12;
        r33 = Boolean.FALSE;     // Catch: Throwable -> L16
        goto L13
    L12:
        r33 = null;
    L22:
        return false;
    }

    public static int j(String r2, int r3) {
        ip.o(u40.a("aYbW\n", "AuOvGSdAksw=\n"), r2);
        gn.a.getClass();     // Catch: Throwable -> L5
        return gn.b(r2, r3);
    L5:
        gn r0 = gn.a;     // Catch: Throwable -> L9
        String r1 = String.valueOf(r3);     // Catch: Throwable -> L9
        r0.getClass();     // Catch: Throwable -> L9
        Integer r22 = b50.R(gn.d(r2, r1));     // Catch: Throwable -> L9
        if (r22 == null) goto L13;
        return r22.intValue();
    L13:
        return r3;
    L14:
        return r3;
    }

    public static File k(Context r5) {
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

    public static boolean n(View r1) {
        WeakHashMap r0 = ja0.a;
        if (t90.d(r1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public static MappedByteBuffer o(Context r8, Uri r9) {
        ParcelFileDescriptor r82 = f80.a(r8.getContentResolver(), r9, "r", null);     // Catch: IOException -> L30
        if (r82 != null) goto L31;
        if (r82 == null) goto L29;
        r82.close();     // Catch: IOException -> L30
        return null;
    L31:
        FileInputStream r92 = new FileInputStream(r82.getFileDescriptor());     // Catch: Throwable -> L13
        FileChannel r2 = r92.getChannel();     // Catch: Throwable -> L15
        long r6 = r2.size();     // Catch: Throwable -> L15
        MappedByteBuffer r0 = r2.map(FileChannel.MapMode.READ_ONLY, 0, r6);     // Catch: Throwable -> L15
        r92.close();     // Catch: Throwable -> L13
        r82.close();     // Catch: IOException -> L30
        return r0;
    L15:
        th = move-exception;
        r92.close();     // Catch: Throwable -> L19
        goto L29
    L39:
        throw th;     // Catch: Throwable -> L13
    L19:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r82.close();     // Catch: Throwable -> L25
        goto L29
    L40:
        throw th;     // Catch: IOException -> L30
    L25:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L30
        throw th;     // Catch: IOException -> L30
    L29:
        return null;
    }

    public static PorterDuff.Mode v(int r1, PorterDuff.Mode r2) {
        if (r1 == 3) goto L21;
        if (r1 == 5) goto L19;
        if (r1 == 9) goto L17;
        switch(r1) {
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            default: goto L9;
        };
    L9:
        return r2;
    L11:
        return PorterDuff.Mode.ADD;
    L13:
        return PorterDuff.Mode.SCREEN;
    L15:
        return PorterDuff.Mode.MULTIPLY;
    L17:
        return PorterDuff.Mode.SRC_ATOP;
    L19:
        return PorterDuff.Mode.SRC_IN;
    L21:
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void w(Activity r17, Object r18, String r19) {
        Field r6 = in.g;
        Object r7 = null;
        if (r6 == null) goto L5;
        Object r62 = r6.get(r18);
    L7:
        if ((r62 instanceof String) == false) goto L9;
        String r63 = (String) r62;
    L10:
        String r8 = "";
        if (r63 == null) goto L14;
        String r64 = b50.T(r63).toString();
        if (r64 == null) goto L14;
    L15:
        Field r9 = in.h;
        if (r9 == null) goto L18;
        Object r0 = r9.get(r18);
    L20:
        if ((r0 instanceof String) == false) goto L22;
        String r02 = (String) r0;
    L23:
        if (r02 != null) goto L25;
        r02 = "";
    L25:
        d4 r92 = i00.a(i9.k, r02);
        if (r92 == null) goto L28;
        r8 = (String) ((ft) r92.t()).get(1);
    L32:
        if (r8.length() != 0) goto L35;
    L36:
        gn r03 = gn.a;
        String r2 = u40.a("PLLKDS8X4gd59fRGlrJL++H17XtJHZBacKKKXwk=\n", "1BNi66ySBr8=\n");
        r03.getClass();
        gn.k(r17, r2);
        return;
    L35:
        if (r8.length() != 32) goto L36;
        Class r04 = XposedHelpers.findClassIfExists(pb0.G, d9.a);     // Catch: Throwable -> L48
        Iterator r65 = pb0.I0.iterator();     // Catch: Throwable -> L48
        Object r93 = null;
    L40:
        if (r65.hasNext() == false) goto L50;
        String r10 = (String) r65.next();     // Catch: Throwable -> L48
        Class r11 = XposedHelpers.findClassIfExists(r10, d9.a);     // Catch: Throwable -> L48
        if (r11 == null) goto L40;
        r93 = XposedHelpers.callStaticMethod(r11, pb0.t, new Object[]{r04});     // Catch: Throwable -> L47
    L45:
        if (r93 == null) goto L40;
    L47:
        ip.o(u40.a("Nwje\n", "Q2m5jaPP2Zc=\n"), "EmojiRepeat_Locate_Failed for class: " + r10);     // Catch: Throwable -> L48
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");     // Catch: Throwable -> L48
    L50:
        if (r93 != null) goto L52;
        gn r05 = gn.a;     // Catch: Throwable -> L48
        String r66 = u40.a("aIrkjr4ZCr0tzdrFB7wIkiDN//3VElngD72kyZV6bYBlo8qNsg3ORNBi\n", "gCtMaD2c7gU=\n");     // Catch: Throwable -> L48
        r05.getClass();     // Catch: Throwable -> L48
        gn.k(r17, r66);     // Catch: Throwable -> L48
        return;
    L52:
        Class r06 = XposedHelpers.findClassIfExists(pb0.g, d9.a);     // Catch: Throwable -> L48
        String r67 = pb0.M0;     // Catch: Throwable -> L48
    L58:
        ip.o(u40.a("Nwje\n", "Q2m5jaPP2Zc=\n"), "EmojiRepeat_Inst_Failed for method: " + r67);     // Catch: Throwable -> L48
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");     // Catch: Throwable -> L48
    L59:
        if (r7 == null) goto L67;
        Object r12 = XposedHelpers.callMethod(XposedHelpers.callMethod(r7, pb0.E, new Object[0]), pb0.F, new Object[]{r8});     // Catch: Throwable -> L48
        if (r12 == null) goto L66;
        Object r14 = XposedHelpers.newInstance(XposedHelpers.findClass(pb0.v0, d9.a), new Object[]{0L, r19});     // Catch: Throwable -> L48
        String r07 = pb0.k0;     // Catch: Throwable -> L48
        XposedHelpers.callMethod(r93, r07, new Object[]{r19, r12, null, r14, null, 0});     // Catch: Throwable -> L65
    L88:
        return;
    L65:
        gn.a.getClass();     // Catch: Throwable -> L48
        gn.k(r17, "表情接口调用失败：参数未对齐或方法(" + r07 + ")失效");     // Catch: Throwable -> L48
        ip.o(u40.a("Nwje\n", "Q2m5jaPP2Zc=\n"), "EmojiRepeat_Invoke_Failed for targetNh: " + r07 + ", md5: " + r8);     // Catch: Throwable -> L48
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");     // Catch: Throwable -> L48
        return;
    L66:
        gn r08 = gn.a;     // Catch: Throwable -> L48
        String r68 = u40.a("E9SjSRC5TS1cj4cNR6UWV1vO5QwH/ig0\n", "9moNra8Yq7E=\n");     // Catch: Throwable -> L48
        r08.getClass();     // Catch: Throwable -> L48
        gn.k(r17, r68);     // Catch: Throwable -> L48
        return;
    L67:
        gn r09 = gn.a;     // Catch: Throwable -> L48
        String r69 = u40.a("xTWd1Q+czdKAcqOetjnP/Y1yhqZkl56PogIVduF2QwN+4FpB7X5MSssIuNYGuA==\n", "LZQ1M4wZKWo=\n");     // Catch: Throwable -> L48
        r09.getClass();     // Catch: Throwable -> L48
        gn.k(r17, r69);     // Catch: Throwable -> L48
        return;
    L55:
        if (r67.length() <= 0) goto L59;
        r7 = XposedHelpers.callStaticMethod(r06, r67, new Object[0]);     // Catch: Throwable -> L58
    L48:
        th = move-exception;
        gn r610 = gn.a;
        String r010 = "表情分发全局异常: " + th.getMessage();
        r610.getClass();
        gn.k(r17, r010);
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "EmojiRepeat_Global_Fatal for md5: ".concat(r8), "Fg==\n", "c8HJlSTQVfc=\n");
        return;
    L28:
        d4 r011 = i00.a(i9.l, r64 + " " + r02);
        if (r011 == null) goto L32;
        r8 = ((Matcher) r011.b).group();
        ip.n("group(...)", r8);
        goto L32
    L22:
        r02 = null;
        goto L23
    L18:
        r0 = null;
    L14:
        r64 = "";
        goto L15
    L9:
        r63 = null;
        goto L10
    L5:
        r62 = null;
        goto L7
    }

    public static wv x(MappedByteBuffer r13) {
        ByteBuffer r132 = r13.duplicate();
        r132.order(ByteOrder.BIG_ENDIAN);
        r132.position(r132.position() + 4);
        int r0 = r132.getShort() & 65535;
        if (r0 > 100) goto L28;
        r132.position(r132.position() + 6);
        int r1 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L11;
        int r8 = r132.getInt();
        r132.position(r132.position() + 4);
        long r9 = ((long) r132.getInt()) & 4294967295L;
        r132.position(r132.position() + 4);
        if (1835365473 == r8) goto L13;
        r3 = r3 + 1;
    L13:
        if (r9 == (-1)) goto L26;
        r132.position(r132.position() + ((int) (r9 - ((long) r132.position()))));
        r132.position(r132.position() + 12);
        long r6 = ((long) r132.getInt()) & 4294967295L;
    L16:
        if (r1 >= r6) goto L26;
        int r02 = r132.getInt();
        long r11 = ((long) r132.getInt()) & 4294967295L;
        r132.getInt();
        if (1164798569 == r02) goto L23;
        if (1701669481 == r02) goto L23;
        r1 = r1 + 1;
    L23:
        r132.position((int) (r11 + r9));
        wv r03 = new wv();
        r132.order(ByteOrder.LITTLE_ENDIAN);
        int r2 = r132.position() + r132.getInt(r132.position());
        r03.d = r132;
        r03.a = r2;
        int r22 = r2 - r132.getInt(r2);
        r03.b = r22;
        r03.c = ((ByteBuffer) r03.d).getShort(r22);
        return r03;
    L26:
        throw new IOException("Cannot read metadata.");
    L11:
        r9 = -1;
        goto L13
    L28:
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue y(Context r2, int r3) {
        TypedValue r0 = new TypedValue();
        if (r2.getTheme().resolveAttribute(r3, r0, true) == false) goto L5;
        return r0;
    L5:
        return null;
    }

    public static boolean z(Context r1, int r2, boolean r3) {
        TypedValue r12 = y(r1, r2);
        if (r12 != null) goto L5;
    L12:
        return r3;
    L5:
        if (r12.type != 18) goto L12;
        if (r12.data == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public abstract void B(boolean r1);

    public abstract void C(boolean r1);

    public abstract boolean H(View r1, int r2);

    public abstract int b(View r1, int r2);

    public abstract int c(View r1, int r2);

    public int l(View r1) {
        return 0;
    }

    public int m() {
        return 0;
    }

    public abstract void p(int r1);

    public abstract void q(Typeface r1, boolean r2);

    public abstract void s(int r1);

    public abstract void t(View r1, int r2, int r3);

    public abstract void u(View r1, float r2, float r3);

    public void r(View r1, int r2) {
    }
}
