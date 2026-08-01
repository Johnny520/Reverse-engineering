package p000;

/* JADX INFO: renamed from: x6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915x6 implements fd1 {

    /* JADX INFO: renamed from: a */
    public final int f7273a;

    /* JADX INFO: renamed from: b */
    public final String f7274b;

    /* JADX INFO: renamed from: c */
    public final gp0 f7275c = r60.m3419u(i20.f2403e);

    /* JADX INFO: renamed from: d */
    public final gp0 f7276d = r60.m3419u(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0915x6(String str, int i) {
        this.f7273a = i;
        this.f7274b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: a */
    public final int mo675a(InterfaceC0968ym interfaceC0968ym) {
        return m5086e().f2407d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: b */
    public final int mo676b(InterfaceC0968ym interfaceC0968ym) {
        return m5086e().f2405b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: c */
    public final int mo677c(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        return m5086e().f2406c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: d */
    public final int mo678d(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        return m5086e().f2404a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final i20 m5086e() {
        return (i20) this.f7275c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0915x6) {
            return this.f7273a == ((C0915x6) obj).f7273a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5087f(boolean z) {
        this.f7276d.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5088g(be1 be1Var, int i) {
        int i2 = this.f7273a;
        if (i == 0 || (i & i2) != 0) {
            this.f7275c.setValue(be1Var.f503a.mo3221h(i2));
            m5087f(be1Var.f503a.mo4317q(i2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7273a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f7274b + '(' + m5086e().f2404a + ", " + m5086e().f2405b + ", " + m5086e().f2406c + ", " + m5086e().f2407d + ')';
    }
}
