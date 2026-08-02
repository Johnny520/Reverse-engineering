package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class kr2 extends yh1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (Float.NaN float) : (r3v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED] (LINE:8)) != (0 int)) ? (Float.NaN float) : (r4v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (4 int) A[WRAPPED] (LINE:13)) != (0 int)) ? (Float.NaN float) : (r5v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0011: ARITH (r7v0 int) & (8 int) A[WRAPPED] (LINE:18)) != (0 int)) ? (Float.NaN float) : (r6v0 float))
  true
 A[MD:(float, float, float, float, boolean):void (m)] (LINE:24) call: kr2.<init>(float, float, float, float, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kr2(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr2)) {
            return false;
        }
        kr2 kr2Var = (kr2) obj;
        return za0.b(this.a, kr2Var.a) && za0.b(this.b, kr2Var.b) && za0.b(this.c, kr2Var.c) && za0.b(this.d, kr2Var.d) && this.e == kr2Var.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        lr2 lr2Var = new lr2();
        lr2Var.v = this.a;
        lr2Var.w = this.b;
        lr2Var.x = this.c;
        lr2Var.y = this.d;
        lr2Var.z = this.e;
        return lr2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        lr2 lr2Var = (lr2) th1Var;
        lr2Var.v = this.a;
        lr2Var.w = this.b;
        lr2Var.x = this.c;
        lr2Var.y = this.d;
        lr2Var.z = this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.e) + vi0.c(this.d, vi0.c(this.c, vi0.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public kr2(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
