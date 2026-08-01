package p184j3;

import p117X2.AbstractC1665j;
import p178i3.C2338s;
import p178i3.InterfaceC2316A;

/* JADX INFO: renamed from: j3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2402u extends C2338s implements InterfaceC2316A {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2316A
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f7620k;
            AbstractC1665j.m2982b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f7621l + ((long) ((int) ((m4157o() + ((long) this.f7623n)) - this.f7621l)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m4242w(int i5) {
        synchronized (this) {
            Object[] objArr = this.f7620k;
            AbstractC1665j.m2982b(objArr);
            m4159q(Integer.valueOf(((Number) objArr[((int) ((this.f7621l + ((long) ((int) ((m4157o() + ((long) this.f7623n)) - this.f7621l)))) - 1)) & (objArr.length - 1)]).intValue() + i5));
        }
    }
}
