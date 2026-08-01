package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0037j {

    /* JADX INFO: renamed from: a */
    public final List f241a;

    /* JADX INFO: renamed from: b */
    public final List f242b;

    /* JADX INFO: renamed from: c */
    public final List f243c;

    /* JADX INFO: renamed from: d */
    public final List f244d;

    /* JADX INFO: renamed from: e */
    public final List f245e;

    /* JADX INFO: renamed from: f */
    public final List f246f;

    /* JADX INFO: renamed from: g */
    public final String f247g;

    /* JADX INFO: renamed from: h */
    public final String f248h;

    /* JADX INFO: renamed from: i */
    public final String f249i;

    /* JADX INFO: renamed from: j */
    public final String f250j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0037j(List list, List list2, List list3, List list4, List list5, List list6, String str, String str2, String str3, String str4) {
        this.f241a = list;
        this.f242b = list2;
        this.f243c = list3;
        this.f244d = list4;
        this.f245e = list5;
        this.f246f = list6;
        this.f247g = str;
        this.f248h = str2;
        this.f249i = str3;
        this.f250j = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0037j)) {
            return false;
        }
        C0037j c0037j = (C0037j) obj;
        return AbstractC0223g.m414a(this.f241a, c0037j.f241a) && AbstractC0223g.m414a(this.f242b, c0037j.f242b) && AbstractC0223g.m414a(this.f243c, c0037j.f243c) && AbstractC0223g.m414a(this.f244d, c0037j.f244d) && AbstractC0223g.m414a(this.f245e, c0037j.f245e) && AbstractC0223g.m414a(this.f246f, c0037j.f246f) && AbstractC0223g.m414a(this.f247g, c0037j.f247g) && AbstractC0223g.m414a(this.f248h, c0037j.f248h) && AbstractC0223g.m414a(this.f249i, c0037j.f249i) && AbstractC0223g.m414a(this.f250j, c0037j.f250j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f250j.hashCode() + AbstractC0174d.m347c(this.f249i, AbstractC0174d.m347c(this.f248h, AbstractC0174d.m347c(this.f247g, AbstractC0174d.m349e(this.f246f, AbstractC0174d.m349e(this.f245e, AbstractC0174d.m349e(this.f244d, AbstractC0174d.m349e(this.f243c, AbstractC0174d.m349e(this.f242b, this.f241a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(adapterClassNames=" + this.f241a + ", dataSourceClassNames=" + this.f242b + ", itemClassNames=" + this.f243c + ", holderClassNames=" + this.f244d + ", storageClassNames=" + this.f245e + ", requestClassNames=" + this.f246f + ", getDataSourceMethodName=" + this.f247g + ", getConversationListMethodName=" + this.f248h + ", requestRefreshMethodName=" + this.f249i + ", submitListMethodName=" + this.f250j + ")";
    }
}
