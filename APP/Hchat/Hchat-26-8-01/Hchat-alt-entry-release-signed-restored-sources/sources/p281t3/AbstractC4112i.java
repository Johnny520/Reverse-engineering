package p281t3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import bsh.org.objectweb.asm.Opcodes;
import java.io.File;
import java.io.IOException;
import p162l3.C2469w;
import p374z2.AbstractFutureC6081g;
import p374z2.C6082h;

/* JADX INFO: renamed from: t3.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4112i {

    /* JADX INFO: renamed from: a */
    public static final C6082h f13607a = new C6082h();

    /* JADX INFO: renamed from: b */
    public static final Object f13608b = new Object();

    /* JADX INFO: renamed from: c */
    public static C2469w f13609c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m8306a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC4110g.m8303a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C2469w m8307b() {
        C2469w c2469w = new C2469w(27);
        f13609c = c2469w;
        C6082h c6082h = f13607a;
        c6082h.getClass();
        if (AbstractFutureC6081g.f24573l.mo7923l(c6082h, null, c2469w)) {
            AbstractFutureC6081g.m10811b(c6082h);
        }
        return f13609c;
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
    public static void m8308c(Context context, boolean z9) {
        int i9;
        boolean z10;
        int i10;
        long length;
        File file;
        C4111h c4111hM8304a;
        C4111h c4111h;
        int i11;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z9 || f13609c == null) {
            synchronized (f13608b) {
                if (z9) {
                    i9 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file3.length();
                            if (file3.exists()) {
                                long jM8306a = m8306a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (c4111hM8304a == null) {
                                    if (z10) {
                                    }
                                }
                                if (z9) {
                                    i9 = 2;
                                }
                                if (c4111hM8304a != null) {
                                    i9 = 3;
                                }
                                c4111h = new C4111h(1, i9, jM8306a, length);
                                if (c4111hM8304a != null) {
                                    c4111h.m8305b(file);
                                }
                                m8307b();
                                return;
                            }
                        }
                    }
                    m8307b();
                    return;
                }
                if (f13609c != null) {
                    return;
                }
                i9 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z10 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z10 = false;
                }
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    boolean z11 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    boolean z12 = !file32.exists() && length > 0;
                    try {
                        long jM8306a2 = m8306a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            c4111hM8304a = null;
                        } else {
                            try {
                                c4111hM8304a = C4111h.m8304a(file);
                            } catch (IOException unused2) {
                                m8307b();
                                return;
                            }
                        }
                        if (c4111hM8304a == null && c4111hM8304a.f13605c == jM8306a2 && (i11 = c4111hM8304a.f13604b) != 2) {
                            i9 = i11;
                        } else if (z10) {
                            i9 = Opcodes.ASM5;
                        } else if (z11) {
                            i9 = 1;
                        } else if (z12) {
                            i9 = 2;
                        }
                        if (z9 && z12 && i9 != 1) {
                            i9 = 2;
                        }
                        if (c4111hM8304a != null && c4111hM8304a.f13604b == 2 && i9 == 1 && length22 < c4111hM8304a.f13606d) {
                            i9 = 3;
                        }
                        c4111h = new C4111h(1, i9, jM8306a2, length);
                        if (c4111hM8304a != null || !c4111hM8304a.equals(c4111h)) {
                            try {
                                c4111h.m8305b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m8307b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m8307b();
                        return;
                    }
                }
                m8307b();
                return;
            }
        }
    }
}
