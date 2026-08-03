package p116i;

import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p117i0.InterfaceC1854l2;

/* JADX INFO: renamed from: i.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1766l implements InterfaceC1854l2 {

    /* JADX INFO: renamed from: g */
    public final C1771m1 f5900g;

    /* JADX INFO: renamed from: h */
    public final C1845j1 f5901h;

    /* JADX INFO: renamed from: i */
    public AbstractC1781q f5902i;

    /* JADX INFO: renamed from: j */
    public long f5903j;

    /* JADX INFO: renamed from: k */
    public long f5904k;

    /* JADX INFO: renamed from: l */
    public boolean f5905l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1766l(C1771m1 c1771m1, Object obj, AbstractC1781q abstractC1781q, long j3, long j4, boolean z9) {
        AbstractC1781q abstractC1781qM4373i;
        this.f5900g = c1771m1;
        this.f5901h = AbstractC1874r.m4639u(obj);
        if (abstractC1781q != null) {
            abstractC1781qM4373i = AbstractC1742d.m4373i(abstractC1781q);
        } else {
            abstractC1781qM4373i = (AbstractC1781q) c1771m1.f5912a.invoke(obj);
            abstractC1781qM4373i.mo4426d();
        }
        this.f5902i = abstractC1781qM4373i;
        this.f5903j = j3;
        this.f5904k = j4;
        this.f5905l = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return this.f5901h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationState(value=" + this.f5901h.getValue() + ", velocity=" + this.f5900g.f5913b.invoke(this.f5902i) + ", isRunning=" + this.f5905l + ", lastFrameTimeNanos=" + this.f5903j + ", finishedTimeNanos=" + this.f5904k + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r10v0 i.m1)
  (r11v0 java.lang.Object)
  (wrap:i.q:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null i.q) : (r12v0 i.q))
  (Long.MIN_VALUE long)
  (Long.MIN_VALUE long)
  false
 A[MD:(i.m1, java.lang.Object, i.q, long, long, boolean):void (m)] (LINE:39) call: i.l.<init>(i.m1, java.lang.Object, i.q, long, long, boolean):void type: THIS */
    public /* synthetic */ C1766l(C1771m1 c1771m1, Object obj, AbstractC1781q abstractC1781q, int i9) {
        this(c1771m1, obj, (i9 & 4) != 0 ? null : abstractC1781q, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
