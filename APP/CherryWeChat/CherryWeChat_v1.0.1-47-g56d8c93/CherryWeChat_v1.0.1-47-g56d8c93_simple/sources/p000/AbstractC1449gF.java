package p000;

/* JADX INFO: renamed from: gF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1449gF implements InterfaceC2542td {

    /* JADX INFO: renamed from: a */
    public int f5057a;

    /* JADX INFO: renamed from: b */
    public C2454rb f5058b;

    /* JADX INFO: renamed from: c */
    public C0769Rw f5059c;

    /* JADX INFO: renamed from: d */
    public int f5060d;

    /* JADX INFO: renamed from: e */
    public final C0750Rd f5061e;

    /* JADX INFO: renamed from: f */
    public int f5062f;

    /* JADX INFO: renamed from: g */
    public boolean f5063g;

    /* JADX INFO: renamed from: h */
    public final C2628vd f5064h;

    /* JADX INFO: renamed from: i */
    public final C2628vd f5065i;

    /* JADX INFO: renamed from: j */
    public int f5066j;

    public AbstractC1449gF(C2454rb r2) {
        this.f5061e = new C0750Rd(this);
        this.f5062f = 0;
        this.f5063g = false;
        this.f5064h = new C2628vd(this);
        this.f5065i = new C2628vd(this);
        this.f5066j = 1;
        this.f5058b = r2;
    }

    /* JADX INFO: renamed from: b */
    public static void m2774b(C2628vd r1, C2628vd r2, int r3) {
        r1.f9121l.add(r2);
        r1.f9115f = r3;
        r2.f9120k.add(r1);
    }

    /* JADX INFO: renamed from: h */
    public static C2628vd m2775h(C1259cb r2) {
        C1259cb r22 = r2.f4270f;
        if (r22 == null) goto L27;
        C2454rb r0 = r22.f4268d;
        int r23 = AbstractC0213Ey.m424v(r22.f4269e);
        if (r23 == 1) goto L26;
        if (r23 == 2) goto L24;
        if (r23 == 3) goto L22;
        if (r23 == 4) goto L20;
        if (r23 == 5) goto L18;
        return null;
    L18:
        return r0.f8614e.f2621k;
    L20:
        return r0.f8614e.f5065i;
    L22:
        return r0.f8612d.f5065i;
    L24:
        return r0.f8614e.f5064h;
    L26:
        return r0.f8612d.f5064h;
    L27:
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static C2628vd m2776i(C1259cb r1, int r2) {
        C1259cb r12 = r1.f4270f;
        if (r12 == null) goto L23;
        C2454rb r0 = r12.f4268d;
        if (r2 != 0) goto L8;
        AbstractC1449gF r22 = r0.f8612d;
    L9:
        int r13 = AbstractC0213Ey.m424v(r12.f4269e);
        if (r13 == 1) goto L22;
        if (r13 == 2) goto L22;
        if (r13 == 3) goto L20;
        if (r13 == 4) goto L20;
        return null;
    L20:
        return r22.f5065i;
    L22:
        return r22.f5064h;
    L8:
        r22 = r0.f8614e;
        goto L9
    L23:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2777c(C2628vd r3, C2628vd r4, int r5, C0750Rd r6) {
        r3.f9121l.add(r4);
        r3.f9121l.add(this.f5061e);
        r3.f9117h = r5;
        r3.f9118i = r6;
        r4.f9120k.add(r3);
        r6.f9120k.add(r3);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1547d();

    /* JADX INFO: renamed from: e */
    public abstract void mo1548e();

    /* JADX INFO: renamed from: f */
    public abstract void mo1549f();

    /* JADX INFO: renamed from: g */
    public final int m2778g(int r2, int r3) {
        if (r3 != 0) goto L8;
        C2454rb r32 = this.f5058b;
        int r0 = r32.f8643v;
        int r33 = Math.max(r32.f8642u, r2);
        if (r0 <= 0) goto L6;
        r33 = Math.min(r0, r2);
    L6:
        if (r33 == r2) goto L13;
        return r33;
    L13:
        return r2;
    L8:
        C2454rb r34 = this.f5058b;
        int r02 = r34.f8646y;
        int r35 = Math.max(r34.f8645x, r2);
        if (r02 <= 0) goto L11;
        r35 = Math.min(r02, r2);
    L11:
        if (r35 == r2) goto L13;
        return r35;
    }

    /* JADX INFO: renamed from: j */
    public long mo2779j() {
        if (this.f5061e.f9119j == true) goto L5;
        return 0;
    L5:
        return r0.f9116g;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1550k();

    /* JADX INFO: renamed from: l */
    public final void m2780l(C1259cb r12, C1259cb r13, int r14) {
        C2628vd r0 = m2775h(r12);
        C2628vd r1 = m2775h(r13);
        if (r0.f9119j == true) goto L5;
        return;
    L5:
        if (r1.f9119j == false) goto L65;
        int r122 = r12.m2384e() + r0.f9116g;
        int r2 = r1.f9116g - r13.m2384e();
        int r132 = r2 - r122;
        C0750Rd r3 = this.f5061e;
        if (r3.f9119j == true) goto L51;
        if (this.f5060d != 3) goto L51;
        int r4 = this.f5057a;
        if (r4 != 0) goto L14;
        r3.mo1539d(m2778g(r132, r14));
        goto L51
    L14:
        if (r4 != 1) goto L16;
        r3.mo1539d(Math.min(m2778g(r3.f2386m, r14), r132));
        goto L51
    L16:
        if (r4 == 2) goto L37;
        if (r4 != 3) goto L51;
        C2454rb r42 = this.f5058b;
        AbstractC1449gF r8 = r42.f8612d;
        if (r8.f5060d == 3) goto L22;
    L28:
        if (r14 != 0) goto L31;
        r8 = r42.f8614e;
    L31:
        if (r8.f5061e.f9119j == false) goto L51;
        float r43 = r42.f8602W;
        if (r14 != 1) goto L35;
        int r44 = (int) ((r6.f9116g / r43) + 0.5f);
    L36:
        r3.mo1539d(r44);
        goto L51
    L35:
        r44 = (int) ((r43 * r6.f9116g) + 0.5f);
        goto L36
    L22:
        if (r8.f5057a != 3) goto L28;
        C0830TD r9 = r42.f8614e;
        if (r9.f5060d != 3) goto L28;
        if (r9.f5057a != 3) goto L28;
    L37:
        C2454rb r45 = this.f5058b;
        C2454rb r6 = r45.f8599T;
        if (r6 == null) goto L51;
        if (r14 != 0) goto L41;
        AbstractC1449gF r62 = r6.f8612d;
    L43:
        if (r62.f5061e.f9119j == false) goto L51;
        if (r14 != 0) goto L46;
        float r46 = r45.f8644w;
    L47:
        r3.mo1539d(m2778g((int) ((r6.f9116g * r46) + 0.5f), r14));
        goto L51
    L46:
        r46 = r45.f8647z;
        goto L47
    L41:
        r62 = r6.f8614e;
    L51:
        if (r3.f9119j == false) goto L66;
        int r47 = r3.f9116g;
        C2628vd r63 = this.f5065i;
        C2628vd r7 = this.f5064h;
        if (r47 != r132) goto L57;
        r7.mo1539d(r122);
        r63.mo1539d(r2);
        return;
    L57:
        if (r14 != 0) goto L59;
        float r133 = this.f5058b.f8613d0;
    L60:
        if (r0 != r1) goto L62;
        r122 = r0.f9116g;
        r2 = r1.f9116g;
        r133 = 0.5f;
    L62:
        r7.mo1539d((int) ((((r2 - r122) - r47) * r133) + (r122 + 0.5f)));
        r63.mo1539d(r7.f9116g + r3.f9116g);
        return;
    L59:
        r133 = this.f5058b.f8615e0;
        goto L60
    L66:
        return;
    }
}
