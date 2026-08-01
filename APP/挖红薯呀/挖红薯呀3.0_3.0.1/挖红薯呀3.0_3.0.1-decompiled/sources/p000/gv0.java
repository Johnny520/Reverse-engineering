package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 implements InterfaceC0968ym {

    /* JADX INFO: renamed from: d */
    public int f2063d;

    /* JADX INFO: renamed from: e */
    public float f2064e = 1.0f;

    /* JADX INFO: renamed from: f */
    public float f2065f = 1.0f;

    /* JADX INFO: renamed from: g */
    public float f2066g = 1.0f;

    /* JADX INFO: renamed from: h */
    public float f2067h;

    /* JADX INFO: renamed from: i */
    public long f2068i;

    /* JADX INFO: renamed from: j */
    public long f2069j;

    /* JADX INFO: renamed from: k */
    public float f2070k;

    /* JADX INFO: renamed from: l */
    public long f2071l;

    /* JADX INFO: renamed from: m */
    public x01 f2072m;

    /* JADX INFO: renamed from: n */
    public boolean f2073n;

    /* JADX INFO: renamed from: o */
    public long f2074o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0968ym f2075p;

    /* JADX INFO: renamed from: q */
    public k50 f2076q;

    /* JADX INFO: renamed from: r */
    public int f2077r;

    /* JADX INFO: renamed from: s */
    public v50 f2078s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gv0() {
        long j = AbstractC0979yx.f7702a;
        this.f2068i = j;
        this.f2069j = j;
        this.f2070k = 8.0f;
        this.f2071l = t81.f5953a;
        this.f2072m = pf1.f4843i;
        this.f2074o = 9205357640488583168L;
        this.f2075p = AbstractC0307i4.m1528d();
        this.f2076q = k50.f3015d;
        this.f2077r = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1259a() {
        m1261e(1.0f);
        m1262f(1.0f);
        m1260d(1.0f);
        if (this.f2067h != 0.0f) {
            this.f2063d |= 32;
            this.f2067h = 0.0f;
        }
        long j = AbstractC0979yx.f7702a;
        if (!C0207ff.m1094c(this.f2068i, j)) {
            this.f2063d |= 64;
            this.f2068i = j;
        }
        if (!C0207ff.m1094c(this.f2069j, j)) {
            this.f2063d |= 128;
            this.f2069j = j;
        }
        if (this.f2070k != 8.0f) {
            this.f2063d |= 2048;
            this.f2070k = 8.0f;
        }
        m1263i(t81.f5953a);
        C0227fz c0227fz = pf1.f4843i;
        if (!p30.m3002l(this.f2072m, c0227fz)) {
            this.f2063d |= 8192;
            this.f2072m = c0227fz;
        }
        if (this.f2073n) {
            this.f2063d |= 16384;
            this.f2073n = false;
        }
        if (this.f2077r != 3) {
            this.f2063d |= 524288;
            this.f2077r = 3;
        }
        this.f2074o = 9205357640488583168L;
        this.f2078s = null;
        this.f2063d = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f2075p.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1260d(float f) {
        if (this.f2066g == f) {
            return;
        }
        this.f2063d |= 4;
        this.f2066g = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1261e(float f) {
        if (this.f2064e == f) {
            return;
        }
        this.f2063d |= 1;
        this.f2064e = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1262f(float f) {
        if (this.f2065f == f) {
            return;
        }
        this.f2063d |= 2;
        this.f2065f = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f2075p.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1263i(long j) {
        long j2 = this.f2071l;
        int i = t81.f5954b;
        if (j2 == j) {
            return;
        }
        this.f2063d |= 4096;
        this.f2071l = j;
    }
}
