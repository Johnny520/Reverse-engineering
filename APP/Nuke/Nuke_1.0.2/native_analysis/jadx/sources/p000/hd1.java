package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 implements e70 {

    /* JADX INFO: renamed from: h */
    public boolean f3957h;

    /* JADX INFO: renamed from: i */
    public long f3958i = 9223372034707292159L;

    /* JADX INFO: renamed from: j */
    public long f3959j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ kd1 f3960k;

    public hd1(kd1 kd1Var) {
        this.f3960k = kd1Var;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: a */
    public final void m2142a(gu0 gu0Var, float f) {
        kd1 kd1Var = this.f3960k;
        qb2 qb2Var = kd1Var.f5470t;
        if (qb2Var == null) {
            qb2Var = new qb2();
            kd1Var.f5470t = qb2Var;
        }
        int iM3100o0 = AbstractC0460mg.m3100o0((gu0[]) qb2Var.f8875c, gu0Var);
        if (iM3100o0 >= 0) {
            float[] fArr = (float[]) qb2Var.f8876d;
            if (fArr[iM3100o0] != f) {
                fArr[iM3100o0] = f;
                ((byte[]) qb2Var.f8877e)[iM3100o0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) qb2Var.f8877e;
                if (bArr[iM3100o0] == 2) {
                    bArr[iM3100o0] = 0;
                    return;
                }
                return;
            }
        }
        int i = qb2Var.f8874b;
        gu0[] gu0VarArr = (gu0[]) qb2Var.f8875c;
        if (i == gu0VarArr.length) {
            int i2 = i * 2;
            qb2Var.f8875c = (gu0[]) Arrays.copyOf(gu0VarArr, i2);
            qb2Var.f8876d = Arrays.copyOf((float[]) qb2Var.f8876d, i2);
            qb2Var.f8877e = Arrays.copyOf((byte[]) qb2Var.f8877e, i2);
        }
        ((gu0[]) qb2Var.f8875c)[i] = gu0Var;
        ((byte[]) qb2Var.f8877e)[i] = 3;
        ((float[]) qb2Var.f8876d)[i] = f;
        qb2Var.f8874b++;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f3960k.mo693b();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f3960k.mo697m();
    }
}
