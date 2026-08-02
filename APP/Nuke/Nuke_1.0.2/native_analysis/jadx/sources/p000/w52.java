package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w52 extends u92 {

    /* JADX INFO: renamed from: j */
    public final String f12358j;

    /* JADX INFO: renamed from: k */
    public final long f12359k;

    /* JADX INFO: renamed from: l */
    public final o52 f12360l;

    public w52(String str, long j, o52 o52Var) {
        this.f12358j = str;
        this.f12359k = j;
        this.f12360l = o52Var;
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: c */
    public final long mo273c() {
        return this.f12359k;
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: e */
    public final vf1 mo274e() {
        String str = this.f12358j;
        if (str != null) {
            o72 o72Var = vf1.f11926d;
            try {
                return AbstractC0731te.m5175C(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: g */
    public final InterfaceC0549on mo275g() {
        return this.f12360l;
    }
}
