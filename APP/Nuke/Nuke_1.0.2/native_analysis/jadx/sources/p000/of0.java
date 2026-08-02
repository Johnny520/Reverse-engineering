package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class of0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ sz1 f7660i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f7661j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f7662k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0161ec f7663l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of0(sz1 sz1Var, long j, long j2, C0161ec c0161ec) {
        super(1);
        this.f7660i = sz1Var;
        this.f7661j = j;
        this.f7662k = j2;
        this.f7663l = c0161ec;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        rz1 rz1Var = (rz1) obj;
        long j = this.f7661j;
        long j2 = this.f7662k;
        rz1Var.getClass();
        sz1 sz1Var = this.f7660i;
        rz1.m4638a(rz1Var, sz1Var);
        sz1Var.mo2506f0(z01.m6373c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), sz1Var.f10442l), 0.0f, this.f7663l);
        return a83.f116a;
    }
}
