package yyds;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᲀᛳᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1967 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1883 f9866 = new C1883();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Object f9867 = new Object();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1586 f9868 = null;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static long m3796(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC1160.m2349(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1586 m3797() {
        C1586 c1586 = new C1586();
        f9868 = c1586;
        C1883 c1883 = f9866;
        c1883.getClass();
        if (AbstractFutureC2622.f12901.mo1147(c1883, null, c1586)) {
            AbstractFutureC2622.m4735(c1883);
        }
        return f9868;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3798(Context context, boolean z) {
        boolean z2;
        C1598 c1598M3287;
        int i;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f9868 == null) {
            synchronized (f9867) {
                if (!z) {
                    if (f9868 != null) {
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
                        m3797();
                        return;
                    }
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jM3796 = m3796(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c1598M3287 = C1598.m3287(file3);
                            } catch (IOException unused2) {
                                m3797();
                                return;
                            }
                        } else {
                            c1598M3287 = null;
                        }
                        if (c1598M3287 != null && c1598M3287.f8151 == jM3796 && (i = c1598M3287.f8150) != 2) {
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
                        if (c1598M3287 != null && c1598M3287.f8150 == 2 && i2 == 1 && length < c1598M3287.f8152) {
                            i2 = 3;
                        }
                        C1598 c1598 = new C1598(1, i2, jM3796, length2);
                        if (c1598M3287 == null || !c1598M3287.equals(c1598)) {
                            try {
                                c1598.m3288(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        m3797();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m3797();
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
