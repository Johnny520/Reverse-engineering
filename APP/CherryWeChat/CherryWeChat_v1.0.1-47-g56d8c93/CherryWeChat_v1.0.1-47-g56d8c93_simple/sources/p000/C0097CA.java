package p000;

/* JADX INFO: renamed from: CA */
/* JADX INFO: loaded from: classes.dex */
public final class C0097CA {

    /* JADX INFO: renamed from: a */
    public final String f223a;

    /* JADX INFO: renamed from: b */
    public final String f224b;

    /* JADX INFO: renamed from: c */
    public final String f225c;

    /* JADX INFO: renamed from: d */
    public final String f226d;

    /* JADX INFO: renamed from: e */
    public final String f227e;

    /* JADX INFO: renamed from: f */
    public final String f228f;

    /* JADX INFO: renamed from: g */
    public final String f229g;

    /* JADX INFO: renamed from: h */
    public final String f230h;

    /* JADX INFO: renamed from: i */
    public final boolean f231i;

    /* JADX INFO: renamed from: j */
    public final boolean f232j;

    public C0097CA(String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, boolean r11, boolean r12) {
        AbstractC0295Gu.m625r(-741934125545525L);
        AbstractC0295Gu.m625r(-741947010447413L);
        AbstractC0295Gu.m625r(-741968485283893L);
        AbstractC0295Gu.m625r(-741998550054965L);
        AbstractC0295Gu.m625r(-742032909793333L);
        AbstractC0295Gu.m625r(-742084449400885L);
        AbstractC0295Gu.m625r(-742123104106549L);
        AbstractC0295Gu.m625r(-742170348746805L);
        this.f223a = r3;
        this.f224b = r4;
        this.f225c = r5;
        this.f226d = r6;
        this.f227e = r7;
        this.f228f = r8;
        this.f229g = r9;
        this.f230h = r10;
        this.f231i = r11;
        this.f232j = r12;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0097CA) == true) goto L8;
        return false;
    L8:
        C0097CA r52 = (C0097CA) r5;
        if (AbstractC0585Nj.m1134a(this.f223a, r52.f223a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f224b, r52.f224b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f225c, r52.f225c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.f226d, r52.f226d) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.f227e, r52.f227e) == true) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.f228f, r52.f228f) == true) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.f229g, r52.f229g) == true) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.f230h, r52.f230h) == true) goto L33;
        return false;
    L33:
        if (this.f231i == r52.f231i) goto L36;
        return false;
    L36:
        if (this.f232j == r52.f232j) goto L38;
        return false;
    L38:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f223a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f224b, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.f225c, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.f226d, r03, 31);
        int r05 = AbstractC2374ph.m4810g(this.f227e, r04, 31);
        int r06 = AbstractC2374ph.m4810g(this.f228f, r05, 31);
        int r07 = AbstractC2374ph.m4810g(this.f229g, r06, 31);
        int r08 = AbstractC2374ph.m4810g(this.f230h, r07, 31);
        int r2 = (Boolean.hashCode(this.f231i) + r08) * 31;
        return Boolean.hashCode(this.f232j) + r2;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-740276268169269L));
        AbstractC2374ph.m4817n(r0, this.f223a, -740336397711413L);
        AbstractC2374ph.m4817n(r0, this.f224b, -740370757449781L);
        AbstractC2374ph.m4817n(r0, this.f225c, -740413707122741L);
        AbstractC2374ph.m4817n(r0, this.f226d, -740460951762997L);
        AbstractC2374ph.m4817n(r0, this.f227e, -739975620458549L);
        AbstractC2374ph.m4817n(r0, this.f228f, -740027160066101L);
        AbstractC2374ph.m4817n(r0, this.f229g, -740087289608245L);
        AbstractC2374ph.m4817n(r0, this.f230h, -740134534248501L);
        r0.append(this.f231i);
        r0.append(AbstractC0295Gu.m625r(-740186073856053L));
        r0.append(this.f232j);
        r0.append(')');
        return r0.toString();
    }
}
