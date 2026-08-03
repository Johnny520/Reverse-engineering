package p000;

/* JADX INFO: renamed from: T2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0819T2 {

    /* JADX INFO: renamed from: a */
    public final String f2586a;

    /* JADX INFO: renamed from: b */
    public final String f2587b;

    /* JADX INFO: renamed from: c */
    public final int f2588c;

    /* JADX INFO: renamed from: d */
    public final boolean f2589d;

    /* JADX INFO: renamed from: e */
    public final int f2590e;

    /* JADX INFO: renamed from: f */
    public final int f2591f;

    public C0819T2(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC0295Gu.m625r(-395252955346997L);
        AbstractC0295Gu.m625r(-395274430183477L);
        this.f2586a = str;
        this.f2587b = str2;
        this.f2588c = i;
        this.f2589d = z;
        this.f2590e = i2;
        this.f2591f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0819T2)) {
            return false;
        }
        C0819T2 c0819t2 = (C0819T2) obj;
        return AbstractC0585Nj.m1134a(this.f2586a, c0819t2.f2586a) && AbstractC0585Nj.m1134a(this.f2587b, c0819t2.f2587b) && this.f2588c == c0819t2.f2588c && this.f2589d == c0819t2.f2589d && this.f2590e == c0819t2.f2590e && this.f2591f == c0819t2.f2591f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2591f) + AbstractC0213Ey.m403a(this.f2590e, (Boolean.hashCode(this.f2589d) + AbstractC0213Ey.m403a(this.f2588c, AbstractC2374ph.m4810g(this.f2587b, this.f2586a.hashCode() * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-394797688813621L));
        AbstractC2374ph.m4817n(sb, this.f2586a, -394870703257653L);
        AbstractC2374ph.m4817n(sb, this.f2587b, -394909357963317L);
        AbstractC0213Ey.m418p(sb, this.f2588c, -394965192538165L);
        sb.append(this.f2589d);
        sb.append(AbstractC0295Gu.m625r(-395575077894197L));
        AbstractC0213Ey.m418p(sb, this.f2590e, -395652387305525L);
        return AbstractC0213Ey.m408f(sb, this.f2591f, ')');
    }
}
