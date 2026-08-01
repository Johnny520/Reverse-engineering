package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class i31 implements InterfaceC0804ui, Iterable, p40 {

    /* JADX INFO: renamed from: d */
    public final w11 f2417d;

    /* JADX INFO: renamed from: e */
    public final int f2418e;

    /* JADX INFO: renamed from: f */
    public final eu0 f2419f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i31(w11 w11Var, int i, AbstractC0189ey abstractC0189ey, eu0 eu0Var) {
        this.f2417d = w11Var;
        this.f2418e = i;
        this.f2419f = eu0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof i31)) {
            return false;
        }
        i31 i31Var = (i31) obj;
        return i31Var.f2418e == this.f2418e && i31Var.f2417d == this.f2417d && i31Var.f2419f.equals(this.f2419f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2419f.hashCode() + ((this.f2417d.hashCode() + (this.f2418e * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ov0(this.f2417d, this.f2418e, null, this.f2419f);
    }
}
