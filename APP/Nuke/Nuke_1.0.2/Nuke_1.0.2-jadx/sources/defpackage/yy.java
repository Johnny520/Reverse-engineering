package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class yy {
    public final su a;
    public final su b;
    public final su c;
    public final float[] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yy(su suVar, su suVar2, int i) {
        float[] fArr;
        su suVarT = tp0.s(suVar.b, 12884901888L) ? s11.t(suVar) : suVar;
        su suVarT2 = tp0.s(suVar2.b, 12884901888L) ? s11.t(suVar2) : suVar2;
        float[] fArrA = pp0.h;
        if (i == 3) {
            boolean zS = tp0.s(suVar.b, 12884901888L);
            boolean zS2 = tp0.s(suVar2.b, 12884901888L);
            if (!(zS && zS2) && (zS || zS2)) {
                qd3 qd3Var = ((ka2) (zS ? suVar : suVar2)).d;
                float[] fArrA2 = zS ? qd3Var.a() : fArrA;
                fArrA = zS2 ? qd3Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        }
        this(suVar2, suVarT, suVarT2, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long a(long j) {
        float fH = ju.h(j);
        float fG = ju.g(j);
        float fE = ju.e(j);
        float fD = ju.d(j);
        su suVar = this.b;
        long jD = suVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = suVar.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }

    public yy(su suVar, su suVar2, su suVar3, float[] fArr) {
        this.a = suVar;
        this.b = suVar2;
        this.c = suVar3;
        this.d = fArr;
    }
}
