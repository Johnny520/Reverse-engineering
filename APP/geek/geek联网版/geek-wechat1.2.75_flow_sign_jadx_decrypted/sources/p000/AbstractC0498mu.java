package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0498mu {
    /* JADX INFO: renamed from: C */
    public static PorterDuff.Mode m1881C(int i, PorterDuff.Mode mode) {
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

    /* JADX INFO: renamed from: D */
    public static final String m1882D(BufferedReader bufferedReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = bufferedReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = bufferedReader.read(cArr);
        }
        String string = stringWriter.toString();
        AbstractC0493mp.m1856f("toString(...)", string);
        return string;
    }

    /* JADX INFO: renamed from: G */
    public static final long m1883G(String str, long j, long j2, long j3) {
        String property;
        int i = y50.f5358a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM1473P = i50.m1473P(property);
        if (lM1473P == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM1473P.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: H */
    public static int m1884H(String str, int i, int i2) {
        return (int) m1883G(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: b */
    public static void m1885b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1886c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1887d(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1888g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m1889h(f00 f00Var, AbstractC0105ci abstractC0105ci, View view, View view2, AbstractC0799uz abstractC0799uz, boolean z) {
        if (abstractC0799uz.m2528v() == 0 || f00Var.m1068b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC0799uz.m2501F(view) - AbstractC0799uz.m2501F(view2)) + 1;
        }
        return Math.min(abstractC0105ci.mo646l(), abstractC0105ci.mo636b(view2) - abstractC0105ci.mo639e(view));
    }

    /* JADX INFO: renamed from: i */
    public static int m1890i(f00 f00Var, AbstractC0105ci abstractC0105ci, View view, View view2, AbstractC0799uz abstractC0799uz, boolean z, boolean z2) {
        if (abstractC0799uz.m2528v() == 0 || f00Var.m1068b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (f00Var.m1068b() - Math.max(AbstractC0799uz.m2501F(view), AbstractC0799uz.m2501F(view2))) - 1) : Math.max(0, Math.min(AbstractC0799uz.m2501F(view), AbstractC0799uz.m2501F(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0105ci.mo636b(view2) - abstractC0105ci.mo639e(view)) / (Math.abs(AbstractC0799uz.m2501F(view) - AbstractC0799uz.m2501F(view2)) + 1))) + (abstractC0105ci.mo645k() - abstractC0105ci.mo639e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: j */
    public static int m1891j(f00 f00Var, AbstractC0105ci abstractC0105ci, View view, View view2, AbstractC0799uz abstractC0799uz, boolean z) {
        if (abstractC0799uz.m2528v() == 0 || f00Var.m1068b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return f00Var.m1068b();
        }
        return (int) (((abstractC0105ci.mo636b(view2) - abstractC0105ci.mo639e(view)) / (Math.abs(AbstractC0799uz.m2501F(view) - AbstractC0799uz.m2501F(view2)) + 1)) * f00Var.m1068b());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1892k(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM1893l = m1893l(file, inputStreamOpenRawResource);
                m1888g(inputStreamOpenRawResource);
                return zM1893l;
            } catch (Throwable th) {
                th = th;
                m1888g(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m1893l(File file, InputStream inputStream) throws Throwable {
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
                    m1888g(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m1888g(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m1888g(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static Intent m1894m(AppCompatActivity appCompatActivity) {
        Intent intentM1904a = AbstractC0500mw.m1904a(appCompatActivity);
        if (intentM1904a != null) {
            return intentM1904a;
        }
        try {
            String strM1896o = m1896o(appCompatActivity, appCompatActivity.getComponentName());
            if (strM1896o == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strM1896o);
            try {
                return m1896o(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM1896o + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Intent m1895n(AppCompatActivity appCompatActivity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM1896o = m1896o(appCompatActivity, componentName);
        if (strM1896o == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM1896o);
        return m1896o(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: o */
    public static String m1896o(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: p */
    public static File m1897p(Context context) {
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

    /* JADX INFO: renamed from: s */
    public static boolean m1898s(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1899t(View view) {
        WeakHashMap weakHashMap = oa0.f3426a;
        return y90.m2732d(view) == 1;
    }

    /* JADX INFO: renamed from: u */
    public static double[] m1900u(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    /* JADX INFO: renamed from: v */
    public static MappedByteBuffer m1901v(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorM1749a;
        try {
            parcelFileDescriptorM1749a = l80.m1749a(context.getContentResolver(), uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorM1749a == null) {
            if (parcelFileDescriptorM1749a != null) {
                parcelFileDescriptorM1749a.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorM1749a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorM1749a.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo588A(View view, int i, int i2);

    /* JADX INFO: renamed from: B */
    public abstract void mo589B(View view, float f, float f2);

    /* JADX INFO: renamed from: E */
    public abstract void mo629E(boolean z);

    /* JADX INFO: renamed from: F */
    public abstract void mo630F(boolean z);

    /* JADX INFO: renamed from: I */
    public abstract boolean mo590I(View view, int i);

    /* JADX INFO: renamed from: a */
    public void m1902a(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0570os(this, i, 1));
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo591e(View view, int i);

    /* JADX INFO: renamed from: f */
    public abstract int mo592f(View view, int i);

    /* JADX INFO: renamed from: q */
    public int mo593q(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public int mo594r() {
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo968w(int i);

    /* JADX INFO: renamed from: x */
    public abstract void mo969x(Typeface typeface);

    /* JADX INFO: renamed from: z */
    public abstract void mo595z(int i);

    /* JADX INFO: renamed from: y */
    public void mo1903y(View view, int i) {
    }
}
