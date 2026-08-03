package p000;

/* JADX INFO: renamed from: Wg */
/* JADX INFO: loaded from: classes.dex */
public final class C0968Wg {

    /* JADX INFO: renamed from: a */
    public final String f3016a;

    /* JADX INFO: renamed from: b */
    public final String f3017b;

    /* JADX INFO: renamed from: c */
    public boolean f3018c;

    public C0968Wg(String str, String str2) {
        AbstractC0295Gu.m625r(-812792495994933L);
        AbstractC0295Gu.m625r(-813380906514485L);
        this.f3016a = str;
        this.f3017b = str2;
        this.f3018c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0968Wg)) {
            return false;
        }
        C0968Wg c0968Wg = (C0968Wg) obj;
        return AbstractC0585Nj.m1134a(this.f3016a, c0968Wg.f3016a) && AbstractC0585Nj.m1134a(this.f3017b, c0968Wg.f3017b) && this.f3018c == c0968Wg.f3018c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3018c) + AbstractC2374ph.m4810g(this.f3017b, this.f3016a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-813479690762293L));
        AbstractC2374ph.m4817n(sb, this.f3016a, -813557000173621L);
        AbstractC2374ph.m4817n(sb, this.f3017b, -813599949846581L);
        sb.append(this.f3018c);
        sb.append(')');
        return sb.toString();
    }
}
