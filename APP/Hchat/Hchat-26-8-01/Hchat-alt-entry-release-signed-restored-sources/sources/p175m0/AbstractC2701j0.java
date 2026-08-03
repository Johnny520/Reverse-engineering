package p175m0;

import gg.AbstractC1426v;
import okhttp3.HttpUrl;
import p020b5.C0190i;
import p100h0.C1548s;
import p117i0.InterfaceC1807a;
import p159l0.C2420b;
import p159l0.C2429k;

/* JADX INFO: renamed from: m0.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2701j0 {

    /* JADX INFO: renamed from: a */
    public final int f8770a;

    /* JADX INFO: renamed from: b */
    public final int f8771b;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(int, int):void (m)] (LINE:12) call: m0.j0.<init>(int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC2701j0(int i9, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i9, (i11 & 2) != 0 ? 0 : i10);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public C2420b mo6132b(C1548s c1548s) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM3820c = AbstractC1426v.m3834a(getClass()).m3820c();
        return strM3820c == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3820c;
    }

    public AbstractC2701j0(int i9, int i10) {
        this.f8770a = i9;
        this.f8771b = i10;
    }
}
