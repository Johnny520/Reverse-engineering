package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends lq2 implements hu2 {
    @Override // p000.hu2
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f6256o;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f6257p + ((long) ((int) ((m2961n() + ((long) this.f6259r)) - this.f6257p)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: v */
    public final void m2752v(int i) {
        synchronized (this) {
            Object[] objArr = this.f6256o;
            objArr.getClass();
            m2963p(Integer.valueOf(((Number) objArr[((int) ((this.f6257p + ((long) ((int) ((m2961n() + ((long) this.f6259r)) - this.f6257p)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
