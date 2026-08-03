package p100h0;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: h0.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1554v {

    /* JADX INFO: renamed from: a */
    public final C1552u f5184a;

    /* JADX INFO: renamed from: b */
    public final C1552u f5185b;

    /* JADX INFO: renamed from: c */
    public final boolean f5186c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1554v(C1552u c1552u, C1552u c1552u2, boolean z9) {
        this.f5184a = c1552u;
        this.f5185b = c1552u2;
        this.f5186c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1554v m4068a(C1554v c1554v, C1552u c1552u, C1552u c1552u2, boolean z9, int i9) {
        if ((i9 & 1) != 0) {
            c1552u = c1554v.f5184a;
        }
        if ((i9 & 2) != 0) {
            c1552u2 = c1554v.f5185b;
        }
        c1554v.getClass();
        return new C1554v(c1552u, c1552u2, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1554v)) {
            return false;
        }
        C1554v c1554v = (C1554v) obj;
        return AbstractC1416l.m3825a(this.f5184a, c1554v.f5184a) && AbstractC1416l.m3825a(this.f5185b, c1554v.f5185b) && this.f5186c == c1554v.f5186c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f5186c) + ((this.f5185b.hashCode() + (this.f5184a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Selection(start=" + this.f5184a + ", end=" + this.f5185b + ", handlesCrossed=" + this.f5186c + ')';
    }
}
