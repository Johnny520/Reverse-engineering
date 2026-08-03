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

    public C0054BA(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        AbstractC0295Gu.m625r(-743158191224885L);
        AbstractC0295Gu.m625r(-743171076126773L);
        AbstractC0295Gu.m625r(-743192550963253L);
        AbstractC0295Gu.m625r(-743222615734325L);
        AbstractC0295Gu.m625r(-742763054233653L);
        AbstractC0295Gu.m625r(-742801708939317L);
        AbstractC0295Gu.m625r(-742844658612277L);
        this.f120a = str;
        this.f121b = str2;
        this.f122c = str3;
        this.f123d = str4;
        this.f124e = str5;
        this.f125f = str6;
        this.f126g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0054BA)) {
            return false;
        }
        C0054BA c0054ba = (C0054BA) obj;
        return AbstractC0585Nj.m1134a(this.f120a, c0054ba.f120a) && AbstractC0585Nj.m1134a(this.f121b, c0054ba.f121b) && AbstractC0585Nj.m1134a(this.f122c, c0054ba.f122c) && AbstractC0585Nj.m1134a(this.f123d, c0054ba.f123d) && AbstractC0585Nj.m1134a(this.f124e, c0054ba.f124e) && AbstractC0585Nj.m1134a(this.f125f, c0054ba.f125f) && AbstractC0585Nj.m1134a(this.f126g, c0054ba.f126g);
    }

    public final int hashCode() {
        return this.f126g.hashCode() + AbstractC2374ph.m4810g(this.f125f, AbstractC2374ph.m4810g(this.f124e, AbstractC2374ph.m4810g(this.f123d, AbstractC2374ph.m4810g(this.f122c, AbstractC2374ph.m4810g(this.f121b, this.f120a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-741508923783221L));
        AbstractC2374ph.m4817n(sb, this.f120a, -741594823129141L);
        AbstractC2374ph.m4817n(sb, this.f121b, -741079427053621L);
        AbstractC2374ph.m4817n(sb, this.f122c, -741122376726581L);
        AbstractC2374ph.m4817n(sb, this.f123d, -741225455941685L);
        AbstractC2374ph.m4817n(sb, this.f124e, -741276995549237L);
        AbstractC2374ph.m4817n(sb, this.f125f, -741332830124085L);
        sb.append(this.f126g);
        sb.append(')');
        return sb.toString();
    }
}
