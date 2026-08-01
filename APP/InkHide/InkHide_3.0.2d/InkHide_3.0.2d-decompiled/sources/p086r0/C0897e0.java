package p086r0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0897e0 {

    /* JADX INFO: renamed from: a */
    public final int f3155a;

    /* JADX INFO: renamed from: b */
    public final Integer f3156b;

    /* JADX INFO: renamed from: c */
    public final Integer f3157c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0897e0(int i2, Integer num, Integer num2) {
        this.f3155a = i2;
        this.f3156b = num;
        this.f3157c = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0897e0)) {
            return false;
        }
        C0897e0 c0897e0 = (C0897e0) obj;
        return this.f3155a == c0897e0.f3155a && AbstractC0223g.m414a(this.f3156b, c0897e0.f3156b) && AbstractC0223g.m414a(this.f3157c, c0897e0.f3157c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3155a) * 31;
        Integer num = this.f3156b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3157c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HiddenRowState(visibility=" + this.f3155a + ", width=" + this.f3156b + ", height=" + this.f3157c + ")";
    }
}
