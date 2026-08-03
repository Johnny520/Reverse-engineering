package p109hb;

import gg.AbstractC1416l;
import java.util.List;
import p035c8.C0412a;
import p136j8.AbstractC2091b;
import p136j8.C2113x;

/* JADX INFO: renamed from: hb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1685j {

    /* JADX INFO: renamed from: a */
    public final C1697t f5591a;

    /* JADX INFO: renamed from: b */
    public final List f5592b;

    /* JADX INFO: renamed from: c */
    public final C0412a f5593c;

    /* JADX INFO: renamed from: d */
    public final C2113x f5594d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1685j(C1697t c1697t, List list, C0412a c0412a, C2113x c2113x) {
        list.getClass();
        this.f5591a = c1697t;
        this.f5592b = list;
        this.f5593c = c0412a;
        this.f5594d = c2113x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1685j)) {
            return false;
        }
        C1685j c1685j = (C1685j) obj;
        return this.f5591a.equals(c1685j.f5591a) && AbstractC1416l.m3825a(this.f5592b, c1685j.f5592b) && AbstractC1416l.m3825a(this.f5593c, c1685j.f5593c) && AbstractC1416l.m3825a(this.f5594d, c1685j.f5594d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM5158e = AbstractC2091b.m5158e(this.f5592b, this.f5591a.hashCode() * 31, 31);
        C0412a c0412a = this.f5593c;
        int iHashCode = (iM5158e + (c0412a == null ? 0 : c0412a.hashCode())) * 31;
        C2113x c2113x = this.f5594d;
        return iHashCode + (c2113x != null ? c2113x.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SendJob(snapshot=" + this.f5591a + ", targets=" + this.f5592b + ", emojiPayload=" + this.f5593c + ", voicePayload=" + this.f5594d + ")";
    }
}
