package p167l8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p119i2.C1955z;
import p136j8.AbstractC2091b;
import p162l3.C2469w;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.C3147k;
import p218og.EnumC3148l;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: l8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2529d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m5935a(C2529d c2529d, String str) {
        c2529d.getClass();
        String strM5946l = m5946l(AbstractC3149m.m6703R0(str).toString());
        if (!AbstractC3149m.m6721t0(strM5946l)) {
            strM5946l = new C3147k("&#(x[0-9a-fA-F]+|[0-9]+);").m6684e(strM5946l, new C1955z(20));
        }
        return AbstractC3149m.m6703R0(strM5946l).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final String m5936b(C2529d c2529d, String... strArr) {
        String str;
        c2529d.getClass();
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str = null;
                break;
            }
            str = strArr[i9];
            if (str != null && !AbstractC3149m.m6721t0(str)) {
                WeChatMessage.Companion.getClass();
                if (!m5941g(str)) {
                    break;
                }
            }
            i9++;
        }
        return str != null ? str : m5939e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[EDGE_INSN: B:114:0x00ac->B:46:0x00ac BREAK  A[LOOP:1: B:22:0x0045->B:118:?]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC2528c m5937c(String str, String str2, String str3) {
        String string;
        Integer numM6742f0;
        boolean z9;
        int iM6718q0;
        int i9;
        int iM6718q02;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM5946l = m5946l(str);
        List<String> listM5944j = m5944j(strM5946l);
        if (listM5944j.isEmpty()) {
            boolean z10 = true;
            if (!AbstractC3149m.m6709h0(strM5946l, "announcement@all", true)) {
                if (listM5944j.isEmpty()) {
                    z9 = !AbstractC3149m.m6709h0(strM5946l, "notify@all", true) || ((numM6742f0 = AbstractC3156t.m6742f0((string = AbstractC3149m.m6703R0(m5939e(m5949o(strM5946l, "atall"), m5943i(strM5946l, ".msgsource.atall"), m5943i(strM5946l, "atall"))).toString()))) != null && numM6742f0.intValue() > 0) || string.equalsIgnoreCase("true");
                } else {
                    for (String str4 : listM5944j) {
                        if (AbstractC3156t.m6734X(str4, "notify@all") || AbstractC3156t.m6734X(str4, "all") || AbstractC3156t.m6734X(str4, "@all")) {
                            break;
                        }
                    }
                    if (AbstractC3149m.m6709h0(strM5946l, "notify@all", true)) {
                    }
                }
                if (str3 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(str3) || listM5944j.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it = listM5944j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (AbstractC3156t.m6734X((String) it.next(), str3)) {
                            if (str2 == null) {
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            int iM6719r0 = AbstractC3149m.m6719r0(str2, ":\n", 0, false, 6);
                            if (iM6719r0 > 0) {
                                str2 = str2.substring(iM6719r0 + 2);
                            }
                            int i10 = 0;
                            loop3: while (i10 < str2.length() && (iM6718q0 = AbstractC3149m.m6718q0(str2, '@', i10, 4)) >= 0 && (iM6718q02 = AbstractC3149m.m6718q0(str2, (char) 8197, (i9 = iM6718q0 + 1), 4)) >= 0) {
                                if (iM6718q02 - iM6718q0 <= 40) {
                                    String strSubstring = str2.substring(i9, iM6718q02);
                                    String string2 = AbstractC3149m.m6703R0(AbstractC3149m.m6697L0(strSubstring, '@', strSubstring)).toString();
                                    Set set = WeChatMessage.AT_ALL_LABELS;
                                    if (!(set instanceof Collection) || !set.isEmpty()) {
                                        Iterator it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            if (AbstractC3156t.m6734X((String) it2.next(), string2)) {
                                                break loop3;
                                            }
                                        }
                                    }
                                }
                                i10 = iM6718q02 + 1;
                            }
                        }
                    }
                    z10 = false;
                }
                if (z9 || z10) {
                    return EnumC2528c.f8170i;
                }
                if (!AbstractC3149m.m6721t0(str3) && !listM5944j.isEmpty()) {
                    Iterator it3 = listM5944j.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC3156t.m6734X((String) it3.next(), str3)) {
                            return EnumC2528c.f8169h;
                        }
                    }
                }
                return listM5944j.isEmpty() ? EnumC2528c.f8168g : EnumC2528c.f8172k;
            }
        } else {
            Iterator it4 = listM5944j.iterator();
            while (it4.hasNext()) {
                if (AbstractC3156t.m6734X((String) it4.next(), "announcement@all")) {
                    break;
                }
            }
            boolean z102 = true;
            if (!AbstractC3149m.m6709h0(strM5946l, "announcement@all", true)) {
            }
        }
        return EnumC2528c.f8171j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m5938d(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int iM6719r0 = AbstractC3149m.m6719r0(str, ":\n", 0, false, 6);
        return (iM6719r0 <= 0 || AbstractC3149m.m6718q0(str, '<', 0, 6) <= iM6719r0) ? str : str.substring(iM6719r0 + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m5939e(String... strArr) {
        String str;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str = null;
                break;
            }
            str = strArr[i9];
            if (!(str == null || AbstractC3149m.m6721t0(str))) {
                break;
            }
            i9++;
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m5940f(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6709h0(str, ":\n<msg>", true) || AbstractC3149m.m6709h0(str, "<appmsg", true)) {
            return 49;
        }
        if (AbstractC3149m.m6709h0(str, "<img", true)) {
            return 3;
        }
        if (AbstractC3149m.m6709h0(str, "<voicemsg", true)) {
            return 34;
        }
        if (AbstractC3149m.m6709h0(str, "<videomsg", true)) {
            return 43;
        }
        if (AbstractC3149m.m6709h0(str, "<emoji", true)) {
            return 47;
        }
        if (AbstractC3149m.m6709h0(str, "<location", true)) {
            return 48;
        }
        return (AbstractC3149m.m6709h0(str, "revoke", true) || AbstractC3149m.m6709h0(str, "撤回", false)) ? 10002 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m5941g(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false) || AbstractC3156t.m6733W(str, "@openim", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m5942h(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Integer numM6742f0 = AbstractC3156t.m6742f0(m5949o(str, "type"));
        int iIntValue = numM6742f0 != null ? numM6742f0.intValue() : 0;
        return iIntValue == 51 || (iIntValue == 0 && (AbstractC3149m.m6709h0(str, "<finderFeed>", true) || AbstractC3149m.m6709h0(str, "<finderObject>", true) || AbstractC3149m.m6709h0(str, "<finderUsername>", true) || (AbstractC3149m.m6709h0(str, "<objectId>", true) && AbstractC3149m.m6709h0(str, "<objectNonceId>", true))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m5943i(String str, String str2) {
        str2.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM5946l = m5946l(str);
        if (!AbstractC3149m.m6721t0(strM5946l) && !AbstractC3149m.m6721t0(str2)) {
            String strQuote = Pattern.quote(str2);
            strQuote.getClass();
            C3147k[] c3147kArr = {new C3147k(strQuote.concat("\\s*=\\s*(['\"])(.*?)\\1"), 0), new C3147k(strQuote.concat("\\s*=\\s*<!\\[CDATA\\[(.*?)]]>"), 0), new C3147k(strQuote.concat("\\s*=\\s*([^,;\\s}]+)"), 0)};
            for (int i9 = 0; i9 < 3; i9++) {
                C3145i c3145iM6680b = C3147k.m6680b(c3147kArr[i9], strM5946l);
                if (c3145iM6680b != null) {
                    return AbstractC3149m.m6703R0((String) AbstractC4166m.m8393B1(c3145iM6680b.m6676a())).toString();
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static List m5944j(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM5939e = m5939e(m5949o(str, "atuserlist"), m5943i(str, ".msgsource.atuserlist"), m5943i(str, "atuserlist"));
        if (AbstractC3149m.m6721t0(strM5939e)) {
            return C4173t.f13710g;
        }
        List listM6691F0 = AbstractC3149m.m6691F0(strM5939e, new char[]{',', ';', '|', ' '}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static WeChatMessage m5945k(String str, String str2, String str3, long j3, boolean z9, int i9, long j4, String str4, String str5) {
        String strM9264h = HttpUrl.FRAGMENT_ENCODE_SET;
        String str6 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        String str7 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        if (str3 != null) {
            strM9264h = str3;
        }
        if (!z9 && m5941g(str6) && !AbstractC3149m.m6721t0(str7) && !AbstractC3156t.m6740d0(strM9264h, str7.concat(":\n"), false)) {
            strM9264h = AbstractC4855en.m9264h(str7, ":\n", strM9264h);
        }
        String str8 = strM9264h;
        return new WeChatMessage(0L, j4, i9 > 0 ? i9 : m5940f(str8), 0, z9 ? 1 : 0, j3, str6, str8, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m5946l(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&lt;", "<", false), "&gt;", ">", false), "&quot;", "\"", false), "&apos;", "'", false), "&amp;", "&", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m5947m(String str, String str2) {
        str2.getClass();
        if (str == null || AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Pattern patternCompile = Pattern.compile(AbstractC0921a.m2251n("\\b", str2, "\\s*=\\s*(['\"])(.*?)\\1"), C2469w.m5864f(2));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        String str3 = c3145iM238b != null ? (String) AbstractC4166m.m8425w1(2, c3145iM238b.m6676a()) : null;
        return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m5948n(String str, String str2) {
        String str3;
        str2.getClass();
        if (str == null || AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM1022k = AbstractC0255e.m1022k("<", str2, "\\b[^>]*>(.*?)</", str2, ">");
        Iterator it = AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL).iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((EnumC3148l) it.next()).f10210g;
        }
        Pattern patternCompile = Pattern.compile(strM1022k, C2469w.m5864f(i9));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        String string = (c3145iM238b == null || (str3 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a())) == null) ? null : AbstractC3149m.m6703R0(str3).toString();
        return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m5949o(String str, String str2) {
        String str3;
        str2.getClass();
        if (str == null || AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Pattern patternCompile = Pattern.compile(AbstractC0255e.m1022k("<", str2, "><!\\[CDATA\\[(.*?)]]></", str2, ">"), C2469w.m5864f(2));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        if (c3145iM238b != null) {
            return (String) ((C3143g) c3145iM238b.m6676a()).get(1);
        }
        String strM1022k = AbstractC0255e.m1022k("<", str2, ">(.*?)</", str2, ">");
        Iterator it = AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL).iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((EnumC3148l) it.next()).f10210g;
        }
        Pattern patternCompile2 = Pattern.compile(strM1022k, C2469w.m5864f(i9));
        patternCompile2.getClass();
        Matcher matcher2 = patternCompile2.matcher(str);
        matcher2.getClass();
        C3145i c3145iM238b2 = AbstractC0018a.m238b(matcher2, 0, str);
        String string = (c3145iM238b2 == null || (str3 = (String) AbstractC4166m.m8425w1(1, c3145iM238b2.m6676a())) == null) ? null : AbstractC3149m.m6703R0(str3).toString();
        return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }
}
