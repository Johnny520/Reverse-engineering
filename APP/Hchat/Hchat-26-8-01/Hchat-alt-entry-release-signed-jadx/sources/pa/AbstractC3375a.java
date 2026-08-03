package pa;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: pa.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3375a {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f10902a = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m7154a(ContentValues contentValues) {
        if (f10902a.isEmpty()) {
            return;
        }
        try {
            for (String str : new HashSet(contentValues.keySet())) {
                Object obj = contentValues.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    String strM7156c = m7156c(str2);
                    if (!strM7156c.equals(str2)) {
                        contentValues.put(str, strM7156c);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m7155b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2)) {
            return;
        }
        if (str.contains("@chatroom") || str.contains("%40chatroom")) {
            ConcurrentHashMap concurrentHashMap = f10902a;
            concurrentHashMap.put(str2, str);
            try {
                String strReplace = str.replace("@", "%40");
                String strReplace2 = str2.replace("@", "%40");
                if (!strReplace.equals(str) || !strReplace2.equals(str2)) {
                    concurrentHashMap.put(strReplace2, strReplace);
                }
            } catch (Throwable unused) {
            }
            if (concurrentHashMap.size() > 20) {
                try {
                    concurrentHashMap.remove((String) concurrentHashMap.keySet().iterator().next());
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m7156c(String str) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = f10902a;
            if (!concurrentHashMap.isEmpty()) {
                try {
                    String strReplace = str;
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                            strReplace = strReplace.replace(str2, str3);
                        }
                    }
                    return strReplace;
                } catch (Throwable unused) {
                }
            }
        }
        return str;
    }
}
