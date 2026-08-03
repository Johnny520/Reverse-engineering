package p332wb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5391v0 {

    /* JADX INFO: renamed from: a */
    public final String f21258a;

    /* JADX INFO: renamed from: b */
    public final EnumC5358u0 f21259b;

    /* JADX INFO: renamed from: c */
    public final boolean f21260c;

    /* JADX INFO: renamed from: d */
    public final String f21261d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1231l f21262e;

    /* JADX INFO: renamed from: f */
    public final boolean f21263f;

    /* JADX INFO: renamed from: g */
    public final boolean f21264g;

    /* JADX INFO: renamed from: h */
    public final String f21265h;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 wb.u0)
  (r14v0 boolean)
  (r15v0 java.lang.String)
  (r16v0 fg.l)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED] (LINE:1)) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (64 int) A[WRAPPED] (LINE:10)) != (0 int)) ? true : false)
  ("发送")
 A[MD:(java.lang.String, wb.u0, boolean, java.lang.String, fg.l, boolean, boolean, java.lang.String):void (m)] (LINE:25) call: wb.v0.<init>(java.lang.String, wb.u0, boolean, java.lang.String, fg.l, boolean, boolean, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5391v0(String str, EnumC5358u0 enumC5358u0, boolean z9, String str2, InterfaceC1231l interfaceC1231l, boolean z10, int i9) {
        this(str, enumC5358u0, z9, str2, interfaceC1231l, (i9 & 32) != 0 ? false : z10, (i9 & 64) != 0, "发送");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5391v0)) {
            return false;
        }
        C5391v0 c5391v0 = (C5391v0) obj;
        return AbstractC1416l.m3825a(this.f21258a, c5391v0.f21258a) && this.f21259b == c5391v0.f21259b && this.f21260c == c5391v0.f21260c && AbstractC1416l.m3825a(this.f21261d, c5391v0.f21261d) && AbstractC1416l.m3825a(this.f21262e, c5391v0.f21262e) && this.f21263f == c5391v0.f21263f && this.f21264g == c5391v0.f21264g && AbstractC1416l.m3825a(this.f21265h, c5391v0.f21265h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f21265h.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f21262e.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2245h((this.f21259b.hashCode() + (this.f21258a.hashCode() * 31)) * 31, 31, this.f21260c), 31, this.f21261d)) * 31, 31, this.f21263f), 31, this.f21264g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPickerRequest(title=" + this.f21258a + ", mode=" + this.f21259b + ", multiSelect=" + this.f21260c + ", existingValue=" + this.f21261d + ", onValue=" + this.f21262e + ", enableLabels=" + this.f21263f + ", enableGroupLabels=" + this.f21264g + ", singleConfirmText=" + this.f21265h + ")";
    }

    public C5391v0(String str, EnumC5358u0 enumC5358u0, boolean z9, String str2, InterfaceC1231l interfaceC1231l, boolean z10, boolean z11, String str3) {
        str2.getClass();
        interfaceC1231l.getClass();
        this.f21258a = str;
        this.f21259b = enumC5358u0;
        this.f21260c = z9;
        this.f21261d = str2;
        this.f21262e = interfaceC1231l;
        this.f21263f = z10;
        this.f21264g = z11;
        this.f21265h = str3;
    }
}
