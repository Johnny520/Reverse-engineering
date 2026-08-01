package p000;

/* JADX INFO: renamed from: o9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0542o9 extends te0 {

    /* JADX INFO: renamed from: a */
    public C0503n9 f4487a;

    /* JADX INFO: renamed from: b */
    public C0550og f4488b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new C0503n9(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo229f(oe0 oe0Var) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r3 != p000.EnumC1007zk.f7916d) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        return p000.na1.f4229a;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2814g(AbstractC0358jk abstractC0358jk) throws Throwable {
        Object objM4034U;
        C0550og c0550og = this.f4488b;
        int i = 1;
        if (c0550og == null) {
            c0550og = new C0550og(true);
            c0550og.m1625Q(null);
            this.f4488b = c0550og;
            C0503n9 c0503n9 = this.f4487a;
            if (c0503n9 != null && c0503n9.f4542q) {
                c0503n9.m2637w0();
            }
        }
        while (true) {
            Object objM1622N = c0550og.m1622N();
            if (objM1622N instanceof y00) {
                if (c0550og.m1635d0(objM1622N) >= 0) {
                    g40 g40Var = new g40(rd0.m3497z(abstractC0358jk), c0550og);
                    g40Var.m4992v();
                    g40Var.m4995z(new C0684rc(i, pf1.m3027C(c0550og, true, new dv0(g40Var))));
                    objM4034U = g40Var.m4990t();
                    break;
                }
            } else {
                if (objM1622N instanceof C0688rg) {
                    throw ((C0688rg) objM1622N).f5416a;
                }
                objM4034U = s91.m4034U(objM1622N);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return 234;
    }
}
