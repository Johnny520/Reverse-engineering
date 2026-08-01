package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class r11 extends te0 {

    /* JADX INFO: renamed from: a */
    public final float f5275a;

    /* JADX INFO: renamed from: b */
    public final float f5276b;

    /* JADX INFO: renamed from: c */
    public final float f5277c;

    /* JADX INFO: renamed from: d */
    public final float f5278d;

    /* JADX INFO: renamed from: e */
    public final boolean f5279e;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (Float.NaN float) : (r3v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED] (LINE:8)) != (0 int)) ? (Float.NaN float) : (r4v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (4 int) A[WRAPPED] (LINE:13)) != (0 int)) ? (Float.NaN float) : (r5v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0011: ARITH (r7v0 int) & (8 int) A[WRAPPED] (LINE:18)) != (0 int)) ? (Float.NaN float) : (r6v0 float))
  true
 A[MD:(float, float, float, float, boolean):void (m)] (LINE:24) call: r11.<init>(float, float, float, float, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r11(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        t11 t11Var = new t11();
        t11Var.f5885r = this.f5275a;
        t11Var.f5886s = this.f5276b;
        t11Var.f5887t = this.f5277c;
        t11Var.f5888u = this.f5278d;
        t11Var.f5889v = this.f5279e;
        return t11Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r11)) {
            return false;
        }
        r11 r11Var = (r11) obj;
        return C0520np.m2732b(this.f5275a, r11Var.f5275a) && C0520np.m2732b(this.f5276b, r11Var.f5276b) && C0520np.m2732b(this.f5277c, r11Var.f5277c) && C0520np.m2732b(this.f5278d, r11Var.f5278d) && this.f5279e == r11Var.f5279e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        t11 t11Var = (t11) oe0Var;
        t11Var.f5885r = this.f5275a;
        t11Var.f5886s = this.f5276b;
        t11Var.f5887t = this.f5277c;
        t11Var.f5888u = this.f5278d;
        t11Var.f5889v = this.f5279e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f5279e) + AbstractC0748t1.m4143a(this.f5278d, AbstractC0748t1.m4143a(this.f5277c, AbstractC0748t1.m4143a(this.f5276b, Float.hashCode(this.f5275a) * 31, 31), 31), 31);
    }

    public r11(float f, float f2, float f3, float f4, boolean z) {
        this.f5275a = f;
        this.f5276b = f2;
        this.f5277c = f3;
        this.f5278d = f4;
        this.f5279e = z;
    }
}
