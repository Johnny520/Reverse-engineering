package p126ia;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: ia.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2013g {

    /* JADX INFO: renamed from: a */
    public final int f6789a;

    /* JADX INFO: renamed from: b */
    public final String f6790b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2013g(int i9, String str) {
        str.getClass();
        this.f6789a = i9;
        this.f6790b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2013g)) {
            return false;
        }
        C2013g c2013g = (C2013g) obj;
        return this.f6789a == c2013g.f6789a && AbstractC1416l.m3825a(this.f6790b, c2013g.f6790b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6790b.hashCode() + (Integer.hashCode(this.f6789a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LikeKey(commentId=" + this.f6789a + ", username=" + this.f6790b + ")";
    }
}
