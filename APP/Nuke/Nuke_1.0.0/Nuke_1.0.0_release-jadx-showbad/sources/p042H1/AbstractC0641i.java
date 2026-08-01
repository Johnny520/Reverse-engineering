package p042H1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p002A1.C0115D;
import p182j1.AbstractFutureC2378g;
import p182j1.C2379h;

/* JADX INFO: renamed from: H1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0641i {

    /* JADX INFO: renamed from: a */
    public static final C2379h f2040a = new C2379h();

    /* JADX INFO: renamed from: b */
    public static final Object f2041b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0115D f2042c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m1113a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0639g.m1110a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0115D m1114b() {
        C0115D c0115d = new C0115D(13);
        f2042c = c0115d;
        C2379h c2379h = f2040a;
        c2379h.getClass();
        if (AbstractFutureC2378g.f7718i.mo3514f(c2379h, null, c0115d)) {
            AbstractFutureC2378g.m4228b(c2379h);
        }
        return f2042c;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
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
    public static void m1115c(Context context, boolean z5) {
        int i5;
        boolean z6;
        int i6;
        long length;
        File file;
        C0640h c0640hM1111a;
        C0640h c0640h;
        int i7;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z5 || f2042c == null) {
            synchronized (f2041b) {
                if (z5) {
                    i5 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file3.length();
                            if (file3.exists()) {
                                long jM1113a = m1113a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (c0640hM1111a == null) {
                                    if (z6) {
                                    }
                                }
                                if (z5) {
                                    i5 = 2;
                                }
                                if (c0640hM1111a != null) {
                                    i5 = 3;
                                }
                                c0640h = new C0640h(1, i5, jM1113a, length);
                                if (c0640hM1111a != null) {
                                    c0640h.m1112b(file);
                                }
                                m1114b();
                                return;
                            }
                        }
                    }
                    m1114b();
                    return;
                }
                if (f2042c != null) {
                    return;
                }
                i5 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z6 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z6 = false;
                }
                i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28 && i6 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    boolean z7 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    boolean z8 = !file32.exists() && length > 0;
                    try {
                        long jM1113a2 = m1113a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            c0640hM1111a = null;
                        } else {
                            try {
                                c0640hM1111a = C0640h.m1111a(file);
                            } catch (IOException unused2) {
                                m1114b();
                                return;
                            }
                        }
                        if (c0640hM1111a == null && c0640hM1111a.f2038c == jM1113a2 && (i7 = c0640hM1111a.f2037b) != 2) {
                            i5 = i7;
                        } else if (z6) {
                            i5 = 327680;
                        } else if (z7) {
                            i5 = 1;
                        } else if (z8) {
                            i5 = 2;
                        }
                        if (z5 && z8 && i5 != 1) {
                            i5 = 2;
                        }
                        if (c0640hM1111a != null && c0640hM1111a.f2037b == 2 && i5 == 1 && length22 < c0640hM1111a.f2039d) {
                            i5 = 3;
                        }
                        c0640h = new C0640h(1, i5, jM1113a2, length);
                        if (c0640hM1111a != null || !c0640hM1111a.equals(c0640h)) {
                            try {
                                c0640h.m1112b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m1114b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m1114b();
                        return;
                    }
                }
                m1114b();
                return;
            }
        }
    }
}
