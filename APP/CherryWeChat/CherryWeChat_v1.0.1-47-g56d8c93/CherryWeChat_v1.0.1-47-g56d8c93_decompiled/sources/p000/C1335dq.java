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

    public C1335dq(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, List list) {
        AbstractC0295Gu.m625r(-812019401881653L);
        AbstractC0295Gu.m625r(-812032286783541L);
        AbstractC0295Gu.m625r(-812058056587317L);
        AbstractC0295Gu.m625r(-812092416325685L);
        AbstractC0295Gu.m625r(-812113891162165L);
        AbstractC0295Gu.m625r(-812165430769717L);
        this.f4809a = str;
        this.f4810b = str2;
        this.f4811c = str3;
        this.f4812d = str4;
        this.f4813e = z;
        this.f4814f = z2;
        this.f4815g = str5;
        this.f4816h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1335dq)) {
            return false;
        }
        C1335dq c1335dq = (C1335dq) obj;
        return AbstractC0585Nj.m1134a(this.f4809a, c1335dq.f4809a) && AbstractC0585Nj.m1134a(this.f4810b, c1335dq.f4810b) && AbstractC0585Nj.m1134a(this.f4811c, c1335dq.f4811c) && AbstractC0585Nj.m1134a(this.f4812d, c1335dq.f4812d) && this.f4813e == c1335dq.f4813e && this.f4814f == c1335dq.f4814f && AbstractC0585Nj.m1134a(this.f4815g, c1335dq.f4815g) && AbstractC0585Nj.m1134a(this.f4816h, c1335dq.f4816h);
    }

    public final int hashCode() {
        return this.f4816h.hashCode() + AbstractC2374ph.m4810g(this.f4815g, (Boolean.hashCode(this.f4814f) + ((Boolean.hashCode(this.f4813e) + AbstractC2374ph.m4810g(this.f4812d, AbstractC2374ph.m4810g(this.f4811c, AbstractC2374ph.m4810g(this.f4810b, this.f4809a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-810773861365813L));
        AbstractC2374ph.m4817n(sb, this.f4809a, -810864055679029L);
        AbstractC2374ph.m4817n(sb, this.f4810b, -810352954570805L);
        AbstractC2374ph.m4817n(sb, this.f4811c, -810400199211061L);
        AbstractC2374ph.m4817n(sb, this.f4812d, -810434558949429L);
        sb.append(this.f4813e);
        sb.append(AbstractC0295Gu.m625r(-810481803589685L));
        sb.append(this.f4814f);
        sb.append(AbstractC0295Gu.m625r(-810533343197237L));
        AbstractC2374ph.m4817n(sb, this.f4815g, -810597767706677L);
        sb.append(this.f4816h);
        sb.append(')');
        return sb.toString();
    }
}
