package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gs2 extends ru2 {

    /* JADX INFO: renamed from: c */
    public int f3695c;

    public gs2(long j, int i) {
        super(j);
        this.f3695c = i;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final void mo1717a(ru2 ru2Var) {
        ru2Var.getClass();
        this.f3695c = ((gs2) ru2Var).f3695c;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final ru2 mo1718b(long j) {
        return new gs2(j, this.f3695c);
    }
}
