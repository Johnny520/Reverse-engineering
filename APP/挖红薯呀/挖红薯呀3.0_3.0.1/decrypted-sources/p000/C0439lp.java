package p000;

import android.content.Context;
import android.content.SharedPreferences;
import p000.m00;

/* JADX INFO: renamed from: lp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0439lp {

    /* JADX INFO: renamed from: b */
    private static volatile a f3567b;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f3568c;

    /* JADX INFO: renamed from: d */
    private static InterfaceC0742sw f3569d;

    /* JADX INFO: renamed from: e */
    private static volatile SharedPreferences f3570e;

    /* JADX INFO: renamed from: a */
    public static final C0439lp f3566a = new C0439lp();

    /* JADX INFO: renamed from: f */
    public static final int f3571f = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0439lp() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2045a() {
        f3568c = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final a m2046b() {
        return f3567b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2047c(Context context) {
        context.getClass();
        f3570e = context.getSharedPreferences(m00.f3663S.m2362Y(), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m2048d() {
        return f3568c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m2049e() {
        SharedPreferences sharedPreferences = f3570e;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(m00.f3663S.m2382j(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m2050f(Context context) {
        context.getClass();
        boolean zM2049e = m2049e();
        if (f3570e != null) {
            return zM2049e;
        }
        m00.C0452a c0452a = m00.f3663S;
        return context.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2382j(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2051g(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        f3569d = interfaceC0742sw;
        a aVar = f3567b;
        if (aVar != null) {
            interfaceC0742sw.invoke(aVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2052h() {
        f3568c = false;
        f3567b = null;
        f3569d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m2053i() {
        f3567b = null;
        f3569d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2054j(a aVar) {
        f3567b = aVar;
        InterfaceC0742sw interfaceC0742sw = f3569d;
        if (interfaceC0742sw == null || aVar == null) {
            return;
        }
        interfaceC0742sw.invoke(aVar);
    }

    /* JADX INFO: renamed from: lp$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class a {

        /* JADX INFO: renamed from: f */
        public static final int f3572f = 0;

        /* JADX INFO: renamed from: a */
        private final String f3573a;

        /* JADX INFO: renamed from: b */
        private final long f3574b;

        /* JADX INFO: renamed from: c */
        private final long f3575c;

        /* JADX INFO: renamed from: d */
        private final boolean f3576d;

        /* JADX INFO: renamed from: e */
        private final boolean f3577e;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (0 long) : (r4v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000d: ARITH (r10v0 int) & (4 int) A[WRAPPED] (LINE:14)) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r10v0 int) & (8 int) A[WRAPPED] (LINE:19)) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (16 int) A[WRAPPED] (LINE:25)) != (0 int)) ? false : (r9v0 boolean))
 A[MD:(java.lang.String, long, long, boolean, boolean):void (m)] (LINE:38) call: lp.a.<init>(java.lang.String, long, long, boolean, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(String str, long j, long j2, boolean z, boolean z2, int i, AbstractC0619pl abstractC0619pl) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ a m2055g(a aVar, String str, long j, long j2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f3573a;
            }
            if ((i & 2) != 0) {
                j = aVar.f3574b;
            }
            if ((i & 4) != 0) {
                j2 = aVar.f3575c;
            }
            if ((i & 8) != 0) {
                z = aVar.f3576d;
            }
            if ((i & 16) != 0) {
                z2 = aVar.f3577e;
            }
            long j3 = j2;
            return aVar.m2061f(str, j, j3, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m2056a() {
            return this.f3573a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final long m2057b() {
            return this.f3574b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final long m2058c() {
            return this.f3575c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final boolean m2059d() {
            return this.f3576d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final boolean m2060e() {
            return this.f3577e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p30.m3002l(this.f3573a, aVar.f3573a) && this.f3574b == aVar.f3574b && this.f3575c == aVar.f3575c && this.f3576d == aVar.f3576d && this.f3577e == aVar.f3577e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final a m2061f(String str, long j, long j2, boolean z, boolean z2) {
            str.getClass();
            return new a(str, j, j2, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final long m2062h() {
            return this.f3574b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Boolean.hashCode(this.f3577e) + AbstractC0748t1.m4145c(AbstractC0748t1.m4146d(this.f3575c, AbstractC0748t1.m4146d(this.f3574b, this.f3573a.hashCode() * 31, 31), 31), 31, this.f3576d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i */
        public final String m2063i() {
            return this.f3573a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: j */
        public final long m2064j() {
            return this.f3575c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: k */
        public final boolean m2065k() {
            return this.f3576d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: l */
        public final boolean m2066l() {
            return this.f3577e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "ProgressInfo(fileName=" + this.f3573a + ", bytesDownloaded=" + this.f3574b + ", totalBytes=" + this.f3575c + ", isComplete=" + this.f3576d + ", isFailed=" + this.f3577e + ")";
        }

        public a(String str, long j, long j2, boolean z, boolean z2) {
            str.getClass();
            this.f3573a = str;
            this.f3574b = j;
            this.f3575c = j2;
            this.f3576d = z;
            this.f3577e = z2;
        }

        public a() {
            this(null, 0L, 0L, false, false, 31, null);
        }
    }
}
