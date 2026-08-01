package p239q5;

import okhttp3.internal.url._UrlKt;
import p254r5.C6492c0;

/* JADX INFO: renamed from: q5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6260k implements Comparable {

    /* JADX INFO: renamed from: q */
    public final C6492c0 f19427q;

    /* JADX INFO: renamed from: r */
    public final C6492c0 f19428r;

    public C6260k(C6492c0 c6492c0, C6492c0 c6492c02) {
        this.f19427q = c6492c0;
        this.f19428r = c6492c02;
    }

    /* JADX INFO: renamed from: a */
    public static int m24712a(C6492c0 c6492c0, C6492c0 c6492c02) {
        if (c6492c0 == c6492c02) {
            return 0;
        }
        if (c6492c0 == null) {
            return -1;
        }
        if (c6492c02 == null) {
            return 1;
        }
        return c6492c0.compareTo(c6492c02);
    }

    /* JADX INFO: renamed from: i */
    public static C6260k m24713i(C6492c0 c6492c0, C6492c0 c6492c02) {
        if (c6492c0 == null && c6492c02 == null) {
            return null;
        }
        return new C6260k(c6492c0, c6492c02);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6260k c6260k) {
        int iM24712a = m24712a(this.f19427q, c6260k.f19427q);
        return iM24712a != 0 ? iM24712a : m24712a(this.f19428r, c6260k.f19428r);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6260k) && compareTo((C6260k) obj) == 0;
    }

    /* JADX INFO: renamed from: g */
    public C6492c0 m24715g() {
        return this.f19427q;
    }

    /* JADX INFO: renamed from: h */
    public C6492c0 m24716h() {
        return this.f19428r;
    }

    public int hashCode() {
        C6492c0 c6492c0 = this.f19427q;
        int iHashCode = (c6492c0 == null ? 0 : c6492c0.hashCode()) * 31;
        C6492c0 c6492c02 = this.f19428r;
        return iHashCode + (c6492c02 != null ? c6492c02.hashCode() : 0);
    }

    public String toString() {
        C6492c0 c6492c0 = this.f19427q;
        if (c6492c0 != null && this.f19428r == null) {
            return c6492c0.m25744v();
        }
        String strM25744v = _UrlKt.FRAGMENT_ENCODE_SET;
        if (c6492c0 == null && this.f19428r == null) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder("[");
        C6492c0 c6492c02 = this.f19427q;
        sb2.append(c6492c02 == null ? _UrlKt.FRAGMENT_ENCODE_SET : c6492c02.m25744v());
        sb2.append("|");
        C6492c0 c6492c03 = this.f19428r;
        if (c6492c03 != null) {
            strM25744v = c6492c03.m25744v();
        }
        sb2.append(strM25744v);
        return sb2.toString();
    }
}
