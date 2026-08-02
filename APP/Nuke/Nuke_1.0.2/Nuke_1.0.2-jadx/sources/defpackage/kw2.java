package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends lq2 implements hu2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hu2
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.o;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.p + ((long) ((int) ((n() + ((long) this.r)) - this.p)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.o;
            objArr.getClass();
            p(Integer.valueOf(((Number) objArr[((int) ((this.p + ((long) ((int) ((n() + ((long) this.r)) - this.p)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
