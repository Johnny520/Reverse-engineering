package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 implements x01 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0477mk f1203a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0477mk f1204b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0477mk f1205c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0477mk f1206d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dw0(InterfaceC0477mk interfaceC0477mk, InterfaceC0477mk interfaceC0477mk2, InterfaceC0477mk interfaceC0477mk3, InterfaceC0477mk interfaceC0477mk4) {
        this.f1203a = interfaceC0477mk;
        this.f1204b = interfaceC0477mk2;
        this.f1205c = interfaceC0477mk3;
        this.f1206d = interfaceC0477mk4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static dw0 m736b(dw0 dw0Var, InterfaceC0477mk interfaceC0477mk, InterfaceC0477mk interfaceC0477mk2, InterfaceC0477mk interfaceC0477mk3, InterfaceC0477mk interfaceC0477mk4, int i) {
        if ((i & 1) != 0) {
            interfaceC0477mk = dw0Var.f1203a;
        }
        if ((i & 2) != 0) {
            interfaceC0477mk2 = dw0Var.f1204b;
        }
        if ((i & 4) != 0) {
            interfaceC0477mk3 = dw0Var.f1205c;
        }
        if ((i & 8) != 0) {
            interfaceC0477mk4 = dw0Var.f1206d;
        }
        dw0Var.getClass();
        return new dw0(interfaceC0477mk, interfaceC0477mk2, interfaceC0477mk3, interfaceC0477mk4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x01
    /* JADX INFO: renamed from: a */
    public final v50 mo737a(long j, k50 k50Var, InterfaceC0968ym interfaceC0968ym) {
        float fMo722a = this.f1203a.mo722a(j, interfaceC0968ym);
        float fMo722a2 = this.f1204b.mo722a(j, interfaceC0968ym);
        float fMo722a3 = this.f1205c.mo722a(j, interfaceC0968ym);
        float fMo722a4 = this.f1206d.mo722a(j, interfaceC0968ym);
        float fM3186b = q11.m3186b(j);
        float f = fMo722a + fMo722a4;
        if (f > fM3186b) {
            float f2 = fM3186b / f;
            fMo722a *= f2;
            fMo722a4 *= f2;
        }
        float f3 = fMo722a2 + fMo722a3;
        if (f3 > fM3186b) {
            float f4 = fM3186b / f3;
            fMo722a2 *= f4;
            fMo722a3 *= f4;
        }
        if (fMo722a < 0.0f || fMo722a2 < 0.0f || fMo722a3 < 0.0f || fMo722a4 < 0.0f) {
            z10.m5361a("Corner size in Px can't be negative(topStart = " + fMo722a + ", topEnd = " + fMo722a2 + ", bottomEnd = " + fMo722a3 + ", bottomStart = " + fMo722a4 + ")!");
        }
        if (fMo722a + fMo722a2 + fMo722a3 + fMo722a4 == 0.0f) {
            return new xm0(v50.m4398b(0L, j));
        }
        st0 st0VarM4398b = v50.m4398b(0L, j);
        k50 k50Var2 = k50.f3015d;
        float f5 = k50Var == k50Var2 ? fMo722a : fMo722a2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (k50Var == k50Var2) {
            fMo722a = fMo722a2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo722a)) << 32) | (((long) Float.floatToRawIntBits(fMo722a)) & 4294967295L);
        float f6 = k50Var == k50Var2 ? fMo722a3 : fMo722a4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (k50Var != k50Var2) {
            fMo722a4 = fMo722a3;
        }
        return new ym0(new bw0(st0VarM4398b.f5832a, st0VarM4398b.f5833b, st0VarM4398b.f5834c, st0VarM4398b.f5835d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo722a4)) << 32) | (((long) Float.floatToRawIntBits(fMo722a4)) & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0)) {
            return false;
        }
        dw0 dw0Var = (dw0) obj;
        return p30.m3002l(this.f1203a, dw0Var.f1203a) && p30.m3002l(this.f1204b, dw0Var.f1204b) && p30.m3002l(this.f1205c, dw0Var.f1205c) && p30.m3002l(this.f1206d, dw0Var.f1206d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1206d.hashCode() + ((this.f1205c.hashCode() + ((this.f1204b.hashCode() + (this.f1203a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f1203a + ", topEnd = " + this.f1204b + ", bottomEnd = " + this.f1205c + ", bottomStart = " + this.f1206d + ')';
    }
}
