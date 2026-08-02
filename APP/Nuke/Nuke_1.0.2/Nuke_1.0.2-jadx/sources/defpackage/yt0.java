package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yt0 {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String hookerClassName;
    private final String hookerId;
    private final String phase;
    private final String reason;
    private final String stackTrace;
    private final String throwableClassName;
    private final String throwableMessage;
    private final long timestamp;

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class a implements qo0 {
        public static final int $stable = 0;
        public static final a INSTANCE;
        private static final yo2 descriptor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            a aVar = new a();
            INSTANCE = aVar;
            b12 b12Var = new b12("nuke.data.model.HookerDebugRecord", aVar, 8);
            b12Var.l("hookerId", false);
            b12Var.l("hookerClassName", false);
            b12Var.l("phase", false);
            b12Var.l("reason", false);
            b12Var.l("throwableClassName", true);
            b12Var.l("throwableMessage", true);
            b12Var.l("stackTrace", true);
            b12Var.l("timestamp", true);
            descriptor = b12Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public final w41[] b() {
            nv2 nv2Var = nv2.a;
            return new w41[]{nv2Var, nv2Var, nv2Var, nv2Var, se.D(nv2Var), se.D(nv2Var), se.D(nv2Var), ed1.a};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public /* bridge */ w41[] c() {
            return p40.l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.w41
        public final yo2 e() {
            return descriptor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: a(Ly40;)Ljava/lang/Object; */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final yt0 a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            vx vxVarB = y40Var.b(yo2Var);
            int i = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            String strN4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            long jZ = 0;
            boolean z = true;
            while (z) {
                int iJ = vxVarB.j(yo2Var);
                switch (iJ) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strN = vxVarB.n(yo2Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        strN2 = vxVarB.n(yo2Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        strN3 = vxVarB.n(yo2Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        strN4 = vxVarB.n(yo2Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        nv2 nv2Var = nv2.a;
                        str = (String) vxVarB.x(yo2Var, 4, str);
                        i |= 16;
                        break;
                    case 5:
                        nv2 nv2Var2 = nv2.a;
                        str2 = (String) vxVarB.x(yo2Var, 5, str2);
                        i |= 32;
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        nv2 nv2Var3 = nv2.a;
                        str3 = (String) vxVarB.x(yo2Var, 6, str3);
                        i |= 64;
                        break;
                    case 7:
                        jZ = vxVarB.z(yo2Var, 7);
                        i |= 128;
                        break;
                    default:
                        throw new e83(iJ);
                }
            }
            vxVarB.a(yo2Var);
            return new yt0(i, strN, strN2, strN3, strN4, str, str2, str3, jZ, (dp2) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: d(Lve0;Ljava/lang/Object;)V */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void d(ve0 ve0Var, yt0 yt0Var) {
            ve0Var.getClass();
            yt0Var.getClass();
            yo2 yo2Var = descriptor;
            wx wxVarB = ve0Var.b(yo2Var);
            yt0.s(yt0Var, wxVarB, yo2Var);
            wxVarB.a(yo2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ yt0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, dp2 dp2Var) {
        if (15 != (i & 15)) {
            eu.b0(i, 15, a.INSTANCE.e());
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ yt0 j(yt0 yt0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, Object obj) {
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
        return yt0Var.i(str, str2, str11, str4, str10, str8, str9, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void s(yt0 yt0Var, wx wxVar, yo2 yo2Var) {
        dv2 dv2Var = (dv2) wxVar;
        dv2Var.x(yo2Var, 0, yt0Var.hookerId);
        dv2Var.x(yo2Var, 1, yt0Var.hookerClassName);
        dv2Var.x(yo2Var, 2, yt0Var.phase);
        dv2Var.x(yo2Var, 3, yt0Var.reason);
        if (dv2Var.d(yo2Var) || yt0Var.throwableClassName != null) {
            nv2 nv2Var = nv2.a;
            dv2Var.h(yo2Var, 4, yt0Var.throwableClassName);
        }
        if (dv2Var.d(yo2Var) || yt0Var.throwableMessage != null) {
            nv2 nv2Var2 = nv2.a;
            dv2Var.h(yo2Var, 5, yt0Var.throwableMessage);
        }
        if (dv2Var.d(yo2Var) || yt0Var.stackTrace != null) {
            nv2 nv2Var3 = nv2.a;
            dv2Var.h(yo2Var, 6, yt0Var.stackTrace);
        }
        if (!dv2Var.d(yo2Var) && yt0Var.timestamp == System.currentTimeMillis()) {
            return;
        }
        dv2Var.v(yo2Var, 7, yt0Var.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.hookerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return this.hookerClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        return this.phase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        return this.throwableClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt0)) {
            return false;
        }
        yt0 yt0Var = (yt0) obj;
        return t11.l(this.hookerId, yt0Var.hookerId) && t11.l(this.hookerClassName, yt0Var.hookerClassName) && t11.l(this.phase, yt0Var.phase) && t11.l(this.reason, yt0Var.reason) && t11.l(this.throwableClassName, yt0Var.throwableClassName) && t11.l(this.throwableMessage, yt0Var.throwableMessage) && t11.l(this.stackTrace, yt0Var.stackTrace) && this.timestamp == yt0Var.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        return this.throwableMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g() {
        return this.stackTrace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iF = hk1.f(this.reason, hk1.f(this.phase, hk1.f(this.hookerClassName, this.hookerId.hashCode() * 31, 31), 31), 31);
        String str = this.throwableClassName;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.throwableMessage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stackTrace;
        return Long.hashCode(this.timestamp) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yt0 i(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new yt0(str, str2, str3, str4, str5, str6, str7, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String k() {
        return this.hookerClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String l() {
        return this.hookerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String m() {
        return this.phase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String n() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String o() {
        return this.stackTrace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String p() {
        return this.throwableClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String q() {
        return this.throwableMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long r() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.hookerId;
        String str2 = this.hookerClassName;
        String str3 = this.phase;
        String str4 = this.reason;
        String str5 = this.throwableClassName;
        String str6 = this.throwableMessage;
        String str7 = this.stackTrace;
        long j = this.timestamp;
        StringBuilder sbO = vi0.o("HookerDebugRecord(hookerId=", str, ", hookerClassName=", str2, ", phase=");
        hk1.o(sbO, str3, ", reason=", str4, ", throwableClassName=");
        hk1.o(sbO, str5, ", throwableMessage=", str6, ", stackTrace=");
        sbO.append(str7);
        sbO.append(", timestamp=");
        sbO.append(j);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: yt0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(c50 c50Var) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final w41 serializer() {
            return a.INSTANCE;
        }

        private b() {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r11v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0014: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:79)) : (r9v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:80) call: yt0.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ yt0(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, c50 c50Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? System.currentTimeMillis() : j);
    }
}
