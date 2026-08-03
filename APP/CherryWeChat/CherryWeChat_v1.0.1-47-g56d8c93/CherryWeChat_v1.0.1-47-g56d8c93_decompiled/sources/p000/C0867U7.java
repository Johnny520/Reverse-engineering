package p000;

/* JADX INFO: renamed from: U7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867U7 {

    /* JADX INFO: renamed from: a */
    public final String f2737a;

    /* JADX INFO: renamed from: b */
    public final int f2738b;

    /* JADX INFO: renamed from: c */
    public final String f2739c;

    /* JADX INFO: renamed from: d */
    public final int f2740d;

    /* JADX INFO: renamed from: e */
    public final int f2741e;

    /* JADX INFO: renamed from: f */
    public final long f2742f;

    public C0867U7(String str, int i, String str2, int i2, int i3, long j) {
        AbstractC0295Gu.m625r(-500604208150581L);
        AbstractC0295Gu.m625r(-500629977954357L);
        this.f2737a = str;
        this.f2738b = i;
        this.f2739c = str2;
        this.f2740d = i2;
        this.f2741e = i3;
        this.f2742f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0867U7)) {
            return false;
        }
        C0867U7 c0867u7 = (C0867U7) obj;
        return AbstractC0585Nj.m1134a(this.f2737a, c0867u7.f2737a) && this.f2738b == c0867u7.f2738b && AbstractC0585Nj.m1134a(this.f2739c, c0867u7.f2739c) && this.f2740d == c0867u7.f2740d && this.f2741e == c0867u7.f2741e && this.f2742f == c0867u7.f2742f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2742f) + AbstractC0213Ey.m403a(this.f2741e, AbstractC0213Ey.m403a(this.f2740d, AbstractC2374ph.m4810g(this.f2739c, AbstractC0213Ey.m403a(this.f2738b, this.f2737a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-500776006842421L));
        AbstractC2374ph.m4817n(sb, this.f2737a, -500312150374453L);
        AbstractC0213Ey.m418p(sb, this.f2738b, -500355100047413L);
        AbstractC2374ph.m4817n(sb, this.f2739c, -500428114491445L);
        AbstractC0213Ey.m418p(sb, this.f2740d, -500453884295221L);
        AbstractC0213Ey.m418p(sb, this.f2741e, -500492539000885L);
        sb.append(this.f2742f);
        sb.append(')');
        return sb.toString();
    }
}
