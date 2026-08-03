package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: Du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0166Du {

    /* JADX INFO: renamed from: a */
    public static final C2338ow f445a = new C2338ow();

    /* JADX INFO: renamed from: b */
    public static final Object f446b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0668Pg f447c = null;

    /* JADX INFO: renamed from: a */
    public static long m313a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0988X.m1876b(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C0668Pg m314b() {
        C0668Pg c0668Pg = new C0668Pg(28);
        f447c = c0668Pg;
        C2338ow c2338ow = f445a;
        c2338ow.getClass();
        if (AbstractFutureC0473L.f1565f.mo733g(c2338ow, null, c0668Pg)) {
            AbstractFutureC0473L.m923b(c2338ow);
        }
        return f447c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m315c(Context context, boolean z) {
        boolean z2;
        C0123Cu c0123CuM199a;
        int i;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f447c == null) {
            synchronized (f446b) {
                if (!z) {
                    if (f447c != null) {
                        return;
                    }
                    int i2 = 0;
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
                    if (Build.VERSION.SDK_INT != 30) {
                        m314b();
                        return;
                    }
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jM313a = m313a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c0123CuM199a = C0123Cu.m199a(file3);
                            } catch (IOException unused2) {
                                m314b();
                                return;
                            }
                        } else {
                            c0123CuM199a = null;
                        }
                        if (c0123CuM199a != null && c0123CuM199a.f293c == jM313a && (i = c0123CuM199a.f292b) != 2) {
                            i2 = i;
                        } else if (!z2) {
                            i2 = 327680;
                        } else if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z && z4 && i2 != 1) {
                            i2 = 2;
                        }
                        if (c0123CuM199a != null && c0123CuM199a.f292b == 2 && i2 == 1 && length < c0123CuM199a.f294d) {
                            i2 = 3;
                        }
                        C0123Cu c0123Cu = new C0123Cu(1, i2, jM313a, length2);
                        if (c0123CuM199a == null || !c0123CuM199a.equals(c0123Cu)) {
                            try {
                                c0123Cu.m200b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        m314b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m314b();
                        return;
                    }
                }
                int i22 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() <= 0) {
                }
                assetFileDescriptorOpenFd.close();
                if (Build.VERSION.SDK_INT != 30) {
                }
            }
        }
    }
}
