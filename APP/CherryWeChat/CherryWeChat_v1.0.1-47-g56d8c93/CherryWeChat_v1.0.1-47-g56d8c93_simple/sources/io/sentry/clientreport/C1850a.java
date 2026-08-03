package io.sentry.clientreport;

import io.sentry.C1559A0;
import io.sentry.C1601K2;
import io.sentry.C1828b2;
import io.sentry.C1864d2;
import io.sentry.C1865e;
import io.sentry.C1873f1;
import io.sentry.EnumC1605L2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1978q0;
import io.sentry.config.AbstractC1856a;
import io.sentry.profilemeasurements.C1942a;
import io.sentry.profilemeasurements.C1943b;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1945B;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1952b;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1956f;
import io.sentry.protocol.C1957g;
import io.sentry.protocol.C1958h;
import io.sentry.protocol.C1959i;
import io.sentry.protocol.C1960j;
import io.sentry.protocol.C1961k;
import io.sentry.protocol.C1962l;
import io.sentry.protocol.C1963m;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1966p;
import io.sentry.protocol.C1967q;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1969s;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.C1971u;
import io.sentry.protocol.C1972v;
import io.sentry.protocol.C1973w;
import io.sentry.protocol.C1974x;
import io.sentry.protocol.C1975y;
import io.sentry.protocol.C1976z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC1946C;
import io.sentry.protocol.EnumC1955e;
import io.sentry.vendor.gson.stream.C2049a;
import io.sentry.vendor.gson.stream.EnumC2050b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.clientreport.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1850a implements InterfaceC1978q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6669a;

    public /* synthetic */ C1850a(int r1) {
        this.f6669a = r1;
    }

    /* JADX INFO: renamed from: b */
    public static C1951a m4030b(C1559A0 r5, ILogger r6) {
        r5.m3567f();
        C1951a r0 = new C1951a();
        ConcurrentHashMap r1 = null;
    L4:
        if (r5.m3564F() != EnumC2050b.NAME) goto L81;
        String r2 = r5.m3581y();
        r2.getClass();
        byte r4 = -1;
        switch(r2.hashCode()) {
            case -1950148125: goto L57;
            case -1898053579: goto L53;
            case -1573129993: goto L49;
            case -1524619986: goto L45;
            case -901870406: goto L41;
            case -650544995: goto L37;
            case -470395285: goto L33;
            case 746297735: goto L29;
            case 791585128: goto L25;
            case 1133704324: goto L21;
            case 1167648233: goto L17;
            case 1826866896: goto L13;
            case 1965003281: goto L9;
            default: goto L60;
        };
    L60:
        switch(r4) {
            case 0: goto L78;
            case 1: goto L77;
            case 2: goto L76;
            case 3: goto L73;
            case 4: goto L72;
            case 5: goto L71;
            case 6: goto L70;
            case 7: goto L69;
            case 8: goto L68;
            case 9: goto L67;
            case 10: goto L66;
            case 11: goto L65;
            case 12: goto L64;
            default: goto L61;
        };
    L64:
        r0.f6883l = r5.m3569l();
        goto L4
    L65:
        r0.f6878g = r5.m3561C();
        goto L4
    L66:
        r0.f6876e = r5.m3561C();
        goto L4
    L67:
        r0.f6879h = AbstractC1856a.m4045A((Map) r5.m3582z());
        goto L4
    L68:
        r0.f6873b = r5.m3570m(r6);
        goto L4
    L69:
        r0.f6872a = r5.m3561C();
        goto L4
    L70:
        r0.f6875d = r5.m3561C();
        goto L4
    L71:
        r0.f6882k = r5.m3569l();
        goto L4
    L72:
        r0.f6877f = r5.m3561C();
        goto L4
    L73:
        List r22 = (List) r5.m3582z();
        if (r22 == null) goto L4;
        r0.f6880i = r22;
        goto L4
    L76:
        r0.f6881j = r5.m3561C();
        goto L4
    L77:
        r0.f6874c = r5.m3561C();
        goto L4
    L78:
        List r23 = (List) r5.m3582z();
        if (r23 == null) goto L4;
        r0.f6884m = r23;
        goto L4
    L61:
        if (r1 != null) goto L63;
        r1 = new ConcurrentHashMap();
    L63:
        r5.m3562D(r6, r1, r2);
        goto L4
    L9:
        if (r2.equals("is_split_apks") == false) goto L60;
        r4 = 12;
        goto L60
    L13:
        if (r2.equals("app_build") == false) goto L60;
        r4 = 11;
        goto L60
    L17:
        if (r2.equals("app_name") == false) goto L60;
        r4 = 10;
        goto L60
    L21:
        if (r2.equals("permissions") == false) goto L60;
        r4 = 9;
        goto L60
    L25:
        if (r2.equals("app_start_time") == false) goto L60;
        r4 = 8;
        goto L60
    L29:
        if (r2.equals("app_identifier") == false) goto L60;
        r4 = 7;
        goto L60
    L33:
        if (r2.equals("build_type") == false) goto L60;
        r4 = 6;
        goto L60
    L37:
        if (r2.equals("in_foreground") == false) goto L60;
        r4 = 5;
        goto L60
    L41:
        if (r2.equals("app_version") == false) goto L60;
        r4 = 4;
        goto L60
    L45:
        if (r2.equals("view_names") == false) goto L60;
        r4 = 3;
        goto L60
    L49:
        if (r2.equals("start_type") == false) goto L60;
        r4 = 2;
        goto L60
    L53:
        if (r2.equals("device_app_hash") == false) goto L60;
        r4 = 1;
        goto L60
    L57:
        if (r2.equals("split_names") == false) goto L60;
        r4 = 0;
        goto L60
    L81:
        r0.f6885n = r1;
        r5.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: c */
    public static C1953c m4031c(C1559A0 r14, ILogger r15) {
        C1953c r0 = new C1953c();
        r14.m3567f();
    L4:
        if (r14.m3564F() != EnumC2050b.NAME) goto L164;
        String r1 = r14.m3581y();
        r1.getClass();
        switch(r1.hashCode()) {
            case -1335157162: goto L49;
            case -895679987: goto L45;
            case -340323263: goto L41;
            case -309425751: goto L37;
            case -191501435: goto L33;
            case 3556: goto L29;
            case 96801: goto L25;
            case 102572: goto L21;
            case 110620997: goto L17;
            case 150940456: goto L13;
            case 1550962648: goto L9;
            default: goto L7;
        };
    L7:
        byte r2 = -1;
    L52:
        ConcurrentHashMap r13 = null;
        switch(r2) {
            case 0: goto L163;
            case 1: goto L151;
            case 2: goto L113;
            case 3: goto L101;
            case 4: goto L100;
            case 5: goto L99;
            case 6: goto L98;
            case 7: goto L97;
            case 8: goto L96;
            case 9: goto L83;
            case 10: goto L57;
            default: goto L54;
        };
    L57:
        r14.m3567f();
        C1972v r12 = new C1972v();
    L59:
        if (r14.m3564F() != EnumC2050b.NAME) goto L82;
        String r22 = r14.m3581y();
        r22.getClass();
        switch(r22.hashCode()) {
            case -339173787: goto L72;
            case 3373707: goto L68;
            case 351608024: goto L64;
            default: goto L62;
        };
    L62:
        byte r3 = -1;
    L75:
        switch(r3) {
            case 0: goto L81;
            case 1: goto L80;
            case 2: goto L79;
            default: goto L76;
        };
    L79:
        r12.f7017b = r14.m3561C();
        goto L59
    L80:
        r12.f7016a = r14.m3561C();
        goto L59
    L81:
        r12.f7018c = r14.m3561C();
        goto L59
    L76:
        if (r13 != null) goto L78;
        r13 = new ConcurrentHashMap();
    L78:
        r14.m3562D(r15, r13, r22);
        goto L59
    L64:
        if (r22.equals("version") == false) goto L256;
        r3 = 2;
        goto L75
    L256:
        r3 = -1;
        goto L75
    L68:
        if (r22.equals("name") == false) goto L257;
        r3 = 1;
        goto L75
    L257:
        r3 = -1;
        goto L75
    L72:
        if (r22.equals("raw_description") == false) goto L258;
        r3 = 0;
        goto L75
    L258:
        r3 = -1;
        goto L75
    L82:
        r12.f7019d = r13;
        r14.m3568i();
        r0.mo4136r(r12);
        goto L4
    L83:
        r14.m3567f();
        C1952b r16 = new C1952b();
    L85:
        if (r14.m3564F() != EnumC2050b.NAME) goto L95;
        String r23 = r14.m3581y();
        r23.getClass();
        if (r23.equals("name") == false) goto L89;
        r16.f6886a = r14.m3561C();
        goto L85
    L89:
        if (r23.equals("version") == false) goto L90;
        r16.f6887b = r14.m3561C();
        goto L85
    L90:
        if (r13 != null) goto L92;
        r13 = new ConcurrentHashMap();
    L92:
        r14.m3562D(r15, r13, r23);
        goto L85
    L95:
        r16.f6888c = r13;
        r14.m3568i();
        r0.mo4131m(r16);
        goto L4
    L96:
        r0.mo4138t(C1865e.m4088b(r14, r15));
        goto L4
    L97:
        r0.mo4133o(m4034f(r14, r15));
        goto L4
    L98:
        r0.mo4130l(m4030b(r14, r15));
        goto L4
    L99:
        r0.mo4134p(m4035g(r14, r15));
        goto L4
    L100:
        r0.mo4128j("feedback", m4033e(r14, r15));
        goto L4
    L101:
        r14.m3567f();
        C1873f1 r17 = new C1873f1(C1970t.f7011b);
    L103:
        if (r14.m3564F() != EnumC2050b.NAME) goto L112;
        String r24 = r14.m3581y();
        r24.getClass();
        if (r24.equals("profiler_id") == false) goto L106;
        C1970t r25 = (C1970t) r14.m3559A(r15, new C1850a(22));
        if (r25 == null) goto L103;
        r17.f6718a = r25;
        goto L103
    L106:
        if (r13 != null) goto L108;
        r13 = new ConcurrentHashMap();
    L108:
        r14.m3562D(r15, r13, r24);
        goto L103
    L112:
        r17.f6719b = r13;
        r14.m3568i();
        r0.mo4128j("profile", r17);
        goto L4
    L113:
        r14.m3567f();
        C1966p r18 = new C1966p();
    L115:
        if (r14.m3564F() != EnumC2050b.NAME) goto L150;
        String r26 = r14.m3581y();
        r26.getClass();
        switch(r26.hashCode()) {
            case -891699686: goto L136;
            case 3076010: goto L132;
            case 795307910: goto L128;
            case 952189583: goto L124;
            case 1252988030: goto L120;
            default: goto L118;
        };
    L118:
        byte r4 = -1;
    L139:
        switch(r4) {
            case 0: goto L149;
            case 1: goto L148;
            case 2: goto L145;
            case 3: goto L144;
            case 4: goto L143;
            default: goto L140;
        };
    L143:
        r18.f6991d = r14.m3579w();
        goto L115
    L144:
        r18.f6988a = r14.m3561C();
        goto L115
    L145:
        Map r27 = (Map) r14.m3582z();
        if (r27 == null) goto L115;
        r18.f6989b = AbstractC1856a.m4045A(r27);
        goto L115
    L148:
        r18.f6992e = r14.m3582z();
        goto L115
    L149:
        r18.f6990c = r14.m3576t();
        goto L115
    L140:
        if (r13 != null) goto L142;
        r13 = new ConcurrentHashMap();
    L142:
        r14.m3562D(r15, r13, r26);
        goto L115
    L120:
        if (r26.equals("body_size") == false) goto L259;
        r4 = 4;
        goto L139
    L259:
        r4 = -1;
        goto L139
    L124:
        if (r26.equals("cookies") == false) goto L260;
        r4 = 3;
        goto L139
    L260:
        r4 = -1;
        goto L139
    L128:
        if (r26.equals("headers") == false) goto L261;
        r4 = 2;
        goto L139
    L261:
        r4 = -1;
        goto L139
    L132:
        if (r26.equals("data") == false) goto L262;
        r4 = 1;
        goto L139
    L262:
        r4 = -1;
        goto L139
    L136:
        if (r26.equals("status_code") == false) goto L263;
        r4 = 0;
        goto L139
    L263:
        r4 = -1;
        goto L139
    L150:
        r18.f6993f = r13;
        r14.m3568i();
        r0.mo4135q(r18);
        goto L4
    L151:
        r14.m3567f();
        C1945B r19 = new C1945B();
    L153:
        if (r14.m3564F() != EnumC2050b.NAME) goto L162;
        String r28 = r14.m3581y();
        r28.getClass();
        if (r28.equals("active_profiles") == false) goto L156;
        List r29 = (List) r14.m3582z();
        if (r29 == null) goto L153;
        String[] r32 = new String[r29.size()];
        r29.toArray(r32);
        r19.f6846a = r32;
        goto L153
    L156:
        if (r13 != null) goto L158;
        r13 = new ConcurrentHashMap();
    L158:
        r14.m3562D(r15, r13, r28);
        goto L153
    L162:
        r19.f6847b = r13;
        r14.m3568i();
        r0.mo4137s(r19);
        goto L4
    L163:
        r0.mo4132n(m4032d(r14, r15));
        goto L4
    L54:
        Object r210 = r14.m3582z();
        if (r210 == null) goto L4;
        r0.mo4128j(r1, r210);
        goto L4
    L9:
        if (r1.equals("runtime") == false) goto L245;
        r2 = 10;
        goto L52
    L245:
        r2 = -1;
        goto L52
    L13:
        if (r1.equals("browser") == false) goto L246;
        r2 = 9;
        goto L52
    L246:
        r2 = -1;
        goto L52
    L17:
        if (r1.equals("trace") == false) goto L247;
        r2 = 8;
        goto L52
    L247:
        r2 = -1;
        goto L52
    L21:
        if (r1.equals("gpu") == false) goto L248;
        r2 = 7;
        goto L52
    L248:
        r2 = -1;
        goto L52
    L25:
        if (r1.equals("app") == false) goto L249;
        r2 = 6;
        goto L52
    L249:
        r2 = -1;
        goto L52
    L29:
        if (r1.equals("os") == false) goto L250;
        r2 = 5;
        goto L52
    L250:
        r2 = -1;
        goto L52
    L33:
        if (r1.equals("feedback") == false) goto L251;
        r2 = 4;
        goto L52
    L251:
        r2 = -1;
        goto L52
    L37:
        if (r1.equals("profile") == false) goto L252;
        r2 = 3;
        goto L52
    L252:
        r2 = -1;
        goto L52
    L41:
        if (r1.equals("response") == false) goto L253;
        r2 = 2;
        goto L52
    L253:
        r2 = -1;
        goto L52
    L45:
        if (r1.equals("spring") == false) goto L254;
        r2 = 1;
        goto L52
    L254:
        r2 = -1;
        goto L52
    L49:
        if (r1.equals("device") == false) goto L255;
        r2 = 0;
        goto L52
    L255:
        r2 = -1;
        goto L52
    L164:
        r14.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: d */
    public static C1956f m4032d(C1559A0 r7, ILogger r8) {
        r7.m3567f();
        C1956f r0 = new C1956f();
        ConcurrentHashMap r2 = null;
    L4:
        if (r7.m3564F() != EnumC2050b.NAME) goto L199;
        String r3 = r7.m3581y();
        r3.getClass();
        int r5 = 10;
        byte r6 = -1;
        switch(r3.hashCode()) {
            case -2076227591: goto L141;
            case -2012489734: goto L137;
            case -1981332476: goto L133;
            case -1969347631: goto L129;
            case -1608004830: goto L125;
            case -1439500848: goto L121;
            case -1410521534: goto L117;
            case -1281860764: goto L113;
            case -1097462182: goto L109;
            case -1012222381: goto L105;
            case -877252910: goto L101;
            case -619038223: goto L97;
            case -568274923: goto L93;
            case -417046774: goto L89;
            case -136523212: goto L85;
            case 3355: goto L81;
            case 3373707: goto L77;
            case 59142220: goto L73;
            case 93076189: goto L69;
            case 93997959: goto L65;
            case 104069929: goto L61;
            case 115746789: goto L57;
            case 244497903: goto L53;
            case 731866107: goto L49;
            case 746402966: goto L45;
            case 817830969: goto L41;
            case 823882553: goto L37;
            case 897428293: goto L33;
            case 1331465768: goto L29;
            case 1418777727: goto L25;
            case 1436115569: goto L21;
            case 1450613660: goto L17;
            case 1524159400: goto L13;
            case 1556284978: goto L9;
            default: goto L144;
        };
    L144:
        switch(r6) {
            case 0: goto L186;
            case 1: goto L183;
            case 2: goto L181;
            case 3: goto L180;
            case 4: goto L179;
            case 5: goto L178;
            case 6: goto L177;
            case 7: goto L176;
            case 8: goto L175;
            case 9: goto L174;
            case 10: goto L173;
            case 11: goto L172;
            case 12: goto L171;
            case 13: goto L170;
            case 14: goto L169;
            case 15: goto L168;
            case 16: goto L167;
            case 17: goto L166;
            case 18: goto L163;
            case 19: goto L162;
            case 20: goto L161;
            case 21: goto L160;
            case 22: goto L159;
            case 23: goto L158;
            case 24: goto L157;
            case 25: goto L156;
            case 26: goto L155;
            case 27: goto L154;
            case 28: goto L153;
            case 29: goto L152;
            case 30: goto L151;
            case 31: goto L150;
            case 32: goto L149;
            case 33: goto L148;
            default: goto L145;
        };
    L148:
        r0.f6924v = r7.m3576t();
        goto L4
    L149:
        r0.f6920r = r7.m3579w();
        goto L4
    L150:
        r0.f6922t = r7.m3579w();
        goto L4
    L151:
        r0.f6911i = r7.m3569l();
        goto L4
    L152:
        r0.f6915m = r7.m3579w();
        goto L4
    L153:
        r0.f6917o = r7.m3579w();
        goto L4
    L154:
        r0.f6919q = r7.m3579w();
        goto L4
    L155:
        r0.f6921s = r7.m3579w();
        goto L4
    L156:
        r0.f6923u = r7.m3576t();
        goto L4
    L157:
        r0.f6901H = r7.m3561C();
        goto L4
    L158:
        r0.f6896C = r7.m3561C();
        goto L4
    L159:
        r0.f6899F = r7.m3572p();
        goto L4
    L160:
        r0.f6900G = r7.m3561C();
        goto L4
    L161:
        r0.f6907e = r7.m3561C();
        goto L4
    L162:
        r0.f6905c = r7.m3561C();
        goto L4
    L163:
        List r32 = (List) r7.m3582z();
        if (r32 == null) goto L4;
        String[] r4 = new String[r32.size()];
        r32.toArray(r4);
        r0.f6909g = r4;
        goto L4
    L166:
        r0.f6918p = r7.m3569l();
        goto L4
    L167:
        r0.f6903a = r7.m3561C();
        goto L4
    L168:
        r0.f6894A = r7.m3561C();
        goto L4
    L169:
        r0.f6916n = r7.m3579w();
        goto L4
    L170:
        r0.f6926x = r7.m3576t();
        goto L4
    L171:
        r0.f6925w = r7.m3574r();
        goto L4
    L172:
        r0.f6908f = r7.m3561C();
        goto L4
    L173:
        r0.f6910h = r7.m3574r();
        goto L4
    L174:
        r0.f6912j = r7.m3569l();
        goto L4
    L175:
        r0.f6895B = r7.m3561C();
        goto L4
    L176:
        r0.f6906d = r7.m3561C();
        goto L4
    L177:
        r0.f6897D = r7.m3574r();
        goto L4
    L178:
        r0.f6913k = (EnumC1955e) r7.m3559A(r8, new C1850a(r5));
        goto L4
    L179:
        r0.f6898E = r7.m3576t();
        goto L4
    L180:
        r0.f6904b = r7.m3561C();
        goto L4
    L181:
        r0.f6914l = r7.m3569l();
        goto L4
    L183:
        if (r7.m3564F() != EnumC2050b.STRING) goto L4;
        r0.f6927y = r7.m3570m(r8);
        goto L4
    L186:
        switch(r7.f5580a) {
            case 0: goto L191;
            default: goto L187;
        };
    L187:
        String r33 = (String) r7.m3563E();
        if (r33 == null) goto L190;
        TimeZone r34 = TimeZone.getTimeZone(r33);
    L198:
        r0.f6928z = r34;
    L190:
        r34 = null;
        goto L198
    L191:
        C2049a r35 = (C2049a) r7.f5581b;
        if (r35.m4194C() != EnumC2050b.NULL) goto L201;
        r35.m4215y();
        goto L190
    L201:
        r34 = TimeZone.getTimeZone(r35.m4192A());     // Catch: Exception -> L196
    L196:
        e = move-exception;
        r8.mo3683r(EnumC1657a2.ERROR, "Error when deserializing TimeZone", e);
        goto L190
    L145:
        if (r2 != null) goto L147;
        r2 = new ConcurrentHashMap();
    L147:
        r7.m3562D(r8, r2, r3);
        goto L4
    L9:
        if (r3.equals("screen_height_pixels") == false) goto L144;
        r6 = 33;
        goto L144
    L13:
        if (r3.equals("free_storage") == false) goto L144;
        r6 = 32;
        goto L144
    L17:
        if (r3.equals("external_free_storage") == false) goto L144;
        r6 = 31;
        goto L144
    L21:
        if (r3.equals("charging") == false) goto L144;
        r6 = 30;
        goto L144
    L25:
        if (r3.equals("memory_size") == false) goto L144;
        r6 = 29;
        goto L144
    L29:
        if (r3.equals("usable_memory") == false) goto L144;
        r6 = 28;
        goto L144
    L33:
        if (r3.equals("storage_size") == false) goto L144;
        r6 = 27;
        goto L144
    L37:
        if (r3.equals("external_storage_size") == false) goto L144;
        r6 = 26;
        goto L144
    L41:
        if (r3.equals("screen_width_pixels") == false) goto L144;
        r6 = 25;
        goto L144
    L45:
        if (r3.equals("chipset") == false) goto L144;
        r6 = 24;
        goto L144
    L49:
        if (r3.equals("connection_type") == false) goto L144;
        r6 = 23;
        goto L144
    L53:
        if (r3.equals("processor_frequency") == false) goto L144;
        r6 = 22;
        goto L144
    L57:
        if (r3.equals("cpu_description") == false) goto L144;
        r6 = 21;
        goto L144
    L61:
        if (r3.equals("model") == false) goto L144;
        r6 = 20;
        goto L144
    L65:
        if (r3.equals("brand") == false) goto L144;
        r6 = 19;
        goto L144
    L69:
        if (r3.equals("archs") == false) goto L144;
        r6 = 18;
        goto L144
    L73:
        if (r3.equals("low_memory") == false) goto L144;
        r6 = 17;
        goto L144
    L77:
        if (r3.equals("name") == false) goto L144;
        r6 = 16;
        goto L144
    L81:
        if (r3.equals("id") == false) goto L144;
        r6 = 15;
        goto L144
    L85:
        if (r3.equals("free_memory") == false) goto L144;
        r6 = 14;
        goto L144
    L89:
        if (r3.equals("screen_dpi") == false) goto L144;
        r6 = 13;
        goto L144
    L93:
        if (r3.equals("screen_density") == false) goto L144;
        r6 = 12;
        goto L144
    L97:
        if (r3.equals("model_id") == false) goto L144;
        r6 = 11;
        goto L144
    L101:
        if (r3.equals("battery_level") == false) goto L144;
        r6 = 10;
        goto L144
    L105:
        if (r3.equals("online") == false) goto L144;
        r6 = 9;
        goto L144
    L109:
        if (r3.equals("locale") == false) goto L144;
        r6 = 8;
        goto L144
    L113:
        if (r3.equals("family") == false) goto L144;
        r6 = 7;
        goto L144
    L117:
        if (r3.equals("battery_temperature") == false) goto L144;
        r6 = 6;
        goto L144
    L121:
        if (r3.equals("orientation") == false) goto L144;
        r6 = 5;
        goto L144
    L125:
        if (r3.equals("processor_count") == false) goto L144;
        r6 = 4;
        goto L144
    L129:
        if (r3.equals("manufacturer") == false) goto L144;
        r6 = 3;
        goto L144
    L133:
        if (r3.equals("simulator") == false) goto L144;
        r6 = 2;
        goto L144
    L137:
        if (r3.equals("boot_time") == false) goto L144;
        r6 = 1;
        goto L144
    L141:
        if (r3.equals("timezone") == false) goto L144;
        r6 = 0;
        goto L144
    L199:
        r0.f6902I = r2;
        r7.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: e */
    public static C1957g m4033e(C1559A0 r11, ILogger r12) {
        r11.m3567f();
        String r0 = null;
        String r1 = null;
        String r2 = null;
        C1970t r3 = null;
        C1970t r4 = null;
        String r5 = null;
        HashMap r6 = null;
    L3:
        byte r9 = 0;
        if (r11.m3564F() != EnumC2050b.NAME) goto L41;
        String r7 = r11.m3581y();
        r7.getClass();
        switch(r7.hashCode()) {
            case -964729863: goto L29;
            case -454767501: goto L25;
            case 116079: goto L21;
            case 3373707: goto L17;
            case 947010237: goto L13;
            case 954925063: goto L9;
            default: goto L7;
        };
    L7:
        r9 = -1;
    L31:
        switch(r9) {
            case 0: goto L40;
            case 1: goto L39;
            case 2: goto L38;
            case 3: goto L37;
            case 4: goto L36;
            case 5: goto L35;
            default: goto L32;
        };
    L35:
        r0 = r11.m3561C();
        goto L3
    L36:
        r1 = r11.m3561C();
        goto L3
    L37:
        r2 = r11.m3561C();
        goto L3
    L38:
        r5 = r11.m3561C();
        goto L3
    L39:
        r4 = new C1970t(r11.m3560B());
        goto L3
    L40:
        r3 = new C1970t(r11.m3560B());
        goto L3
    L32:
        if (r6 != null) goto L34;
        r6 = new HashMap();
    L34:
        r11.m3562D(r12, r6, r7);
        goto L3
    L9:
        if (r7.equals("message") == false) goto L67;
        r9 = 5;
        goto L31
    L67:
        r9 = -1;
        goto L31
    L13:
        if (r7.equals("contact_email") == false) goto L68;
        r9 = 4;
        goto L31
    L68:
        r9 = -1;
        goto L31
    L17:
        if (r7.equals("name") == false) goto L69;
        r9 = 3;
        goto L31
    L69:
        r9 = -1;
        goto L31
    L21:
        if (r7.equals("url") == false) goto L70;
        r9 = 2;
        goto L31
    L70:
        r9 = -1;
        goto L31
    L25:
        if (r7.equals("replay_id") == false) goto L71;
        r9 = 1;
        goto L31
    L71:
        r9 = -1;
        goto L31
    L29:
        if (r7.equals("associated_event_id") == true) goto L31;
        r9 = -1;
        goto L31
    L41:
        r11.m3568i();
        if (r0 == null) goto L49;
        C1957g r112 = new C1957g();
        if (r0.length() <= 4096) goto L46;
        r112.f6929a = r0.substring(0, 4096);
    L47:
        r112.f6930b = r1;
        r112.f6931c = r2;
        r112.f6932d = r3;
        r112.f6933e = r4;
        r112.f6934f = r5;
        r112.f6935g = r6;
        return r112;
    L46:
        r112.f6929a = r0;
        goto L47
    L49:
        IllegalStateException r113 = new IllegalStateException("Missing required field \"message\"");
        r12.mo3683r(EnumC1657a2.ERROR, "Missing required field \"message\"", r113);
        throw r113;
    }

    /* JADX INFO: renamed from: f */
    public static C1959i m4034f(C1559A0 r5, ILogger r6) {
        r5.m3567f();
        C1959i r0 = new C1959i();
        ConcurrentHashMap r1 = null;
    L4:
        if (r5.m3564F() != EnumC2050b.NAME) goto L57;
        String r2 = r5.m3581y();
        r2.getClass();
        byte r4 = -1;
        switch(r2.hashCode()) {
            case -1421884745: goto L41;
            case -1085970574: goto L37;
            case -1009234244: goto L33;
            case 3355: goto L29;
            case 3373707: goto L25;
            case 59480866: goto L21;
            case 351608024: goto L17;
            case 967446079: goto L13;
            case 1418777727: goto L9;
            default: goto L44;
        };
    L44:
        switch(r4) {
            case 0: goto L56;
            case 1: goto L55;
            case 2: goto L54;
            case 3: goto L53;
            case 4: goto L52;
            case 5: goto L51;
            case 6: goto L50;
            case 7: goto L49;
            case 8: goto L48;
            default: goto L45;
        };
    L48:
        r0.f6944e = r5.m3576t();
        goto L4
    L49:
        r0.f6945f = r5.m3561C();
        goto L4
    L50:
        r0.f6947h = r5.m3561C();
        goto L4
    L51:
        r0.f6943d = r5.m3561C();
        goto L4
    L52:
        r0.f6940a = r5.m3561C();
        goto L4
    L53:
        r0.f6941b = r5.m3576t();
        goto L4
    L54:
        r0.f6946g = r5.m3569l();
        goto L4
    L55:
        r0.f6942c = r5.m3561C();
        goto L4
    L56:
        r0.f6948i = r5.m3561C();
        goto L4
    L45:
        if (r1 != null) goto L47;
        r1 = new ConcurrentHashMap();
    L47:
        r5.m3562D(r6, r1, r2);
        goto L4
    L9:
        if (r2.equals("memory_size") == false) goto L44;
        r4 = 8;
        goto L44
    L13:
        if (r2.equals("api_type") == false) goto L44;
        r4 = 7;
        goto L44
    L17:
        if (r2.equals("version") == false) goto L44;
        r4 = 6;
        goto L44
    L21:
        if (r2.equals("vendor_name") == false) goto L44;
        r4 = 5;
        goto L44
    L25:
        if (r2.equals("name") == false) goto L44;
        r4 = 4;
        goto L44
    L29:
        if (r2.equals("id") == false) goto L44;
        r4 = 3;
        goto L44
    L33:
        if (r2.equals("multi_threaded_rendering") == false) goto L44;
        r4 = 2;
        goto L44
    L37:
        if (r2.equals("vendor_id") == false) goto L44;
        r4 = 1;
        goto L44
    L41:
        if (r2.equals("npot_support") == false) goto L44;
        r4 = 0;
        goto L44
    L57:
        r0.f6949j = r1;
        r5.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: g */
    public static C1963m m4035g(C1559A0 r5, ILogger r6) {
        r5.m3567f();
        C1963m r0 = new C1963m();
        ConcurrentHashMap r1 = null;
    L4:
        if (r5.m3564F() != EnumC2050b.NAME) goto L42;
        String r2 = r5.m3581y();
        r2.getClass();
        byte r4 = -1;
        switch(r2.hashCode()) {
            case -925311743: goto L29;
            case -339173787: goto L25;
            case 3373707: goto L21;
            case 94094958: goto L17;
            case 351608024: goto L13;
            case 2015527638: goto L9;
            default: goto L32;
        };
    L32:
        switch(r4) {
            case 0: goto L41;
            case 1: goto L40;
            case 2: goto L39;
            case 3: goto L38;
            case 4: goto L37;
            case 5: goto L36;
            default: goto L33;
        };
    L36:
        r0.f6973e = r5.m3561C();
        goto L4
    L37:
        r0.f6970b = r5.m3561C();
        goto L4
    L38:
        r0.f6972d = r5.m3561C();
        goto L4
    L39:
        r0.f6969a = r5.m3561C();
        goto L4
    L40:
        r0.f6971c = r5.m3561C();
        goto L4
    L41:
        r0.f6974f = r5.m3569l();
        goto L4
    L33:
        if (r1 != null) goto L35;
        r1 = new ConcurrentHashMap();
    L35:
        r5.m3562D(r6, r1, r2);
        goto L4
    L9:
        if (r2.equals("kernel_version") == false) goto L32;
        r4 = 5;
        goto L32
    L13:
        if (r2.equals("version") == false) goto L32;
        r4 = 4;
        goto L32
    L17:
        if (r2.equals("build") == false) goto L32;
        r4 = 3;
        goto L32
    L21:
        if (r2.equals("name") == false) goto L32;
        r4 = 2;
        goto L32
    L25:
        if (r2.equals("raw_description") == false) goto L32;
        r4 = 1;
        goto L32
    L29:
        if (r2.equals("rooted") == false) goto L32;
        r4 = 0;
        goto L32
    L42:
        r0.f6975g = r1;
        r5.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: h */
    public static IllegalStateException m4036h(String r2, ILogger r3) {
        String r22 = AbstractC2374ph.m4814k("Missing required field \"", r2, "\"");
        IllegalStateException r0 = new IllegalStateException(r22);
        r3.mo3683r(EnumC1657a2.ERROR, r22, r0);
        return r0;
    }

    /* JADX INFO: renamed from: i */
    public static IllegalStateException m4037i(String r2, ILogger r3) {
        String r22 = AbstractC2374ph.m4814k("Missing required field \"", r2, "\"");
        IllegalStateException r0 = new IllegalStateException(r22);
        r3.mo3683r(EnumC1657a2.ERROR, r22, r0);
        return r0;
    }

    /* JADX INFO: renamed from: j */
    public static IllegalStateException m4038j(String r2, ILogger r3) {
        String r22 = AbstractC2374ph.m4814k("Missing required field \"", r2, "\"");
        IllegalStateException r0 = new IllegalStateException(r22);
        r3.mo3683r(EnumC1657a2.ERROR, r22, r0);
        return r0;
    }

    @Override // io.sentry.InterfaceC1978q0
    /* JADX INFO: renamed from: a */
    public final Object mo4039a(C1559A0 r38, ILogger r39) {
        int r6 = 12;
        int r7 = 14;
        int r5 = 7;
        int r9 = 3;
        int r10 = 1;
        switch(this.f6669a) {
            case 0: goto L953;
            case 1: goto L916;
            case 2: goto L898;
            case 3: goto L860;
            case 4: goto L859;
            case 5: goto L844;
            case 6: goto L843;
            case 7: goto L785;
            case 8: goto L771;
            case 9: goto L770;
            case 10: goto L768;
            case 11: goto L766;
            case 12: goto L738;
            case 13: goto L737;
            case 14: goto L718;
            case 15: goto L656;
            case 16: goto L627;
            case 17: goto L626;
            case 18: goto L552;
            case 19: goto L520;
            case 20: goto L477;
            case 21: goto L435;
            case 22: goto L434;
            case 23: goto L412;
            case 24: goto L385;
            case 25: goto L286;
            case 26: goto L169;
            case 27: goto L142;
            case 28: goto L78;
            default: goto L4;
        };
    L4:
        r38.m3567f();
        C1944A r3 = new C1944A(new ArrayList(), new HashMap(), new C1864d2(1, EnumC1946C.CUSTOM.apiName()));
        ConcurrentHashMap r4 = null;
    L6:
        if (r38.m3564F() != EnumC2050b.NAME) goto L76;
        String r52 = r38.m3581y();
        r52.getClass();
        switch(r52.hashCode()) {
            case -1526966919: goto L35;
            case -362243017: goto L31;
            case 3575610: goto L27;
            case 55126294: goto L23;
            case 109638249: goto L19;
            case 508716399: goto L15;
            case 2141246174: goto L11;
            default: goto L9;
        };
    L9:
        byte r62 = -1;
    L38:
        switch(r62) {
            case 0: goto L979;
            case 1: goto L66;
            case 2: goto L65;
            case 3: goto L975;
            case 4: goto L55;
            case 5: goto L45;
            case 6: goto L44;
            default: goto L40;
        };
    L975:
        Double r53 = r38.m3572p();     // Catch: NumberFormatException -> L62
        if (r53 == null) goto L6;
        r3.f6841r = r53;     // Catch: NumberFormatException -> L62
    L63:
        if (r38.m3570m(r39) == null) goto L6;
        r3.f6841r = Double.valueOf(r5.getTime() / 1000.0d);
        goto L6
    L979:
        Double r54 = r38.m3572p();     // Catch: NumberFormatException -> L73
        if (r54 == null) goto L6;
        r3.f6840q = r54;     // Catch: NumberFormatException -> L73
    L74:
        if (r38.m3570m(r39) == null) goto L6;
        r3.f6840q = Double.valueOf(r5.getTime() / 1000.0d);
        goto L6
    L44:
        r3.f6839p = r38.m3561C();
        goto L6
    L45:
        r38.m3567f();
        String r55 = null;
        AbstractMap r63 = null;
    L47:
        if (r38.m3564F() != EnumC2050b.NAME) goto L54;
        String r11 = r38.m3581y();
        r11.getClass();
        if (r11.equals("source") == false) goto L50;
        r55 = r38.m3561C();
        goto L47
    L50:
        if (r63 != null) goto L52;
        r63 = new ConcurrentHashMap();
    L52:
        r38.m3562D(r39, r63, r11);
        goto L47
    L54:
        C1864d2 r112 = new C1864d2(1, r55);
        r112.f6689c = r63;
        r38.m3568i();
        r3.f6844u = r112;
        goto L6
    L55:
        ArrayList r56 = r38.m3577u(r39, new C1850a(25));
        if (r56 == null) goto L6;
        r3.f6842s.addAll(r56);
        goto L6
    L65:
        r38.m3560B();
        goto L6
    L66:
        HashMap r57 = r38.m3580x(r39, new C1850a(r7));
        if (r57 == null) goto L6;
        r3.f6843t.putAll(r57);
        goto L6
    L40:
        if (AbstractC1856a.m4061g(r3, r52, r38, r39) == true) goto L6;
        if (r4 != null) goto L43;
        r4 = new ConcurrentHashMap();
    L43:
        r38.m3562D(r39, r4, r52);
        goto L6
    L11:
        if (r52.equals("transaction") == false) goto L1378;
        r62 = 6;
        goto L38
    L1378:
        r62 = -1;
        goto L38
    L15:
        if (r52.equals("transaction_info") == false) goto L1379;
        r62 = 5;
        goto L38
    L1379:
        r62 = -1;
        goto L38
    L19:
        if (r52.equals("spans") == false) goto L1380;
        r62 = 4;
        goto L38
    L1380:
        r62 = -1;
        goto L38
    L23:
        if (r52.equals("timestamp") == false) goto L1381;
        r62 = 3;
        goto L38
    L1381:
        r62 = -1;
        goto L38
    L27:
        if (r52.equals("type") == false) goto L1382;
        r62 = 2;
        goto L38
    L1382:
        r62 = -1;
        goto L38
    L31:
        if (r52.equals("measurements") == false) goto L1383;
        r62 = 1;
        goto L38
    L1383:
        r62 = -1;
        goto L38
    L35:
        if (r52.equals("start_timestamp") == false) goto L1384;
        r62 = 0;
        goto L38
    L1384:
        r62 = -1;
        goto L38
    L76:
        r3.f6845v = r4;
        r38.m3568i();
        return r3;
    L78:
        C1976z r32 = new C1976z();
        r38.m3567f();
        ConcurrentHashMap r42 = null;
    L80:
        if (r38.m3564F() != EnumC2050b.NAME) goto L140;
        String r72 = r38.m3581y();
        r72.getClass();
        switch(r72.hashCode()) {
            case -1339353468: goto L121;
            case -1165461084: goto L117;
            case -502917346: goto L113;
            case 3355: goto L109;
            case 3343801: goto L105;
            case 3373707: goto L101;
            case 109757585: goto L97;
            case 1025385094: goto L93;
            case 1126940025: goto L89;
            case 2055832509: goto L85;
            default: goto L83;
        };
    L83:
        byte r8 = -1;
    L124:
        switch(r8) {
            case 0: goto L139;
            case 1: goto L138;
            case 2: goto L135;
            case 3: goto L134;
            case 4: goto L133;
            case 5: goto L132;
            case 6: goto L131;
            case 7: goto L130;
            case 8: goto L129;
            case 9: goto L128;
            default: goto L125;
        };
    L128:
        r32.f7067i = (C1975y) r38.m3559A(r39, new C1850a(27));
        goto L80
    L129:
        r32.f7064f = r38.m3569l();
        goto L80
    L130:
        r32.f7063e = r38.m3569l();
        goto L80
    L131:
        r32.f7062d = r38.m3561C();
        goto L80
    L132:
        r32.f7061c = r38.m3561C();
        goto L80
    L133:
        r32.f7066h = r38.m3569l();
        goto L80
    L134:
        r32.f7059a = r38.m3579w();
        goto L80
    L135:
        HashMap r73 = r38.m3580x(r39, new C1865e(r6));
        if (r73 == null) goto L80;
        r32.f7068j = new HashMap(r73);
        goto L80
    L138:
        r32.f7060b = r38.m3576t();
        goto L80
    L139:
        r32.f7065g = r38.m3569l();
        goto L80
    L125:
        if (r42 != null) goto L127;
        r42 = new ConcurrentHashMap();
    L127:
        r38.m3562D(r39, r42, r72);
        goto L80
    L85:
        if (r72.equals("stacktrace") == false) goto L1385;
        r8 = 9;
        goto L124
    L1385:
        r8 = -1;
        goto L124
    L89:
        if (r72.equals("current") == false) goto L1386;
        r8 = 8;
        goto L124
    L1386:
        r8 = -1;
        goto L124
    L93:
        if (r72.equals("crashed") == false) goto L1387;
        r8 = 7;
        goto L124
    L1387:
        r8 = -1;
        goto L124
    L97:
        if (r72.equals("state") == false) goto L1388;
        r8 = 6;
        goto L124
    L1388:
        r8 = -1;
        goto L124
    L101:
        if (r72.equals("name") == false) goto L1389;
        r8 = 5;
        goto L124
    L1389:
        r8 = -1;
        goto L124
    L105:
        if (r72.equals("main") == false) goto L1390;
        r8 = 4;
        goto L124
    L1390:
        r8 = -1;
        goto L124
    L109:
        if (r72.equals("id") == false) goto L1391;
        r8 = 3;
        goto L124
    L1391:
        r8 = -1;
        goto L124
    L113:
        if (r72.equals("held_locks") == false) goto L1392;
        r8 = 2;
        goto L124
    L1392:
        r8 = -1;
        goto L124
    L117:
        if (r72.equals("priority") == false) goto L1393;
        r8 = 1;
        goto L124
    L1393:
        r8 = -1;
        goto L124
    L121:
        if (r72.equals("daemon") == false) goto L1394;
        r8 = 0;
        goto L124
    L1394:
        r8 = -1;
        goto L124
    L140:
        r32.f7069k = r42;
        r38.m3568i();
        return r32;
    L142:
        C1975y r33 = new C1975y();
        r38.m3567f();
        ConcurrentHashMap r43 = null;
    L144:
        if (r38.m3564F() != EnumC2050b.NAME) goto L167;
        String r58 = r38.m3581y();
        r58.getClass();
        switch(r58.hashCode()) {
            case -1266514778: goto L157;
            case 78226992: goto L153;
            case 284874180: goto L149;
            default: goto L147;
        };
    L147:
        byte r64 = -1;
    L160:
        switch(r64) {
            case 0: goto L166;
            case 1: goto L165;
            case 2: goto L164;
            default: goto L161;
        };
    L164:
        r33.f7057c = r38.m3569l();
        goto L144
    L165:
        r33.f7056b = AbstractC1856a.m4045A((Map) r38.m3582z());
        goto L144
    L166:
        r33.f7055a = r38.m3577u(r39, new C1850a(26));
        goto L144
    L161:
        if (r43 != null) goto L163;
        r43 = new ConcurrentHashMap();
    L163:
        r38.m3562D(r39, r43, r58);
        goto L144
    L149:
        if (r58.equals("snapshot") == false) goto L1395;
        r64 = 2;
        goto L160
    L1395:
        r64 = -1;
        goto L160
    L153:
        if (r58.equals("registers") == false) goto L1396;
        r64 = 1;
        goto L160
    L1396:
        r64 = -1;
        goto L160
    L157:
        if (r58.equals("frames") == false) goto L1397;
        r64 = 0;
        goto L160
    L1397:
        r64 = -1;
        goto L160
    L167:
        r33.f7058d = r43;
        r38.m3568i();
        return r33;
    L169:
        C1974x r34 = new C1974x();
        r38.m3567f();
        ConcurrentHashMap r44 = null;
    L171:
        if (r38.m3564F() != EnumC2050b.NAME) goto L284;
        String r82 = r38.m3581y();
        r82.getClass();
        switch(r82.hashCode()) {
            case -1641491184: goto L256;
            case -1443345323: goto L252;
            case -1184392185: goto L248;
            case -1113875953: goto L244;
            case -1102671691: goto L240;
            case -1068784020: goto L236;
            case -1052618729: goto L232;
            case -887523944: goto L228;
            case -807062458: goto L224;
            case -734768633: goto L220;
            case -330260936: goto L216;
            case 3327275: goto L212;
            case 3612204: goto L208;
            case 94842689: goto L204;
            case 410194178: goto L200;
            case 822688787: goto L196;
            case 868820273: goto L192;
            case 1116694660: goto L188;
            case 1380938712: goto L184;
            case 1713445842: goto L180;
            case 1874684019: goto L176;
            default: goto L174;
        };
    L174:
        byte r113 = -1;
    L259:
        switch(r113) {
            case 0: goto L283;
            case 1: goto L282;
            case 2: goto L281;
            case 3: goto L280;
            case 4: goto L279;
            case 5: goto L278;
            case 6: goto L277;
            case 7: goto L276;
            case 8: goto L275;
            case 9: goto L274;
            case 10: goto L273;
            case 11: goto L272;
            case 12: goto L271;
            case 13: goto L270;
            case 14: goto L269;
            case 15: goto L268;
            case 16: goto L267;
            case 17: goto L266;
            case 18: goto L265;
            case 19: goto L264;
            case 20: goto L263;
            default: goto L260;
        };
    L263:
        r34.f7046n = r38.m3561C();
        goto L171
    L264:
        r34.f7041i = r38.m3561C();
        goto L171
    L265:
        r34.f7037e = r38.m3561C();
        goto L171
    L266:
        r34.f7042j = r38.m3561C();
        goto L171
    L267:
        r34.f7050r = r38.m3561C();
        goto L171
    L268:
        r34.f7033a = (List) r38.m3582z();
        goto L171
    L269:
        r34.f7049q = r38.m3561C();
        goto L171
    L270:
        r34.f7040h = r38.m3576t();
        goto L171
    L271:
        r34.f7035c = (Map) r38.m3582z();
        goto L171
    L272:
        r34.f7054v = (C1828b2) r38.m3559A(r39, new C1865e(r6));
        goto L171
    L273:
        r34.f7048p = r38.m3561C();
        goto L171
    L274:
        r34.f7036d = r38.m3561C();
        goto L171
    L275:
        r34.f7044l = r38.m3561C();
        goto L171
    L276:
        r34.f7051s = r38.m3561C();
        goto L171
    L277:
        r34.f7045m = r38.m3569l();
        goto L171
    L278:
        r34.f7038f = r38.m3561C();
        goto L171
    L279:
        r34.f7039g = r38.m3576t();
        goto L171
    L280:
        r34.f7053u = r38.m3561C();
        goto L171
    L281:
        r34.f7043k = r38.m3569l();
        goto L171
    L282:
        r34.f7047o = r38.m3561C();
        goto L171
    L283:
        r34.f7034b = (List) r38.m3582z();
        goto L171
    L260:
        if (r44 != null) goto L262;
        r44 = new ConcurrentHashMap();
    L262:
        r38.m3562D(r39, r44, r82);
        goto L171
    L176:
        if (r82.equals("platform") == false) goto L1398;
        r113 = 20;
        goto L259
    L1398:
        r113 = -1;
        goto L259
    L180:
        if (r82.equals("abs_path") == false) goto L1399;
        r113 = 19;
        goto L259
    L1399:
        r113 = -1;
        goto L259
    L184:
        if (r82.equals("function") == false) goto L1400;
        r113 = 18;
        goto L259
    L1400:
        r113 = -1;
        goto L259
    L188:
        if (r82.equals("context_line") == false) goto L1401;
        r113 = 17;
        goto L259
    L1401:
        r113 = -1;
        goto L259
    L192:
        if (r82.equals("addr_mode") == false) goto L1402;
        r113 = 16;
        goto L259
    L1402:
        r113 = -1;
        goto L259
    L196:
        if (r82.equals("pre_context") == false) goto L1403;
        r113 = 15;
        goto L259
    L1403:
        r113 = -1;
        goto L259
    L200:
        if (r82.equals("instruction_addr") == false) goto L1404;
        r113 = 14;
        goto L259
    L1404:
        r113 = -1;
        goto L259
    L204:
        if (r82.equals("colno") == false) goto L1405;
        r113 = 13;
        goto L259
    L1405:
        r113 = -1;
        goto L259
    L208:
        if (r82.equals("vars") == false) goto L1406;
        r113 = 12;
        goto L259
    L1406:
        r113 = -1;
        goto L259
    L212:
        if (r82.equals("lock") == false) goto L1407;
        r113 = 11;
        goto L259
    L1407:
        r113 = -1;
        goto L259
    L216:
        if (r82.equals("symbol_addr") == false) goto L1408;
        r113 = 10;
        goto L259
    L1408:
        r113 = -1;
        goto L259
    L220:
        if (r82.equals("filename") == false) goto L1409;
        r113 = 9;
        goto L259
    L1409:
        r113 = -1;
        goto L259
    L224:
        if (r82.equals("package") == false) goto L1410;
        r113 = 8;
        goto L259
    L1410:
        r113 = -1;
        goto L259
    L228:
        if (r82.equals("symbol") == false) goto L1411;
        r113 = 7;
        goto L259
    L1411:
        r113 = -1;
        goto L259
    L232:
        if (r82.equals("native") == false) goto L1412;
        r113 = 6;
        goto L259
    L1412:
        r113 = -1;
        goto L259
    L236:
        if (r82.equals("module") == false) goto L1413;
        r113 = 5;
        goto L259
    L1413:
        r113 = -1;
        goto L259
    L240:
        if (r82.equals("lineno") == false) goto L1414;
        r113 = 4;
        goto L259
    L1414:
        r113 = -1;
        goto L259
    L244:
        if (r82.equals("raw_function") == false) goto L1415;
        r113 = 3;
        goto L259
    L1415:
        r113 = -1;
        goto L259
    L248:
        if (r82.equals("in_app") == false) goto L1416;
        r113 = 2;
        goto L259
    L1416:
        r113 = -1;
        goto L259
    L252:
        if (r82.equals("image_addr") == false) goto L1417;
        r113 = 1;
        goto L259
    L1417:
        r113 = -1;
        goto L259
    L256:
        if (r82.equals("post_context") == false) goto L1418;
        r113 = 0;
        goto L259
    L1418:
        r113 = -1;
        goto L259
    L284:
        r34.f7052t = r44;
        r38.m3568i();
        return r34;
    L286:
        r38.m3567f();
        ConcurrentHashMap r35 = null;
        Map r65 = null;
        HashMap r114 = null;
        Double r25 = null;
        Double r26 = null;
        C1970t r27 = null;
        C1601K2 r28 = null;
        C1601K2 r29 = null;
        String r30 = null;
        String r31 = null;
        EnumC1605L2 r322 = null;
        String r332 = null;
        Map r36 = null;
    L288:
        if (r38.m3564F() != EnumC2050b.NAME) goto L366;
        String r12 = r38.m3581y();
        r12.getClass();
        switch(r12.hashCode()) {
            case -2011840976: goto L337;
            case -1757797477: goto L333;
            case -1724546052: goto L329;
            case -1526966919: goto L325;
            case -1008619738: goto L321;
            case -892481550: goto L317;
            case -362243017: goto L313;
            case 3553: goto L309;
            case 3076010: goto L305;
            case 3552281: goto L301;
            case 55126294: goto L297;
            case 1270300245: goto L293;
            default: goto L291;
        };
    L291:
        byte r14 = -1;
    L340:
        switch(r14) {
            case 0: goto L365;
            case 1: goto L364;
            case 2: goto L363;
            case 3: goto L977;
            case 4: goto L356;
            case 5: goto L355;
            case 6: goto L354;
            case 7: goto L353;
            case 8: goto L352;
            case 9: goto L351;
            case 10: goto L981;
            case 11: goto L344;
            default: goto L341;
        };
    L977:
        r25 = r38.m3572p();     // Catch: NumberFormatException -> L359
    L360:
        if (r38.m3570m(r39) != null) goto L361;
        r25 = null;
        goto L288
    L361:
        r25 = Double.valueOf(r12.getTime() / 1000.0d);
        goto L288
    L981:
        r26 = r38.m3572p();     // Catch: NumberFormatException -> L347
    L348:
        if (r38.m3570m(r39) != null) goto L349;
        r26 = null;
        goto L288
    L349:
        r26 = Double.valueOf(r12.getTime() / 1000.0d);
        goto L288
    L344:
        r27 = new C1970t(r38.m3560B());
        goto L288
    L351:
        r65 = (Map) r38.m3582z();
        goto L288
    L352:
        r36 = (Map) r38.m3582z();
        goto L288
    L353:
        r30 = r38.m3561C();
        goto L288
    L354:
        r114 = r38.m3580x(r39, new C1850a(r7));
        goto L288
    L355:
        r322 = (EnumC1605L2) r38.m3559A(r39, new C1865e(22));
        goto L288
    L356:
        r332 = r38.m3561C();
        goto L288
    L363:
        r31 = r38.m3561C();
        goto L288
    L364:
        r29 = (C1601K2) r38.m3559A(r39, new C1865e(21));
        goto L288
    L365:
        r28 = new C1601K2(r38.m3560B());
        goto L288
    L341:
        if (r35 != null) goto L343;
        r35 = new ConcurrentHashMap();
    L343:
        r38.m3562D(r39, r35, r12);
        goto L288
    L293:
        if (r12.equals("trace_id") == false) goto L1419;
        r14 = 11;
        goto L340
    L1419:
        r14 = -1;
        goto L340
    L297:
        if (r12.equals("timestamp") == false) goto L1420;
        r14 = 10;
        goto L340
    L1420:
        r14 = -1;
        goto L340
    L301:
        if (r12.equals("tags") == false) goto L1421;
        r14 = 9;
        goto L340
    L1421:
        r14 = -1;
        goto L340
    L305:
        if (r12.equals("data") == false) goto L1422;
        r14 = 8;
        goto L340
    L1422:
        r14 = -1;
        goto L340
    L309:
        if (r12.equals("op") == false) goto L1423;
        r14 = 7;
        goto L340
    L1423:
        r14 = -1;
        goto L340
    L313:
        if (r12.equals("measurements") == false) goto L1424;
        r14 = 6;
        goto L340
    L1424:
        r14 = -1;
        goto L340
    L317:
        if (r12.equals("status") == false) goto L1425;
        r14 = 5;
        goto L340
    L1425:
        r14 = -1;
        goto L340
    L321:
        if (r12.equals("origin") == false) goto L1426;
        r14 = 4;
        goto L340
    L1426:
        r14 = -1;
        goto L340
    L325:
        if (r12.equals("start_timestamp") == false) goto L1427;
        r14 = 3;
        goto L340
    L1427:
        r14 = -1;
        goto L340
    L329:
        if (r12.equals("description") == false) goto L1428;
        r14 = 2;
        goto L340
    L1428:
        r14 = -1;
        goto L340
    L333:
        if (r12.equals("parent_span_id") == false) goto L1429;
        r14 = 1;
        goto L340
    L1429:
        r14 = -1;
        goto L340
    L337:
        if (r12.equals("span_id") == false) goto L1430;
        r14 = 0;
        goto L340
    L1430:
        r14 = -1;
        goto L340
    L366:
        if (r25 == null) goto L384;
        if (r27 == null) goto L382;
        if (r28 == null) goto L380;
        if (r30 == null) goto L378;
        if (r65 != null) goto L372;
        r65 = new HashMap();
    L372:
        Map r342 = r65;
        if (r114 != null) goto L375;
        r114 = new HashMap();
    L375:
        C1973w r24 = new C1973w(r25, r26, r27, r28, r29, r30, r31, r322, r332, r342, r114, r36);
        r24.f7032m = r35;
        r38.m3568i();
        return r24;
    L378:
        throw m4038j("op", r39);
    L380:
        throw m4038j("span_id", r39);
    L382:
        throw m4038j("trace_id", r39);
    L384:
        throw m4038j("start_timestamp", r39);
    L385:
        r38.m3567f();
        C1972v r37 = new C1972v();
        ConcurrentHashMap r45 = null;
    L387:
        if (r38.m3564F() != EnumC2050b.NAME) goto L410;
        String r59 = r38.m3581y();
        r59.getClass();
        switch(r59.hashCode()) {
            case -339173787: goto L400;
            case 3373707: goto L396;
            case 351608024: goto L392;
            default: goto L390;
        };
    L390:
        byte r66 = -1;
    L403:
        switch(r66) {
            case 0: goto L409;
            case 1: goto L408;
            case 2: goto L407;
            default: goto L404;
        };
    L407:
        r37.f7017b = r38.m3561C();
        goto L387
    L408:
        r37.f7016a = r38.m3561C();
        goto L387
    L409:
        r37.f7018c = r38.m3561C();
        goto L387
    L404:
        if (r45 != null) goto L406;
        r45 = new ConcurrentHashMap();
    L406:
        r38.m3562D(r39, r45, r59);
        goto L387
    L392:
        if (r59.equals("version") == false) goto L1431;
        r66 = 2;
        goto L403
    L1431:
        r66 = -1;
        goto L403
    L396:
        if (r59.equals("name") == false) goto L1432;
        r66 = 1;
        goto L403
    L1432:
        r66 = -1;
        goto L403
    L400:
        if (r59.equals("raw_description") == false) goto L1433;
        r66 = 0;
        goto L403
    L1433:
        r66 = -1;
        goto L403
    L410:
        r37.f7019d = r45;
        r38.m3568i();
        return r37;
    L412:
        r38.m3567f();
        String r310 = null;
        String r46 = null;
        HashMap r510 = null;
    L414:
        if (r38.m3564F() != EnumC2050b.NAME) goto L424;
        String r67 = r38.m3581y();
        r67.getClass();
        if (r67.equals("name") == false) goto L418;
        r310 = r38.m3560B();
        goto L414
    L418:
        if (r67.equals("version") == false) goto L419;
        r46 = r38.m3560B();
        goto L414
    L419:
        if (r510 != null) goto L421;
        r510 = new HashMap();
    L421:
        r38.m3562D(r39, r510, r67);
        goto L414
    L424:
        r38.m3568i();
        if (r310 == null) goto L431;
        if (r46 == null) goto L429;
        C1971u r0 = new C1971u(r310, r46);
        r0.f7015c = r510;
        return r0;
    L429:
        IllegalStateException r02 = new IllegalStateException("Missing required field \"version\"");
        r39.mo3683r(EnumC1657a2.ERROR, "Missing required field \"version\"", r02);
        throw r02;
    L431:
        IllegalStateException r03 = new IllegalStateException("Missing required field \"name\"");
        r39.mo3683r(EnumC1657a2.ERROR, "Missing required field \"name\"", r03);
        throw r03;
    L435:
        C1969s r311 = new C1969s();
        r38.m3567f();
        HashMap r47 = null;
    L437:
        if (r38.m3564F() != EnumC2050b.NAME) goto L475;
        String r511 = r38.m3581y();
        r511.getClass();
        switch(r511.hashCode()) {
            case -1562235024: goto L462;
            case -1068784020: goto L458;
            case 3575610: goto L454;
            case 111972721: goto L450;
            case 1225089881: goto L446;
            case 2055832509: goto L442;
            default: goto L440;
        };
    L440:
        byte r68 = -1;
    L465:
        switch(r68) {
            case 0: goto L474;
            case 1: goto L473;
            case 2: goto L472;
            case 3: goto L471;
            case 4: goto L470;
            case 5: goto L469;
            default: goto L466;
        };
    L469:
        r311.f7008e = (C1975y) r38.m3559A(r39, new C1850a(27));
        goto L437
    L470:
        r311.f7009f = (C1961k) r38.m3559A(r39, new C1850a(15));
        goto L437
    L471:
        r311.f7005b = r38.m3561C();
        goto L437
    L472:
        r311.f7004a = r38.m3561C();
        goto L437
    L473:
        r311.f7006c = r38.m3561C();
        goto L437
    L474:
        r311.f7007d = r38.m3579w();
        goto L437
    L466:
        if (r47 != null) goto L468;
        r47 = new HashMap();
    L468:
        r38.m3562D(r39, r47, r511);
        goto L437
    L442:
        if (r511.equals("stacktrace") == false) goto L1434;
        r68 = 5;
        goto L465
    L1434:
        r68 = -1;
        goto L465
    L446:
        if (r511.equals("mechanism") == false) goto L1435;
        r68 = 4;
        goto L465
    L1435:
        r68 = -1;
        goto L465
    L450:
        if (r511.equals("value") == false) goto L1436;
        r68 = 3;
        goto L465
    L1436:
        r68 = -1;
        goto L465
    L454:
        if (r511.equals("type") == false) goto L1437;
        r68 = 2;
        goto L465
    L1437:
        r68 = -1;
        goto L465
    L458:
        if (r511.equals("module") == false) goto L1438;
        r68 = 1;
        goto L465
    L1438:
        r68 = -1;
        goto L465
    L462:
        if (r511.equals("thread_id") == false) goto L1439;
        r68 = 0;
        goto L465
    L1439:
        r68 = -1;
        goto L465
    L475:
        r38.m3568i();
        r311.f7010g = r47;
        return r311;
    L477:
        ArrayList r312 = new ArrayList();
        ArrayList r48 = new ArrayList();
        r38.m3567f();
        String r512 = null;
        String r69 = null;
        HashMap r74 = null;
    L479:
        if (r38.m3564F() != EnumC2050b.NAME) goto L511;
        String r83 = r38.m3581y();
        r83.getClass();
        switch(r83.hashCode()) {
            case 3373707: goto L496;
            case 351608024: goto L492;
            case 750867693: goto L488;
            case 1487029535: goto L484;
            default: goto L482;
        };
    L482:
        byte r122 = -1;
    L499:
        switch(r122) {
            case 0: goto L510;
            case 1: goto L509;
            case 2: goto L506;
            case 3: goto L503;
            default: goto L500;
        };
    L503:
        List r84 = (List) r38.m3582z();
        if (r84 == null) goto L479;
        r48.addAll(r84);
        goto L479
    L506:
        ArrayList r85 = r38.m3577u(r39, new C1850a(23));
        if (r85 == null) goto L479;
        r312.addAll(r85);
        goto L479
    L509:
        r69 = r38.m3560B();
        goto L479
    L510:
        r512 = r38.m3560B();
        goto L479
    L500:
        if (r74 != null) goto L502;
        r74 = new HashMap();
    L502:
        r38.m3562D(r39, r74, r83);
        goto L479
    L484:
        if (r83.equals("integrations") == false) goto L1440;
        r122 = 3;
        goto L499
    L1440:
        r122 = -1;
        goto L499
    L488:
        if (r83.equals("packages") == false) goto L1441;
        r122 = 2;
        goto L499
    L1441:
        r122 = -1;
        goto L499
    L492:
        if (r83.equals("version") == false) goto L1442;
        r122 = 1;
        goto L499
    L1442:
        r122 = -1;
        goto L499
    L496:
        if (r83.equals("name") == false) goto L1443;
        r122 = 0;
        goto L499
    L1443:
        r122 = -1;
        goto L499
    L511:
        r38.m3568i();
        if (r512 == null) goto L518;
        if (r69 == null) goto L516;
        C1968r r04 = new C1968r(r512, r69);
        r04.f7001c = new CopyOnWriteArraySet(r312);
        r04.f7002d = new CopyOnWriteArraySet(r48);
        r04.f7003e = r74;
        return r04;
    L516:
        IllegalStateException r05 = new IllegalStateException("Missing required field \"version\"");
        r39.mo3683r(EnumC1657a2.ERROR, "Missing required field \"version\"", r05);
        throw r05;
    L518:
        IllegalStateException r06 = new IllegalStateException("Missing required field \"name\"");
        r39.mo3683r(EnumC1657a2.ERROR, "Missing required field \"name\"", r06);
        throw r06;
    L520:
        C1967q r313 = new C1967q();
        r38.m3567f();
        HashMap r49 = null;
    L522:
        if (r38.m3564F() != EnumC2050b.NAME) goto L550;
        String r513 = r38.m3581y();
        r513.getClass();
        switch(r513.hashCode()) {
            case 270207856: goto L539;
            case 696101379: goto L535;
            case 1111241618: goto L531;
            case 1111483790: goto L527;
            default: goto L525;
        };
    L525:
        byte r610 = -1;
    L542:
        switch(r610) {
            case 0: goto L549;
            case 1: goto L548;
            case 2: goto L547;
            case 3: goto L546;
            default: goto L543;
        };
    L546:
        r313.f6996c = r38.m3576t();
        goto L522
    L547:
        r313.f6995b = r38.m3576t();
        goto L522
    L548:
        r313.f6997d = r38.m3576t();
        goto L522
    L549:
        r313.f6994a = r38.m3561C();
        goto L522
    L543:
        if (r49 != null) goto L545;
        r49 = new HashMap();
    L545:
        r38.m3562D(r39, r49, r513);
        goto L522
    L527:
        if (r513.equals("version_minor") == false) goto L1444;
        r610 = 3;
        goto L542
    L1444:
        r610 = -1;
        goto L542
    L531:
        if (r513.equals("version_major") == false) goto L1445;
        r610 = 2;
        goto L542
    L1445:
        r610 = -1;
        goto L542
    L535:
        if (r513.equals("version_patchlevel") == false) goto L1446;
        r610 = 1;
        goto L542
    L1446:
        r610 = -1;
        goto L542
    L539:
        if (r513.equals("sdk_name") == false) goto L1447;
        r610 = 0;
        goto L542
    L1447:
        r610 = -1;
        goto L542
    L550:
        r38.m3568i();
        r313.f6998e = r49;
        return r313;
    L552:
        r38.m3567f();
        C1964n r314 = new C1964n();
        ConcurrentHashMap r611 = null;
    L554:
        if (r38.m3564F() != EnumC2050b.NAME) goto L623;
        String r75 = r38.m3581y();
        r75.getClass();
        switch(r75.hashCode()) {
            case -1650269616: goto L599;
            case -1077554975: goto L595;
            case 100589: goto L591;
            case 116079: goto L587;
            case 3076010: goto L583;
            case 106069776: goto L579;
            case 795307910: goto L575;
            case 952189583: goto L571;
            case 1252988030: goto L567;
            case 1595298664: goto L563;
            case 1980646230: goto L559;
            default: goto L557;
        };
    L557:
        byte r86 = -1;
    L602:
        switch(r86) {
            case 0: goto L622;
            case 1: goto L621;
            case 2: goto L618;
            case 3: goto L617;
            case 4: goto L616;
            case 5: goto L613;
            case 6: goto L610;
            case 7: goto L609;
            case 8: goto L608;
            case 9: goto L607;
            case 10: goto L606;
            default: goto L603;
        };
    L606:
        r314.f6986k = r38.m3561C();
        goto L554
    L607:
        r314.f6978c = r38.m3561C();
        goto L554
    L608:
        r314.f6983h = r38.m3579w();
        goto L554
    L609:
        r314.f6980e = r38.m3561C();
        goto L554
    L610:
        Map r76 = (Map) r38.m3582z();
        if (r76 == null) goto L554;
        r314.f6981f = AbstractC1856a.m4045A(r76);
        goto L554
    L613:
        Map r77 = (Map) r38.m3582z();
        if (r77 == null) goto L554;
        r314.f6984i = AbstractC1856a.m4045A(r77);
        goto L554
    L616:
        r314.f6979d = r38.m3582z();
        goto L554
    L617:
        r314.f6976a = r38.m3561C();
        goto L554
    L618:
        Map r78 = (Map) r38.m3582z();
        if (r78 == null) goto L554;
        r314.f6982g = AbstractC1856a.m4045A(r78);
        goto L554
    L621:
        r314.f6977b = r38.m3561C();
        goto L554
    L622:
        r314.f6985j = r38.m3561C();
        goto L554
    L603:
        if (r611 != null) goto L605;
        r611 = new ConcurrentHashMap();
    L605:
        r38.m3562D(r39, r611, r75);
        goto L554
    L559:
        if (r75.equals("api_target") == false) goto L1448;
        r86 = 10;
        goto L602
    L1448:
        r86 = -1;
        goto L602
    L563:
        if (r75.equals("query_string") == false) goto L1449;
        r86 = 9;
        goto L602
    L1449:
        r86 = -1;
        goto L602
    L567:
        if (r75.equals("body_size") == false) goto L1450;
        r86 = 8;
        goto L602
    L1450:
        r86 = -1;
        goto L602
    L571:
        if (r75.equals("cookies") == false) goto L1451;
        r86 = 7;
        goto L602
    L1451:
        r86 = -1;
        goto L602
    L575:
        if (r75.equals("headers") == false) goto L1452;
        r86 = 6;
        goto L602
    L1452:
        r86 = -1;
        goto L602
    L579:
        if (r75.equals("other") == false) goto L1453;
        r86 = 5;
        goto L602
    L1453:
        r86 = -1;
        goto L602
    L583:
        if (r75.equals("data") == false) goto L1454;
        r86 = 4;
        goto L602
    L1454:
        r86 = -1;
        goto L602
    L587:
        if (r75.equals("url") == false) goto L1455;
        r86 = 3;
        goto L602
    L1455:
        r86 = -1;
        goto L602
    L591:
        if (r75.equals("env") == false) goto L1456;
        r86 = 2;
        goto L602
    L1456:
        r86 = -1;
        goto L602
    L595:
        if (r75.equals("method") == false) goto L1457;
        r86 = 1;
        goto L602
    L1457:
        r86 = -1;
        goto L602
    L599:
        if (r75.equals("fragment") == false) goto L1458;
        r86 = 0;
        goto L602
    L1458:
        r86 = -1;
        goto L602
    L623:
        r314.f6987l = r611;
        r38.m3568i();
        return r314;
    L627:
        r38.m3567f();
        C1962l r315 = new C1962l();
        ConcurrentHashMap r410 = null;
    L629:
        if (r38.m3564F() != EnumC2050b.NAME) goto L654;
        String r514 = r38.m3581y();
        r514.getClass();
        switch(r514.hashCode()) {
            case -995427962: goto L642;
            case 954925063: goto L638;
            case 1811591356: goto L634;
            default: goto L632;
        };
    L632:
        byte r612 = -1;
    L645:
        switch(r612) {
            case 0: goto L651;
            case 1: goto L650;
            case 2: goto L649;
            default: goto L646;
        };
    L649:
        r315.f6965a = r38.m3561C();
        goto L629
    L650:
        r315.f6966b = r38.m3561C();
        goto L629
    L651:
        List r515 = (List) r38.m3582z();
        if (r515 == null) goto L629;
        r315.f6967c = r515;
        goto L629
    L646:
        if (r410 != null) goto L648;
        r410 = new ConcurrentHashMap();
    L648:
        r38.m3562D(r39, r410, r514);
        goto L629
    L634:
        if (r514.equals("formatted") == false) goto L1459;
        r612 = 2;
        goto L645
    L1459:
        r612 = -1;
        goto L645
    L638:
        if (r514.equals("message") == false) goto L1460;
        r612 = 1;
        goto L645
    L1460:
        r612 = -1;
        goto L645
    L642:
        if (r514.equals("params") == false) goto L1461;
        r612 = 0;
        goto L645
    L1461:
        r612 = -1;
        goto L645
    L654:
        r315.f6968d = r410;
        r38.m3568i();
        return r315;
    L656:
        C1961k r316 = new C1961k();
        r38.m3567f();
        HashMap r613 = null;
    L658:
        if (r38.m3564F() != EnumC2050b.NAME) goto L716;
        String r79 = r38.m3581y();
        r79.getClass();
        switch(r79.hashCode()) {
            case -1724546052: goto L699;
            case -268203253: goto L695;
            case 3076010: goto L691;
            case 3347973: goto L687;
            case 3575610: goto L683;
            case 692803388: goto L679;
            case 989128517: goto L675;
            case 1032012154: goto L671;
            case 1297152568: goto L667;
            case 2070327504: goto L663;
            default: goto L661;
        };
    L661:
        byte r87 = -1;
    L702:
        switch(r87) {
            case 0: goto L715;
            case 1: goto L714;
            case 2: goto L713;
            case 3: goto L712;
            case 4: goto L711;
            case 5: goto L710;
            case 6: goto L709;
            case 7: goto L708;
            case 8: goto L707;
            case 9: goto L706;
            default: goto L703;
        };
    L706:
        r316.f6962i = r38.m3576t();
        goto L658
    L707:
        r316.f6956c = r38.m3561C();
        goto L658
    L708:
        r316.f6963j = r38.m3569l();
        goto L658
    L709:
        r316.f6960g = r38.m3569l();
        goto L658
    L710:
        r316.f6957d = r38.m3569l();
        goto L658
    L711:
        r316.f6954a = r38.m3561C();
        goto L658
    L712:
        r316.f6958e = AbstractC1856a.m4045A((Map) r38.m3582z());
        goto L658
    L713:
        r316.f6959f = AbstractC1856a.m4045A((Map) r38.m3582z());
        goto L658
    L714:
        r316.f6961h = r38.m3576t();
        goto L658
    L715:
        r316.f6955b = r38.m3561C();
        goto L658
    L703:
        if (r613 != null) goto L705;
        r613 = new HashMap();
    L705:
        r38.m3562D(r39, r613, r79);
        goto L658
    L663:
        if (r79.equals("parent_id") == false) goto L1462;
        r87 = 9;
        goto L702
    L1462:
        r87 = -1;
        goto L702
    L667:
        if (r79.equals("help_link") == false) goto L1463;
        r87 = 8;
        goto L702
    L1463:
        r87 = -1;
        goto L702
    L671:
        if (r79.equals("is_exception_group") == false) goto L1464;
        r87 = 7;
        goto L702
    L1464:
        r87 = -1;
        goto L702
    L675:
        if (r79.equals("synthetic") == false) goto L1465;
        r87 = 6;
        goto L702
    L1465:
        r87 = -1;
        goto L702
    L679:
        if (r79.equals("handled") == false) goto L1466;
        r87 = 5;
        goto L702
    L1466:
        r87 = -1;
        goto L702
    L683:
        if (r79.equals("type") == false) goto L1467;
        r87 = 4;
        goto L702
    L1467:
        r87 = -1;
        goto L702
    L687:
        if (r79.equals("meta") == false) goto L1468;
        r87 = 3;
        goto L702
    L1468:
        r87 = -1;
        goto L702
    L691:
        if (r79.equals("data") == false) goto L1469;
        r87 = 2;
        goto L702
    L1469:
        r87 = -1;
        goto L702
    L695:
        if (r79.equals("exception_id") == false) goto L1470;
        r87 = 1;
        goto L702
    L1470:
        r87 = -1;
        goto L702
    L699:
        if (r79.equals("description") == false) goto L1471;
        r87 = 0;
        goto L702
    L1471:
        r87 = -1;
        goto L702
    L716:
        r38.m3568i();
        r316.f6964k = r613;
        return r316;
    L718:
        r38.m3567f();
        Number r317 = null;
        String r411 = null;
        AbstractMap r516 = null;
    L720:
        if (r38.m3564F() != EnumC2050b.NAME) goto L730;
        String r614 = r38.m3581y();
        r614.getClass();
        if (r614.equals("unit") == false) goto L724;
        r411 = r38.m3561C();
        goto L720
    L724:
        if (r614.equals("value") == false) goto L725;
        r317 = (Number) r38.m3582z();
        goto L720
    L725:
        if (r516 != null) goto L727;
        r516 = new ConcurrentHashMap();
    L727:
        r38.m3562D(r39, r516, r614);
        goto L720
    L730:
        r38.m3568i();
        if (r317 == null) goto L734;
        C1960j r07 = new C1960j(r317, r411);
        r07.f6953d = r516;
        return r07;
    L734:
        IllegalStateException r08 = new IllegalStateException("Missing required field \"value\"");
        r39.mo3683r(EnumC1657a2.ERROR, "Missing required field \"value\"", r08);
        throw r08;
    L738:
        r38.m3567f();
        C1958h r318 = new C1958h();
        ConcurrentHashMap r412 = null;
    L740:
        if (r38.m3564F() != EnumC2050b.NAME) goto L763;
        String r517 = r38.m3581y();
        r517.getClass();
        switch(r517.hashCode()) {
            case -934795532: goto L753;
            case 3053931: goto L749;
            case 1481071862: goto L745;
            default: goto L743;
        };
    L743:
        byte r615 = -1;
    L756:
        switch(r615) {
            case 0: goto L762;
            case 1: goto L761;
            case 2: goto L760;
            default: goto L757;
        };
    L760:
        r318.f6937b = r38.m3561C();
        goto L740
    L761:
        r318.f6936a = r38.m3561C();
        goto L740
    L762:
        r318.f6938c = r38.m3561C();
        goto L740
    L757:
        if (r412 != null) goto L759;
        r412 = new ConcurrentHashMap();
    L759:
        r38.m3562D(r39, r412, r517);
        goto L740
    L745:
        if (r517.equals("country_code") == false) goto L1472;
        r615 = 2;
        goto L756
    L1472:
        r615 = -1;
        goto L756
    L749:
        if (r517.equals("city") == false) goto L1473;
        r615 = 1;
        goto L756
    L1473:
        r615 = -1;
        goto L756
    L753:
        if (r517.equals("region") == false) goto L1474;
        r615 = 0;
        goto L756
    L1474:
        r615 = -1;
        goto L756
    L763:
        r318.f6939d = r412;
        r38.m3568i();
        return r318;
    L771:
        C1954d r319 = new C1954d();
        r38.m3567f();
        HashMap r413 = null;
    L773:
        if (r38.m3564F() != EnumC2050b.NAME) goto L783;
        String r616 = r38.m3581y();
        r616.getClass();
        if (r616.equals("images") == false) goto L777;
        r319.f6892b = r38.m3577u(r39, new C1850a(r5));
        goto L773
    L777:
        if (r616.equals("sdk_info") == false) goto L778;
        r319.f6891a = (C1967q) r38.m3559A(r39, new C1850a(19));
        goto L773
    L778:
        if (r413 != null) goto L780;
        r413 = new HashMap();
    L780:
        r38.m3562D(r39, r413, r616);
        goto L773
    L783:
        r38.m3568i();
        r319.f6893c = r413;
        return r319;
    L785:
        DebugImage r320 = new DebugImage();
        r38.m3567f();
        AbstractMap r414 = null;
    L787:
        if (r38.m3564F() != EnumC2050b.NAME) goto L840;
        String r617 = r38.m3581y();
        r617.getClass();
        switch(r617.hashCode()) {
            case -1840639000: goto L824;
            case -1443345323: goto L820;
            case -1442803611: goto L816;
            case -1127437170: goto L812;
            case 3002454: goto L808;
            case 3575610: goto L804;
            case 3601339: goto L800;
            case 547804807: goto L796;
            case 941842605: goto L792;
            default: goto L790;
        };
    L790:
        byte r710 = -1;
    L827:
        switch(r710) {
            case 0: goto L839;
            case 1: goto L838;
            case 2: goto L837;
            case 3: goto L836;
            case 4: goto L835;
            case 5: goto L834;
            case 6: goto L833;
            case 7: goto L832;
            case 8: goto L831;
            default: goto L828;
        };
    L831:
        DebugImage.access$402(r320, r38.m3561C());
        goto L787
    L832:
        DebugImage.access$202(r320, r38.m3561C());
        goto L787
    L833:
        DebugImage.access$002(r320, r38.m3561C());
        goto L787
    L834:
        DebugImage.access$102(r320, r38.m3561C());
        goto L787
    L835:
        DebugImage.access$802(r320, r38.m3561C());
        goto L787
    L836:
        DebugImage.access$502(r320, r38.m3561C());
        goto L787
    L837:
        DebugImage.access$702(r320, r38.m3579w());
        goto L787
    L838:
        DebugImage.access$602(r320, r38.m3561C());
        goto L787
    L839:
        DebugImage.access$302(r320, r38.m3561C());
        goto L787
    L828:
        if (r414 != null) goto L830;
        r414 = new HashMap();
    L830:
        r38.m3562D(r39, r414, r617);
        goto L787
    L792:
        if (r617.equals("code_id") == false) goto L1475;
        r710 = 8;
        goto L827
    L1475:
        r710 = -1;
        goto L827
    L796:
        if (r617.equals("debug_id") == false) goto L1476;
        r710 = 7;
        goto L827
    L1476:
        r710 = -1;
        goto L827
    L800:
        if (r617.equals("uuid") == false) goto L1477;
        r710 = 6;
        goto L827
    L1477:
        r710 = -1;
        goto L827
    L804:
        if (r617.equals("type") == false) goto L1478;
        r710 = 5;
        goto L827
    L1478:
        r710 = -1;
        goto L827
    L808:
        if (r617.equals("arch") == false) goto L1479;
        r710 = 4;
        goto L827
    L1479:
        r710 = -1;
        goto L827
    L812:
        if (r617.equals("code_file") == false) goto L1480;
        r710 = 3;
        goto L827
    L1480:
        r710 = -1;
        goto L827
    L816:
        if (r617.equals("image_size") == false) goto L1481;
        r710 = 2;
        goto L827
    L1481:
        r710 = -1;
        goto L827
    L820:
        if (r617.equals("image_addr") == false) goto L1482;
        r710 = 1;
        goto L827
    L1482:
        r710 = -1;
        goto L827
    L824:
        if (r617.equals("debug_file") == false) goto L1483;
        r710 = 0;
        goto L827
    L1483:
        r710 = -1;
        goto L827
    L840:
        r38.m3568i();
        r320.setUnknown(r414);
        return r320;
    L844:
        r38.m3567f();
        C1952b r321 = new C1952b();
        ConcurrentHashMap r415 = null;
    L846:
        if (r38.m3564F() != EnumC2050b.NAME) goto L856;
        String r518 = r38.m3581y();
        r518.getClass();
        if (r518.equals("name") == false) goto L850;
        r321.f6886a = r38.m3561C();
        goto L846
    L850:
        if (r518.equals("version") == false) goto L851;
        r321.f6887b = r38.m3561C();
        goto L846
    L851:
        if (r415 != null) goto L853;
        r415 = new ConcurrentHashMap();
    L853:
        r38.m3562D(r39, r415, r518);
        goto L846
    L856:
        r321.f6888c = r415;
        r38.m3568i();
        return r321;
    L860:
        r38.m3567f();
        C1943b r323 = new C1943b(0L, 0, 0);
        ConcurrentHashMap r416 = null;
    L862:
        if (r38.m3564F() != EnumC2050b.NAME) goto L896;
        String r519 = r38.m3581y();
        r519.getClass();
        switch(r519.hashCode()) {
            case -1709412534: goto L875;
            case 55126294: goto L871;
            case 111972721: goto L867;
            default: goto L865;
        };
    L865:
        byte r618 = -1;
    L878:
        switch(r618) {
            case 0: goto L893;
            case 1: goto L983;
            case 2: goto L882;
            default: goto L879;
        };
    L983:
        Double r520 = r38.m3572p();     // Catch: NumberFormatException -> L887
    L891:
        if (r520 == null) goto L862;
        r323.f6836b = r520.doubleValue();
    L888:
        if (r38.m3570m(r39) == null) goto L890;
        r520 = Double.valueOf(r5.getTime() / 1000.0d);
        goto L891
    L890:
        r520 = null;
        goto L891
    L882:
        Double r521 = r38.m3572p();
        if (r521 == null) goto L862;
        r323.f6838d = r521.doubleValue();
        goto L862
    L893:
        String r522 = r38.m3561C();
        if (r522 == null) goto L862;
        r323.f6837c = r522;
        goto L862
    L879:
        if (r416 != null) goto L881;
        r416 = new ConcurrentHashMap();
    L881:
        r38.m3562D(r39, r416, r519);
        goto L862
    L867:
        if (r519.equals("value") == false) goto L1484;
        r618 = 2;
        goto L878
    L1484:
        r618 = -1;
        goto L878
    L871:
        if (r519.equals("timestamp") == false) goto L1485;
        r618 = 1;
        goto L878
    L1485:
        r618 = -1;
        goto L878
    L875:
        if (r519.equals("elapsed_since_start_ns") == false) goto L1486;
        r618 = 0;
        goto L878
    L1486:
        r618 = -1;
        goto L878
    L896:
        r323.f6835a = r416;
        r38.m3568i();
        return r323;
    L898:
        r38.m3567f();
        C1942a r324 = new C1942a("unknown", new ArrayList());
        ConcurrentHashMap r417 = null;
    L900:
        if (r38.m3564F() != EnumC2050b.NAME) goto L914;
        String r523 = r38.m3581y();
        r523.getClass();
        if (r523.equals("values") == false) goto L904;
        ArrayList r524 = r38.m3577u(r39, new C1850a(r9));
        if (r524 == null) goto L900;
        r324.f6834c = r524;
        goto L900
    L904:
        if (r523.equals("unit") == false) goto L905;
        String r525 = r38.m3561C();
        if (r525 == null) goto L900;
        r324.f6833b = r525;
        goto L900
    L905:
        if (r417 != null) goto L907;
        r417 = new ConcurrentHashMap();
    L907:
        r38.m3562D(r39, r417, r523);
        goto L900
    L914:
        r324.f6832a = r417;
        r38.m3568i();
        return r324;
    L916:
        r38.m3567f();
        String r325 = null;
        String r418 = null;
        Long r526 = null;
        HashMap r619 = null;
    L918:
        if (r38.m3564F() != EnumC2050b.NAME) goto L941;
        String r711 = r38.m3581y();
        r711.getClass();
        switch(r711.hashCode()) {
            case -1285004149: goto L931;
            case -934964668: goto L927;
            case 50511102: goto L923;
            default: goto L921;
        };
    L921:
        byte r88 = -1;
    L934:
        switch(r88) {
            case 0: goto L940;
            case 1: goto L939;
            case 2: goto L938;
            default: goto L935;
        };
    L938:
        r418 = r38.m3561C();
        goto L918
    L939:
        r325 = r38.m3561C();
        goto L918
    L940:
        r526 = r38.m3579w();
        goto L918
    L935:
        if (r619 != null) goto L937;
        r619 = new HashMap();
    L937:
        r38.m3562D(r39, r619, r711);
        goto L918
    L923:
        if (r711.equals("category") == false) goto L1487;
        r88 = 2;
        goto L934
    L1487:
        r88 = -1;
        goto L934
    L927:
        if (r711.equals("reason") == false) goto L1488;
        r88 = 1;
        goto L934
    L1488:
        r88 = -1;
        goto L934
    L931:
        if (r711.equals("quantity") == false) goto L1489;
        r88 = 0;
        goto L934
    L1489:
        r88 = -1;
        goto L934
    L941:
        r38.m3568i();
        if (r325 == null) goto L952;
        if (r418 == null) goto L950;
        if (r526 == null) goto L948;
        C1854e r09 = new C1854e(r325, r418, r526);
        r09.f6678d = r619;
        return r09;
    L948:
        throw m4037i("quantity", r39);
    L950:
        throw m4037i("category", r39);
    L952:
        throw m4037i("reason", r39);
    L953:
        ArrayList r326 = new ArrayList();
        r38.m3567f();
        Date r419 = null;
        HashMap r527 = null;
    L955:
        if (r38.m3564F() != EnumC2050b.NAME) goto L965;
        String r620 = r38.m3581y();
        r620.getClass();
        if (r620.equals("discarded_events") == false) goto L959;
        r326.addAll(r38.m3577u(r39, new C1850a(r10)));
        goto L955
    L959:
        if (r620.equals("timestamp") == false) goto L960;
        r419 = r38.m3570m(r39);
        goto L955
    L960:
        if (r527 != null) goto L962;
        r527 = new HashMap();
    L962:
        r38.m3562D(r39, r527, r620);
        goto L955
    L965:
        r38.m3568i();
        if (r419 == null) goto L974;
        if (r326.isEmpty() == true) goto L972;
        C1851b r010 = new C1851b(r419, r326);
        r010.f6672c = r527;
        return r010;
    L972:
        throw m4036h("discarded_events", r39);
    L974:
        throw m4036h("timestamp", r39);
    L434:
        return new C1970t(r38.m3560B());
    L626:
        return m4035g(r38, r39);
    L737:
        return m4034f(r38, r39);
    L766:
        return m4033e(r38, r39);
    L768:
        return EnumC1955e.valueOf(r38.m3560B().toUpperCase(Locale.ROOT));
    L770:
        return m4032d(r38, r39);
    L843:
        return m4031c(r38, r39);
    L859:
        return m4030b(r38, r39);
    }
}
