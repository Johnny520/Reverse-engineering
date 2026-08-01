package p201nd;

import android.util.Log;
import bsh.RunnableC1205k2;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me.yun.fkwechat.core.config.AppConfig;
import p216od.C5733b;

/* JADX INFO: renamed from: nd.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5588p {
    private static final Map<String, a> LOG_HOLDER_MAP = new ConcurrentHashMap();

    /* JADX INFO: renamed from: nd.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        public RunnableC1205k2 interpreter;
        public File logFile;

        public a(RunnableC1205k2 runnableC1205k2, File file) {
            this.interpreter = runnableC1205k2;
            this.logFile = file;
        }
    }

    public static Object getAppLoader(String str) {
        try {
            return AppConfig.hostContext.createPackageContext(str, 3).getClassLoader();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void log(C5733b c5733b, RunnableC1205k2 runnableC1205k2, Object obj) {
        if (c5733b == null || runnableC1205k2 == null) {
            return;
        }
        try {
            String str = c5733b.m23192b() + "_" + c5733b.m23193c();
            Map<String, a> map = LOG_HOLDER_MAP;
            a aVar = map.get(str);
            if (aVar == null || aVar.interpreter != runnableC1205k2 || !aVar.logFile.exists()) {
                File file = new File(new File(c5733b.f18079e), "log");
                if (!file.exists()) {
                    file.mkdirs();
                }
                aVar = new a(runnableC1205k2, new File(file, new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".log"));
                map.put(str, aVar);
            }
            String str2 = "[" + new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(new Date()) + "] " + obj;
            FileWriter fileWriter = new FileWriter(aVar.logFile, true);
            try {
                PrintWriter printWriter = new PrintWriter(fileWriter);
                try {
                    printWriter.println(str2);
                    printWriter.flush();
                    printWriter.close();
                    fileWriter.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            Log.e("PluginLog", "Log error: " + th.getMessage());
        }
    }
}
