package p136j8;

import gg.AbstractC1426v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import okio.Path;
import org.json.JSONObject;
import p096g8.C1363d;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p218og.AbstractC3149m;
import p281t3.AbstractC4106c;
import p339x1.C5593d;
import p339x1.C5597e;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: j8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2091b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m5154a(int i9) {
        int iM8279b = AbstractC4106c.m8279b(i9);
        return iM8279b == 0 || iM8279b == 1 || iM8279b == 2 || iM8279b == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final String m5155b(int i9) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        switch (i9) {
            case 1:
                str = "NULL";
                break;
            case 2:
                str = "STRING";
                break;
            case 3:
                str = "TABLE";
                break;
            case 4:
                str = "XML";
                break;
            case 5:
                str = "XML_START_NAMESPACE";
                break;
            case 6:
                str = "XML_END_NAMESPACE";
                break;
            case 7:
                str = "XML_START_ELEMENT";
                break;
            case 8:
                str = "XML_END_ELEMENT";
                break;
            case 9:
                str = "XML_CDATA";
                break;
            case 10:
                str = "XML_LAST_CHUNK";
                break;
            case 11:
                str = "XML_RESOURCE_MAP";
                break;
            case 12:
                str = "PACKAGE";
                break;
            case 13:
                str = "TYPE";
                break;
            case 14:
                str = "SPEC";
                break;
            case 15:
                str = "LIBRARY";
                break;
            case 16:
                str = "OVERLAYABLE";
                break;
            case 17:
                str = "OVERLAYABLE_POLICY";
                break;
            case 18:
                str = "STAGED_ALIAS";
                break;
            default:
                throw null;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(AbstractC5999a.m10752o(m5156c(i9)));
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ short m5156c(int i9) {
        switch (i9) {
            case 1:
                return (short) 0;
            case 2:
                return (short) 1;
            case 3:
                return (short) 2;
            case 4:
                return (short) 3;
            case 5:
                return (short) 256;
            case 6:
                return (short) 257;
            case 7:
                return (short) 258;
            case 8:
                return (short) 259;
            case 9:
                return (short) 260;
            case 10:
                return (short) 383;
            case 11:
                return (short) 384;
            case 12:
                return (short) 512;
            case 13:
                return (short) 513;
            case 14:
                return (short) 514;
            case 15:
                return (short) 515;
            case 16:
                return (short) 516;
            case 17:
                return (short) 517;
            case 18:
                return (short) 518;
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m5157d(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        byteBuffer.order(byteOrder);
        return byteBuffer.getInt(byteBuffer.position());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m5158e(List list, int i9, int i10) {
        return (list.hashCode() + i9) * i10;
    }

    /* JADX DEBUG: Class process forced to load method for inline: h.Hchat.hooks.api.core.WeChatApis.c():g8.d */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1363d m5159f() {
        WeChatApis.contact().getClass();
        return WeChatApis.chatroomApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Enum m5160g(Class cls, String str) {
        Class cls2 = AbstractC1426v.m3834a(cls).f4729a;
        cls2.getClass();
        return Enum.valueOf(cls2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m5161h(String str, String str2, String str3) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str2).replaceAll(str3);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m5162i(String str, String str2, String str3, JSONObject jSONObject) {
        str.getClass();
        String strOptString = jSONObject.optString(str2, str3);
        strOptString.getClass();
        return strOptString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m5163j(StringBuilder sb2, int i9, String str) {
        sb2.append(i9);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m5164k(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m5165l(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m5166m(Path path, String str) {
        return str + path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Thread m5167n(String str, boolean z9, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z9);
        return thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Set m5168o() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m5169p(int i9, C1836h0 c1836h0, C5597e c5597e, C1836h0 c1836h02, C5593d c5593d) {
        AbstractC1874r.m4615A(c5597e, c1836h0, Integer.valueOf(i9));
        AbstractC1874r.m4641w(c5593d, c1836h02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m5170q(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m5171r(String str, ArrayList arrayList) {
        arrayList.add(AbstractC3149m.m6703R0(str).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m5172s(StringBuilder sb2, String str, long j3, String str2) {
        sb2.append(str);
        sb2.append(j3);
        sb2.append(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m5173t(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m5174u(int i9) {
        switch (i9) {
            case 1:
                return "NULL";
            case 2:
                return "STRING";
            case 3:
                return "TABLE";
            case 4:
                return "XML";
            case 5:
                return "XML_START_NAMESPACE";
            case 6:
                return "XML_END_NAMESPACE";
            case 7:
                return "XML_START_ELEMENT";
            case 8:
                return "XML_END_ELEMENT";
            case 9:
                return "XML_CDATA";
            case 10:
                return "XML_LAST_CHUNK";
            case 11:
                return "XML_RESOURCE_MAP";
            case 12:
                return "PACKAGE";
            case 13:
                return "TYPE";
            case 14:
                return "SPEC";
            case 15:
                return "LIBRARY";
            case 16:
                return "OVERLAYABLE";
            case 17:
                return "OVERLAYABLE_POLICY";
            case 18:
                return "STAGED_ALIAS";
            default:
                return "null";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m5175v(int i9) {
        switch (i9) {
            case 1:
                return "STATIC_PUT";
            case 2:
                return "STATIC_GET";
            case 3:
                return "INSTANCE_PUT";
            case 4:
                return "INSTANCE_GET";
            case 5:
                return "INVOKE_STATIC";
            case 6:
                return "INVOKE_INSTANCE";
            case 7:
                return "INVOKE_DIRECT";
            case 8:
                return "INVOKE_CONSTRUCTOR";
            case 9:
                return "INVOKE_INTERFACE";
            default:
                return "null";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m5176w(int i9) {
        switch (i9) {
            case 1:
                return "ENCODED_NULL";
            case 2:
                return "ENCODED_BOOLEAN";
            case 3:
                return "ENCODED_BYTE";
            case 4:
                return "ENCODED_SHORT";
            case 5:
                return "ENCODED_CHAR";
            case 6:
                return "ENCODED_INT";
            case 7:
                return "ENCODED_LONG";
            case 8:
                return "ENCODED_FLOAT";
            case 9:
                return "ENCODED_DOUBLE";
            case 10:
                return "ENCODED_STRING";
            case 11:
                return "ENCODED_TYPE";
            case 12:
                return "ENCODED_ENUM";
            case 13:
                return "ENCODED_FIELD";
            case 14:
                return "ENCODED_METHOD";
            case 15:
                return "ENCODED_METHOD_TYPE";
            case 16:
                return "ENCODED_METHOD_HANDLE";
            case 17:
                return "ENCODED_ARRAY";
            case 18:
                return "ENCODED_ANNOTATION";
            default:
                return "null";
        }
    }
}
