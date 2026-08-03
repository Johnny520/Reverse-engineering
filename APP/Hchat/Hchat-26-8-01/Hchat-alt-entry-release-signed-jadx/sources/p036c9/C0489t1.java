package p036c9;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: c9.t1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0489t1 {

    /* JADX INFO: renamed from: a */
    public final int f1472a;

    /* JADX INFO: renamed from: b */
    public final int f1473b;

    /* JADX INFO: renamed from: c */
    public final C0486s1 f1474c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0489t1(int i9, int i10, C0486s1 c0486s1) {
        this.f1472a = i9;
        this.f1473b = i10;
        this.f1474c = c0486s1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0489t1)) {
            return false;
        }
        C0489t1 c0489t1 = (C0489t1) obj;
        return this.f1472a == c0489t1.f1472a && this.f1473b == c0489t1.f1473b && AbstractC1416l.m3825a(this.f1474c, c0489t1.f1474c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f1473b, Integer.hashCode(this.f1472a) * 31, 31);
        C0486s1 c0486s1 = this.f1474c;
        return iM2242e + (c0486s1 == null ? 0 : c0486s1.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2256s = AbstractC0921a.m2256s(this.f1472a, this.f1473b, "GroupSnapshot(totalConversations=", ", unreadCount=", ", latest=");
        sbM2256s.append(this.f1474c);
        sbM2256s.append(")");
        return sbM2256s.toString();
    }
}
