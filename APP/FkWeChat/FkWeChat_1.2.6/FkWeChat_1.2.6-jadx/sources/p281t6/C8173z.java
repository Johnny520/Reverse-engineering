package p281t6;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.HttpStatusCodesKt;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: t6.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8173z implements Comparable {

    /* JADX INFO: renamed from: u0 */
    public static final List f27467u0;

    /* JADX INFO: renamed from: v0 */
    public static final Map f27469v0;

    /* JADX INFO: renamed from: q */
    public final int f27474q;

    /* JADX INFO: renamed from: r */
    public final String f27475r;

    /* JADX INFO: renamed from: s */
    public static final a f27462s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C8173z f27464t = new C8173z(100, "Continue");

    /* JADX INFO: renamed from: u */
    public static final C8173z f27466u = new C8173z(101, "Switching Protocols");

    /* JADX INFO: renamed from: v */
    public static final C8173z f27468v = new C8173z(HttpStatusCodesKt.HTTP_PROCESSING, "Processing");

    /* JADX INFO: renamed from: w */
    public static final C8173z f27470w = new C8173z(200, "OK");

    /* JADX INFO: renamed from: x */
    public static final C8173z f27471x = new C8173z(201, "Created");

    /* JADX INFO: renamed from: y */
    public static final C8173z f27472y = new C8173z(202, "Accepted");

    /* JADX INFO: renamed from: z */
    public static final C8173z f27473z = new C8173z(203, "Non-Authoritative Information");

    /* JADX INFO: renamed from: A */
    public static final C8173z f27418A = new C8173z(204, "No Content");

    /* JADX INFO: renamed from: B */
    public static final C8173z f27419B = new C8173z(205, "Reset Content");

    /* JADX INFO: renamed from: C */
    public static final C8173z f27420C = new C8173z(206, "Partial Content");

    /* JADX INFO: renamed from: D */
    public static final C8173z f27421D = new C8173z(207, "Multi-Status");

    /* JADX INFO: renamed from: E */
    public static final C8173z f27422E = new C8173z(300, "Multiple Choices");

    /* JADX INFO: renamed from: F */
    public static final C8173z f27423F = new C8173z(301, "Moved Permanently");

    /* JADX INFO: renamed from: G */
    public static final C8173z f27424G = new C8173z(302, "Found");

    /* JADX INFO: renamed from: H */
    public static final C8173z f27425H = new C8173z(303, "See Other");

    /* JADX INFO: renamed from: I */
    public static final C8173z f27426I = new C8173z(304, "Not Modified");

    /* JADX INFO: renamed from: J */
    public static final C8173z f27427J = new C8173z(305, "Use Proxy");

    /* JADX INFO: renamed from: K */
    public static final C8173z f27428K = new C8173z(306, "Switch Proxy");

    /* JADX INFO: renamed from: L */
    public static final C8173z f27429L = new C8173z(HttpStatusCodesKt.HTTP_TEMP_REDIRECT, "Temporary Redirect");

    /* JADX INFO: renamed from: M */
    public static final C8173z f27430M = new C8173z(HttpStatusCodesKt.HTTP_PERM_REDIRECT, "Permanent Redirect");

    /* JADX INFO: renamed from: N */
    public static final C8173z f27431N = new C8173z(400, "Bad Request");

    /* JADX INFO: renamed from: O */
    public static final C8173z f27432O = new C8173z(401, "Unauthorized");

    /* JADX INFO: renamed from: P */
    public static final C8173z f27433P = new C8173z(402, "Payment Required");

    /* JADX INFO: renamed from: Q */
    public static final C8173z f27434Q = new C8173z(403, "Forbidden");

    /* JADX INFO: renamed from: R */
    public static final C8173z f27435R = new C8173z(404, "Not Found");

    /* JADX INFO: renamed from: S */
    public static final C8173z f27436S = new C8173z(405, "Method Not Allowed");

    /* JADX INFO: renamed from: T */
    public static final C8173z f27437T = new C8173z(406, "Not Acceptable");

    /* JADX INFO: renamed from: U */
    public static final C8173z f27438U = new C8173z(407, "Proxy Authentication Required");

    /* JADX INFO: renamed from: V */
    public static final C8173z f27439V = new C8173z(408, "Request Timeout");

    /* JADX INFO: renamed from: W */
    public static final C8173z f27440W = new C8173z(409, "Conflict");

    /* JADX INFO: renamed from: X */
    public static final C8173z f27441X = new C8173z(410, "Gone");

    /* JADX INFO: renamed from: Y */
    public static final C8173z f27442Y = new C8173z(411, "Length Required");

    /* JADX INFO: renamed from: Z */
    public static final C8173z f27443Z = new C8173z(412, "Precondition Failed");

    /* JADX INFO: renamed from: a0 */
    public static final C8173z f27444a0 = new C8173z(413, "Payload Too Large");

    /* JADX INFO: renamed from: b0 */
    public static final C8173z f27445b0 = new C8173z(414, "Request-URI Too Long");

    /* JADX INFO: renamed from: c0 */
    public static final C8173z f27446c0 = new C8173z(415, "Unsupported Media Type");

    /* JADX INFO: renamed from: d0 */
    public static final C8173z f27447d0 = new C8173z(416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: e0 */
    public static final C8173z f27448e0 = new C8173z(417, "Expectation Failed");

    /* JADX INFO: renamed from: f0 */
    public static final C8173z f27449f0 = new C8173z(422, "Unprocessable Entity");

    /* JADX INFO: renamed from: g0 */
    public static final C8173z f27450g0 = new C8173z(423, "Locked");

    /* JADX INFO: renamed from: h0 */
    public static final C8173z f27451h0 = new C8173z(424, "Failed Dependency");

    /* JADX INFO: renamed from: i0 */
    public static final C8173z f27452i0 = new C8173z(425, "Too Early");

    /* JADX INFO: renamed from: j0 */
    public static final C8173z f27453j0 = new C8173z(426, "Upgrade Required");

    /* JADX INFO: renamed from: k0 */
    public static final C8173z f27454k0 = new C8173z(429, "Too Many Requests");

    /* JADX INFO: renamed from: l0 */
    public static final C8173z f27455l0 = new C8173z(431, "Request Header Fields Too Large");

    /* JADX INFO: renamed from: m0 */
    public static final C8173z f27456m0 = new C8173z(500, "Internal Server Error");

    /* JADX INFO: renamed from: n0 */
    public static final C8173z f27457n0 = new C8173z(501, "Not Implemented");

    /* JADX INFO: renamed from: o0 */
    public static final C8173z f27458o0 = new C8173z(502, "Bad Gateway");

    /* JADX INFO: renamed from: p0 */
    public static final C8173z f27459p0 = new C8173z(503, "Service Unavailable");

    /* JADX INFO: renamed from: q0 */
    public static final C8173z f27460q0 = new C8173z(504, "Gateway Timeout");

    /* JADX INFO: renamed from: r0 */
    public static final C8173z f27461r0 = new C8173z(505, "HTTP Version Not Supported");

    /* JADX INFO: renamed from: s0 */
    public static final C8173z f27463s0 = new C8173z(506, "Variant Also Negotiates");

    /* JADX INFO: renamed from: t0 */
    public static final C8173z f27465t0 = new C8173z(507, "Insufficient Storage");

    static {
        List listM31585a = AbstractC8135a0.m31585a();
        f27467u0 = listM31585a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(listM31585a, 10)), 16));
        for (Object obj : listM31585a) {
            linkedHashMap.put(Integer.valueOf(((C8173z) obj).f27474q), obj);
        }
        f27469v0 = linkedHashMap;
    }

    public C8173z(int i10, String str) {
        str.getClass();
        this.f27474q = i10;
        this.f27475r = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8173z) && ((C8173z) obj).f27474q == this.f27474q;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public int compareTo(C8173z c8173z) {
        c8173z.getClass();
        return this.f27474q - c8173z.f27474q;
    }

    public int hashCode() {
        return Integer.hashCode(this.f27474q);
    }

    /* JADX INFO: renamed from: i0 */
    public final String m31770i0() {
        return this.f27475r;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m31771j0() {
        return this.f27474q;
    }

    public String toString() {
        return this.f27474q + ' ' + this.f27475r;
    }

    /* JADX INFO: renamed from: t6.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public final C8173z m31772A() {
            return C8173z.f27470w;
        }

        /* JADX INFO: renamed from: B */
        public final C8173z m31773B() {
            return C8173z.f27420C;
        }

        /* JADX INFO: renamed from: C */
        public final C8173z m31774C() {
            return C8173z.f27444a0;
        }

        /* JADX INFO: renamed from: D */
        public final C8173z m31775D() {
            return C8173z.f27433P;
        }

        /* JADX INFO: renamed from: E */
        public final C8173z m31776E() {
            return C8173z.f27430M;
        }

        /* JADX INFO: renamed from: F */
        public final C8173z m31777F() {
            return C8173z.f27443Z;
        }

        /* JADX INFO: renamed from: G */
        public final C8173z m31778G() {
            return C8173z.f27468v;
        }

        /* JADX INFO: renamed from: H */
        public final C8173z m31779H() {
            return C8173z.f27438U;
        }

        /* JADX INFO: renamed from: I */
        public final C8173z m31780I() {
            return C8173z.f27455l0;
        }

        /* JADX INFO: renamed from: J */
        public final C8173z m31781J() {
            return C8173z.f27439V;
        }

        /* JADX INFO: renamed from: K */
        public final C8173z m31782K() {
            return C8173z.f27445b0;
        }

        /* JADX INFO: renamed from: L */
        public final C8173z m31783L() {
            return C8173z.f27447d0;
        }

        /* JADX INFO: renamed from: M */
        public final C8173z m31784M() {
            return C8173z.f27419B;
        }

        /* JADX INFO: renamed from: N */
        public final C8173z m31785N() {
            return C8173z.f27425H;
        }

        /* JADX INFO: renamed from: O */
        public final C8173z m31786O() {
            return C8173z.f27459p0;
        }

        /* JADX INFO: renamed from: P */
        public final C8173z m31787P() {
            return C8173z.f27428K;
        }

        /* JADX INFO: renamed from: Q */
        public final C8173z m31788Q() {
            return C8173z.f27466u;
        }

        /* JADX INFO: renamed from: R */
        public final C8173z m31789R() {
            return C8173z.f27429L;
        }

        /* JADX INFO: renamed from: S */
        public final C8173z m31790S() {
            return C8173z.f27452i0;
        }

        /* JADX INFO: renamed from: T */
        public final C8173z m31791T() {
            return C8173z.f27454k0;
        }

        /* JADX INFO: renamed from: U */
        public final C8173z m31792U() {
            return C8173z.f27432O;
        }

        /* JADX INFO: renamed from: V */
        public final C8173z m31793V() {
            return C8173z.f27449f0;
        }

        /* JADX INFO: renamed from: W */
        public final C8173z m31794W() {
            return C8173z.f27446c0;
        }

        /* JADX INFO: renamed from: X */
        public final C8173z m31795X() {
            return C8173z.f27453j0;
        }

        /* JADX INFO: renamed from: Y */
        public final C8173z m31796Y() {
            return C8173z.f27427J;
        }

        /* JADX INFO: renamed from: Z */
        public final C8173z m31797Z() {
            return C8173z.f27463s0;
        }

        /* JADX INFO: renamed from: a */
        public final C8173z m31798a() {
            return C8173z.f27472y;
        }

        /* JADX INFO: renamed from: a0 */
        public final C8173z m31799a0() {
            return C8173z.f27461r0;
        }

        /* JADX INFO: renamed from: b */
        public final C8173z m31800b() {
            return C8173z.f27458o0;
        }

        /* JADX INFO: renamed from: c */
        public final C8173z m31801c() {
            return C8173z.f27431N;
        }

        /* JADX INFO: renamed from: d */
        public final C8173z m31802d() {
            return C8173z.f27440W;
        }

        /* JADX INFO: renamed from: e */
        public final C8173z m31803e() {
            return C8173z.f27464t;
        }

        /* JADX INFO: renamed from: f */
        public final C8173z m31804f() {
            return C8173z.f27471x;
        }

        /* JADX INFO: renamed from: g */
        public final C8173z m31805g() {
            return C8173z.f27448e0;
        }

        /* JADX INFO: renamed from: h */
        public final C8173z m31806h() {
            return C8173z.f27451h0;
        }

        /* JADX INFO: renamed from: i */
        public final C8173z m31807i() {
            return C8173z.f27434Q;
        }

        /* JADX INFO: renamed from: j */
        public final C8173z m31808j() {
            return C8173z.f27424G;
        }

        /* JADX INFO: renamed from: k */
        public final C8173z m31809k() {
            return C8173z.f27460q0;
        }

        /* JADX INFO: renamed from: l */
        public final C8173z m31810l() {
            return C8173z.f27441X;
        }

        /* JADX INFO: renamed from: m */
        public final C8173z m31811m() {
            return C8173z.f27465t0;
        }

        /* JADX INFO: renamed from: n */
        public final C8173z m31812n() {
            return C8173z.f27456m0;
        }

        /* JADX INFO: renamed from: o */
        public final C8173z m31813o() {
            return C8173z.f27442Y;
        }

        /* JADX INFO: renamed from: p */
        public final C8173z m31814p() {
            return C8173z.f27450g0;
        }

        /* JADX INFO: renamed from: q */
        public final C8173z m31815q() {
            return C8173z.f27436S;
        }

        /* JADX INFO: renamed from: r */
        public final C8173z m31816r() {
            return C8173z.f27423F;
        }

        /* JADX INFO: renamed from: s */
        public final C8173z m31817s() {
            return C8173z.f27421D;
        }

        /* JADX INFO: renamed from: t */
        public final C8173z m31818t() {
            return C8173z.f27422E;
        }

        /* JADX INFO: renamed from: u */
        public final C8173z m31819u() {
            return C8173z.f27418A;
        }

        /* JADX INFO: renamed from: v */
        public final C8173z m31820v() {
            return C8173z.f27473z;
        }

        /* JADX INFO: renamed from: w */
        public final C8173z m31821w() {
            return C8173z.f27437T;
        }

        /* JADX INFO: renamed from: x */
        public final C8173z m31822x() {
            return C8173z.f27435R;
        }

        /* JADX INFO: renamed from: y */
        public final C8173z m31823y() {
            return C8173z.f27457n0;
        }

        /* JADX INFO: renamed from: z */
        public final C8173z m31824z() {
            return C8173z.f27426I;
        }

        public a() {
        }
    }
}
