package sd;

import java.util.List;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: sd.pe */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7597pe {

    /* JADX INFO: renamed from: a */
    public final List f25176a;

    /* JADX INFO: renamed from: b */
    public final List f25177b;

    /* JADX INFO: renamed from: c */
    public final List f25178c;

    /* JADX INFO: renamed from: d */
    public final List f25179d;

    /* JADX INFO: renamed from: e */
    public final List f25180e;

    /* JADX INFO: renamed from: f */
    public final List f25181f;

    /* JADX INFO: renamed from: g */
    public final List f25182g;

    /* JADX INFO: renamed from: h */
    public final List f25183h;

    /* JADX INFO: renamed from: i */
    public final List f25184i;

    public C7597pe(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        this.f25176a = list;
        this.f25177b = list2;
        this.f25178c = list3;
        this.f25179d = list4;
        this.f25180e = list5;
        this.f25181f = list6;
        this.f25182g = list7;
        this.f25183h = list8;
        this.f25184i = list9;
    }

    /* JADX INFO: renamed from: a */
    public final List m29481a() {
        return this.f25183h;
    }

    /* JADX INFO: renamed from: b */
    public final List m29482b() {
        return this.f25182g;
    }

    /* JADX INFO: renamed from: c */
    public final List m29483c() {
        return this.f25184i;
    }

    /* JADX INFO: renamed from: d */
    public final List m29484d() {
        return this.f25178c;
    }

    /* JADX INFO: renamed from: e */
    public final List m29485e() {
        return this.f25180e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7597pe)) {
            return false;
        }
        C7597pe c7597pe = (C7597pe) obj;
        return AbstractC1061t.m3842c(this.f25176a, c7597pe.f25176a) && AbstractC1061t.m3842c(this.f25177b, c7597pe.f25177b) && AbstractC1061t.m3842c(this.f25178c, c7597pe.f25178c) && AbstractC1061t.m3842c(this.f25179d, c7597pe.f25179d) && AbstractC1061t.m3842c(this.f25180e, c7597pe.f25180e) && AbstractC1061t.m3842c(this.f25181f, c7597pe.f25181f) && AbstractC1061t.m3842c(this.f25182g, c7597pe.f25182g) && AbstractC1061t.m3842c(this.f25183h, c7597pe.f25183h) && AbstractC1061t.m3842c(this.f25184i, c7597pe.f25184i);
    }

    /* JADX INFO: renamed from: f */
    public final List m29486f() {
        return this.f25176a;
    }

    /* JADX INFO: renamed from: g */
    public final List m29487g() {
        return this.f25179d;
    }

    /* JADX INFO: renamed from: h */
    public final List m29488h() {
        return this.f25177b;
    }

    public int hashCode() {
        return (((((((((((((((this.f25176a.hashCode() * 31) + this.f25177b.hashCode()) * 31) + this.f25178c.hashCode()) * 31) + this.f25179d.hashCode()) * 31) + this.f25180e.hashCode()) * 31) + this.f25181f.hashCode()) * 31) + this.f25182g.hashCode()) * 31) + this.f25183h.hashCode()) * 31) + this.f25184i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final List m29489i() {
        return this.f25181f;
    }

    public String toString() {
        return "RankData(total=" + this.f25176a + ", year=" + this.f25177b + ", month=" + this.f25178c + ", week=" + this.f25179d + ", today=" + this.f25180e + ", yesterday=" + this.f25181f + ", lastWeek=" + this.f25182g + ", lastMonth=" + this.f25183h + ", lastYear=" + this.f25184i + ")";
    }
}
