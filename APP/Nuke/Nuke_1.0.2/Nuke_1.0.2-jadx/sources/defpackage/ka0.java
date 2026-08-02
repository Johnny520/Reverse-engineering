package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ka0(float f, int i, long j) {
        this.h = i;
        this.i = f;
        this.j = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        float f = this.i;
        switch (i) {
            case 0:
                nc0 nc0Var = (nc0) obj;
                float fA = nc0Var.A(f);
                nc0Var.Y(this.j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(nc0Var.A(f) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(nc0Var.A(f) / 2.0f))), fA, (496 & 16) != 0 ? 0 : 0);
                break;
            default:
                nc0 nc0Var2 = (nc0) obj;
                float fA2 = nc0Var2.A(f);
                nc0Var2.Y(this.j, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(nc0Var2.A(f) / 2.0f) << 32), (((long) Float.floatToRawIntBits(nc0Var2.A(f) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var2.d() & 4294967295L))))), fA2, (496 & 16) != 0 ? 0 : 0);
                break;
        }
        return a83Var;
    }
}
