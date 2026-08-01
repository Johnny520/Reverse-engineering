package p000;

/* JADX INFO: renamed from: lj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0433lj extends C0476mj {

    /* JADX INFO: renamed from: e */
    public final nv0 f3506e;

    /* JADX INFO: renamed from: f */
    public final nv0 f3507f;

    /* JADX INFO: renamed from: g */
    public final float[] f3508g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0433lj(nv0 nv0Var, nv0 nv0Var2) {
        float[] fArrM4021F;
        super(nv0Var2, nv0Var, nv0Var2, null);
        this.f3506e = nv0Var;
        this.f3507f = nv0Var2;
        float[] fArr = (float[]) C0910x1.f7230f.f7232e;
        cd1 cd1Var = nv0Var.f4348d;
        float[] fArr2 = nv0Var.f4353i;
        cd1 cd1Var2 = nv0Var2.f4348d;
        float[] fArr3 = nv0Var2.f4354j;
        if (s91.m4053r(cd1Var, cd1Var2)) {
            fArrM4021F = s91.m4021F(fArr3, fArr2);
        } else {
            float[] fArrM509a = cd1Var.m509a();
            float[] fArrM509a2 = cd1Var2.m509a();
            cd1 cd1Var3 = rd0.f5368g;
            fArrM4021F = s91.m4021F(s91.m4053r(cd1Var2, cd1Var3) ? fArr3 : s91.m4016A(s91.m4021F(s91.m4052q(fArr, fArrM509a2, new float[]{0.964212f, 1.0f, 0.825188f}), nv0Var2.f4353i)), s91.m4053r(cd1Var, cd1Var3) ? fArr2 : s91.m4021F(s91.m4052q(fArr, fArrM509a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f3508g = fArrM4021F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.C0476mj
    /* JADX INFO: renamed from: a */
    public final long mo1908a(long j) {
        float fM1099h = C0207ff.m1099h(j);
        float fM1098g = C0207ff.m1098g(j);
        float fM1096e = C0207ff.m1096e(j);
        float fM1095d = C0207ff.m1095d(j);
        jv0 jv0Var = this.f3506e.f4360p;
        float fMo1740c = (float) jv0Var.mo1740c(fM1099h);
        float fMo1740c2 = (float) jv0Var.mo1740c(fM1098g);
        float fMo1740c3 = (float) jv0Var.mo1740c(fM1096e);
        float[] fArr = this.f3508g;
        float f = (fArr[6] * fMo1740c3) + (fArr[3] * fMo1740c2) + (fArr[0] * fMo1740c);
        float f2 = (fArr[7] * fMo1740c3) + (fArr[4] * fMo1740c2) + (fArr[1] * fMo1740c);
        float f3 = (fArr[8] * fMo1740c3) + (fArr[5] * fMo1740c2) + (fArr[2] * fMo1740c);
        nv0 nv0Var = this.f3507f;
        float fMo1740c4 = (float) nv0Var.f4357m.mo1740c(f);
        jv0 jv0Var2 = nv0Var.f4357m;
        return p30.m2991a(fMo1740c4, (float) jv0Var2.mo1740c(f2), (float) jv0Var2.mo1740c(f3), fM1095d, nv0Var);
    }
}
