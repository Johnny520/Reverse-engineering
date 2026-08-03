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
    public static final int[] f384a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f385b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f386c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f387d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f388e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f389f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final C2672we f390g = new C2672we(24);

    /* JADX INFO: renamed from: h */
    public static final int[] f391h = {R.attr.theme, io.github.cherrywechat.R.attr.theme};

    /* JADX INFO: renamed from: i */
    public static final int[] f392i = {io.github.cherrywechat.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: j */
    public static final byte[] f393j = {48, 49, 53, 0};

    /* JADX INFO: renamed from: k */
    public static final byte[] f394k = {48, 49, 48, 0};

    /* JADX INFO: renamed from: l */
    public static final byte[] f395l = {48, 48, 57, 0};

    /* JADX INFO: renamed from: m */
    public static final byte[] f396m = {48, 48, 53, 0};

    /* JADX INFO: renamed from: n */
    public static final byte[] f397n = {48, 48, 49, 0};

    /* JADX INFO: renamed from: o */
    public static final byte[] f398o = {48, 48, 49, 0};

    /* JADX INFO: renamed from: p */
    public static final byte[] f399p = {48, 48, 50, 0};

    /* JADX INFO: renamed from: q */
    public static volatile boolean f400q = true;

    /* JADX INFO: renamed from: a */
    public static final C2378pl m267a(InterfaceC0717Qm interfaceC0717Qm, String str) {
        return new C2378pl(str, new C2421ql(interfaceC0717Qm));
    }

    /* JADX INFO: renamed from: b */
    public static void m268b(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC1016Xl.f3224a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0681Pt.f2179a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final byte m269c(char c) {
        if (c < '~') {
            return C2573u7.f8922b[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m270d(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC2785z4.m5356a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static C0608O5 m271e(InterfaceC0565N5 interfaceC0565N5, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC0184EB.f548d;
                    lock.lock();
                    Bitmap bitmapMo52g = interfaceC0565N5.mo52g(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo52g);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo52g;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC0565N5 = f390g;
        }
        return C0608O5.m1187c(interfaceC0565N5, bitmap);
    }

    /* JADX INFO: renamed from: f */
    public static C1538iG m272f(String str) {
        AbstractC0295Gu.m625r(-578300166535221L);
        int i = AbstractC1450gG.f5067a;
        return new C1538iG(AbstractC1406fG.m2718r0(str));
    }

    /* JADX INFO: renamed from: g */
    public static C0683Pv m273g(ComponentCallbacks2C1273a componentCallbacks2C1273a, ArrayList arrayList) {
        InterfaceC2518sw c0350i5;
        InterfaceC2518sw c2129k6;
        ContentResolver contentResolver;
        Class cls;
        InterfaceC0565N5 interfaceC0565N5 = componentCallbacks2C1273a.f4337a;
        C2812zp c2812zp = componentCallbacks2C1273a.f4340d;
        C0756Rj c0756Rj = componentCallbacks2C1273a.f4339c;
        Context applicationContext = c0756Rj.getApplicationContext();
        C0132D2 c0132d2 = c0756Rj.f2403h;
        C0683Pv c0683Pv = new C0683Pv();
        Class<InputStream> cls2 = InputStream.class;
        C0878Uc c0878Uc = new C0878Uc();
        C0752Rf c0752Rf = c0683Pv.f2188g;
        synchronized (c0752Rf) {
            c0752Rf.f2389a.add(c0878Uc);
        }
        int i = Build.VERSION.SDK_INT;
        C0281Gg c0281Gg = new C0281Gg();
        C0752Rf c0752Rf2 = c0683Pv.f2188g;
        synchronized (c0752Rf2) {
            c0752Rf2.f2389a.add(c0281Gg);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM1377e = c0683Pv.m1377e();
        C2306o6 c2306o6 = new C2306o6(applicationContext, arrayListM1377e, interfaceC0565N5, c2812zp);
        C0916VD c0916vd = new C0916VD(interfaceC0565N5, new C1517hw(24));
        C2543te c2543te = new C2543te(c0683Pv.m1377e(), resources.getDisplayMetrics(), interfaceC0565N5, c2812zp);
        if (((Map) c0132d2.f328b).containsKey(AbstractC0585Nj.class)) {
            C2129k6 c2129k62 = new C2129k6(1);
            c2129k6 = new C2129k6(0);
            c0350i5 = c2129k62;
        } else {
            C2085j6 c2085j6 = new C2085j6(c2543te, 0);
            c0350i5 = new C0350I5(2, c2543te, c2812zp);
            c2129k6 = c2085j6;
        }
        int i2 = 1;
        c0683Pv.m1376d("Animation", InputStream.class, Drawable.class, new C0347I2(new C0649P3(i2, arrayListM1377e, c2812zp), i2));
        c0683Pv.m1376d("Animation", ByteBuffer.class, Drawable.class, new C0347I2(new C0649P3(i2, arrayListM1377e, c2812zp), 0));
        C2604uw c2604uw = new C2604uw(applicationContext);
        C0436K5 c0436k5 = new C0436K5(c2812zp);
        C0307H5 c0307h5 = new C0307H5(0, false);
        C0668Pg c0668Pg = new C0668Pg(10);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        c0683Pv.m1373a(ByteBuffer.class, new C1456gf(29));
        c0683Pv.m1373a(InputStream.class, new C1017Xm(15, c2812zp));
        c0683Pv.m1376d("Bitmap", ByteBuffer.class, Bitmap.class, c2129k6);
        c0683Pv.m1376d("Bitmap", InputStream.class, Bitmap.class, c0350i5);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
            c0683Pv.m1376d("Bitmap", cls, Bitmap.class, new C2085j6(c2543te, 1));
        }
        c0683Pv.m1376d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C0916VD(interfaceC0565N5, new C1517hw(21)));
        c0683Pv.m1376d("Bitmap", cls, Bitmap.class, c0916vd);
        C1456gf c1456gf = C1456gf.f5167k;
        c0683Pv.m1375c(Bitmap.class, Bitmap.class, c1456gf);
        c0683Pv.m1376d("Bitmap", Bitmap.class, Bitmap.class, new C2194lh(1));
        c0683Pv.m1374b(Bitmap.class, c0436k5);
        c0683Pv.m1376d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0350I5(resources, c2129k6));
        c0683Pv.m1376d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0350I5(resources, c0350i5));
        c0683Pv.m1376d("BitmapDrawable", cls, BitmapDrawable.class, new C0350I5(resources, c0916vd));
        c0683Pv.m1374b(BitmapDrawable.class, new C0649P3(7, interfaceC0565N5, c0436k5));
        c0683Pv.m1376d("Animation", InputStream.class, C0026Aj.class, new C2077iz(arrayListM1377e, c2306o6, c2812zp));
        c0683Pv.m1376d("Animation", ByteBuffer.class, C0026Aj.class, c2306o6);
        c0683Pv.m1374b(C0026Aj.class, new C0668Pg(11));
        c0683Pv.m1375c(C0986Wy.class, C0986Wy.class, c1456gf);
        c0683Pv.m1376d("Bitmap", C0986Wy.class, Bitmap.class, new C0479L5(interfaceC0565N5));
        c0683Pv.m1376d("legacy_append", Uri.class, Drawable.class, c2604uw);
        c0683Pv.m1376d("legacy_append", Uri.class, Bitmap.class, new C0350I5(1, c2604uw, interfaceC0565N5));
        int i3 = 0;
        c0683Pv.m1380h(new C2349p6(i3));
        c0683Pv.m1375c(File.class, ByteBuffer.class, new C2220m6(i3));
        c0683Pv.m1375c(File.class, InputStream.class, new C2280nh(new C0668Pg(6)));
        c0683Pv.m1376d("legacy_append", File.class, File.class, new C2194lh(0));
        c0683Pv.m1375c(File.class, cls, new C2280nh(new C0668Pg(5)));
        c0683Pv.m1375c(File.class, File.class, c1456gf);
        c0683Pv.m1380h(new C2550tl(c2812zp));
        if (!"robolectric".equals(str)) {
            c0683Pv.m1380h(new C2349p6(2));
        }
        C0793Sd c0793Sd = new C0793Sd(applicationContext, 2);
        C0793Sd c0793Sd2 = new C0793Sd(applicationContext, 0);
        C0793Sd c0793Sd3 = new C0793Sd(applicationContext, 1);
        Class cls3 = Integer.TYPE;
        c0683Pv.m1375c(cls3, InputStream.class, c0793Sd);
        c0683Pv.m1375c(Integer.class, InputStream.class, c0793Sd);
        c0683Pv.m1375c(cls3, AssetFileDescriptor.class, c0793Sd2);
        c0683Pv.m1375c(Integer.class, AssetFileDescriptor.class, c0793Sd2);
        c0683Pv.m1375c(cls3, Drawable.class, c0793Sd3);
        c0683Pv.m1375c(Integer.class, Drawable.class, c0793Sd3);
        c0683Pv.m1375c(Uri.class, InputStream.class, new C0793Sd(applicationContext, 9));
        c0683Pv.m1375c(Uri.class, AssetFileDescriptor.class, new C0793Sd(applicationContext, 8));
        C0393J5 c0393j5 = new C0393J5(resources, 3);
        C0393J5 c0393j52 = new C0393J5(resources, 1);
        C0393J5 c0393j53 = new C0393J5(resources, 2);
        c0683Pv.m1375c(Integer.class, Uri.class, c0393j5);
        c0683Pv.m1375c(cls3, Uri.class, c0393j5);
        c0683Pv.m1375c(Integer.class, AssetFileDescriptor.class, c0393j52);
        c0683Pv.m1375c(cls3, AssetFileDescriptor.class, c0393j52);
        c0683Pv.m1375c(Integer.class, InputStream.class, c0393j53);
        c0683Pv.m1375c(cls3, InputStream.class, c0393j53);
        c0683Pv.m1375c(String.class, InputStream.class, new C0132D2(14));
        c0683Pv.m1375c(Uri.class, InputStream.class, new C0132D2(14));
        c0683Pv.m1375c(String.class, InputStream.class, new C1517hw(11));
        c0683Pv.m1375c(String.class, cls, new C1517hw(10));
        c0683Pv.m1375c(String.class, AssetFileDescriptor.class, new C1517hw(9));
        c0683Pv.m1375c(Uri.class, InputStream.class, new C0864U4(applicationContext.getAssets(), 1));
        c0683Pv.m1375c(Uri.class, AssetFileDescriptor.class, new C0864U4(applicationContext.getAssets(), 0));
        c0683Pv.m1375c(Uri.class, InputStream.class, new C0793Sd(applicationContext, 6));
        c0683Pv.m1375c(Uri.class, InputStream.class, new C0793Sd(applicationContext, 7));
        if (i >= 29) {
            c0683Pv.m1375c(Uri.class, InputStream.class, new C0424Ju(applicationContext, cls2));
            c0683Pv.m1375c(Uri.class, cls, new C0424Ju(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) c0132d2.f328b).containsKey(AbstractC0714Qj.class);
        ContentResolver contentResolver3 = contentResolver;
        c0683Pv.m1375c(Uri.class, InputStream.class, new C2270nD(contentResolver3, zContainsKey, 2));
        c0683Pv.m1375c(Uri.class, cls, new C2270nD(contentResolver3, zContainsKey, 1));
        c0683Pv.m1375c(Uri.class, AssetFileDescriptor.class, new C2270nD(contentResolver3, zContainsKey, 0));
        c0683Pv.m1375c(Uri.class, InputStream.class, new C1517hw(18));
        c0683Pv.m1375c(URL.class, InputStream.class, new C1517hw(17));
        c0683Pv.m1375c(Uri.class, File.class, new C0793Sd(applicationContext, 5));
        c0683Pv.m1375c(C1057Yj.class, InputStream.class, new C0132D2(25));
        c0683Pv.m1375c(byte[].class, ByteBuffer.class, new C1456gf(26));
        c0683Pv.m1375c(byte[].class, InputStream.class, new C1456gf(28));
        c0683Pv.m1375c(Uri.class, Uri.class, c1456gf);
        c0683Pv.m1375c(Drawable.class, Drawable.class, c1456gf);
        c0683Pv.m1376d("legacy_append", Drawable.class, Drawable.class, new C2194lh(2));
        c0683Pv.m1381i(Bitmap.class, BitmapDrawable.class, new C0393J5(resources, 0));
        c0683Pv.m1381i(Bitmap.class, byte[].class, c0307h5);
        c0683Pv.m1381i(Drawable.class, byte[].class, new C2656w4(interfaceC0565N5, c0307h5, c0668Pg, 10));
        c0683Pv.m1381i(C0026Aj.class, byte[].class, c0668Pg);
        C0916VD c0916vd2 = new C0916VD(interfaceC0565N5, new C1517hw(22));
        c0683Pv.m1376d("legacy_append", ByteBuffer.class, Bitmap.class, c0916vd2);
        c0683Pv.m1376d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0350I5(resources, c0916vd2));
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return c0683Pv;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m274h(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: i */
    public static C1405fF m275i(C2454rb c2454rb, int i, ArrayList arrayList, C1405fF c1405fF) {
        int i2;
        int i3 = i == 0 ? c2454rb.f8633n0 : c2454rb.f8635o0;
        if (i3 != -1 && (c1405fF == null || i3 != c1405fF.f4979b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C1405fF c1405fF2 = (C1405fF) arrayList.get(i4);
                if (c1405fF2.f4979b == i3) {
                    if (c1405fF != null) {
                        c1405fF.m2679c(i, c1405fF2);
                        arrayList.remove(c1405fF);
                    }
                    c1405fF = c1405fF2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c1405fF;
        }
        if (c1405fF == null) {
            if (c2454rb instanceof AbstractC2592uk) {
                AbstractC2592uk abstractC2592uk = (AbstractC2592uk) c2454rb;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC2592uk.f8966r0) {
                        i2 = -1;
                        break;
                    }
                    C2454rb c2454rb2 = abstractC2592uk.f8965q0[i5];
                    if ((i == 0 && (i2 = c2454rb2.f8633n0) != -1) || (i == 1 && (i2 = c2454rb2.f8635o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C1405fF c1405fF3 = (C1405fF) arrayList.get(i6);
                        if (c1405fF3.f4979b == i2) {
                            c1405fF = c1405fF3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c1405fF == null) {
                c1405fF = new C1405fF();
                c1405fF.f4978a = new ArrayList();
                c1405fF.f4981d = null;
                c1405fF.f4982e = -1;
                int i7 = C1405fF.f4977f;
                C1405fF.f4977f = i7 + 1;
                c1405fF.f4979b = i7;
                c1405fF.f4980c = i;
            }
            arrayList.add(c1405fF);
        }
        int i8 = c1405fF.f4979b;
        ArrayList arrayList2 = c1405fF.f4978a;
        if (arrayList2.contains(c2454rb)) {
            return c1405fF;
        }
        arrayList2.add(c2454rb);
        if (c2454rb instanceof C2150kk) {
            C2150kk c2150kk = (C2150kk) c2454rb;
            c2150kk.f7521t0.m2382c(c2150kk.f7522u0 == 0 ? 1 : 0, c1405fF, arrayList);
        }
        if (i == 0) {
            c2454rb.f8633n0 = i8;
            c2454rb.f8588I.m2382c(i, c1405fF, arrayList);
            c2454rb.f8590K.m2382c(i, c1405fF, arrayList);
        } else {
            c2454rb.f8635o0 = i8;
            c2454rb.f8589J.m2382c(i, c1405fF, arrayList);
            c2454rb.f8592M.m2382c(i, c1405fF, arrayList);
            c2454rb.f8591L.m2382c(i, c1405fF, arrayList);
        }
        c2454rb.f8595P.m2382c(i, c1405fF, arrayList);
        return c1405fF;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1137ac m276j(InterfaceC1137ac interfaceC1137ac, InterfaceC1137ac interfaceC1137ac2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC1137ac.mo25q(bool, new C0309H7(7))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC1137ac2.mo25q(bool, new C0309H7(7))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC1137ac.mo23l(interfaceC1137ac2);
        }
        C0309H7 c0309h7 = new C0309H7(8);
        C0366If c0366If = C0366If.f1247a;
        InterfaceC1137ac interfaceC1137ac3 = (InterfaceC1137ac) interfaceC1137ac.mo25q(c0366If, c0309h7);
        Object objMo25q = interfaceC1137ac2;
        if (zBooleanValue2) {
            objMo25q = interfaceC1137ac2.mo25q(c0366If, new C0309H7(9));
        }
        return interfaceC1137ac3.mo23l((InterfaceC1137ac) objMo25q);
    }

    /* JADX INFO: renamed from: k */
    public static Drawable m277k(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f400q) {
                return m281o(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f400q = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC0125Cw.f295a;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: l */
    public static final String m278l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m279m(Bitmap bitmap, int i) {
        AbstractC0295Gu.m625r(-779579513894965L);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        AbstractC0295Gu.m625r(-779609578666037L);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, iMin, iMin);
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        canvas.drawARGB(0, 0, 0, 0);
        int iM1639f = AbstractC0828TB.m1639f(i, 100);
        float f = (iMin / 2.0f) * (iM1639f / 100.0f);
        if (iM1639f >= 100) {
            canvas.drawOval(rectF, paint);
        } else if (iM1639f <= 0) {
            canvas.drawRect(rectF, paint);
        } else {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC0159Dn m280n(int i, InterfaceC0884Ui interfaceC0884Ui) {
        C1456gf c1456gf = C1456gf.f5166j;
        int iM424v = AbstractC0213Ey.m424v(i);
        if (iM424v == 0) {
            return new C1251cA(interfaceC0884Ui);
        }
        if (iM424v == 1) {
            C1113Zw c1113Zw = new C1113Zw();
            c1113Zw.f3512a = interfaceC0884Ui;
            c1113Zw.f3513b = c1456gf;
            return c1113Zw;
        }
        if (iM424v != 2) {
            throw new C0232Fa();
        }
        C1359eD c1359eD = new C1359eD();
        c1359eD.f4861a = interfaceC0884Ui;
        c1359eD.f4862b = c1456gf;
        return c1359eD;
    }

    /* JADX INFO: renamed from: o */
    public static Drawable m281o(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C0147Db c0147Db = new C0147Db(context);
            c0147Db.f380b = theme;
            c0147Db.m265a(theme.getResources().getConfiguration());
            context = c0147Db;
        }
        return AbstractC1406fG.m2695U(context, i);
    }

    /* JADX INFO: renamed from: p */
    public static PorterDuff.Mode m282p(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m283q(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: r */
    public static void m284r(TextView textView, int i) {
        AbstractC1293cr.m2546e(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: s */
    public static String m285s(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: t */
    public static final Object m286t(C2339ox c2339ox, C2339ox c2339ox2, Function2 function2) throws Throwable {
        Object c0189Ea;
        Object objM4347E;
        InterfaceC1418fl interfaceC1418fl;
        C2610v1 c2610v1 = AbstractC0295Gu.f998c;
        try {
            AbstractC0828TB.m1636c(2, function2);
            c0189Ea = function2.mo446d(c2339ox2, c2339ox);
        } catch (C1324de e) {
            Throwable th = e.f4800a;
            C0189Ea c0189Ea2 = new C0189Ea(th, false);
            while (true) {
                Object objM4353M = c2339ox.m4353M(C2152km.f7529a.get(c2339ox), c0189Ea2);
                if (objM4353M != AbstractC0295Gu.f997b && objM4353M != c2610v1) {
                    if (objM4353M != AbstractC0295Gu.f999d) {
                        c2339ox.mo2728b(objM4353M);
                        break;
                    }
                } else {
                    break;
                }
            }
            throw th;
        } catch (Throwable th2) {
            c0189Ea = new C0189Ea(th2, false);
        }
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        if (c0189Ea == enumC1453gc || (objM4347E = c2339ox.m4347E(c0189Ea)) == c2610v1) {
            return enumC1453gc;
        }
        c2339ox.mo4745O();
        if (objM4347E instanceof C0189Ea) {
            throw ((C0189Ea) objM4347E).f575a;
        }
        C1462gl c1462gl = objM4347E instanceof C1462gl ? (C1462gl) objM4347E : null;
        return (c1462gl == null || (interfaceC1418fl = c1462gl.f5181a) == null) ? objM4347E : interfaceC1418fl;
    }

    /* JADX INFO: renamed from: u */
    public static final String m287u(InterfaceC0190Eb interfaceC0190Eb) {
        Object c0297Gw;
        if (interfaceC0190Eb instanceof C1367ee) {
            return ((C1367ee) interfaceC0190Eb).toString();
        }
        try {
            c0297Gw = interfaceC0190Eb + '@' + m278l(interfaceC0190Eb);
        } catch (Throwable th) {
            c0297Gw = new C0297Gw(th);
        }
        if (C0340Hw.m726a(c0297Gw) != null) {
            c0297Gw = interfaceC0190Eb.getClass().getName() + '@' + m278l(interfaceC0190Eb);
        }
        return (String) c0297Gw;
    }

    /* JADX INFO: renamed from: v */
    public static final String m288v(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: w */
    public static final C2664wC m289w(InterfaceC0190Eb interfaceC0190Eb, InterfaceC1137ac interfaceC1137ac, Object obj) {
        C2664wC c2664wC = null;
        if ((interfaceC0190Eb instanceof InterfaceC1497hc) && interfaceC1137ac.mo24m(C2707xC.f9282a) != null) {
            InterfaceC1497hc interfaceC1497hcMo1012c = (InterfaceC1497hc) interfaceC0190Eb;
            while (true) {
                if ((interfaceC1497hcMo1012c instanceof C1411fe) || (interfaceC1497hcMo1012c = interfaceC1497hcMo1012c.mo1012c()) == null) {
                    break;
                }
                if (interfaceC1497hcMo1012c instanceof C2664wC) {
                    c2664wC = (C2664wC) interfaceC1497hcMo1012c;
                    break;
                }
            }
            if (c2664wC != null) {
                c2664wC.m5233R(interfaceC1137ac, obj);
            }
        }
        return c2664wC;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m290x(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX INFO: renamed from: y */
    public static Context m291y(Context context, AttributeSet attributeSet, int i, int i2) {
        return m292z(context, attributeSet, i, i2, new int[0]);
    }

    /* JADX INFO: renamed from: z */
    public static Context m292z(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f392i, i, i2);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof C0147Db) && ((C0147Db) context).f379a == i3;
        if (i3 == 0 || z) {
            return context;
        }
        C0147Db c0147Db = new C0147Db(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = typedArrayObtainStyledAttributes2.getResourceId(i4, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                c0147Db.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f391h);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            c0147Db.getTheme().applyStyle(resourceId, true);
        }
        return c0147Db;
    }
}
