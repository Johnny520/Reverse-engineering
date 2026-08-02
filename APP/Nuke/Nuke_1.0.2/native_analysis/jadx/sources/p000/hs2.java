package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hs2 extends ru2 {

    /* JADX INFO: renamed from: c */
    public long f4125c;

    public hs2(long j, long j2) {
        super(j);
        this.f4125c = j2;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final void mo1717a(ru2 ru2Var) {
        ru2Var.getClass();
        this.f4125c = ((hs2) ru2Var).f4125c;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final ru2 mo1718b(long j) {
        return new hs2(j, this.f4125c);
    }
}
