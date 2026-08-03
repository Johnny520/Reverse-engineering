package p153k8;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p167l8.C2530e;

/* JADX INFO: renamed from: k8.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2353q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m5641a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("receivehongbao") || lowerCase.contains("wxhb_personalreceive") || lowerCase.contains("/hongbao/")) {
            return true;
        }
        String lowerCase2 = m5643c(str, "nativeurl").toLowerCase();
        if (lowerCase2.contains("receivehongbao") || lowerCase2.contains("wxhb") || lowerCase2.contains("hongbao")) {
            return true;
        }
        return "2001".equals(m5643c(str, "type"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m5642b(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int iIndexOf = str.indexOf(":\n");
        return (iIndexOf <= 0 || str.indexOf("<") <= iIndexOf) ? str : str.substring(iIndexOf + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m5643c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            Matcher matcher = Pattern.compile("<" + str2 + "><!\\[CDATA\\[(.*?)\\]></" + str2 + ">").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            Matcher matcher2 = Pattern.compile("<" + str2 + ">(.*?)</" + str2 + ">").matcher(str);
            return matcher2.find() ? matcher2.group(1) : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m5644d(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("msgsource")) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            Matcher matcher = Pattern.compile("<msgsource\\b[^>]*>(.*?)</msgsource>", 34).matcher(str);
            return matcher.find() ? matcher.group(1) : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m5645e(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                Iterator<Field> it = KavaReflector.declaredFields(cls).iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getName())) {
                        return true;
                    }
                }
                cls = cls.getSuperclass();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m5646f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith("@chatroom") || str.endsWith("@im.chatroom") || str.endsWith("@openim");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m5647g(String str) {
        return TextUtils.isEmpty(str) || "false".equalsIgnoreCase(str) || "true".equalsIgnoreCase(str) || "0".equals(str) || "1".equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m5648h(Class cls) {
        if (cls == null || cls.isPrimitive() || cls.isArray() || cls == String.class || Number.class.isAssignableFrom(cls) || cls == Boolean.class || !m5645e(cls, "e") || !m5645e(cls, "f")) {
            return false;
        }
        if (m5645e(cls, "h") || m5645e(cls, "m")) {
            return m5645e(cls, "g") || m5645e(cls, "i");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m5649i(String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strTrim = str.trim();
        if (!strTrim.contains("<msgsource")) {
            if (strTrim.contains("<atuserlist")) {
                str2 = "<msgsource>";
                str3 = "</msgsource>";
            } else if (strTrim.contains("atuserlist") || strTrim.contains("notify@all") || strTrim.contains("announcement@all")) {
                str2 = "<msgsource><atuserlist>";
                str3 = "</atuserlist></msgsource>";
            }
            return AbstractC0921a.m2251n(str2, strTrim, str3);
        }
        return strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m5650j(String str) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f2 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2530e m5651k(Object obj, String str) {
        String strM5649i;
        String strM5655o;
        String str2;
        String str3;
        String strM5650j;
        String str4;
        int i9;
        int iIndexOf;
        if (obj == null) {
            return null;
        }
        String[] strArr = {"h", "m", "i"};
        int i10 = 0;
        while (true) {
            strM5649i = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i10 >= 3) {
                strM5655o = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            }
            strM5655o = m5655o(obj, strArr[i10]);
            if (!TextUtils.isEmpty(strM5655o)) {
                break;
            }
            i10++;
        }
        if (TextUtils.isEmpty(strM5655o)) {
            return null;
        }
        String strM5642b = m5642b(strM5655o);
        String strM5650j2 = m5650j(m5654n(obj, "e"));
        String strM5650j3 = m5650j(m5654n(obj, "f"));
        if (!m5646f(strM5650j3)) {
            if (!m5646f(strM5650j2) && !TextUtils.isEmpty(str)) {
                str2 = str;
                if (!str2.equals(strM5650j2) || TextUtils.isEmpty(strM5650j3)) {
                }
                if (!TextUtils.isEmpty(str3)) {
                    strM5650j3 = str3;
                }
                strM5650j = m5650j(strM5650j3);
                if (!TextUtils.isEmpty(strM5650j) && !m5647g(strM5650j)) {
                    String strM5643c = m5643c(strM5642b, "fromusername");
                    if (TextUtils.isEmpty(strM5643c) && !TextUtils.isEmpty(strM5655o) && (iIndexOf = strM5655o.indexOf(":\n")) > 0) {
                        strM5643c = strM5655o.substring(0, iIndexOf);
                    }
                    if (!TextUtils.isEmpty(strM5643c)) {
                        strM5650j2 = strM5643c;
                    }
                    String strM5650j4 = m5650j(strM5650j2);
                    if (m5647g(strM5650j4)) {
                        return null;
                    }
                    String strM5643c2 = m5643c(strM5642b, "nativeurl");
                    if (TextUtils.isEmpty(strM5643c2)) {
                        strM5643c2 = m5643c(strM5655o, "nativeurl");
                    }
                    String strM5643c3 = m5643c(strM5642b, "exclusive_recv_username");
                    String strM5644d = m5644d(strM5642b);
                    if (TextUtils.isEmpty(strM5644d)) {
                        strM5644d = m5644d(strM5655o);
                    }
                    if (TextUtils.isEmpty(strM5644d)) {
                        String strM5655o2 = m5655o(obj, "p");
                        if (TextUtils.isEmpty(strM5655o2)) {
                            String strM5655o3 = m5655o(obj, "q");
                            if (TextUtils.isEmpty(strM5655o3) || !strM5655o3.contains("msgsource")) {
                                String[] strArr2 = {"j", "k", "l", "n", "p", "s", "t"};
                                for (int i11 = 0; i11 < 7; i11++) {
                                    String strM5655o4 = m5655o(obj, strArr2[i11]);
                                    if (!TextUtils.isEmpty(strM5655o4) && strM5655o4.contains("msgsource")) {
                                        str4 = strM5655o4;
                                        break;
                                    }
                                }
                            } else {
                                strM5649i = m5649i(strM5655o3);
                            }
                        } else {
                            strM5649i = m5649i(strM5655o2);
                        }
                    } else {
                        strM5649i = AbstractC0921a.m2251n("<msgsource>", strM5644d, "</msgsource>");
                    }
                    str4 = strM5649i;
                    m5646f(strM5650j);
                    boolean zM5641a = m5641a(strM5655o);
                    long jM5653m = m5653m(obj, "g");
                    int iInferType = (jM5653m > 2147483647L || jM5653m < -2147483648L) ? 0 : (int) jM5653m;
                    long jM5653m2 = m5653m(obj, "i");
                    int i12 = (jM5653m2 > 2147483647L || jM5653m2 < -2147483648L) ? 0 : (int) jM5653m2;
                    if (iInferType <= 0) {
                        iInferType = i12 > 0 ? i12 : WeChatMessage.inferType(strM5655o);
                    }
                    long jM5653m3 = m5653m(obj, "o");
                    long jM5653m4 = m5653m(obj, "q");
                    long j3 = jM5653m3;
                    if (jM5653m3 < 946656000 || j3 > 4102444800L) {
                        j3 = (jM5653m4 < 946656000 || jM5653m4 > 4102444800L) ? 0L : jM5653m4;
                    }
                    long j4 = j3 > 0 ? j3 : 0L;
                    long jM5653m5 = m5653m(obj, "r");
                    long jM5653m6 = m5653m(obj, "u");
                    if (jM5653m5 <= 100000) {
                        if (jM5653m6 > 100000) {
                            jM5653m5 = jM5653m6;
                        } else if (jM5653m5 <= 0) {
                            i9 = iInferType;
                            jM5653m5 = Math.max(jM5653m6, 0L);
                        }
                        i9 = iInferType;
                    } else {
                        i9 = iInferType;
                    }
                    return new C2530e(strM5655o, strM5642b, strM5650j4, strM5650j, strM5643c2, strM5643c3, zM5641a, i9, j4, jM5653m5, str4, str2);
                }
            }
            str2 = str;
            str3 = strM5650j2;
            if (!TextUtils.isEmpty(str3)) {
            }
            strM5650j = m5650j(strM5650j3);
            return !TextUtils.isEmpty(strM5650j) ? null : null;
        }
        str2 = str;
        str3 = strM5650j3;
        if (!TextUtils.isEmpty(str3)) {
        }
        strM5650j = m5650j(strM5650j3);
        if (!TextUtils.isEmpty(strM5650j)) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Object m5652l(Object obj, String str) {
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str);
            if (fieldFindFieldRecursive != null) {
                return KavaReflector.readField(fieldFindFieldRecursive, obj);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static long m5653m(Object obj, String str) {
        Object objM5652l = m5652l(obj, str);
        if (objM5652l instanceof Number) {
            return ((Number) objM5652l).longValue();
        }
        if (objM5652l == null) {
            return 0L;
        }
        try {
            return Long.parseLong(String.valueOf(objM5652l));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m5654n(Object obj, String str) {
        Object objM5652l = m5652l(obj, str);
        if (objM5652l == null || (objM5652l instanceof Boolean) || (objM5652l instanceof Number)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (objM5652l instanceof CharSequence) {
            return String.valueOf(objM5652l);
        }
        Object objM5652l2 = m5652l(objM5652l, "d");
        return objM5652l2 != null ? String.valueOf(objM5652l2) : String.valueOf(objM5652l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m5655o(Object obj, String str) {
        Object objM5652l = m5652l(obj, str);
        if (objM5652l == null || (objM5652l instanceof Boolean) || (objM5652l instanceof Number)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (objM5652l instanceof CharSequence) {
            return String.valueOf(objM5652l);
        }
        Object objM5652l2 = m5652l(objM5652l, "d");
        return objM5652l2 != null ? String.valueOf(objM5652l2) : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
