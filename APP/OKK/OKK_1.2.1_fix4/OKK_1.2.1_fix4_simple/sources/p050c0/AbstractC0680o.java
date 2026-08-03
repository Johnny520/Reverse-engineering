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
    public static final List f2137a = null;

    /* JADX INFO: renamed from: b */
    public static final List f2138b = null;

    static {
        f2137a = AbstractC0182m.m556h0(new String[]{"撤回了一条消息", "撤回一条消息", "消息已撤回"});
        f2138b = AbstractC0182m.m556h0(new String[]{"你撤回了一条消息", "你撤回一条消息"});
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0358S m1738a(C0700u1 r9, C0652e1 r10, boolean r11, String r12, boolean r13, String r14) {
        AbstractC0307g.m703e(r12, "noticeTemplate");
        boolean r02 = "message".equals("message");
        C0694s1 r1 = C0694s1.f2193z;
        if (r02 == true) goto L6;
        return r1;
    L6:
        if (r9.f2204b == 10000) goto L8;
        return r1;
    L8:
        String r92 = r9.f2205c;
        if (m1749l(r92) == true) goto L11;
        return r1;
    L11:
        boolean r03 = m1746i(r92);
        if (r03 == false) goto L15;
        if (r11 == true) goto L15;
        return r1;
    L15:
        Pattern r15 = Pattern.compile("<replacemsg>\\s*<!\\[CDATA\\[(.*?)]]>\\s*</replacemsg>", C1121e.m2635b(32));
        AbstractC0307g.m702d(r15, "compile(...)");
        Matcher r16 = r15.matcher(r92);
        AbstractC0307g.m702d(r16, "matcher(...)");
        C0419d r17 = AbstractC0358S.m875a(r16, 0, r92);
        String r5 = null;
        if (r17 == null) goto L20;
        String r18 = (String) AbstractC0181l.m545q0(r17.m1002a(), 1);
        if (r18 == null) goto L20;
        String r19 = AbstractC0425j.m1022a1(r18).toString();
    L21:
        if (r19 != null) goto L23;
    L24:
        Pattern r112 = Pattern.compile("<replacemsg>(.*?)</replacemsg>", C1121e.m2635b(32));
        AbstractC0307g.m702d(r112, "compile(...)");
        Matcher r113 = r112.matcher(r92);
        AbstractC0307g.m702d(r113, "matcher(...)");
        C0419d r114 = AbstractC0358S.m875a(r113, 0, r92);
        if (r114 == null) goto L33;
        String r115 = (String) AbstractC0181l.m545q0(r114.m1002a(), 1);
        if (r115 == null) goto L33;
        String r116 = AbstractC0425j.m1022a1(r115).toString();
        if (r116 == null) goto L33;
        if ((!AbstractC0425j.m1013R0(r116)) == false) goto L33;
        r19 = r116;
    L34:
        if (r19 != null) goto L36;
        r19 = r92;
    L36:
        String r117 = "";
        if (r13 == true) goto L41;
        return new C0697t1("");
    L41:
        if (AbstractC0425j.m1013R0(r12) == false) goto L43;
        r12 = "{name}撤回了一条消息";
    L43:
        String r132 = AbstractC0425j.m1022a1(r12).toString();
        if (r132.length() != 0) goto L47;
    L54:
        if (r03 == false) goto L56;
        String r93 = m1750m("你撤回了一条消息");
    L86:
        return new C0697t1(r93);
    L56:
        String r102 = AbstractC0425j.m1022a1(r19).toString();
        if (r102.length() != 0) goto L60;
    L84:
        r93 = m1743f("{name}撤回了一条消息", m1751n(r19, r92, r14, r03), "");
        goto L86
    L60:
        if (AbstractC0433r.m1033H0(r102, "<", false) == true) goto L84;
        if (m1747j(r102) == true) goto L84;
        if (m1748k(r102) == true) goto L84;
        if (AbstractC0433r.m1033H0(r102, "wxid_", true) == true) goto L84;
        List r122 = f2137a;
        if ((r122 instanceof Collection) == true) goto L73;
    L75:
        Iterator r123 = r122.iterator();
    L77:
        if (r123.hasNext() == false) goto L82;
        if (AbstractC0425j.m1005J0(r102, (String) r123.next(), false) == false) goto L77;
    L83:
        r93 = m1750m(r19);
    L82:
        if (AbstractC0425j.m1005J0(r102, "recalled a message", true) == false) goto L84;
    L73:
        if (r122.isEmpty() == false) goto L75;
    L47:
        if (r132.equals("{name}撤回了一条消息") == true) goto L54;
        if (r132.equals("{name}撤回了上一条消息 {content}") == true) goto L54;
        if (r132.equals("{name}撤回了上一条消息") == true) goto L54;
        String r94 = m1751n(r19, r92, r14, r03);
        if (r10 == null) goto L124;
        String r142 = r10.f2025b;
        if (m1747j(r142) == true) goto L155;
        if (m1748k(r142) == true) goto L155;
        int r103 = r10.f2024a;
        if (r103 != 1) goto L97;
    L98:
        String r104 = AbstractC0425j.m1022a1(r142).toString();
        if (r104.length() == 0) goto L155;
        if (AbstractC0433r.m1033H0(r104, "<", false) == true) goto L155;
        if (m1747j(r104) == true) goto L155;
        if (m1748k(r104) == true) goto L155;
        if (m1749l(r104) == true) goto L112;
    L114:
        String r143 = m1740c(r104);
        if (r143 == null) goto L118;
        r104 = AbstractC0425j.m1022a1(AbstractC0425j.m1016U0(AbstractC0425j.m1016U0(r104, r143.concat(":\n")), r143.concat(":"))).toString();
    L118:
        if (m1747j(r104) == true) goto L155;
        if (AbstractC0433r.m1033H0(r104, "<", false) == true) goto L155;
        r117 = AbstractC0425j.m1021Z0(r104, 80);
        goto L155
    L112:
        if (r104.length() >= 48) goto L114;
    L97:
        if (r103 == 11) goto L98;
    L155:
        return new C0697t1(m1743f(r12, r94, r117));
    L124:
        if (m1747j(r19) == true) goto L155;
        if (m1748k(r19) == true) goto L155;
        String r105 = AbstractC0425j.m1022a1(r19).toString();
        if (AbstractC0425j.m1013R0(r105) == false) goto L131;
    L135:
        String r106 = null;
    L145:
        if (r106 != null) goto L147;
    L151:
        if (r5 == null) goto L155;
        r117 = r5;
        goto L155
    L147:
        if (m1747j(r106) == true) goto L151;
        if (m1749l(r106) == true) goto L151;
        r5 = r106;
        goto L151
    L131:
        if (AbstractC0433r.m1033H0(r105, "<", false) == true) goto L135;
        if (m1747j(r105) == true) goto L135;
        if (m1749l(r105) == false) goto L142;
        if (r105.length() < 40) goto L135;
    L142:
        if (AbstractC0425j.m1005J0(r105, "recalled a message", true) == true) goto L135;
        r106 = AbstractC0425j.m1021Z0(r105, 80);
    L33:
        r19 = null;
        goto L34
    L23:
        if (AbstractC0425j.m1013R0(r19) == false) goto L34;
    L20:
        r19 = null;
        goto L21
    }

    /* JADX INFO: renamed from: b */
    public static String m1739b(String r11) {
        if (r11 != null) goto L5;
    L56:
        return null;
    L5:
        if (AbstractC0425j.m1013R0(r11) == true) goto L56;
        String r112 = AbstractC0425j.m1022a1(r11).toString();
        char[] r6 = {'\"', 8220, 8221, '\'', 12300, 12301};
        AbstractC0307g.m703e(r112, "<this>");
        int r7 = r112.length() - 1;
        int r8 = 0;
        boolean r9 = false;
    L8:
        if (r8 > r7) goto L20;
        if (r9 == true) goto L11;
        int r10 = r8;
    L12:
        boolean r102 = AbstractC0179j.m532i0(r6, r112.charAt(r10));
        if (r9 == false) goto L14;
        if (r102 == false) goto L20;
        r7 = r7 - 1;
        goto L8
    L14:
        if (r102 == false) goto L15;
        r8 = r8 + 1;
        goto L8
    L15:
        r9 = true;
        goto L8
    L11:
        r10 = r7;
    L20:
        String r113 = r112.subSequence(r8, r7 + 1).toString();
        if (AbstractC0425j.m1005J0(r113, " : ", false) == false) goto L28;
        AbstractC0307g.m703e(r113, "<this>");
        AbstractC0307g.m703e(r113, "missingDelimiterValue");
        int r3 = AbstractC0425j.m1011P0(r113, " : ", 0, false, 6);
        if (r3 == (-1)) goto L26;
        r113 = r113.substring(0, r3);
        AbstractC0307g.m702d(r113, "substring(...)");
    L26:
        r113 = AbstractC0425j.m1022a1(r113).toString();
    L28:
        if (r113.length() != 0) goto L31;
    L32:
        return null;
    L31:
        if (r113.equals("对方") == true) goto L32;
        if (r113.equals("你") == false) goto L37;
        return "你";
    L37:
        if (m1747j(r113) == true) goto L56;
        if (m1748k(r113) == true) goto L56;
        if (AbstractC0433r.m1033H0(r113, "wxid_", true) == false) goto L45;
        return null;
    L45:
        if (AbstractC0425j.m1005J0(r113, "@chatroom", false) == true) goto L56;
        if (AbstractC0425j.m1005J0(r113, "@im.chatroom", false) == true) goto L56;
        Pattern r02 = Pattern.compile("(?i)^[a-f0-9]{32,}$");
        AbstractC0307g.m702d(r02, "compile(...)");
        if (r02.matcher(r113).matches() == false) goto L53;
        return null;
    L53:
        if (r113.length() > 40) goto L55;
        return r113;
    L55:
        return AbstractC0425j.m1021Z0(r113, 40);
    }

    /* JADX INFO: renamed from: c */
    public static String m1740c(String r8) {
        if (r8 == null) goto L5;
        String r82 = AbstractC0425j.m1022a1(r8).toString();
    L6:
        if (r82 != null) goto L9;
        r82 = "";
    L9:
        if (r82.length() != 0) goto L11;
        return null;
    L11:
        int r1 = AbstractC0425j.m1011P0(r82, ":\n", 0, false, 6);
        if (1 > r1) goto L17;
        if (r1 >= 65) goto L17;
        String r12 = r82.substring(0, r1);
        AbstractC0307g.m702d(r12, "substring(...)");
        String r13 = AbstractC0425j.m1022a1(r12).toString();
        if (m1745h(r13) == false) goto L17;
        return r13;
    L17:
        int r14 = AbstractC0425j.m1010O0(r82, ':', 0, false, 6);
        if (1 > r14) goto L27;
        if (r14 >= 65) goto L27;
        String r3 = r82.substring(0, r14);
        AbstractC0307g.m702d(r3, "substring(...)");
        if (AbstractC0425j.m1006K0(r3, ' ') == true) goto L27;
        String r2 = r82.substring(0, r14);
        AbstractC0307g.m702d(r2, "substring(...)");
        String r22 = AbstractC0425j.m1022a1(r2).toString();
        if (m1745h(r22) == false) goto L27;
        if (r82.length() <= (r14 + 1)) goto L27;
        return r22;
    L27:
        return null;
    L5:
        r82 = null;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public static String m1741d(String r8) {
        if (r8 != null) goto L5;
    L45:
        return null;
    L5:
        if (AbstractC0425j.m1013R0(r8) == true) goto L45;
        String r82 = AbstractC0425j.m1022a1(r8).toString();
        String r1 = m1742e(r82, "replacemsg");
        if (r1 == null) goto L12;
        String r12 = m1741d(r1);
        if (r12 == null) goto L12;
        return r12;
    L12:
        Pattern r13 = Pattern.compile("[\"“'「]([^\"”'」]{1,40})[\"”'」]\\s*recalled", C1121e.m2635b(2));
        AbstractC0307g.m702d(r13, "compile(...)");
        Matcher r14 = r13.matcher(r82);
        AbstractC0307g.m702d(r14, "matcher(...)");
        C0419d r15 = AbstractC0358S.m875a(r14, 0, r82);
        if (r15 == null) goto L19;
        String r16 = (String) AbstractC0181l.m545q0(r15.m1002a(), 1);
        if (r16 == null) goto L19;
        String r17 = m1739b(r16);
        if (r17 == null) goto L19;
        return r17;
    L19:
        Pattern r18 = Pattern.compile("^[\"“'「]?([^\"”'」\\n]{1,40}?)[\"”'」]?\\s*撤回");
        AbstractC0307g.m702d(r18, "compile(...)");
        Matcher r19 = r18.matcher(r82);
        AbstractC0307g.m702d(r19, "matcher(...)");
        C0419d r110 = AbstractC0358S.m875a(r19, 0, r82);
        if (r110 == null) goto L31;
        String r111 = (String) AbstractC0181l.m545q0(r110.m1002a(), 1);
        if (r111 == null) goto L31;
        String r112 = m1739b(r111);
        if (r112 == null) goto L31;
        if ((!r112.equals("你")) == true) goto L29;
        r112 = null;
    L29:
        if (r112 == null) goto L31;
        return r112;
    L31:
        Pattern r113 = Pattern.compile("[\"“'「]?([^\"”'」\\n]{1,40}?)[\"”'」]?\\s*撤回了");
        AbstractC0307g.m702d(r113, "compile(...)");
        Matcher r114 = r113.matcher(r82);
        AbstractC0307g.m702d(r114, "matcher(...)");
        C0419d r83 = AbstractC0358S.m875a(r114, 0, r82);
        if (r83 == null) goto L45;
        String r84 = (String) AbstractC0181l.m545q0(r83.m1002a(), 1);
        if (r84 == null) goto L45;
        String r85 = m1739b(r84);
        if (r85 == null) goto L45;
        if (r85.equals("你") == false) goto L40;
    L42:
        r85 = null;
    L43:
        if (r85 == null) goto L45;
        return r85;
    L40:
        if (AbstractC0425j.m1005J0(r85, "sysmsg", true) == true) goto L42;
        goto L42
    }

    /* JADX INFO: renamed from: e */
    public static String m1742e(String r12, String r13) {
        String r02 = "<" + r13 + ">\\s*<!\\[CDATA\\[(.*?)]]>\\s*</" + r13 + ">";
        EnumC0423h r3 = EnumC0423h.f941c;
        EnumC0423h r4 = EnumC0423h.f940b;
        Set r5 = AbstractC0040p.m92W(new EnumC0423h[]{r3, r4});
        AbstractC0307g.m703e(r02, "pattern");
        Iterator r52 = r5.iterator();
        int r8 = 0;
    L4:
        if (r52.hasNext() == false) goto L6;
        r8 = r8 | ((EnumC0423h) r52.next()).f943a;
        goto L4
    L6:
        Pattern r03 = Pattern.compile(r02, C1121e.m2635b(r8));
        AbstractC0307g.m702d(r03, "compile(...)");
        AbstractC0307g.m703e(r12, "input");
        Matcher r04 = r03.matcher(r12);
        AbstractC0307g.m702d(r04, "matcher(...)");
        C0419d r05 = AbstractC0358S.m875a(r04, 0, r12);
        if (r05 == null) goto L11;
        String r06 = (String) AbstractC0181l.m545q0(r05.m1002a(), 1);
        if (r06 == null) goto L11;
        String r07 = AbstractC0425j.m1022a1(r06).toString();
    L12:
        if (r07 != null) goto L14;
    L17:
        String r132 = "<" + r13 + ">(.*?)</" + r13 + ">";
        Set r08 = AbstractC0040p.m92W(new EnumC0423h[]{r3, r4});
        AbstractC0307g.m703e(r132, "pattern");
        Iterator r09 = r08.iterator();
        int r1 = 0;
    L19:
        if (r09.hasNext() == false) goto L21;
        r1 = r1 | ((EnumC0423h) r09.next()).f943a;
        goto L19
    L21:
        Pattern r133 = Pattern.compile(r132, C1121e.m2635b(r1));
        AbstractC0307g.m702d(r133, "compile(...)");
        Matcher r134 = r133.matcher(r12);
        AbstractC0307g.m702d(r134, "matcher(...)");
        C0419d r122 = AbstractC0358S.m875a(r134, 0, r12);
        if (r122 == null) goto L33;
        String r123 = (String) AbstractC0181l.m545q0(r122.m1002a(), 1);
        if (r123 == null) goto L34;
        String r124 = AbstractC0425j.m1022a1(r123).toString();
        if (r124 != null) goto L28;
        return null;
    L28:
        if ((!AbstractC0425j.m1013R0(r124)) == true) goto L30;
        return null;
    L30:
        return r124;
    L34:
        return null;
    L33:
        return null;
    L14:
        if (AbstractC0425j.m1013R0(r07) == true) goto L17;
        return r07;
    L11:
        r07 = null;
        goto L12
    }

    /* JADX INFO: renamed from: f */
    public static String m1743f(String r3, String r4, String r5) {
        if (AbstractC0425j.m1013R0(r3) == false) goto L5;
        r3 = "{name}撤回了一条消息";
    L5:
        String r02 = "你";
        if (r4.equals("你") == true) goto L11;
        r02 = m1739b(r4);
        if (r02 != null) goto L11;
        r02 = "对方";
    L11:
        String r42 = AbstractC0425j.m1022a1(r5).toString();
        String r1 = "";
        if (r42.length() != 0) goto L15;
    L28:
        String r32 = AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(r3, "{name}", r02, false), "{content}", r1, false), "${name}", r02, false), "${content}", r1, false);
        Pattern r43 = Pattern.compile("[ \\t]{2,}");
        AbstractC0307g.m702d(r43, "compile(...)");
        String r33 = r43.matcher(r32).replaceAll(" ");
        AbstractC0307g.m702d(r33, "replaceAll(...)");
        String r34 = AbstractC0425j.m1022a1(r33).toString();
        if (r34.length() != 0) goto L32;
        r34 = r02.concat("撤回了一条消息");
    L32:
        return m1750m(r34);
    L15:
        if (m1747j(r42) == true) goto L28;
        if (m1748k(r42) == true) goto L28;
        if (m1749l(r42) == false) goto L25;
        if (r42.length() < 48) goto L28;
    L25:
        if (AbstractC0433r.m1033H0(r42, "wxid_", true) == true) goto L28;
        r1 = AbstractC0425j.m1021Z0(r42, 80);
        goto L28
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1744g(String r1) {
        AbstractC0307g.m703e(r1, "id");
        String r12 = AbstractC0425j.m1022a1(r1).toString();
        if (AbstractC0433r.m1028C0(r12, "@chatroom") == false) goto L5;
    L8:
        return true;
    L5:
        if (AbstractC0433r.m1028C0(r12, "@im.chatroom") == true) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1745h(String r7) {
        AbstractC0307g.m703e(r7, "id");
        String r72 = AbstractC0425j.m1022a1(r7).toString();
        if (r72.length() != 0) goto L6;
    L7:
        return false;
    L6:
        if (r72.length() > 80) goto L7;
        if (m1747j(r72) == false) goto L11;
        return false;
    L11:
        int r02 = 0;
    L13:
        if (r02 >= r72.length()) goto L19;
        if (AbstractC0358S.m860J(r72.charAt(r02)) == true) goto L16;
        r02 = r02 + 1;
        goto L13
    L16:
        return false;
    L19:
        if (AbstractC0433r.m1033H0(r72, "wxid_", false) == false) goto L22;
        return true;
    L22:
        if (AbstractC0425j.m1005J0(r72, "@", false) == false) goto L25;
        return true;
    L25:
        if (AbstractC0040p.m92W(new String[]{"filehelper", "fmessage", "medianote", "newsapp", "weixin"}).contains(r72) == false) goto L27;
        return true;
    L27:
        Pattern r03 = Pattern.compile("^[A-Za-z][A-Za-z0-9_-]{2,}$");
        AbstractC0307g.m702d(r03, "compile(...)");
        if (r03.matcher(r72).matches() == false) goto L30;
        return true;
    L30:
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1746i(String r4) {
        List r02 = f2138b;
        if ((r02 instanceof Collection) == true) goto L5;
    L7:
        Iterator r03 = r02.iterator();
    L9:
        if (r03.hasNext() == false) goto L14;
        if (AbstractC0425j.m1005J0(r4, (String) r03.next(), false) == false) goto L9;
        return true;
    L14:
        return AbstractC0425j.m1005J0(r4, "you recalled a message", true);
    L5:
        if (r02.isEmpty() == false) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1747j(String r6) {
        AbstractC0307g.m703e(r6, "text");
        String r62 = AbstractC0425j.m1022a1(r6).toString();
        if (r62.length() != 0) goto L6;
        return false;
    L6:
        if (AbstractC0425j.m1005J0(r62, "xwechat_files", true) == false) goto L9;
        return true;
    L9:
        if (AbstractC0425j.m1005J0(r62, "RWTemp", true) == false) goto L12;
        return true;
    L12:
        if (AbstractC0425j.m1005J0(r62, "MicroMsg", true) == false) goto L19;
        if (AbstractC0425j.m1006K0(r62, '/') == false) goto L16;
    L17:
        return true;
    L16:
        if (AbstractC0425j.m1006K0(r62, '\\') == true) goto L17;
    L19:
        if (AbstractC0425j.m1005J0(r62, "/storage/", false) == false) goto L21;
    L63:
        return true;
    L21:
        if (AbstractC0425j.m1005J0(r62, "/sdcard/", false) == true) goto L63;
        if (AbstractC0425j.m1005J0(r62, "/data/", false) == true) goto L63;
        if (AbstractC0425j.m1005J0(r62, "emulated", false) == true) goto L63;
        Pattern r02 = Pattern.compile("(?i)^[A-Z]:[/\\\\].*");
        AbstractC0307g.m702d(r02, "compile(...)");
        if (r02.matcher(r62).matches() == false) goto L31;
        return true;
    L31:
        if (AbstractC0425j.m1006K0(r62, '\\') == true) goto L33;
    L37:
        String r03 = r62.toLowerCase(Locale.ROOT);
        AbstractC0307g.m702d(r03, "toLowerCase(...)");
        if (AbstractC0433r.m1028C0(r03, ".jpg") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".png") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".jpeg") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".webp") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".gif") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".mp4") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".amr") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".silk") == true) goto L56;
        if (AbstractC0433r.m1028C0(r03, ".dat") == true) goto L56;
    L62:
        return false;
    L56:
        if (AbstractC0425j.m1006K0(r62, '/') == true) goto L63;
        if (AbstractC0425j.m1006K0(r62, '\\') == true) goto L63;
        if (r62.length() < 32) goto L62;
    L33:
        if (AbstractC0425j.m1006K0(r62, ':') == false) goto L35;
    L36:
        return true;
    L35:
        if (AbstractC0425j.m1005J0(r62, "WeChat", true) == false) goto L37;
        goto L36
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1748k(String r4) {
        if (r4 == null) goto L4;
        String r42 = AbstractC0425j.m1022a1(r4).toString();
    L5:
        if (r42 != null) goto L8;
        r42 = "";
    L8:
        if (r42.length() != 0) goto L11;
        return false;
    L11:
        if (m1747j(r42) == false) goto L14;
        return true;
    L14:
        if (AbstractC0433r.m1033H0(r42, "<msg", false) == false) goto L16;
    L32:
        return true;
    L16:
        if (AbstractC0433r.m1033H0(r42, "<?xml", false) == true) goto L32;
        if (AbstractC0425j.m1005J0(r42, "<img ", false) == true) goto L32;
        if (AbstractC0425j.m1005J0(r42, "cdnmidimgurl", true) == false) goto L24;
        return true;
    L24:
        if (AbstractC0425j.m1005J0(r42, "aeskey", true) == true) goto L26;
    L28:
        Pattern r02 = Pattern.compile("(?i)^[a-f0-9]{32,}(\\.[a-z0-9]+)?$");
        AbstractC0307g.m702d(r02, "compile(...)");
        if (r02.matcher(r42).matches() == false) goto L31;
        return true;
    L31:
        return false;
    L26:
        if (AbstractC0425j.m1005J0(r42, "length", false) == false) goto L28;
        return true;
    L4:
        r42 = null;
        goto L5
    }

    /* JADX INFO: renamed from: l */
    public static boolean m1749l(String r4) {
        List r02 = f2137a;
        if ((r02 instanceof Collection) == true) goto L5;
    L7:
        Iterator r03 = r02.iterator();
    L9:
        if (r03.hasNext() == false) goto L14;
        if (AbstractC0425j.m1005J0(r4, (String) r03.next(), false) == false) goto L9;
        return true;
    L14:
        if (AbstractC0425j.m1005J0(r4, "recalled a message", true) == false) goto L17;
        return true;
    L17:
        if (AbstractC0425j.m1005J0(r4, "revokemsg", true) == false) goto L20;
        return true;
    L20:
        if (AbstractC0425j.m1005J0(r4, "<sysmsg", true) == false) goto L25;
        if (AbstractC0425j.m1005J0(r4, "revoke", true) == false) goto L25;
        return true;
    L25:
        if (AbstractC0425j.m1005J0(r4, "MM_DATA_SYSCMD", true) == true) goto L27;
    L29:
        return false;
    L27:
        if (AbstractC0425j.m1005J0(r4, "RECALL", true) == false) goto L29;
        return true;
    L5:
        if (r02.isEmpty() == false) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: m */
    public static String m1750m(String r3) {
        String r2 = "已阻止撤回";
        if (AbstractC0425j.m1013R0(r3) == true) goto L15;
        if (m1747j(r3) == true) goto L15;
        if (m1748k(r3) == true) goto L15;
        if (AbstractC0433r.m1033H0(r3, "<", false) == true) goto L15;
        r2 = AbstractC0425j.m1022a1(r3).toString();
    L15:
        if (AbstractC0425j.m1005J0(r2, "[已阻止]", false) == false) goto L18;
        return r2;
    L18:
        return r2.concat("[已阻止]");
    }

    /* JADX INFO: renamed from: n */
    public static String m1751n(String r1, String r2, String r3, boolean r4) {
        AbstractC0307g.m703e(r1, "replacement");
        if (r4 == false) goto L6;
        return "你";
    L6:
        String r12 = m1741d(r1);
        if (r12 == null) goto L9;
        return r12;
    L9:
        String r13 = m1741d(r2);
        if (r13 == null) goto L12;
        return r13;
    L12:
        String r14 = m1739b(r3);
        if (r14 == null) goto L15;
        return r14;
    L15:
        return "对方";
    }

    /* JADX INFO: renamed from: o */
    public static String m1752o(boolean r2, C0652e1 r3, String r4, String r5) {
        if (r2 == false) goto L5;
        return null;
    L5:
        if (r3 == null) goto L14;
        String r22 = r3.f2028e;
        if (r22 == null) goto L14;
        if (m1745h(r22) == true) goto L12;
        r22 = null;
    L12:
        if (r22 == null) goto L14;
        return r22;
    L14:
        if (r3 == null) goto L16;
        String r23 = r3.f2025b;
    L17:
        String r24 = m1740c(r23);
        if (r24 == null) goto L20;
        return r24;
    L20:
        if (r3 == null) goto L31;
        String r25 = r3.f2026c;
        if (r25 == null) goto L31;
        if (m1745h(r25) == true) goto L26;
    L28:
        r25 = null;
    L29:
        if (r25 == null) goto L31;
        return r25;
    L26:
        if (m1744g(r25) == true) goto L28;
    L31:
        if (r4 != null) goto L33;
    L40:
        String r26 = m1742e(r5, "session");
        if (r26 != null) goto L43;
    L50:
        return null;
    L43:
        if (m1745h(r26) == true) goto L45;
    L47:
        r26 = null;
    L48:
        if (r26 == null) goto L50;
        return r26;
    L45:
        if (m1744g(r26) == true) goto L47;
    L33:
        if (m1745h(r4) == true) goto L35;
    L37:
        r4 = null;
    L38:
        if (r4 == null) goto L40;
        return r4;
    L35:
        if (m1744g(r4) == true) goto L37;
    L16:
        r23 = null;
        goto L17
    }
}
