package p332wb;

import gg.AbstractC1416l;
import p222p.AbstractC3199a;
import p317vb.InterfaceC4544a;

/* JADX INFO: renamed from: wb.s2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5294s2 extends AbstractC5459x2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4544a f20561a;

    /* JADX INFO: renamed from: b */
    public final C4770c3 f20562b;

    /* JADX INFO: renamed from: c */
    public final boolean f20563c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5294s2(InterfaceC4544a interfaceC4544a, C4770c3 c4770c3, boolean z9) {
        interfaceC4544a.getClass();
        this.f20561a = interfaceC4544a;
        this.f20562b = c4770c3;
        this.f20563c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5294s2)) {
            return false;
        }
        C5294s2 c5294s2 = (C5294s2) obj;
        return AbstractC1416l.m3825a(this.f20561a, c5294s2.f20561a) && AbstractC1416l.m3825a(this.f20562b, c5294s2.f20562b) && this.f20563c == c5294s2.f20563c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f20561a.hashCode() * 31;
        C4770c3 c4770c3 = this.f20562b;
        return Boolean.hashCode(this.f20563c) + ((iHashCode + (c4770c3 == null ? 0 : c4770c3.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Feature(provider=");
        sb2.append(this.f20561a);
        sb2.append(", sourceGroup=");
        sb2.append(this.f20562b);
        sb2.append(", returnToSearch=");
        return AbstractC3199a.m6840m(")", sb2, this.f20563c);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 vb.a)
  (wrap:wb.c3:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null wb.c3) : (r2v0 wb.c3))
  false
 A[MD:(vb.a, wb.c3, boolean):void (m)] (LINE:14) call: wb.s2.<init>(vb.a, wb.c3, boolean):void type: THIS */
    public /* synthetic */ C5294s2(InterfaceC4544a interfaceC4544a, C4770c3 c4770c3, int i9) {
        this(interfaceC4544a, (i9 & 2) != 0 ? null : c4770c3, false);
    }
}
