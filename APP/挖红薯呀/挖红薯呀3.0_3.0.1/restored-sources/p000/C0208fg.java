package p000;

/* JADX INFO: renamed from: fg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0208fg implements pe0 {

    /* JADX INFO: renamed from: a */
    public final pe0 f1720a;

    /* JADX INFO: renamed from: b */
    public final pe0 f1721b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0208fg(pe0 pe0Var, pe0 pe0Var2) {
        this.f1720a = pe0Var;
        this.f1721b = pe0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pe0
    /* JADX INFO: renamed from: a */
    public final Object mo1101a(InterfaceC0904ww interfaceC0904ww, Object obj) {
        return this.f1721b.mo1101a(interfaceC0904ww, this.f1720a.mo1101a(interfaceC0904ww, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pe0
    /* JADX INFO: renamed from: b */
    public final boolean mo1102b(InterfaceC0742sw interfaceC0742sw) {
        return this.f1720a.mo1102b(interfaceC0742sw) && this.f1721b.mo1102b(interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0208fg)) {
            return false;
        }
        C0208fg c0208fg = (C0208fg) obj;
        return this.f1720a.equals(c0208fg.f1720a) && p30.m3002l(this.f1721b, c0208fg.f1721b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f1721b.hashCode() * 31) + this.f1720a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "[" + ((String) mo1101a(C0462m7.f3830f, "")) + ']';
    }
}
