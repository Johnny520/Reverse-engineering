package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.clientreport.C1850a;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1947D;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1960j;
import io.sentry.protocol.C1962l;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.rrweb.EnumC1987c;
import io.sentry.rrweb.EnumC1988d;
import io.sentry.util.AbstractC2038j;
import io.sentry.vendor.gson.stream.C2049a;
import io.sentry.vendor.gson.stream.EnumC2050b;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1865e implements InterfaceC1978q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6690a;

    public /* synthetic */ C1865e(int r1) {
        this.f6690a = r1;
    }

    /* JADX INFO: renamed from: b */
    public static C1589H2 m4088b(C1559A0 r13, ILogger r14) {
        r13.m3567f();
        C1970t r0 = null;
        C1601K2 r1 = null;
        String r2 = null;
        ConcurrentHashMap r3 = null;
        C1601K2 r4 = null;
        String r5 = null;
        EnumC1605L2 r6 = null;
        String r7 = null;
        ConcurrentHashMap r8 = null;
        Map r9 = null;
    L4:
        if (r13.m3564F() != EnumC2050b.NAME) goto L57;
        String r10 = r13.m3581y();
        r10.getClass();
        byte r12 = -1;
        switch(r10.hashCode()) {
            case -2011840976: goto L41;
            case -1757797477: goto L37;
            case -1724546052: goto L33;
            case -1008619738: goto L29;
            case -892481550: goto L25;
            case 3553: goto L21;
            case 3076010: goto L17;
            case 3552281: goto L13;
            case 1270300245: goto L9;
            default: goto L44;
        };
    L44:
        switch(r12) {
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
        r0 = new C1970t(r13.m3560B());
        goto L4
    L49:
        r8 = AbstractC1856a.m4045A((Map) r13.m3582z());
        goto L4
    L50:
        r9 = (Map) r13.m3582z();
        goto L4
    L51:
        r2 = r13.m3560B();
        goto L4
    L52:
        r6 = (EnumC1605L2) r13.m3559A(r14, new C1865e(22));
        goto L4
    L53:
        r7 = r13.m3560B();
        goto L4
    L54:
        r5 = r13.m3560B();
        goto L4
    L55:
        r4 = (C1601K2) r13.m3559A(r14, new C1865e(21));
        goto L4
    L56:
        r1 = new C1601K2(r13.m3560B());
        goto L4
    L45:
        if (r3 != null) goto L47;
        r3 = new ConcurrentHashMap();
    L47:
        r13.m3562D(r14, r3, r10);
        goto L4
    L9:
        if (r10.equals("trace_id") == false) goto L44;
        r12 = 8;
        goto L44
    L13:
        if (r10.equals("tags") == false) goto L44;
        r12 = 7;
        goto L44
    L17:
        if (r10.equals("data") == false) goto L44;
        r12 = 6;
        goto L44
    L21:
        if (r10.equals("op") == false) goto L44;
        r12 = 5;
        goto L44
    L25:
        if (r10.equals("status") == false) goto L44;
        r12 = 4;
        goto L44
    L29:
        if (r10.equals("origin") == false) goto L44;
        r12 = 3;
        goto L44
    L33:
        if (r10.equals("description") == false) goto L44;
        r12 = 2;
        goto L44
    L37:
        if (r10.equals("parent_span_id") == false) goto L44;
        r12 = 1;
        goto L44
    L41:
        if (r10.equals("span_id") == false) goto L44;
        r12 = 0;
        goto L44
    L57:
        if (r0 == null) goto L70;
        if (r1 == null) goto L68;
        if (r2 != null) goto L61;
        r2 = "";
    L61:
        C1589H2 r142 = new C1589H2(r0, r1, r2, r4);
        r142.f5743f = r5;
        r142.f5744g = r6;
        r142.f5746i = r7;
        if (r8 == null) goto L64;
        r142.f5745h = r8;
    L64:
        if (r9 == null) goto L66;
        r142.f5747j = r9;
    L66:
        r142.f5748k = r3;
        r13.m3568i();
        return r142;
    L68:
        IllegalStateException r132 = new IllegalStateException("Missing required field \"span_id\"");
        r14.mo3683r(EnumC1657a2.ERROR, "Missing required field \"span_id\"", r132);
        throw r132;
    L70:
        IllegalStateException r133 = new IllegalStateException("Missing required field \"trace_id\"");
        r14.mo3683r(EnumC1657a2.ERROR, "Missing required field \"trace_id\"", r133);
        throw r133;
    }

    /* JADX INFO: renamed from: c */
    private final Object m4089c(C1559A0 r13, ILogger r14) {
        r13.m3567f();
        Date r0 = AbstractC1856a.m4067m();
        ConcurrentHashMap r1 = new ConcurrentHashMap();
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        EnumC1657a2 r6 = null;
        ConcurrentHashMap r7 = null;
    L4:
        if (r13.m3564F() != EnumC2050b.NAME) goto L54;
        String r8 = r13.m3581y();
        r8.getClass();
        byte r11 = -1;
        switch(r8.hashCode()) {
            case -1008619738: goto L33;
            case 3076010: goto L29;
            case 3575610: goto L25;
            case 50511102: goto L21;
            case 55126294: goto L17;
            case 102865796: goto L13;
            case 954925063: goto L9;
            default: goto L36;
        };
    L36:
        switch(r11) {
            case 0: goto L53;
            case 1: goto L50;
            case 2: goto L49;
            case 3: goto L48;
            case 4: goto L45;
            case 5: goto L56;
            case 6: goto L40;
            default: goto L37;
        };
    L56:
        r6 = EnumC1657a2.valueOf(r13.m3560B().toUpperCase(Locale.ROOT));     // Catch: Exception -> L43
    L43:
        e = move-exception;
        r14.mo3682n(EnumC1657a2.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
        goto L4
    L40:
        r2 = r13.m3561C();
        goto L4
    L45:
        Date r82 = r13.m3570m(r14);
        if (r82 == null) goto L4;
        r0 = r82;
        goto L4
    L48:
        r4 = r13.m3561C();
        goto L4
    L49:
        r3 = r13.m3561C();
        goto L4
    L50:
        ConcurrentHashMap r83 = AbstractC1856a.m4045A((Map) r13.m3582z());
        if (r83 == null) goto L4;
        r1 = r83;
        goto L4
    L53:
        r5 = r13.m3561C();
        goto L4
    L37:
        if (r7 != null) goto L39;
        r7 = new ConcurrentHashMap();
    L39:
        r13.m3562D(r14, r7, r8);
        goto L4
    L9:
        if (r8.equals("message") == false) goto L36;
        r11 = 6;
        goto L36
    L13:
        if (r8.equals("level") == false) goto L36;
        r11 = 5;
        goto L36
    L17:
        if (r8.equals("timestamp") == false) goto L36;
        r11 = 4;
        goto L36
    L21:
        if (r8.equals("category") == false) goto L36;
        r11 = 3;
        goto L36
    L25:
        if (r8.equals("type") == false) goto L36;
        r11 = 2;
        goto L36
    L29:
        if (r8.equals("data") == false) goto L36;
        r11 = 1;
        goto L36
    L33:
        if (r8.equals("origin") == false) goto L36;
        r11 = 0;
        goto L36
    L54:
        C1871f r142 = new C1871f(r0);
        r142.f6711d = r2;
        r142.f6712e = r3;
        r142.f6713f = r1;
        r142.f6714g = r4;
        r142.f6715h = r5;
        r142.f6716i = r6;
        r142.f6717j = r7;
        r13.m3568i();
        return r142;
    }

    /* JADX INFO: renamed from: d */
    public static IllegalStateException m4090d(String r2, ILogger r3) {
        String r22 = AbstractC2374ph.m4814k("Missing required field \"", r2, "\"");
        IllegalStateException r0 = new IllegalStateException(r22);
        r3.mo3683r(EnumC1657a2.ERROR, r22, r0);
        return r0;
    }

    /* JADX INFO: renamed from: e */
    public static IllegalStateException m4091e(String r2, ILogger r3) {
        String r22 = AbstractC2374ph.m4814k("Missing required field \"", r2, "\"");
        IllegalStateException r0 = new IllegalStateException(r22);
        r3.mo3683r(EnumC1657a2.ERROR, r22, r0);
        return r0;
    }

    @Override // io.sentry.InterfaceC1978q0
    /* JADX INFO: renamed from: a */
    public final Object mo4039a(C1559A0 r47, ILogger r48) {
        int r4 = 14;
        int r11 = 10;
        switch(this.f6690a) {
            case 0: goto L1197;
            case 1: goto L1103;
            case 2: goto L1090;
            case 3: goto L896;
            case 4: goto L835;
            case 5: goto L763;
            case 6: goto L665;
            case 7: goto L633;
            case 8: goto L583;
            case 9: goto L519;
            case 10: goto L518;
            case 11: goto L516;
            case 12: goto L478;
            case 13: goto L423;
            case 14: goto L399;
            case 15: goto L384;
            case 16: goto L383;
            case 17: goto L313;
            case 18: goto L312;
            case 19: goto L114;
            case 20: goto L113;
            case 21: goto L111;
            case 22: goto L109;
            case 23: goto L40;
            default: goto L4;
        };
    L4:
        r47.m3567f();
        C1970t r3 = null;
        String r42 = null;
        String r7 = null;
        String r8 = null;
        HashMap r9 = null;
    L6:
        if (r47.m3564F() != EnumC2050b.NAME) goto L34;
        String r10 = r47.m3581y();
        r10.getClass();
        switch(r10.hashCode()) {
            case -602415628: goto L23;
            case 3373707: goto L19;
            case 96619420: goto L15;
            case 278118624: goto L11;
            default: goto L9;
        };
    L9:
        byte r112 = -1;
    L26:
        switch(r112) {
            case 0: goto L33;
            case 1: goto L32;
            case 2: goto L31;
            case 3: goto L30;
            default: goto L27;
        };
    L30:
        r3 = new C1970t(r47.m3560B());
        goto L6
    L31:
        r7 = r47.m3561C();
        goto L6
    L32:
        r42 = r47.m3561C();
        goto L6
    L33:
        r8 = r47.m3561C();
        goto L6
    L27:
        if (r9 != null) goto L29;
        r9 = new HashMap();
    L29:
        r47.m3562D(r48, r9, r10);
        goto L6
    L11:
        if (r10.equals("event_id") == false) goto L1629;
        r112 = 3;
        goto L26
    L1629:
        r112 = -1;
        goto L26
    L15:
        if (r10.equals("email") == false) goto L1630;
        r112 = 2;
        goto L26
    L1630:
        r112 = -1;
        goto L26
    L19:
        if (r10.equals("name") == false) goto L1631;
        r112 = 1;
        goto L26
    L1631:
        r112 = -1;
        goto L26
    L23:
        if (r10.equals("comments") == false) goto L1632;
        r112 = 0;
        goto L26
    L1632:
        r112 = -1;
        goto L26
    L34:
        r47.m3568i();
        if (r3 == null) goto L38;
        C1632S2 r0 = new C1632S2(r3, r42, r7, r8);
        r0.f5863e = r9;
        return r0;
    L38:
        IllegalStateException r02 = new IllegalStateException("Missing required field \"event_id\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"event_id\"", r02);
        throw r02;
    L40:
        r47.m3567f();
        ConcurrentHashMap r1 = null;
        String r32 = null;
        C1970t r6 = null;
        String r92 = null;
        String r12 = null;
        String r13 = null;
        C1970t r14 = null;
        String r15 = null;
        String r18 = null;
        String r19 = null;
        String r21 = null;
    L42:
        if (r47.m3564F() != EnumC2050b.NAME) goto L100;
        String r5 = r47.m3581y();
        r5.getClass();
        switch(r5.hashCode()) {
            case -454767501: goto L83;
            case -147132913: goto L79;
            case -85904877: goto L75;
            case 153192858: goto L71;
            case 153193045: goto L67;
            case 1090594823: goto L63;
            case 1270300245: goto L59;
            case 1864843258: goto L55;
            case 1904812937: goto L51;
            case 2141246174: goto L47;
            default: goto L45;
        };
    L45:
        byte r113 = -1;
    L86:
        switch(r113) {
            case 0: goto L99;
            case 1: goto L98;
            case 2: goto L97;
            case 3: goto L96;
            case 4: goto L95;
            case 5: goto L94;
            case 6: goto L93;
            case 7: goto L92;
            case 8: goto L91;
            case 9: goto L90;
            default: goto L87;
        };
    L90:
        r18 = r47.m3561C();
        goto L42
    L91:
        r21 = r47.m3560B();
        goto L42
    L92:
        r13 = r47.m3561C();
        goto L42
    L93:
        r6 = new C1970t(r47.m3560B());
        goto L42
    L94:
        r32 = r47.m3561C();
        goto L42
    L95:
        r12 = r47.m3561C();
        goto L42
    L96:
        r15 = r47.m3561C();
        goto L42
    L97:
        r92 = r47.m3561C();
        goto L42
    L98:
        r19 = r47.m3561C();
        goto L42
    L99:
        r14 = new C1970t(r47.m3560B());
        goto L42
    L87:
        if (r1 != null) goto L89;
        r1 = new ConcurrentHashMap();
    L89:
        r47.m3562D(r48, r1, r5);
        goto L42
    L47:
        if (r5.equals("transaction") == false) goto L1633;
        r113 = 9;
        goto L86
    L1633:
        r113 = -1;
        goto L86
    L51:
        if (r5.equals("public_key") == false) goto L1634;
        r113 = 8;
        goto L86
    L1634:
        r113 = -1;
        goto L86
    L55:
        if (r5.equals("sampled") == false) goto L1635;
        r113 = 7;
        goto L86
    L1635:
        r113 = -1;
        goto L86
    L59:
        if (r5.equals("trace_id") == false) goto L1636;
        r113 = 6;
        goto L86
    L1636:
        r113 = -1;
        goto L86
    L63:
        if (r5.equals(BuildConfig.BUILD_TYPE) == false) goto L1637;
        r113 = 5;
        goto L86
    L1637:
        r113 = -1;
        goto L86
    L67:
        if (r5.equals("sample_rate") == false) goto L1638;
        r113 = 4;
        goto L86
    L1638:
        r113 = -1;
        goto L86
    L71:
        if (r5.equals("sample_rand") == false) goto L1639;
        r113 = 3;
        goto L86
    L1639:
        r113 = -1;
        goto L86
    L75:
        if (r5.equals("environment") == false) goto L1640;
        r113 = 2;
        goto L86
    L1640:
        r113 = -1;
        goto L86
    L79:
        if (r5.equals("user_id") == false) goto L1641;
        r113 = 1;
        goto L86
    L1641:
        r113 = -1;
        goto L86
    L83:
        if (r5.equals("replay_id") == false) goto L1642;
        r113 = 0;
        goto L86
    L1642:
        r113 = -1;
        goto L86
    L100:
        if (r6 == null) goto L107;
        if (r21 == null) goto L105;
        String r72 = r21;
        C1613N2 r52 = new C1613N2(r6, r72, r32, r92, r19, r18, r12, r13, r14, r15);
        r52.f5811k = r1;
        r47.m3568i();
        return r52;
    L105:
        throw m4091e("public_key", r48);
    L107:
        throw m4091e("trace_id", r48);
    L114:
        int r43 = 3;
        r47.m3567f();
        Integer r53 = null;
        ConcurrentHashMap r62 = null;
        EnumC1577E2 r27 = null;
        Date r28 = null;
        Date r29 = null;
        String r31 = null;
        String r322 = null;
        Boolean r33 = null;
        Long r34 = null;
        Double r35 = null;
        String r36 = null;
        String r37 = null;
        String r38 = null;
        String r39 = null;
        String r40 = null;
    L116:
        if (r47.m3564F() != EnumC2050b.NAME) goto L297;
        String r93 = r47.m3581y();
        r93.getClass();
        switch(r93.hashCode()) {
            case -1992012396: goto L161;
            case -1897185151: goto L157;
            case -1294635157: goto L153;
            case -892481550: goto L149;
            case 99455: goto L145;
            case 113759: goto L141;
            case 113870: goto L137;
            case 3237136: goto L133;
            case 55126294: goto L129;
            case 93152418: goto L125;
            case 213717026: goto L121;
            default: goto L119;
        };
    L119:
        int r102 = -1;
    L164:
        switch(r102) {
            case 0: goto L295;
            case 1: goto L294;
            case 2: goto L293;
            case 3: goto L290;
            case 4: goto L289;
            case 5: goto L288;
            case 6: goto L280;
            case 7: goto L279;
            case 8: goto L278;
            case 9: goto L170;
            case 10: goto L169;
            default: goto L165;
        };
    L165:
        if (r62 != null) goto L167;
        r62 = new ConcurrentHashMap();
    L167:
        r47.m3562D(r48, r62, r93);
    L296:
        r43 = 3;
        goto L116
    L169:
        r40 = r47.m3561C();
        goto L296
    L170:
        r47.m3567f();
    L172:
        if (r47.m3564F() != EnumC2050b.NAME) goto L277;
        String r94 = r47.m3581y();
        r94.getClass();
        switch(r94.hashCode()) {
            case -85904877: goto L189;
            case 1090594823: goto L185;
            case 1480014044: goto L181;
            case 1917799825: goto L177;
            default: goto L175;
        };
    L175:
        int r95 = -1;
    L192:
        switch(r95) {
            case 0: goto L275;
            case 1: goto L274;
            case 2: goto L273;
            case 3: goto L272;
            default: goto L194;
        };
    L272:
        r37 = r47.m3561C();
    L276:
        r43 = 3;
        goto L172
    L273:
        r36 = r47.m3561C();
        goto L276
    L274:
        r39 = r47.m3561C();
        goto L276
    L275:
        r38 = r47.m3561C();
        goto L276
    L194:
        switch(r47.f5580a) {
            case 0: goto L196;
            default: goto L276;
        };
    L196:
        C2049a r96 = (C2049a) r47.f5581b;
        int r103 = 0;
    L197:
        int r114 = r96.f7254h;
        if (r114 != 0) goto L200;
        r114 = r96.m4203l();
    L200:
        if (r114 != r43) goto L205;
        int r132 = 1;
        r96.m4195D(1);
    L202:
        r103 = r103 + 1;
    L203:
        int r44 = 0;
    L267:
        r96.f7254h = r44;
        if (r103 == 0) goto L269;
        r43 = 3;
        goto L197
    L269:
        int[] r104 = r96.f7261o;
        int r115 = r96.f7259m - r132;
        r104[r115] = r104[r115] + r132;
        r96.f7260n[r115] = "null";
        goto L276
    L205:
        r132 = 1;
        if (r114 != 1) goto L209;
        r96.m4195D(r43);
        goto L202
    L209:
        if (r114 != 4) goto L212;
        r96.f7259m--;
        r103 = r103 - 1;
        goto L203
    L212:
        if (r114 != 2) goto L214;
        r96.f7259m--;
        r103 = r103 - 1;
        r44 = 0;
        r132 = 1;
        goto L267
    L214:
        char r133 = '\f';
        if (r114 == 14) goto L233;
        if (r114 == 10) goto L233;
        if (r114 == 8) goto L232;
        if (r114 == 12) goto L232;
        if (r114 != 9) goto L225;
    L231:
        r96.m4197F('\"');
    L230:
        r132 = 1;
    L266:
        r44 = 0;
        goto L267
    L225:
        if (r114 == 13) goto L231;
        if (r114 != 16) goto L230;
        r96.f7250d += r96.f7256j;
    L232:
        r96.m4197F('\'');
    L233:
        int r116 = 0;
    L234:
        int r152 = r96.f7250d + r116;
        if (r152 >= r96.f7251e) goto L264;
        char r45 = r96.f7249c[r152];
        if (r45 == '\t') goto L263;
        if (r45 == '\n') goto L263;
        if (r45 == r133) goto L263;
        if (r45 == '\r') goto L263;
        if (r45 == ' ') goto L263;
        if (r45 == '#') goto L262;
        if (r45 == ',') goto L263;
        if (r45 == '/') goto L262;
        if (r45 == '=') goto L262;
        if (r45 == '{') goto L263;
        if (r45 == '}') goto L263;
        if (r45 == ':') goto L263;
        if (r45 == ';') goto L262;
        switch(r45) {
            case 91: goto L263;
            case 92: goto L262;
            case 93: goto L263;
            default: goto L261;
        };
    L261:
        r116 = r116 + 1;
        r133 = '\f';
    L262:
        r96.m4202i();
    L263:
        r96.f7250d += r116;
        r132 = 1;
        goto L266
    L264:
        r96.f7250d = r152;
        r132 = 1;
        if (r96.m4206p(1) == false) goto L266;
        r133 = '\f';
        goto L233
    L177:
        if (r94.equals("user_agent") == false) goto L1654;
        r95 = r43;
        goto L192
    L1654:
        r95 = -1;
        goto L192
    L181:
        if (r94.equals("ip_address") == false) goto L1655;
        r95 = 2;
        goto L192
    L1655:
        r95 = -1;
        goto L192
    L185:
        if (r94.equals(BuildConfig.BUILD_TYPE) == false) goto L1656;
        r95 = 1;
        goto L192
    L1656:
        r95 = -1;
        goto L192
    L189:
        if (r94.equals("environment") == false) goto L1657;
        r95 = 0;
        goto L192
    L1657:
        r95 = -1;
        goto L192
    L277:
        r47.m3568i();
        goto L296
    L278:
        r29 = r47.m3570m(r48);
        goto L296
    L279:
        r33 = r47.m3569l();
        goto L296
    L280:
        String r97 = r47.m3561C();
        if (r97 != null) goto L283;
    L287:
        r48.mo3680e(EnumC1657a2.ERROR, "%s sid is not valid.", new Object[]{r97});
        goto L296
    L283:
        if (r97.length() != 36) goto L285;
    L286:
        r322 = r97;
        goto L296
    L285:
        if (r97.length() != 32) goto L287;
    L288:
        r34 = r47.m3579w();
        goto L296
    L289:
        r31 = r47.m3561C();
        goto L296
    L290:
        String r98 = AbstractC2038j.m4182a(r47.m3561C());
        if (r98 == null) goto L296;
        r27 = EnumC1577E2.valueOf(r98);
        goto L296
    L293:
        r53 = r47.m3576t();
        goto L296
    L294:
        r28 = r47.m3570m(r48);
        goto L296
    L295:
        r35 = r47.m3572p();
        goto L296
    L121:
        if (r93.equals("abnormal_mechanism") == false) goto L1643;
        r102 = 10;
        goto L164
    L1643:
        r102 = -1;
        goto L164
    L125:
        if (r93.equals("attrs") == false) goto L1644;
        r102 = 9;
        goto L164
    L1644:
        r102 = -1;
        goto L164
    L129:
        if (r93.equals("timestamp") == false) goto L1645;
        r102 = 8;
        goto L164
    L1645:
        r102 = -1;
        goto L164
    L133:
        if (r93.equals("init") == false) goto L1646;
        r102 = 7;
        goto L164
    L1646:
        r102 = -1;
        goto L164
    L137:
        if (r93.equals("sid") == false) goto L1647;
        r102 = 6;
        goto L164
    L1647:
        r102 = -1;
        goto L164
    L141:
        if (r93.equals("seq") == false) goto L1648;
        r102 = 5;
        goto L164
    L1648:
        r102 = -1;
        goto L164
    L145:
        if (r93.equals("did") == false) goto L1649;
        r102 = 4;
        goto L164
    L1649:
        r102 = -1;
        goto L164
    L149:
        if (r93.equals("status") == false) goto L1650;
        r102 = r43;
        goto L164
    L1650:
        r102 = -1;
        goto L164
    L153:
        if (r93.equals("errors") == false) goto L1651;
        r102 = 2;
        goto L164
    L1651:
        r102 = -1;
        goto L164
    L157:
        if (r93.equals("started") == false) goto L1652;
        r102 = 1;
        goto L164
    L1652:
        r102 = -1;
        goto L164
    L161:
        if (r93.equals("duration") == false) goto L1653;
        r102 = 0;
        goto L164
    L1653:
        r102 = -1;
        goto L164
    L297:
        if (r27 == null) goto L310;
        if (r28 == null) goto L308;
        if (r53 == null) goto L306;
        if (r39 == null) goto L304;
        C1581F2 r26 = new C1581F2(r27, r28, r29, r53.intValue(), r31, r322, r33, r34, r35, r36, r37, r38, r39, r40);
        r26.f5711p = r62;
        r47.m3568i();
        return r26;
    L304:
        throw m4090d(BuildConfig.BUILD_TYPE, r48);
    L306:
        throw m4090d("errors", r48);
    L308:
        throw m4090d("started", r48);
    L310:
        throw m4090d("status", r48);
    L313:
        C2059x2 r16 = new C2059x2();
        r47.m3567f();
        EnumC2055w2 r310 = null;
        String r54 = null;
        Date r63 = null;
        HashMap r73 = null;
        C1970t r82 = null;
        Date r105 = null;
        List r117 = null;
        List r134 = null;
        List r153 = null;
        Integer r212 = null;
    L315:
        if (r47.m3564F() != EnumC2050b.NAME) goto L371;
        String r46 = r47.m3581y();
        r46.getClass();
        switch(r46.hashCode()) {
            case -454767501: goto L352;
            case -264026847: goto L348;
            case 3575610: goto L344;
            case 3598564: goto L340;
            case 55126294: goto L336;
            case 329864193: goto L332;
            case 724602046: goto L328;
            case 1055447186: goto L324;
            case 1077649831: goto L320;
            default: goto L318;
        };
    L318:
        byte r142 = -1;
    L355:
        switch(r142) {
            case 0: goto L369;
            case 1: goto L368;
            case 2: goto L367;
            case 3: goto L366;
            case 4: goto L365;
            case 5: goto L364;
            case 6: goto L363;
            case 7: goto L362;
            case 8: goto L361;
            default: goto L357;
        };
    L361:
        r212 = r47.m3576t();
        goto L315
    L362:
        r310 = (EnumC2055w2) r47.m3559A(r48, new C1865e(18));
        goto L315
    L363:
        r153 = (List) r47.m3582z();
        goto L315
    L364:
        r134 = (List) r47.m3582z();
        goto L315
    L365:
        r63 = r47.m3570m(r48);
        goto L315
    L366:
        r117 = (List) r47.m3582z();
        goto L315
    L367:
        r54 = r47.m3561C();
        goto L315
    L368:
        r105 = r47.m3570m(r48);
        goto L315
    L369:
        r82 = (C1970t) r47.m3559A(r48, new C1850a(22));
        goto L315
    L357:
        if (AbstractC1856a.m4061g(r16, r46, r47, r48) == true) goto L315;
        if (r73 != null) goto L360;
        r73 = new HashMap();
    L360:
        r47.m3562D(r48, r73, r46);
        goto L315
    L320:
        if (r46.equals("segment_id") == false) goto L1658;
        r142 = 8;
        goto L355
    L1658:
        r142 = -1;
        goto L355
    L324:
        if (r46.equals("replay_type") == false) goto L1659;
        r142 = 7;
        goto L355
    L1659:
        r142 = -1;
        goto L355
    L328:
        if (r46.equals("trace_ids") == false) goto L1660;
        r142 = 6;
        goto L355
    L1660:
        r142 = -1;
        goto L355
    L332:
        if (r46.equals("error_ids") == false) goto L1661;
        r142 = 5;
        goto L355
    L1661:
        r142 = -1;
        goto L355
    L336:
        if (r46.equals("timestamp") == false) goto L1662;
        r142 = 4;
        goto L355
    L1662:
        r142 = -1;
        goto L355
    L340:
        if (r46.equals("urls") == false) goto L1663;
        r142 = 3;
        goto L355
    L1663:
        r142 = -1;
        goto L355
    L344:
        if (r46.equals("type") == false) goto L1664;
        r142 = 2;
        goto L355
    L1664:
        r142 = -1;
        goto L355
    L348:
        if (r46.equals("replay_start_timestamp") == false) goto L1665;
        r142 = 1;
        goto L355
    L1665:
        r142 = -1;
        goto L355
    L352:
        if (r46.equals("replay_id") == false) goto L1666;
        r142 = 0;
        goto L355
    L1666:
        r142 = -1;
        goto L355
    L371:
        r47.m3568i();
        if (r54 == null) goto L374;
        r16.f7281q = r54;
    L374:
        if (r310 == null) goto L376;
        r16.f7282r = r310;
    L376:
        if (r212 == null) goto L378;
        r16.f7284t = r212.intValue();
    L378:
        if (r63 == null) goto L380;
        r16.f7285u = r63;
    L380:
        r16.f7283s = r82;
        r16.f7286v = r105;
        r16.f7287w = r117;
        r16.f7288x = r134;
        r16.f7289y = r153;
        r16.f7290z = r73;
        return r16;
    L384:
        r47.m3567f();
        AbstractMap r17 = null;
        ArrayList r55 = null;
    L386:
        if (r47.m3564F() != EnumC2050b.NAME) goto L393;
        String r311 = r47.m3581y();
        r311.getClass();
        if (r311.equals("items") == false) goto L389;
        r55 = r47.m3577u(r48, new C1865e(13));
        goto L386
    L389:
        if (r17 != null) goto L391;
        r17 = new HashMap();
    L391:
        r47.m3562D(r48, r17, r311);
        goto L386
    L393:
        r47.m3568i();
        if (r55 == null) goto L397;
        C1864d2 r03 = new C1864d2(0, r55);
        r03.f6689c = r17;
        return r03;
    L397:
        IllegalStateException r04 = new IllegalStateException("Missing required field \"items\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"items\"", r04);
        throw r04;
    L399:
        r47.m3567f();
        Object r110 = null;
        AbstractMap r312 = null;
        String r56 = null;
    L401:
        if (r47.m3564F() != EnumC2050b.NAME) goto L411;
        String r49 = r47.m3581y();
        r49.getClass();
        if (r49.equals("type") == false) goto L405;
        r56 = r47.m3561C();
        goto L401
    L405:
        if (r49.equals("value") == false) goto L406;
        r110 = r47.m3582z();
        goto L401
    L406:
        if (r312 != null) goto L408;
        r312 = new HashMap();
    L408:
        r47.m3562D(r48, r312, r49);
        goto L401
    L411:
        r47.m3568i();
        if (r56 == null) goto L421;
        C1960j r05 = new C1960j();
        r05.f6951b = r56;
        if (r110 != null) goto L416;
    L418:
        r05.f6952c = r110;
    L419:
        r05.f6953d = r312;
        return r05;
    L416:
        if (r56.equals("string") == false) goto L418;
        r05.f6952c = r110.toString();
        goto L419
    L421:
        IllegalStateException r06 = new IllegalStateException("Missing required field \"type\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"type\"", r06);
        throw r06;
    L423:
        r47.m3567f();
        Double r313 = null;
        String r410 = null;
        C1970t r57 = null;
        HashMap r64 = null;
        EnumC1868e2 r74 = null;
        HashMap r83 = null;
        Integer r99 = null;
    L425:
        if (r47.m3564F() != EnumC2050b.NAME) goto L463;
        String r118 = r47.m3581y();
        r118.getClass();
        switch(r118.hashCode()) {
            case -1615012149: goto L450;
            case 3029410: goto L446;
            case 55126294: goto L442;
            case 102865796: goto L438;
            case 405645655: goto L434;
            case 1270300245: goto L430;
            default: goto L428;
        };
    L428:
        byte r135 = -1;
    L453:
        switch(r135) {
            case 0: goto L462;
            case 1: goto L461;
            case 2: goto L460;
            case 3: goto L459;
            case 4: goto L458;
            case 5: goto L457;
            default: goto L454;
        };
    L457:
        r57 = (C1970t) r47.m3559A(r48, new C1850a(22));
        goto L425
    L458:
        r83 = r47.m3580x(r48, new C1865e(r4));
        goto L425
    L459:
        r74 = (EnumC1868e2) r47.m3559A(r48, new C1865e(16));
        goto L425
    L460:
        r313 = r47.m3572p();
        goto L425
    L461:
        r410 = r47.m3561C();
        goto L425
    L462:
        r99 = r47.m3576t();
        goto L425
    L454:
        if (r64 != null) goto L456;
        r64 = new HashMap();
    L456:
        r47.m3562D(r48, r64, r118);
        goto L425
    L430:
        if (r118.equals("trace_id") == false) goto L1667;
        r135 = 5;
        goto L453
    L1667:
        r135 = -1;
        goto L453
    L434:
        if (r118.equals("attributes") == false) goto L1668;
        r135 = 4;
        goto L453
    L1668:
        r135 = -1;
        goto L453
    L438:
        if (r118.equals("level") == false) goto L1669;
        r135 = 3;
        goto L453
    L1669:
        r135 = -1;
        goto L453
    L442:
        if (r118.equals("timestamp") == false) goto L1670;
        r135 = 2;
        goto L453
    L1670:
        r135 = -1;
        goto L453
    L446:
        if (r118.equals("body") == false) goto L1671;
        r135 = 1;
        goto L453
    L1671:
        r135 = -1;
        goto L453
    L450:
        if (r118.equals("severity_number") == false) goto L1672;
        r135 = 0;
        goto L453
    L1672:
        r135 = -1;
        goto L453
    L463:
        r47.m3568i();
        if (r57 == null) goto L476;
        if (r313 == null) goto L474;
        if (r410 == null) goto L472;
        if (r74 == null) goto L470;
        C1835c2 r07 = new C1835c2();
        r07.f6625a = r57;
        r07.f6626b = r313;
        r07.f6627c = r410;
        r07.f6628d = r74;
        r07.f6630f = r83;
        r07.f6629e = r99;
        r07.f6631g = r64;
        return r07;
    L470:
        IllegalStateException r08 = new IllegalStateException("Missing required field \"level\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"level\"", r08);
        throw r08;
    L472:
        IllegalStateException r09 = new IllegalStateException("Missing required field \"body\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"body\"", r09);
        throw r09;
    L474:
        IllegalStateException r010 = new IllegalStateException("Missing required field \"timestamp\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"timestamp\"", r010);
        throw r010;
    L476:
        IllegalStateException r011 = new IllegalStateException("Missing required field \"trace_id\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"trace_id\"", r011);
        throw r011;
    L478:
        C1828b2 r111 = new C1828b2();
        r47.m3567f();
        ConcurrentHashMap r58 = null;
    L480:
        if (r47.m3564F() != EnumC2050b.NAME) goto L513;
        String r314 = r47.m3581y();
        r314.getClass();
        switch(r314.hashCode()) {
            case -1877165340: goto L501;
            case -1562235024: goto L497;
            case -1147692044: goto L493;
            case -290474766: goto L489;
            case 3575610: goto L485;
            default: goto L483;
        };
    L483:
        byte r411 = -1;
    L504:
        switch(r411) {
            case 0: goto L512;
            case 1: goto L511;
            case 2: goto L510;
            case 3: goto L509;
            case 4: goto L508;
            default: goto L505;
        };
    L508:
        r111.f6605a = r47.m3575s();
        goto L480
    L509:
        r111.f6608d = r47.m3561C();
        goto L480
    L510:
        r111.f6606b = r47.m3561C();
        goto L480
    L511:
        r111.f6609e = r47.m3579w();
        goto L480
    L512:
        r111.f6607c = r47.m3561C();
        goto L480
    L505:
        if (r58 != null) goto L507;
        r58 = new ConcurrentHashMap();
    L507:
        r47.m3562D(r48, r58, r314);
        goto L480
    L485:
        if (r314.equals("type") == false) goto L1673;
        r411 = 4;
        goto L504
    L1673:
        r411 = -1;
        goto L504
    L489:
        if (r314.equals("class_name") == false) goto L1674;
        r411 = 3;
        goto L504
    L1674:
        r411 = -1;
        goto L504
    L493:
        if (r314.equals("address") == false) goto L1675;
        r411 = 2;
        goto L504
    L1675:
        r411 = -1;
        goto L504
    L497:
        if (r314.equals("thread_id") == false) goto L1676;
        r411 = 1;
        goto L504
    L1676:
        r411 = -1;
        goto L504
    L501:
        if (r314.equals("package_name") == false) goto L1677;
        r411 = 0;
        goto L504
    L1677:
        r411 = -1;
        goto L504
    L513:
        r111.f6610f = r58;
        r47.m3568i();
        return r111;
    L519:
        r47.m3567f();
        C1627R1 r119 = new C1627R1();
        ConcurrentHashMap r59 = null;
    L521:
        if (r47.m3564F() != EnumC2050b.NAME) goto L581;
        String r315 = r47.m3581y();
        r315.getClass();
        switch(r315.hashCode()) {
            case -1375934236: goto L558;
            case -1337936983: goto L554;
            case -1097337456: goto L550;
            case 55126294: goto L546;
            case 102865796: goto L542;
            case 954925063: goto L538;
            case 1227433863: goto L534;
            case 1481625679: goto L530;
            case 2141246174: goto L526;
            default: goto L524;
        };
    L524:
        byte r412 = -1;
    L561:
        switch(r412) {
            case 0: goto L578;
            case 1: goto L577;
            case 2: goto L576;
            case 3: goto L573;
            case 4: goto L572;
            case 5: goto L571;
            case 6: goto L570;
            case 7: goto L569;
            case 8: goto L568;
            default: goto L563;
        };
    L571:
        r119.f5846q = (C1962l) r47.m3559A(r48, new C1850a(16));
        goto L521
    L572:
        r119.f5850u = (EnumC1657a2) r47.m3559A(r48, new C1865e(11));
        goto L521
    L573:
        Date r316 = r47.m3570m(r48);
        if (r316 == null) goto L521;
        r119.f5845p = r316;
        goto L521
    L576:
        r119.f5847r = r47.m3561C();
        goto L521
    L577:
        r47.m3567f();
        r47.m3581y();
        r119.f5848s = new C2065z0(r47.m3577u(r48, new C1850a(28)));
        r47.m3568i();
        goto L521
    L578:
        List r317 = (List) r47.m3582z();
        if (r317 == null) goto L521;
        r119.f5852w = r317;
        goto L521
    L563:
        if (AbstractC1856a.m4061g(r119, r315, r47, r48) == true) goto L521;
        if (r59 != null) goto L566;
        r59 = new ConcurrentHashMap();
    L566:
        r47.m3562D(r48, r59, r315);
        goto L521
    L568:
        r119.f5851v = r47.m3561C();
        goto L521
    L569:
        r47.m3567f();
        r47.m3581y();
        r119.f5849t = new C2065z0(r47.m3577u(r48, new C1850a(21)));
        r47.m3568i();
        goto L521
    L570:
        r119.f5854y = AbstractC1856a.m4045A((Map) r47.m3582z());
        goto L521
    L526:
        if (r315.equals("transaction") == false) goto L1678;
        r412 = 8;
        goto L561
    L1678:
        r412 = -1;
        goto L561
    L530:
        if (r315.equals("exception") == false) goto L1679;
        r412 = 7;
        goto L561
    L1679:
        r412 = -1;
        goto L561
    L534:
        if (r315.equals("modules") == false) goto L1680;
        r412 = 6;
        goto L561
    L1680:
        r412 = -1;
        goto L561
    L538:
        if (r315.equals("message") == false) goto L1681;
        r412 = 5;
        goto L561
    L1681:
        r412 = -1;
        goto L561
    L542:
        if (r315.equals("level") == false) goto L1682;
        r412 = 4;
        goto L561
    L1682:
        r412 = -1;
        goto L561
    L546:
        if (r315.equals("timestamp") == false) goto L1683;
        r412 = 3;
        goto L561
    L1683:
        r412 = -1;
        goto L561
    L550:
        if (r315.equals("logger") == false) goto L1684;
        r412 = 2;
        goto L561
    L1684:
        r412 = -1;
        goto L561
    L554:
        if (r315.equals("threads") == false) goto L1685;
        r412 = 1;
        goto L561
    L1685:
        r412 = -1;
        goto L561
    L558:
        if (r315.equals("fingerprint") == false) goto L1686;
        r412 = 0;
        goto L561
    L1686:
        r412 = -1;
        goto L561
    L581:
        r119.f5853x = r59;
        r47.m3568i();
        return r119;
    L583:
        r47.m3567f();
        HashMap r510 = null;
        EnumC1653Z1 r282 = null;
        int r292 = 0;
        String r30 = null;
        String r318 = null;
        String r323 = null;
        String r332 = null;
        Integer r342 = null;
    L585:
        if (r47.m3564F() != EnumC2050b.NAME) goto L628;
        String r120 = r47.m3581y();
        r120.getClass();
        switch(r120.hashCode()) {
            case -1966910237: goto L614;
            case -1106363674: goto L610;
            case -734768633: goto L606;
            case -672977706: goto L602;
            case 3575610: goto L598;
            case 831846208: goto L594;
            case 1874684019: goto L590;
            default: goto L588;
        };
    L588:
        byte r413 = -1;
    L617:
        switch(r413) {
            case 0: goto L627;
            case 1: goto L626;
            case 2: goto L625;
            case 3: goto L624;
            case 4: goto L623;
            case 5: goto L622;
            case 6: goto L621;
            default: goto L618;
        };
    L621:
        r332 = r47.m3561C();
        goto L585
    L622:
        r30 = r47.m3561C();
        goto L585
    L623:
        r282 = (EnumC1653Z1) r47.m3559A(r48, new C1865e(r11));
        goto L585
    L624:
        r323 = r47.m3561C();
        goto L585
    L625:
        r318 = r47.m3561C();
        goto L585
    L626:
        r292 = r47.m3575s();
        goto L585
    L627:
        r342 = r47.m3576t();
        goto L585
    L618:
        if (r510 != null) goto L620;
        r510 = new HashMap();
    L620:
        r47.m3562D(r48, r510, r120);
        goto L585
    L590:
        if (r120.equals("platform") == false) goto L1687;
        r413 = 6;
        goto L617
    L1687:
        r413 = -1;
        goto L617
    L594:
        if (r120.equals("content_type") == false) goto L1688;
        r413 = 5;
        goto L617
    L1688:
        r413 = -1;
        goto L617
    L598:
        if (r120.equals("type") == false) goto L1689;
        r413 = 4;
        goto L617
    L1689:
        r413 = -1;
        goto L617
    L602:
        if (r120.equals("attachment_type") == false) goto L1690;
        r413 = 3;
        goto L617
    L1690:
        r413 = -1;
        goto L617
    L606:
        if (r120.equals("filename") == false) goto L1691;
        r413 = 2;
        goto L617
    L1691:
        r413 = -1;
        goto L617
    L610:
        if (r120.equals("length") == false) goto L1692;
        r413 = 1;
        goto L617
    L1692:
        r413 = -1;
        goto L617
    L614:
        if (r120.equals("item_count") == false) goto L1693;
        r413 = 0;
        goto L617
    L1693:
        r413 = -1;
        goto L617
    L628:
        if (r282 == null) goto L631;
        C1624Q1 r272 = new C1624Q1(r282, r292, r30, r318, r323, r332, r342);
        r272.f5838i = r510;
        r47.m3568i();
        return r272;
    L631:
        IllegalStateException r012 = new IllegalStateException("Missing required field \"type\"");
        r48.mo3683r(EnumC1657a2.ERROR, "Missing required field \"type\"", r012);
        throw r012;
    L633:
        r47.m3567f();
        C1968r r121 = null;
        C1613N2 r319 = null;
        Date r414 = null;
        C1970t r511 = null;
        HashMap r65 = null;
    L635:
        if (r47.m3564F() != EnumC2050b.NAME) goto L663;
        String r75 = r47.m3581y();
        r75.getClass();
        switch(r75.hashCode()) {
            case 113722: goto L652;
            case 110620997: goto L648;
            case 278118624: goto L644;
            case 1980389946: goto L640;
            default: goto L638;
        };
    L638:
        byte r84 = -1;
    L655:
        switch(r84) {
            case 0: goto L662;
            case 1: goto L661;
            case 2: goto L660;
            case 3: goto L659;
            default: goto L656;
        };
    L659:
        r414 = r47.m3570m(r48);
        goto L635
    L660:
        r511 = (C1970t) r47.m3559A(r48, new C1850a(22));
        goto L635
    L661:
        r319 = (C1613N2) r47.m3559A(r48, new C1865e(23));
        goto L635
    L662:
        r121 = (C1968r) r47.m3559A(r48, new C1850a(20));
        goto L635
    L656:
        if (r65 != null) goto L658;
        r65 = new HashMap();
    L658:
        r47.m3562D(r48, r65, r75);
        goto L635
    L640:
        if (r75.equals("sent_at") == false) goto L1694;
        r84 = 3;
        goto L655
    L1694:
        r84 = -1;
        goto L655
    L644:
        if (r75.equals("event_id") == false) goto L1695;
        r84 = 2;
        goto L655
    L1695:
        r84 = -1;
        goto L655
    L648:
        if (r75.equals("trace") == false) goto L1696;
        r84 = 1;
        goto L655
    L1696:
        r84 = -1;
        goto L655
    L652:
        if (r75.equals("sdk") == false) goto L1697;
        r84 = 0;
        goto L655
    L1697:
        r84 = -1;
        goto L655
    L663:
        C1596J1 r2 = new C1596J1(r511, r121, r319);
        r2.f5758d = r414;
        r2.f5759e = r65;
        r47.m3568i();
        return r2;
    L665:
        r47.m3567f();
        C1560A1 r122 = new C1560A1();
        r122.f5584c = false;
        r122.f5585d = null;
        r122.f5582a = false;
        r122.f5583b = null;
        r122.f5590i = false;
        r122.f5586e = null;
        r122.f5587f = false;
        r122.f5588g = false;
        r122.f5593l = EnumC1877g1.MANUAL;
        r122.f5589h = 0;
        r122.f5591j = true;
        r122.f5592k = false;
        ConcurrentHashMap r512 = null;
    L667:
        if (r47.m3564F() != EnumC2050b.NAME) goto L761;
        String r415 = r47.m3581y();
        r415.getClass();
        switch(r415.hashCode()) {
            case -801141276: goto L716;
            case -566246656: goto L712;
            case -450071601: goto L708;
            case -436975123: goto L704;
            case -116896685: goto L700;
            case -104146616: goto L696;
            case -69617820: goto L692;
            case 401419348: goto L688;
            case 1401020980: goto L684;
            case 1583866442: goto L680;
            case 1653938779: goto L676;
            case 2140552383: goto L672;
            default: goto L670;
        };
    L670:
        byte r66 = -1;
    L719:
        switch(r66) {
            case 0: goto L758;
            case 1: goto L755;
            case 2: goto L752;
            case 3: goto L749;
            case 4: goto L746;
            case 5: goto L743;
            case 6: goto L740;
            case 7: goto L735;
            case 8: goto L732;
            case 9: goto L729;
            case 10: goto L726;
            case 11: goto L723;
            default: goto L720;
        };
    L723:
        Double r416 = r47.m3572p();
        if (r416 == null) goto L667;
        r122.f5583b = r416;
        goto L667
    L726:
        Double r417 = r47.m3572p();
        if (r417 == null) goto L667;
        r122.f5585d = r417;
        goto L667
    L729:
        Integer r418 = r47.m3576t();
        if (r418 == null) goto L667;
        r122.f5589h = r418.intValue();
        goto L667
    L732:
        Boolean r419 = r47.m3569l();
        if (r419 == null) goto L667;
        r122.f5590i = r419.booleanValue();
        goto L667
    L735:
        String r420 = r47.m3561C();
        if (r420 == null) goto L667;
        r122.f5593l = EnumC1877g1.valueOf(r420);     // Catch: IllegalArgumentException -> L739
    L739:
        r48.mo3680e(EnumC1657a2.ERROR, "Error when deserializing ProfileLifecycle: ".concat(r420), new Object[0]);
        goto L667
    L740:
        Boolean r421 = r47.m3569l();
        if (r421 == null) goto L667;
        r122.f5582a = r421.booleanValue();
        goto L667
    L743:
        Boolean r422 = r47.m3569l();
        if (r422 == null) goto L667;
        r122.f5592k = r422.booleanValue();
        goto L667
    L746:
        Boolean r423 = r47.m3569l();
        if (r423 == null) goto L667;
        r122.f5587f = r423.booleanValue();
        goto L667
    L749:
        Boolean r424 = r47.m3569l();
        if (r424 == null) goto L667;
        r122.f5588g = r424.booleanValue();
        goto L667
    L752:
        String r425 = r47.m3561C();
        if (r425 == null) goto L667;
        r122.f5586e = r425;
        goto L667
    L755:
        Boolean r426 = r47.m3569l();
        if (r426 == null) goto L667;
        r122.f5584c = r426.booleanValue();
        goto L667
    L758:
        Boolean r427 = r47.m3569l();
        if (r427 == null) goto L667;
        r122.f5591j = r427.booleanValue();
        goto L667
    L720:
        if (r512 != null) goto L722;
        r512 = new ConcurrentHashMap();
    L722:
        r47.m3562D(r48, r512, r415);
        goto L667
    L672:
        if (r415.equals("profile_sample_rate") == false) goto L1698;
        r66 = 11;
        goto L719
    L1698:
        r66 = -1;
        goto L719
    L676:
        if (r415.equals("trace_sample_rate") == false) goto L1699;
        r66 = 10;
        goto L719
    L1699:
        r66 = -1;
        goto L719
    L680:
        if (r415.equals("profiling_traces_hz") == false) goto L1700;
        r66 = 9;
        goto L719
    L1700:
        r66 = -1;
        goto L719
    L684:
        if (r415.equals("continuous_profile_sampled") == false) goto L1701;
        r66 = 8;
        goto L719
    L1701:
        r66 = -1;
        goto L719
    L688:
        if (r415.equals("profile_lifecycle") == false) goto L1702;
        r66 = 7;
        goto L719
    L1702:
        r66 = -1;
        goto L719
    L692:
        if (r415.equals("profile_sampled") == false) goto L1703;
        r66 = 6;
        goto L719
    L1703:
        r66 = -1;
        goto L719
    L696:
        if (r415.equals("is_start_profiler_on_app_start") == false) goto L1704;
        r66 = 5;
        goto L719
    L1704:
        r66 = -1;
        goto L719
    L700:
        if (r415.equals("is_profiling_enabled") == false) goto L1705;
        r66 = 4;
        goto L719
    L1705:
        r66 = -1;
        goto L719
    L704:
        if (r415.equals("is_continuous_profiling_enabled") == false) goto L1706;
        r66 = 3;
        goto L719
    L1706:
        r66 = -1;
        goto L719
    L708:
        if (r415.equals("profiling_traces_dir_path") == false) goto L1707;
        r66 = 2;
        goto L719
    L1707:
        r66 = -1;
        goto L719
    L712:
        if (r415.equals("trace_sampled") == false) goto L1708;
        r66 = 1;
        goto L719
    L1708:
        r66 = -1;
        goto L719
    L716:
        if (r415.equals("is_enable_app_start_profiling") == false) goto L1709;
        r66 = 0;
        goto L719
    L1709:
        r66 = -1;
        goto L719
    L761:
        r122.f5594m = r512;
        r47.m3568i();
        return r122;
    L763:
        C1927m1 r123 = new C1927m1();
        r47.m3567f();
        Integer r320 = null;
        HashMap r513 = null;
    L765:
        if (r47.m3564F() != EnumC2050b.NAME) goto L772;
        String r428 = r47.m3581y();
        r428.getClass();
        if (r428.equals("segment_id") == false) goto L768;
        r320 = r47.m3576t();
        goto L765
    L768:
        if (r513 != null) goto L770;
        r513 = new HashMap();
    L770:
        r47.m3562D(r48, r513, r428);
        goto L765
    L772:
        r47.m3568i();
        r47.m3565G(true);
        List r429 = (List) r47.m3582z();
        r47.m3565G(false);
        if (r429 == null) goto L832;
        ArrayList r013 = new ArrayList(r429.size());
        Iterator r430 = r429.iterator();
    L776:
        if (r430.hasNext() == false) goto L833;
        Object r76 = r430.next();
        if ((r76 instanceof Map) == false) goto L776;
        Map r77 = (Map) r76;
        C1559A0 r85 = new C1559A0(r77);
        Iterator r106 = r77.entrySet().iterator();
    L781:
        if (r106.hasNext() == false) goto L776;
        Map.Entry r1110 = (Map.Entry) r106.next();
        String r124 = (String) r1110.getKey();
        Object r1111 = r1110.getValue();
        if (r124.equals("type") == false) goto L781;
        EnumC1987c r1112 = EnumC1987c.values()[((Integer) r1111).intValue()];
        int r125 = AbstractC1920l1.f6809b[r1112.ordinal()];
        if (r125 != 1) goto L787;
        Map r1113 = (Map) r77.get("data");
        if (r1113 != null) goto L821;
        r1113 = Collections.EMPTY_MAP;
    L821:
        Integer r1114 = (Integer) r1113.get("source");
        if (r1114 == null) goto L781;
        EnumC1988d r1115 = EnumC1988d.values()[r1114.intValue()];
        int r126 = AbstractC1920l1.f6808a[r1115.ordinal()];
        if (r126 != 1) goto L826;
        r013.add(C1947D.m4147c(r85, r48));
        goto L781
    L826:
        if (r126 != 2) goto L827;
        r013.add(C1947D.m4148d(r85, r48));
        goto L781
    L827:
        r48.mo3680e(EnumC1657a2.DEBUG, "Unsupported rrweb incremental snapshot type %s", new Object[]{r1115});
        goto L781
    L787:
        if (r125 != 2) goto L789;
        r013.add(C1947D.m4149e(r85, r48));
        goto L781
    L789:
        if (r125 == 3) goto L792;
        r48.mo3680e(EnumC1657a2.DEBUG, "Unsupported rrweb event type %s", new Object[]{r1112});
        goto L781
    L792:
        Map r127 = (Map) r77.get("data");
        if (r127 != null) goto L795;
        r127 = Collections.EMPTY_MAP;
    L795:
        String r128 = (String) r127.get("tag");
        if (r128 == null) goto L781;
        switch(r128.hashCode()) {
            case -226040934: goto L809;
            case 112202875: goto L805;
            case 1106718723: goto L801;
            default: goto L799;
        };
    L799:
        byte r23 = -1;
    L812:
        switch(r23) {
            case 0: goto L816;
            case 1: goto L815;
            case 2: goto L814;
            default: goto L813;
        };
    L813:
        r48.mo3680e(EnumC1657a2.DEBUG, "Unsupported rrweb event type %s", new Object[]{r1112});
        goto L781
    L814:
        r013.add(C1947D.m4146b(r85, r48));
        goto L781
    L815:
        r013.add(C1947D.m4151g(r85, r48));
        goto L781
    L816:
        r013.add(C1947D.m4150f(r85, r48));
        goto L781
    L801:
        if (r128.equals("breadcrumb") == false) goto L1710;
        r23 = 2;
        goto L812
    L1710:
        r23 = -1;
        goto L812
    L805:
        if (r128.equals("video") == false) goto L1711;
        r23 = 1;
        goto L812
    L1711:
        r23 = -1;
        goto L812
    L809:
        if (r128.equals("performanceSpan") == false) goto L1712;
        r23 = 0;
        goto L812
    L1712:
        r23 = -1;
    L833:
        r123.f6817a = r320;
        r123.f6818b = r013;
        r123.f6819c = r513;
        return r123;
    L832:
        r013 = null;
        goto L833
    L835:
        r47.m3567f();
        C1896i1 r129 = new C1896i1(C1643W0.f5888a, 0L, 0L);
        ConcurrentHashMap r514 = null;
    L837:
        if (r47.m3564F() != EnumC2050b.NAME) goto L894;
        String r321 = r47.m3581y();
        r321.getClass();
        switch(r321.hashCode()) {
            case -112372011: goto L866;
            case -84607876: goto L862;
            case 3355: goto L858;
            case 3373707: goto L854;
            case 1270300245: goto L850;
            case 1566648660: goto L846;
            case 1902256621: goto L842;
            default: goto L840;
        };
    L840:
        byte r232 = -1;
    L869:
        switch(r232) {
            case 0: goto L891;
            case 1: goto L888;
            case 2: goto L885;
            case 3: goto L882;
            case 4: goto L879;
            case 5: goto L876;
            case 6: goto L873;
            default: goto L870;
        };
    L873:
        Long r324 = r47.m3579w();
        if (r324 == null) goto L837;
        r129.f6770f = r324;
        goto L837
    L876:
        Long r325 = r47.m3579w();
        if (r325 == null) goto L837;
        r129.f6771g = r325;
        goto L837
    L879:
        String r326 = r47.m3561C();
        if (r326 == null) goto L837;
        r129.f6766b = r326;
        goto L837
    L882:
        String r327 = r47.m3561C();
        if (r327 == null) goto L837;
        r129.f6767c = r327;
        goto L837
    L885:
        String r328 = r47.m3561C();
        if (r328 == null) goto L837;
        r129.f6765a = r328;
        goto L837
    L888:
        Long r329 = r47.m3579w();
        if (r329 == null) goto L837;
        r129.f6769e = r329;
        goto L837
    L891:
        Long r330 = r47.m3579w();
        if (r330 == null) goto L837;
        r129.f6768d = r330;
        goto L837
    L870:
        if (r514 != null) goto L872;
        r514 = new ConcurrentHashMap();
    L872:
        r47.m3562D(r48, r514, r321);
        goto L837
    L842:
        if (r321.equals("relative_cpu_start_ms") == false) goto L1713;
        r232 = 6;
        goto L869
    L1713:
        r232 = -1;
        goto L869
    L846:
        if (r321.equals("relative_cpu_end_ms") == false) goto L1714;
        r232 = 5;
        goto L869
    L1714:
        r232 = -1;
        goto L869
    L850:
        if (r321.equals("trace_id") == false) goto L1715;
        r232 = 4;
        goto L869
    L1715:
        r232 = -1;
        goto L869
    L854:
        if (r321.equals("name") == false) goto L1716;
        r232 = 3;
        goto L869
    L1716:
        r232 = -1;
        goto L869
    L858:
        if (r321.equals("id") == false) goto L1717;
        r232 = 2;
        goto L869
    L1717:
        r232 = -1;
        goto L869
    L862:
        if (r321.equals("relative_end_ns") == false) goto L1718;
        r232 = 1;
        goto L869
    L1718:
        r232 = -1;
        goto L869
    L866:
        if (r321.equals("relative_start_ns") == false) goto L1719;
        r232 = 0;
        goto L869
    L1719:
        r232 = -1;
        goto L869
    L894:
        r129.f6772h = r514;
        r47.m3568i();
        return r129;
    L896:
        r47.m3567f();
        File r515 = new File("dummy");
        Date r273 = AbstractC1856a.m4067m();
        ArrayList r283 = new ArrayList();
        C1970t r78 = C1970t.f7011b;
        C1881h1 r25 = new C1881h1(r515, r273, r283, "", r78.toString(), new C1589H2(r78, C1601K2.f5780b, "op", null).f5738a.toString(), "0", 0, "", new CallableC1590I(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
        ConcurrentHashMap r516 = null;
    L898:
        if (r47.m3564F() != EnumC2050b.NAME) goto L1088;
        String r331 = r47.m3581y();
        r331.getClass();
        switch(r331.hashCode()) {
            case -2133529830: goto L1003;
            case -1981468849: goto L999;
            case -1430655860: goto L995;
            case -1172160413: goto L991;
            case -1102636175: goto L987;
            case -716656436: goto L983;
            case -591076352: goto L979;
            case -512511455: goto L975;
            case -478065584: goto L971;
            case -362243017: goto L967;
            case -332426004: goto L963;
            case -212264198: goto L959;
            case -102985484: goto L955;
            case -102670958: goto L951;
            case -85904877: goto L947;
            case 55126294: goto L943;
            case 508853068: goto L939;
            case 796476189: goto L935;
            case 839674195: goto L931;
            case 1010584092: goto L927;
            case 1052553990: goto L923;
            case 1163928186: goto L919;
            case 1270300245: goto L915;
            case 1874684019: goto L911;
            case 1953158756: goto L907;
            case 1954122069: goto L903;
            default: goto L901;
        };
    L901:
        byte r79 = -1;
    L1006:
        switch(r79) {
            case 0: goto L1085;
            case 1: goto L1082;
            case 2: goto L1079;
            case 3: goto L1076;
            case 4: goto L1073;
            case 5: goto L1070;
            case 6: goto L1067;
            case 7: goto L1064;
            case 8: goto L1061;
            case 9: goto L1058;
            case 10: goto L1055;
            case 11: goto L1052;
            case 12: goto L1049;
            case 13: goto L1046;
            case 14: goto L1043;
            case 15: goto L1040;
            case 16: goto L1037;
            case 17: goto L1034;
            case 18: goto L1031;
            case 19: goto L1028;
            case 20: goto L1025;
            case 21: goto L1022;
            case 22: goto L1019;
            case 23: goto L1016;
            case 24: goto L1013;
            case 25: goto L1010;
            default: goto L1007;
        };
    L1010:
        ArrayList r333 = r47.m3577u(r48, new C1865e(4));
        if (r333 == null) goto L898;
        r25.f6750p.addAll(r333);
        goto L898
    L1013:
        String r334 = r47.m3561C();
        if (r334 == null) goto L898;
        r25.f6733B = r334;
        goto L898
    L1016:
        String r335 = r47.m3561C();
        if (r335 == null) goto L898;
        r25.f6748n = r335;
        goto L898
    L1019:
        String r336 = r47.m3561C();
        if (r336 == null) goto L898;
        r25.f6756v = r336;
        goto L898
    L1022:
        String r337 = r47.m3561C();
        if (r337 == null) goto L898;
        r25.f6759y = r337;
        goto L898
    L1025:
        String r338 = r47.m3561C();
        if (r338 == null) goto L898;
        r25.f6743i = r338;
        goto L898
    L1028:
        String r339 = r47.m3561C();
        if (r339 == null) goto L898;
        r25.f6755u = r339;
        goto L898
    L1031:
        String r340 = r47.m3561C();
        if (r340 == null) goto L898;
        r25.f6745k = r340;
        goto L898
    L1034:
        String r341 = r47.m3561C();
        if (r341 == null) goto L898;
        r25.f6742h = r341;
        goto L898
    L1037:
        String r343 = r47.m3561C();
        if (r343 == null) goto L898;
        r25.f6751q = r343;
        goto L898
    L1040:
        Date r344 = r47.m3570m(r48);
        if (r344 == null) goto L898;
        r25.f6760z = r344;
        goto L898
    L1043:
        String r345 = r47.m3561C();
        if (r345 == null) goto L898;
        r25.f6758x = r345;
        goto L898
    L1046:
        String r346 = r47.m3561C();
        if (r346 == null) goto L898;
        r25.f6754t = r346;
        goto L898
    L1049:
        String r347 = r47.m3561C();
        if (r347 == null) goto L898;
        r25.f6753s = r347;
        goto L898
    L1052:
        List r348 = (List) r47.m3582z();
        if (r348 == null) goto L898;
        r25.f6746l = r348;
        goto L898
    L1055:
        String r349 = r47.m3561C();
        if (r349 == null) goto L898;
        r25.f6747m = r349;
        goto L898
    L1058:
        HashMap r350 = r47.m3580x(r48, new C1850a(2));
        if (r350 == null) goto L898;
        r25.f6732A.putAll(r350);
        goto L898
    L1061:
        String r351 = r47.m3561C();
        if (r351 == null) goto L898;
        r25.f6752r = r351;
        goto L898
    L1064:
        Boolean r352 = r47.m3569l();
        if (r352 == null) goto L898;
        r25.f6744j = r352.booleanValue();
        goto L898
    L1067:
        String r353 = r47.m3561C();
        if (r353 == null) goto L898;
        r25.f6740f = r353;
        goto L898
    L1070:
        String r354 = r47.m3561C();
        if (r354 == null) goto L898;
        r25.f6741g = r354;
        goto L898
    L1073:
        String r355 = r47.m3561C();
        if (r355 == null) goto L898;
        r25.f6757w = r355;
        goto L898
    L1076:
        String r356 = r47.m3561C();
        if (r356 == null) goto L898;
        r25.f6738d = r356;
        goto L898
    L1079:
        String r357 = r47.m3561C();
        if (r357 == null) goto L898;
        r25.f6749o = r357;
        goto L898
    L1082:
        Integer r358 = r47.m3576t();
        if (r358 == null) goto L898;
        r25.f6737c = r358.intValue();
        goto L898
    L1085:
        String r359 = r47.m3561C();
        if (r359 == null) goto L898;
        r25.f6739e = r359;
        goto L898
    L1007:
        if (r516 != null) goto L1009;
        r516 = new ConcurrentHashMap();
    L1009:
        r47.m3562D(r48, r516, r331);
        goto L898
    L903:
        if (r331.equals("transactions") == false) goto L1720;
        r79 = 25;
        goto L1006
    L1720:
        r79 = -1;
        goto L1006
    L907:
        if (r331.equals("sampled_profile") == false) goto L1721;
        r79 = 24;
        goto L1006
    L1721:
        r79 = -1;
        goto L1006
    L911:
        if (r331.equals("platform") == false) goto L1722;
        r79 = 23;
        goto L1006
    L1722:
        r79 = -1;
        goto L1006
    L915:
        if (r331.equals("trace_id") == false) goto L1723;
        r79 = 22;
        goto L1006
    L1723:
        r79 = -1;
        goto L1006
    L919:
        if (r331.equals("truncation_reason") == false) goto L1724;
        r79 = 21;
        goto L1006
    L1724:
        r79 = -1;
        goto L1006
    L923:
        if (r331.equals("device_os_version") == false) goto L1725;
        r79 = 20;
        goto L1006
    L1725:
        r79 = -1;
        goto L1006
    L927:
        if (r331.equals("transaction_id") == false) goto L1726;
        r79 = 19;
        goto L1006
    L1726:
        r79 = -1;
        goto L1006
    L931:
        if (r331.equals("architecture") == false) goto L1727;
        r79 = 18;
        goto L1006
    L1727:
        r79 = -1;
        goto L1006
    L935:
        if (r331.equals("device_os_name") == false) goto L1728;
        r79 = 17;
        goto L1006
    L1728:
        r79 = -1;
        goto L1006
    L939:
        if (r331.equals("transaction_name") == false) goto L1729;
        r79 = 16;
        goto L1006
    L1729:
        r79 = -1;
        goto L1006
    L943:
        if (r331.equals("timestamp") == false) goto L1730;
        r79 = 15;
        goto L1006
    L1730:
        r79 = -1;
        goto L1006
    L947:
        if (r331.equals("environment") == false) goto L1731;
        r79 = 14;
        goto L1006
    L1731:
        r79 = -1;
        goto L1006
    L951:
        if (r331.equals("version_name") == false) goto L1732;
        r79 = 13;
        goto L1006
    L1732:
        r79 = -1;
        goto L1006
    L955:
        if (r331.equals("version_code") == false) goto L1733;
        r79 = 12;
        goto L1006
    L1733:
        r79 = -1;
        goto L1006
    L959:
        if (r331.equals("device_cpu_frequencies") == false) goto L1734;
        r79 = 11;
        goto L1006
    L1734:
        r79 = -1;
        goto L1006
    L963:
        if (r331.equals("device_physical_memory_bytes") == false) goto L1735;
        r79 = 10;
        goto L1006
    L1735:
        r79 = -1;
        goto L1006
    L967:
        if (r331.equals("measurements") == false) goto L1736;
        r79 = 9;
        goto L1006
    L1736:
        r79 = -1;
        goto L1006
    L971:
        if (r331.equals("duration_ns") == false) goto L1737;
        r79 = 8;
        goto L1006
    L1737:
        r79 = -1;
        goto L1006
    L975:
        if (r331.equals("device_is_emulator") == false) goto L1738;
        r79 = 7;
        goto L1006
    L1738:
        r79 = -1;
        goto L1006
    L979:
        if (r331.equals("device_model") == false) goto L1739;
        r79 = 6;
        goto L1006
    L1739:
        r79 = -1;
        goto L1006
    L983:
        if (r331.equals("device_os_build_number") == false) goto L1740;
        r79 = 5;
        goto L1006
    L1740:
        r79 = -1;
        goto L1006
    L987:
        if (r331.equals("profile_id") == false) goto L1741;
        r79 = 4;
        goto L1006
    L1741:
        r79 = -1;
        goto L1006
    L991:
        if (r331.equals("device_locale") == false) goto L1742;
        r79 = 3;
        goto L1006
    L1742:
        r79 = -1;
        goto L1006
    L995:
        if (r331.equals("build_id") == false) goto L1743;
        r79 = 2;
        goto L1006
    L1743:
        r79 = -1;
        goto L1006
    L999:
        if (r331.equals("android_api_level") == false) goto L1744;
        r79 = 1;
        goto L1006
    L1744:
        r79 = -1;
        goto L1006
    L1003:
        if (r331.equals("device_manufacturer") == false) goto L1745;
        r79 = 0;
        goto L1006
    L1745:
        r79 = -1;
        goto L1006
    L1088:
        r25.f6734C = r516;
        r47.m3568i();
        return r25;
    L1090:
        r47.m3567f();
        C1873f1 r130 = new C1873f1(C1970t.f7011b);
        ConcurrentHashMap r517 = null;
    L1092:
        if (r47.m3564F() != EnumC2050b.NAME) goto L1101;
        String r360 = r47.m3581y();
        r360.getClass();
        if (r360.equals("profiler_id") == false) goto L1095;
        C1970t r361 = (C1970t) r47.m3559A(r48, new C1850a(22));
        if (r361 == null) goto L1092;
        r130.f6718a = r361;
        goto L1092
    L1095:
        if (r517 != null) goto L1097;
        r517 = new ConcurrentHashMap();
    L1097:
        r47.m3562D(r48, r517, r360);
        goto L1092
    L1101:
        r130.f6719b = r517;
        r47.m3568i();
        return r130;
    L1103:
        r47.m3567f();
        C1970t r252 = C1970t.f7011b;
        C1867e1 r24 = new C1867e1(r252, r252, new File("dummy"), new HashMap(), Double.valueOf(0.0d), C2046v2.empty());
        ConcurrentHashMap r518 = null;
    L1105:
        if (r47.m3564F() != EnumC2050b.NAME) goto L1194;
        String r362 = r47.m3581y();
        r362.getClass();
        switch(r362.hashCode()) {
            case -1840434063: goto L1150;
            case -362243017: goto L1146;
            case -85904877: goto L1142;
            case 55126294: goto L1138;
            case 178573617: goto L1134;
            case 351608024: goto L1130;
            case 1090594823: goto L1126;
            case 1102774726: goto L1122;
            case 1874684019: goto L1118;
            case 1953158756: goto L1114;
            case 2005113901: goto L1110;
            default: goto L1108;
        };
    L1108:
        byte r233 = -1;
    L1153:
        switch(r233) {
            case 0: goto L1191;
            case 1: goto L1187;
            case 2: goto L1184;
            case 3: goto L1181;
            case 4: goto L1177;
            case 5: goto L1174;
            case 6: goto L1171;
            case 7: goto L1168;
            case 8: goto L1165;
            case 9: goto L1162;
            case 10: goto L1157;
            default: goto L1154;
        };
    L1187:
        HashMap r363 = r47.m3580x(r48, new C1850a(2));
        if (r363 == null) goto L1105;
        r24.f6695e.putAll(r363);
        goto L1105
    L1191:
        C1954d r364 = (C1954d) r47.m3559A(r48, new C1850a(8));
        if (r364 == null) goto L1105;
        r24.f6691a = r364;
        goto L1105
    L1154:
        if (r518 != null) goto L1156;
        r518 = new ConcurrentHashMap();
    L1156:
        r47.m3562D(r48, r518, r362);
        goto L1105
    L1157:
        C1970t r365 = (C1970t) r47.m3559A(r48, new C1850a(22));
        if (r365 == null) goto L1105;
        r24.f6693c = r365;
        goto L1105
    L1162:
        String r366 = r47.m3561C();
        if (r366 == null) goto L1105;
        r24.f6702l = r366;
        goto L1105
    L1165:
        String r367 = r47.m3561C();
        if (r367 == null) goto L1105;
        r24.f6696f = r367;
        goto L1105
    L1168:
        C1968r r368 = (C1968r) r47.m3559A(r48, new C1850a(20));
        if (r368 == null) goto L1105;
        r24.f6694d = r368;
        goto L1105
    L1171:
        String r369 = r47.m3561C();
        if (r369 == null) goto L1105;
        r24.f6697g = r369;
        goto L1105
    L1174:
        String r370 = r47.m3561C();
        if (r370 == null) goto L1105;
        r24.f6699i = r370;
        goto L1105
    L1177:
        C1970t r371 = (C1970t) r47.m3559A(r48, new C1850a(22));
        if (r371 == null) goto L1105;
        r24.f6692b = r371;
        goto L1105
    L1181:
        Double r372 = r47.m3572p();
        if (r372 == null) goto L1105;
        r24.f6700j = r372.doubleValue();
        goto L1105
    L1184:
        String r373 = r47.m3561C();
        if (r373 == null) goto L1105;
        r24.f6698h = r373;
        goto L1105
    L1110:
        if (r362.equals("chunk_id") == false) goto L1746;
        r233 = 10;
        goto L1153
    L1746:
        r233 = -1;
        goto L1153
    L1114:
        if (r362.equals("sampled_profile") == false) goto L1747;
        r233 = 9;
        goto L1153
    L1747:
        r233 = -1;
        goto L1153
    L1118:
        if (r362.equals("platform") == false) goto L1748;
        r233 = 8;
        goto L1153
    L1748:
        r233 = -1;
        goto L1153
    L1122:
        if (r362.equals("client_sdk") == false) goto L1749;
        r233 = 7;
        goto L1153
    L1749:
        r233 = -1;
        goto L1153
    L1126:
        if (r362.equals(BuildConfig.BUILD_TYPE) == false) goto L1750;
        r233 = 6;
        goto L1153
    L1750:
        r233 = -1;
        goto L1153
    L1130:
        if (r362.equals("version") == false) goto L1751;
        r233 = 5;
        goto L1153
    L1751:
        r233 = -1;
        goto L1153
    L1134:
        if (r362.equals("profiler_id") == false) goto L1752;
        r233 = 4;
        goto L1153
    L1752:
        r233 = -1;
        goto L1153
    L1138:
        if (r362.equals("timestamp") == false) goto L1753;
        r233 = 3;
        goto L1153
    L1753:
        r233 = -1;
        goto L1153
    L1142:
        if (r362.equals("environment") == false) goto L1754;
        r233 = 2;
        goto L1153
    L1754:
        r233 = -1;
        goto L1153
    L1146:
        if (r362.equals("measurements") == false) goto L1755;
        r233 = 1;
        goto L1153
    L1755:
        r233 = -1;
        goto L1153
    L1150:
        if (r362.equals("debug_meta") == false) goto L1756;
        r233 = 0;
        goto L1153
    L1756:
        r233 = -1;
        goto L1153
    L1194:
        r24.f6703m = r518;
        r47.m3568i();
        return r24;
    L109:
        return EnumC1605L2.valueOf(r47.m3560B().toUpperCase(Locale.ROOT));
    L111:
        return new C1601K2(r47.m3560B());
    L113:
        return m4088b(r47, r48);
    L312:
        return EnumC2055w2.valueOf(r47.m3560B().toUpperCase(Locale.ROOT));
    L383:
        return EnumC1868e2.valueOf(r47.m3560B().toUpperCase(Locale.ROOT));
    L516:
        return EnumC1657a2.valueOf(r47.m3560B().toUpperCase(Locale.ROOT));
    L518:
        return EnumC1653Z1.valueOfLabel(r47.m3560B().toLowerCase(Locale.ROOT));
    L1197:
        return m4089c(r47, r48);
    }
}
