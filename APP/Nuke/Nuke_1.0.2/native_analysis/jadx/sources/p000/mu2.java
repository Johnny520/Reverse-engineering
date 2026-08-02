package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mu2 extends ru2 {

    /* JADX INFO: renamed from: c */
    public AbstractC0077c3 f6884c;

    /* JADX INFO: renamed from: d */
    public int f6885d;

    /* JADX INFO: renamed from: e */
    public int f6886e;

    public mu2(long j, AbstractC0077c3 abstractC0077c3) {
        super(j);
        this.f6884c = abstractC0077c3;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final void mo1717a(ru2 ru2Var) {
        synchronized (AbstractC0738tl.f10826g) {
            ru2Var.getClass();
            this.f6884c = ((mu2) ru2Var).f6884c;
            this.f6885d = ((mu2) ru2Var).f6885d;
            this.f6886e = ((mu2) ru2Var).f6886e;
        }
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final ru2 mo1718b(long j) {
        return new mu2(j, this.f6884c);
    }
}
