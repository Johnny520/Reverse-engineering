package p000;

/* JADX INFO: renamed from: U2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0862U2 {

    /* JADX INFO: renamed from: a */
    public final boolean f2721a;

    /* JADX INFO: renamed from: b */
    public final String f2722b;

    /* JADX INFO: renamed from: c */
    public final String f2723c;

    /* JADX INFO: renamed from: d */
    public final Integer f2724d;

    /* JADX INFO: renamed from: e */
    public final C0819T2 f2725e;

    public /* synthetic */ C0862U2(String str, boolean z) {
        this(z, str, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0862U2)) {
            return false;
        }
        C0862U2 c0862u2 = (C0862U2) obj;
        return this.f2721a == c0862u2.f2721a && AbstractC0585Nj.m1134a(this.f2722b, c0862u2.f2722b) && AbstractC0585Nj.m1134a(this.f2723c, c0862u2.f2723c) && AbstractC0585Nj.m1134a(this.f2724d, c0862u2.f2724d) && AbstractC0585Nj.m1134a(this.f2725e, c0862u2.f2725e);
    }

    public final int hashCode() {
        int iM4810g = AbstractC2374ph.m4810g(this.f2722b, Boolean.hashCode(this.f2721a) * 31, 31);
        String str = this.f2723c;
        int iHashCode = (iM4810g + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f2724d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C0819T2 c0819t2 = this.f2725e;
        return iHashCode2 + (c0819t2 != null ? c0819t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-395471998679093L));
        sb.append(this.f2721a);
        sb.append(AbstractC0295Gu.m625r(-393917220517941L));
        AbstractC2374ph.m4817n(sb, this.f2722b, -393964465158197L);
        AbstractC2374ph.m4817n(sb, this.f2723c, -393998824896565L);
        sb.append(this.f2724d);
        sb.append(AbstractC0295Gu.m625r(-394054659471413L));
        sb.append(this.f2725e);
        sb.append(')');
        return sb.toString();
    }

    public C0862U2(boolean z, String str, String str2, Integer num, C0819T2 c0819t2) {
        AbstractC0295Gu.m625r(-395403279202357L);
        this.f2721a = z;
        this.f2722b = str;
        this.f2723c = str2;
        this.f2724d = num;
        this.f2725e = c0819t2;
    }
}
