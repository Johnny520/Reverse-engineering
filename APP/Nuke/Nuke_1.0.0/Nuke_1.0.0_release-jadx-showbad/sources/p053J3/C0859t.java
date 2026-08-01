package p053J3;

import com.bumptech.glide.AbstractC1922d;
import me.dartcv.nuke.BuildConfig;
import p011B4.AbstractC0231b;
import p056K2.InterfaceC0875a;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p214o3.C2801d;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p227r.C2981c0;
import p231r3.InterfaceC3151a;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;
import p236s3.AbstractC3194j;
import p236s3.AbstractC3200p;
import p236s3.C3192h;
import p236s3.C3196l;
import p236s3.C3201q;
import p236s3.InterfaceC3190f;
import p237s4.AbstractC3202a;
import p248u3.C3343g;

/* JADX INFO: renamed from: J3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0859t {
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

    /* JADX INFO: renamed from: J3.t$a */
    @InterfaceC0875a
    public static final /* synthetic */ class a implements InterfaceC3190f {
        public static final int $stable;
        public static final a INSTANCE;
        private static final InterfaceC2933d descriptor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            a aVar = new a();
            INSTANCE = aVar;
            $stable = 8;
            C3196l c3196l = new C3196l("nuke.data.model.HookerDebugRecord", aVar, 8);
            c3196l.m5464l("hookerId", false);
            c3196l.m5464l("hookerClassName", false);
            c3196l.m5464l("phase", false);
            c3196l.m5464l("reason", false);
            c3196l.m5464l("throwableClassName", true);
            c3196l.m5464l("throwableMessage", true);
            c3196l.m5464l("stackTrace", true);
            c3196l.m5464l("timestamp", true);
            descriptor = c3196l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: a */
        public final InterfaceC2798a[] mo1482a() {
            C3201q c3201q = C3201q.f9974a;
            return new InterfaceC2798a[]{c3201q, c3201q, c3201q, c3201q, AbstractC1922d.m3431l(c3201q), AbstractC1922d.m3431l(c3201q), AbstractC1922d.m3431l(c3201q), C3192h.f9948a};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p236s3.InterfaceC3190f
        /* JADX INFO: renamed from: d */
        public /* bridge */ InterfaceC2798a[] mo1485d() {
            return AbstractC3194j.f9953b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: e */
        public final InterfaceC2933d mo1486e() {
            return descriptor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: b(Lr3/b;)Ljava/lang/Object; */
        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C0859t mo1483b(InterfaceC3152b interfaceC3152b) {
            AbstractC1665j.m2985e(interfaceC3152b, "decoder");
            InterfaceC2933d interfaceC2933d = descriptor;
            C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
            int i5 = 0;
            String strM5595n = null;
            String strM5595n2 = null;
            String strM5595n3 = null;
            String strM5595n4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            long jM5592k = 0;
            boolean z5 = true;
            while (z5) {
                int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
                switch (iM5590i) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        strM5595n = c3343gMo5422a.m5595n(interfaceC2933d, 0);
                        i5 |= 1;
                        break;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        strM5595n2 = c3343gMo5422a.m5595n(interfaceC2933d, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        strM5595n3 = c3343gMo5422a.m5595n(interfaceC2933d, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        strM5595n4 = c3343gMo5422a.m5595n(interfaceC2933d, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        C3201q c3201q = C3201q.f9974a;
                        str = (String) c3343gMo5422a.m5593l(interfaceC2933d, 4, str);
                        i5 |= 16;
                        break;
                    case 5:
                        C3201q c3201q2 = C3201q.f9974a;
                        str2 = (String) c3343gMo5422a.m5593l(interfaceC2933d, 5, str2);
                        i5 |= 32;
                        break;
                    case 6:
                        C3201q c3201q3 = C3201q.f9974a;
                        str3 = (String) c3343gMo5422a.m5593l(interfaceC2933d, 6, str3);
                        i5 |= 64;
                        break;
                    case 7:
                        jM5592k = c3343gMo5422a.m5592k(interfaceC2933d, 7);
                        i5 |= 128;
                        break;
                    default:
                        throw new C2801d(iM5590i);
                }
            }
            c3343gMo5422a.m5596o(interfaceC2933d);
            return new C0859t(i5, strM5595n, strM5595n2, strM5595n3, strM5595n4, str, str2, str3, jM5592k, (AbstractC3200p) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: c(Lr3/c;Ljava/lang/Object;)V */
        @Override // p214o3.InterfaceC2798a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo1484c(InterfaceC3153c interfaceC3153c, C0859t c0859t) {
            AbstractC1665j.m2985e(interfaceC3153c, "encoder");
            AbstractC1665j.m2985e(c0859t, "value");
            InterfaceC2933d interfaceC2933d = descriptor;
            InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
            C0859t.m1819s(c0859t, interfaceC3151aMo5177a, interfaceC2933d);
            interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
        }
    }

    /* JADX INFO: renamed from: J3.t$b */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: J3.t.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(AbstractC1661f abstractC1661f) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final InterfaceC2798a serializer() {
            return a.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private b() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0859t(int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j5, AbstractC3200p abstractC3200p) {
        if (15 != (i5 & 15)) {
            AbstractC3194j.m5462d(i5, 15, a.INSTANCE.mo1486e());
            throw null;
        }
        this.hookerId = str;
        this.hookerClassName = str2;
        this.phase = str3;
        this.reason = str4;
        if ((i5 & 16) == 0) {
            this.throwableClassName = null;
        } else {
            this.throwableClassName = str5;
        }
        if ((i5 & 32) == 0) {
            this.throwableMessage = null;
        } else {
            this.throwableMessage = str6;
        }
        if ((i5 & 64) == 0) {
            this.stackTrace = null;
        } else {
            this.stackTrace = str7;
        }
        if ((i5 & 128) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C0859t m1818j(C0859t c0859t, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0859t.hookerId;
        }
        if ((i5 & 2) != 0) {
            str2 = c0859t.hookerClassName;
        }
        if ((i5 & 4) != 0) {
            str3 = c0859t.phase;
        }
        if ((i5 & 8) != 0) {
            str4 = c0859t.reason;
        }
        if ((i5 & 16) != 0) {
            str5 = c0859t.throwableClassName;
        }
        if ((i5 & 32) != 0) {
            str6 = c0859t.throwableMessage;
        }
        if ((i5 & 64) != 0) {
            str7 = c0859t.stackTrace;
        }
        if ((i5 & 128) != 0) {
            j5 = c0859t.timestamp;
        }
        long j6 = j5;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return c0859t.m1828i(str, str2, str11, str4, str10, str8, str9, j6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ void m1819s(C0859t c0859t, InterfaceC3151a interfaceC3151a, InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0 = (C2981c0) interfaceC3151a;
        c2981c0.m5193s(interfaceC2933d, 0, c0859t.hookerId);
        c2981c0.m5193s(interfaceC2933d, 1, c0859t.hookerClassName);
        c2981c0.m5193s(interfaceC2933d, 2, c0859t.phase);
        c2981c0.m5193s(interfaceC2933d, 3, c0859t.reason);
        if (c2981c0.mo5180d(interfaceC2933d) || c0859t.throwableClassName != null) {
            C3201q c3201q = C3201q.f9974a;
            c2981c0.mo5181e(interfaceC2933d, 4, c0859t.throwableClassName);
        }
        if (c2981c0.mo5180d(interfaceC2933d) || c0859t.throwableMessage != null) {
            C3201q c3201q2 = C3201q.f9974a;
            c2981c0.mo5181e(interfaceC2933d, 5, c0859t.throwableMessage);
        }
        if (c2981c0.mo5180d(interfaceC2933d) || c0859t.stackTrace != null) {
            C3201q c3201q3 = C3201q.f9974a;
            c2981c0.mo5181e(interfaceC2933d, 6, c0859t.stackTrace);
        }
        if (!c2981c0.mo5180d(interfaceC2933d) && c0859t.timestamp == System.currentTimeMillis()) {
            return;
        }
        c2981c0.m5191q(interfaceC2933d, 7, c0859t.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1820a() {
        return this.hookerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1821b() {
        return this.hookerClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m1822c() {
        return this.phase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1823d() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1824e() {
        return this.throwableClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0859t)) {
            return false;
        }
        C0859t c0859t = (C0859t) obj;
        return AbstractC1665j.m2981a(this.hookerId, c0859t.hookerId) && AbstractC1665j.m2981a(this.hookerClassName, c0859t.hookerClassName) && AbstractC1665j.m2981a(this.phase, c0859t.phase) && AbstractC1665j.m2981a(this.reason, c0859t.reason) && AbstractC1665j.m2981a(this.throwableClassName, c0859t.throwableClassName) && AbstractC1665j.m2981a(this.throwableMessage, c0859t.throwableMessage) && AbstractC1665j.m2981a(this.stackTrace, c0859t.stackTrace) && this.timestamp == c0859t.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1825f() {
        return this.throwableMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m1826g() {
        return this.stackTrace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final long m1827h() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iM394e = AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m394e(this.hookerId.hashCode() * 31, 31, this.hookerClassName), 31, this.phase), 31, this.reason);
        String str = this.throwableClassName;
        int iHashCode = (iM394e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.throwableMessage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stackTrace;
        return Long.hashCode(this.timestamp) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final C0859t m1828i(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j5) {
        AbstractC1665j.m2985e(str, "hookerId");
        AbstractC1665j.m2985e(str2, "hookerClassName");
        AbstractC1665j.m2985e(str3, "phase");
        AbstractC1665j.m2985e(str4, "reason");
        return new C0859t(str, str2, str3, str4, str5, str6, str7, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m1829k() {
        return this.hookerClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m1830l() {
        return this.hookerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m1831m() {
        return this.phase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m1832n() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final String m1833o() {
        return this.stackTrace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final String m1834p() {
        return this.throwableClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m1835q() {
        return this.throwableMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final long m1836r() {
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
        long j5 = this.timestamp;
        StringBuilder sbM405p = AbstractC0231b.m405p("HookerDebugRecord(hookerId=", str, ", hookerClassName=", str2, ", phase=");
        AbstractC3202a.m5468c(sbM405p, str3, ", reason=", str4, ", throwableClassName=");
        AbstractC3202a.m5468c(sbM405p, str5, ", throwableMessage=", str6, ", stackTrace=");
        sbM405p.append(str7);
        sbM405p.append(", timestamp=");
        sbM405p.append(j5);
        sbM405p.append(")");
        return sbM405p.toString();
    }

    public C0859t(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j5) {
        AbstractC1665j.m2985e(str, "hookerId");
        AbstractC1665j.m2985e(str2, "hookerClassName");
        AbstractC1665j.m2985e(str3, "phase");
        AbstractC1665j.m2985e(str4, "reason");
        this.hookerId = str;
        this.hookerClassName = str2;
        this.phase = str3;
        this.reason = str4;
        this.throwableClassName = str5;
        this.throwableMessage = str6;
        this.stackTrace = str7;
        this.timestamp = j5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r11v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0014: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:13)) : (r9v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:14) call: J3.t.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ C0859t(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j5, int i5, AbstractC1661f abstractC1661f) {
        this(str, str2, str3, str4, (i5 & 16) != 0 ? null : str5, (i5 & 32) != 0 ? null : str6, (i5 & 64) != 0 ? null : str7, (i5 & 128) != 0 ? System.currentTimeMillis() : j5);
    }
}
