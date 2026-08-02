package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yt0 {
    public static final int $stable = 0;
    public static final C0937b Companion = new C0937b(null);
    private final String hookerClassName;
    private final String hookerId;
    private final String phase;
    private final String reason;
    private final String stackTrace;
    private final String throwableClassName;
    private final String throwableMessage;
    private final long timestamp;

    /* JADX INFO: renamed from: yt0$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0936a implements qo0 {
        public static final int $stable = 0;
        public static final C0936a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0936a c0936a = new C0936a();
            INSTANCE = c0936a;
            b12 b12Var = new b12("nuke.data.model.HookerDebugRecord", c0936a, 8);
            b12Var.m359l("hookerId", false);
            b12Var.m359l("hookerClassName", false);
            b12Var.m359l("phase", false);
            b12Var.m359l("reason", false);
            b12Var.m359l("throwableClassName", true);
            b12Var.m359l("throwableMessage", true);
            b12Var.m359l("stackTrace", true);
            b12Var.m359l("timestamp", true);
            descriptor = b12Var;
        }

        private C0936a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            nv2 nv2Var = nv2.f7346a;
            return new w41[]{nv2Var, nv2Var, nv2Var, nv2Var, AbstractC0691se.m4815D(nv2Var), AbstractC0691se.m4815D(nv2Var), AbstractC0691se.m4815D(nv2Var), ed1.f2399a};
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: c */
        public /* bridge */ w41[] mo3344c() {
            return p40.f7976l;
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: e */
        public final yo2 mo168e() {
            return descriptor;
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final yt0 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            int i = 0;
            String strMo4563n = null;
            String strMo4563n2 = null;
            String strMo4563n3 = null;
            String strMo4563n4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            long jMo4568z = 0;
            boolean z = true;
            while (z) {
                int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
                switch (iMo901j) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        strMo4563n3 = interfaceC0826vxMo895b.mo4563n(yo2Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        strMo4563n4 = interfaceC0826vxMo895b.mo4563n(yo2Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        nv2 nv2Var = nv2.f7346a;
                        str = (String) interfaceC0826vxMo895b.mo4567x(yo2Var, 4, str);
                        i |= 16;
                        break;
                    case 5:
                        nv2 nv2Var2 = nv2.f7346a;
                        str2 = (String) interfaceC0826vxMo895b.mo4567x(yo2Var, 5, str2);
                        i |= 32;
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        nv2 nv2Var3 = nv2.f7346a;
                        str3 = (String) interfaceC0826vxMo895b.mo4567x(yo2Var, 6, str3);
                        i |= 64;
                        break;
                    case 7:
                        jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 7);
                        i |= 128;
                        break;
                    default:
                        throw new e83(iMo901j);
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new yt0(i, strMo4563n, strMo4563n2, strMo4563n3, strMo4563n4, str, str2, str3, jMo4568z, (dp2) null);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, yt0 yt0Var) {
            ve0Var.getClass();
            yt0Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            yt0.m6326s(yt0Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ yt0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, dp2 dp2Var) {
        if (15 != (i & 15)) {
            AbstractC0179eu.m1449b0(i, 15, C0936a.INSTANCE.mo168e());
            throw null;
        }
        this.hookerId = str;
        this.hookerClassName = str2;
        this.phase = str3;
        this.reason = str4;
        if ((i & 16) == 0) {
            this.throwableClassName = null;
        } else {
            this.throwableClassName = str5;
        }
        if ((i & 32) == 0) {
            this.throwableMessage = null;
        } else {
            this.throwableMessage = str6;
        }
        if ((i & 64) == 0) {
            this.stackTrace = null;
        } else {
            this.stackTrace = str7;
        }
        if ((i & 128) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j;
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ yt0 m6325j(yt0 yt0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yt0Var.hookerId;
        }
        if ((i & 2) != 0) {
            str2 = yt0Var.hookerClassName;
        }
        if ((i & 4) != 0) {
            str3 = yt0Var.phase;
        }
        if ((i & 8) != 0) {
            str4 = yt0Var.reason;
        }
        if ((i & 16) != 0) {
            str5 = yt0Var.throwableClassName;
        }
        if ((i & 32) != 0) {
            str6 = yt0Var.throwableMessage;
        }
        if ((i & 64) != 0) {
            str7 = yt0Var.stackTrace;
        }
        if ((i & 128) != 0) {
            j = yt0Var.timestamp;
        }
        long j2 = j;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return yt0Var.m6335i(str, str2, str11, str4, str10, str8, str9, j2);
    }

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ void m6326s(yt0 yt0Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1199x(yo2Var, 0, yt0Var.hookerId);
        dv2Var.m1199x(yo2Var, 1, yt0Var.hookerClassName);
        dv2Var.m1199x(yo2Var, 2, yt0Var.phase);
        dv2Var.m1199x(yo2Var, 3, yt0Var.reason);
        if (dv2Var.mo1179d(yo2Var) || yt0Var.throwableClassName != null) {
            nv2 nv2Var = nv2.f7346a;
            dv2Var.mo1183h(yo2Var, 4, yt0Var.throwableClassName);
        }
        if (dv2Var.mo1179d(yo2Var) || yt0Var.throwableMessage != null) {
            nv2 nv2Var2 = nv2.f7346a;
            dv2Var.mo1183h(yo2Var, 5, yt0Var.throwableMessage);
        }
        if (dv2Var.mo1179d(yo2Var) || yt0Var.stackTrace != null) {
            nv2 nv2Var3 = nv2.f7346a;
            dv2Var.mo1183h(yo2Var, 6, yt0Var.stackTrace);
        }
        if (!dv2Var.mo1179d(yo2Var) && yt0Var.timestamp == System.currentTimeMillis()) {
            return;
        }
        dv2Var.m1197v(yo2Var, 7, yt0Var.timestamp);
    }

    /* JADX INFO: renamed from: a */
    public final String m6327a() {
        return this.hookerId;
    }

    /* JADX INFO: renamed from: b */
    public final String m6328b() {
        return this.hookerClassName;
    }

    /* JADX INFO: renamed from: c */
    public final String m6329c() {
        return this.phase;
    }

    /* JADX INFO: renamed from: d */
    public final String m6330d() {
        return this.reason;
    }

    /* JADX INFO: renamed from: e */
    public final String m6331e() {
        return this.throwableClassName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt0)) {
            return false;
        }
        yt0 yt0Var = (yt0) obj;
        return t11.m5086l(this.hookerId, yt0Var.hookerId) && t11.m5086l(this.hookerClassName, yt0Var.hookerClassName) && t11.m5086l(this.phase, yt0Var.phase) && t11.m5086l(this.reason, yt0Var.reason) && t11.m5086l(this.throwableClassName, yt0Var.throwableClassName) && t11.m5086l(this.throwableMessage, yt0Var.throwableMessage) && t11.m5086l(this.stackTrace, yt0Var.stackTrace) && this.timestamp == yt0Var.timestamp;
    }

    /* JADX INFO: renamed from: f */
    public final String m6332f() {
        return this.throwableMessage;
    }

    /* JADX INFO: renamed from: g */
    public final String m6333g() {
        return this.stackTrace;
    }

    /* JADX INFO: renamed from: h */
    public final long m6334h() {
        return this.timestamp;
    }

    public int hashCode() {
        int iM2207f = hk1.m2207f(this.reason, hk1.m2207f(this.phase, hk1.m2207f(this.hookerClassName, this.hookerId.hashCode() * 31, 31), 31), 31);
        String str = this.throwableClassName;
        int iHashCode = (iM2207f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.throwableMessage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stackTrace;
        return Long.hashCode(this.timestamp) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final yt0 m6335i(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new yt0(str, str2, str3, str4, str5, str6, str7, j);
    }

    /* JADX INFO: renamed from: k */
    public final String m6336k() {
        return this.hookerClassName;
    }

    /* JADX INFO: renamed from: l */
    public final String m6337l() {
        return this.hookerId;
    }

    /* JADX INFO: renamed from: m */
    public final String m6338m() {
        return this.phase;
    }

    /* JADX INFO: renamed from: n */
    public final String m6339n() {
        return this.reason;
    }

    /* JADX INFO: renamed from: o */
    public final String m6340o() {
        return this.stackTrace;
    }

    /* JADX INFO: renamed from: p */
    public final String m6341p() {
        return this.throwableClassName;
    }

    /* JADX INFO: renamed from: q */
    public final String m6342q() {
        return this.throwableMessage;
    }

    /* JADX INFO: renamed from: r */
    public final long m6343r() {
        return this.timestamp;
    }

    public String toString() {
        String str = this.hookerId;
        String str2 = this.hookerClassName;
        String str3 = this.phase;
        String str4 = this.reason;
        String str5 = this.throwableClassName;
        String str6 = this.throwableMessage;
        String str7 = this.stackTrace;
        long j = this.timestamp;
        StringBuilder sbM5696o = vi0.m5696o("HookerDebugRecord(hookerId=", str, ", hookerClassName=", str2, ", phase=");
        hk1.m2216o(sbM5696o, str3, ", reason=", str4, ", throwableClassName=");
        hk1.m2216o(sbM5696o, str5, ", throwableMessage=", str6, ", stackTrace=");
        sbM5696o.append(str7);
        sbM5696o.append(", timestamp=");
        sbM5696o.append(j);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }

    /* JADX INFO: renamed from: yt0$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0937b {
        public /* synthetic */ C0937b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0936a.INSTANCE;
        }

        private C0937b() {
        }
    }

    public yt0(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.hookerId = str;
        this.hookerClassName = str2;
        this.phase = str3;
        this.reason = str4;
        this.throwableClassName = str5;
        this.throwableMessage = str6;
        this.stackTrace = str7;
        this.timestamp = j;
    }

    public /* synthetic */ yt0(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, c50 c50Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? System.currentTimeMillis() : j);
    }
}
