package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t71 extends th1 implements j61 {

    /* JADX INFO: renamed from: y */
    public static final r71 f10589y = new r71();

    /* JADX INFO: renamed from: v */
    public r81 f10590v;

    /* JADX INFO: renamed from: w */
    public C0429lm f10591w;

    /* JADX INFO: renamed from: x */
    public qv1 f10592x;

    /* JADX INFO: renamed from: M0 */
    public final boolean m5127M0(p71 p71Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.f10592x != qv1.f9205h) {
                }
            } else if (i != 1 && i != 2) {
                C0676s.m4653l("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (m5128N0(i) ? p71Var.f8011a > 0 : p71Var.f8012b < this.f10590v.f9427a.m973g().f12887n - 1) {
                return true;
            }
        } else if (this.f10592x != qv1.f9206i) {
            if (m5128N0(i)) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m5128N0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = sp0.m4933c0(this).f9366G.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            c80.m675s();
            return false;
        }
        if (i != 4) {
            C0676s.m4653l("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = sp0.m4933c0(this).f9366G.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        c80.m675s();
        return false;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarMo2340e = if1Var.mo2340e(j);
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0579pg(sz1VarMo2340e, 4));
    }
}
