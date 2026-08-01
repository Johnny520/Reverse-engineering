package p086r0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0825B1 {

    /* JADX INFO: renamed from: a */
    public final int f2746a;

    /* JADX INFO: renamed from: b */
    public final Integer f2747b;

    /* JADX INFO: renamed from: c */
    public final Integer f2748c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0825B1(int i2, Integer num, Integer num2) {
        this.f2746a = i2;
        this.f2747b = num;
        this.f2748c = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0825B1)) {
            return false;
        }
        C0825B1 c0825b1 = (C0825B1) obj;
        return this.f2746a == c0825b1.f2746a && AbstractC0223g.m414a(this.f2747b, c0825b1.f2747b) && AbstractC0223g.m414a(this.f2748c, c0825b1.f2748c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f2746a) * 31;
        Integer num = this.f2747b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f2748c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HiddenRowState(visibility=" + this.f2746a + ", width=" + this.f2747b + ", height=" + this.f2748c + ")";
    }
}
