package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jq2 implements ca0 {

    /* JADX INFO: renamed from: h */
    public final lq2 f5162h;

    /* JADX INFO: renamed from: i */
    public final long f5163i;

    /* JADX INFO: renamed from: j */
    public final Object f5164j;

    /* JADX INFO: renamed from: k */
    public final C0469mp f5165k;

    public jq2(lq2 lq2Var, long j, Object obj, C0469mp c0469mp) {
        this.f5162h = lq2Var;
        this.f5163i = j;
        this.f5164j = obj;
        this.f5165k = c0469mp;
    }

    @Override // p000.ca0
    /* JADX INFO: renamed from: a */
    public final void mo717a() {
        lq2 lq2Var = this.f5162h;
        synchronized (lq2Var) {
            if (this.f5163i >= lq2Var.m2961n()) {
                Object[] objArr = lq2Var.f6256o;
                objArr.getClass();
                long j = this.f5163i;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    AbstractC0570p7.m3774j(objArr, j, AbstractC0570p7.f7997f);
                    lq2Var.m2957h();
                }
            }
        }
    }
}
