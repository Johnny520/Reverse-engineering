package p212oa;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.p221ws.WebSocketProtocol;

/* JADX INFO: renamed from: oa.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3107b {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10080a = Pattern.compile("[|,，\\n\\r]+");

    /* JADX INFO: renamed from: b */
    public static final String[] f10081b = {"wishing", "memo", "remark"};

    /* JADX INFO: renamed from: c */
    public static final String[] f10082c = {"sendertitle", "description", "des", "wording"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m6611a(String str, StringBuilder sb2, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (z9 && !TextUtils.isEmpty(strTrim)) {
            String strTrim2 = strTrim.replace(" ", HttpUrl.FRAGMENT_ENCODE_SET).replace(" ", HttpUrl.FRAGMENT_ENCODE_SET).replace("\u2005", HttpUrl.FRAGMENT_ENCODE_SET).trim();
            if (strTrim2.contains("给你发了一个红包") || strTrim2.contains("给您发了一个红包") || strTrim2.contains("发了一个红包") || strTrim2.contains("发来一个红包") || "微信红包".equals(strTrim2) || "红包".equals(strTrim2)) {
                return;
            }
        }
        if (sb2.indexOf(strTrim) >= 0) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append('\n');
        }
        sb2.append(strTrim);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m6612b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                int iIndexOf = strTrim.indexOf(":\n");
                if (iIndexOf > 0) {
                    int i9 = iIndexOf + 2;
                    if (strTrim.indexOf(60, i9) >= 0) {
                        strTrim = strTrim.substring(i9).trim();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : f10081b) {
                    m6611a(m6615e(strTrim, str3), sb2, false);
                }
                for (String str4 : f10082c) {
                    m6611a(m6615e(strTrim, str4), sb2, true);
                }
                if (sb2.length() > 0) {
                    strTrim = sb2.toString();
                } else {
                    int iIndexOf2 = strTrim.indexOf(60);
                    int iIndexOf3 = strTrim.indexOf(62, iIndexOf2 + 1);
                    if (iIndexOf2 >= 0 && iIndexOf3 > iIndexOf2) {
                        strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
                if (TextUtils.isEmpty(strTrim)) {
                    return false;
                }
                String[] strArrSplit = f10080a.split(str2);
                int length = strArrSplit.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String str5 = strArrSplit[i10];
                    String strTrim2 = str5 != null ? str5.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
                    if (!TextUtils.isEmpty(strTrim2) && strTrim.contains(strTrim2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m6613c(String str, String str2, String str3) {
        String strM6615e;
        try {
            if (TextUtils.isEmpty(str3)) {
                strM6615e = null;
            } else {
                strM6615e = m6614d(str3, "sceneid");
                if (TextUtils.isEmpty(strM6615e)) {
                    strM6615e = m6614d(str3, "scene_id");
                }
                if (TextUtils.isEmpty(strM6615e)) {
                    strM6615e = m6614d(str3, "scene");
                }
            }
            if (TextUtils.isEmpty(strM6615e)) {
                strM6615e = m6615e(str, "sceneid");
            }
            if (TextUtils.isEmpty(strM6615e)) {
                strM6615e = m6615e(str, "scene_id");
            }
            if (!TextUtils.isEmpty(strM6615e)) {
                if (TextUtils.isEmpty(strM6615e)) {
                    return 1002;
                }
                try {
                    return Integer.parseInt(strM6615e);
                } catch (Throwable unused) {
                    return 1002;
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            String lowerCase = (String.valueOf(str2) + " " + String.valueOf(str3) + " " + String.valueOf(str)).toLowerCase();
            if (!lowerCase.contains("sceneid=1005") && !lowerCase.contains("scene_id=1005") && !lowerCase.contains("@openim") && !lowerCase.contains("openim") && !lowerCase.contains("@im.chatroom") && !lowerCase.contains("im.chatroom") && !lowerCase.contains("imchatroom") && !lowerCase.contains("wework") && !lowerCase.contains("wxwork") && !lowerCase.contains("union_source")) {
                if (!lowerCase.contains("企业微信")) {
                    return 1002;
                }
            }
            return WebSocketProtocol.CLOSE_NO_STATUS_CODE;
        } catch (Throwable unused3) {
            return 1002;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m6614d(String str, String str2) {
        int iIndexOf;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            String strConcat = str2.concat("=");
            int iIndexOf2 = str.indexOf(63);
            for (int i9 = iIndexOf2 >= 0 ? iIndexOf2 + 1 : 0; i9 < str.length(); i9 = iIndexOf + 1) {
                iIndexOf = str.indexOf(38, i9);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                if (str.startsWith(strConcat, i9)) {
                    return str.substring(i9 + strConcat.length(), iIndexOf);
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m6615e(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Matcher matcher = Pattern.compile("<" + str2 + "><!\\[CDATA\\[(.*?)\\]></" + str2 + ">").matcher(str);
                if (matcher.find()) {
                    return matcher.group(1);
                }
                Matcher matcher2 = Pattern.compile("<" + str2 + ">(.*?)</" + str2 + ">").matcher(str);
                if (matcher2.find()) {
                    return matcher2.group(1);
                }
            } catch (Throwable unused) {
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m6616f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith("@chatroom") || str.endsWith("@im.chatroom") || str.endsWith("@openim");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m6617g(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strTrim = str.trim();
        while (true) {
            if (!strTrim.endsWith("]") && !strTrim.endsWith(")") && !strTrim.endsWith("，") && !strTrim.endsWith(",") && !strTrim.endsWith(";") && !strTrim.endsWith("；")) {
                break;
            }
            strTrim = strTrim.substring(0, strTrim.length() - 1).trim();
        }
        int iIndexOf = strTrim.indexOf(10);
        return iIndexOf > 0 ? strTrim.substring(0, iIndexOf).trim() : strTrim;
    }
}
