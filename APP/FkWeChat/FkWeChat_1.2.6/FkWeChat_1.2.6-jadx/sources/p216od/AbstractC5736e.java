package p216od;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.function.ToLongFunction;
import me.yun.fkwechat.core.config.AppConfig;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: od.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5736e {
    /* JADX INFO: renamed from: b */
    public static void m23197b(File file, int i10) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: od.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".log");
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length <= i10) {
            return;
        }
        Arrays.sort(fileArrListFiles, Comparator.comparingLong(new ToLongFunction() { // from class: od.d
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((File) obj).lastModified();
            }
        }));
        for (int i11 = 0; i11 < fileArrListFiles.length - i10; i11++) {
            try {
                fileArrListFiles[i11].delete();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23198c(C5733b c5733b, String str, Throwable th) {
        m23201f(c5733b, str, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m23199d(C5733b c5733b, Throwable th) {
        m23201f(c5733b, null, th);
    }

    /* JADX INFO: renamed from: e */
    public static String m23200e(String str) {
        return new SimpleDateFormat(str, Locale.US).format(new Date());
    }

    /* JADX INFO: renamed from: f */
    public static void m23201f(C5733b c5733b, String str, Throwable th) {
        if (c5733b == null) {
            return;
        }
        try {
            File file = new File(c5733b.f18079e, "error");
            if (!file.exists()) {
                file.mkdirs();
            }
            m23197b(file, 5);
            PrintWriter printWriter = new PrintWriter(new FileWriter(new File(file, m23200e("yyyyMMdd_HHmmss") + ".log")));
            try {
                printWriter.println("Time: " + m23200e("yyyy-MM-dd'T'HH:mm:ss"));
                printWriter.println("Module: " + AppConfig.moduleVersionName + "(" + AppConfig.moduleVersionCode + ")");
                printWriter.println("WeChat: " + AppConfig.hostVersionName + "(" + AppConfig.hostVersionCode + ")");
                printWriter.println("Plugin: " + c5733b.f18075a + "(" + c5733b.f18077c + ")");
                if (str != null && !str.isEmpty()) {
                    printWriter.println("Context:");
                    printWriter.println(str);
                }
                if (th != null) {
                    printWriter.println("Stack trace:");
                    th.printStackTrace(printWriter);
                }
                printWriter.close();
            } finally {
            }
        } catch (Exception e10) {
            AbstractC8924d.m34265e("PluginLog log failed", e10);
        }
    }
}
