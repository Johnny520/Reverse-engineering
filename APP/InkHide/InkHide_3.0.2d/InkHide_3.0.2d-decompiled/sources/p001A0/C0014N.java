package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0014N {

    /* JADX INFO: renamed from: a */
    public final List f126a;

    /* JADX INFO: renamed from: b */
    public final List f127b;

    /* JADX INFO: renamed from: c */
    public final List f128c;

    /* JADX INFO: renamed from: d */
    public final List f129d;

    /* JADX INFO: renamed from: e */
    public final List f130e;

    /* JADX INFO: renamed from: f */
    public final List f131f;

    /* JADX INFO: renamed from: g */
    public final List f132g;

    /* JADX INFO: renamed from: h */
    public final List f133h;

    /* JADX INFO: renamed from: i */
    public final List f134i;

    /* JADX INFO: renamed from: j */
    public final List f135j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0014N(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10) {
        this.f126a = list;
        this.f127b = list2;
        this.f128c = list3;
        this.f129d = list4;
        this.f130e = list5;
        this.f131f = list6;
        this.f132g = list7;
        this.f133h = list8;
        this.f134i = list9;
        this.f135j = list10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0014N)) {
            return false;
        }
        C0014N c0014n = (C0014N) obj;
        return AbstractC0223g.m414a(this.f126a, c0014n.f126a) && AbstractC0223g.m414a(this.f127b, c0014n.f127b) && AbstractC0223g.m414a(this.f128c, c0014n.f128c) && AbstractC0223g.m414a(this.f129d, c0014n.f129d) && AbstractC0223g.m414a(this.f130e, c0014n.f130e) && AbstractC0223g.m414a(this.f131f, c0014n.f131f) && AbstractC0223g.m414a(this.f132g, c0014n.f132g) && AbstractC0223g.m414a(this.f133h, c0014n.f133h) && AbstractC0223g.m414a(this.f134i, c0014n.f134i) && AbstractC0223g.m414a(this.f135j, c0014n.f135j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f135j.hashCode() + AbstractC0174d.m349e(this.f134i, AbstractC0174d.m349e(this.f133h, AbstractC0174d.m349e(this.f132g, AbstractC0174d.m349e(this.f131f, AbstractC0174d.m349e(this.f130e, AbstractC0174d.m349e(this.f129d, AbstractC0174d.m349e(this.f128c, AbstractC0174d.m349e(this.f127b, this.f126a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(conversationLongClickClassNames=" + this.f126a + ", conversationMenuCallbackClassNames=" + this.f127b + ", popupClassNames=" + this.f128c + ", popupCreateSpecs=" + this.f129d + ", popupBuildSpecs=" + this.f130e + ", popupClickHandlerClassNames=" + this.f131f + ", popupAdapterClassNames=" + this.f132g + ", contactMenuCallbackClassNames=" + this.f133h + ", addressMenuCreateClassNames=" + this.f134i + ", addressMenuClickClassNames=" + this.f135j + ")";
    }
}
