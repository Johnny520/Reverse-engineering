package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0022W {

    /* JADX INFO: renamed from: a */
    public final List f163a;

    /* JADX INFO: renamed from: b */
    public final List f164b;

    /* JADX INFO: renamed from: c */
    public final List f165c;

    /* JADX INFO: renamed from: d */
    public final List f166d;

    /* JADX INFO: renamed from: e */
    public final List f167e;

    /* JADX INFO: renamed from: f */
    public final List f168f;

    /* JADX INFO: renamed from: g */
    public final List f169g;

    /* JADX INFO: renamed from: h */
    public final List f170h;

    /* JADX INFO: renamed from: i */
    public final List f171i;

    /* JADX INFO: renamed from: j */
    public final List f172j;

    /* JADX INFO: renamed from: k */
    public final List f173k;

    /* JADX INFO: renamed from: l */
    public final List f174l;

    /* JADX INFO: renamed from: m */
    public final List f175m;

    /* JADX INFO: renamed from: n */
    public final List f176n;

    /* JADX INFO: renamed from: o */
    public final List f177o;

    /* JADX INFO: renamed from: p */
    public final List f178p;

    /* JADX INFO: renamed from: q */
    public final List f179q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0022W(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17) {
        AbstractC0223g.m418e(list5, "snsInfoUserFieldNames");
        AbstractC0223g.m418e(list6, "snsInfoSnsIdFieldNames");
        AbstractC0223g.m418e(list7, "snsInfoLocalIdFieldNames");
        AbstractC0223g.m418e(list8, "timeLineObjectUserFieldNames");
        AbstractC0223g.m418e(list9, "snsObjectExtFlagFieldNames");
        AbstractC0223g.m418e(list10, "snsObjectLikeListFieldNames");
        AbstractC0223g.m418e(list11, "snsObjectLikeCountFieldNames");
        AbstractC0223g.m418e(list12, "snsObjectLikeListCountFieldNames");
        AbstractC0223g.m418e(list13, "snsObjectCommentListFieldNames");
        AbstractC0223g.m418e(list14, "snsObjectCommentCountFieldNames");
        AbstractC0223g.m418e(list15, "snsObjectCommentListCountFieldNames");
        this.f163a = list;
        this.f164b = list2;
        this.f165c = list3;
        this.f166d = list4;
        this.f167e = list5;
        this.f168f = list6;
        this.f169g = list7;
        this.f170h = list8;
        this.f171i = list9;
        this.f172j = list10;
        this.f173k = list11;
        this.f174l = list12;
        this.f175m = list13;
        this.f176n = list14;
        this.f177o = list15;
        this.f178p = list16;
        this.f179q = list17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0022W)) {
            return false;
        }
        C0022W c0022w = (C0022W) obj;
        return AbstractC0223g.m414a(this.f163a, c0022w.f163a) && AbstractC0223g.m414a(this.f164b, c0022w.f164b) && AbstractC0223g.m414a(this.f165c, c0022w.f165c) && AbstractC0223g.m414a(this.f166d, c0022w.f166d) && AbstractC0223g.m414a(this.f167e, c0022w.f167e) && AbstractC0223g.m414a(this.f168f, c0022w.f168f) && AbstractC0223g.m414a(this.f169g, c0022w.f169g) && AbstractC0223g.m414a(this.f170h, c0022w.f170h) && AbstractC0223g.m414a(this.f171i, c0022w.f171i) && AbstractC0223g.m414a(this.f172j, c0022w.f172j) && AbstractC0223g.m414a(this.f173k, c0022w.f173k) && AbstractC0223g.m414a(this.f174l, c0022w.f174l) && AbstractC0223g.m414a(this.f175m, c0022w.f175m) && AbstractC0223g.m414a(this.f176n, c0022w.f176n) && AbstractC0223g.m414a(this.f177o, c0022w.f177o) && AbstractC0223g.m414a(this.f178p, c0022w.f178p) && AbstractC0223g.m414a(this.f179q, c0022w.f179q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f179q.hashCode() + AbstractC0174d.m349e(this.f178p, AbstractC0174d.m349e(this.f177o, AbstractC0174d.m349e(this.f176n, AbstractC0174d.m349e(this.f175m, AbstractC0174d.m349e(this.f174l, AbstractC0174d.m349e(this.f173k, AbstractC0174d.m349e(this.f172j, AbstractC0174d.m349e(this.f171i, AbstractC0174d.m349e(this.f170h, AbstractC0174d.m349e(this.f169g, AbstractC0174d.m349e(this.f168f, AbstractC0174d.m349e(this.f167e, AbstractC0174d.m349e(this.f166d, AbstractC0174d.m349e(this.f165c, AbstractC0174d.m349e(this.f164b, this.f163a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(timelineClassNames=" + this.f163a + ", snsObjectProviderClassNames=" + this.f164b + ", detailActivityClassNames=" + this.f165c + ", selfAlbumAdapterClassNames=" + this.f166d + ", snsInfoUserFieldNames=" + this.f167e + ", snsInfoSnsIdFieldNames=" + this.f168f + ", snsInfoLocalIdFieldNames=" + this.f169g + ", timeLineObjectUserFieldNames=" + this.f170h + ", snsObjectExtFlagFieldNames=" + this.f171i + ", snsObjectLikeListFieldNames=" + this.f172j + ", snsObjectLikeCountFieldNames=" + this.f173k + ", snsObjectLikeListCountFieldNames=" + this.f174l + ", snsObjectCommentListFieldNames=" + this.f175m + ", snsObjectCommentCountFieldNames=" + this.f176n + ", snsObjectCommentListCountFieldNames=" + this.f177o + ", contextMenuCreateMethods=" + this.f178p + ", contextMenuSelectMethods=" + this.f179q + ")";
    }
}
