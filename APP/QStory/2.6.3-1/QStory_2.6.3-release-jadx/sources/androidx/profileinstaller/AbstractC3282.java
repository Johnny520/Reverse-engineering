package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.AbstractFutureC2976;
import androidx.concurrent.futures.C2975;
import java.io.File;
import java.io.IOException;
import p321.C9452;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2975 f7485 = new C2975();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object f7484 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C9452 f7483 = null;

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
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5157(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        long length;
        File file;
        C3281 c3281M5155;
        C3281 c3281;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f7483 == null) {
            synchronized (f7484) {
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
                                long jM5159 = m5159(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (c3281M5155 == null) {
                                    if (z2) {
                                    }
                                }
                                if (z) {
                                    i = 2;
                                }
                                if (c3281M5155 != null) {
                                    i = 3;
                                }
                                c3281 = new C3281(1, i, jM5159, length);
                                if (c3281M5155 != null) {
                                    c3281.m5156(file);
                                }
                                m5158();
                                return;
                            }
                        }
                    }
                    m5158();
                    return;
                }
                if (f7483 != null) {
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
                        long jM51592 = m5159(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            c3281M5155 = null;
                        } else {
                            try {
                                c3281M5155 = C3281.m5155(file);
                            } catch (IOException unused2) {
                                m5158();
                                return;
                            }
                        }
                        if (c3281M5155 == null && c3281M5155.f7480 == jM51592 && (i3 = c3281M5155.f7481) != 2) {
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
                        if (c3281M5155 != null && c3281M5155.f7481 == 2 && i == 1 && length22 < c3281M5155.f7479) {
                            i = 3;
                        }
                        c3281 = new C3281(1, i, jM51592, length);
                        if (c3281M5155 != null || !c3281M5155.equals(c3281)) {
                            try {
                                c3281.m5156(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m5158();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m5158();
                        return;
                    }
                }
                m5158();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C9452 m5158() {
        C9452 c9452 = new C9452(12);
        f7483 = c9452;
        C2975 c2975 = f7485;
        c2975.getClass();
        if (AbstractFutureC2976.f6661.mo4431(c2975, null, c9452)) {
            AbstractFutureC2976.m4435(c2975);
        }
        return f7483;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m5159(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC3278.m5154(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
