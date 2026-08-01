package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ma1 implements fd1 {

    /* JADX INFO: renamed from: a */
    public final fd1 f3906a;

    /* JADX INFO: renamed from: b */
    public final fd1 f3907b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ma1(fd1 fd1Var, fd1 fd1Var2) {
        this.f3906a = fd1Var;
        this.f3907b = fd1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: a */
    public final int mo675a(InterfaceC0968ym interfaceC0968ym) {
        return Math.max(this.f3906a.mo675a(interfaceC0968ym), this.f3907b.mo675a(interfaceC0968ym));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: b */
    public final int mo676b(InterfaceC0968ym interfaceC0968ym) {
        return Math.max(this.f3906a.mo676b(interfaceC0968ym), this.f3907b.mo676b(interfaceC0968ym));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: c */
    public final int mo677c(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        return Math.max(this.f3906a.mo677c(interfaceC0968ym, k50Var), this.f3907b.mo677c(interfaceC0968ym, k50Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fd1
    /* JADX INFO: renamed from: d */
    public final int mo678d(InterfaceC0968ym interfaceC0968ym, k50 k50Var) {
        return Math.max(this.f3906a.mo678d(interfaceC0968ym, k50Var), this.f3907b.mo678d(interfaceC0968ym, k50Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma1)) {
            return false;
        }
        ma1 ma1Var = (ma1) obj;
        return p30.m3002l(ma1Var.f3906a, this.f3906a) && p30.m3002l(ma1Var.f3907b, this.f3907b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f3907b.hashCode() * 31) + this.f3906a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f3906a + " ∪ " + this.f3907b + ')';
    }
}
