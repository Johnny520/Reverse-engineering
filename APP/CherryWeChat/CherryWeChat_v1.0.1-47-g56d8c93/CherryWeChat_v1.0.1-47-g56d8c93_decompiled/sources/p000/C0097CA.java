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

    public C0097CA(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        AbstractC0295Gu.m625r(-741934125545525L);
        AbstractC0295Gu.m625r(-741947010447413L);
        AbstractC0295Gu.m625r(-741968485283893L);
        AbstractC0295Gu.m625r(-741998550054965L);
        AbstractC0295Gu.m625r(-742032909793333L);
        AbstractC0295Gu.m625r(-742084449400885L);
        AbstractC0295Gu.m625r(-742123104106549L);
        AbstractC0295Gu.m625r(-742170348746805L);
        this.f223a = str;
        this.f224b = str2;
        this.f225c = str3;
        this.f226d = str4;
        this.f227e = str5;
        this.f228f = str6;
        this.f229g = str7;
        this.f230h = str8;
        this.f231i = z;
        this.f232j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0097CA)) {
            return false;
        }
        C0097CA c0097ca = (C0097CA) obj;
        return AbstractC0585Nj.m1134a(this.f223a, c0097ca.f223a) && AbstractC0585Nj.m1134a(this.f224b, c0097ca.f224b) && AbstractC0585Nj.m1134a(this.f225c, c0097ca.f225c) && AbstractC0585Nj.m1134a(this.f226d, c0097ca.f226d) && AbstractC0585Nj.m1134a(this.f227e, c0097ca.f227e) && AbstractC0585Nj.m1134a(this.f228f, c0097ca.f228f) && AbstractC0585Nj.m1134a(this.f229g, c0097ca.f229g) && AbstractC0585Nj.m1134a(this.f230h, c0097ca.f230h) && this.f231i == c0097ca.f231i && this.f232j == c0097ca.f232j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232j) + ((Boolean.hashCode(this.f231i) + AbstractC2374ph.m4810g(this.f230h, AbstractC2374ph.m4810g(this.f229g, AbstractC2374ph.m4810g(this.f228f, AbstractC2374ph.m4810g(this.f227e, AbstractC2374ph.m4810g(this.f226d, AbstractC2374ph.m4810g(this.f225c, AbstractC2374ph.m4810g(this.f224b, this.f223a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-740276268169269L));
        AbstractC2374ph.m4817n(sb, this.f223a, -740336397711413L);
        AbstractC2374ph.m4817n(sb, this.f224b, -740370757449781L);
        AbstractC2374ph.m4817n(sb, this.f225c, -740413707122741L);
        AbstractC2374ph.m4817n(sb, this.f226d, -740460951762997L);
        AbstractC2374ph.m4817n(sb, this.f227e, -739975620458549L);
        AbstractC2374ph.m4817n(sb, this.f228f, -740027160066101L);
        AbstractC2374ph.m4817n(sb, this.f229g, -740087289608245L);
        AbstractC2374ph.m4817n(sb, this.f230h, -740134534248501L);
        sb.append(this.f231i);
        sb.append(AbstractC0295Gu.m625r(-740186073856053L));
        sb.append(this.f232j);
        sb.append(')');
        return sb.toString();
    }
}
