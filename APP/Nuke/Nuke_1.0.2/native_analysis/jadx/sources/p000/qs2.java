package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 extends ru2 {

    /* JADX INFO: renamed from: c */
    public zy1 f9156c;

    /* JADX INFO: renamed from: d */
    public int f9157d;

    public qs2(long j, zy1 zy1Var) {
        super(j);
        this.f9156c = zy1Var;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final void mo1717a(ru2 ru2Var) {
        ru2Var.getClass();
        qs2 qs2Var = (qs2) ru2Var;
        synchronized (p40.f7977m) {
            this.f9156c = qs2Var.f9156c;
            this.f9157d = qs2Var.f9157d;
        }
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final ru2 mo1718b(long j) {
        return new qs2(j, this.f9156c);
    }
}
