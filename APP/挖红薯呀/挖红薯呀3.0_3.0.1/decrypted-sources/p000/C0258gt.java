package p000;

/* JADX INFO: renamed from: gt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0258gt implements fd1 {

    /* JADX INFO: renamed from: a */
    public final fd1 f2046a;

    /* JADX INFO: renamed from: b */
    public final fd1 f2047b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0258gt(fd1 fd1Var, fd1 fd1Var2) {
        this.f2046a = fd1Var;
        this.f2047b = fd1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: a */
    public final int mo675a(InterfaceC0968ym interfaceC0968ym) {
        int iMo675a = this.f2046a.mo675a(interfaceC0968ym) - this.f2047b.mo675a(interfaceC0968ym);
        if (iMo675a < 0) {
            return 0;
        }
        return iMo675a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: b */
    public final int mo676b(InterfaceC0968ym interfaceC0968ym) {
        int iMo676b = this.f2046a.mo676b(interfaceC0968ym) - this.f2047b.mo676b(interfaceC0968ym);
        if (iMo676b < 0) {
            return 0;
        }
        return iMo676b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: c */
    public final int mo677c(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        int iMo677c = this.f2046a.mo677c(interfaceC0968ym, k50Var) - this.f2047b.mo677c(interfaceC0968ym, k50Var);
        if (iMo677c < 0) {
            return 0;
        }
        return iMo677c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: d */
    public final int mo678d(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        int iMo678d = this.f2046a.mo678d(interfaceC0968ym, k50Var) - this.f2047b.mo678d(interfaceC0968ym, k50Var);
        if (iMo678d < 0) {
            return 0;
        }
        return iMo678d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0258gt)) {
            return false;
        }
        C0258gt c0258gt = (C0258gt) obj;
        return p30.m3002l(c0258gt.f2046a, this.f2046a) && p30.m3002l(c0258gt.f2047b, this.f2047b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2047b.hashCode() + (this.f2046a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f2046a + " - " + this.f2047b + ')';
    }
}
