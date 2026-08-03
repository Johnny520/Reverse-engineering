package p000;

import java.util.List;

/* JADX INFO: renamed from: dq */
/* JADX INFO: loaded from: classes.dex */
public final class C1335dq {

    /* JADX INFO: renamed from: a */
    public final String f4809a;

    /* JADX INFO: renamed from: b */
    public final String f4810b;

    /* JADX INFO: renamed from: c */
    public final String f4811c;

    /* JADX INFO: renamed from: d */
    public final String f4812d;

    /* JADX INFO: renamed from: e */
    public final boolean f4813e;

    /* JADX INFO: renamed from: f */
    public final boolean f4814f;

    /* JADX INFO: renamed from: g */
    public final String f4815g;

    /* JADX INFO: renamed from: h */
    public final List f4816h;

    public C1335dq(String r3, String r4, String r5, String r6, boolean r7, boolean r8, String r9, List r10) {
        AbstractC0295Gu.m625r(-812019401881653L);
        AbstractC0295Gu.m625r(-812032286783541L);
        AbstractC0295Gu.m625r(-812058056587317L);
        AbstractC0295Gu.m625r(-812092416325685L);
        AbstractC0295Gu.m625r(-812113891162165L);
        AbstractC0295Gu.m625r(-812165430769717L);
        this.f4809a = r3;
        this.f4810b = r4;
        this.f4811c = r5;
        this.f4812d = r6;
        this.f4813e = r7;
        this.f4814f = r8;
        this.f4815g = r9;
        this.f4816h = r10;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1335dq) == true) goto L8;
        return false;
    L8:
        C1335dq r52 = (C1335dq) r5;
        if (AbstractC0585Nj.m1134a(this.f4809a, r52.f4809a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f4810b, r52.f4810b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f4811c, r52.f4811c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.f4812d, r52.f4812d) == true) goto L21;
        return false;
    L21:
        if (this.f4813e == r52.f4813e) goto L24;
        return false;
    L24:
        if (this.f4814f == r52.f4814f) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.f4815g, r52.f4815g) == true) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.f4816h, r52.f4816h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f4809a.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.f4810b, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.f4811c, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.f4812d, r03, 31);
        int r2 = (Boolean.hashCode(this.f4813e) + r04) * 31;
        int r05 = (Boolean.hashCode(this.f4814f) + r2) * 31;
        int r06 = AbstractC2374ph.m4810g(this.f4815g, r05, 31);
        return this.f4816h.hashCode() + r06;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-810773861365813L));
        AbstractC2374ph.m4817n(r0, this.f4809a, -810864055679029L);
        AbstractC2374ph.m4817n(r0, this.f4810b, -810352954570805L);
        AbstractC2374ph.m4817n(r0, this.f4811c, -810400199211061L);
        AbstractC2374ph.m4817n(r0, this.f4812d, -810434558949429L);
        r0.append(this.f4813e);
        r0.append(AbstractC0295Gu.m625r(-810481803589685L));
        r0.append(this.f4814f);
        r0.append(AbstractC0295Gu.m625r(-810533343197237L));
        AbstractC2374ph.m4817n(r0, this.f4815g, -810597767706677L);
        r0.append(this.f4816h);
        r0.append(')');
        return r0.toString();
    }
}
