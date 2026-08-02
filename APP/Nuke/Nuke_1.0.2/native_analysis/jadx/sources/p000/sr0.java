package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 implements g22 {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0644r5 f10327h;

    /* JADX INFO: renamed from: i */
    public final ws1 f10328i;

    /* JADX INFO: renamed from: j */
    public long f10329j = 0;

    public sr0(InterfaceC0644r5 interfaceC0644r5, ws1 ws1Var) {
        this.f10327h = interfaceC0644r5;
        this.f10328i = ws1Var;
    }

    @Override // p000.g22
    /* JADX INFO: renamed from: a */
    public final long mo1788a(d11 d11Var, long j, d61 d61Var, long j2) {
        long jMo611a = this.f10328i.mo611a();
        if ((9223372034707292159L & jMo611a) == 9205357640488583168L) {
            jMo611a = this.f10329j;
        }
        this.f10329j = jMo611a;
        return z01.m6373c(z01.m6373c((((long) d11Var.f1808b) & 4294967295L) | (((long) d11Var.f1807a) << 32), tp0.m5346J(jMo611a)), this.f10327h.mo3571a(j2, 0L, d61Var));
    }
}
