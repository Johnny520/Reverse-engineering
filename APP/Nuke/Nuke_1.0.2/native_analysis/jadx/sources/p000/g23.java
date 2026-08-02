package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g23 {

    /* JADX INFO: renamed from: a */
    public final int f3285a;

    /* JADX INFO: renamed from: b */
    public final C0924yi f3286b;

    /* JADX INFO: renamed from: c */
    public final C0115d2 f3287c;

    /* JADX INFO: renamed from: d */
    public g23 f3288d;

    /* JADX INFO: renamed from: e */
    public long f3289e;

    /* JADX INFO: renamed from: f */
    public long f3290f;

    /* JADX INFO: renamed from: g */
    public long f3291g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ h23 f3292h;

    public g23(h23 h23Var, int i, C0924yi c0924yi, C0115d2 c0115d2) {
        this.f3292h = h23Var;
        this.f3285a = i;
        this.f3286b = c0924yi;
        this.f3287c = c0115d2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1789a(long j, long j2, long j3, long j4, float[] fArr) {
        x72 x72Var;
        x72 x72Var2;
        long j5 = this.f3292h.f3806f;
        C0924yi c0924yi = this.f3286b;
        zn1 zn1VarM4927Z = sp0.m4927Z(c0924yi, 2);
        r61 r61VarM4933c0 = sp0.m4933c0(c0924yi);
        boolean zM4351I = r61VarM4933c0.m4351I();
        vn1 vn1Var = r61VarM4933c0.f9372M;
        if (zM4351I) {
            if (((zn1) vn1Var.f12034e) != zn1VarM4927Z) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = zn1VarM4927Z.f10440j;
                zn1 zn1Var = (zn1) vn1Var.f12034e;
                zn1Var.getClass();
                long jM5346J = tp0.m5346J(zn1Var.mo642D(zn1VarM4927Z, jFloatToRawIntBits));
                x72Var = new x72(jM5346J, (4294967295L & ((long) (((int) (jM5346J & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM5346J >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, c0924yi);
            } else {
                x72Var = new x72(j, j2, j3, j4, j5, fArr, c0924yi);
            }
            x72Var2 = x72Var;
        } else {
            x72Var2 = null;
        }
        if (x72Var2 == null) {
            return;
        }
        this.f3287c.mo5j(x72Var2);
    }

    /* JADX INFO: renamed from: b */
    public final void m1790b() {
        h23 h23Var = this.f3292h;
        zj1 zj1Var = h23Var.f3801a;
        int i = this.f3285a;
        g23 g23Var = (g23) zj1Var.m6420g(i);
        if (g23Var != null) {
            if (g23Var == this) {
                g23 g23Var2 = this.f3288d;
                this.f3288d = null;
                if (g23Var2 == null) {
                    r61 r61VarM4933c0 = sp0.m4933c0(this.f3286b.f10757h);
                    if (r61VarM4933c0.f9390n) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61VarM4933c0)).getRectManager().f8751b.m1311t(r61VarM4933c0.f9385i, false);
                        return;
                    }
                    return;
                }
                int iM6417d = zj1Var.m6417d(i);
                Object[] objArr = zj1Var.f12751c;
                Object obj = objArr[iM6417d];
                zj1Var.f12750b[iM6417d] = i;
                objArr[iM6417d] = g23Var2;
                return;
            }
            int iM6417d2 = zj1Var.m6417d(i);
            Object[] objArr2 = zj1Var.f12751c;
            Object obj2 = objArr2[iM6417d2];
            zj1Var.f12750b[iM6417d2] = i;
            objArr2[iM6417d2] = g23Var;
            while (true) {
                g23 g23Var3 = g23Var.f3288d;
                if (g23Var3 == null) {
                    break;
                }
                if (g23Var3 == this) {
                    g23Var.f3288d = this.f3288d;
                    this.f3288d = null;
                    return;
                }
                g23Var = g23Var3;
            }
        }
        g23 g23Var4 = h23Var.f3802b;
        if (g23Var4 == this) {
            h23Var.f3802b = g23Var4.f3288d;
            this.f3288d = null;
            return;
        }
        g23 g23Var5 = g23Var4 != null ? g23Var4.f3288d : null;
        while (true) {
            g23 g23Var6 = g23Var4;
            g23Var4 = g23Var5;
            if (g23Var4 == null) {
                return;
            }
            if (g23Var4 == this) {
                if (g23Var6 != null) {
                    g23Var6.f3288d = g23Var4.f3288d;
                }
                this.f3288d = null;
                return;
            }
            g23Var5 = g23Var4.f3288d;
        }
    }
}
