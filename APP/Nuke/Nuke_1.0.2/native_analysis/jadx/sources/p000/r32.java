package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r32 {

    /* JADX INFO: renamed from: a */
    public static final b92 f9344a = new b92();

    /* JADX INFO: renamed from: b */
    public static final Object f9345b = new Object();

    /* JADX INFO: renamed from: c */
    public static j51 f9346c = null;

    /* JADX INFO: renamed from: a */
    public static long m4329a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0264h4.m2049a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static j51 m4330b() {
        j51 j51Var = new j51(13);
        f9346c = j51Var;
        b92 b92Var = f9344a;
        b92Var.getClass();
        if (AbstractFutureC0410l3.f5899m.mo2257k(b92Var, null, j51Var)) {
            AbstractFutureC0410l3.m2788b(b92Var);
        }
        return f9346c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4331c(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        long length;
        File file;
        q32 q32VarM4051a;
        q32 q32Var;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f9346c == null) {
            synchronized (f9345b) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file3.length();
                            if (file3.exists()) {
                                long jM4329a = m4329a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (q32VarM4051a == null) {
                                    if (z2) {
                                    }
                                }
                                if (z) {
                                    i = 2;
                                }
                                if (q32VarM4051a != null) {
                                    i = 3;
                                }
                                q32Var = new q32(1, i, jM4329a, length);
                                if (q32VarM4051a != null) {
                                    q32Var.m4052b(file);
                                }
                                m4330b();
                                return;
                            }
                        }
                    }
                    m4330b();
                    return;
                }
                if (f9346c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    boolean z3 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    boolean z4 = !file32.exists() && length > 0;
                    try {
                        long jM4329a2 = m4329a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            q32VarM4051a = null;
                        } else {
                            try {
                                q32VarM4051a = q32.m4051a(file);
                            } catch (IOException unused2) {
                                m4330b();
                                return;
                            }
                        }
                        if (q32VarM4051a == null && q32VarM4051a.f8719c == jM4329a2 && (i3 = q32VarM4051a.f8718b) != 2) {
                            i = i3;
                        } else if (z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z && z4 && i != 1) {
                            i = 2;
                        }
                        if (q32VarM4051a != null && q32VarM4051a.f8718b == 2 && i == 1 && length22 < q32VarM4051a.f8720d) {
                            i = 3;
                        }
                        q32Var = new q32(1, i, jM4329a2, length);
                        if (q32VarM4051a != null || !q32VarM4051a.equals(q32Var)) {
                            try {
                                q32Var.m4052b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m4330b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m4330b();
                        return;
                    }
                }
                m4330b();
                return;
            }
        }
    }
}
