package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class t31 implements mb1 {

    /* JADX INFO: renamed from: d */
    public final mb1 f5904d;

    /* JADX INFO: renamed from: e */
    public final long f5905e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t31(mb1 mb1Var, long j) {
        this.f5904d = mb1Var;
        this.f5905e = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: a */
    public final boolean mo2486a() {
        return this.f5904d.mo2486a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: b */
    public final long mo2487b(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return this.f5904d.mo2487b(abstractC0046b8, abstractC0046b82, abstractC0046b83) + this.f5905e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: e */
    public final AbstractC0046b8 mo376e(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        long j2 = this.f5905e;
        return j < j2 ? abstractC0046b83 : this.f5904d.mo376e(j - j2, abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof t31)) {
            return false;
        }
        t31 t31Var = (t31) obj;
        return t31Var.f5905e == this.f5905e && p30.m3002l(t31Var.f5904d, this.f5904d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: h */
    public final AbstractC0046b8 mo379h(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        long j2 = this.f5905e;
        return j < j2 ? abstractC0046b8 : this.f5904d.mo379h(j - j2, abstractC0046b8, abstractC0046b82, abstractC0046b83);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5905e) + (this.f5904d.hashCode() * 31);
    }
}
