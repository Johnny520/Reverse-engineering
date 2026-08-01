package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l21 {

    /* JADX INFO: renamed from: a */
    public q21 f3329a;

    /* JADX INFO: renamed from: b */
    public long f3330b;

    /* JADX INFO: renamed from: c */
    public boolean f3331c;

    /* JADX INFO: renamed from: d */
    public int f3332d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l21(long j, q21 q21Var) {
        int iM2702a;
        int iNumberOfTrailingZeros;
        this.f3329a = q21Var;
        this.f3330b = j;
        sx0 sx0Var = t21.f5891a;
        if (j != 0) {
            q21 q21VarMo808d = mo808d();
            long j2 = q21VarMo808d.f5031f;
            long[] jArr = q21VarMo808d.f5032g;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = q21VarMo808d.f5030e;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = q21VarMo808d.f5029d;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (t21.f5893c) {
                iM2702a = t21.f5896f.m2702a(j);
            }
        } else {
            iM2702a = -1;
        }
        this.f3332d = iM2702a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m1966q(l21 l21Var) {
        t21.f5892b.m2808m(l21Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1967a() {
        synchronized (t21.f5893c) {
            mo1968b();
            mo1971p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo1968b() {
        t21.f5894d = t21.f5894d.m3190b(mo811g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo807c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public q21 mo808d() {
        return this.f3329a;
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC0742sw mo809e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo810f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public long mo811g() {
        return this.f3330b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public int mo812h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC0742sw mo813i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final l21 m1969j() {
        C0541o8 c0541o8 = t21.f5892b;
        l21 l21Var = (l21) c0541o8.m2801e();
        c0541o8.m2808m(this);
        return l21Var;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo814k();

    /* JADX INFO: renamed from: l */
    public abstract void mo815l();

    /* JADX INFO: renamed from: m */
    public abstract void mo816m();

    /* JADX INFO: renamed from: n */
    public abstract void mo817n(d41 d41Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m1970o() {
        int i = this.f3332d;
        if (i >= 0) {
            t21.m4183u(i);
            this.f3332d = -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void mo1971p() {
        m1970o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void mo818r(q21 q21Var) {
        this.f3329a = q21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void mo819s(long j) {
        this.f3330b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void mo820t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract l21 mo821u(InterfaceC0742sw interfaceC0742sw);
}
