package p034G;

import p000A.C0038T0;
import p000A.C0089u;
import p041H0.AbstractC0582a0;
import p058L.C0913O;
import p058L.C0914P;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: G.j */
/* JADX INFO: loaded from: classes.dex */
final class C0465j extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0038T0 f1374a;

    /* JADX INFO: renamed from: b */
    public final C0913O f1375b;

    /* JADX INFO: renamed from: c */
    public final C0914P f1376c;

    /* JADX INFO: renamed from: d */
    public final C0089u f1377d;

    public C0465j(C0038T0 c0038t0, C0913O c0913o, C0914P c0914p, C0089u c0089u) {
        this.f1374a = c0038t0;
        this.f1375b = c0913o;
        this.f1376c = c0914p;
        this.f1377d = c0089u;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0467l(this.f1374a, this.f1375b, this.f1376c, this.f1377d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0465j)) {
            return false;
        }
        C0465j c0465j = (C0465j) obj;
        return this.f1374a == c0465j.f1374a && this.f1375b == c0465j.f1375b && this.f1376c == c0465j.f1376c && this.f1377d == c0465j.f1377d;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0467l c0467l = (C0467l) abstractC2206o;
        c0467l.f1383t.f169e = null;
        C0038T0 c0038t0 = this.f1374a;
        c0467l.f1383t = c0038t0;
        c0038t0.f169e = c0467l;
        c0038t0.f170f = c0467l.f7199q ? EnumC0468m.f1392f : EnumC0468m.f1391e;
        c0467l.f1384u = this.f1375b;
        c0467l.f1385v = this.f1376c;
        c0467l.f1386w = this.f1377d;
    }

    public final int hashCode() {
        return this.f1377d.hashCode() + ((this.f1376c.hashCode() + ((this.f1375b.hashCode() + (this.f1374a.hashCode() * 31)) * 31)) * 31);
    }
}
