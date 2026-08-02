package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class js2 extends ru2 {

    /* JADX INFO: renamed from: c */
    public Object f5197c;

    public js2(long j, Object obj) {
        super(j);
        this.f5197c = obj;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final void mo1717a(ru2 ru2Var) {
        ru2Var.getClass();
        this.f5197c = ((js2) ru2Var).f5197c;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final ru2 mo1718b(long j) {
        return new js2(ds2.m1126j().mo79g(), this.f5197c);
    }
}
