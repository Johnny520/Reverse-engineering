package p153k8;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: k8.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2356t {

    /* JADX INFO: renamed from: a */
    public final long f7741a;

    /* JADX INFO: renamed from: b */
    public final String f7742b;

    /* JADX INFO: renamed from: c */
    public final String f7743c;

    /* JADX INFO: renamed from: d */
    public final int f7744d;

    /* JADX INFO: renamed from: e */
    public final int f7745e;

    /* JADX INFO: renamed from: f */
    public final String f7746f;

    /* JADX INFO: renamed from: g */
    public final int f7747g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2356t(int i9, int i10, String str, String str2, String str3, long j3, int i11) {
        str3.getClass();
        this.f7741a = j3;
        this.f7742b = str;
        this.f7743c = str2;
        this.f7744d = i9;
        this.f7745e = i10;
        this.f7746f = str3;
        this.f7747g = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2356t)) {
            return false;
        }
        C2356t c2356t = (C2356t) obj;
        return this.f7741a == c2356t.f7741a && this.f7742b.equals(c2356t.f7742b) && this.f7743c.equals(c2356t.f7743c) && this.f7744d == c2356t.f7744d && this.f7745e == c2356t.f7745e && AbstractC1416l.m3825a(this.f7746f, c2356t.f7746f) && this.f7747g == c2356t.f7747g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7747g) + AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f7745e, AbstractC0921a.m2242e(this.f7744d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(Long.hashCode(this.f7741a) * 31, 31, this.f7742b), 31, this.f7743c), 31), 31), 31, this.f7746f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "WeChatRetransmitPayload(msgId=" + this.f7741a + ", sourceTalker=" + this.f7742b + ", content=" + this.f7743c + ", retrType=" + this.f7744d + ", msgFromScene=" + this.f7745e + ", fileName=" + this.f7746f + ", length=" + this.f7747g + ")";
    }
}
