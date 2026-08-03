package p065eb;

import android.content.ContentValues;
import be.C0285i;
import ca.C0512c;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p054dg.C0795n;
import p077f8.C1087g;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptMessageBean;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p153k8.C2352p;
import p153k8.C2353q;
import p162l3.C2469w;
import p210o8.C3080d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: eb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0876k {

    /* JADX INFO: renamed from: a */
    public static final C0876k f2687a = new C0876k();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f2688b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2689c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final CopyOnWriteArrayList f2690d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public static volatile boolean f2691e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m2175a(int i9, String str, String str2) {
        return AbstractC3149m.m6703R0(str).toString() + "|" + AbstractC3149m.m6703R0(str2).toString() + "|" + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2176b(StringBuilder sb2, String str) {
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append('\n');
        }
        sb2.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m2177c(String str, String str2) {
        if (!AbstractC3149m.m6721t0(str)) {
            String strQuote = Pattern.quote(str2);
            strQuote.getClass();
            Pattern patternCompile = Pattern.compile("\\b" + strQuote + "\\s*=\\s*(['\"])(.*?)\\1", C2469w.m5864f(2));
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
            String str3 = c3145iM238b != null ? (String) AbstractC4166m.m8425w1(2, c3145iM238b.m6676a()) : null;
            if (str3 != null) {
                return str3;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2178d(String str) {
        return AbstractC3149m.m6704S0(AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3149m.m6703R0(str).toString(), "&lt;", "<", false), "&gt;", ">", false), "&quot;", "\"", false), "&apos;", "'", false), "&amp;", "&", false)).toString(), '\"', '\'', ' ', '\n', '\r', '\t');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2179e(long j3) {
        ConcurrentHashMap concurrentHashMap = f2688b;
        if (concurrentHashMap.size() >= 64) {
            concurrentHashMap.entrySet().removeIf(new C0285i(new C0512c(j3, 5), 11));
        }
        ConcurrentHashMap concurrentHashMap2 = f2689c;
        if (concurrentHashMap2.isEmpty()) {
            return;
        }
        concurrentHashMap2.entrySet().removeIf(new C0285i(new C0512c(j3, 6), 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m2180f(ContentValues contentValues, String str) {
        Object c3959f;
        boolean zContainsKey = contentValues.containsKey(str);
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!zContainsKey) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            c3959f = contentValues.getAsString(str);
            if (c3959f == null) {
                c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            Object obj = contentValues.get(str);
            String string = obj != null ? obj.toString() : null;
            if (string != null) {
                str2 = string;
            }
            c3959f = str2;
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m2181g(C0872i c0872i) {
        return m2182h(c0872i.f2677b, c0872i.f2676a) + "|" + c0872i.f2678c + "|" + c0872i.f2679d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m2182h(String... strArr) {
        String str;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str = null;
                break;
            }
            str = strArr[i9];
            if (!AbstractC3149m.m6721t0(str)) {
                break;
            }
            i9++;
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2183i(ScriptMessageBean scriptMessageBean) {
        Integer numM6742f0 = AbstractC3156t.m6742f0(scriptMessageBean.getMsgType());
        StringBuilder sb2 = new StringBuilder();
        String content = scriptMessageBean.getContent();
        String xml = scriptMessageBean.getXml();
        String msgSource = scriptMessageBean.getMsgSource();
        if (!AbstractC3149m.m6721t0(content)) {
            sb2.append(content);
        }
        if (!AbstractC3149m.m6721t0(xml) && !xml.equals(content)) {
            sb2.append('\n');
            sb2.append(xml);
        }
        if (!AbstractC3149m.m6721t0(msgSource)) {
            sb2.append('\n');
            sb2.append(msgSource);
        }
        C0872i c0872iM2186m = m2186m(sb2.toString(), numM6742f0, scriptMessageBean.getSender(), false, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        if (c0872iM2186m != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            m2179e(jCurrentTimeMillis);
            m2188o(c0872iM2186m, jCurrentTimeMillis);
            String strM2181g = m2181g(c0872iM2186m);
            ConcurrentHashMap concurrentHashMap = f2688b;
            Long l10 = (Long) concurrentHashMap.get(strM2181g);
            if (l10 == null || jCurrentTimeMillis - l10.longValue() >= 3000) {
                concurrentHashMap.put(strM2181g, Long.valueOf(jCurrentTimeMillis));
                Iterator it = f2690d.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC1231l) it.next()).invoke(c0872iM2186m);
                    } catch (Throwable unused) {
                    }
                }
                ScriptPluginRuntime.INSTANCE.dispatchOnNewFriend(c0872iM2186m.f2676a, c0872iM2186m.f2678c, c0872iM2186m.f2679d);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m2184k(String str) {
        if (!AbstractC3149m.m6721t0(str) && !str.equalsIgnoreCase("fmessage") && !AbstractC3156t.m6733W(str, "@chatroom", false) && !AbstractC3156t.m6733W(str, "@openim", false) && !AbstractC3156t.m6733W(str, "@im.chatroom", false) && !AbstractC3156t.m6740d0(str, "gh_", false)) {
            for (int i9 = 0; i9 < str.length(); i9++) {
                if (Character.isLetterOrDigit(str.charAt(i9))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m2185l(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        return AbstractC3156t.m6733W(string, "@stranger", true) || AbstractC3156t.m6740d0(string, "v1_", true) || AbstractC3156t.m6740d0(string, "v2_", true) || AbstractC3156t.m6740d0(string, "v3_", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0872i m2186m(String str, Integer num, String str2, boolean z9, String str3, String str4, String str5) {
        if (!AbstractC3149m.m6721t0(str) || !AbstractC3149m.m6721t0(str3) || !AbstractC3149m.m6721t0(str4)) {
            if (z9) {
                String strM2190q = m2190q(str, "encryptusername");
                String strM2190q2 = m2190q(str, "encryptuser");
                String strM2177c = m2177c(str, "encryptusername");
                String strM2187n = m2187n(str, "encryptusername");
                String str6 = m2185l(m2178d(str3)) ? str3 : null;
                String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                String str8 = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
                String str9 = m2185l(m2178d(str2)) ? str2 : null;
                String strM2178d = m2178d(m2182h(strM2190q, strM2190q2, strM2177c, strM2187n, str8, str9 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str9));
                if (!m2184k(strM2178d)) {
                    strM2178d = null;
                }
                if (strM2178d == null) {
                    strM2178d = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM2190q3 = m2190q(str, "fromusername");
                String strM2190q4 = m2190q(str, "username");
                String strM2177c2 = m2177c(str, "fromusername");
                String strM2187n2 = m2187n(str, "fromusername");
                String str10 = !m2185l(m2178d(str3)) ? str3 : null;
                String str11 = str10 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str10;
                String str12 = !m2185l(m2178d(str2)) ? str2 : null;
                String strM2178d2 = m2178d(m2182h(strM2190q3, strM2190q4, strM2177c2, strM2187n2, str11, str12 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str12));
                if (!m2184k(strM2178d2)) {
                    strM2178d2 = null;
                }
                if (strM2178d2 != null) {
                    str7 = strM2178d2;
                }
                String strM2182h = m2182h(str7, strM2178d);
                String strM2182h2 = m2182h(strM2178d, strM2182h);
                String strM2178d3 = m2178d(m2182h(m2190q(str, "ticket"), m2190q(str, "antispamticket"), m2190q(str, "antispam_ticket"), m2190q(str, "verifyticket"), m2190q(str, "verify_ticket"), m2177c(str, "ticket"), m2177c(str, "antispamticket"), m2187n(str, "ticket"), m2187n(str, "antispamticket"), str4));
                if (!AbstractC3149m.m6721t0(strM2182h) && !AbstractC3149m.m6721t0(strM2178d3)) {
                    Integer numM6742f0 = AbstractC3156t.m6742f0(m2178d(m2182h(m2190q(str, "scene"), m2190q(str, "scence"), m2190q(str, "sceneid"), m2190q(str, "scene_id"), m2177c(str, "scene"), m2187n(str, "scene"), m2187n(str, "sceneid"), m2187n(str, "scene_id"), str5)));
                    return new C0872i(numM6742f0 != null ? numM6742f0.intValue() : 0, strM2182h, strM2182h2, strM2178d3);
                }
            } else {
                int iIntValue = num != null ? num.intValue() : 0;
                if (iIntValue > 0) {
                    int i9 = iIntValue & 255;
                    int i10 = 65535 & iIntValue;
                    if ((iIntValue >>> 16) != 0) {
                        if (i10 == 10000 || i10 == 10002) {
                            iIntValue = i10;
                        } else if (i9 != 0 && i10 == i9) {
                            iIntValue = i9;
                        }
                    }
                }
                if (iIntValue == 37) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m2187n(String str, String str2) {
        String str3;
        String str4;
        Object c3959f;
        if (AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strQuote = Pattern.quote(str2);
        strQuote.getClass();
        Pattern patternCompile = Pattern.compile("(?:[?&]|&amp;)" + strQuote + "=([^&\\s<\"']+)", C2469w.m5864f(2));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        if (c3145iM238b == null || (str4 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a())) == null) {
            str3 = null;
        } else {
            try {
                c3959f = URLDecoder.decode(str4, "UTF-8");
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object obj = str4;
            if (!(c3959f instanceof C3959f)) {
                obj = c3959f;
            }
            str3 = (String) obj;
        }
        return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m2188o(C0872i c0872i, long j3) {
        String str = c0872i.f2676a;
        String str2 = c0872i.f2677b;
        if (AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2) || str.equals(str2)) {
            return;
        }
        C0874j c0874j = new C0874j(str, str2, c0872i.f2678c, c0872i.f2679d, j3);
        f2689c.put(m2175a(c0872i.f2679d, str, c0872i.f2678c), c0874j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m2189p(int i9, String str, String str2) {
        Object next;
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!AbstractC3149m.m6721t0(string) && !m2185l(string)) {
            m2179e(System.currentTimeMillis());
            String strM2175a = m2175a(i9, string, str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2);
            ConcurrentHashMap concurrentHashMap = f2689c;
            C0874j c0874j = (C0874j) concurrentHashMap.get(strM2175a);
            if (c0874j != null) {
                String str3 = c0874j.f2681b;
                if (!AbstractC3149m.m6721t0(str3)) {
                    return str3;
                }
            }
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Collection collectionValues = concurrentHashMap.values();
            collectionValues.getClass();
            C3010h c3010h = new C3010h(new C3011i(new C0795n(collectionValues, 6), true, new C0868g(0, string, str2)));
            if (c3010h.hasNext()) {
                next = c3010h.next();
                if (c3010h.hasNext()) {
                    Long lValueOf = Long.valueOf(((C0874j) next).f2684e);
                    do {
                        Object next2 = c3010h.next();
                        Long lValueOf2 = Long.valueOf(((C0874j) next2).f2684e);
                        if (lValueOf.compareTo(lValueOf2) < 0) {
                            next = next2;
                            lValueOf = lValueOf2;
                        }
                    } while (c3010h.hasNext());
                }
            } else {
                next = null;
            }
            C0874j c0874j2 = (C0874j) next;
            if (c0874j2 != null) {
                String str4 = c0874j2.f2681b;
                String str5 = AbstractC3149m.m6721t0(str4) ? null : str4;
                if (str5 != null) {
                    return str5;
                }
            }
        }
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m2190q(String str, String str2) {
        String strM5643c = C2353q.m5643c(str, str2);
        return strM5643c == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM5643c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final synchronized void m2191j(C3742g c3742g) {
        Object c3959f;
        Object c3959f2;
        try {
            c3742g.getClass();
            if (f2691e) {
                return;
            }
            try {
                WeChatApis.runtime().getClass();
                c3959f = WeChatApis.databaseListenerApi;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object obj = null;
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            C3080d c3080d = (C3080d) c3959f;
            if (c3080d != null && c3080d.m6548f()) {
                try {
                    c3080d.m6547e();
                } catch (Throwable unused) {
                }
                c3080d.m6549g(new C0870h());
            }
            try {
                c3959f2 = WeChatApis.messageObserve();
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            if (!(c3959f2 instanceof C3959f)) {
                obj = c3959f2;
            }
            C2352p c2352p = (C2352p) obj;
            if (c2352p == null || !c2352p.m5638c()) {
                c3742g.f12148f.m2716c(C1087g.class, new C0086a(24));
            } else {
                try {
                    c2352p.m5637b();
                } catch (Throwable unused2) {
                }
                c2352p.m5640e(new C0855b(1));
            }
            f2691e = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
