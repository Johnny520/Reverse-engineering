package p099h.Hchat.crash;

import android.os.Process;
import bsh.C0353j;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.Thread;
import java.nio.charset.StandardCharsets;
import okhttp3.HttpUrl;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: h.Hchat.crash.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1437f implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f4754a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1437f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4754a = uncaughtExceptionHandler;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        thread.getClass();
        th2.getClass();
        C1438g c1438g = C1438g.f4755a;
        if (C1438g.f4763i) {
            Throwable cause = th2;
            for (int i9 = 0; i9 < 8 && cause != null; i9++) {
                if (cause instanceof OutOfMemoryError) {
                    String message = cause.getMessage();
                    if (message == null) {
                        message = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (AbstractC3149m.m6709h0(message, "Failed to allocate", true)) {
                        break;
                    }
                }
                cause = cause.getCause();
            }
            if (C1438g.f4758d.compareAndSet(false, true)) {
                try {
                    File file = C1438g.f4770p;
                    if (file == null) {
                        AbstractC1416l.m3831g("crashDir");
                        throw null;
                    }
                    file.mkdirs();
                    File file2 = C1438g.f4771q;
                    if (file2 == null) {
                        AbstractC1416l.m3831g("javaPendingFile");
                        throw null;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                    try {
                        PrintWriter printWriter = new PrintWriter((Writer) new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8), false);
                        try {
                            printWriter.println("Hchat 捕获到 Java 层异常");
                            printWriter.println("时间: " + C1438g.m3864f(System.currentTimeMillis()));
                            printWriter.print(C1438g.f4775u);
                            printWriter.println("线程: " + thread.getName() + " (id=" + thread.getId() + ")");
                            printWriter.println();
                            th2.printStackTrace(printWriter);
                            printWriter.flush();
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (Throwable unused) {
                            }
                            printWriter.close();
                            fileOutputStream.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4754a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            Process.killProcess(Process.myPid());
            System.exit(10);
            C0353j.m1309g("System.exit returned normally, while it was supposed to halt JVM.");
        } else {
            try {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } finally {
                C1438g.f4758d.set(false);
            }
        }
    }
}
