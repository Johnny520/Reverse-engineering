package Yue;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7687
public final class C3209 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f132 = 4000;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final Map<String, String> f4863;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3209 f131 = new C3209();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final CopyOnWriteArraySet<Logger> f4862 = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C6504.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C6504.class.getName();
        C5499.m17102(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C5354.class.getName();
        C5499.m17102(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C7733.class.getName();
        C5499.m17102(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f4863 = C5943.m18642(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m287(@InterfaceC6399 String str, int i, @InterfaceC6399 String str2, @InterfaceC6489 Throwable th) {
        int iMin;
        C5499.m17103(str, "loggerName");
        C5499.m17103(str2, "message");
        String strM6572 = m6572(str);
        if (Log.isLoggable(strM6572, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iM24056 = C7628.m24056(str2, '\n', i2, false, 4, null);
                if (iM24056 == -1) {
                    iM24056 = length;
                }
                while (true) {
                    iMin = Math.min(iM24056, i2 + f132);
                    String strSubstring = str2.substring(i2, iMin);
                    C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strM6572, strSubstring);
                    if (iMin >= iM24056) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m288() {
        for (Map.Entry<String, String> entry : f4863.entrySet()) {
            m6571(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m6571(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f4862.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C3210.f133);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String m6572(String str) {
        String str2 = f4863.get(str);
        return str2 == null ? C7633.m24353(str, 23) : str2;
    }
}
