package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5413h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f5414i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f5415j;

    public /* synthetic */ ka0(float f, int i, long j) {
        this.f5413h = i;
        this.f5414i = f;
        this.f5415j = j;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f5413h;
        a83 a83Var = a83.f116a;
        float f = this.f5414i;
        switch (i) {
            case 0:
                nc0 nc0Var = (nc0) obj;
                float fMo689A = nc0Var.mo689A(f);
                nc0Var.mo3277Y(this.f5415j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(nc0Var.mo689A(f) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(nc0Var.mo689A(f) / 2.0f))), fMo689A, (496 & 16) != 0 ? 0 : 0);
                break;
            default:
                nc0 nc0Var2 = (nc0) obj;
                float fMo689A2 = nc0Var2.mo689A(f);
                nc0Var2.mo3277Y(this.f5415j, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(nc0Var2.mo689A(f) / 2.0f) << 32), (((long) Float.floatToRawIntBits(nc0Var2.mo689A(f) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var2.mo3280d() & 4294967295L))))), fMo689A2, (496 & 16) != 0 ? 0 : 0);
                break;
        }
        return a83Var;
    }
}
