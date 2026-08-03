package p025bc;

import af.C0081d;
import com.alibaba.fastjson2.JSONReader;
import java.util.Locale;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p071f1.C1034w;
import p080fb.AbstractC1184v0;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p230p8.C3351d0;

/* JADX INFO: renamed from: bc.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0255e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1012a(int i9) {
        if (i9 == 1) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (i9 == 2) {
            return "\n */";
        }
        if (i9 == 3) {
            return " */";
        }
        if (i9 == 4) {
            return "\n */";
        }
        if (i9 == 5) {
            return " */";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m1013b(int i9) {
        if (i9 == 1) {
            return "// ";
        }
        if (i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) {
            return " * ";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m1014c(int i9) {
        if (i9 == 1) {
            return "// ";
        }
        if (i9 == 2) {
            return "/*\n * ";
        }
        if (i9 == 3) {
            return "/* ";
        }
        if (i9 == 4) {
            return "/**\n * ";
        }
        if (i9 == 5) {
            return "/** ";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C0081d m1015d(C1836h0 c1836h0, int i9, boolean z9) {
        c1836h0.m4525a0(i9);
        c1836h0.m4553p(z9);
        return new C0081d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m1016e(long j3, C1845j1 c1845j1, C1845j1 c1845j12) {
        c1845j1.setValue(new C1034w(j3));
        return c1845j12.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m1017f(int i9, StringBuilder sb2) {
        sb2.append(Integer.toString(i9));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m1018g(long j3, String str) {
        return str + j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1019h(Object obj, String str, StringBuilder sb2) {
        sb2.append(obj.getClass());
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m1020i(String str, String str2) {
        return str + str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m1021j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m1022k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m1023l(String str, String str2, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str, str2);
        strOptString.getClass();
        return AbstractC3149m.m6703R0(strOptString).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m1024m(StringBuilder sb2, String str, String str2, JSONReader jSONReader) {
        sb2.append(str);
        sb2.append(str2);
        return jSONReader.info(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static StringBuilder m1025n(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static StringBuilder m1026o(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static StringBuilder m1027p(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C3351d0 m1028q() {
        WeChatApis.interaction().getClass();
        return WeChatApis.snsApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m1029r(String str, String str2, int i9, InterfaceC1809a1 interfaceC1809a1) {
        str.getClass();
        interfaceC1809a1.setValue(AbstractC3149m.m6701P0(i9, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m1030s(Throwable th2, StringBuilder sb2, Throwable th3) {
        sb2.append(th2.getMessage());
        AbstractC1184v0.m3204n(sb2.toString(), th3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m1031t(String str, Locale locale, String str2, boolean z9) {
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return AbstractC3149m.m6709h0(lowerCase, str2, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m1032u(Locale locale, String str, Locale locale2, String str2, boolean z9) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return AbstractC3149m.m6709h0(lowerCase, str2, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static String m1033v(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((r1v0 int) != (1 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (2 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (3 int)) ? ("null") : ("CODE")) : ("RESOURCES")) : ("AUTO") */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m1034w(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "CODE" : "RESOURCES" : "AUTO";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((r1v0 int) != (1 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (2 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (3 int)) ? ("null") : ("NEVER")) : ("IF_BETTER")) : ("ALWAYS") */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m1035x(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "NEVER" : "IF_BETTER" : "ALWAYS";
    }
}
