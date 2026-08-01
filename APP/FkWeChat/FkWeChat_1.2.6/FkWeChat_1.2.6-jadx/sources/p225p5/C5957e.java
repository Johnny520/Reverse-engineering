package p225p5;

import bsh.C1259t2;
import p254r5.AbstractC6487a;
import p254r5.C6492c0;

/* JADX INFO: renamed from: p5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5957e implements Comparable {

    /* JADX INFO: renamed from: q */
    public final C6492c0 f18886q;

    /* JADX INFO: renamed from: r */
    public final AbstractC6487a f18887r;

    public C5957e(C6492c0 c6492c0, AbstractC6487a abstractC6487a) {
        if (c6492c0 == null) {
            C1259t2.m5095a("name == null");
            throw null;
        }
        if (abstractC6487a == null) {
            C1259t2.m5095a("value == null");
            throw null;
        }
        this.f18886q = c6492c0;
        this.f18887r = abstractC6487a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5957e c5957e) {
        int iCompareTo = this.f18886q.compareTo(c5957e.f18886q);
        return iCompareTo != 0 ? iCompareTo : this.f18887r.compareTo(c5957e.f18887r);
    }

    /* JADX INFO: renamed from: c */
    public C6492c0 m23944c() {
        return this.f18886q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5957e)) {
            return false;
        }
        C5957e c5957e = (C5957e) obj;
        return this.f18886q.equals(c5957e.f18886q) && this.f18887r.equals(c5957e.f18887r);
    }

    /* JADX INFO: renamed from: g */
    public AbstractC6487a m23945g() {
        return this.f18887r;
    }

    public int hashCode() {
        return (this.f18886q.hashCode() * 31) + this.f18887r.hashCode();
    }

    public String toString() {
        return this.f18886q.mo6828g() + ":" + this.f18887r;
    }
}
