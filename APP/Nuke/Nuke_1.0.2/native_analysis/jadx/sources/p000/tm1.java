package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tm1 {

    /* JADX INFO: renamed from: a */
    public xm1 f10845a;

    /* JADX INFO: renamed from: b */
    public xm1 f10846b;

    /* JADX INFO: renamed from: c */
    public xm0 f10847c = new C0159ea(16, this);

    /* JADX INFO: renamed from: d */
    public j20 f10848d;

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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5329a(long j, long j2, u00 u00Var) {
        rm1 rm1Var;
        long j3;
        if (u00Var instanceof rm1) {
            rm1Var = (rm1) u00Var;
            int i = rm1Var.f9646m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rm1Var.f9646m = i - Integer.MIN_VALUE;
            } else {
                rm1Var = new rm1(this, u00Var);
            }
        }
        rm1 rm1Var2 = rm1Var;
        Object objMo3658k0 = rm1Var2.f9644k;
        int i2 = rm1Var2.f9646m;
        if (i2 == 0) {
            fg1.m1627T(objMo3658k0);
            xm1 xm1Var = this.f10845a;
            xm1 xm1VarM6160N0 = xm1Var != null ? xm1Var.m6160N0() : null;
            j3 = 0;
            k20 k20Var = k20.f5323h;
            if (xm1VarM6160N0 == null) {
                xm1 xm1Var2 = this.f10846b;
                if (xm1Var2 != null) {
                    rm1Var2.f9646m = 1;
                    objMo3658k0 = xm1Var2.mo3658k0(j, j2, rm1Var2);
                }
            } else {
                xm1 xm1Var3 = this.f10845a;
                xm1 xm1VarM6160N02 = xm1Var3 != null ? xm1Var3.m6160N0() : null;
                if (xm1VarM6160N02 != null) {
                    rm1Var2.f9646m = 2;
                    objMo3658k0 = xm1VarM6160N02.mo3658k0(j, j2, rm1Var2);
                }
            }
        } else if (i2 == 1) {
            fg1.m1627T(objMo3658k0);
            j3 = ((da3) objMo3658k0).f1950a;
        } else {
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objMo3658k0);
            j3 = ((da3) objMo3658k0).f1950a;
        }
        return new da3(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5330b(long j, u00 u00Var) {
        sm1 sm1Var;
        long j2;
        if (u00Var instanceof sm1) {
            sm1Var = (sm1) u00Var;
            int i = sm1Var.f10193m;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm1Var.f10193m = i - Integer.MIN_VALUE;
            } else {
                sm1Var = new sm1(this, u00Var);
            }
        }
        Object objMo4196g0 = sm1Var.f10191k;
        int i2 = sm1Var.f10193m;
        if (i2 == 0) {
            fg1.m1627T(objMo4196g0);
            xm1 xm1Var = this.f10845a;
            xm1 xm1VarM6160N0 = xm1Var != null ? xm1Var.m6160N0() : null;
            if (xm1VarM6160N0 == null) {
                j2 = 0;
                return new da3(j2);
            }
            sm1Var.f10193m = 1;
            objMo4196g0 = xm1VarM6160N0.mo4196g0(j, sm1Var);
            k20 k20Var = k20.f5323h;
            if (objMo4196g0 == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objMo4196g0);
        }
        j2 = ((da3) objMo4196g0).f1950a;
        return new da3(j2);
    }

    /* JADX INFO: renamed from: c */
    public final j20 m5331c() {
        j20 j20Var = (j20) this.f10847c.mo6a();
        if (j20Var != null) {
            return j20Var;
        }
        C0676s.m4653l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
