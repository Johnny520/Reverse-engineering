package p002c;

import p010k.C0187q;
import p010k.C0188r;
import p010k.C0190t;

/* JADX INFO: renamed from: c.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0012i {

    /* JADX INFO: renamed from: a */
    final C0013j f36a;

    /* JADX INFO: renamed from: b */
    final C0013j f37b;

    /* JADX INFO: renamed from: c */
    final String f38c;

    /* JADX INFO: renamed from: d */
    final C0014k f39d;

    /* JADX INFO: renamed from: e */
    final C0187q f40e;

    C0012i(C0013j c0013j, C0013j c0013j2, String str, C0014k c0014k) {
        if (c0013j == null || c0013j2 == null || str == null) {
            throw null;
        }
        this.f36a = c0013j;
        this.f37b = c0013j2;
        this.f38c = str;
        this.f39d = c0014k;
        this.f40e = new C0187q(c0013j.f54c, new C0188r(new C0190t(str), new C0190t(m63a(false))));
    }

    /* JADX INFO: renamed from: a */
    final String m63a(boolean z) {
        StringBuilder sb = new StringBuilder("(");
        if (z) {
            sb.append(this.f36a.f52a);
        }
        for (C0013j c0013j : this.f39d.f55a) {
            sb.append(c0013j.f52a);
        }
        sb.append(")");
        sb.append(this.f37b.f52a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0012i) {
            C0012i c0012i = (C0012i) obj;
            if (c0012i.f36a.equals(this.f36a) && c0012i.f38c.equals(this.f38c) && c0012i.f39d.equals(this.f39d) && c0012i.f37b.equals(this.f37b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37b.hashCode() + ((((this.f38c.hashCode() + ((this.f36a.hashCode() + 527) * 31)) * 31) + this.f39d.hashCode()) * 31);
    }

    public final String toString() {
        return this.f36a + "." + this.f38c + "(" + this.f39d + ")";
    }
}
