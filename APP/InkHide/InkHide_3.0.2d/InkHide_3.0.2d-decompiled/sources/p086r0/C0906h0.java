package p086r0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906h0 {

    /* JADX INFO: renamed from: a */
    public final int f3199a;

    /* JADX INFO: renamed from: b */
    public final Integer f3200b;

    /* JADX INFO: renamed from: c */
    public final Integer f3201c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0906h0(int i2, Integer num, Integer num2) {
        this.f3199a = i2;
        this.f3200b = num;
        this.f3201c = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0906h0)) {
            return false;
        }
        C0906h0 c0906h0 = (C0906h0) obj;
        return this.f3199a == c0906h0.f3199a && AbstractC0223g.m414a(this.f3200b, c0906h0.f3200b) && AbstractC0223g.m414a(this.f3201c, c0906h0.f3201c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3199a) * 31;
        Integer num = this.f3200b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3201c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HiddenRowState(visibility=" + this.f3199a + ", width=" + this.f3200b + ", height=" + this.f3201c + ")";
    }
}
