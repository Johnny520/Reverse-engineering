package p000;

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
import java.util.WeakHashMap;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: gt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0273gt {
    /* JADX INFO: renamed from: A */
    public static TypedValue m1297A(Context context, int i, String str) {
        TypedValue typedValueM1316y = m1316y(context, i);
        if (typedValueM1316y != null) {
            return typedValueM1316y;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: D */
    public static void m1298D(View view, C0200eu c0200eu) {
        C0893xh c0893xh = c0200eu.f1842a.f1634b;
        if (c0893xh == null || !c0893xh.f5161a) {
            return;
        }
        float fM2663i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = ja0.f2600a;
            fM2663i += y90.m2663i((View) parent);
        }
        C0163du c0163du = c0200eu.f1842a;
        if (c0163du.f1644l != fM2663i) {
            c0163du.f1644l = fM2663i;
            c0200eu.m1088m();
        }
    }

    /* JADX INFO: renamed from: E */
    public static final long m1299E(String str, long j, long j2, long j3) {
        String property;
        int i = r50.f4212a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM533S = b50.m533S(property);
        if (lM533S == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM533S.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: F */
    public static int m1300F(String str, int i, int i2) {
        return (int) m1299E(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: G */
    public static final void m1301G(i00 i00Var, View view) {
        if (i00Var.f2326b != null) {
            return;
        }
        if (view.getClass().getName().equals(pb0.f3771i0)) {
            i00Var.f2326b = view;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC0346ip.m1502n(u40.m2419a("njrBEZzoeLm4K5182q89\n", "+V+1UvSBFN0=\n"), childAt);
                m1301G(i00Var, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m1302a(Context context, String str) {
        int iM2548c;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM2549d = AbstractC0844w5.m2549d(str);
            if (strM2549d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && AbstractC0612pw.m2131a(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerM2612c = AbstractC0881x5.m2612c(context);
                    iM2548c = AbstractC0881x5.m2610a(appOpsManagerM2612c, strM2549d, Binder.getCallingUid(), packageName);
                    if (iM2548c == 0) {
                        iM2548c = AbstractC0881x5.m2610a(appOpsManagerM2612c, strM2549d, iMyUid, AbstractC0881x5.m2611b(context));
                    }
                } else {
                    iM2548c = AbstractC0844w5.m2548c((AppOpsManager) AbstractC0844w5.m2546a(context, AppOpsManager.class), strM2549d, packageName);
                }
                if (iM2548c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m1303d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m1304e(int i, int i2) {
        if (i2 >= 0) {
            if (i < 0) {
                return 0;
            }
            return i > i2 ? i2 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i2 + " is less than minimum 0.");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1305f(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM1306g = m1306g(file, inputStreamOpenRawResource);
                m1303d(inputStreamOpenRawResource);
                return zM1306g;
            } catch (Throwable th) {
                th = th;
                m1303d(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1306g(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    m1303d(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m1303d(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m1303d(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0346ip m1307h(int i) {
        return i != 0 ? i != 1 ? new h10() : new C0964ze() : new h10();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1308i(String str) {
        AbstractC0346ip.m1503o(u40.m2419a("ggWA\n", "6WD5BmkcYhM=\n"), str);
        try {
            C0267gn.f2144a.getClass();
            return C0267gn.m1285e(str);
        } catch (Throwable unused) {
            try {
                C0267gn c0267gn = C0267gn.f2144a;
                String strValueOf = String.valueOf(false);
                c0267gn.getClass();
                String strM1284d = C0267gn.m1284d(str, strValueOf);
                Boolean bool = strM1284d.equals("true") ? Boolean.TRUE : strM1284d.equals("false") ? Boolean.FALSE : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m1309j(String str, int i) {
        AbstractC0346ip.m1503o(u40.m2419a("aYbW\n", "AuOvGSdAksw=\n"), str);
        try {
            try {
                C0267gn.f2144a.getClass();
                return C0267gn.m1282b(str, i);
            } catch (Throwable unused) {
                C0267gn c0267gn = C0267gn.f2144a;
                String strValueOf = String.valueOf(i);
                c0267gn.getClass();
                Integer numM532R = b50.m532R(C0267gn.m1284d(str, strValueOf));
                return numM532R != null ? numM532R.intValue() : i;
            }
        } catch (Throwable unused2) {
            return i;
        }
    }

    /* JADX INFO: renamed from: k */
    public static File m1310k(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1311n(View view) {
        WeakHashMap weakHashMap = ja0.f2600a;
        return t90.m2367d(view) == 1;
    }

    /* JADX INFO: renamed from: o */
    public static MappedByteBuffer m1312o(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorM1143a;
        try {
            parcelFileDescriptorM1143a = f80.m1143a(context.getContentResolver(), uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorM1143a == null) {
            if (parcelFileDescriptorM1143a != null) {
                parcelFileDescriptorM1143a.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorM1143a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorM1143a.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: v */
    public static PorterDuff.Mode m1313v(int i, PorterDuff.Mode mode) {
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

    /* JADX INFO: renamed from: w */
    public static void m1314w(Activity activity, Object obj, String str) {
        String string;
        Field field = C0340in.f2445g;
        Object objCallStaticMethod = null;
        Object obj2 = field != null ? field.get(obj) : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String strGroup = "";
        if (str2 == null || (string = b50.m534T(str2).toString()) == null) {
            string = "";
        }
        Field field2 = C0340in.f2446h;
        Object obj3 = field2 != null ? field2.get(obj) : null;
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        C0138d4 c0138d4M1383a = i00.m1383a(AbstractC0327i9.f2384k, str3);
        if (c0138d4M1383a != null) {
            strGroup = (String) ((C0236ft) c0138d4M1383a.m899t()).get(1);
        } else {
            C0138d4 c0138d4M1383a2 = i00.m1383a(AbstractC0327i9.f2385l, string + " " + str3);
            if (c0138d4M1383a2 != null) {
                strGroup = ((Matcher) c0138d4M1383a2.f1363b).group();
                AbstractC0346ip.m1502n("group(...)", strGroup);
            }
        }
        if (strGroup.length() == 0 || strGroup.length() != 32) {
            C0267gn c0267gn = C0267gn.f2144a;
            String strM2419a = u40.m2419a("PLLKDS8X4gd59fRGlrJL++H17XtJHZBacKKKXwk=\n", "1BNi66ySBr8=\n");
            c0267gn.getClass();
            C0267gn.m1291k(activity, strM2419a);
            return;
        }
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(pb0.f3706G, AbstractC0143d9.f1405a);
            Object objCallStaticMethod2 = null;
            for (String str4 : pb0.f3711I0) {
                Class clsFindClassIfExists2 = XposedHelpers.findClassIfExists(str4, AbstractC0143d9.f1405a);
                if (clsFindClassIfExists2 != null) {
                    try {
                        objCallStaticMethod2 = XposedHelpers.callStaticMethod(clsFindClassIfExists2, pb0.f3803t, new Object[]{clsFindClassIfExists});
                        if (objCallStaticMethod2 != null) {
                            break;
                        }
                    } catch (Throwable unused) {
                        AbstractC0346ip.m1503o(u40.m2419a("Nwje\n", "Q2m5jaPP2Zc=\n"), "EmojiRepeat_Locate_Failed for class: " + str4);
                        u40.m2419a("Fg==\n", "c8HJlSTQVfc=\n");
                    }
                }
            }
            if (objCallStaticMethod2 == null) {
                C0267gn c0267gn2 = C0267gn.f2144a;
                String strM2419a2 = u40.m2419a("aIrkjr4ZCr0tzdrFB7wIkiDN//3VElngD72kyZV6bYBlo8qNsg3ORNBi\n", "gCtMaD2c7gU=\n");
                c0267gn2.getClass();
                C0267gn.m1291k(activity, strM2419a2);
                return;
            }
            Class clsFindClassIfExists3 = XposedHelpers.findClassIfExists(pb0.f3764g, AbstractC0143d9.f1405a);
            String str5 = pb0.f3719M0;
            try {
                if (str5.length() > 0) {
                    objCallStaticMethod = XposedHelpers.callStaticMethod(clsFindClassIfExists3, str5, new Object[0]);
                }
            } catch (Throwable unused2) {
                AbstractC0346ip.m1503o(u40.m2419a("Nwje\n", "Q2m5jaPP2Zc=\n"), "EmojiRepeat_Inst_Failed for method: " + str5);
                u40.m2419a("Fg==\n", "c8HJlSTQVfc=\n");
            }
            if (objCallStaticMethod == null) {
                C0267gn c0267gn3 = C0267gn.f2144a;
                String strM2419a3 = u40.m2419a("xTWd1Q+czdKAcqOetjnP/Y1yhqZkl56PogIVduF2QwN+4FpB7X5MSssIuNYGuA==\n", "LZQ1M4wZKWo=\n");
                c0267gn3.getClass();
                C0267gn.m1291k(activity, strM2419a3);
                return;
            }
            Object objCallMethod = XposedHelpers.callMethod(XposedHelpers.callMethod(objCallStaticMethod, pb0.f3702E, new Object[0]), pb0.f3704F, new Object[]{strGroup});
            if (objCallMethod == null) {
                C0267gn c0267gn4 = C0267gn.f2144a;
                String strM2419a4 = u40.m2419a("E9SjSRC5TS1cj4cNR6UWV1vO5QwH/ig0\n", "9moNra8Yq7E=\n");
                c0267gn4.getClass();
                C0267gn.m1291k(activity, strM2419a4);
                return;
            }
            Object objNewInstance = XposedHelpers.newInstance(XposedHelpers.findClass(pb0.f3810v0, AbstractC0143d9.f1405a), new Object[]{0L, str});
            String str6 = pb0.f3777k0;
            try {
                XposedHelpers.callMethod(objCallStaticMethod2, str6, new Object[]{str, objCallMethod, null, objNewInstance, null, 0});
            } catch (Throwable unused3) {
                C0267gn.f2144a.getClass();
                C0267gn.m1291k(activity, "表情接口调用失败：参数未对齐或方法(" + str6 + ")失效");
                AbstractC0346ip.m1503o(u40.m2419a("Nwje\n", "Q2m5jaPP2Zc=\n"), "EmojiRepeat_Invoke_Failed for targetNh: " + str6 + ", md5: " + strGroup);
                u40.m2419a("Fg==\n", "c8HJlSTQVfc=\n");
            }
        } catch (Throwable th) {
            C0267gn c0267gn5 = C0267gn.f2144a;
            String str7 = "表情分发全局异常: " + th.getMessage();
            c0267gn5.getClass();
            C0267gn.m1291k(activity, str7);
            z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "EmojiRepeat_Global_Fatal for md5: ".concat(strGroup), "Fg==\n", "c8HJlSTQVfc=\n");
        }
    }

    /* JADX INFO: renamed from: x */
    public static C0870wv m1315x(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C0870wv c0870wv = new C0870wv();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0870wv.f4513d = byteBufferDuplicate;
                    c0870wv.f4510a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0870wv.f4511b = i6;
                    c0870wv.f4512c = ((ByteBuffer) c0870wv.f4513d).getShort(i6);
                    return c0870wv;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: y */
    public static TypedValue m1316y(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m1317z(Context context, int i, boolean z) {
        TypedValue typedValueM1316y = m1316y(context, i);
        return (typedValueM1316y == null || typedValueM1316y.type != 18) ? z : typedValueM1316y.data != 0;
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo1318B(boolean z);

    /* JADX INFO: renamed from: C */
    public abstract void mo1319C(boolean z);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo1320H(View view, int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo1321b(View view, int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo1322c(View view, int i);

    /* JADX INFO: renamed from: l */
    public int mo1323l(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public int mo1324m() {
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1266p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo1267q(Typeface typeface, boolean z);

    /* JADX INFO: renamed from: s */
    public abstract void mo1326s(int i);

    /* JADX INFO: renamed from: t */
    public abstract void mo1327t(View view, int i, int i2);

    /* JADX INFO: renamed from: u */
    public abstract void mo1328u(View view, float f, float f2);

    /* JADX INFO: renamed from: r */
    public void mo1325r(View view, int i) {
    }
}
