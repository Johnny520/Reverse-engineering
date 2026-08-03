package ug;

import tg.C4200r;
import tg.InterfaceC4208z;

/* JADX INFO: renamed from: ug.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4351p extends C4200r implements InterfaceC4208z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4208z
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f13783n;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f13784o + ((long) ((int) ((m8455n() + ((long) this.f13786q)) - this.f13784o)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m8797v(int i9) {
        synchronized (this) {
            Object[] objArr = this.f13783n;
            objArr.getClass();
            m8457p(Integer.valueOf(((Number) objArr[((int) ((this.f13784o + ((long) ((int) ((m8455n() + ((long) this.f13786q)) - this.f13784o)))) - 1)) & (objArr.length - 1)]).intValue() + i9));
        }
    }
}
