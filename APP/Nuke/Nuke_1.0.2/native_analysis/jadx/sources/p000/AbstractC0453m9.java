package p000;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0453m9 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet f6518a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public static final Map f6519b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = et1.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(et1.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(jv0.class.getName(), "okhttp.Http2");
        linkedHashMap.put(iy2.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f6519b = we1.m5881v0(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m3045a(int i, String str, String str2, Throwable th) {
        int iMin;
        String strM3992H0 = (String) f6519b.get(str);
        if (strM3992H0 == null) {
            strM3992H0 = pv2.m3992H0(str, 23);
        }
        if (Log.isLoggable(strM3992H0, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iM4003p0 = pv2.m4003p0(str2, '\n', i2, 4);
                if (iM4003p0 == -1) {
                    iM4003p0 = length;
                }
                while (true) {
                    iMin = Math.min(iM4003p0, i2 + 4000);
                    Log.println(i, strM3992H0, str2.substring(i2, iMin));
                    if (iMin >= iM4003p0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3046b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f6518a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C0490n9.f7056a);
        }
    }
}
