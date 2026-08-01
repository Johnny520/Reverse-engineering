package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p91 implements InterfaceC0778tt {

    /* JADX INFO: renamed from: a */
    public final int f4787a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0065br f4788b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p91(int i, InterfaceC0065br interfaceC0065br) {
        this.f4787a = i;
        this.f4788b = interfaceC0065br;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0830v7
    /* JADX INFO: renamed from: a */
    public final mb1 mo969a(q91 q91Var) {
        C0070bw c0070bw = new C0070bw();
        int i = this.f4787a;
        c0070bw.f594d = i;
        c0070bw.f595e = new C0948y2((InterfaceC0185eu) new C0259gu(i, this.f4788b));
        return c0070bw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof p91)) {
            return false;
        }
        p91 p91Var = (p91) obj;
        return p91Var.f4787a == this.f4787a && p30.m3002l(p91Var.f4788b, this.f4788b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f4788b.hashCode() + (this.f4787a * 31)) * 31;
    }
}
