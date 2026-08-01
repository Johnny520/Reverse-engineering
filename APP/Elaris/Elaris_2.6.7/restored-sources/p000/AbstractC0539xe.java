package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: xe */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0539xe {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f1078a = false;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1079b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public static final String[] f1080c = {"auth", "oauth", "authorize", "login", "ptlogin", "captcha", "verify", "verification", "safe", "security", "risk", "turing", "ticket", "token", "permission", "account", "identity", "realname", "face", "qrauth", "openmobile", "connect"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m1148a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strM1089h = AbstractC0497v4.m1089h(str);
        for (String str2 : (strM1089h == null || strM1089h.equals(str)) ? new String[]{str} : new String[]{strM1089h, str}) {
            int iIndexOf = str2.indexOf("http://");
            int iIndexOf2 = str2.indexOf("https://");
            if (iIndexOf < 0) {
                iIndexOf = iIndexOf2;
            } else if (iIndexOf2 >= 0) {
                iIndexOf = Math.min(iIndexOf, iIndexOf2);
            }
            if (iIndexOf >= 0) {
                int length = str2.length();
                for (int i = iIndexOf; i < str2.length(); i++) {
                    char cCharAt = str2.charAt(i);
                    if (cCharAt <= ' ' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == '<' || cCharAt == '>' || cCharAt == ')' || cCharAt == ']' || cCharAt == '}') {
                        length = i;
                        break;
                    }
                }
                String strSubstring = str2.substring(iIndexOf, length);
                if (m1152e(strSubstring)) {
                    return strSubstring;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1149b(Object obj, int i, Set set) {
        if (obj != null && i <= 3) {
            if (obj instanceof CharSequence) {
                return m1148a(obj.toString());
            }
            if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Enum) || !(set == null || set.add(obj))) {
                return null;
            }
            if (obj instanceof Bundle) {
                try {
                    Bundle bundle = (Bundle) obj;
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        String strM1149b = m1149b(bundle.get(it.next()), i + 1, set);
                        if (m1152e(strM1149b)) {
                            return strM1149b;
                        }
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).values().iterator();
                while (it2.hasNext()) {
                    String strM1149b2 = m1149b(it2.next(), i + 1, set);
                    if (m1152e(strM1149b2)) {
                        return strM1149b2;
                    }
                }
                return null;
            }
            if (obj instanceof Iterable) {
                Iterator it3 = ((Iterable) obj).iterator();
                while (it3.hasNext()) {
                    String strM1149b3 = m1149b(it3.next(), i + 1, set);
                    if (m1152e(strM1149b3)) {
                        return strM1149b3;
                    }
                }
                return null;
            }
            if (!obj.getClass().isArray()) {
                return m1148a(String.valueOf(obj));
            }
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                String strM1149b4 = m1149b(Array.get(obj, i2), i + 1, set);
                if (m1152e(strM1149b4)) {
                    return strM1149b4;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m1150c(Intent intent) {
        Bundle extras;
        String stringExtra = intent.getStringExtra("url");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("key_url");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("uin_url");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("jump_url");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("target_url");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("raw_url");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("leftViewText");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("web_url");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = intent.getStringExtra("qurl");
        }
        if ((stringExtra == null || stringExtra.length() == 0) && intent.getData() != null) {
            stringExtra = intent.getData().toString();
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            try {
                extras = intent.getExtras();
            } catch (Throwable unused) {
                extras = null;
            }
            if (extras == null) {
                stringExtra = null;
            } else {
                Iterator<String> it = extras.keySet().iterator();
                while (it.hasNext()) {
                    String strM1149b = m1149b(extras.get(it.next()), 0, Collections.newSetFromMap(new IdentityHashMap()));
                    if (m1152e(strM1149b)) {
                        stringExtra = strM1149b;
                        break;
                    }
                }
                stringExtra = null;
            }
        }
        if (stringExtra == null) {
            return null;
        }
        String strTrim = stringExtra.trim();
        if (m1152e(strTrim)) {
            return strTrim;
        }
        String strM1148a = m1148a(strTrim);
        return m1152e(strM1148a) ? strM1148a : strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m1151d(String str) {
        if (!m1152e(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (host == null) {
                return "";
            }
            String lowerCase = host.toLowerCase(Locale.ROOT);
            while (lowerCase.endsWith(".")) {
                lowerCase = lowerCase.substring(0, lowerCase.length() - 1);
            }
            return lowerCase;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m1152e(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m1153f(Context context, Intent intent, String str) {
        String lowerCase;
        String str2 = str + " " + AbstractC0497v4.m1088g(context);
        Locale locale = Locale.ROOT;
        String lowerCase2 = str2.toLowerCase(locale);
        String[] strArr = f1080c;
        if (AbstractC0497v4.m1086e(lowerCase2, strArr)) {
            return true;
        }
        try {
            lowerCase = intent.toUri(0).toLowerCase(locale);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        if (m1155h(m1151d(m1150c(intent)))) {
            return AbstractC0497v4.m1086e(lowerCase, strArr);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m1154g(String str) {
        if (!m1152e(str)) {
            return false;
        }
        String strM1151d = m1151d(str);
        if (m1155h(strM1151d)) {
            return AbstractC0497v4.m1086e(str.toLowerCase(Locale.ROOT), f1080c) || strM1151d.contains("ptlogin") || strM1151d.contains("captcha") || strM1151d.contains("turing");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m1155h(String str) {
        if (str.length() == 0) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return "qq.com".equals(lowerCase) || lowerCase.endsWith(".qq.com") || "gtimg.com".equals(lowerCase) || lowerCase.endsWith(".gtimg.com") || "qpic.cn".equals(lowerCase) || lowerCase.endsWith(".qpic.cn") || "qlogo.cn".equals(lowerCase) || lowerCase.endsWith(".qlogo.cn") || "qcloud.com".equals(lowerCase) || lowerCase.endsWith(".qcloud.com") || "myqcloud.com".equals(lowerCase) || lowerCase.endsWith(".myqcloud.com") || "tencent.com".equals(lowerCase) || lowerCase.endsWith(".tencent.com") || "tenpay.com".equals(lowerCase) || lowerCase.endsWith(".tenpay.com");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m1156i(String str) {
        String lowerCase;
        String lowerCase2 = "";
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            String path = uri.getPath();
            lowerCase = host == null ? "" : host.toLowerCase(Locale.ROOT);
            if (path != null) {
                try {
                    lowerCase2 = path.toLowerCase(Locale.ROOT);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            lowerCase = "";
        }
        if (lowerCase.contains("urlsec.qq.com") || lowerCase.contains("c.pc.qq.com") || lowerCase.contains("cgi.urlsec.qq.com")) {
            return true;
        }
        if ((lowerCase.endsWith(".qq.com") || "qq.com".equals(lowerCase)) && !lowerCase2.contains("middle") && !lowerCase2.contains("urlsec") && !lowerCase2.contains("safe") && !lowerCase2.contains("security") && !lowerCase2.contains("jump")) {
            lowerCase2.contains("redirect");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m1157j(Intent intent, ComponentName componentName, String str, boolean z, String str2) {
        if ("android.intent.action.VIEW".equals(intent.getAction()) && componentName == null) {
            return true;
        }
        String lowerCase = str.toLowerCase();
        if (z || lowerCase.contains("browser") || lowerCase.contains("qweb") || lowerCase.contains("webview") || lowerCase.contains("webprocess") || lowerCase.contains("qqbrowser") || lowerCase.contains("swiftbrowser") || lowerCase.contains("readinjoy")) {
            return true;
        }
        if (m1152e(str2) && (lowerCase.contains("qqfav") || lowerCase.contains("favorite") || lowerCase.contains("jumpactivity") || lowerCase.contains("publicfragmentactivity"))) {
            return true;
        }
        String lowerCase2 = intent.toUri(0).toLowerCase();
        return lowerCase2.contains("qqbrowseractivity") || lowerCase2.contains("url=") || lowerCase2.contains("key_url=") || lowerCase2.contains("webview") || lowerCase2.contains("qweb") || lowerCase2.contains("browser");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m1158k(Context context, Intent intent, String str) {
        String str2;
        if (!m1152e(str)) {
            return false;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent2.addCategory("android.intent.category.BROWSABLE");
        intent2.addFlags(268435456);
        intent2.addFlags(67108864);
        intent2.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            str2 = intent.getPackage();
        } catch (Throwable unused) {
            str2 = null;
        }
        if ("com.tencent.mobileqq".equals(str2)) {
            intent2.setPackage(null);
        }
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = f1079b;
        threadLocal.set(bool);
        try {
            context.startActivity(intent2);
            return true;
        } catch (Throwable th) {
            try {
                Intent intentCreateChooser = Intent.createChooser(intent2, "Choose browser");
                intentCreateChooser.addFlags(268435456);
                context.startActivity(intentCreateChooser);
                return true;
            } catch (Throwable th2) {
                try {
                    AbstractC0497v4.m1076C("external browser start failed: " + th + " / " + th2);
                    return false;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0080 */
    /* JADX INFO: renamed from: l */
    public static String m1159l(String str) {
        if (!m1152e(str)) {
            return str;
        }
        String str2 = str;
        int i = 0;
        while (i < 4) {
            String strM1089h = AbstractC0497v4.m1089h(str2);
            str2 = str2;
            if (m1152e(strM1089h)) {
                boolean zEquals = strM1089h.equals(str2);
                str2 = str2;
                if (!zEquals) {
                    str2 = str2;
                    if (m1156i(strM1089h)) {
                        str2 = strM1089h;
                    }
                }
            }
            if (!m1156i(str2)) {
                break;
            }
            String str3 = null;
            str3 = null;
            try {
                Uri uri = Uri.parse(str2);
                String[] strArr = {"pfurl", "url", "target", "jumpUrl", "jump_url", "redirect", "redirect_url", "redirect_uri", "gourl", "to", "u", "src"};
                int i2 = 0;
                while (true) {
                    if (i2 >= 12) {
                        break;
                    }
                    String queryParameter = uri.getQueryParameter(strArr[i2]);
                    if (queryParameter != null && queryParameter.length() != 0) {
                        String strM1089h2 = AbstractC0497v4.m1089h(queryParameter);
                        if (m1152e(strM1089h2)) {
                            str3 = strM1089h2;
                            break;
                        }
                    }
                    i2++;
                }
            } catch (Throwable unused) {
            }
            if (!m1152e(str3) || str3.equals(str2)) {
                break;
            }
            i++;
            str2 = str3;
        }
        return str2;
    }
}
