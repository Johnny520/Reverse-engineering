package p000;

/* JADX INFO: renamed from: O7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0610O7 {

    /* JADX INFO: renamed from: a */
    public final int f1954a;

    /* JADX INFO: renamed from: b */
    public final String f1955b;

    /* JADX INFO: renamed from: c */
    public boolean f1956c;

    public C0610O7(int i, String str, boolean z) {
        AbstractC0295Gu.m625r(-251655018772533L);
        this.f1954a = i;
        this.f1955b = str;
        this.f1956c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0610O7)) {
            return false;
        }
        C0610O7 c0610o7 = (C0610O7) obj;
        return this.f1954a == c0610o7.f1954a && AbstractC0585Nj.m1134a(this.f1955b, c0610o7.f1955b) && this.f1956c == c0610o7.f1956c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1956c) + AbstractC2374ph.m4810g(this.f1955b, Integer.hashCode(this.f1954a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-251706558380085L));
        AbstractC0213Ey.m418p(sb, this.f1954a, -251264176748597L);
        AbstractC2374ph.m4817n(sb, this.f1955b, -251302831454261L);
        sb.append(this.f1956c);
        sb.append(')');
        return sb.toString();
    }
}
