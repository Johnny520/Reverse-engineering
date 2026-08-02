package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 implements e70 {
    public boolean h;
    public long i = 9223372034707292159L;
    public long j = 0;
    public final /* synthetic */ kd1 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hd1(kd1 kd1Var) {
        this.k = kd1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    public final void a(gu0 gu0Var, float f) {
        kd1 kd1Var = this.k;
        qb2 qb2Var = kd1Var.t;
        if (qb2Var == null) {
            qb2Var = new qb2();
            kd1Var.t = qb2Var;
        }
        int iO0 = mg.o0((gu0[]) qb2Var.c, gu0Var);
        if (iO0 >= 0) {
            float[] fArr = (float[]) qb2Var.d;
            if (fArr[iO0] != f) {
                fArr[iO0] = f;
                ((byte[]) qb2Var.e)[iO0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) qb2Var.e;
                if (bArr[iO0] == 2) {
                    bArr[iO0] = 0;
                    return;
                }
                return;
            }
        }
        int i = qb2Var.b;
        gu0[] gu0VarArr = (gu0[]) qb2Var.c;
        if (i == gu0VarArr.length) {
            int i2 = i * 2;
            qb2Var.c = (gu0[]) Arrays.copyOf(gu0VarArr, i2);
            qb2Var.d = Arrays.copyOf((float[]) qb2Var.d, i2);
            qb2Var.e = Arrays.copyOf((byte[]) qb2Var.e, i2);
        }
        ((gu0[]) qb2Var.c)[i] = gu0Var;
        ((byte[]) qb2Var.e)[i] = 3;
        ((float[]) qb2Var.d)[i] = f;
        qb2Var.b++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.k.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.k.m();
    }
}
