package p000;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC4338;
import kotlin.text.AbstractC5143;
import p012.C6164;
import p015.C6200;
import p022.AbstractC6283;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f16631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f16632 = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C6200.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C6200.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC6283.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C6164.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f16631 = AbstractC4338.m8782(linkedHashMap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11384(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f16632.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C6079.f16630);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11385(int i, String str, String str2, Throwable th) {
        int iMin;
        String strM10149 = (String) f16631.get(str);
        if (strM10149 == null) {
            strM10149 = AbstractC5143.m10149(23, str);
        }
        if (Log.isLoggable(strM10149, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iM10151 = AbstractC5143.m10151(str2, '\n', i2, 4);
                if (iM10151 == -1) {
                    iM10151 = length;
                }
                while (true) {
                    iMin = Math.min(iM10151, i2 + 4000);
                    Log.println(i, strM10149, str2.substring(i2, iMin));
                    if (iMin >= iM10151) {
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
