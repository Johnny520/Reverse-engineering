package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 {

    /* JADX INFO: renamed from: a */
    public String f7958a;

    /* JADX INFO: renamed from: b */
    public s71 f7959b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0369jv f7960c;

    /* JADX INFO: renamed from: d */
    public int f7961d;

    /* JADX INFO: renamed from: e */
    public boolean f7962e;

    /* JADX INFO: renamed from: f */
    public int f7963f;

    /* JADX INFO: renamed from: g */
    public int f7964g;

    /* JADX INFO: renamed from: i */
    public InterfaceC0968ym f7966i;

    /* JADX INFO: renamed from: j */
    public C0951y5 f7967j;

    /* JADX INFO: renamed from: k */
    public boolean f7968k;

    /* JADX INFO: renamed from: m */
    public ie0 f7970m;

    /* JADX INFO: renamed from: n */
    public yo0 f7971n;

    /* JADX INFO: renamed from: o */
    public k50 f7972o;

    /* JADX INFO: renamed from: s */
    public long f7976s;

    /* JADX INFO: renamed from: h */
    public long f7965h = a20.f26a;

    /* JADX INFO: renamed from: l */
    public long f7969l = 0;

    /* JADX INFO: renamed from: p */
    public long f7973p = AbstractC0654qj.m3260g(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f7974q = -1;

    /* JADX INFO: renamed from: r */
    public int f7975r = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zo0(String str, s71 s71Var, InterfaceC0369jv interfaceC0369jv, int i, boolean z, int i2, int i3) {
        this.f7958a = str;
        this.f7959b = s71Var;
        this.f7960c = interfaceC0369jv;
        this.f7961d = i;
        this.f7962e = z;
        this.f7963f = i2;
        this.f7964g = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static long m5600f(zo0 zo0Var, long j, k50 k50Var) {
        int iM3138i;
        s71 s71Var = zo0Var.f7959b;
        ie0 ie0Var = zo0Var.f7970m;
        InterfaceC0968ym interfaceC0968ym = zo0Var.f7966i;
        interfaceC0968ym.getClass();
        InterfaceC0369jv interfaceC0369jv = zo0Var.f7960c;
        if ((ie0Var == null || k50Var != ie0Var.f2528a || !z60.m5426M(s71Var, k50Var).equals(ie0Var.f2529b) || interfaceC0968ym.mo48b() != ie0Var.f2530c.f7924d || interfaceC0369jv != ie0Var.f2531d) && ((ie0Var = ie0.f2527h) == null || k50Var != ie0Var.f2528a || !z60.m5426M(s71Var, k50Var).equals(ie0Var.f2529b) || interfaceC0968ym.mo48b() != ie0Var.f2530c.f7924d || interfaceC0369jv != ie0Var.f2531d)) {
            ie0Var = new ie0(k50Var, z60.m5426M(s71Var, k50Var), new C1009zm(interfaceC0968ym.mo48b(), interfaceC0968ym.mo49h()), interfaceC0369jv);
            ie0.f2527h = ie0Var;
        }
        zo0Var.f7970m = ie0Var;
        int i = zo0Var.f7964g;
        C1009zm c1009zm = ie0Var.f2530c;
        float f = ie0Var.f2534g;
        float f2 = ie0Var.f2533f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            float fM5211b = g60.m1202a(je0.f2805a, ie0Var.f2532e, AbstractC0654qj.m3255b(0, 0, 15), c1009zm, ie0Var.f2531d, 1).m5211b();
            float fM5211b2 = g60.m1202a(je0.f2806b, ie0Var.f2532e, AbstractC0654qj.m3255b(0, 0, 15), c1009zm, ie0Var.f2531d, 2).m5211b() - fM5211b;
            ie0Var.f2534g = fM5211b;
            ie0Var.f2533f = fM5211b2;
            f2 = fM5211b2;
            f = fM5211b;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iM3138i = iRound >= 0 ? iRound : 0;
            int iM3136g = C0617pj.m3136g(j);
            if (iM3138i > iM3136g) {
                iM3138i = iM3136g;
            }
        } else {
            iM3138i = C0617pj.m3138i(j);
        }
        return AbstractC0654qj.m3254a(C0617pj.m3139j(j), C0617pj.m3137h(j), iM3138i, C0617pj.m3136g(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5601a(int i, k50 k50Var) {
        int i2 = this.f7974q;
        int i3 = this.f7975r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM3254a = AbstractC0654qj.m3254a(0, i, 0, Integer.MAX_VALUE);
        if (this.f7964g > 1) {
            jM3254a = m5600f(this, jM3254a, k50Var);
        }
        yo0 yo0VarM5605e = m5605e(k50Var);
        long jM3413o = r60.m3413o(jM3254a, this.f7962e, this.f7961d, yo0VarM5605e.mo490c());
        boolean z = this.f7962e;
        int i4 = this.f7961d;
        int i5 = this.f7963f;
        int iM4401e = v50.m4401e(new C0951y5((C0080c6) yo0VarM5605e, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM3413o).m5211b());
        int iM3138i = C0617pj.m3138i(jM3254a);
        if (iM4401e < iM3138i) {
            iM4401e = iM3138i;
        }
        this.f7974q = i;
        this.f7975r = iM4401e;
        return iM4401e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5602b(long j, k50 k50Var) {
        yo0 yo0Var;
        this.f7976s = (this.f7976s << 2) | 3;
        boolean z = true;
        long jM5600f = this.f7964g > 1 ? m5600f(this, j, k50Var) : j;
        C0951y5 c0951y5 = this.f7967j;
        boolean z2 = false;
        if (c0951y5 != null && (yo0Var = this.f7971n) != null && !yo0Var.mo489b() && k50Var == this.f7972o && (C0617pj.m3131b(jM5600f, this.f7973p) || (C0617pj.m3137h(jM5600f) == C0617pj.m3137h(this.f7973p) && C0617pj.m3139j(jM5600f) == C0617pj.m3139j(this.f7973p) && C0617pj.m3136g(jM5600f) >= c0951y5.m5211b() && !c0951y5.f7540d.f1325d))) {
            if (!C0617pj.m3131b(jM5600f, this.f7973p)) {
                C0951y5 c0951y52 = this.f7967j;
                c0951y52.getClass();
                this.f7969l = AbstractC0654qj.m3257d(jM5600f, (((long) v50.m4401e(Math.min(c0951y52.f7537a.f703i.m3019c(), c0951y52.m5212c()))) << 32) | (((long) v50.m4401e(c0951y52.m5211b())) & 4294967295L));
                if (this.f7961d == 3 || (((int) (r12 >> 32)) >= c0951y52.m5212c() && ((int) (4294967295L & r12)) >= c0951y52.m5211b())) {
                    z = false;
                }
                this.f7968k = z;
                this.f7973p = jM5600f;
            }
            return false;
        }
        yo0 yo0VarM5605e = m5605e(k50Var);
        long jM3413o = r60.m3413o(jM5600f, this.f7962e, this.f7961d, yo0VarM5605e.mo490c());
        boolean z3 = this.f7962e;
        int i = this.f7961d;
        int i2 = this.f7963f;
        C0951y5 c0951y53 = new C0951y5((C0080c6) yo0VarM5605e, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM3413o);
        this.f7973p = jM5600f;
        this.f7969l = AbstractC0654qj.m3257d(jM5600f, (((long) v50.m4401e(c0951y53.m5211b())) & 4294967295L) | (((long) v50.m4401e(c0951y53.m5212c())) << 32));
        if (this.f7961d != 3 && (((int) (r1 >> 32)) < c0951y53.m5212c() || ((int) (r1 & 4294967295L)) < c0951y53.m5211b())) {
            z2 = true;
        }
        this.f7968k = z2;
        this.f7967j = c0951y53;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5603c() {
        this.f7967j = null;
        this.f7971n = null;
        this.f7972o = null;
        this.f7974q = -1;
        this.f7975r = -1;
        this.f7973p = AbstractC0654qj.m3260g(0, 0, 0, 0);
        this.f7969l = 0L;
        this.f7968k = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5604d(InterfaceC0968ym interfaceC0968ym) {
        long jM4a;
        InterfaceC0968ym interfaceC0968ym2 = this.f7966i;
        if (interfaceC0968ym != null) {
            int i = a20.f27b;
            jM4a = a20.m4a(interfaceC0968ym.mo48b(), interfaceC0968ym.mo49h());
        } else {
            jM4a = a20.f26a;
        }
        if (interfaceC0968ym2 == null) {
            this.f7966i = interfaceC0968ym;
            this.f7965h = jM4a;
        } else if (interfaceC0968ym == null || this.f7965h != jM4a) {
            this.f7966i = interfaceC0968ym;
            this.f7965h = jM4a;
            this.f7976s = (this.f7976s << 2) | 1;
            m5603c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final yo0 m5605e(k50 k50Var) {
        yo0 c0080c6 = this.f7971n;
        if (c0080c6 == null || k50Var != this.f7972o || c0080c6.mo489b()) {
            this.f7972o = k50Var;
            String str = this.f7958a;
            s71 s71VarM5426M = z60.m5426M(this.f7959b, k50Var);
            InterfaceC0968ym interfaceC0968ym = this.f7966i;
            interfaceC0968ym.getClass();
            InterfaceC0369jv interfaceC0369jv = this.f7960c;
            C0294hs c0294hs = C0294hs.f2354d;
            c0080c6 = new C0080c6(str, s71VarM5426M, c0294hs, c0294hs, interfaceC0369jv, interfaceC0968ym);
        }
        this.f7971n = c0080c6;
        return c0080c6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f7967j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a20.m5b(this.f7965h));
        sb.append(", history=");
        sb.append(this.f7976s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
