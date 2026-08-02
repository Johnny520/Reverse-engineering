package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fs2 extends ru2 {

    /* JADX INFO: renamed from: c */
    public float f3130c;

    public fs2(float f, long j) {
        super(j);
        this.f3130c = f;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final void mo1717a(ru2 ru2Var) {
        ru2Var.getClass();
        this.f3130c = ((fs2) ru2Var).f3130c;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final ru2 mo1718b(long j) {
        return new fs2(this.f3130c, j);
    }
}
