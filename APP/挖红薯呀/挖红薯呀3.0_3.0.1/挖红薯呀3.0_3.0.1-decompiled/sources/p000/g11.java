package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g11 extends AbstractC0494n0 {

    /* JADX INFO: renamed from: a */
    public long f1841a;

    /* JADX INFO: renamed from: b */
    public C0884wc f1842b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0494n0
    /* JADX INFO: renamed from: a */
    public final boolean mo20a(AbstractC0451m0 abstractC0451m0) {
        f11 f11Var = (f11) abstractC0451m0;
        if (this.f1841a >= 0) {
            return false;
        }
        long j = f11Var.f1560l;
        if (j < f11Var.f1561m) {
            f11Var.f1561m = j;
        }
        this.f1841a = j;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0494n0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0322ik[] mo21b(AbstractC0451m0 abstractC0451m0) {
        long j = this.f1841a;
        this.f1841a = -1L;
        this.f1842b = null;
        return ((f11) abstractC0451m0).m996v(j);
    }
}
