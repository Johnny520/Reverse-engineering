package p138b4;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1874s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1875t f6382a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1875t f6383b;

    /* JADX INFO: renamed from: c */
    public final Throwable f6384c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1874s(InterfaceC1875t interfaceC1875t, C1858c c1858c, Throwable th) {
        this.f6382a = interfaceC1875t;
        this.f6383b = c1858c;
        this.f6384c = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1874s)) {
            return false;
        }
        C1874s c1874s = (C1874s) obj;
        return AbstractC1665j.m2981a(this.f6382a, c1874s.f6382a) && AbstractC1665j.m2981a(this.f6383b, c1874s.f6383b) && AbstractC1665j.m2981a(this.f6384c, c1874s.f6384c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f6382a.hashCode() * 31;
        InterfaceC1875t interfaceC1875t = this.f6383b;
        int iHashCode2 = (iHashCode + (interfaceC1875t == null ? 0 : interfaceC1875t.hashCode())) * 31;
        Throwable th = this.f6384c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConnectResult(plan=" + this.f6382a + ", nextPlan=" + this.f6383b + ", throwable=" + this.f6384c + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r2v0 b4.t)
  (wrap:b4.c:?: CAST (b4.c) (null b4.c))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(b4.t, b4.c, java.lang.Throwable):void (m)] (LINE:5) call: b4.s.<init>(b4.t, b4.c, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C1874s(InterfaceC1875t interfaceC1875t, Throwable th, int i5) {
        this(interfaceC1875t, (C1858c) null, (i5 & 4) != 0 ? null : th);
    }
}
