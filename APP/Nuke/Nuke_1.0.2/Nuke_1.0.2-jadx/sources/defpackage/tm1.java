package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tm1 {
    public xm1 a;
    public xm1 b;
    public xm0 c = new ea(16, this);
    public j20 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, u00 u00Var) {
        rm1 rm1Var;
        long j3;
        if (u00Var instanceof rm1) {
            rm1Var = (rm1) u00Var;
            int i = rm1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rm1Var.m = i - Integer.MIN_VALUE;
            } else {
                rm1Var = new rm1(this, u00Var);
            }
        }
        rm1 rm1Var2 = rm1Var;
        Object objK0 = rm1Var2.k;
        int i2 = rm1Var2.m;
        if (i2 == 0) {
            fg1.T(objK0);
            xm1 xm1Var = this.a;
            xm1 xm1VarN0 = xm1Var != null ? xm1Var.N0() : null;
            j3 = 0;
            k20 k20Var = k20.h;
            if (xm1VarN0 == null) {
                xm1 xm1Var2 = this.b;
                if (xm1Var2 != null) {
                    rm1Var2.m = 1;
                    objK0 = xm1Var2.k0(j, j2, rm1Var2);
                }
            } else {
                xm1 xm1Var3 = this.a;
                xm1 xm1VarN02 = xm1Var3 != null ? xm1Var3.N0() : null;
                if (xm1VarN02 != null) {
                    rm1Var2.m = 2;
                    objK0 = xm1VarN02.k0(j, j2, rm1Var2);
                }
            }
        } else if (i2 == 1) {
            fg1.T(objK0);
            j3 = ((da3) objK0).a;
        } else {
            if (i2 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objK0);
            j3 = ((da3) objK0).a;
        }
        return new da3(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, u00 u00Var) {
        sm1 sm1Var;
        long j2;
        if (u00Var instanceof sm1) {
            sm1Var = (sm1) u00Var;
            int i = sm1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm1Var.m = i - Integer.MIN_VALUE;
            } else {
                sm1Var = new sm1(this, u00Var);
            }
        }
        Object objG0 = sm1Var.k;
        int i2 = sm1Var.m;
        if (i2 == 0) {
            fg1.T(objG0);
            xm1 xm1Var = this.a;
            xm1 xm1VarN0 = xm1Var != null ? xm1Var.N0() : null;
            if (xm1VarN0 == null) {
                j2 = 0;
                return new da3(j2);
            }
            sm1Var.m = 1;
            objG0 = xm1VarN0.g0(j, sm1Var);
            k20 k20Var = k20.h;
            if (objG0 == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objG0);
        }
        j2 = ((da3) objG0).a;
        return new da3(j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j20 c() {
        j20 j20Var = (j20) this.c.a();
        if (j20Var != null) {
            return j20Var;
        }
        s.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
