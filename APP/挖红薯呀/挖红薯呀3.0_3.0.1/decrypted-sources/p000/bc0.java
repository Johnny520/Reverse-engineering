package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements i50 {

    /* JADX INFO: renamed from: d */
    public final ac0 f492d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bc0(ac0 ac0Var) {
        this.f492d = ac0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: A */
    public final long mo340A(i50 i50Var, long j) {
        boolean z = i50Var instanceof bc0;
        ac0 ac0Var = this.f492d;
        if (!z) {
            ac0 ac0VarM4271n = u50.m4271n(ac0Var);
            qj0 qj0Var = ac0VarM4271n.f101r;
            long jM2933d = ok0.m2933d(mo340A(ac0VarM4271n.f104u, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (ac0VarM4271n.f102s & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!qj0Var.mo436G0().f4542q) {
                w10.m4824b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            qj0Var.m3276Q0();
            qj0 qj0Var2 = qj0Var.f5182t;
            if (qj0Var2 != null) {
                qj0Var = qj0Var2;
            }
            return ok0.m2934e(jM2933d, qj0Var.mo340A(i50Var, 0L));
        }
        ac0 ac0Var2 = ((bc0) i50Var).f492d;
        qj0 qj0Var3 = ac0Var2.f101r;
        qj0Var3.m3276Q0();
        ac0 ac0VarMo435E0 = ac0Var.f101r.m3265C0(qj0Var3).mo435E0();
        if (ac0VarMo435E0 != null) {
            long jM4834b = w20.m4834b(w20.m4835c(ac0Var2.m62y0(ac0VarMo435E0, false), AbstractC0307i4.m1518D(j)), ac0Var.m62y0(ac0VarMo435E0, false));
            return (((long) Float.floatToRawIntBits((int) (jM4834b >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM4834b & 4294967295L))) & 4294967295L);
        }
        ac0 ac0VarM4271n2 = u50.m4271n(ac0Var2);
        long jM4835c = w20.m4835c(w20.m4835c(ac0Var2.m62y0(ac0VarM4271n2, false), ac0VarM4271n2.f102s), AbstractC0307i4.m1518D(j));
        ac0 ac0VarM4271n3 = u50.m4271n(ac0Var);
        long jM4834b2 = w20.m4834b(jM4835c, w20.m4835c(ac0Var.m62y0(ac0VarM4271n3, false), ac0VarM4271n3.f102s));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM4834b2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM4834b2 & 4294967295L))) & 4294967295L;
        qj0 qj0Var4 = ac0VarM4271n3.f101r.f5182t;
        qj0Var4.getClass();
        qj0 qj0Var5 = ac0VarM4271n2.f101r.f5182t;
        qj0Var5.getClass();
        return qj0Var4.mo340A(qj0Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: B */
    public final st0 mo341B(i50 i50Var, boolean z) {
        return this.f492d.f101r.mo341B(i50Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: G */
    public final long mo342G() {
        ac0 ac0Var = this.f492d;
        return (((long) ac0Var.f7400d) << 32) | (((long) ac0Var.f7401e) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m343a() {
        ac0 ac0Var = this.f492d;
        ac0 ac0VarM4271n = u50.m4271n(ac0Var);
        return ok0.m2933d(mo340A(ac0VarM4271n.f104u, 0L), ac0Var.f101r.mo340A(ac0VarM4271n.f101r, 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: d */
    public final long mo344d(long j) {
        return this.f492d.f101r.mo344d(ok0.m2934e(0L, m343a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: i */
    public final long mo345i(long j) {
        return this.f492d.f101r.mo345i(ok0.m2934e(j, m343a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: k */
    public final i50 mo346k() {
        ac0 ac0VarMo435E0;
        if (!mo348z()) {
            w10.m4824b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        qj0 qj0Var = this.f492d.f101r.f5180r.f395I.f3996d.f5182t;
        if (qj0Var == null || (ac0VarMo435E0 = qj0Var.mo435E0()) == null) {
            return null;
        }
        return ac0VarMo435E0.f104u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: x */
    public final long mo347x(i50 i50Var, long j) {
        return mo340A(i50Var, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.i50
    /* JADX INFO: renamed from: z */
    public final boolean mo348z() {
        return this.f492d.f101r.mo436G0().f4542q;
    }
}
