package p000;

/* JADX INFO: renamed from: vi */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0853vi implements InterfaceC0804ui {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0690ri f6721d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0853vi(InterfaceC0690ri interfaceC0690ri) {
        this.f6721d = interfaceC0690ri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0853vi) {
            return this.f6721d.equals(((C0853vi) obj).f6721d);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6721d.hashCode() * 31;
    }
}
