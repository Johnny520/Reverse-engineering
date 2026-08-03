package io.sentry.protocol;

import io.sentry.C1559A0;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1978q0;
import io.sentry.config.AbstractC1856a;
import io.sentry.rrweb.C1985a;
import io.sentry.rrweb.C1991g;
import io.sentry.rrweb.C1992h;
import io.sentry.rrweb.C1993i;
import io.sentry.rrweb.C1994j;
import io.sentry.rrweb.C1996l;
import io.sentry.rrweb.C1997m;
import io.sentry.rrweb.EnumC1987c;
import io.sentry.rrweb.EnumC1988d;
import io.sentry.rrweb.EnumC1990f;
import io.sentry.vendor.gson.stream.EnumC2050b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1947D implements InterfaceC1978q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6848a;

    public /* synthetic */ C1947D(int r1) {
        this.f6848a = r1;
    }

    /* JADX INFO: renamed from: b */
    public static C1985a m4146b(C1559A0 r14, ILogger r15) {
        r14.m3567f();
        C1985a r0 = new C1985a();
        HashMap r2 = null;
    L4:
        if (r14.m3564F() != EnumC2050b.NAME) goto L77;
        String r3 = r14.m3581y();
        r3.getClass();
        int r6 = 4;
        if (r3.equals("data") == false) goto L8;
        r14.m3567f();
        ConcurrentHashMap r32 = null;
    L18:
        if (r14.m3564F() != EnumC2050b.NAME) goto L76;
        String r5 = r14.m3581y();
        r5.getClass();
        if (r5.equals("payload") == false) goto L22;
        r14.m3567f();
        ConcurrentHashMap r52 = null;
    L32:
        if (r14.m3564F() != EnumC2050b.NAME) goto L75;
        String r10 = r14.m3581y();
        r10.getClass();
        byte r13 = -1;
        switch(r10.hashCode()) {
            case 3076010: goto L57;
            case 3575610: goto L53;
            case 50511102: goto L49;
            case 55126294: goto L45;
            case 102865796: goto L41;
            case 954925063: goto L37;
            default: goto L60;
        };
    L60:
        switch(r13) {
            case 0: goto L72;
            case 1: goto L71;
            case 2: goto L70;
            case 3: goto L69;
            case 4: goto L79;
            case 5: goto L64;
            default: goto L61;
        };
    L79:
        r0.f7110h = EnumC1657a2.valueOf(r14.m3560B().toUpperCase(Locale.ROOT));     // Catch: Exception -> L67
    L67:
        e = move-exception;
        r15.mo3682n(EnumC1657a2.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
        goto L32
    L64:
        r0.f7109g = r14.m3561C();
        goto L32
    L69:
        r0.f7106d = r14.m3571o();
        goto L32
    L70:
        r0.f7108f = r14.m3561C();
        goto L32
    L71:
        r0.f7107e = r14.m3561C();
        goto L32
    L72:
        ConcurrentHashMap r102 = AbstractC1856a.m4045A((Map) r14.m3582z());
        if (r102 == null) goto L32;
        r0.f7111i = r102;
        goto L32
    L61:
        if (r52 != null) goto L63;
        r52 = new ConcurrentHashMap();
    L63:
        r14.m3562D(r15, r52, r10);
        goto L32
    L37:
        if (r10.equals("message") == false) goto L60;
        r13 = 5;
        goto L60
    L41:
        if (r10.equals("level") == false) goto L60;
        r13 = 4;
        goto L60
    L45:
        if (r10.equals("timestamp") == false) goto L60;
        r13 = 3;
        goto L60
    L49:
        if (r10.equals("category") == false) goto L60;
        r13 = 2;
        goto L60
    L53:
        if (r10.equals("type") == false) goto L60;
        r13 = 1;
        goto L60
    L57:
        if (r10.equals("data") == false) goto L60;
        r13 = 0;
        goto L60
    L75:
        r0.f7113k = r52;
        r14.m3568i();
        goto L18
    L22:
        if (r5.equals("tag") == false) goto L23;
        String r53 = r14.m3561C();
        if (r53 != null) goto L29;
        r53 = "";
    L29:
        r0.f7105c = r53;
        goto L18
    L23:
        if (r32 != null) goto L25;
        r32 = new ConcurrentHashMap();
    L25:
        r14.m3562D(r15, r32, r5);
        goto L18
    L76:
        r0.f7114l = r32;
        r14.m3568i();
        goto L4
    L8:
        if (r3.equals("type") == false) goto L10;
        EnumC1987c r33 = (EnumC1987c) r14.m3559A(r15, new C1947D(r6));
        AbstractC1856a.m4048D("", r33);
        r0.f7115a = r33;
        goto L4
    L10:
        if (r3.equals("timestamp") == false) goto L11;
        r0.f7116b = r14.m3578v();
        goto L4
    L11:
        if (r2 != null) goto L13;
        r2 = new HashMap();
    L13:
        r14.m3562D(r15, r2, r3);
        goto L4
    L77:
        r0.f7112j = r2;
        r14.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: c */
    public static C1991g m4147c(C1559A0 r11, ILogger r12) {
        r11.m3567f();
        C1991g r0 = new C1991g();
        HashMap r2 = null;
    L4:
        if (r11.m3564F() != EnumC2050b.NAME) goto L60;
        String r3 = r11.m3581y();
        r3.getClass();
        int r5 = 4;
        if (r3.equals("data") == false) goto L8;
        r11.m3567f();
        HashMap r32 = null;
    L18:
        if (r11.m3564F() != EnumC2050b.NAME) goto L59;
        String r4 = r11.m3581y();
        r4.getClass();
        int r9 = 5;
        byte r10 = -1;
        switch(r4.hashCode()) {
            case 120: goto L43;
            case 121: goto L39;
            case 3355: goto L35;
            case 3575610: goto L31;
            case 768858903: goto L27;
            case 1565043768: goto L23;
            default: goto L46;
        };
    L46:
        switch(r10) {
            case 0: goto L58;
            case 1: goto L57;
            case 2: goto L56;
            case 3: goto L55;
            case 4: goto L54;
            case 5: goto L53;
            default: goto L48;
        };
    L53:
        r0.f7123i = r11.m3575s();
        goto L18
    L54:
        r0.f7122h = r11.m3575s();
        goto L18
    L55:
        r0.f7118d = (EnumC1990f) r11.m3559A(r12, new C1947D(7));
        goto L18
    L56:
        r0.f7119e = r11.m3575s();
        goto L18
    L57:
        r0.f7121g = r11.m3573q();
        goto L18
    L58:
        r0.f7120f = r11.m3573q();
        goto L18
    L48:
        if (r4.equals("source") == true) goto L49;
        if (r32 != null) goto L52;
        r32 = new HashMap();
    L52:
        r11.m3562D(r12, r32, r4);
        goto L18
    L49:
        EnumC1988d r42 = (EnumC1988d) r11.m3559A(r12, new C1947D(r9));
        AbstractC1856a.m4048D("", r42);
        r0.f7117c = r42;
        goto L18
    L23:
        if (r4.equals("pointerId") == false) goto L46;
        r10 = 5;
        goto L46
    L27:
        if (r4.equals("pointerType") == false) goto L46;
        r10 = 4;
        goto L46
    L31:
        if (r4.equals("type") == false) goto L46;
        r10 = 3;
        goto L46
    L35:
        if (r4.equals("id") == false) goto L46;
        r10 = 2;
        goto L46
    L39:
        if (r4.equals("y") == false) goto L46;
        r10 = 1;
        goto L46
    L43:
        if (r4.equals("x") == false) goto L46;
        r10 = 0;
        goto L46
    L59:
        r0.f7125k = r32;
        r11.m3568i();
        goto L4
    L8:
        if (r3.equals("type") == false) goto L10;
        EnumC1987c r33 = (EnumC1987c) r11.m3559A(r12, new C1947D(r5));
        AbstractC1856a.m4048D("", r33);
        r0.f7115a = r33;
        goto L4
    L10:
        if (r3.equals("timestamp") == false) goto L11;
        r0.f7116b = r11.m3578v();
        goto L4
    L11:
        if (r2 != null) goto L13;
        r2 = new HashMap();
    L13:
        r11.m3562D(r12, r2, r3);
        goto L4
    L60:
        r0.f7124j = r2;
        r11.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: d */
    public static C1993i m4148d(C1559A0 r7, ILogger r8) {
        r7.m3567f();
        C1993i r0 = new C1993i();
        HashMap r2 = null;
    L4:
        if (r7.m3564F() != EnumC2050b.NAME) goto L32;
        String r3 = r7.m3581y();
        r3.getClass();
        if (r3.equals("data") == false) goto L8;
        r7.m3567f();
        HashMap r32 = null;
    L18:
        if (r7.m3564F() != EnumC2050b.NAME) goto L31;
        String r4 = r7.m3581y();
        r4.getClass();
        if (r4.equals("pointerId") == false) goto L22;
        r0.f7131d = r7.m3575s();
        goto L18
    L22:
        if (r4.equals("positions") == false) goto L24;
        r0.f7132e = r7.m3577u(r8, new C1947D(9));
        goto L18
    L24:
        if (r4.equals("source") == true) goto L25;
        if (r32 != null) goto L28;
        r32 = new HashMap();
    L28:
        r7.m3562D(r8, r32, r4);
        goto L18
    L25:
        EnumC1988d r42 = (EnumC1988d) r7.m3559A(r8, new C1947D(5));
        AbstractC1856a.m4048D("", r42);
        r0.f7117c = r42;
        goto L18
    L31:
        r0.f7134g = r32;
        r7.m3568i();
        goto L4
    L8:
        if (r3.equals("type") == false) goto L10;
        EnumC1987c r33 = (EnumC1987c) r7.m3559A(r8, new C1947D(4));
        AbstractC1856a.m4048D("", r33);
        r0.f7115a = r33;
        goto L4
    L10:
        if (r3.equals("timestamp") == false) goto L11;
        r0.f7116b = r7.m3578v();
        goto L4
    L11:
        if (r2 != null) goto L13;
        r2 = new HashMap();
    L13:
        r7.m3562D(r8, r2, r3);
        goto L4
    L32:
        r0.f7133f = r2;
        r7.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: e */
    public static C1994j m4149e(C1559A0 r9, ILogger r10) {
        r9.m3567f();
        C1994j r0 = new C1994j();
        HashMap r2 = null;
    L4:
        if (r9.m3564F() != EnumC2050b.NAME) goto L53;
        String r3 = r9.m3581y();
        r3.getClass();
        if (r3.equals("data") == false) goto L8;
        r9.m3567f();
        AbstractMap r32 = null;
    L18:
        if (r9.m3564F() != EnumC2050b.NAME) goto L52;
        String r4 = r9.m3581y();
        r4.getClass();
        int r7 = 0;
        byte r8 = -1;
        switch(r4.hashCode()) {
            case -1221029593: goto L31;
            case 3211051: goto L27;
            case 113126854: goto L23;
            default: goto L34;
        };
    L34:
        switch(r8) {
            case 0: goto L47;
            case 1: goto L43;
            case 2: goto L38;
            default: goto L35;
        };
    L38:
        Integer r42 = r9.m3576t();
        if (r42 == null) goto L42;
        r7 = r42.intValue();
    L42:
        r0.f7137e = r7;
        goto L18
    L43:
        String r43 = r9.m3561C();
        if (r43 != null) goto L46;
        r43 = "";
    L46:
        r0.f7135c = r43;
        goto L18
    L47:
        Integer r44 = r9.m3576t();
        if (r44 == null) goto L51;
        r7 = r44.intValue();
    L51:
        r0.f7136d = r7;
        goto L18
    L35:
        if (r32 != null) goto L37;
        r32 = new ConcurrentHashMap();
    L37:
        r9.m3562D(r10, r32, r4);
        goto L18
    L23:
        if (r4.equals("width") == false) goto L34;
        r8 = 2;
        goto L34
    L27:
        if (r4.equals("href") == false) goto L34;
        r8 = 1;
        goto L34
    L31:
        if (r4.equals("height") == false) goto L34;
        r8 = 0;
        goto L34
    L52:
        r9.m3568i();
        goto L4
    L8:
        if (r3.equals("type") == false) goto L10;
        EnumC1987c r33 = (EnumC1987c) r9.m3559A(r10, new C1947D(4));
        AbstractC1856a.m4048D("", r33);
        r0.f7115a = r33;
        goto L4
    L10:
        if (r3.equals("timestamp") == false) goto L11;
        r0.f7116b = r9.m3578v();
        goto L4
    L11:
        if (r2 != null) goto L13;
        r2 = new HashMap();
    L13:
        r9.m3562D(r10, r2, r3);
        goto L4
    L53:
        r0.f7138f = r2;
        r9.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: f */
    public static C1996l m4150f(C1559A0 r11, ILogger r12) {
        r11.m3567f();
        C1996l r0 = new C1996l();
        HashMap r2 = null;
    L4:
        if (r11.m3564F() != EnumC2050b.NAME) goto L69;
        String r3 = r11.m3581y();
        r3.getClass();
        int r6 = 4;
        if (r3.equals("data") == false) goto L8;
        r11.m3567f();
        ConcurrentHashMap r32 = null;
    L18:
        if (r11.m3564F() != EnumC2050b.NAME) goto L68;
        String r5 = r11.m3581y();
        r5.getClass();
        if (r5.equals("payload") == false) goto L22;
        r11.m3567f();
        ConcurrentHashMap r52 = null;
    L32:
        if (r11.m3564F() != EnumC2050b.NAME) goto L67;
        String r8 = r11.m3581y();
        r8.getClass();
        byte r10 = -1;
        switch(r8.hashCode()) {
            case -1724546052: goto L53;
            case -356088197: goto L49;
            case -299216172: goto L45;
            case 3553: goto L41;
            case 3076010: goto L37;
            default: goto L56;
        };
    L56:
        switch(r10) {
            case 0: goto L66;
            case 1: goto L65;
            case 2: goto L64;
            case 3: goto L63;
            case 4: goto L60;
            default: goto L57;
        };
    L60:
        ConcurrentHashMap r82 = AbstractC1856a.m4045A((Map) r11.m3582z());
        if (r82 == null) goto L32;
        r0.f7146h = r82;
        goto L32
    L63:
        r0.f7142d = r11.m3561C();
        goto L32
    L64:
        r0.f7144f = r11.m3571o();
        goto L32
    L65:
        r0.f7145g = r11.m3571o();
        goto L32
    L66:
        r0.f7143e = r11.m3561C();
        goto L32
    L57:
        if (r52 != null) goto L59;
        r52 = new ConcurrentHashMap();
    L59:
        r11.m3562D(r12, r52, r8);
        goto L32
    L37:
        if (r8.equals("data") == false) goto L56;
        r10 = 4;
        goto L56
    L41:
        if (r8.equals("op") == false) goto L56;
        r10 = 3;
        goto L56
    L45:
        if (r8.equals("startTimestamp") == false) goto L56;
        r10 = 2;
        goto L56
    L49:
        if (r8.equals("endTimestamp") == false) goto L56;
        r10 = 1;
        goto L56
    L53:
        if (r8.equals("description") == false) goto L56;
        r10 = 0;
        goto L56
    L67:
        r0.f7148j = r52;
        r11.m3568i();
        goto L18
    L22:
        if (r5.equals("tag") == false) goto L23;
        String r53 = r11.m3561C();
        if (r53 != null) goto L29;
        r53 = "";
    L29:
        r0.f7141c = r53;
        goto L18
    L23:
        if (r32 != null) goto L25;
        r32 = new ConcurrentHashMap();
    L25:
        r11.m3562D(r12, r32, r5);
        goto L18
    L68:
        r0.f7149k = r32;
        r11.m3568i();
        goto L4
    L8:
        if (r3.equals("type") == false) goto L10;
        EnumC1987c r33 = (EnumC1987c) r11.m3559A(r12, new C1947D(r6));
        AbstractC1856a.m4048D("", r33);
        r0.f7115a = r33;
        goto L4
    L10:
        if (r3.equals("timestamp") == false) goto L11;
        r0.f7116b = r11.m3578v();
        goto L4
    L11:
        if (r2 != null) goto L13;
        r2 = new HashMap();
    L13:
        r11.m3562D(r12, r2, r3);
        goto L4
    L69:
        r0.f7147i = r2;
        r11.m3568i();
        return r0;
    }

    /* JADX INFO: renamed from: g */
    public static C1997m m4151g(C1559A0 r11, ILogger r12) {
        r11.m3567f();
        C1997m r0 = new C1997m();
        HashMap r2 = null;
    L4:
        if (r11.m3564F() != EnumC2050b.NAME) goto L139;
        String r3 = r11.m3581y();
        r3.getClass();
        int r5 = 4;
        if (r3.equals("data") == false) goto L8;
        r11.m3567f();
        ConcurrentHashMap r32 = null;
    L18:
        if (r11.m3564F() != EnumC2050b.NAME) goto L138;
        String r4 = r11.m3581y();
        r4.getClass();
        if (r4.equals("payload") == false) goto L22;
        r11.m3567f();
        ConcurrentHashMap r42 = null;
    L32:
        if (r11.m3564F() != EnumC2050b.NAME) goto L137;
        String r7 = r11.m3581y();
        r7.getClass();
        int r9 = 0;
        byte r10 = -1;
        switch(r7.hashCode()) {
            case -1992012396: goto L81;
            case -1627805778: goto L77;
            case -1221029593: goto L73;
            case -410956671: goto L69;
            case -296512606: goto L65;
            case 115029: goto L61;
            case 3317767: goto L57;
            case 3530753: goto L53;
            case 113126854: goto L49;
            case 545057773: goto L45;
            case 1711222099: goto L41;
            case 2135109831: goto L37;
            default: goto L84;
        };
    L84:
        switch(r10) {
            case 0: goto L136;
            case 1: goto L135;
            case 2: goto L130;
            case 3: goto L126;
            case 4: goto L121;
            case 5: goto L116;
            case 6: goto L111;
            case 7: goto L106;
            case 8: goto L101;
            case 9: goto L96;
            case 10: goto L92;
            case 11: goto L88;
            default: goto L85;
        };
    L88:
        String r72 = r11.m3561C();
        if (r72 != null) goto L91;
        r72 = "";
    L91:
        r0.f7159l = r72;
        goto L32
    L92:
        String r73 = r11.m3561C();
        if (r73 != null) goto L95;
        r73 = "";
    L95:
        r0.f7154g = r73;
        goto L32
    L96:
        Integer r74 = r11.m3576t();
        if (r74 == null) goto L100;
        r9 = r74.intValue();
    L100:
        r0.f7160m = r9;
        goto L32
    L101:
        Integer r75 = r11.m3576t();
        if (r75 == null) goto L105;
        r9 = r75.intValue();
    L105:
        r0.f7157j = r9;
        goto L32
    L106:
        Long r76 = r11.m3579w();
        if (r76 != null) goto L109;
        long r77 = 0;
    L110:
        r0.f7152e = r77;
        goto L32
    L109:
        r77 = r76.longValue();
        goto L110
    L111:
        Integer r78 = r11.m3576t();
        if (r78 == null) goto L115;
        r9 = r78.intValue();
    L115:
        r0.f7161n = r9;
        goto L32
    L116:
        Integer r79 = r11.m3576t();
        if (r79 == null) goto L120;
        r9 = r79.intValue();
    L120:
        r0.f7162o = r9;
        goto L32
    L121:
        Integer r710 = r11.m3576t();
        if (r710 == null) goto L125;
        r9 = r710.intValue();
    L125:
        r0.f7158k = r9;
        goto L32
    L126:
        String r711 = r11.m3561C();
        if (r711 != null) goto L129;
        r711 = "";
    L129:
        r0.f7155h = r711;
        goto L32
    L130:
        Integer r712 = r11.m3576t();
        if (r712 == null) goto L134;
        r9 = r712.intValue();
    L134:
        r0.f7156i = r9;
        goto L32
    L135:
        r0.f7151d = r11.m3575s();
        goto L32
    L136:
        r0.f7153f = r11.m3578v();
        goto L32
    L85:
        if (r42 != null) goto L87;
        r42 = new ConcurrentHashMap();
    L87:
        r11.m3562D(r12, r42, r7);
        goto L32
    L37:
        if (r7.equals("frameRateType") == false) goto L84;
        r10 = 11;
        goto L84
    L41:
        if (r7.equals("encoding") == false) goto L84;
        r10 = 10;
        goto L84
    L45:
        if (r7.equals("frameRate") == false) goto L84;
        r10 = 9;
        goto L84
    L49:
        if (r7.equals("width") == false) goto L84;
        r10 = 8;
        goto L84
    L53:
        if (r7.equals("size") == false) goto L84;
        r10 = 7;
        goto L84
    L57:
        if (r7.equals("left") == false) goto L84;
        r10 = 6;
        goto L84
    L61:
        if (r7.equals("top") == false) goto L84;
        r10 = 5;
        goto L84
    L65:
        if (r7.equals("frameCount") == false) goto L84;
        r10 = 4;
        goto L84
    L69:
        if (r7.equals("container") == false) goto L84;
        r10 = 3;
        goto L84
    L73:
        if (r7.equals("height") == false) goto L84;
        r10 = 2;
        goto L84
    L77:
        if (r7.equals("segmentId") == false) goto L84;
        r10 = 1;
        goto L84
    L81:
        if (r7.equals("duration") == false) goto L84;
        r10 = 0;
        goto L84
    L137:
        r0.f7164q = r42;
        r11.m3568i();
        goto L18
    L22:
        if (r4.equals("tag") == false) goto L23;
        String r43 = r11.m3561C();
        if (r43 != null) goto L29;
        r43 = "";
    L29:
        r0.f7150c = r43;
        goto L18
    L23:
        if (r32 != null) goto L25;
        r32 = new ConcurrentHashMap();
    L25:
        r11.m3562D(r12, r32, r4);
        goto L18
    L138:
        r0.f7165r = r32;
        r11.m3568i();
        goto L4
    L8:
        if (r3.equals("type") == false) goto L10;
        EnumC1987c r33 = (EnumC1987c) r11.m3559A(r12, new C1947D(r5));
        AbstractC1856a.m4048D("", r33);
        r0.f7115a = r33;
        goto L4
    L10:
        if (r3.equals("timestamp") == false) goto L11;
        r0.f7116b = r11.m3578v();
        goto L4
    L11:
        if (r2 != null) goto L13;
        r2 = new HashMap();
    L13:
        r11.m3562D(r12, r2, r3);
        goto L4
    L139:
        r0.f7163p = r2;
        r11.m3568i();
        return r0;
    }

    @Override // io.sentry.InterfaceC1978q0
    /* JADX INFO: renamed from: a */
    public final Object mo4039a(C1559A0 r17, ILogger r18) {
        String r15 = null;
        HashMap r152 = null;
        HashMap r153 = null;
        int r4 = 2;
        switch(this.f6848a) {
            case 0: goto L135;
            case 1: goto L121;
            case 2: goto L54;
            case 3: goto L53;
            case 4: goto L51;
            case 5: goto L49;
            case 6: goto L47;
            case 7: goto L45;
            case 8: goto L43;
            case 9: goto L10;
            case 10: goto L9;
            case 11: goto L7;
            default: goto L5;
        };
    L10:
        r17.m3567f();
        C1992h r3 = new C1992h();
    L12:
        if (r17.m3564F() != EnumC2050b.NAME) goto L40;
        String r5 = r17.m3581y();
        r5.getClass();
        switch(r5.hashCode()) {
            case 120: goto L29;
            case 121: goto L25;
            case 3355: goto L21;
            case 665490880: goto L17;
            default: goto L15;
        };
    L15:
        char r6 = 65535;
    L32:
        switch(r6) {
            case 0: goto L39;
            case 1: goto L38;
            case 2: goto L37;
            case 3: goto L36;
            default: goto L33;
        };
    L36:
        r3.f7129d = r17.m3578v();
        goto L12
    L37:
        r3.f7126a = r17.m3575s();
        goto L12
    L38:
        r3.f7128c = r17.m3573q();
        goto L12
    L39:
        r3.f7127b = r17.m3573q();
        goto L12
    L33:
        if (r152 != null) goto L35;
        r152 = new HashMap();
    L35:
        r17.m3562D(r18, r152, r5);
        goto L12
    L17:
        if (r5.equals("timeOffset") == false) goto L270;
        r6 = 3;
        goto L32
    L270:
        r6 = 65535;
        goto L32
    L21:
        if (r5.equals("id") == false) goto L271;
        r6 = 2;
        goto L32
    L271:
        r6 = 65535;
        goto L32
    L25:
        if (r5.equals("y") == false) goto L272;
        r6 = 1;
        goto L32
    L272:
        r6 = 65535;
        goto L32
    L29:
        if (r5.equals("x") == false) goto L273;
        r6 = 0;
        goto L32
    L273:
        r6 = 65535;
        goto L32
    L40:
        r3.f7130e = r152;
        r17.m3568i();
        return r3;
    L54:
        C1950G r32 = new C1950G();
        r17.m3567f();
    L56:
        if (r17.m3564F() != EnumC2050b.NAME) goto L119;
        String r52 = r17.m3581y();
        r52.getClass();
        switch(r52.hashCode()) {
            case -1784982718: goto L101;
            case -1618432855: goto L97;
            case -1221029593: goto L93;
            case 120: goto L89;
            case 121: goto L85;
            case 114586: goto L81;
            case 3575610: goto L77;
            case 92909918: goto L73;
            case 113126854: goto L69;
            case 1659526655: goto L65;
            case 1941332754: goto L61;
            default: goto L59;
        };
    L59:
        byte r8 = -1;
    L104:
        switch(r8) {
            case 0: goto L118;
            case 1: goto L117;
            case 2: goto L116;
            case 3: goto L115;
            case 4: goto L114;
            case 5: goto L113;
            case 6: goto L112;
            case 7: goto L111;
            case 8: goto L110;
            case 9: goto L109;
            case 10: goto L108;
            default: goto L105;
        };
    L108:
        r32.f6868i = r17.m3561C();
        goto L56
    L109:
        r32.f6870k = r17.m3577u(r18, this);
        goto L56
    L110:
        r32.f6864e = r17.m3572p();
        goto L56
    L111:
        r32.f6869j = r17.m3572p();
        goto L56
    L112:
        r32.f6861b = r17.m3561C();
        goto L56
    L113:
        r32.f6863d = r17.m3561C();
        goto L56
    L114:
        r32.f6867h = r17.m3572p();
        goto L56
    L115:
        r32.f6866g = r17.m3572p();
        goto L56
    L116:
        r32.f6865f = r17.m3572p();
        goto L56
    L117:
        r32.f6862c = r17.m3561C();
        goto L56
    L118:
        r32.f6860a = r17.m3561C();
        goto L56
    L105:
        if (r153 != null) goto L107;
        r153 = new HashMap();
    L107:
        r17.m3562D(r18, r153, r52);
        goto L56
    L61:
        if (r52.equals("visibility") == false) goto L274;
        r8 = 10;
        goto L104
    L274:
        r8 = -1;
        goto L104
    L65:
        if (r52.equals("children") == false) goto L275;
        r8 = 9;
        goto L104
    L275:
        r8 = -1;
        goto L104
    L69:
        if (r52.equals("width") == false) goto L276;
        r8 = 8;
        goto L104
    L276:
        r8 = -1;
        goto L104
    L73:
        if (r52.equals("alpha") == false) goto L277;
        r8 = 7;
        goto L104
    L277:
        r8 = -1;
        goto L104
    L77:
        if (r52.equals("type") == false) goto L278;
        r8 = 6;
        goto L104
    L278:
        r8 = -1;
        goto L104
    L81:
        if (r52.equals("tag") == false) goto L279;
        r8 = 5;
        goto L104
    L279:
        r8 = -1;
        goto L104
    L85:
        if (r52.equals("y") == false) goto L280;
        r8 = 4;
        goto L104
    L280:
        r8 = -1;
        goto L104
    L89:
        if (r52.equals("x") == false) goto L281;
        r8 = 3;
        goto L104
    L281:
        r8 = -1;
        goto L104
    L93:
        if (r52.equals("height") == false) goto L282;
        r8 = 2;
        goto L104
    L282:
        r8 = -1;
        goto L104
    L97:
        if (r52.equals("identifier") == false) goto L283;
        r8 = 1;
        goto L104
    L283:
        r8 = -1;
        goto L104
    L101:
        if (r52.equals("rendering_system") == false) goto L284;
        r8 = 0;
        goto L104
    L284:
        r8 = -1;
        goto L104
    L119:
        r17.m3568i();
        r32.f6871l = r153;
        return r32;
    L121:
        r17.m3567f();
        ArrayList r33 = null;
        HashMap r53 = null;
    L123:
        if (r17.m3564F() != EnumC2050b.NAME) goto L133;
        String r62 = r17.m3581y();
        r62.getClass();
        if (r62.equals("rendering_system") == false) goto L127;
        r15 = r17.m3561C();
        goto L123
    L127:
        if (r62.equals("windows") == false) goto L128;
        r33 = r17.m3577u(r18, new C1947D(r4));
        goto L123
    L128:
        if (r53 != null) goto L130;
        r53 = new HashMap();
    L130:
        r17.m3562D(r18, r53, r62);
        goto L123
    L133:
        r17.m3568i();
        C1949F r1 = new C1949F(r15, r33);
        r1.f6859c = r53;
        return r1;
    L135:
        r17.m3567f();
        C1948E r34 = new C1948E();
        ConcurrentHashMap r54 = null;
    L137:
        if (r17.m3564F() != EnumC2050b.NAME) goto L207;
        String r7 = r17.m3581y();
        r7.getClass();
        switch(r7.hashCode()) {
            case -265713450: goto L166;
            case 3355: goto L162;
            case 102225: goto L158;
            case 3076010: goto L154;
            case 3373707: goto L150;
            case 96619420: goto L146;
            case 1480014044: goto L142;
            default: goto L140;
        };
    L140:
        int r9 = -1;
    L169:
        switch(r9) {
            case 0: goto L205;
            case 1: goto L204;
            case 2: goto L177;
            case 3: goto L176;
            case 4: goto L175;
            case 5: goto L174;
            case 6: goto L173;
            default: goto L170;
        };
    L170:
        if (r54 != null) goto L172;
        r54 = new ConcurrentHashMap();
    L172:
        r17.m3562D(r18, r54, r7);
    L206:
        r4 = 2;
        goto L137
    L173:
        r34.f6852d = r17.m3561C();
        goto L206
    L174:
        r34.f6849a = r17.m3561C();
        goto L206
    L175:
        r34.f6853e = r17.m3561C();
        goto L206
    L176:
        r34.f6855g = AbstractC1856a.m4045A((Map) r17.m3582z());
        goto L206
    L177:
        r17.m3567f();
        C1958h r72 = new C1958h();
        ConcurrentHashMap r92 = null;
    L179:
        if (r17.m3564F() != EnumC2050b.NAME) goto L203;
        String r42 = r17.m3581y();
        r42.getClass();
        switch(r42.hashCode()) {
            case -934795532: goto L192;
            case 3053931: goto L188;
            case 1481071862: goto L184;
            default: goto L182;
        };
    L182:
        byte r10 = -1;
    L195:
        switch(r10) {
            case 0: goto L201;
            case 1: goto L200;
            case 2: goto L199;
            default: goto L196;
        };
    L196:
        if (r92 != null) goto L198;
        r92 = new ConcurrentHashMap();
    L198:
        r17.m3562D(r18, r92, r42);
        goto L179
    L199:
        r72.f6937b = r17.m3561C();
        goto L179
    L200:
        r72.f6936a = r17.m3561C();
        goto L179
    L201:
        r72.f6938c = r17.m3561C();
        goto L179
    L184:
        if (r42.equals("country_code") == false) goto L292;
        r10 = 2;
        goto L195
    L292:
        r10 = -1;
        goto L195
    L188:
        if (r42.equals("city") == false) goto L293;
        r10 = 1;
        goto L195
    L293:
        r10 = -1;
        goto L195
    L192:
        if (r42.equals("region") == false) goto L294;
        r10 = 0;
        goto L195
    L294:
        r10 = -1;
        goto L195
    L203:
        r72.f6939d = r92;
        r17.m3568i();
        r34.f6854f = r72;
        goto L206
    L204:
        r34.f6850b = r17.m3561C();
        goto L206
    L205:
        r34.f6851c = r17.m3561C();
        goto L206
    L142:
        if (r7.equals("ip_address") == false) goto L285;
        r9 = 6;
        goto L169
    L285:
        r9 = -1;
        goto L169
    L146:
        if (r7.equals("email") == false) goto L286;
        r9 = 5;
        goto L169
    L286:
        r9 = -1;
        goto L169
    L150:
        if (r7.equals("name") == false) goto L287;
        r9 = 4;
        goto L169
    L287:
        r9 = -1;
        goto L169
    L154:
        if (r7.equals("data") == false) goto L288;
        r9 = 3;
        goto L169
    L288:
        r9 = -1;
        goto L169
    L158:
        if (r7.equals("geo") == false) goto L289;
        r9 = r4;
        goto L169
    L289:
        r9 = -1;
        goto L169
    L162:
        if (r7.equals("id") == false) goto L290;
        r9 = 1;
        goto L169
    L290:
        r9 = -1;
        goto L169
    L166:
        if (r7.equals("username") == false) goto L291;
        r9 = 0;
        goto L169
    L291:
        r9 = -1;
        goto L169
    L207:
        r34.f6856h = r54;
        r17.m3568i();
        return r34;
    L5:
        return m4151g(r17, r18);
    L7:
        return m4150f(r17, r18);
    L9:
        return m4149e(r17, r18);
    L43:
        return m4148d(r17, r18);
    L45:
        return EnumC1990f.values()[r17.m3575s()];
    L47:
        return m4147c(r17, r18);
    L49:
        return EnumC1988d.values()[r17.m3575s()];
    L51:
        return EnumC1987c.values()[r17.m3575s()];
    L53:
        return m4146b(r17, r18);
    }
}
