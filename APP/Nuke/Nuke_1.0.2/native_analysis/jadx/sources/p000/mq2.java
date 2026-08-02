package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mq2 extends AbstractC0527o3 {

    /* JADX INFO: renamed from: a */
    public long f6771a;

    /* JADX INFO: renamed from: b */
    public C0469mp f6772b;

    @Override // p000.AbstractC0527o3
    /* JADX INFO: renamed from: a */
    public final boolean mo2738a(AbstractC0484n3 abstractC0484n3) {
        lq2 lq2Var = (lq2) abstractC0484n3;
        if (this.f6771a >= 0) {
            return false;
        }
        long j = lq2Var.f6257p;
        if (j < lq2Var.f6258q) {
            lq2Var.f6258q = j;
        }
        this.f6771a = j;
        return true;
    }

    @Override // p000.AbstractC0527o3
    /* JADX INFO: renamed from: b */
    public final t00[] mo2739b(AbstractC0484n3 abstractC0484n3) {
        long j = this.f6771a;
        this.f6771a = -1L;
        this.f6772b = null;
        return ((lq2) abstractC0484n3).m2968u(j);
    }
}
