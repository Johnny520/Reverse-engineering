package p000;

/* JADX INFO: renamed from: V2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0905V2 {

    /* JADX INFO: renamed from: a */
    public final boolean f2818a;

    /* JADX INFO: renamed from: b */
    public final int f2819b;

    /* JADX INFO: renamed from: c */
    public final String f2820c;

    /* JADX INFO: renamed from: d */
    public final int f2821d;

    /* JADX INFO: renamed from: e */
    public final int f2822e;

    /* JADX INFO: renamed from: f */
    public final String f2823f;

    public C0905V2(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC0295Gu.m625r(-393552148297781L);
        this.f2818a = z;
        this.f2819b = i;
        this.f2820c = str;
        this.f2821d = i2;
        this.f2822e = i3;
        this.f2823f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0905V2)) {
            return false;
        }
        C0905V2 c0905v2 = (C0905V2) obj;
        return this.f2818a == c0905v2.f2818a && this.f2819b == c0905v2.f2819b && AbstractC0585Nj.m1134a(this.f2820c, c0905v2.f2820c) && this.f2821d == c0905v2.f2821d && this.f2822e == c0905v2.f2822e && AbstractC0585Nj.m1134a(this.f2823f, c0905v2.f2823f);
    }

    public final int hashCode() {
        int iM403a = AbstractC0213Ey.m403a(this.f2822e, AbstractC0213Ey.m403a(this.f2821d, AbstractC2374ph.m4810g(this.f2820c, AbstractC0213Ey.m403a(this.f2819b, Boolean.hashCode(this.f2818a) * 31, 31), 31), 31), 31);
        String str = this.f2823f;
        return iM403a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-393603687905333L));
        sb.append(this.f2818a);
        sb.append(AbstractC0295Gu.m625r(-393161306273845L));
        AbstractC0213Ey.m418p(sb, this.f2819b, -393238615685173L);
        AbstractC2374ph.m4817n(sb, this.f2820c, -393277270390837L);
        AbstractC0213Ey.m418p(sb, this.f2821d, -393333104965685L);
        AbstractC0213Ey.m418p(sb, this.f2822e, -391756851968053L);
        return AbstractC2374ph.m4815l(sb, this.f2823f, ')');
    }
}
