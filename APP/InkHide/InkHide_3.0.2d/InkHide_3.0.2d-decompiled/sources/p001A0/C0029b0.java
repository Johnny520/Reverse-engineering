package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0029b0 {

    /* JADX INFO: renamed from: a */
    public final List f210a;

    /* JADX INFO: renamed from: b */
    public final List f211b;

    /* JADX INFO: renamed from: c */
    public final List f212c;

    /* JADX INFO: renamed from: d */
    public final List f213d;

    /* JADX INFO: renamed from: e */
    public final List f214e;

    /* JADX INFO: renamed from: f */
    public final List f215f;

    /* JADX INFO: renamed from: g */
    public final List f216g;

    /* JADX INFO: renamed from: h */
    public final List f217h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0029b0(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8) {
        this.f210a = list;
        this.f211b = list2;
        this.f212c = list3;
        this.f213d = list4;
        this.f214e = list5;
        this.f215f = list6;
        this.f216g = list7;
        this.f217h = list8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0029b0)) {
            return false;
        }
        C0029b0 c0029b0 = (C0029b0) obj;
        return AbstractC0223g.m414a(this.f210a, c0029b0.f210a) && AbstractC0223g.m414a(this.f211b, c0029b0.f211b) && AbstractC0223g.m414a(this.f212c, c0029b0.f212c) && AbstractC0223g.m414a(this.f213d, c0029b0.f213d) && AbstractC0223g.m414a(this.f214e, c0029b0.f214e) && AbstractC0223g.m414a(this.f215f, c0029b0.f215f) && AbstractC0223g.m414a(this.f216g, c0029b0.f216g) && AbstractC0223g.m414a(this.f217h, c0029b0.f217h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f217h.hashCode() + AbstractC0174d.m349e(this.f216g, AbstractC0174d.m349e(this.f215f, AbstractC0174d.m349e(this.f214e, AbstractC0174d.m349e(this.f213d, AbstractC0174d.m349e(this.f212c, AbstractC0174d.m349e(this.f211b, this.f210a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(activityClassNames=" + this.f210a + ", adapterClassNames=" + this.f211b + ", dataFieldNames=" + this.f212c + ", groupItemClassNames=" + this.f213d + ", titleItemClassNames=" + this.f214e + ", mainRecyclerEntryNames=" + this.f215f + ", titleEntryNames=" + this.f216g + ", avatarContainerEntryNames=" + this.f217h + ")";
    }
}
