package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s31 implements InterfaceC0830v7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0830v7 f5631a;

    /* JADX INFO: renamed from: b */
    public final long f5632b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s31(InterfaceC0778tt interfaceC0778tt, long j) {
        this.f5631a = interfaceC0778tt;
        this.f5632b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0830v7
    /* JADX INFO: renamed from: a */
    public final mb1 mo969a(q91 q91Var) {
        return new t31(this.f5631a.mo969a(q91Var), this.f5632b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof s31)) {
            return false;
        }
        s31 s31Var = (s31) obj;
        return s31Var.f5632b == this.f5632b && p30.m3002l(s31Var.f5631a, this.f5631a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5632b) + (this.f5631a.hashCode() * 31);
    }
}
