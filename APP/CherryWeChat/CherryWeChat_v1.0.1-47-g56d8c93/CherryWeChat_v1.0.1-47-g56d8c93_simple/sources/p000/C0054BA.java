package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: BA */
/* JADX INFO: loaded from: classes.dex */
public final class C0054BA {

    /* JADX INFO: renamed from: a */
    public final String f120a;

    /* JADX INFO: renamed from: b */
    public final String f121b;

    /* JADX INFO: renamed from: c */
    public final String f122c;

    /* JADX INFO: renamed from: d */
    public final String f123d;

    /* JADX INFO: renamed from: e */
    public final String f124e;

    /* JADX INFO: renamed from: f */
    public final String f125f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f126g;

    public C0054BA(String r3, String r4, String r5, String r6, String r7, String r8, ArrayList r9) {
        AbstractC0295Gu.m625r(-743158191224885L);
        AbstractC0295Gu.m625r(-743171076126773L);
        AbstractC0295Gu.m625r(-743192550963253L);
        AbstractC0295Gu.m625r(-743222615734325L);
        AbstractC0295Gu.m625r(-742763054233653L);
        AbstractC0295Gu.m625r(-742801708939317L);
        AbstractC0295Gu.m625r(-742844658612277L);
        this.f120a = r3;
        this.f121b = r4;
        this.f122c = r5;
        this.f123d = r6;
        this.f124e = r7;
        this.f125f = r8;
        this.f126g = r9;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C0054BA) == false) goto L31;
        C0054BA r32 = (C0054BA) r3;
        if (AbstractC0585Nj.m1134a(this.f120a, r32.f120a) == true) goto L11;
        return false;
    L11:
        if (AbstractC0585Nj.m1134a(this.f121b, r32.f121b) == true) goto L14;
        return false;
    L14:
        if (AbstractC0585Nj.m1134a(this.f122c, r32.f122c) == true) goto L17;
        return false;
    L17:
        if (AbstractC0585Nj.m1134a(this.f123d, r32.f123d) == true) goto L20;
        return false;
    L20:
        if (AbstractC0585Nj.m1134a(this.f124e, r32.f124e) == true) goto L23;
        return false;
    L23:
        if (AbstractC0585Nj.m1134a(this.f125f, r32.f125f) == true) goto L26;
        return false;
    L26:
        if (AbstractC0585Nj.m1134a(this.f126g, r32.f126g) == true) goto L29;
        return false;
    L29:
        return true;
    L31:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f120a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f121b, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.f122c, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.f123d, r03, 31);
        int r05 = AbstractC2374ph.m4810g(this.f124e, r04, 31);
        int r06 = AbstractC2374ph.m4810g(this.f125f, r05, 31);
        return this.f126g.hashCode() + r06;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-741508923783221L));
        AbstractC2374ph.m4817n(r0, this.f120a, -741594823129141L);
        AbstractC2374ph.m4817n(r0, this.f121b, -741079427053621L);
        AbstractC2374ph.m4817n(r0, this.f122c, -741122376726581L);
        AbstractC2374ph.m4817n(r0, this.f123d, -741225455941685L);
        AbstractC2374ph.m4817n(r0, this.f124e, -741276995549237L);
        AbstractC2374ph.m4817n(r0, this.f125f, -741332830124085L);
        r0.append(this.f126g);
        r0.append(')');
        return r0.toString();
    }
}
