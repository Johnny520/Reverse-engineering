package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 {

    /* JADX INFO: renamed from: a */
    public final int f995a;

    /* JADX INFO: renamed from: b */
    public final C0503n9 f996b;

    /* JADX INFO: renamed from: c */
    public final C0073c f997c;

    /* JADX INFO: renamed from: d */
    public d81 f998d;

    /* JADX INFO: renamed from: e */
    public long f999e;

    /* JADX INFO: renamed from: f */
    public long f1000f;

    /* JADX INFO: renamed from: g */
    public long f1001g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ e81 f1002h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d81(e81 e81Var, int i, C0503n9 c0503n9, C0073c c0073c) {
        this.f1002h = e81Var;
        this.f995a = i;
        this.f996b = c0503n9;
        this.f997c = c0073c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m661a(long j, long j2, long j3, long j4, float[] fArr) {
        fu0 fu0Var;
        fu0 fu0Var2;
        long j5 = this.f1002h.f1348f;
        C0503n9 c0503n9 = this.f996b;
        qj0 qj0VarM3037O = pf1.m3037O(c0503n9, 2);
        b60 b60VarM3039Q = pf1.m3039Q(c0503n9);
        boolean zM273I = b60VarM3039Q.m273I();
        mj0 mj0Var = b60VarM3039Q.f395I;
        if (zM273I) {
            if (mj0Var.f3996d != qj0VarM3037O) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = qj0VarM3037O.f7402f;
                qj0 qj0Var = mj0Var.f3996d;
                qj0Var.getClass();
                long jM1518D = AbstractC0307i4.m1518D(qj0Var.mo340A(qj0VarM3037O, jFloatToRawIntBits));
                fu0Var = new fu0(jM1518D, (4294967295L & ((long) (((int) (jM1518D & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM1518D >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, c0503n9);
            } else {
                fu0Var = new fu0(j, j2, j3, j4, j5, fArr, c0503n9);
            }
            fu0Var2 = fu0Var;
        } else {
            fu0Var2 = null;
        }
        if (fu0Var2 == null) {
            return;
        }
        this.f997c.invoke(fu0Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m662b() {
        e81 e81Var = this.f1002h;
        ug0 ug0Var = e81Var.f1343a;
        int i = this.f995a;
        d81 d81Var = (d81) ug0Var.m4328g(i);
        if (d81Var != null) {
            if (d81Var == this) {
                d81 d81Var2 = this.f998d;
                this.f998d = null;
                if (d81Var2 == null) {
                    b60 b60VarM3039Q = pf1.m3039Q(this.f996b.f4529d);
                    if (b60VarM3039Q.f412k) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60VarM3039Q)).getRectManager().f6297a.m4254f(b60VarM3039Q.f406e, false);
                        return;
                    }
                    return;
                }
                int iM4325d = ug0Var.m4325d(i);
                Object[] objArr = ug0Var.f6113c;
                Object obj = objArr[iM4325d];
                ug0Var.f6112b[iM4325d] = i;
                objArr[iM4325d] = d81Var2;
                return;
            }
            int iM4325d2 = ug0Var.m4325d(i);
            Object[] objArr2 = ug0Var.f6113c;
            Object obj2 = objArr2[iM4325d2];
            ug0Var.f6112b[iM4325d2] = i;
            objArr2[iM4325d2] = d81Var;
            while (true) {
                d81 d81Var3 = d81Var.f998d;
                if (d81Var3 == null) {
                    break;
                }
                if (d81Var3 == this) {
                    d81Var.f998d = this.f998d;
                    this.f998d = null;
                    return;
                }
                d81Var = d81Var3;
            }
        }
        d81 d81Var4 = e81Var.f1344b;
        if (d81Var4 == this) {
            e81Var.f1344b = d81Var4.f998d;
            this.f998d = null;
            return;
        }
        d81 d81Var5 = d81Var4 != null ? d81Var4.f998d : null;
        while (true) {
            d81 d81Var6 = d81Var4;
            d81Var4 = d81Var5;
            if (d81Var4 == null) {
                return;
            }
            if (d81Var4 == this) {
                if (d81Var6 != null) {
                    d81Var6.f998d = d81Var4.f998d;
                }
                this.f998d = null;
                return;
            }
            d81Var5 = d81Var4.f998d;
        }
    }
}
