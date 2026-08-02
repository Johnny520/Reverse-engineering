package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 {
    public static final ThreadLocal a = ThreadLocal.withInitial(new xl1(2));
    public static final Object b = new Object();
    public static final ReentrantLock c = new ReentrantLock();
    public static final ExecutorService d;
    public static volatile boolean e;
    public static volatile ql1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new t(2));
        executorServiceNewSingleThreadExecutor.getClass();
        d = executorServiceNewSingleThreadExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(ql1 ql1Var, byte[] bArr) {
        if (e(ql1Var, bArr)) {
            return;
        }
        c80.x("Native Engine activation failed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object b(String str, xm0 xm0Var) {
        if (t11.l(Looper.myLooper(), Looper.getMainLooper())) {
            c80.h(vi0.j("Native call '", str, "' attempted on main thread"));
            return null;
        }
        ThreadLocal threadLocal = a;
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            Boolean bool = (Boolean) threadLocal.get();
            threadLocal.set(Boolean.TRUE);
            try {
                c();
                return xm0Var.a();
            } finally {
                threadLocal.set(bool);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c() {
        if (e) {
            return;
        }
        synchronized (b) {
            try {
                if (e) {
                    return;
                }
                ql1 ql1VarZ = s11.Z();
                System.load(ql1VarZ.a.getAbsolutePath());
                if (ql1VarZ.g == 0) {
                    a(ql1VarZ, null);
                } else {
                    if (!e(ql1VarZ, null)) {
                        a(s11.X(), null);
                    }
                    a(ql1VarZ, vl1.b(ql1VarZ));
                }
                f = ql1VarZ;
                e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(boolean z, af afVar) {
        Object x92Var;
        ql1 ql1Var = f;
        if (ql1Var == null) {
            return;
        }
        et1 et1Var = vl1.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        sl1 sl1VarA = null;
        if (z || jElapsedRealtime >= vl1.b) {
            vl1.b = jElapsedRealtime + AIChatConfig.MaxReplyDelayMs;
            try {
                sl1VarA = vl1.a(ql1Var, afVar);
            } catch (IOException e2) {
                String string = ("native release check unavailable: " + e2.getMessage()).toString();
                try {
                    XposedBridge.log("[NukeNativeUpdate]" + string);
                    x92Var = a83.a;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    Log.println(6, "NukeNativeUpdate", string);
                }
            }
        }
        if (sl1VarA == null) {
            return;
        }
        a(sl1VarA.a, sl1VarA.b);
        ql1 ql1Var2 = sl1VarA.a;
        File fileG0 = s11.g0();
        s11.H(fileG0);
        try {
            FileChannel fileChannelU = s11.U(fileG0);
            try {
                FileLock fileLockLock = fileChannelU.lock();
                try {
                    File file = ql1Var2.c;
                    File file2 = ql1Var2.h;
                    String str = ql1Var2.d;
                    b5 b5VarF = zl1.f(file, fileG0);
                    h80 h80Var = (h80) b5VarF.i;
                    if (!h80Var.a.equals(str) || h80Var.b != ql1Var2.e || !h80Var.f.equals(ql1Var2.f) || !((File) b5VarF.j).equals(ql1Var2.b)) {
                        throw new SecurityException("Staged Native release changed before activation");
                    }
                    if (file2 == null || !up0.y(fileG0.toPath(), file2.toPath())) {
                        throw new SecurityException("Native activation proof is missing");
                    }
                    s11.r0(ql1Var2.g, b5VarF, fileG0, ql1Var2.c);
                    s11.b0(fileG0, str);
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    fileChannelU.close();
                    f = sl1VarA.a;
                } finally {
                }
            } finally {
            }
        } catch (SecurityException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new SecurityException("Unable to commit Native release", e4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static boolean e(ql1 ql1Var, byte[] bArr) throws IOException {
        NativeCrypto nativeCrypto = NativeCrypto.INSTANCE;
        nativeCrypto.prepareModuleAttestationForActivation$app();
        File file = ql1Var.b;
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        try {
            int fd = parcelFileDescriptorOpen.getFd();
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            long j = ql1Var.e;
            String str = ql1Var.f;
            str.getClass();
            boolean zActivateEngineDirect$app = nativeCrypto.activateEngineDirect$app(fd, absolutePath, j, str, bArr);
            parcelFileDescriptorOpen.close();
            return zActivateEngineDirect$app && nativeCrypto.engineGenerationDirect$app() == ql1Var.e;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pp0.n(parcelFileDescriptorOpen, th);
                throw th2;
            }
        }
    }
}
