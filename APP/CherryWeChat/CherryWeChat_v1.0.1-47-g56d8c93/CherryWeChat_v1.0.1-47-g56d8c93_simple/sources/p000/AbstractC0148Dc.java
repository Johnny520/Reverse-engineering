package p000;

import android.R;
import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Dc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0148Dc {

    /* JADX INFO: renamed from: a */
    public static final int[] f384a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f385b = null;

    /* JADX INFO: renamed from: c */
    public static final int[] f386c = null;

    /* JADX INFO: renamed from: d */
    public static final int[] f387d = null;

    /* JADX INFO: renamed from: e */
    public static final int[] f388e = null;

    /* JADX INFO: renamed from: f */
    public static final int[] f389f = null;

    /* JADX INFO: renamed from: g */
    public static final C2672we f390g = null;

    /* JADX INFO: renamed from: h */
    public static final int[] f391h = null;

    /* JADX INFO: renamed from: i */
    public static final int[] f392i = null;

    /* JADX INFO: renamed from: j */
    public static final byte[] f393j = null;

    /* JADX INFO: renamed from: k */
    public static final byte[] f394k = null;

    /* JADX INFO: renamed from: l */
    public static final byte[] f395l = null;

    /* JADX INFO: renamed from: m */
    public static final byte[] f396m = null;

    /* JADX INFO: renamed from: n */
    public static final byte[] f397n = null;

    /* JADX INFO: renamed from: o */
    public static final byte[] f398o = null;

    /* JADX INFO: renamed from: p */
    public static final byte[] f399p = null;

    /* JADX INFO: renamed from: q */
    public static volatile boolean f400q = true;

    static {
        f384a = new int[]{R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
        f385b = new int[]{R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
        f386c = new int[]{R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
        f387d = new int[]{R.attr.name, R.attr.pathData, R.attr.fillType};
        f388e = new int[]{R.attr.drawable};
        f389f = new int[]{R.attr.name, R.attr.animation};
        f390g = new C2672we(24);
        f391h = new int[]{R.attr.theme, io.github.cherrywechat.R.attr.theme};
        f392i = new int[]{io.github.cherrywechat.R.attr.materialThemeOverlay};
        f393j = new byte[]{48, 49, 53, 0};
        f394k = new byte[]{48, 49, 48, 0};
        f395l = new byte[]{48, 48, 57, 0};
        f396m = new byte[]{48, 48, 53, 0};
        f397n = new byte[]{48, 48, 49, 0};
        f398o = new byte[]{48, 48, 49, 0};
        f399p = new byte[]{48, 48, 50, 0};
    }

    /* JADX INFO: renamed from: a */
    public static final C2378pl m267a(InterfaceC0717Qm r2, String r3) {
        return new C2378pl(r3, new C2421ql(r2));
    }

    /* JADX INFO: renamed from: b */
    public static void m268b(Throwable r2, Throwable r3) {
        if (r2 == r3) goto L14;
        Integer r0 = AbstractC1016Xl.f3224a;
        if (r0 != null) goto L6;
    L12:
        r2.addSuppressed(r3);
        return;
    L6:
        if (r0.intValue() >= 19) goto L12;
        Method r02 = AbstractC0681Pt.f2179a;
        if (r02 == null) goto L15;
        r02.invoke(r2, new Object[]{r3});
        return;
    L15:
        return;
    }

    /* JADX INFO: renamed from: c */
    public static final byte m269c(char r1) {
        if (r1 < '~') goto L5;
        return 0;
    L5:
        return C2573u7.f8922b[r1];
    }

    /* JADX INFO: renamed from: d */
    public static int m270d(Context r6, String r7) {
        int r0 = Process.myPid();
        int r1 = Process.myUid();
        String r2 = r6.getPackageName();
        if (r6.checkPermission(r7, r0, r1) == (-1)) goto L15;
        String r72 = AppOpsManager.permissionToOp(r7);
        if (r72 == null) goto L36;
        if (r2 != null) goto L16;
        String[] r22 = r6.getPackageManager().getPackagesForUid(r1);
        if (r22 == null) goto L15;
        if (r22.length <= 0) goto L15;
        r2 = r22[0];
    L16:
        int r3 = Process.myUid();
        String r4 = r6.getPackageName();
        if (r3 == r1) goto L19;
    L34:
        int r23 = ((AppOpsManager) r6.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(r72, r2);
    L35:
        if (r23 == 0) goto L36;
        return -2;
    L19:
        if (Objects.equals(r4, r2) == false) goto L34;
        if (Build.VERSION.SDK_INT < 29) goto L33;
        AppOpsManager r32 = (AppOpsManager) r6.getSystemService(AppOpsManager.class);
        int r42 = Binder.getCallingUid();
        int r5 = 1;
        if (r32 != null) goto L25;
        r23 = 1;
    L26:
        if (r23 != 0) goto L35;
        String r62 = AbstractC2785z4.m5356a(r6);
        if (r32 == null) goto L32;
        r5 = r32.checkOpNoThrow(r72, r1, r62);
    L32:
        r23 = r5;
        goto L35
    L25:
        r23 = r32.checkOpNoThrow(r72, r42, r2);
        goto L26
    L33:
        r23 = ((AppOpsManager) r6.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(r72, r2);
    L36:
        return 0;
    L15:
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static C0608O5 m271e(InterfaceC0565N5 r6, Drawable r7, int r8, int r9) {
        Drawable r72 = r7.getCurrent();
        boolean r1 = false;
        if ((r72 instanceof BitmapDrawable) == false) goto L6;
        Bitmap r73 = ((BitmapDrawable) r72).getBitmap();
    L35:
        if (r1 == true) goto L39;
        r6 = f390g;
    L39:
        return C0608O5.m1187c(r6, r73);
    L6:
        if ((r72 instanceof Animatable) == false) goto L8;
        r73 = null;
        goto L35
    L8:
        if (r8 == Integer.MIN_VALUE) goto L10;
    L15:
        if (r9 != Integer.MIN_VALUE) goto L22;
        if (r72.getIntrinsicHeight() > 0) goto L22;
        if (Log.isLoggable("DrawableToBitmap", 5) == true) goto L20;
    L14:
        r73 = null;
    L30:
        r1 = true;
        goto L35
    L20:
        r72.toString();
    L22:
        if (r72.getIntrinsicWidth() <= 0) goto L25;
        r8 = r72.getIntrinsicWidth();
    L25:
        if (r72.getIntrinsicHeight() <= 0) goto L27;
        r9 = r72.getIntrinsicHeight();
    L27:
        Lock r0 = AbstractC0184EB.f548d;
        r0.lock();
        Bitmap r3 = r6.mo52g(r8, r9, Bitmap.Config.ARGB_8888);
        Canvas r4 = new Canvas(r3);     // Catch: Throwable -> L31
        r72.setBounds(0, 0, r8, r9);     // Catch: Throwable -> L31
        r72.draw(r4);     // Catch: Throwable -> L31
        r4.setBitmap(null);     // Catch: Throwable -> L31
        r0.unlock();
        r73 = r3;
    L31:
        th = move-exception;
        r0.unlock();
        throw th;
    L10:
        if (r72.getIntrinsicWidth() > 0) goto L15;
        if (Log.isLoggable("DrawableToBitmap", 5) == false) goto L14;
        r72.toString();
        goto L14
    }

    /* JADX INFO: renamed from: f */
    public static C1538iG m272f(String r2) {
        AbstractC0295Gu.m625r(-578300166535221L);
        int r1 = AbstractC1450gG.f5067a;
        return new C1538iG(AbstractC1406fG.m2718r0(r2));
    }

    /* JADX INFO: renamed from: g */
    public static C0683Pv m273g(ComponentCallbacks2C1273a r38, ArrayList r39) {
        InterfaceC0565N5 r1 = r38.f4337a;
        C2812zp r2 = r38.f4340d;
        C0756Rj r0 = r38.f4339c;
        Context r3 = r0.getApplicationContext();
        C0132D2 r02 = r0.f2403h;
        C0683Pv r4 = new C0683Pv();
        Class<InputStream> r5 = InputStream.class;
        C0878Uc r9 = new C0878Uc();
        C0752Rf r6 = r4.f2188g;
        monitor-enter(r6);
        r6.f2389a.add(r9);     // Catch: Throwable -> L35
        monitor-exit(r6);
        int r62 = Build.VERSION.SDK_INT;
        C0281Gg r92 = new C0281Gg();
        C0752Rf r13 = r4.f2188g;
        monitor-enter(r13);
        r13.f2389a.add(r92);     // Catch: Throwable -> L32
        monitor-exit(r13);
        Resources r63 = r3.getResources();
        ArrayList r93 = r4.m1377e();
        C2306o6 r132 = new C2306o6(r3, r93, r1, r2);
        C0916VD r133 = new C0916VD(r1, new C1517hw(24));
        C2543te r64 = new C2543te(r4.m1377e(), r63.getDisplayMetrics(), r1, r2);
        if (((Map) r02.f328b).containsKey(AbstractC0585Nj.class) == false) goto L16;
        C2129k6 r7 = new C2129k6(1);
        InterfaceC2518sw r134 = new C2129k6(0);
        InterfaceC2518sw r72 = r7;
    L17:
        int r11 = 1;
        r4.m1376d("Animation", InputStream.class, Drawable.class, new C0347I2(new C0649P3(r11, r93, r2), r11));
        r4.m1376d("Animation", ByteBuffer.class, Drawable.class, new C0347I2(new C0649P3(r11, r93, r2), 0));
        C2604uw r03 = new C2604uw(r3);
        C0436K5 r12 = new C0436K5(r2);
        C0307H5 r112 = new C0307H5(0, false);
        C0668Pg r04 = new C0668Pg(10);
        ContentResolver r32 = r3.getContentResolver();
        r4.m1373a(ByteBuffer.class, new C1456gf(29));
        r4.m1373a(InputStream.class, new C1017Xm(15, r2));
        r4.m1376d("Bitmap", ByteBuffer.class, Bitmap.class, r134);
        r4.m1376d("Bitmap", InputStream.class, Bitmap.class, r72);
        String r113 = Build.FINGERPRINT;
        if ("robolectric".equals(r113) == true) goto L20;
        ContentResolver r37 = r32;
        C2085j6 r05 = new C2085j6(r64, 1);
        Class r33 = ParcelFileDescriptor.class;
        r4.m1376d("Bitmap", r33, Bitmap.class, r05);
    L21:
        r4.m1376d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C0916VD(r1, new C1517hw(21)));
        r4.m1376d("Bitmap", r33, Bitmap.class, r133);
        C1456gf r65 = C1456gf.f5167k;
        r4.m1375c(Bitmap.class, Bitmap.class, r65);
        r4.m1376d("Bitmap", Bitmap.class, Bitmap.class, new C2194lh(1));
        r4.m1374b(Bitmap.class, r12);
        r4.m1376d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0350I5(r63, r134));
        r4.m1376d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0350I5(r63, r72));
        r4.m1376d("BitmapDrawable", r33, BitmapDrawable.class, new C0350I5(r63, r133));
        r4.m1374b(BitmapDrawable.class, new C0649P3(7, r1, r12));
        r4.m1376d("Animation", InputStream.class, C0026Aj.class, new C2077iz(r93, r132, r2));
        r4.m1376d("Animation", ByteBuffer.class, C0026Aj.class, r132);
        r4.m1374b(C0026Aj.class, new C0668Pg(11));
        r4.m1375c(C0986Wy.class, C0986Wy.class, r65);
        r4.m1376d("Bitmap", C0986Wy.class, Bitmap.class, new C0479L5(r1));
        r4.m1376d("legacy_append", Uri.class, Drawable.class, r03);
        r4.m1376d("legacy_append", Uri.class, Bitmap.class, new C0350I5(1, r03, r1));
        int r135 = 0;
        r4.m1380h(new C2349p6(r135));
        r4.m1375c(File.class, ByteBuffer.class, new C2220m6(r135));
        r4.m1375c(File.class, InputStream.class, new C2280nh(new C0668Pg(6)));
        r4.m1376d("legacy_append", File.class, File.class, new C2194lh(0));
        r4.m1375c(File.class, r33, new C2280nh(new C0668Pg(5)));
        r4.m1375c(File.class, File.class, r65);
        r4.m1380h(new C2550tl(r2));
        if ("robolectric".equals(r113) == true) goto L24;
        r4.m1380h(new C2349p6(2));
    L24:
        C0793Sd r22 = new C0793Sd(r3, 2);
        C0793Sd r66 = new C0793Sd(r3, 0);
        C0793Sd r14 = new C0793Sd(r3, 1);
        Class r8 = Integer.TYPE;
        r4.m1375c(r8, InputStream.class, r22);
        r4.m1375c(Integer.class, InputStream.class, r22);
        r4.m1375c(r8, AssetFileDescriptor.class, r66);
        r4.m1375c(Integer.class, AssetFileDescriptor.class, r66);
        r4.m1375c(r8, Drawable.class, r14);
        r4.m1375c(Integer.class, Drawable.class, r14);
        r4.m1375c(Uri.class, InputStream.class, new C0793Sd(r3, 9));
        r4.m1375c(Uri.class, AssetFileDescriptor.class, new C0793Sd(r3, 8));
        C0393J5 r67 = new C0393J5(r63, 3);
        C0393J5 r142 = new C0393J5(r63, 1);
        C0393J5 r06 = new C0393J5(r63, 2);
        r4.m1375c(Integer.class, Uri.class, r67);
        r4.m1375c(r8, Uri.class, r67);
        r4.m1375c(Integer.class, AssetFileDescriptor.class, r142);
        r4.m1375c(r8, AssetFileDescriptor.class, r142);
        r4.m1375c(Integer.class, InputStream.class, r06);
        r4.m1375c(r8, InputStream.class, r06);
        r4.m1375c(String.class, InputStream.class, new C0132D2(14));
        r4.m1375c(Uri.class, InputStream.class, new C0132D2(14));
        r4.m1375c(String.class, InputStream.class, new C1517hw(11));
        r4.m1375c(String.class, r33, new C1517hw(10));
        r4.m1375c(String.class, AssetFileDescriptor.class, new C1517hw(9));
        r4.m1375c(Uri.class, InputStream.class, new C0864U4(r3.getAssets(), 1));
        r4.m1375c(Uri.class, AssetFileDescriptor.class, new C0864U4(r3.getAssets(), 0));
        r4.m1375c(Uri.class, InputStream.class, new C0793Sd(r3, 6));
        r4.m1375c(Uri.class, InputStream.class, new C0793Sd(r3, 7));
        if (r62 < 29) goto L27;
        r4.m1375c(Uri.class, InputStream.class, new C0424Ju(r3, r5));
        r4.m1375c(Uri.class, r33, new C0424Ju(r3, r33));
    L27:
        boolean r07 = ((Map) r02.f328b).containsKey(AbstractC0714Qj.class);
        ContentResolver r82 = r37;
        r4.m1375c(Uri.class, InputStream.class, new C2270nD(r82, r07, 2));
        r4.m1375c(Uri.class, r33, new C2270nD(r82, r07, 1));
        r4.m1375c(Uri.class, AssetFileDescriptor.class, new C2270nD(r82, r07, 0));
        r4.m1375c(Uri.class, InputStream.class, new C1517hw(18));
        r4.m1375c(URL.class, InputStream.class, new C1517hw(17));
        r4.m1375c(Uri.class, File.class, new C0793Sd(r3, 5));
        r4.m1375c(C1057Yj.class, InputStream.class, new C0132D2(25));
        r4.m1375c(byte[].class, ByteBuffer.class, new C1456gf(26));
        r4.m1375c(byte[].class, InputStream.class, new C1456gf(28));
        r4.m1375c(Uri.class, Uri.class, r65);
        r4.m1375c(Drawable.class, Drawable.class, r65);
        r4.m1376d("legacy_append", Drawable.class, Drawable.class, new C2194lh(2));
        r4.m1381i(Bitmap.class, BitmapDrawable.class, new C0393J5(r63, 0));
        r4.m1381i(Bitmap.class, byte[].class, r112);
        r4.m1381i(Drawable.class, byte[].class, new C2656w4(r1, r112, r04, 10));
        r4.m1381i(C0026Aj.class, byte[].class, r04);
        C0916VD r08 = new C0916VD(r1, new C1517hw(22));
        r4.m1376d("legacy_append", ByteBuffer.class, Bitmap.class, r08);
        r4.m1376d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0350I5(r63, r08));
        Iterator r09 = r39.iterator();
        if (r09.hasNext() == true) goto L30;
        return r4;
    L30:
        r09.next().getClass();
        throw new ClassCastException();
    L20:
        r37 = r32;
        r33 = ParcelFileDescriptor.class;
        goto L21
    L16:
        C2085j6 r136 = new C2085j6(r64, 0);
        r72 = new C0350I5(2, r64, r2);
        r134 = r136;
    L32:
        th = move-exception;
        throw th;
    L35:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m274h(char r2, char r3, boolean r4) {
        if (r2 != r3) goto L6;
        return true;
    L6:
        if (r4 == true) goto L8;
        return false;
    L8:
        char r22 = Character.toUpperCase(r2);
        char r32 = Character.toUpperCase(r3);
        if (r22 != r32) goto L11;
    L14:
        return true;
    L11:
        if (Character.toLowerCase(r22) == Character.toLowerCase(r32)) goto L14;
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static C1405fF m275i(C2454rb r7, int r8, ArrayList r9, C1405fF r10) {
        if (r8 != 0) goto L4;
        int r0 = r7.f8633n0;
    L5:
        int r1 = 0;
        if (r0 == (-1)) goto L19;
        if (r10 != null) goto L9;
    L10:
        int r3 = 0;
    L12:
        if (r3 >= r9.size()) goto L22;
        C1405fF r4 = (C1405fF) r9.get(r3);
        if (r4.f4979b == r0) goto L15;
        r3 = r3 + 1;
        goto L12
    L15:
        if (r10 == null) goto L17;
        r10.m2679c(r8, r4);
        r9.remove(r10);
    L17:
        r10 = r4;
    L22:
        if (r10 == null) goto L24;
    L50:
        int r2 = r10.f4979b;
        ArrayList r32 = r10.f4978a;
        if (r32.contains(r7) == false) goto L53;
        return r10;
    L53:
        r32.add(r7);
        if ((r7 instanceof C2150kk) == false) goto L59;
        C2150kk r33 = (C2150kk) r7;
        C1259cb r42 = r33.f7521t0;
        if (r33.f7522u0 != 0) goto L58;
        r1 = 1;
    L58:
        r42.m2382c(r1, r10, r9);
    L59:
        if (r8 != 0) goto L61;
        r7.f8633n0 = r2;
        r7.f8588I.m2382c(r8, r10, r9);
        r7.f8590K.m2382c(r8, r10, r9);
    L62:
        r7.f8595P.m2382c(r8, r10, r9);
        return r10;
    L61:
        r7.f8635o0 = r2;
        r7.f8589J.m2382c(r8, r10, r9);
        r7.f8592M.m2382c(r8, r10, r9);
        r7.f8591L.m2382c(r8, r10, r9);
        goto L62
    L24:
        if ((r7 instanceof AbstractC2592uk) == false) goto L47;
        AbstractC2592uk r34 = (AbstractC2592uk) r7;
        int r43 = 0;
    L27:
        if (r43 >= r34.f8966r0) goto L38;
        C2454rb r5 = r34.f8965q0[r43];
        if (r8 != 0) goto L33;
        int r6 = r5.f8633n0;
        if (r6 == (-1)) goto L33;
    L39:
        if (r6 == (-1)) goto L47;
        int r35 = 0;
    L42:
        if (r35 >= r9.size()) goto L47;
        C1405fF r44 = (C1405fF) r9.get(r35);
        if (r44.f4979b == r6) goto L45;
        r35 = r35 + 1;
        goto L42
    L45:
        r10 = r44;
    L33:
        if (r8 != 1) goto L37;
        r6 = r5.f8635o0;
        if (r6 != (-1)) goto L39;
    L37:
        r43 = r43 + 1;
        goto L27
    L38:
        r6 = -1;
    L47:
        if (r10 != null) goto L49;
        r10 = new C1405fF();
        r10.f4978a = new ArrayList();
        r10.f4981d = null;
        r10.f4982e = -1;
        int r22 = C1405fF.f4977f;
        C1405fF.f4977f = r22 + 1;
        r10.f4979b = r22;
        r10.f4980c = r8;
    L49:
        r9.add(r10);
        goto L50
    L9:
        if (r0 != r10.f4979b) goto L10;
    L19:
        if (r0 == (-1)) goto L22;
        return r10;
    L4:
        r0 = r7.f8635o0;
        goto L5
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1137ac m276j(InterfaceC1137ac r3, InterfaceC1137ac r4, boolean r5) {
        Boolean r52 = Boolean.FALSE;
        boolean r0 = ((Boolean) r3.mo25q(r52, new C0309H7(7))).booleanValue();
        boolean r53 = ((Boolean) r4.mo25q(r52, new C0309H7(7))).booleanValue();
        if (r0 == true) goto L7;
        if (r53 == true) goto L7;
        return r3.mo23l(r4);
    L7:
        C0309H7 r02 = new C0309H7(8);
        C0366If r1 = C0366If.f1247a;
        InterfaceC1137ac r32 = (InterfaceC1137ac) r3.mo25q(r1, r02);
        Object r42 = r4;
        if (r53 == false) goto L11;
        r42 = r4.mo25q(r1, new C0309H7(9));
    L11:
        return r32.mo23l((InterfaceC1137ac) r42);
    }

    /* JADX INFO: renamed from: k */
    public static Drawable m277k(Context r1, Context r2, int r3, Resources.Theme r4) {
    L6:
        e = move-exception;
        if (r1.getPackageName().equals(r2.getPackageName()) == false) goto L10;
        throw e;
    L10:
        return r2.getDrawable(r3);
    L12:
        f400q = false;
        goto L13
    L3:
        if (f400q == false) goto L13;
        return m281o(r2, r3, r4);
    L13:
        if (r4 != null) goto L16;
        r4 = r2.getTheme();
    L16:
        Resources r12 = r2.getResources();
        ThreadLocal r22 = AbstractC0125Cw.f295a;
        return r12.getDrawable(r3, r4);
    }

    /* JADX INFO: renamed from: l */
    public static final String m278l(Object r0) {
        return Integer.toHexString(System.identityHashCode(r0));
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m279m(Bitmap r10, int r11) {
        AbstractC0295Gu.m625r(-779579513894965L);
        int r0 = Math.min(r10.getWidth(), r10.getHeight());
        Bitmap r1 = Bitmap.createBitmap(r0, r0, Bitmap.Config.ARGB_8888);
        AbstractC0295Gu.m625r(-779609578666037L);
        Canvas r2 = new Canvas(r1);
        Paint r3 = new Paint();
        Rect r4 = new Rect(0, 0, r0, r0);
        RectF r6 = new RectF(r4);
        r3.setAntiAlias(true);
        r3.setColor(-16777216);
        r2.drawARGB(0, 0, 0, 0);
        int r112 = AbstractC0828TB.m1639f(r11, 100);
        float r02 = (r0 / 2.0f) * (r112 / 100.0f);
        if (r112 < 100) goto L5;
        r2.drawOval(r6, r3);
    L8:
        r3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        r2.drawBitmap(r10, new Rect(0, 0, r10.getWidth(), r10.getHeight()), r4, r3);
        return r1;
    L5:
        if (r112 > 0) goto L7;
        r2.drawRect(r6, r3);
        goto L8
    L7:
        r2.drawRoundRect(r6, r02, r02, r3);
        goto L8
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC0159Dn m280n(int r2, InterfaceC0884Ui r3) {
        C1456gf r0 = C1456gf.f5166j;
        int r22 = AbstractC0213Ey.m424v(r2);
        if (r22 == 0) goto L15;
        if (r22 != 1) goto L7;
        C1113Zw r23 = new C1113Zw();
        r23.f3512a = r3;
        r23.f3513b = r0;
        return r23;
    L7:
        if (r22 != 2) goto L11;
        C1359eD r24 = new C1359eD();
        r24.f4861a = r3;
        r24.f4862b = r0;
        return r24;
    L11:
        throw new C0232Fa();
    L15:
        return new C1251cA(r3);
    }

    /* JADX INFO: renamed from: o */
    public static Drawable m281o(Context r1, int r2, Resources.Theme r3) {
        if (r3 == null) goto L5;
        C0147Db r0 = new C0147Db(r1);
        r0.f380b = r3;
        r0.m265a(r3.getResources().getConfiguration());
        r1 = r0;
    L5:
        return AbstractC1406fG.m2695U(r1, r2);
    }

    /* JADX INFO: renamed from: p */
    public static PorterDuff.Mode m282p(int r1, PorterDuff.Mode r2) {
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

    /* JADX INFO: renamed from: q */
    public static int m283q(float r1) {
        if (Float.isNaN(r1) == true) goto L7;
        return Math.round(r1);
    L7:
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* JADX INFO: renamed from: r */
    public static void m284r(TextView r2, int r3) {
        AbstractC1293cr.m2546e(r3);
        if (r3 == r2.getPaint().getFontMetricsInt(null)) goto L6;
        r2.setLineSpacing(r3 - r0, 1.0f);
        return;
    }

    /* JADX INFO: renamed from: s */
    public static String m285s(String r1) {
        int r0 = r1.hashCode();
        switch(r0) {
            case -2061550653: goto L300;
            case -2056817302: goto L295;
            case -2034166429: goto L290;
            case -1979556166: goto L285;
            case -1571515090: goto L280;
            case -1383349348: goto L275;
            case -1383343454: goto L270;
            case -1325958191: goto L265;
            case -1182275604: goto L262;
            case -1062240117: goto L257;
            case -688322466: goto L252;
            case -527879800: goto L247;
            case -515992664: goto L242;
            case -246476834: goto L239;
            case -207262728: goto L236;
            case -165139126: goto L231;
            case 104431: goto L228;
            case 3039496: goto L223;
            case 3052374: goto L218;
            case 3327612: goto L213;
            case 64711720: goto L208;
            case 65821278: goto L203;
            case 77230534: goto L200;
            case 97526364: goto L197;
            case 109413500: goto L194;
            case 155276373: goto L191;
            case 226173651: goto L188;
            case 344809556: goto L185;
            case 398507100: goto L182;
            case 398585941: goto L177;
            case 398795216: goto L174;
            case 482629606: goto L171;
            case 499831342: goto L166;
            case 577341676: goto L161;
            case 599019395: goto L158;
            case 761287205: goto L155;
            case 1052881309: goto L150;
            case 1063877011: goto L145;
            case 1195259493: goto L140;
            case 1275614662: goto L135;
            case 1383693018: goto L132;
            case 1630335596: goto L127;
            case 1877171123: goto L124;
            default: goto L4;
        };
    L4:
        switch(r0) {
            case -1811142716: goto L119;
            case -1811142715: goto L114;
            case -1811142714: goto L109;
            case -1811142713: goto L104;
            case -1811142712: goto L99;
            case -1811142711: goto L94;
            case -1811142710: goto L89;
            case -1811142709: goto L84;
            case -1811142708: goto L79;
            case -1811142707: goto L74;
            default: goto L5;
        };
    L5:
        switch(r0) {
            case -1811142685: goto L69;
            case -1811142684: goto L64;
            case -1811142683: goto L59;
            default: goto L6;
        };
    L6:
        switch(r0) {
            case 80123371: goto L54;
            case 80123372: goto L49;
            case 80123373: goto L44;
            case 80123374: goto L39;
            case 80123375: goto L34;
            case 80123376: goto L29;
            case 80123377: goto L24;
            case 80123378: goto L19;
            case 80123379: goto L14;
            case 80123380: goto L9;
            default: goto L313;
        };
    L313:
        return null;
    L9:
        if (r1.equals("kotlin.jvm.functions.Function9") == false) goto L314;
        return "Function9";
    L314:
        return null;
    L14:
        if (r1.equals("kotlin.jvm.functions.Function8") == false) goto L315;
        return "Function8";
    L315:
        return null;
    L19:
        if (r1.equals("kotlin.jvm.functions.Function7") == false) goto L316;
        return "Function7";
    L316:
        return null;
    L24:
        if (r1.equals("kotlin.jvm.functions.Function6") == false) goto L317;
        return "Function6";
    L317:
        return null;
    L29:
        if (r1.equals("kotlin.jvm.functions.Function5") == false) goto L318;
        return "Function5";
    L318:
        return null;
    L34:
        if (r1.equals("kotlin.jvm.functions.Function4") == false) goto L319;
        return "Function4";
    L319:
        return null;
    L39:
        if (r1.equals("kotlin.jvm.functions.Function3") == false) goto L320;
        return "Function3";
    L320:
        return null;
    L44:
        if (r1.equals("kotlin.jvm.functions.Function2") == false) goto L321;
        return "Function2";
    L321:
        return null;
    L49:
        if (r1.equals("kotlin.jvm.functions.Function1") == false) goto L322;
        return "Function1";
    L322:
        return null;
    L54:
        if (r1.equals("kotlin.jvm.functions.Function0") == false) goto L323;
        return "Function0";
    L323:
        return null;
    L59:
        if (r1.equals("kotlin.jvm.functions.Function22") == false) goto L324;
        return "Function22";
    L324:
        return null;
    L64:
        if (r1.equals("kotlin.jvm.functions.Function21") == false) goto L325;
        return "Function21";
    L325:
        return null;
    L69:
        if (r1.equals("kotlin.jvm.functions.Function20") == false) goto L326;
        return "Function20";
    L326:
        return null;
    L74:
        if (r1.equals("kotlin.jvm.functions.Function19") == false) goto L327;
        return "Function19";
    L327:
        return null;
    L79:
        if (r1.equals("kotlin.jvm.functions.Function18") == false) goto L328;
        return "Function18";
    L328:
        return null;
    L84:
        if (r1.equals("kotlin.jvm.functions.Function17") == false) goto L329;
        return "Function17";
    L329:
        return null;
    L89:
        if (r1.equals("kotlin.jvm.functions.Function16") == false) goto L330;
        return "Function16";
    L330:
        return null;
    L94:
        if (r1.equals("kotlin.jvm.functions.Function15") == false) goto L331;
        return "Function15";
    L331:
        return null;
    L99:
        if (r1.equals("kotlin.jvm.functions.Function14") == false) goto L332;
        return "Function14";
    L332:
        return null;
    L104:
        if (r1.equals("kotlin.jvm.functions.Function13") == false) goto L333;
        return "Function13";
    L333:
        return null;
    L109:
        if (r1.equals("kotlin.jvm.functions.Function12") == false) goto L334;
        return "Function12";
    L334:
        return null;
    L114:
        if (r1.equals("kotlin.jvm.functions.Function11") == false) goto L335;
        return "Function11";
    L335:
        return null;
    L119:
        if (r1.equals("kotlin.jvm.functions.Function10") == false) goto L336;
        return "Function10";
    L336:
        return null;
    L124:
        if (r1.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L337;
        return "Companion";
    L337:
        return null;
    L127:
        if (r1.equals("java.lang.Throwable") == false) goto L338;
        return "Throwable";
    L338:
        return null;
    L132:
        if (r1.equals("kotlin.jvm.internal.BooleanCompanionObject") == true) goto L379;
        return null;
    L379:
        return "Companion";
    L135:
        if (r1.equals("java.lang.Iterable") == false) goto L340;
        return "Iterable";
    L340:
        return null;
    L140:
        if (r1.equals("java.lang.String") == false) goto L341;
        return "String";
    L341:
        return null;
    L145:
        if (r1.equals("java.lang.Object") == false) goto L342;
        return "Any";
    L342:
        return null;
    L150:
        if (r1.equals("java.lang.Number") == false) goto L343;
        return "Number";
    L343:
        return null;
    L155:
        if (r1.equals("java.lang.Double") == false) goto L344;
        return "Double";
    L344:
        return null;
    L158:
        if (r1.equals("kotlin.jvm.internal.StringCompanionObject") == true) goto L380;
        return null;
    L380:
        return "Companion";
    L161:
        if (r1.equals("java.util.ListIterator") == false) goto L346;
        return "ListIterator";
    L346:
        return null;
    L166:
        if (r1.equals("java.util.Iterator") == false) goto L347;
        return "Iterator";
    L347:
        return null;
    L171:
        if (r1.equals("kotlin.jvm.internal.FloatCompanionObject") == true) goto L381;
        return null;
    L381:
        return "Companion";
    L174:
        if (r1.equals("java.lang.Long") == false) goto L349;
        return "Long";
    L349:
        return null;
    L177:
        if (r1.equals("java.lang.Enum") == false) goto L350;
        return "Enum";
    L350:
        return null;
    L182:
        if (r1.equals("java.lang.Byte") == false) goto L351;
        return "Byte";
    L351:
        return null;
    L185:
        if (r1.equals("java.lang.Boolean") == false) goto L352;
        return "Boolean";
    L352:
        return null;
    L188:
        if (r1.equals("kotlin.jvm.internal.EnumCompanionObject") == true) goto L382;
        return null;
    L382:
        return "Companion";
    L191:
        if (r1.equals("java.lang.Character") == false) goto L354;
        return "Char";
    L354:
        return null;
    L194:
        if (r1.equals("short") == false) goto L355;
        return "Short";
    L355:
        return null;
    L197:
        if (r1.equals("float") == false) goto L356;
        return "Float";
    L356:
        return null;
    L200:
        if (r1.equals("kotlin.jvm.internal.ShortCompanionObject") == true) goto L383;
        return null;
    L383:
        return "Companion";
    L203:
        if (r1.equals("java.util.List") == false) goto L358;
        return "List";
    L358:
        return null;
    L208:
        if (r1.equals("boolean") == false) goto L359;
        return "Boolean";
    L359:
        return null;
    L213:
        if (r1.equals("long") == false) goto L360;
        return "Long";
    L360:
        return null;
    L218:
        if (r1.equals("char") == false) goto L361;
        return "Char";
    L361:
        return null;
    L223:
        if (r1.equals("byte") == false) goto L362;
        return "Byte";
    L362:
        return null;
    L228:
        if (r1.equals("int") == false) goto L363;
        return "Int";
    L363:
        return null;
    L231:
        if (r1.equals("java.util.Map$Entry") == false) goto L364;
        return "Entry";
    L364:
        return null;
    L236:
        if (r1.equals("kotlin.jvm.internal.LongCompanionObject") == true) goto L384;
        return null;
    L384:
        return "Companion";
    L239:
        if (r1.equals("kotlin.jvm.internal.CharCompanionObject") == true) goto L385;
        return null;
    L385:
        return "Companion";
    L242:
        if (r1.equals("java.lang.Short") == false) goto L367;
        return "Short";
    L367:
        return null;
    L247:
        if (r1.equals("java.lang.Float") == false) goto L368;
        return "Float";
    L368:
        return null;
    L252:
        if (r1.equals("java.util.Collection") == false) goto L369;
        return "Collection";
    L369:
        return null;
    L257:
        if (r1.equals("java.lang.CharSequence") == false) goto L370;
        return "CharSequence";
    L370:
        return null;
    L262:
        if (r1.equals("kotlin.jvm.internal.ByteCompanionObject") == true) goto L386;
        return null;
    L386:
        return "Companion";
    L265:
        if (r1.equals("double") == false) goto L372;
        return "Double";
    L372:
        return null;
    L270:
        if (r1.equals("java.util.Set") == false) goto L373;
        return "Set";
    L373:
        return null;
    L275:
        if (r1.equals("java.util.Map") == false) goto L374;
        return "Map";
    L374:
        return null;
    L280:
        if (r1.equals("java.lang.Comparable") == false) goto L375;
        return "Comparable";
    L375:
        return null;
    L285:
        if (r1.equals("java.lang.annotation.Annotation") == false) goto L376;
        return "Annotation";
    L376:
        return null;
    L290:
        if (r1.equals("java.lang.Cloneable") == false) goto L377;
        return "Cloneable";
    L377:
        return null;
    L295:
        if (r1.equals("java.lang.Integer") == false) goto L378;
        return "Int";
    L378:
        return null;
    L300:
        if (r1.equals("kotlin.jvm.internal.DoubleCompanionObject") == true) goto L387;
        return null;
    L387:
        return "Companion";
    }

    /* JADX INFO: renamed from: t */
    public static final Object m286t(C2339ox r3, C2339ox r4, Function2 r5) {
        C2610v1 r0 = AbstractC0295Gu.f998c;
        AbstractC0828TB.m1636c(2, r5);     // Catch: Throwable -> L5 C1324de -> L7
        Object r42 = r5.mo446d(r4, r3);     // Catch: Throwable -> L5 C1324de -> L7
    L10:
        EnumC1453gc r52 = EnumC1453gc.f5148a;
        if (r42 == r52) goto L47;
        Object r43 = r3.m4347E(r42);
        if (r43 == r0) goto L48;
        r3.mo4745O();
        if ((r43 instanceof C0189Ea) == true) goto L30;
        if ((r43 instanceof C1462gl) == false) goto L21;
        C1462gl r32 = (C1462gl) r43;
    L22:
        if (r32 == null) goto L28;
        InterfaceC1418fl r33 = r32.f5181a;
        if (r33 == null) goto L28;
        return r33;
    L28:
        return r43;
    L21:
        r32 = null;
        goto L22
    L30:
        throw ((C0189Ea) r43).f575a;
    L48:
        return r52;
    L47:
        return r52;
    L7:
        e = move-exception;
        Throwable r44 = e.f4800a;
        C0189Ea r53 = new C0189Ea(r44, false);
    L32:
        Object r1 = r3.m4353M(C2152km.f7529a.get(r3), r53);
        if (r1 == AbstractC0295Gu.f997b) goto L39;
        if (r1 == r0) goto L39;
        if (r1 == AbstractC0295Gu.f999d) goto L32;
        r3.mo2728b(r1);
    L39:
        throw r44;
    L5:
        th = move-exception;
        r42 = new C0189Ea(th, false);
        goto L10
    }

    /* JADX INFO: renamed from: u */
    public static final String m287u(InterfaceC0190Eb r3) {
        if ((r3 instanceof C1367ee) == false) goto L17;
        return ((C1367ee) r3).toString();
    L17:
        Object r1 = r3 + '@' + m278l(r3);     // Catch: Throwable -> L9
    L12:
        if (C0340Hw.m726a(r1) == null) goto L16;
        r1 = r3.getClass().getName() + '@' + m278l(r3);
    L16:
        return (String) r1;
    L9:
        th = move-exception;
        r1 = new C0297Gw(th);
        goto L12
    }

    /* JADX INFO: renamed from: v */
    public static final String m288v(byte r1) {
        if (r1 != 1) goto L7;
        return "quotation mark '\"'";
    L7:
        if (r1 != 2) goto L11;
        return "string escape sequence '\\'";
    L11:
        if (r1 != 4) goto L15;
        return "comma ','";
    L15:
        if (r1 != 5) goto L19;
        return "colon ':'";
    L19:
        if (r1 != 6) goto L23;
        return "start of the object '{'";
    L23:
        if (r1 != 7) goto L27;
        return "end of the object '}'";
    L27:
        if (r1 != 8) goto L31;
        return "start of the array '['";
    L31:
        if (r1 != 9) goto L35;
        return "end of the array ']'";
    L35:
        if (r1 != 10) goto L39;
        return "end of the input";
    L39:
        if (r1 != 127) goto L42;
        return "invalid token";
    L42:
        return "valid token";
    }

    /* JADX INFO: renamed from: w */
    public static final C2664wC m289w(InterfaceC0190Eb r2, InterfaceC1137ac r3, Object r4) {
        C2664wC r1 = null;
        if ((r2 instanceof InterfaceC1497hc) == true) goto L6;
    L19:
        return r1;
    L6:
        if (r3.mo24m(C2707xC.f9282a) == null) goto L19;
        InterfaceC1497hc r22 = (InterfaceC1497hc) r2;
    L9:
        if ((r22 instanceof C1411fe) == true) goto L17;
        r22 = r22.mo1012c();
        if (r22 == null) goto L17;
        if ((r22 instanceof C2664wC) == false) goto L9;
        r1 = (C2664wC) r22;
    L17:
        if (r1 == null) goto L19;
        r1.m5233R(r3, r4);
        goto L19
    }

    /* JADX INFO: renamed from: x */
    public static boolean m290x(int r4, int r5, int r6, int r7) {
        if (r6 == 1) goto L9;
        if (r6 == 2) goto L9;
        if (r6 != 4) goto L8;
        if (r4 != 2) goto L9;
    L8:
        boolean r42 = false;
    L10:
        if (r7 == 1) goto L16;
        if (r7 == 2) goto L16;
        if (r7 != 4) goto L15;
        if (r5 != 2) goto L16;
    L15:
        boolean r52 = false;
    L17:
        if (r42 == true) goto L21;
        if (r52 == true) goto L21;
        return false;
    L21:
        return true;
    L16:
        r52 = true;
    L9:
        r42 = true;
        goto L10
    }

    /* JADX INFO: renamed from: y */
    public static Context m291y(Context r1, AttributeSet r2, int r3, int r4) {
        return m292z(r1, r2, r3, r4, new int[0]);
    }

    /* JADX INFO: renamed from: z */
    public static Context m292z(Context r6, AttributeSet r7, int r8, int r9, int[] r10) {
        TypedArray r2 = r6.obtainStyledAttributes(r7, f392i, r8, r9);
        int[] r1 = {r2.getResourceId(0, 0)};
        r2.recycle();
        int r12 = r1[0];
        if ((r6 instanceof C0147Db) == true) goto L5;
    L7:
        boolean r22 = false;
    L8:
        if (r12 == 0) goto L31;
        if (r22 == true) goto L31;
        C0147Db r23 = new C0147Db(r6, r12);
        int r13 = r10.length;
        int[] r4 = new int[r13];
        if (r10.length <= 0) goto L18;
        TypedArray r82 = r6.obtainStyledAttributes(r7, r10, r8, r9);
        int r92 = 0;
    L15:
        if (r92 >= r10.length) goto L17;
        r4[r92] = r82.getResourceId(r92, 0);
        r92 = r92 + 1;
        goto L15
    L17:
        r82.recycle();
    L18:
        int r83 = 0;
    L19:
        if (r83 >= r13) goto L24;
        int r93 = r4[r83];
        if (r93 == 0) goto L23;
        r23.getTheme().applyStyle(r93, true);
    L23:
        r83 = r83 + 1;
        goto L19
    L24:
        TypedArray r62 = r6.obtainStyledAttributes(r7, f391h);
        int r72 = r62.getResourceId(0, 0);
        int r84 = r62.getResourceId(1, 0);
        r62.recycle();
        if (r72 != 0) goto L28;
        r72 = r84;
    L28:
        if (r72 == 0) goto L30;
        r23.getTheme().applyStyle(r72, true);
    L30:
        return r23;
    L31:
        return r6;
    L5:
        if (((C0147Db) r6).f379a != r12) goto L7;
        r22 = true;
        goto L8
    }
}
