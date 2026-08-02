package p000;

import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import nuke.data.cipher.NativeCrypto;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f250a = ThreadLocal.withInitial(new xl1(2));

    /* JADX INFO: renamed from: b */
    public static final Object f251b = new Object();

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f252c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f253d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f254e;

    /* JADX INFO: renamed from: f */
    public static volatile ql1 f255f;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0714t(2));
        executorServiceNewSingleThreadExecutor.getClass();
        f253d = executorServiceNewSingleThreadExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m201a(ql1 ql1Var, byte[] bArr) {
        if (m205e(ql1Var, bArr)) {
            return;
        }
        c80.m680x("Native Engine activation failed");
    }

    /* JADX INFO: renamed from: b */
    public static Object m202b(String str, xm0 xm0Var) {
        if (t11.m5086l(Looper.myLooper(), Looper.getMainLooper())) {
            c80.m665h(vi0.m5691j("Native call '", str, "' attempted on main thread"));
            return null;
        }
        ThreadLocal threadLocal = f250a;
        ReentrantLock reentrantLock = f252c;
        reentrantLock.lock();
        try {
            Boolean bool = (Boolean) threadLocal.get();
            threadLocal.set(Boolean.TRUE);
            try {
                m203c();
                return xm0Var.mo6a();
            } finally {
                threadLocal.set(bool);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m203c() {
        if (f254e) {
            return;
        }
        synchronized (f251b) {
            try {
                if (f254e) {
                    return;
                }
                ql1 ql1VarM4681Z = s11.m4681Z();
                System.load(ql1VarM4681Z.f9024a.getAbsolutePath());
                if (ql1VarM4681Z.f9030g == 0) {
                    m201a(ql1VarM4681Z, null);
                } else {
                    if (!m205e(ql1VarM4681Z, null)) {
                        m201a(s11.m4679X(), null);
                    }
                    m201a(ql1VarM4681Z, vl1.m5713b(ql1VarM4681Z));
                }
                f255f = ql1VarM4681Z;
                f254e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m204d(boolean z, C0016af c0016af) {
        Object x92Var;
        ql1 ql1Var = f255f;
        if (ql1Var == null) {
            return;
        }
        et1 et1Var = vl1.f12007a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        sl1 sl1VarM5712a = null;
        if (z || jElapsedRealtime >= vl1.f12008b) {
            vl1.f12008b = jElapsedRealtime + AIChatConfig.MaxReplyDelayMs;
            try {
                sl1VarM5712a = vl1.m5712a(ql1Var, c0016af);
            } catch (IOException e) {
                String string = ("native release check unavailable: " + e.getMessage()).toString();
                try {
                    XposedBridge.log("[NukeNativeUpdate]" + string);
                    x92Var = a83.f116a;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    Log.println(6, "NukeNativeUpdate", string);
                }
            }
        }
        if (sl1VarM5712a == null) {
            return;
        }
        m201a(sl1VarM5712a.f10186a, sl1VarM5712a.f10187b);
        ql1 ql1Var2 = sl1VarM5712a.f10186a;
        File fileM4695g0 = s11.m4695g0();
        s11.m4663H(fileM4695g0);
        try {
            FileChannel fileChannelM4676U = s11.m4676U(fileM4695g0);
            try {
                FileLock fileLockLock = fileChannelM4676U.lock();
                try {
                    File file = ql1Var2.f9026c;
                    File file2 = ql1Var2.f9031h;
                    String str = ql1Var2.f9027d;
                    C0043b5 c0043b5M6440f = zl1.m6440f(file, fileM4695g0);
                    h80 h80Var = (h80) c0043b5M6440f.f562i;
                    if (!h80Var.f3891a.equals(str) || h80Var.f3892b != ql1Var2.f9028e || !h80Var.f3896f.equals(ql1Var2.f9029f) || !((File) c0043b5M6440f.f563j).equals(ql1Var2.f9025b)) {
                        throw new SecurityException("Staged Native release changed before activation");
                    }
                    if (file2 == null || !up0.m5559y(fileM4695g0.toPath(), file2.toPath())) {
                        throw new SecurityException("Native activation proof is missing");
                    }
                    s11.m4717r0(ql1Var2.f9030g, c0043b5M6440f, fileM4695g0, ql1Var2.f9026c);
                    s11.m4685b0(fileM4695g0, str);
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    fileChannelM4676U.close();
                    f255f = sl1VarM5712a.f10186a;
                } finally {
                }
            } finally {
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new SecurityException("Unable to commit Native release", e3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m205e(ql1 ql1Var, byte[] bArr) throws IOException {
        NativeCrypto nativeCrypto = NativeCrypto.INSTANCE;
        nativeCrypto.prepareModuleAttestationForActivation$app();
        File file = ql1Var.f9025b;
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        try {
            int fd = parcelFileDescriptorOpen.getFd();
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            long j = ql1Var.f9028e;
            String str = ql1Var.f9029f;
            str.getClass();
            boolean zActivateEngineDirect$app = nativeCrypto.activateEngineDirect$app(fd, absolutePath, j, str, bArr);
            parcelFileDescriptorOpen.close();
            return zActivateEngineDirect$app && nativeCrypto.engineGenerationDirect$app() == ql1Var.f9028e;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pp0.m3916n(parcelFileDescriptorOpen, th);
                throw th2;
            }
        }
    }
}
