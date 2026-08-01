package p034;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC5171;
import kotlin.text.AbstractC5976;
import p023.C6956;
import p031.C7063;
import p035.AbstractC7108;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7075 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f17558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f17559 = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C6956.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C6956.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC7108.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C7063.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f17558 = AbstractC5171.m9328(linkedHashMap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12291(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f17559.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C7074.f17557);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12292(int i, String str, String str2, Throwable th) {
        int iMin;
        String strM10712 = (String) f17558.get(str);
        if (strM10712 == null) {
            strM10712 = AbstractC5976.m10712(23, str);
        }
        if (Log.isLoggable(strM10712, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iM10730 = AbstractC5976.m10730(str2, '\n', i2, 4);
                if (iM10730 == -1) {
                    iM10730 = length;
                }
                while (true) {
                    iMin = Math.min(iM10730, i2 + 4000);
                    Log.println(i, strM10712, str2.substring(i2, iMin));
                    if (iMin >= iM10730) {
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
