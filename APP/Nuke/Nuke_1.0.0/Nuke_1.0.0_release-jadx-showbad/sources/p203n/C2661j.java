package p203n;

import p095T.AbstractC1385s;
import p095T.C1366i0;
import p095T.InterfaceC1339T0;

/* JADX INFO: renamed from: n.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2661j implements InterfaceC1339T0 {

    /* JADX INFO: renamed from: d */
    public final C2652e0 f8477d;

    /* JADX INFO: renamed from: e */
    public final C1366i0 f8478e;

    /* JADX INFO: renamed from: f */
    public AbstractC2670o f8479f;

    /* JADX INFO: renamed from: g */
    public long f8480g;

    /* JADX INFO: renamed from: h */
    public long f8481h;

    /* JADX INFO: renamed from: i */
    public boolean f8482i;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r10v0 n.e0)
  (r11v0 java.lang.Object)
  (wrap:n.o:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null n.o) : (r12v0 n.o))
  (Long.MIN_VALUE long)
  (Long.MIN_VALUE long)
  false
 A[MD:(n.e0, java.lang.Object, n.o, long, long, boolean):void (m)] (LINE:1) call: n.j.<init>(n.e0, java.lang.Object, n.o, long, long, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2661j(C2652e0 c2652e0, Object obj, AbstractC2670o abstractC2670o, int i5) {
        this(c2652e0, obj, (i5 & 4) != 0 ? null : abstractC2670o, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        return this.f8478e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationState(value=" + this.f8478e.getValue() + ", velocity=" + this.f8477d.f8460b.mo1h(this.f8479f) + ", isRunning=" + this.f8482i + ", lastFrameTimeNanos=" + this.f8480g + ", finishedTimeNanos=" + this.f8481h + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2661j(C2652e0 c2652e0, Object obj, AbstractC2670o abstractC2670o, long j5, long j6, boolean z5) {
        AbstractC2670o abstractC2670oM4612e;
        this.f8477d = c2652e0;
        this.f8478e = AbstractC1385s.m2629s(obj);
        if (abstractC2670o != null) {
            abstractC2670oM4612e = AbstractC2649d.m4612e(abstractC2670o);
        } else {
            abstractC2670oM4612e = (AbstractC2670o) c2652e0.f8459a.mo1h(obj);
            abstractC2670oM4612e.mo4627d();
        }
        this.f8479f = abstractC2670oM4612e;
        this.f8480g = j5;
        this.f8481h = j6;
        this.f8482i = z5;
    }
}
