package p244u;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p153e1.C2010f;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.b0 */
/* JADX INFO: loaded from: classes.dex */
final class C3260b0 extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f10080a;

    /* JADX INFO: renamed from: b */
    public final float f10081b;

    /* JADX INFO: renamed from: c */
    public final float f10082c;

    /* JADX INFO: renamed from: d */
    public final float f10083d;

    /* JADX INFO: renamed from: e */
    public final boolean f10084e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3260b0(float f2, float f5, float f6, float f7, boolean z5) {
        this.f10080a = f2;
        this.f10081b = f5;
        this.f10082c = f6;
        this.f10083d = f7;
        this.f10084e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3262c0 c3262c0 = new C3262c0();
        c3262c0.f10090r = this.f10080a;
        c3262c0.f10091s = this.f10081b;
        c3262c0.f10092t = this.f10082c;
        c3262c0.f10093u = this.f10083d;
        c3262c0.f10094v = this.f10084e;
        return c3262c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3260b0)) {
            return false;
        }
        C3260b0 c3260b0 = (C3260b0) obj;
        return C2010f.m3696b(this.f10080a, c3260b0.f10080a) && C2010f.m3696b(this.f10081b, c3260b0.f10081b) && C2010f.m3696b(this.f10082c, c3260b0.f10082c) && C2010f.m3696b(this.f10083d, c3260b0.f10083d) && this.f10084e == c3260b0.f10084e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3262c0 c3262c0 = (C3262c0) abstractC2206o;
        c3262c0.f10090r = this.f10080a;
        c3262c0.f10091s = this.f10081b;
        c3262c0.f10092t = this.f10082c;
        c3262c0.f10093u = this.f10083d;
        c3262c0.f10094v = this.f10084e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10084e) + AbstractC0231b.m390a(this.f10083d, AbstractC0231b.m390a(this.f10082c, AbstractC0231b.m390a(this.f10081b, Float.hashCode(this.f10080a) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r9v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r10v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r11v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r12v0 float))
  true
 A[MD:(float, float, float, float, boolean):void (m)] (LINE:7) call: u.b0.<init>(float, float, float, float, boolean):void type: THIS */
    public /* synthetic */ C3260b0(float f2, float f5, float f6, float f7, int i5) {
        this((i5 & 1) != 0 ? Float.NaN : f2, (i5 & 2) != 0 ? Float.NaN : f5, (i5 & 4) != 0 ? Float.NaN : f6, (i5 & 8) != 0 ? Float.NaN : f7, true);
    }
}
