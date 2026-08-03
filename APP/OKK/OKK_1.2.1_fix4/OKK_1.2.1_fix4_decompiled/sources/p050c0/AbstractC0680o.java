package p050c0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0419d;
import p042W0.EnumC0423h;
import p089x0.C1121e;

/* JADX INFO: renamed from: c0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0680o {

    /* JADX INFO: renamed from: a */
    public static final List f2137a = AbstractC0182m.m556h0("撤回了一条消息", "撤回一条消息", "消息已撤回");

    /* JADX INFO: renamed from: b */
    public static final List f2138b = AbstractC0182m.m556h0("你撤回了一条消息", "你撤回一条消息");

    /* JADX WARN: Removed duplicated region for block: B:83:0x0144 A[EDGE_INSN: B:157:0x0144->B:83:0x0144 BREAK  A[LOOP:0: B:76:0x012b->B:158:?]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0149  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0358S m1738a(C0700u1 c0700u1, C0652e1 c0652e1, boolean z2, String str, boolean z3, String str2) {
        String str3;
        String string;
        String strM1750m;
        int i2;
        String str4;
        AbstractC0307g.m703e(str, "noticeTemplate");
        boolean zEquals = "message".equals("message");
        C0694s1 c0694s1 = C0694s1.f2193z;
        if (!zEquals || c0700u1.f2204b != 10000) {
            return c0694s1;
        }
        String str5 = c0700u1.f2205c;
        if (!m1749l(str5)) {
            return c0694s1;
        }
        boolean zM1746i = m1746i(str5);
        if (zM1746i && !z2) {
            return c0694s1;
        }
        Pattern patternCompile = Pattern.compile("<replacemsg>\\s*<!\\[CDATA\\[(.*?)]]>\\s*</replacemsg>", C1121e.m2635b(32));
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str5);
        AbstractC0307g.m702d(matcher, "matcher(...)");
        C0419d c0419dM875a = AbstractC0358S.m875a(matcher, 0, str5);
        String str6 = null;
        String string2 = (c0419dM875a == null || (str4 = (String) AbstractC0181l.m545q0(c0419dM875a.m1002a(), 1)) == null) ? null : AbstractC0425j.m1022a1(str4).toString();
        if (string2 == null || AbstractC0425j.m1013R0(string2)) {
            Pattern patternCompile2 = Pattern.compile("<replacemsg>(.*?)</replacemsg>", C1121e.m2635b(32));
            AbstractC0307g.m702d(patternCompile2, "compile(...)");
            Matcher matcher2 = patternCompile2.matcher(str5);
            AbstractC0307g.m702d(matcher2, "matcher(...)");
            C0419d c0419dM875a2 = AbstractC0358S.m875a(matcher2, 0, str5);
            string2 = (c0419dM875a2 == null || (str3 = (String) AbstractC0181l.m545q0(c0419dM875a2.m1002a(), 1)) == null || (string = AbstractC0425j.m1022a1(str3).toString()) == null || !(AbstractC0425j.m1013R0(string) ^ true)) ? null : string;
        }
        if (string2 == null) {
            string2 = str5;
        }
        String strM1021Z0 = "";
        if (!z3) {
            return new C0697t1("");
        }
        if (AbstractC0425j.m1013R0(str)) {
            str = "{name}撤回了一条消息";
        }
        String string3 = AbstractC0425j.m1022a1(str).toString();
        if (string3.length() == 0 || string3.equals("{name}撤回了一条消息") || string3.equals("{name}撤回了上一条消息 {content}") || string3.equals("{name}撤回了上一条消息")) {
            if (zM1746i) {
                strM1750m = m1750m("你撤回了一条消息");
            } else {
                String string4 = AbstractC0425j.m1022a1(string2).toString();
                if (string4.length() != 0 && !AbstractC0433r.m1033H0(string4, "<", false) && !m1747j(string4) && !m1748k(string4) && !AbstractC0433r.m1033H0(string4, "wxid_", true)) {
                    List list = f2137a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC0425j.m1005J0(string4, (String) it.next(), false)) {
                                break;
                            }
                        }
                        strM1750m = !AbstractC0425j.m1005J0(string4, "recalled a message", true) ? m1750m(string2) : m1743f("{name}撤回了一条消息", m1751n(string2, str5, str2, zM1746i), "");
                    } else if (!AbstractC0425j.m1005J0(string4, "recalled a message", true)) {
                    }
                }
            }
            return new C0697t1(strM1750m);
        }
        String strM1751n = m1751n(string2, str5, str2, zM1746i);
        if (c0652e1 != null) {
            String str7 = c0652e1.f2025b;
            if (!m1747j(str7) && !m1748k(str7) && ((i2 = c0652e1.f2024a) == 1 || i2 == 11)) {
                String string5 = AbstractC0425j.m1022a1(str7).toString();
                if (string5.length() != 0 && !AbstractC0433r.m1033H0(string5, "<", false) && !m1747j(string5) && !m1748k(string5) && (!m1749l(string5) || string5.length() >= 48)) {
                    String strM1740c = m1740c(string5);
                    if (strM1740c != null) {
                        string5 = AbstractC0425j.m1022a1(AbstractC0425j.m1016U0(AbstractC0425j.m1016U0(string5, strM1740c.concat(":\n")), strM1740c.concat(":"))).toString();
                    }
                    if (!m1747j(string5) && !AbstractC0433r.m1033H0(string5, "<", false)) {
                        strM1021Z0 = AbstractC0425j.m1021Z0(string5, 80);
                    }
                }
            }
        } else if (!m1747j(string2) && !m1748k(string2)) {
            String string6 = AbstractC0425j.m1022a1(string2).toString();
            String strM1021Z02 = (AbstractC0425j.m1013R0(string6) || AbstractC0433r.m1033H0(string6, "<", false) || m1747j(string6) || (m1749l(string6) && string6.length() < 40) || AbstractC0425j.m1005J0(string6, "recalled a message", true)) ? null : AbstractC0425j.m1021Z0(string6, 80);
            if (strM1021Z02 != null && !m1747j(strM1021Z02) && !m1749l(strM1021Z02)) {
                str6 = strM1021Z02;
            }
            if (str6 != null) {
                strM1021Z0 = str6;
            }
        }
        return new C0697t1(m1743f(str, strM1751n, strM1021Z0));
    }

    /* JADX INFO: renamed from: b */
    public static String m1739b(String str) {
        if (str != null && !AbstractC0425j.m1013R0(str)) {
            String string = AbstractC0425j.m1022a1(str).toString();
            char[] cArr = {'\"', 8220, 8221, '\'', 12300, 12301};
            AbstractC0307g.m703e(string, "<this>");
            int length = string.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean zM532i0 = AbstractC0179j.m532i0(cArr, string.charAt(!z2 ? i2 : length));
                if (z2) {
                    if (!zM532i0) {
                        break;
                    }
                    length--;
                } else if (zM532i0) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            String string2 = string.subSequence(i2, length + 1).toString();
            if (AbstractC0425j.m1005J0(string2, " : ", false)) {
                AbstractC0307g.m703e(string2, "<this>");
                AbstractC0307g.m703e(string2, "missingDelimiterValue");
                int iM1011P0 = AbstractC0425j.m1011P0(string2, " : ", 0, false, 6);
                if (iM1011P0 != -1) {
                    string2 = string2.substring(0, iM1011P0);
                    AbstractC0307g.m702d(string2, "substring(...)");
                }
                string2 = AbstractC0425j.m1022a1(string2).toString();
            }
            if (string2.length() == 0 || string2.equals("对方")) {
                return null;
            }
            if (string2.equals("你")) {
                return "你";
            }
            if (!m1747j(string2) && !m1748k(string2) && !AbstractC0433r.m1033H0(string2, "wxid_", true) && !AbstractC0425j.m1005J0(string2, "@chatroom", false) && !AbstractC0425j.m1005J0(string2, "@im.chatroom", false)) {
                Pattern patternCompile = Pattern.compile("(?i)^[a-f0-9]{32,}$");
                AbstractC0307g.m702d(patternCompile, "compile(...)");
                if (patternCompile.matcher(string2).matches()) {
                    return null;
                }
                return string2.length() > 40 ? AbstractC0425j.m1021Z0(string2, 40) : string2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m1740c(String str) {
        String string = str != null ? AbstractC0425j.m1022a1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        int iM1011P0 = AbstractC0425j.m1011P0(string, ":\n", 0, false, 6);
        if (1 <= iM1011P0 && iM1011P0 < 65) {
            String strSubstring = string.substring(0, iM1011P0);
            AbstractC0307g.m702d(strSubstring, "substring(...)");
            String string2 = AbstractC0425j.m1022a1(strSubstring).toString();
            if (m1745h(string2)) {
                return string2;
            }
        }
        int iM1010O0 = AbstractC0425j.m1010O0(string, ':', 0, false, 6);
        if (1 <= iM1010O0 && iM1010O0 < 65) {
            String strSubstring2 = string.substring(0, iM1010O0);
            AbstractC0307g.m702d(strSubstring2, "substring(...)");
            if (!AbstractC0425j.m1006K0(strSubstring2, ' ')) {
                String strSubstring3 = string.substring(0, iM1010O0);
                AbstractC0307g.m702d(strSubstring3, "substring(...)");
                String string3 = AbstractC0425j.m1022a1(strSubstring3).toString();
                if (m1745h(string3) && string.length() > iM1010O0 + 1) {
                    return string3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m1741d(String str) {
        String str2;
        String strM1739b;
        String str3;
        String strM1739b2;
        String str4;
        String strM1739b3;
        String strM1741d;
        if (str != null && !AbstractC0425j.m1013R0(str)) {
            String string = AbstractC0425j.m1022a1(str).toString();
            String strM1742e = m1742e(string, "replacemsg");
            if (strM1742e != null && (strM1741d = m1741d(strM1742e)) != null) {
                return strM1741d;
            }
            Pattern patternCompile = Pattern.compile("[\"“'「]([^\"”'」]{1,40})[\"”'」]\\s*recalled", C1121e.m2635b(2));
            AbstractC0307g.m702d(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(string);
            AbstractC0307g.m702d(matcher, "matcher(...)");
            C0419d c0419dM875a = AbstractC0358S.m875a(matcher, 0, string);
            if (c0419dM875a != null && (str4 = (String) AbstractC0181l.m545q0(c0419dM875a.m1002a(), 1)) != null && (strM1739b3 = m1739b(str4)) != null) {
                return strM1739b3;
            }
            Pattern patternCompile2 = Pattern.compile("^[\"“'「]?([^\"”'」\\n]{1,40}?)[\"”'」]?\\s*撤回");
            AbstractC0307g.m702d(patternCompile2, "compile(...)");
            Matcher matcher2 = patternCompile2.matcher(string);
            AbstractC0307g.m702d(matcher2, "matcher(...)");
            C0419d c0419dM875a2 = AbstractC0358S.m875a(matcher2, 0, string);
            if (c0419dM875a2 != null && (str3 = (String) AbstractC0181l.m545q0(c0419dM875a2.m1002a(), 1)) != null && (strM1739b2 = m1739b(str3)) != null) {
                if (!(!strM1739b2.equals("你"))) {
                    strM1739b2 = null;
                }
                if (strM1739b2 != null) {
                    return strM1739b2;
                }
            }
            Pattern patternCompile3 = Pattern.compile("[\"“'「]?([^\"”'」\\n]{1,40}?)[\"”'」]?\\s*撤回了");
            AbstractC0307g.m702d(patternCompile3, "compile(...)");
            Matcher matcher3 = patternCompile3.matcher(string);
            AbstractC0307g.m702d(matcher3, "matcher(...)");
            C0419d c0419dM875a3 = AbstractC0358S.m875a(matcher3, 0, string);
            if (c0419dM875a3 != null && (str2 = (String) AbstractC0181l.m545q0(c0419dM875a3.m1002a(), 1)) != null && (strM1739b = m1739b(str2)) != null) {
                if (strM1739b.equals("你") || AbstractC0425j.m1005J0(strM1739b, "sysmsg", true)) {
                    strM1739b = null;
                }
                if (strM1739b != null) {
                    return strM1739b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m1742e(String str, String str2) {
        String str3;
        String string;
        String str4;
        String str5 = "<" + str2 + ">\\s*<!\\[CDATA\\[(.*?)]]>\\s*</" + str2 + ">";
        EnumC0423h enumC0423h = EnumC0423h.f941c;
        EnumC0423h enumC0423h2 = EnumC0423h.f940b;
        Set setM92W = AbstractC0040p.m92W(enumC0423h, enumC0423h2);
        AbstractC0307g.m703e(str5, "pattern");
        Iterator it = setM92W.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 |= ((EnumC0423h) it.next()).f943a;
        }
        Pattern patternCompile = Pattern.compile(str5, C1121e.m2635b(i2));
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        AbstractC0307g.m703e(str, "input");
        Matcher matcher = patternCompile.matcher(str);
        AbstractC0307g.m702d(matcher, "matcher(...)");
        C0419d c0419dM875a = AbstractC0358S.m875a(matcher, 0, str);
        String string2 = (c0419dM875a == null || (str4 = (String) AbstractC0181l.m545q0(c0419dM875a.m1002a(), 1)) == null) ? null : AbstractC0425j.m1022a1(str4).toString();
        if (string2 != null && !AbstractC0425j.m1013R0(string2)) {
            return string2;
        }
        String str6 = "<" + str2 + ">(.*?)</" + str2 + ">";
        Set setM92W2 = AbstractC0040p.m92W(enumC0423h, enumC0423h2);
        AbstractC0307g.m703e(str6, "pattern");
        Iterator it2 = setM92W2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 |= ((EnumC0423h) it2.next()).f943a;
        }
        Pattern patternCompile2 = Pattern.compile(str6, C1121e.m2635b(i3));
        AbstractC0307g.m702d(patternCompile2, "compile(...)");
        Matcher matcher2 = patternCompile2.matcher(str);
        AbstractC0307g.m702d(matcher2, "matcher(...)");
        C0419d c0419dM875a2 = AbstractC0358S.m875a(matcher2, 0, str);
        if (c0419dM875a2 == null || (str3 = (String) AbstractC0181l.m545q0(c0419dM875a2.m1002a(), 1)) == null || (string = AbstractC0425j.m1022a1(str3).toString()) == null || !(!AbstractC0425j.m1013R0(string))) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: f */
    public static String m1743f(String str, String str2, String str3) {
        if (AbstractC0425j.m1013R0(str)) {
            str = "{name}撤回了一条消息";
        }
        String strM1739b = "你";
        if (!str2.equals("你") && (strM1739b = m1739b(str2)) == null) {
            strM1739b = "对方";
        }
        String string = AbstractC0425j.m1022a1(str3).toString();
        String strM1021Z0 = "";
        if (string.length() != 0 && !m1747j(string) && !m1748k(string) && ((!m1749l(string) || string.length() >= 48) && !AbstractC0433r.m1033H0(string, "wxid_", true))) {
            strM1021Z0 = AbstractC0425j.m1021Z0(string, 80);
        }
        String strM1031F0 = AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(str, "{name}", strM1739b, false), "{content}", strM1021Z0, false), "${name}", strM1739b, false), "${content}", strM1021Z0, false);
        Pattern patternCompile = Pattern.compile("[ \\t]{2,}");
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strM1031F0).replaceAll(" ");
        AbstractC0307g.m702d(strReplaceAll, "replaceAll(...)");
        String string2 = AbstractC0425j.m1022a1(strReplaceAll).toString();
        if (string2.length() == 0) {
            string2 = strM1739b.concat("撤回了一条消息");
        }
        return m1750m(string2);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1744g(String str) {
        AbstractC0307g.m703e(str, "id");
        String string = AbstractC0425j.m1022a1(str).toString();
        return AbstractC0433r.m1028C0(string, "@chatroom") || AbstractC0433r.m1028C0(string, "@im.chatroom");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1745h(String str) {
        AbstractC0307g.m703e(str, "id");
        String string = AbstractC0425j.m1022a1(str).toString();
        if (string.length() == 0 || string.length() > 80 || m1747j(string)) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); i2++) {
            if (AbstractC0358S.m860J(string.charAt(i2))) {
                return false;
            }
        }
        if (AbstractC0433r.m1033H0(string, "wxid_", false) || AbstractC0425j.m1005J0(string, "@", false) || AbstractC0040p.m92W("filehelper", "fmessage", "medianote", "newsapp", "weixin").contains(string)) {
            return true;
        }
        Pattern patternCompile = Pattern.compile("^[A-Za-z][A-Za-z0-9_-]{2,}$");
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        return patternCompile.matcher(string).matches();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1746i(String str) {
        List list = f2138b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC0425j.m1005J0(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return AbstractC0425j.m1005J0(str, "you recalled a message", true);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1747j(String str) {
        AbstractC0307g.m703e(str, "text");
        String string = AbstractC0425j.m1022a1(str).toString();
        if (string.length() == 0) {
            return false;
        }
        if (AbstractC0425j.m1005J0(string, "xwechat_files", true) || AbstractC0425j.m1005J0(string, "RWTemp", true)) {
            return true;
        }
        if ((!AbstractC0425j.m1005J0(string, "MicroMsg", true) || (!AbstractC0425j.m1006K0(string, '/') && !AbstractC0425j.m1006K0(string, '\\'))) && !AbstractC0425j.m1005J0(string, "/storage/", false) && !AbstractC0425j.m1005J0(string, "/sdcard/", false) && !AbstractC0425j.m1005J0(string, "/data/", false) && !AbstractC0425j.m1005J0(string, "emulated", false)) {
            Pattern patternCompile = Pattern.compile("(?i)^[A-Z]:[/\\\\].*");
            AbstractC0307g.m702d(patternCompile, "compile(...)");
            if (patternCompile.matcher(string).matches()) {
                return true;
            }
            if (AbstractC0425j.m1006K0(string, '\\') && (AbstractC0425j.m1006K0(string, ':') || AbstractC0425j.m1005J0(string, "WeChat", true))) {
                return true;
            }
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
            if ((!AbstractC0433r.m1028C0(lowerCase, ".jpg") && !AbstractC0433r.m1028C0(lowerCase, ".png") && !AbstractC0433r.m1028C0(lowerCase, ".jpeg") && !AbstractC0433r.m1028C0(lowerCase, ".webp") && !AbstractC0433r.m1028C0(lowerCase, ".gif") && !AbstractC0433r.m1028C0(lowerCase, ".mp4") && !AbstractC0433r.m1028C0(lowerCase, ".amr") && !AbstractC0433r.m1028C0(lowerCase, ".silk") && !AbstractC0433r.m1028C0(lowerCase, ".dat")) || (!AbstractC0425j.m1006K0(string, '/') && !AbstractC0425j.m1006K0(string, '\\') && string.length() < 32)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1748k(String str) {
        String string = str != null ? AbstractC0425j.m1022a1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return false;
        }
        if (m1747j(string) || AbstractC0433r.m1033H0(string, "<msg", false) || AbstractC0433r.m1033H0(string, "<?xml", false) || AbstractC0425j.m1005J0(string, "<img ", false) || AbstractC0425j.m1005J0(string, "cdnmidimgurl", true)) {
            return true;
        }
        if (AbstractC0425j.m1005J0(string, "aeskey", true) && AbstractC0425j.m1005J0(string, "length", false)) {
            return true;
        }
        Pattern patternCompile = Pattern.compile("(?i)^[a-f0-9]{32,}(\\.[a-z0-9]+)?$");
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        return patternCompile.matcher(string).matches();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m1749l(String str) {
        List list = f2137a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC0425j.m1005J0(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        if (AbstractC0425j.m1005J0(str, "recalled a message", true) || AbstractC0425j.m1005J0(str, "revokemsg", true)) {
            return true;
        }
        if (AbstractC0425j.m1005J0(str, "<sysmsg", true) && AbstractC0425j.m1005J0(str, "revoke", true)) {
            return true;
        }
        return AbstractC0425j.m1005J0(str, "MM_DATA_SYSCMD", true) && AbstractC0425j.m1005J0(str, "RECALL", true);
    }

    /* JADX INFO: renamed from: m */
    public static String m1750m(String str) {
        String string = "已阻止撤回";
        if (!AbstractC0425j.m1013R0(str) && !m1747j(str) && !m1748k(str) && !AbstractC0433r.m1033H0(str, "<", false)) {
            string = AbstractC0425j.m1022a1(str).toString();
        }
        return AbstractC0425j.m1005J0(string, "[已阻止]", false) ? string : string.concat("[已阻止]");
    }

    /* JADX INFO: renamed from: n */
    public static String m1751n(String str, String str2, String str3, boolean z2) {
        AbstractC0307g.m703e(str, "replacement");
        if (z2) {
            return "你";
        }
        String strM1741d = m1741d(str);
        if (strM1741d != null) {
            return strM1741d;
        }
        String strM1741d2 = m1741d(str2);
        if (strM1741d2 != null) {
            return strM1741d2;
        }
        String strM1739b = m1739b(str3);
        return strM1739b != null ? strM1739b : "对方";
    }

    /* JADX INFO: renamed from: o */
    public static String m1752o(boolean z2, C0652e1 c0652e1, String str, String str2) {
        String str3;
        String str4;
        if (z2) {
            return null;
        }
        if (c0652e1 != null && (str4 = c0652e1.f2028e) != null) {
            if (!m1745h(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                return str4;
            }
        }
        String strM1740c = m1740c(c0652e1 != null ? c0652e1.f2025b : null);
        if (strM1740c != null) {
            return strM1740c;
        }
        if (c0652e1 != null && (str3 = c0652e1.f2026c) != null) {
            if (!m1745h(str3) || m1744g(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                return str3;
            }
        }
        if (str != null) {
            if (!m1745h(str) || m1744g(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String strM1742e = m1742e(str2, "session");
        if (strM1742e != null) {
            if (!m1745h(strM1742e) || m1744g(strM1742e)) {
                strM1742e = null;
            }
            if (strM1742e != null) {
                return strM1742e;
            }
        }
        return null;
    }
}
