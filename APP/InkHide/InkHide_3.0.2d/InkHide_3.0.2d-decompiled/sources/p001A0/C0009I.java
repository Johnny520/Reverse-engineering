package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0009I {

    /* JADX INFO: renamed from: a */
    public final Object f74a;

    /* JADX INFO: renamed from: b */
    public final Object f75b;

    /* JADX INFO: renamed from: c */
    public final Object f76c;

    /* JADX INFO: renamed from: d */
    public final Object f77d;

    /* JADX INFO: renamed from: e */
    public final Object f78e;

    /* JADX INFO: renamed from: f */
    public final Object f79f;

    /* JADX INFO: renamed from: g */
    public final Object f80g;

    /* JADX INFO: renamed from: h */
    public final Object f81h;

    /* JADX INFO: renamed from: i */
    public final Object f82i;

    /* JADX INFO: renamed from: j */
    public final Object f83j;

    /* JADX INFO: renamed from: k */
    public final Object f84k;

    /* JADX INFO: renamed from: l */
    public final Object f85l;

    /* JADX INFO: renamed from: m */
    public final Object f86m;

    /* JADX INFO: renamed from: n */
    public final Object f87n;

    /* JADX INFO: renamed from: o */
    public final Object f88o;

    /* JADX INFO: renamed from: p */
    public final Object f89p;

    /* JADX INFO: renamed from: q */
    public final Object f90q;

    /* JADX INFO: renamed from: r */
    public final int f91r;

    /* JADX INFO: renamed from: s */
    public final String f92s;

    /* JADX INFO: renamed from: t */
    public final long f93t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0009I(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, int i2, String str, long j2) {
        this.f74a = list;
        this.f75b = list2;
        this.f76c = list3;
        this.f77d = list4;
        this.f78e = list5;
        this.f79f = list6;
        this.f80g = list7;
        this.f81h = list8;
        this.f82i = list9;
        this.f83j = list10;
        this.f84k = list11;
        this.f85l = list12;
        this.f86m = list13;
        this.f87n = list14;
        this.f88o = list15;
        this.f89p = list16;
        this.f90q = list17;
        this.f91r = i2;
        this.f92s = str;
        this.f93t = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0009I)) {
            return false;
        }
        C0009I c0009i = (C0009I) obj;
        return this.f74a.equals(c0009i.f74a) && this.f75b.equals(c0009i.f75b) && this.f76c.equals(c0009i.f76c) && this.f77d.equals(c0009i.f77d) && this.f78e.equals(c0009i.f78e) && this.f79f.equals(c0009i.f79f) && this.f80g.equals(c0009i.f80g) && this.f81h.equals(c0009i.f81h) && this.f82i.equals(c0009i.f82i) && this.f83j.equals(c0009i.f83j) && this.f84k.equals(c0009i.f84k) && this.f85l.equals(c0009i.f85l) && this.f86m.equals(c0009i.f86m) && this.f87n.equals(c0009i.f87n) && this.f88o.equals(c0009i.f88o) && this.f89p.equals(c0009i.f89p) && this.f90q.equals(c0009i.f90q) && this.f91r == c0009i.f91r && this.f92s.equals(c0009i.f92s) && this.f93t == c0009i.f93t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f93t) + AbstractC0174d.m347c(this.f92s, AbstractC0174d.m345a(this.f91r, AbstractC0174d.m346b(this.f90q, AbstractC0174d.m346b(this.f89p, AbstractC0174d.m346b(this.f88o, AbstractC0174d.m346b(this.f87n, AbstractC0174d.m346b(this.f86m, AbstractC0174d.m346b(this.f85l, AbstractC0174d.m346b(this.f84k, AbstractC0174d.m346b(this.f83j, AbstractC0174d.m346b(this.f82i, AbstractC0174d.m346b(this.f81h, AbstractC0174d.m346b(this.f80g, AbstractC0174d.m346b(this.f79f, AbstractC0174d.m346b(this.f78e, AbstractC0174d.m346b(this.f77d, AbstractC0174d.m346b(this.f76c, AbstractC0174d.m346b(this.f75b, this.f74a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedSnsHookPoint(timelineClassNames=" + this.f74a + ", snsObjectProviderClassNames=" + this.f75b + ", detailActivityClassNames=" + this.f76c + ", selfAlbumAdapterClassNames=" + this.f77d + ", snsInfoUserFieldNames=" + this.f78e + ", snsInfoSnsIdFieldNames=" + this.f79f + ", snsInfoLocalIdFieldNames=" + this.f80g + ", timeLineObjectUserFieldNames=" + this.f81h + ", snsObjectExtFlagFieldNames=" + this.f82i + ", snsObjectLikeListFieldNames=" + this.f83j + ", snsObjectLikeCountFieldNames=" + this.f84k + ", snsObjectLikeListCountFieldNames=" + this.f85l + ", snsObjectCommentListFieldNames=" + this.f86m + ", snsObjectCommentCountFieldNames=" + this.f87n + ", snsObjectCommentListCountFieldNames=" + this.f88o + ", contextMenuCreateMethods=" + this.f89p + ", contextMenuSelectMethods=" + this.f90q + ", versionCode=" + this.f91r + ", versionName=" + this.f92s + ", updatedAt=" + this.f93t + ")";
    }
}
