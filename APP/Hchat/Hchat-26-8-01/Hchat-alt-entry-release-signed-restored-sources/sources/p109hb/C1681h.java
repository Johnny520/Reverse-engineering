package p109hb;

import gg.AbstractC1416l;
import p035c8.C0412a;
import p136j8.C2113x;

/* JADX INFO: renamed from: hb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1681h {

    /* JADX INFO: renamed from: a */
    public final C1697t f5571a;

    /* JADX INFO: renamed from: b */
    public final C0412a f5572b;

    /* JADX INFO: renamed from: c */
    public final C2113x f5573c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1681h(C1697t c1697t, C0412a c0412a, C2113x c2113x) {
        this.f5571a = c1697t;
        this.f5572b = c0412a;
        this.f5573c = c2113x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1681h)) {
            return false;
        }
        C1681h c1681h = (C1681h) obj;
        return this.f5571a.equals(c1681h.f5571a) && AbstractC1416l.m3825a(this.f5572b, c1681h.f5572b) && AbstractC1416l.m3825a(this.f5573c, c1681h.f5573c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f5571a.hashCode() * 31;
        C0412a c0412a = this.f5572b;
        int iHashCode2 = (iHashCode + (c0412a == null ? 0 : c0412a.hashCode())) * 31;
        C2113x c2113x = this.f5573c;
        return iHashCode2 + (c2113x != null ? c2113x.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PreparedSnapshot(snapshot=" + this.f5571a + ", emojiPayload=" + this.f5572b + ", voicePayload=" + this.f5573c + ")";
    }
}
