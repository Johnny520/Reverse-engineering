package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uw1 {

    /* JADX INFO: renamed from: a */
    public String f11518a;

    /* JADX INFO: renamed from: b */
    public m13 f11519b;

    /* JADX INFO: renamed from: c */
    public xl0 f11520c;

    /* JADX INFO: renamed from: d */
    public int f11521d;

    /* JADX INFO: renamed from: e */
    public boolean f11522e;

    /* JADX INFO: renamed from: f */
    public int f11523f;

    /* JADX INFO: renamed from: g */
    public int f11524g;

    /* JADX INFO: renamed from: i */
    public e70 f11526i;

    /* JADX INFO: renamed from: j */
    public C0726t9 f11527j;

    /* JADX INFO: renamed from: k */
    public boolean f11528k;

    /* JADX INFO: renamed from: m */
    public bh1 f11530m;

    /* JADX INFO: renamed from: n */
    public tw1 f11531n;

    /* JADX INFO: renamed from: o */
    public d61 f11532o;

    /* JADX INFO: renamed from: s */
    public long f11536s;

    /* JADX INFO: renamed from: h */
    public long f11525h = oz0.f7889a;

    /* JADX INFO: renamed from: l */
    public long f11529l = 0;

    /* JADX INFO: renamed from: p */
    public long f11533p = AbstractC0258gz.m2034h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f11534q = -1;

    /* JADX INFO: renamed from: r */
    public int f11535r = -1;

    public uw1(String str, m13 m13Var, xl0 xl0Var, int i, boolean z, int i2, int i3) {
        this.f11518a = str;
        this.f11519b = m13Var;
        this.f11520c = xl0Var;
        this.f11521d = i;
        this.f11522e = z;
        this.f11523f = i2;
        this.f11524g = i3;
    }

    /* JADX INFO: renamed from: f */
    public static long m5588f(uw1 uw1Var, long j, d61 d61Var) {
        int iM1764i;
        m13 m13Var = uw1Var.f11519b;
        bh1 bh1Var = uw1Var.f11530m;
        e70 e70Var = uw1Var.f11526i;
        e70Var.getClass();
        bh1 bh1VarM784I = ci0.m784I(bh1Var, d61Var, m13Var, e70Var, uw1Var.f11520c);
        uw1Var.f11530m = bh1VarM784I;
        int i = uw1Var.f11524g;
        h70 h70Var = bh1VarM784I.f857c;
        float f = bh1VarM784I.f861g;
        float fM5136b = bh1VarM784I.f860f;
        if (Float.isNaN(f) || Float.isNaN(fM5136b)) {
            float fM5136b2 = ci0.m817r(ch1.f1540a, bh1VarM784I.f859e, AbstractC0258gz.m2028b(0, 0, 0, 0, 15), h70Var, bh1VarM784I.f858d, 1, 96).m5136b();
            fM5136b = ci0.m817r(ch1.f1541b, bh1VarM784I.f859e, AbstractC0258gz.m2028b(0, 0, 0, 0, 15), h70Var, bh1VarM784I.f858d, 2, 96).m5136b() - fM5136b2;
            bh1VarM784I.f861g = fM5136b2;
            bh1VarM784I.f860f = fM5136b;
            f = fM5136b2;
        }
        if (i != 1) {
            int iRound = Math.round((fM5136b * (i - 1)) + f);
            iM1764i = iRound >= 0 ? iRound : 0;
            int iM1762g = C0221fz.m1762g(j);
            if (iM1764i > iM1762g) {
                iM1764i = iM1762g;
            }
        } else {
            iM1764i = C0221fz.m1764i(j);
        }
        return AbstractC0258gz.m2027a(C0221fz.m1765j(j), C0221fz.m1763h(j), iM1764i, C0221fz.m1762g(j));
    }

    /* JADX INFO: renamed from: a */
    public final int m5589a(int i, d61 d61Var) {
        int i2 = this.f11534q;
        int i3 = this.f11535r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM2027a = AbstractC0258gz.m2027a(0, i, 0, Integer.MAX_VALUE);
        if (this.f11524g > 1) {
            jM2027a = m5588f(this, jM2027a, d61Var);
        }
        tw1 tw1VarM5593e = m5593e(d61Var);
        long jM6140q = xe1.m6140q(jM2027a, this.f11522e, this.f11521d, tw1VarM5593e.mo828c());
        boolean z = this.f11522e;
        int i4 = this.f11521d;
        int i5 = this.f11523f;
        int iM4257l = qp0.m4257l(new C0726t9((C0878x9) tw1VarM5593e, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM6140q).m5136b());
        int iM1764i = C0221fz.m1764i(jM2027a);
        if (iM4257l < iM1764i) {
            iM4257l = iM1764i;
        }
        this.f11534q = i;
        this.f11535r = iM4257l;
        return iM4257l;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5590b(long j, d61 d61Var) {
        tw1 tw1Var;
        this.f11536s = (this.f11536s << 2) | 3;
        boolean z = true;
        long jM5588f = this.f11524g > 1 ? m5588f(this, j, d61Var) : j;
        C0726t9 c0726t9 = this.f11527j;
        boolean z2 = false;
        if (c0726t9 != null && (tw1Var = this.f11531n) != null && !tw1Var.mo827b() && d61Var == this.f11532o && (C0221fz.m1757b(jM5588f, this.f11533p) || (C0221fz.m1763h(jM5588f) == C0221fz.m1763h(this.f11533p) && C0221fz.m1765j(jM5588f) == C0221fz.m1765j(this.f11533p) && C0221fz.m1762g(jM5588f) >= c0726t9.m5136b() && !c0726t9.f10616d.f12244d))) {
            if (!C0221fz.m1757b(jM5588f, this.f11533p)) {
                C0726t9 c0726t92 = this.f11527j;
                c0726t92.getClass();
                this.f11529l = AbstractC0258gz.m2030d(jM5588f, (((long) qp0.m4257l(Math.min(c0726t92.f10613a.f12908i.m1809c(), c0726t92.m5138d()))) << 32) | (((long) qp0.m4257l(c0726t92.m5136b())) & 4294967295L));
                if (this.f11521d == 3 || (((int) (r12 >> 32)) >= c0726t92.m5138d() && ((int) (4294967295L & r12)) >= c0726t92.m5136b())) {
                    z = false;
                }
                this.f11528k = z;
                this.f11533p = jM5588f;
            }
            return false;
        }
        tw1 tw1VarM5593e = m5593e(d61Var);
        long jM6140q = xe1.m6140q(jM5588f, this.f11522e, this.f11521d, tw1VarM5593e.mo828c());
        boolean z3 = this.f11522e;
        int i = this.f11521d;
        int i2 = this.f11523f;
        C0726t9 c0726t93 = new C0726t9((C0878x9) tw1VarM5593e, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM6140q);
        this.f11533p = jM5588f;
        this.f11529l = AbstractC0258gz.m2030d(jM5588f, (((long) qp0.m4257l(c0726t93.m5136b())) & 4294967295L) | (((long) qp0.m4257l(c0726t93.m5138d())) << 32));
        if (this.f11521d != 3 && (((int) (r1 >> 32)) < c0726t93.m5138d() || ((int) (r1 & 4294967295L)) < c0726t93.m5136b())) {
            z2 = true;
        }
        this.f11528k = z2;
        this.f11527j = c0726t93;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m5591c() {
        this.f11527j = null;
        this.f11531n = null;
        this.f11532o = null;
        this.f11534q = -1;
        this.f11535r = -1;
        this.f11533p = AbstractC0258gz.m2034h(0, 0, 0, 0);
        this.f11529l = 0L;
        this.f11528k = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m5592d(e70 e70Var) {
        long jM3669a;
        e70 e70Var2 = this.f11526i;
        if (e70Var != null) {
            int i = oz0.f7890b;
            jM3669a = oz0.m3669a(e70Var.mo693b(), e70Var.mo697m());
        } else {
            jM3669a = oz0.f7889a;
        }
        if (e70Var2 == null) {
            this.f11526i = e70Var;
            this.f11525h = jM3669a;
        } else if (e70Var == null || this.f11525h != jM3669a) {
            this.f11526i = e70Var;
            this.f11525h = jM3669a;
            this.f11536s = (this.f11536s << 2) | 1;
            m5591c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final tw1 m5593e(d61 d61Var) {
        tw1 c0878x9 = this.f11531n;
        if (c0878x9 == null || d61Var != this.f11532o || c0878x9.mo827b()) {
            this.f11532o = d61Var;
            String str = this.f11518a;
            m13 m13VarM6130k0 = xe1.m6130k0(this.f11519b, d61Var);
            e70 e70Var = this.f11526i;
            e70Var.getClass();
            xl0 xl0Var = this.f11520c;
            be0 be0Var = be0.f819h;
            c0878x9 = new C0878x9(str, m13VarM6130k0, be0Var, be0Var, xl0Var, e70Var);
        }
        this.f11531n = c0878x9;
        return c0878x9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f11527j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) oz0.m3670b(this.f11525h));
        sb.append(", history=");
        sb.append(this.f11536s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
