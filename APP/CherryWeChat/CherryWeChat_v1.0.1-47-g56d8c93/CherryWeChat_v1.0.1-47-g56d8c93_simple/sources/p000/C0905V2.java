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

    public C0905V2(int r3, int r4, int r5, String r6, String r7, boolean r8) {
        AbstractC0295Gu.m625r(-393552148297781L);
        this.f2818a = r8;
        this.f2819b = r3;
        this.f2820c = r6;
        this.f2821d = r4;
        this.f2822e = r5;
        this.f2823f = r7;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0905V2) == true) goto L8;
        return false;
    L8:
        C0905V2 r52 = (C0905V2) r5;
        if (this.f2818a == r52.f2818a) goto L12;
        return false;
    L12:
        if (this.f2819b == r52.f2819b) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f2820c, r52.f2820c) == true) goto L18;
        return false;
    L18:
        if (this.f2821d == r52.f2821d) goto L21;
        return false;
    L21:
        if (this.f2822e == r52.f2822e) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.f2823f, r52.f2823f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r0 = Boolean.hashCode(this.f2818a) * 31;
        int r02 = AbstractC0213Ey.m403a(this.f2819b, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.f2820c, r02, 31);
        int r04 = AbstractC0213Ey.m403a(this.f2821d, r03, 31);
        int r05 = AbstractC0213Ey.m403a(this.f2822e, r04, 31);
        String r1 = this.f2823f;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r05 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-393603687905333L));
        r0.append(this.f2818a);
        r0.append(AbstractC0295Gu.m625r(-393161306273845L));
        AbstractC0213Ey.m418p(r0, this.f2819b, -393238615685173L);
        AbstractC2374ph.m4817n(r0, this.f2820c, -393277270390837L);
        AbstractC0213Ey.m418p(r0, this.f2821d, -393333104965685L);
        AbstractC0213Ey.m418p(r0, this.f2822e, -391756851968053L);
        return AbstractC2374ph.m4815l(r0, this.f2823f, ')');
    }
}
