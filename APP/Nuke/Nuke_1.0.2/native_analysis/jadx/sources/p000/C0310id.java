package p000;

/* JADX INFO: renamed from: id */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0310id implements gu2 {

    /* JADX INFO: renamed from: h */
    public final n43 f4560h;

    /* JADX INFO: renamed from: i */
    public final nx1 f4561i;

    /* JADX INFO: renamed from: j */
    public AbstractC0494nd f4562j;

    /* JADX INFO: renamed from: k */
    public long f4563k;

    /* JADX INFO: renamed from: l */
    public long f4564l;

    /* JADX INFO: renamed from: m */
    public boolean f4565m;

    public C0310id(n43 n43Var, Object obj, AbstractC0494nd abstractC0494nd, long j, long j2, boolean z) {
        AbstractC0494nd abstractC0494ndM5092r;
        this.f4560h = n43Var;
        this.f4561i = op0.m3598u(obj);
        if (abstractC0494nd != null) {
            abstractC0494ndM5092r = t11.m5092r(abstractC0494nd);
        } else {
            abstractC0494ndM5092r = (AbstractC0494nd) n43Var.f7004a.mo5j(obj);
            abstractC0494ndM5092r.mo2480d();
        }
        this.f4562j = abstractC0494ndM5092r;
        this.f4563k = j;
        this.f4564l = j2;
        this.f4565m = z;
    }

    @Override // p000.gu2
    public final Object getValue() {
        return this.f4561i.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f4561i.getValue() + ", velocity=" + this.f4560h.f7005b.mo5j(this.f4562j) + ", isRunning=" + this.f4565m + ", lastFrameTimeNanos=" + this.f4563k + ", finishedTimeNanos=" + this.f4564l + ')';
    }

    public /* synthetic */ C0310id(n43 n43Var, Object obj, AbstractC0494nd abstractC0494nd, int i) {
        this(n43Var, obj, (i & 4) != 0 ? null : abstractC0494nd, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
