package p080fb;

import android.text.Html;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.Base64;
import bi.C0315c;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;
import p036c9.C0415a0;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.C3147k;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3962i;
import p332wb.AbstractC4855en;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4174u;

/* JADX INFO: renamed from: fb.h2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1130h2 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f3696a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final C1186w f3697b = new C1186w(3);

    /* JADX INFO: renamed from: c */
    public static final C3962i f3698c = new C3962i(new C0315c(21));

    /* JADX INFO: renamed from: d */
    public static final C1186w f3699d = new C1186w(4);

    /* JADX INFO: renamed from: e */
    public static final C3962i f3700e = new C3962i(new C0315c(22));

    /* JADX INFO: renamed from: f */
    public static final C3147k f3701f = new C3147k("(?:\\d{1,3}\\.){3}\\d{1,3}");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m2875a(String str) {
        return "[联网搜索错误] ".concat(AbstractC3149m.m6701P0(600, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2876b(String str) {
        String strM6706U0;
        Pattern patternCompile = Pattern.compile("(?i)https?://[^\\s<>\"']+");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        if (c3145iM238b == null || (strM6706U0 = AbstractC3149m.m6706U0(c3145iM238b.m6678c(), '.', ',', ';', ':', 65292, 12290, 65307, 65306, ')', 65289, ']', 12305)) == null || m2892r(strM6706U0) == null) {
            return null;
        }
        return strM6706U0;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb A[Catch: all -> 0x00da, TryCatch #3 {all -> 0x00da, blocks: (B:28:0x00b6, B:30:0x00c0, B:32:0x00c8, B:38:0x00e2, B:40:0x00ea, B:42:0x00f2, B:45:0x0106, B:48:0x011d, B:49:0x0154, B:53:0x015f, B:55:0x0165, B:57:0x0174, B:59:0x017c, B:61:0x0184, B:63:0x018c, B:65:0x0194, B:69:0x019f, B:71:0x01cb, B:73:0x01d1, B:74:0x01f4), top: B:106:0x00b6, outer: #1 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1110c2 m2877c(String str, C1103b c1103b, Map map, int i9, int i10) {
        C1110c2 c1110c2;
        C1110c2 c1110c22;
        Set set = c1103b.f3554b;
        Map map2 = (i10 & 4) != 0 ? C4174u.f13711g : map;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        HttpUrl httpUrlM2892r = m2892r(str);
        if (httpUrlM2892r == null) {
            return new C1110c2(0, null, null, null, false, "URL 无效", 31);
        }
        String strHost = httpUrlM2892r.host();
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, strHost, locale);
        String str3 = (strM5165l.equals("localhost") || AbstractC3156t.m6733W(strM5165l, ".localhost", false) || AbstractC3156t.m6733W(strM5165l, ".local", false) || AbstractC3156t.m6733W(strM5165l, ".internal", false)) ? "拒绝访问本地网络地址" : null;
        if (str3 != null) {
            return new C1110c2(0, null, null, null, false, str3, 31);
        }
        Request.Builder builderHeader = new Request.Builder().url(httpUrlM2892r).header("User-Agent", "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36 Hchat-Plugin-Agent/1.1").header("Accept", "text/html,application/xhtml+xml,application/json,application/xml;q=0.9,text/plain;q=0.8,*/*;q=0.5").header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.6");
        for (Map.Entry entry : map2.entrySet()) {
            builderHeader.header((String) entry.getKey(), (String) entry.getValue());
        }
        Call callNewCall = ((OkHttpClient) f3700e.getValue()).newCall(builderHeader.get().build());
        c1103b.m2825a(callNewCall);
        try {
            Response responseExecute = callNewCall.execute();
            try {
                c1103b.m2828d();
                if (responseExecute.isSuccessful()) {
                    String strHeader$default = Response.header$default(responseExecute, "Content-Type", null, 2, null);
                    String str4 = strHeader$default == null ? HttpUrl.FRAGMENT_ENCODE_SET : strHeader$default;
                    if (!AbstractC3149m.m6721t0(str4)) {
                        Locale locale2 = Locale.US;
                        String strM5165l2 = AbstractC2091b.m5165l(locale2, str4, locale2);
                        if (AbstractC3156t.m6740d0(strM5165l2, "text/", false) || AbstractC3149m.m6709h0(strM5165l2, "json", false) || AbstractC3149m.m6709h0(strM5165l2, "xml", false) || AbstractC3149m.m6709h0(strM5165l2, "javascript", false) || AbstractC3149m.m6709h0(strM5165l2, "markdown", false) || AbstractC3149m.m6709h0(strM5165l2, "github.raw", false)) {
                            ResponseBody responseBodyBody = responseExecute.body();
                            if (responseBodyBody != null) {
                                C1118e2 c1118e2M2888n = m2888n(responseBodyBody, i9);
                                c1110c2 = new C1110c2(responseExecute.code(), responseExecute.request().url().toString(), str4, c1118e2M2888n.f3667a, c1118e2M2888n.f3668b, null, 32);
                            } else {
                                c1110c2 = new C1110c2(responseExecute.code(), responseExecute.request().url().toString(), str4, null, false, "响应为空", 24);
                            }
                        } else {
                            c1110c2 = new C1110c2(responseExecute.code(), responseExecute.request().url().toString(), str4, null, false, "响应类型不可读取: " + str4, 24);
                        }
                        c1110c22 = c1110c2;
                    }
                } else {
                    String strHeader$default2 = Response.header$default(responseExecute, "Retry-After", null, 2, null);
                    String str5 = strHeader$default2 != null ? ", Retry-After=" + strHeader$default2 : null;
                    if (str5 == null) {
                        str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String strHeader$default3 = Response.header$default(responseExecute, "X-RateLimit-Remaining", null, 2, null);
                    if (strHeader$default3 != null) {
                        String strHeader$default4 = Response.header$default(responseExecute, "X-RateLimit-Reset", null, 2, null);
                        str = strHeader$default4 != null ? ", reset=" + strHeader$default4 : null;
                        if (str == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        str = ", rateLimitRemaining=" + strHeader$default3 + str;
                    }
                    if (str == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    c1110c22 = new C1110c2(responseExecute.code(), responseExecute.request().url().toString(), null, null, false, "HTTP " + responseExecute.code() + str5 + str, 28);
                }
                responseExecute.close();
                set.remove(callNewCall);
                return c1110c22;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                if (c1103b.m2826b(th2)) {
                    throw new CancellationException("Agent 已中断");
                }
                String simpleName = th2.getClass().getSimpleName();
                String message = th2.getMessage();
                if (message != null) {
                    str2 = message;
                }
                return new C1110c2(0, null, null, null, false, simpleName + ": " + AbstractC3149m.m6701P0(240, str2), 31);
            } finally {
                callNewCall.getClass();
                set.remove(callNewCall);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2878d(C1114d2 c1114d2, String str, List list, String str2, String str3, boolean z9) {
        StringBuilder sb2 = new StringBuilder("[GitHub 文件]\n");
        String str4 = c1114d2.f3652a;
        String str5 = c1114d2.f3653b;
        String strM8392A1 = AbstractC4166m.m8392A1(list, "/", null, null, null, 62);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("路径: ", str4, "/", str5, "/");
        sbM1027p.append(strM8392A1);
        sb2.append(sbM1027p.toString());
        sb2.append('\n');
        sb2.append("分支: ".concat(str));
        sb2.append('\n');
        sb2.append("来源: " + str2);
        sb2.append("\n\n");
        sb2.append(str3);
        if (z9) {
            sb2.append("\n[文件内容已截断]\n");
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static HttpUrl m2879e(String... strArr) {
        HttpUrl httpUrlM2892r = m2892r("https://api.github.com");
        httpUrlM2892r.getClass();
        HttpUrl.Builder builderNewBuilder = httpUrlM2892r.newBuilder();
        for (String str : strArr) {
            builderNewBuilder.addPathSegment(str);
        }
        return builderNewBuilder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m2880f(C1114d2 c1114d2, String str, List list) {
        HttpUrl httpUrlM2892r = m2892r("https://raw.githubusercontent.com");
        httpUrlM2892r.getClass();
        HttpUrl.Builder builderAddPathSegment = httpUrlM2892r.newBuilder().addPathSegment(c1114d2.f3652a).addPathSegment(c1114d2.f3653b).addPathSegment(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builderAddPathSegment.addPathSegment((String) it.next());
        }
        return builderAddPathSegment.build().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m2881g(String str) {
        return m2882h(str) && AbstractC3149m.m6709h0(str, "[网页搜索结果]", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m2882h(String str) {
        str.getClass();
        return AbstractC3156t.m6740d0(AbstractC3149m.m6707V0(str).toString(), "[联网搜索错误]", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3 A[RETURN] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2883i(InetAddress inetAddress) {
        if (!inetAddress.isAnyLocalAddress() && !inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && !inetAddress.isSiteLocalAddress() && !inetAddress.isMulticastAddress()) {
            String hostAddress = inetAddress.getHostAddress();
            if (hostAddress == null) {
                hostAddress = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String strM6698M0 = AbstractC3149m.m6698M0(hostAddress, '%');
            List listM6691F0 = AbstractC3149m.m6691F0(strM6698M0, new char[]{'.'}, 6);
            if (listM6691F0.size() == 4) {
                if (!listM6691F0.isEmpty()) {
                    Iterator it = listM6691F0.iterator();
                    while (it.hasNext()) {
                        if (!(AbstractC3156t.m6742f0((String) it.next()) != null)) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
                Iterator it2 = listM6691F0.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                }
                int iIntValue = ((Number) arrayList.get(0)).intValue();
                int iIntValue2 = ((Number) arrayList.get(1)).intValue();
                if (iIntValue != 0 && iIntValue != 10 && iIntValue != 127 && ((iIntValue != 100 || 64 > iIntValue2 || iIntValue2 >= 128) && ((iIntValue != 169 || iIntValue2 != 254) && ((iIntValue != 172 || 16 > iIntValue2 || iIntValue2 >= 32) && (iIntValue != 192 || iIntValue2 != 168))))) {
                    return false;
                }
            }
            Locale locale = Locale.US;
            String strM5165l = AbstractC2091b.m5165l(locale, strM6698M0, locale);
            if (strM5165l.equals("::1") || AbstractC3156t.m6740d0(strM5165l, "fc", false) || AbstractC3156t.m6740d0(strM5165l, "fd", false)) {
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m2884j(String str) {
        String strM5161h = AbstractC2091b.m5161h("[ \\t]+", AbstractC3156t.m6738b0(str, (char) 160, ' '), " ");
        Pattern patternCompile = Pattern.compile("\n{3,}");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM5161h).replaceAll("\n\n");
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static InetAddress m2885k(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'.'}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            Integer numM6742f0 = AbstractC3156t.m6742f0((String) it.next());
            if (numM6742f0 == null) {
                return null;
            }
            arrayList.add(numM6742f0);
        }
        if (arrayList.size() != 4) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (!(iIntValue >= 0 && iIntValue < 256)) {
                    return null;
                }
            }
        }
        byte[] bArr = new byte[4];
        for (int i9 = 0; i9 < 4; i9++) {
            bArr[i9] = (byte) ((Number) arrayList.get(i9)).intValue();
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m2886l(String str, C1103b c1103b) {
        String string;
        String str2;
        String strM2884j = null;
        C1110c2 c1110c2M2877c = m2877c(str, c1103b, null, 524288, 20);
        String str3 = c1110c2M2877c.f3613d;
        String str4 = c1110c2M2877c.f3611b;
        String str5 = c1110c2M2877c.f3615f;
        String strM2891q = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str5 != null) {
            if (AbstractC3149m.m6709h0(str5, "SSLHandshakeException", false) || AbstractC3149m.m6709h0(str5, "UnknownHostException", false) || AbstractC3149m.m6709h0(str5, "connection closed", true)) {
                strM2891q = m2891q(str, c1103b);
            }
            if (AbstractC3149m.m6721t0(strM2891q) || m2882h(strM2891q)) {
                return m2875a("读取页面失败: ".concat(str5));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2875a("读取页面失败: ".concat(str5)));
            sb2.append("\n已附上搜索候选，不能将其当作网页正文。\n");
            sb2.append("来源: " + str);
            sb2.append("\n\n");
            sb2.append(strM2891q);
            return sb2.toString();
        }
        String str6 = c1110c2M2877c.f3612c;
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, str6, locale);
        if (AbstractC3149m.m6709h0(strM5165l, "json", false) || AbstractC3149m.m6709h0(strM5165l, "xml", false) || AbstractC3156t.m6740d0(strM5165l, "text/plain", false)) {
            return "[网页内容]\n" + "来源: ".concat(str4) + "\n\n" + m2884j(str3);
        }
        if (!AbstractC3149m.m6721t0(strM5165l) && !AbstractC3149m.m6709h0(strM5165l, "html", false) && !AbstractC3156t.m6740d0(strM5165l, "text/", false)) {
            return m2875a("页面不是可读取的文本内容: ".concat(strM5165l));
        }
        Pattern patternCompile = Pattern.compile("(?is)<(script|style|noscript|svg)[^>]*>.*?</\\1>");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str3).replaceAll(" ");
        strReplaceAll.getClass();
        Spanned spannedFromHtml = Html.fromHtml(strReplaceAll, 0);
        spannedFromHtml.getClass();
        Pattern patternCompile2 = Pattern.compile("(?is)<title[^>]*>(.*?)</title>");
        patternCompile2.getClass();
        Matcher matcher = patternCompile2.matcher(str3);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str3);
        if (c3145iM238b != null && (str2 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a())) != null) {
            Spanned spannedFromHtml2 = Html.fromHtml(str2, 0);
            spannedFromHtml2.getClass();
            strM2884j = m2884j(spannedFromHtml2.toString());
        }
        if (strM2884j != null) {
            strM2891q = strM2884j;
        }
        String strM2884j2 = m2884j(spannedFromHtml.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        spans.getClass();
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            String url = uRLSpan.getURL();
            url.getClass();
            HttpUrl httpUrlM2892r = m2892r(url);
            if (httpUrlM2892r != null && (string = httpUrlM2892r.toString()) != null && (AbstractC3156t.m6740d0(string, "http://", false) || AbstractC3156t.m6740d0(string, "https://", false))) {
                int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
                if (spanStart < 0) {
                    spanStart = 0;
                }
                int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
                int length = spannedFromHtml.length();
                if (spanEnd > length) {
                    spanEnd = length;
                }
                String strM6701P0 = AbstractC3149m.m6701P0(Opcodes.GETFIELD, m2884j(spannedFromHtml.subSequence(spanStart, spanEnd).toString()));
                if (!AbstractC3149m.m6721t0(strM6701P0)) {
                    linkedHashMap.putIfAbsent(string, strM6701P0);
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C1122f2((String) entry.getValue(), (String) entry.getKey()));
        }
        StringBuilder sb3 = new StringBuilder("[网页内容]\n");
        if (!AbstractC3149m.m6721t0(strM2891q)) {
            sb3.append("标题: ".concat(AbstractC3149m.m6701P0(400, strM2891q)));
            sb3.append('\n');
        }
        sb3.append("来源: ".concat(str4));
        sb3.append('\n');
        if (!arrayList.isEmpty()) {
            sb3.append("链接:\n");
            for (C1122f2 c1122f2 : AbstractC4166m.m8403L1(20, arrayList)) {
                sb3.append("- " + c1122f2.f3673a + ": " + c1122f2.f3674b);
                sb3.append('\n');
            }
        }
        sb3.append('\n');
        sb3.append(strM2884j2);
        return sb3.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m2887m(C1114d2 c1114d2, String str, C1103b c1103b) {
        Object c3959f;
        String str2;
        Object c3959f2;
        String string;
        C3958e c3958e;
        String str3 = c1114d2.f3652a;
        String str4 = c1114d2.f3653b;
        String string2 = m2879e("repos", str3, str4).toString();
        Map mapSingletonMap = Collections.singletonMap("Accept", "application/vnd.github+json");
        mapSingletonMap.getClass();
        C1110c2 c1110c2M2877c = m2877c(string2, c1103b, mapSingletonMap, 98304, 16);
        String str5 = c1110c2M2877c.f3615f;
        if (str5 != null) {
            Iterator it = AbstractC0000a.m101y0("main", "master").iterator();
            while (true) {
                if (!it.hasNext()) {
                    c3958e = null;
                    break;
                }
                String str6 = (String) it.next();
                C1110c2 c1110c2M2877c2 = m2877c(m2880f(c1114d2, str6, AbstractC0000a.m99x0("README.md")), c1103b, null, 163840, 20);
                C1110c2 c1110c2 = (c1110c2M2877c2.f3615f != null || AbstractC3149m.m6721t0(c1110c2M2877c2.f3613d)) ? null : c1110c2M2877c2;
                c3958e = c1110c2 != null ? new C3958e(str6, c1110c2.f3613d) : null;
                if (c3958e != null) {
                    break;
                }
            }
            if (c3958e == null) {
                String strM2886l = m2886l(str, c1103b);
                if (!m2882h(strM2886l)) {
                    return AbstractC4855en.m9264h(strM2886l, "\n\nGitHub API: ", str5);
                }
                return m2875a("读取 GitHub 仓库失败: " + str5 + "；" + AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(strM2886l, "[联网搜索错误]")).toString());
            }
            StringBuilder sb2 = new StringBuilder("[GitHub 仓库]\n");
            sb2.append("仓库: " + str3 + "/" + str4);
            sb2.append('\n');
            StringBuilder sb3 = new StringBuilder("地址: ");
            sb3.append(str);
            sb2.append(sb3.toString());
            sb2.append('\n');
            sb2.append("默认分支候选: " + c3958e.f12961g);
            sb2.append('\n');
            sb2.append("GitHub API: ".concat(str5));
            sb2.append("\n\n[README]\n");
            sb2.append(m2884j((String) c3958e.f12962h));
            return sb2.toString();
        }
        try {
            c3959f = new JSONObject(c1110c2M2877c.f3613d);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c3959f;
        if (obj instanceof C3959f) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return m2875a("GitHub 仓库返回的 JSON 无法解析");
        }
        String strOptString = jSONObject.optString("default_branch", "main");
        String str7 = AbstractC3149m.m6721t0(strOptString) ? "main" : strOptString;
        C1110c2 c1110c2M2877c3 = m2877c(m2879e("repos", str3, str4, "readme").toString(), c1103b, AbstractC4178y.m8439b0(new C3958e("Accept", "application/vnd.github.raw"), new C3958e("X-GitHub-Api-Version", "2022-11-28")), 163840, 16);
        if (c1110c2M2877c3.f3615f == null) {
            str2 = null;
        } else {
            str2 = null;
            C1110c2 c1110c2M2877c4 = m2877c(m2880f(c1114d2, str7, AbstractC0000a.m99x0("README.md")), c1103b, null, 163840, 20);
            if (c1110c2M2877c4.f3615f != null || AbstractC3149m.m6721t0(c1110c2M2877c4.f3613d)) {
                c1110c2M2877c4 = null;
            }
            if (c1110c2M2877c4 != null) {
                c1110c2M2877c3 = c1110c2M2877c4;
            }
        }
        String str8 = c1110c2M2877c3.f3613d;
        String str9 = c1110c2M2877c3.f3615f;
        String str10 = str7;
        String str11 = str2;
        String string3 = m2879e("repos", c1114d2.f3652a, str4, "git", "trees", str10).newBuilder().addQueryParameter("recursive", "1").build().toString();
        Map mapSingletonMap2 = Collections.singletonMap("Accept", "application/vnd.github+json");
        mapSingletonMap2.getClass();
        C1110c2 c1110c2M2877c5 = m2877c(string3, c1103b, mapSingletonMap2, Opcodes.ASM6, 16);
        String str12 = c1110c2M2877c5.f3613d;
        String str13 = c1110c2M2877c5.f3615f;
        StringBuilder sb4 = new StringBuilder("[GitHub 仓库]\n");
        String strOptString2 = jSONObject.optString("full_name", str3 + "/" + str4);
        StringBuilder sb5 = new StringBuilder("仓库: ");
        sb5.append(strOptString2);
        sb4.append(sb5.toString());
        sb4.append('\n');
        sb4.append("地址: " + jSONObject.optString("html_url", str));
        sb4.append('\n');
        String strM1023l = AbstractC0255e.m1023l("description", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            strM1023l = str11;
        }
        if (strM1023l != null) {
            sb4.append("简介: ".concat(AbstractC3149m.m6701P0(1000, strM1023l)));
            sb4.append('\n');
        }
        sb4.append("默认分支: ".concat(str10));
        sb4.append('\n');
        String strOptString3 = jSONObject.optString("language", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString3.getClass();
        if (AbstractC3149m.m6721t0(strOptString3)) {
            strOptString3 = str11;
        }
        if (strOptString3 != null) {
            sb4.append("主要语言: ".concat(strOptString3));
            sb4.append('\n');
        }
        sb4.append("Stars: " + jSONObject.optInt("stargazers_count", 0) + "，Forks: " + jSONObject.optInt("forks_count", 0));
        sb4.append('\n');
        StringBuilder sb6 = new StringBuilder("来源: ");
        sb6.append(str);
        sb4.append(sb6.toString());
        sb4.append('\n');
        if (str9 == null && !AbstractC3149m.m6721t0(str8)) {
            sb4.append("\n[README]\n");
            sb4.append(m2884j(str8));
            sb4.append('\n');
        }
        if (str13 == null && !AbstractC3149m.m6721t0(str12)) {
            sb4.append("\n[文件树]\n");
            try {
                c3959f2 = new JSONObject(str12);
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            if (c3959f2 instanceof C3959f) {
                c3959f2 = str11;
            }
            JSONObject jSONObject2 = (JSONObject) c3959f2;
            if (jSONObject2 != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("tree");
                if (jSONArrayOptJSONArray != null) {
                    StringBuilder sb7 = new StringBuilder();
                    int iMin = Math.min(jSONArrayOptJSONArray.length(), 800);
                    for (int i9 = 0; i9 < iMin; i9++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i9);
                        if (jSONObjectOptJSONObject != null) {
                            sb7.append(jSONObjectOptJSONObject.optString("type", "blob"));
                            sb7.append(" ");
                            sb7.append(jSONObjectOptJSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET));
                            sb7.append('\n');
                        }
                    }
                    if (jSONArrayOptJSONArray.length() > 800 || jSONObject2.optBoolean("truncated", false)) {
                        sb7.append("... 文件树过长，以上为前 800 项\n");
                    }
                    string = AbstractC3149m.m6705T0(sb7.toString()).toString();
                } else {
                    string = "文件树为空";
                }
            } else {
                string = "文件树 JSON 无法解析";
            }
            sb4.append(string);
            sb4.append('\n');
        }
        if (str9 != null) {
            sb4.append("README: ".concat(str9));
            sb4.append('\n');
        }
        if (str13 != null) {
            sb4.append("文件树: ".concat(str13));
            sb4.append('\n');
        }
        return sb4.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: n */
    public static C1118e2 m2888n(ResponseBody responseBody, int i9) {
        Charset charset;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.min(i9, 65536));
        InputStream inputStreamByteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            boolean z9 = false;
            int i10 = 0;
            while (i10 < i9) {
                int i11 = inputStreamByteStream.read(bArr, 0, Math.min(8192, i9 - i10));
                if (i11 <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
                i10 += i11;
            }
            if (i10 >= i9) {
                if (inputStreamByteStream.read() != -1) {
                    z9 = true;
                }
            }
            AbstractC2043a.m5035i(inputStreamByteStream, null);
            MediaType mediaTypeContentType = responseBody.contentType();
            if (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(StandardCharsets.UTF_8)) == null) {
                charset = StandardCharsets.UTF_8;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            charset.getClass();
            return new C1118e2(new String(byteArray, charset), z9);
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m2889o(String str, C1103b c1103b) {
        String strM5165l;
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        HttpUrl httpUrlM2892r = m2892r(str);
        if (httpUrlM2892r == null) {
            return m2875a("URL 无效: ".concat(str));
        }
        String strHost = httpUrlM2892r.host();
        Locale locale = Locale.US;
        String strM5165l2 = AbstractC2091b.m5165l(locale, strHost, locale);
        if (strM5165l2.equals("github.com") || strM5165l2.equals("www.github.com")) {
            List<String> listPathSegments = httpUrlM2892r.pathSegments();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listPathSegments) {
                if (!AbstractC3149m.m6721t0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() >= 2) {
                String str2 = (String) arrayList.get(0);
                String strM6687B0 = AbstractC3149m.m6687B0((String) arrayList.get(1), ".git");
                C1114d2 c1114d2 = new C1114d2(str2, strM6687B0);
                String str3 = (String) AbstractC4166m.m8425w1(2, arrayList);
                if (str3 != null) {
                    Locale locale2 = Locale.US;
                    strM5165l = AbstractC2091b.m5165l(locale2, str3, locale2);
                } else {
                    strM5165l = null;
                }
                if (AbstractC1416l.m3825a(strM5165l, "blob")) {
                    String str4 = (String) AbstractC4166m.m8425w1(3, arrayList);
                    if (str4 == null) {
                        str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    List listM8419q1 = AbstractC4166m.m8419q1(4, arrayList);
                    if (!AbstractC3149m.m6721t0(str4) && !listM8419q1.isEmpty()) {
                        String string = httpUrlM2892r.toString();
                        HttpUrl.Builder builderNewBuilder = m2879e("repos", str2, strM6687B0, "contents").newBuilder();
                        Iterator it = listM8419q1.iterator();
                        while (it.hasNext()) {
                            builderNewBuilder.addPathSegment((String) it.next());
                        }
                        String string2 = builderNewBuilder.addQueryParameter("ref", str4).build().toString();
                        C1110c2 c1110c2M2877c = m2877c(m2880f(c1114d2, str4, listM8419q1), c1103b, null, 524288, 20);
                        String str5 = c1110c2M2877c.f3613d;
                        String str6 = c1110c2M2877c.f3615f;
                        if (str6 == null && !AbstractC3149m.m6721t0(str5)) {
                            return m2878d(c1114d2, str4, listM8419q1, string, str5, c1110c2M2877c.f3614e);
                        }
                        Map mapSingletonMap = Collections.singletonMap("Accept", "application/vnd.github.raw");
                        mapSingletonMap.getClass();
                        C1110c2 c1110c2M2877c2 = m2877c(string2, c1103b, mapSingletonMap, 524288, 16);
                        String str7 = c1110c2M2877c2.f3615f;
                        if (str7 != null) {
                            if (str6 == null) {
                                str6 = "raw 文件为空";
                            }
                            return m2875a("读取 GitHub 文件失败: " + str6 + "；" + str7);
                        }
                        String str8 = c1110c2M2877c2.f3613d;
                        try {
                            c3959f2 = new JSONObject(str8);
                        } catch (Throwable th2) {
                            c3959f2 = new C3959f(th2);
                        }
                        if (c3959f2 instanceof C3959f) {
                            c3959f2 = null;
                        }
                        JSONObject jSONObject = (JSONObject) c3959f2;
                        String str9 = str8;
                        if (jSONObject != null) {
                            String strOptString = jSONObject.optString("content", HttpUrl.FRAGMENT_ENCODE_SET);
                            strOptString.getClass();
                            Pattern patternCompile = Pattern.compile("\\s+");
                            patternCompile.getClass();
                            String strReplaceAll = patternCompile.matcher(strOptString).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
                            strReplaceAll.getClass();
                            str9 = str8;
                            if (!AbstractC3149m.m6721t0(strReplaceAll)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strReplaceAll, 0);
                                    bArrDecode.getClass();
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    c3959f3 = new String(bArrDecode, charset);
                                } catch (Throwable th3) {
                                    c3959f3 = new C3959f(th3);
                                }
                                Object obj2 = str8;
                                if (!(c3959f3 instanceof C3959f)) {
                                    obj2 = c3959f3;
                                }
                                str9 = (String) obj2;
                            }
                        }
                        return m2878d(c1114d2, str4, listM8419q1, string, str9, c1110c2M2877c2.f3614e);
                    }
                } else if (AbstractC1416l.m3825a(strM5165l, "tree")) {
                    String str10 = (String) AbstractC4166m.m8425w1(3, arrayList);
                    if (str10 == null) {
                        str10 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6721t0(str10)) {
                        List listM8419q12 = AbstractC4166m.m8419q1(4, arrayList);
                        String string3 = httpUrlM2892r.toString();
                        HttpUrl.Builder builderNewBuilder2 = m2879e("repos", str2, strM6687B0, "contents").newBuilder();
                        Iterator it2 = listM8419q12.iterator();
                        while (it2.hasNext()) {
                            builderNewBuilder2.addPathSegment((String) it2.next());
                        }
                        String string4 = builderNewBuilder2.addQueryParameter("ref", str10).build().toString();
                        Map mapSingletonMap2 = Collections.singletonMap("Accept", "application/vnd.github+json");
                        mapSingletonMap2.getClass();
                        C1110c2 c1110c2M2877c3 = m2877c(string4, c1103b, mapSingletonMap2, Opcodes.ASM6, 16);
                        String str11 = c1110c2M2877c3.f3615f;
                        if (str11 != null) {
                            String strM2886l = m2886l(string3, c1103b);
                            return m2882h(strM2886l) ? m2875a("读取 GitHub 目录失败: ".concat(str11)) : AbstractC4855en.m9264h(strM2886l, "\n\nGitHub 目录 API: ", str11);
                        }
                        try {
                            c3959f = new JSONArray(c1110c2M2877c3.f3613d);
                        } catch (Throwable th4) {
                            c3959f = new C3959f(th4);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = null;
                        }
                        JSONArray jSONArray = (JSONArray) c3959f;
                        if (jSONArray == null) {
                            return m2875a("GitHub 目录返回的 JSON 无法解析");
                        }
                        StringBuilder sb2 = new StringBuilder("[GitHub 目录]\n");
                        String strM8392A1 = AbstractC4166m.m8392A1(listM8419q12, "/", null, null, null, 62);
                        StringBuilder sbM1027p = AbstractC0255e.m1027p("路径: ", c1114d2.f3652a, "/", strM6687B0, "/");
                        sbM1027p.append(strM8392A1);
                        sb2.append(sbM1027p.toString());
                        sb2.append('\n');
                        sb2.append("分支: ".concat(str10));
                        sb2.append('\n');
                        sb2.append("来源: " + string3);
                        sb2.append('\n');
                        int iMin = Math.min(jSONArray.length(), 800);
                        for (int i9 = 0; i9 < iMin; i9++) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                            if (jSONObjectOptJSONObject != null) {
                                sb2.append(jSONObjectOptJSONObject.optString("type", "file"));
                                sb2.append(" ");
                                sb2.append(jSONObjectOptJSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET));
                                sb2.append('\n');
                            }
                        }
                        return sb2.toString();
                    }
                } else if (strM5165l == null) {
                    return m2887m(c1114d2, httpUrlM2892r.toString(), c1103b);
                }
            }
        }
        return strM5165l2.equals("raw.githubusercontent.com") ? m2886l(httpUrlM2892r.toString(), c1103b) : m2886l(httpUrlM2892r.toString(), c1103b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2890p(String str, C1103b c1103b) {
        String strM9263g;
        C1114d2 c1114d2;
        Object c3959f;
        str.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(1000, AbstractC3149m.m6703R0(str).toString());
        if (AbstractC3149m.m6721t0(strM6701P0)) {
            return m2875a("模型没有提供搜索关键词");
        }
        c1103b.m2828d();
        String strM2876b = m2876b(strM6701P0);
        if (strM2876b != null) {
            return m2889o(strM2876b, c1103b);
        }
        Pattern patternCompile = Pattern.compile("(?i)(?:www\\.)?github\\.com/[^\\s<>\"']+");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(strM6701P0);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, strM6701P0);
        if (c3145iM238b != null) {
            strM9263g = AbstractC4855en.m9263g("https://", AbstractC3149m.m6706U0(c3145iM238b.m6678c(), '.', ',', ';', ':', 65292, 12290, 65307, 65306, ')', 65289, ']', 12305));
            if (m2892r(strM9263g) == null) {
                strM9263g = null;
            }
        }
        if (strM9263g != null) {
            return m2889o(strM9263g, c1103b);
        }
        Pattern patternCompile2 = Pattern.compile("(?i)(?:github\\.com/)([^/\\s?#]+)/([^/\\s?#]+)");
        patternCompile2.getClass();
        Matcher matcher2 = patternCompile2.matcher(strM6701P0);
        matcher2.getClass();
        C3145i c3145iM238b2 = AbstractC0018a.m238b(matcher2, 0, strM6701P0);
        if (c3145iM238b2 == null) {
            Pattern patternCompile3 = Pattern.compile("^\\s*([A-Za-z0-9_.-]{1,64})/([A-Za-z0-9_.-]{1,100})\\s*$");
            patternCompile3.getClass();
            Matcher matcher3 = patternCompile3.matcher(strM6701P0);
            matcher3.getClass();
            c3145iM238b2 = !matcher3.matches() ? null : new C3145i(matcher3, strM6701P0);
            if (c3145iM238b2 == null) {
                if (AbstractC3149m.m6709h0(strM6701P0, "github", true)) {
                    Pattern patternCompile4 = Pattern.compile("(?<![A-Za-z0-9_.-])([A-Za-z0-9_.-]{1,64})/([A-Za-z0-9_.-]{1,100})(?![A-Za-z0-9_.-])");
                    patternCompile4.getClass();
                    Matcher matcher4 = patternCompile4.matcher(strM6701P0);
                    matcher4.getClass();
                    c3145iM238b2 = AbstractC0018a.m238b(matcher4, 0, strM6701P0);
                } else {
                    c3145iM238b2 = null;
                }
            }
        }
        if (c3145iM238b2 == null) {
            c1114d2 = null;
        } else {
            String string = AbstractC3149m.m6703R0((String) ((C3143g) c3145iM238b2.m6676a()).get(1)).toString();
            String strM6687B0 = AbstractC3149m.m6687B0(AbstractC3149m.m6706U0(AbstractC3149m.m6703R0((String) ((C3143g) c3145iM238b2.m6676a()).get(2)).toString(), '.', ',', 65292, 12290), ".git");
            if (!AbstractC3149m.m6721t0(string) && !AbstractC3149m.m6721t0(strM6687B0) && !string.equalsIgnoreCase("v1")) {
                c1114d2 = new C1114d2(string, strM6687B0);
            }
        }
        if (c1114d2 != null) {
            return m2887m(c1114d2, AbstractC0255e.m1021j("https://github.com/", c1114d2.f3652a, "/", c1114d2.f3653b), c1103b);
        }
        if (!AbstractC3149m.m6709h0(strM6701P0, "github", true)) {
            return m2891q(strM6701P0, c1103b);
        }
        String strM5161h = AbstractC2091b.m5161h("(?i)github(?:\\.com)?", strM6701P0, " ");
        Pattern patternCompile5 = Pattern.compile("\\s+");
        patternCompile5.getClass();
        String strReplaceAll = patternCompile5.matcher(strM5161h).replaceAll(" ");
        strReplaceAll.getClass();
        String string2 = AbstractC3149m.m6703R0(strReplaceAll).toString();
        if (!AbstractC3149m.m6721t0(string2)) {
            strM6701P0 = string2;
        }
        String string3 = m2879e("search", "repositories").newBuilder().addQueryParameter("q", strM6701P0).addQueryParameter("per_page", "8").build().toString();
        Map mapSingletonMap = Collections.singletonMap("Accept", "application/vnd.github+json");
        mapSingletonMap.getClass();
        C1110c2 c1110c2M2877c = m2877c(string3, c1103b, mapSingletonMap, Opcodes.ASM4, 16);
        String str2 = c1110c2M2877c.f3615f;
        if (str2 != null) {
            String strM2891q = m2891q("site:github.com ".concat(strM6701P0), c1103b);
            if (m2882h(strM2891q)) {
                return m2875a("GitHub 仓库搜索失败: ".concat(str2));
            }
            return "[GitHub 仓库搜索]\n" + "GitHub API: ".concat(str2) + '\n' + strM2891q;
        }
        try {
            c3959f = new JSONObject(c1110c2M2877c.f3613d);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        JSONObject jSONObject = (JSONObject) c3959f;
        if (jSONObject == null) {
            return m2875a("GitHub 搜索返回的 JSON 无法解析");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return m2875a("GitHub 没有找到匹配的公开仓库");
        }
        StringBuilder sb2 = new StringBuilder("[GitHub 仓库搜索]\n");
        sb2.append("查询: ".concat(strM6701P0));
        sb2.append('\n');
        int iMin = Math.min(jSONArrayOptJSONArray.length(), 8);
        for (int i9 = 0; i9 < iMin; i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject != null) {
                sb2.append('\n');
                sb2.append((i9 + 1) + ". " + jSONObjectOptJSONObject.optString("full_name", "未命名仓库"));
                sb2.append('\n');
                sb2.append("地址: " + jSONObjectOptJSONObject.optString("html_url", HttpUrl.FRAGMENT_ENCODE_SET));
                sb2.append('\n');
                String strM1023l = AbstractC0255e.m1023l("description", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject);
                if (AbstractC3149m.m6721t0(strM1023l)) {
                    strM1023l = null;
                }
                if (strM1023l != null) {
                    sb2.append("简介: ".concat(AbstractC3149m.m6701P0(700, strM1023l)));
                    sb2.append('\n');
                }
                sb2.append("语言: " + jSONObjectOptJSONObject.optString("language", "未知") + "，Stars: " + jSONObjectOptJSONObject.optInt("stargazers_count", 0));
                sb2.append('\n');
            }
        }
        sb2.append('\n');
        sb2.append("来源: " + string3);
        sb2.append('\n');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m2891q(String str, C1103b c1103b) {
        HttpUrl.Builder builderNewBuilder;
        HttpUrl.Builder builderAddQueryParameter;
        HttpUrl.Builder builderAddQueryParameter2;
        HttpUrl httpUrlBuild;
        String string;
        Object next;
        HttpUrl httpUrlM2892r = m2892r("https://html.duckduckgo.com/html/");
        if (httpUrlM2892r == null || (builderNewBuilder = httpUrlM2892r.newBuilder()) == null || (builderAddQueryParameter = builderNewBuilder.addQueryParameter("q", str)) == null || (builderAddQueryParameter2 = builderAddQueryParameter.addQueryParameter("kl", "wt-wt")) == null || (httpUrlBuild = builderAddQueryParameter2.build()) == null || (string = httpUrlBuild.toString()) == null) {
            return m2875a("无法生成网页搜索地址");
        }
        Map mapSingletonMap = Collections.singletonMap("Accept", "text/html,application/xhtml+xml");
        mapSingletonMap.getClass();
        C1110c2 c1110c2M2877c = m2877c(string, c1103b, mapSingletonMap, Opcodes.ASM6, 16);
        String str2 = c1110c2M2877c.f3615f;
        if (str2 != null) {
            return m2875a("网页搜索失败: ".concat(str2));
        }
        int i9 = 0;
        Spanned spannedFromHtml = Html.fromHtml(c1110c2M2877c.f3613d, 0);
        spannedFromHtml.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        spans.getClass();
        Iterator it = AbstractC4165l.m8371H0(spans, new C0415a0(spannedFromHtml, 15)).iterator();
        while (true) {
            String string2 = null;
            if (!it.hasNext()) {
                break;
            }
            URLSpan uRLSpan = (URLSpan) it.next();
            String url = uRLSpan.getURL();
            url.getClass();
            if (AbstractC3156t.m6740d0(url, "//", false)) {
                url = "https:".concat(url);
            }
            HttpUrl httpUrlM2892r2 = m2892r(url);
            if (httpUrlM2892r2 != null) {
                if (AbstractC3156t.m6733W(httpUrlM2892r2.host(), "duckduckgo.com", true)) {
                    String strQueryParameter = httpUrlM2892r2.queryParameter("uddg");
                    if (strQueryParameter != null && m2892r(strQueryParameter) != null) {
                        string2 = strQueryParameter;
                    }
                } else {
                    string2 = httpUrlM2892r2.toString();
                }
            }
            if (string2 != null) {
                int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
                if (spanStart < 0) {
                    spanStart = 0;
                }
                int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
                int length = spannedFromHtml.length();
                if (spanEnd > length) {
                    spanEnd = length;
                }
                String strM2884j = m2884j(spannedFromHtml.subSequence(spanStart, spanEnd).toString());
                if (!AbstractC3149m.m6721t0(strM2884j)) {
                    Object arrayList = linkedHashMap.get(string2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(string2, arrayList);
                    }
                    List list = (List) arrayList;
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC3156t.m6734X((String) it2.next(), strM2884j)) {
                                break;
                            }
                        }
                    }
                    list.add(strM2884j);
                }
            }
        }
        Set setEntrySet = linkedHashMap.entrySet();
        setEntrySet.getClass();
        Set<Map.Entry> set = setEntrySet;
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(set));
        for (Map.Entry entry : set) {
            entry.getClass();
            Object key = entry.getKey();
            key.getClass();
            String str3 = (String) key;
            Object value = entry.getValue();
            value.getClass();
            List list2 = (List) value;
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (!AbstractC3156t.m6740d0((String) next, "http", true)) {
                    break;
                }
            }
            String str4 = (String) next;
            if (str4 == null) {
                str4 = (String) AbstractC4166m.m8422t1(list2);
            }
            List listM8419q1 = AbstractC4166m.m8419q1(1, list2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listM8419q1) {
                if (!AbstractC1416l.m3825a((String) obj, str3)) {
                    arrayList3.add(obj);
                }
            }
            arrayList2.add(new C1126g2(str4, str3, AbstractC4166m.m8392A1(arrayList3, " ", null, null, null, 62)));
        }
        if (arrayList2.isEmpty()) {
            return m2875a("网页搜索没有找到可读取的结果");
        }
        StringBuilder sb2 = new StringBuilder("[网页搜索结果]\n");
        sb2.append("查询: " + str);
        sb2.append('\n');
        for (Object obj2 : AbstractC4166m.m8403L1(8, arrayList2)) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C1126g2 c1126g2 = (C1126g2) obj2;
            sb2.append('\n');
            sb2.append(i10 + ". " + c1126g2.f3685a);
            sb2.append('\n');
            sb2.append("来源: ".concat(c1126g2.f3686b));
            sb2.append('\n');
            String str5 = c1126g2.f3687c;
            if (AbstractC3149m.m6721t0(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                sb2.append("摘要: ".concat(AbstractC3149m.m6701P0(900, str5)));
                sb2.append('\n');
            }
            i9 = i10;
        }
        sb2.append('\n');
        sb2.append("搜索来源: ".concat(string));
        sb2.append('\n');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static HttpUrl m2892r(String str) {
        Object c3959f;
        try {
            c3959f = HttpUrl.Companion.parse(str);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        HttpUrl httpUrl = (HttpUrl) c3959f;
        if (httpUrl == null) {
            return null;
        }
        if (AbstractC1416l.m3825a(httpUrl.scheme(), "http") || AbstractC1416l.m3825a(httpUrl.scheme(), "https")) {
            return httpUrl;
        }
        return null;
    }
}
