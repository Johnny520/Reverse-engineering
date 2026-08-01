package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b51 extends f11 implements x31 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x31
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f1559k;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f1560l + ((long) ((int) ((m989o() + ((long) this.f1562n)) - this.f1560l)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m258w(int i) {
        synchronized (this) {
            Object[] objArr = this.f1559k;
            objArr.getClass();
            m991q(Integer.valueOf(((Number) objArr[((int) ((this.f1560l + ((long) ((int) ((m989o() + ((long) this.f1562n)) - this.f1560l)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
