package p179i4;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;
import p118X3.C1715y;
import p133a4.C1808d;
import p149d3.AbstractC1976d;
import p156e4.AbstractC2045h;

/* JADX INFO: renamed from: i4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2348c {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet f7643a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public static final Map f7644b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C1715y.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C1715y.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC2045h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C1808d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f7644b = AbstractC0984x.m2038J(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m4176a(String str, int i5, String str2, Throwable th) {
        int iMin;
        String strM3646n0 = (String) f7644b.get(str);
        if (strM3646n0 == null) {
            strM3646n0 = AbstractC1976d.m3646n0(str, 23);
        }
        if (Log.isLoggable(strM3646n0, i5)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i6 = 0;
            while (i6 < length) {
                int iM3634b0 = AbstractC1976d.m3634b0(str2, '\n', i6, 4);
                if (iM3634b0 == -1) {
                    iM3634b0 = length;
                }
                while (true) {
                    iMin = Math.min(iM3634b0, i6 + 4000);
                    String strSubstring = str2.substring(i6, iMin);
                    AbstractC1665j.m2984d(strSubstring, "substring(...)");
                    Log.println(i5, strM3646n0, strSubstring);
                    if (iMin >= iM3634b0) {
                        break;
                    } else {
                        i6 = iMin;
                    }
                }
                i6 = iMin + 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4177b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f7643a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C2349d.f7645a);
        }
    }
}
