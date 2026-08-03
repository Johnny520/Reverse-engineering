package p222p;

import p068eh.AbstractC0921a;
import p293u2.C4236f;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3219g1 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final float f10274a;

    /* JADX INFO: renamed from: b */
    public final float f10275b;

    /* JADX INFO: renamed from: c */
    public final float f10276c;

    /* JADX INFO: renamed from: d */
    public final float f10277d;

    /* JADX INFO: renamed from: e */
    public final boolean f10278e;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (Float.NaN float) : (r9v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED] (LINE:10)) != (0 int)) ? (Float.NaN float) : (r10v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED] (LINE:17)) != (0 int)) ? (Float.NaN float) : (r11v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED] (LINE:24)) != (0 int)) ? (Float.NaN float) : (r12v0 float))
  true
 A[MD:(float, float, float, float, boolean):void (m)] (LINE:33) call: p.g1.<init>(float, float, float, float, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3219g1(float f3, float f10, float f11, float f12, int i9) {
        this((i9 & 1) != 0 ? Float.NaN : f3, (i9 & 2) != 0 ? Float.NaN : f10, (i9 & 4) != 0 ? Float.NaN : f11, (i9 & 8) != 0 ? Float.NaN : f12, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3219g1)) {
            return false;
        }
        C3219g1 c3219g1 = (C3219g1) obj;
        return C4236f.m8520b(this.f10274a, c3219g1.f10274a) && C4236f.m8520b(this.f10275b, c3219g1.f10275b) && C4236f.m8520b(this.f10276c, c3219g1.f10276c) && C4236f.m8520b(this.f10277d, c3219g1.f10277d) && this.f10278e == c3219g1.f10278e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C3225i1 c3225i1 = new C3225i1();
        c3225i1.f10293u = this.f10274a;
        c3225i1.f10294v = this.f10275b;
        c3225i1.f10295w = this.f10276c;
        c3225i1.f10296x = this.f10277d;
        c3225i1.f10297y = this.f10278e;
        return c3225i1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3225i1 c3225i1 = (C3225i1) abstractC5852n;
        c3225i1.f10293u = this.f10274a;
        c3225i1.f10294v = this.f10275b;
        c3225i1.f10295w = this.f10276c;
        c3225i1.f10296x = this.f10277d;
        c3225i1.f10297y = this.f10278e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10278e) + AbstractC0921a.m2241d(this.f10277d, AbstractC0921a.m2241d(this.f10276c, AbstractC0921a.m2241d(this.f10275b, Float.hashCode(this.f10274a) * 31, 31), 31), 31);
    }

    public C3219g1(float f3, float f10, float f11, float f12, boolean z9) {
        this.f10274a = f3;
        this.f10275b = f10;
        this.f10276c = f11;
        this.f10277d = f12;
        this.f10278e = z9;
    }
}
