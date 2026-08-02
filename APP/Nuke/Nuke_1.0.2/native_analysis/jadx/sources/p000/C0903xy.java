package p000;

/* JADX INFO: renamed from: xy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0903xy extends C0942yy {

    /* JADX INFO: renamed from: e */
    public final ka2 f13232e;

    /* JADX INFO: renamed from: f */
    public final ka2 f13233f;

    /* JADX INFO: renamed from: g */
    public final float[] f13234g;

    public C0903xy(ka2 ka2Var, ka2 ka2Var2) {
        float[] fArrM4672Q;
        super(ka2Var2, ka2Var, ka2Var2, null);
        this.f13232e = ka2Var;
        this.f13233f = ka2Var2;
        float[] fArr = C0337j5.f4892c.f4894b;
        qd3 qd3Var = ka2Var.f5419d;
        float[] fArr2 = ka2Var.f5424i;
        qd3 qd3Var2 = ka2Var2.f5419d;
        float[] fArr3 = ka2Var2.f5425j;
        if (s11.m4657B(qd3Var, qd3Var2)) {
            fArrM4672Q = s11.m4672Q(fArr3, fArr2);
        } else {
            float[] fArrM4147a = qd3Var.m4147a();
            float[] fArrM4147a2 = qd3Var2.m4147a();
            qd3 qd3Var3 = pp0.f8436e;
            fArrM4672Q = s11.m4672Q(s11.m4657B(qd3Var2, qd3Var3) ? fArr3 : s11.m4669N(s11.m4672Q(s11.m4726y(fArr, fArrM4147a2, new float[]{0.964212f, 1.0f, 0.825188f}), ka2Var2.f5424i)), s11.m4657B(qd3Var, qd3Var3) ? fArr2 : s11.m4672Q(s11.m4726y(fArr, fArrM4147a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f13234g = fArrM4672Q;
    }

    @Override // p000.C0942yy
    /* JADX INFO: renamed from: a */
    public final long mo6020a(long j) {
        float fM2571h = C0363ju.m2571h(j);
        float fM2570g = C0363ju.m2570g(j);
        float fM2568e = C0363ju.m2568e(j);
        float fM2567d = C0363ju.m2567d(j);
        ga2 ga2Var = this.f13232e.f5431p;
        float fMo687e = (float) ga2Var.mo687e(fM2571h);
        float fMo687e2 = (float) ga2Var.mo687e(fM2570g);
        float fMo687e3 = (float) ga2Var.mo687e(fM2568e);
        float[] fArr = this.f13234g;
        float f = (fArr[6] * fMo687e3) + (fArr[3] * fMo687e2) + (fArr[0] * fMo687e);
        float f2 = (fArr[7] * fMo687e3) + (fArr[4] * fMo687e2) + (fArr[1] * fMo687e);
        float f3 = (fArr[8] * fMo687e3) + (fArr[5] * fMo687e2) + (fArr[2] * fMo687e);
        ka2 ka2Var = this.f13233f;
        float fMo687e4 = (float) ka2Var.f5428m.mo687e(f);
        ga2 ga2Var2 = ka2Var.f5428m;
        return sp0.m4928a(fMo687e4, (float) ga2Var2.mo687e(f2), (float) ga2Var2.mo687e(f3), fM2567d, ka2Var);
    }
}
