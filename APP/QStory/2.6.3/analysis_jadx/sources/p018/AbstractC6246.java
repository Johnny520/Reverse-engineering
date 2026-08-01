package p018;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC4339;
import kotlin.text.AbstractC5144;
import p007.C6127;
import p015.C6234;
import p019.AbstractC6279;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f17213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f17214 = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C6127.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C6127.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC6279.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C6234.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f17213 = AbstractC4339.m8769(linkedHashMap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11732(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f17214.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C6245.f17212);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11733(int i, String str, String str2, Throwable th) {
        int iMin;
        String strM10153 = (String) f17213.get(str);
        if (strM10153 == null) {
            strM10153 = AbstractC5144.m10153(23, str);
        }
        if (Log.isLoggable(strM10153, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iM10171 = AbstractC5144.m10171(str2, '\n', i2, 4);
                if (iM10171 == -1) {
                    iM10171 = length;
                }
                while (true) {
                    iMin = Math.min(iM10171, i2 + 4000);
                    Log.println(i, strM10153, str2.substring(i2, iMin));
                    if (iMin >= iM10171) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
