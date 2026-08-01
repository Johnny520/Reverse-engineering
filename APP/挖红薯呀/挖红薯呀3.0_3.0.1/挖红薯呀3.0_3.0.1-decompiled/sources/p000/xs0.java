package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xs0 {

    /* JADX INFO: renamed from: a */
    public static final vu0 f7407a = new vu0();

    /* JADX INFO: renamed from: b */
    public static final Object f7408b = new Object();

    /* JADX INFO: renamed from: c */
    public static jo0 f7409c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m5149a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0039b1.m231a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static jo0 m5150b() {
        jo0 jo0Var = new jo0(8);
        f7409c = jo0Var;
        vu0 vu0Var = f7407a;
        vu0Var.getClass();
        if (AbstractFutureC0375k0.f2969i.mo1270k(vu0Var, null, jo0Var)) {
            AbstractFutureC0375k0.m1742b(vu0Var);
        }
        return f7409c;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5151c(Context context, boolean z) {
        boolean z2;
        ws0 ws0VarM5026a;
        int i;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f7409c == null) {
            synchronized (f7408b) {
                if (!z) {
                    if (f7409c != null) {
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
                        m5150b();
                        return;
                    }
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jM5149a = m5149a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                ws0VarM5026a = ws0.m5026a(file3);
                            } catch (IOException unused2) {
                                m5150b();
                                return;
                            }
                        } else {
                            ws0VarM5026a = null;
                        }
                        if (ws0VarM5026a != null && ws0VarM5026a.f7185c == jM5149a && (i = ws0VarM5026a.f7184b) != 2) {
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
                        if (ws0VarM5026a != null && ws0VarM5026a.f7184b == 2 && i2 == 1 && length < ws0VarM5026a.f7186d) {
                            i2 = 3;
                        }
                        ws0 ws0Var = new ws0(1, i2, jM5149a, length2);
                        if (ws0VarM5026a == null || !ws0VarM5026a.equals(ws0Var)) {
                            try {
                                ws0Var.m5027b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        m5150b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m5150b();
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
