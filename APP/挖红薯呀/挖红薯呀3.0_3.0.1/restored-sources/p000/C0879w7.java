package p000;

/* JADX INFO: renamed from: w7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0879w7 implements w31 {

    /* JADX INFO: renamed from: d */
    public final q91 f7015d;

    /* JADX INFO: renamed from: e */
    public final gp0 f7016e;

    /* JADX INFO: renamed from: f */
    public AbstractC0046b8 f7017f;

    /* JADX INFO: renamed from: g */
    public long f7018g;

    /* JADX INFO: renamed from: h */
    public long f7019h;

    /* JADX INFO: renamed from: i */
    public boolean f7020i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0879w7(q91 q91Var, Object obj, AbstractC0046b8 abstractC0046b8, long j, long j2, boolean z) {
        AbstractC0046b8 abstractC0046b8M1537m;
        this.f7015d = q91Var;
        this.f7016e = r60.m3419u(obj);
        if (abstractC0046b8 != null) {
            abstractC0046b8M1537m = AbstractC0307i4.m1537m(abstractC0046b8);
        } else {
            abstractC0046b8M1537m = (AbstractC0046b8) q91Var.f5089a.invoke(obj);
            abstractC0046b8M1537m.mo29d();
        }
        this.f7017f = abstractC0046b8M1537m;
        this.f7018g = j;
        this.f7019h = j2;
        this.f7020i = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m4921a() {
        return this.f7015d.f5090b.invoke(this.f7017f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        return this.f7016e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationState(value=" + this.f7016e.getValue() + ", velocity=" + m4921a() + ", isRunning=" + this.f7020i + ", lastFrameTimeNanos=" + this.f7018g + ", finishedTimeNanos=" + this.f7019h + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r10v0 q91)
  (r11v0 java.lang.Object)
  (wrap:b8:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null b8) : (r12v0 b8))
  (Long.MIN_VALUE long)
  (Long.MIN_VALUE long)
  false
 A[MD:(q91, java.lang.Object, b8, long, long, boolean):void (m)] (LINE:39) call: w7.<init>(q91, java.lang.Object, b8, long, long, boolean):void type: THIS */
    public /* synthetic */ C0879w7(q91 q91Var, Object obj, AbstractC0046b8 abstractC0046b8, int i) {
        this(q91Var, obj, (i & 4) != 0 ? null : abstractC0046b8, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
