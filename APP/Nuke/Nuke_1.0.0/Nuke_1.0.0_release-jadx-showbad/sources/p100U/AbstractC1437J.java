package p100U;

import p058L.C0946r;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.InterfaceC1353c;
import p117X2.AbstractC1676u;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1437J {

    /* JADX INFO: renamed from: a */
    public final int f5094a;

    /* JADX INFO: renamed from: b */
    public final int f5095b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1437J(int i5, int i6) {
        this.f5094a = i5;
        this.f5095b = i6;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public C1349a mo2723b(C0946r c0946r) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2978b = AbstractC1676u.m2995a(getClass()).m2978b();
        return strM2978b == null ? "" : strM2978b;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(int, int):void (m)] (LINE:2) call: U.J.<init>(int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ AbstractC1437J(int i5, int i6, int i7) {
        this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6);
    }
}
