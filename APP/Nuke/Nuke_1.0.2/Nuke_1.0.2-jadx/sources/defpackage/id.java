package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class id implements gu2 {
    public final n43 h;
    public final nx1 i;
    public nd j;
    public long k;
    public long l;
    public boolean m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public id(n43 n43Var, Object obj, nd ndVar, long j, long j2, boolean z) {
        nd ndVarR;
        this.h = n43Var;
        this.i = op0.u(obj);
        if (ndVar != null) {
            ndVarR = t11.r(ndVar);
        } else {
            ndVarR = (nd) n43Var.a.j(obj);
            ndVarR.d();
        }
        this.j = ndVarR;
        this.k = j;
        this.l = j2;
        this.m = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        return this.i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationState(value=" + this.i.getValue() + ", velocity=" + this.h.b.j(this.j) + ", isRunning=" + this.m + ", lastFrameTimeNanos=" + this.k + ", finishedTimeNanos=" + this.l + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r10v0 n43)
  (r11v0 java.lang.Object)
  (wrap:nd:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null nd) : (r12v0 nd))
  (Long.MIN_VALUE long)
  (Long.MIN_VALUE long)
  false
 A[MD:(n43, java.lang.Object, nd, long, long, boolean):void (m)] (LINE:39) call: id.<init>(n43, java.lang.Object, nd, long, long, boolean):void type: THIS */
    public /* synthetic */ id(n43 n43Var, Object obj, nd ndVar, int i) {
        this(n43Var, obj, (i & 4) != 0 ? null : ndVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
