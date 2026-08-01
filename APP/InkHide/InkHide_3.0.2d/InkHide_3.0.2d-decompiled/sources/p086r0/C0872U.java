package p086r0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0872U {

    /* JADX INFO: renamed from: a */
    public final int f3002a;

    /* JADX INFO: renamed from: b */
    public final Integer f3003b;

    /* JADX INFO: renamed from: c */
    public final Integer f3004c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0872U(int i2, Integer num, Integer num2) {
        this.f3002a = i2;
        this.f3003b = num;
        this.f3004c = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0872U)) {
            return false;
        }
        C0872U c0872u = (C0872U) obj;
        return this.f3002a == c0872u.f3002a && AbstractC0223g.m414a(this.f3003b, c0872u.f3003b) && AbstractC0223g.m414a(this.f3004c, c0872u.f3004c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3002a) * 31;
        Integer num = this.f3003b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3004c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HiddenRowState(visibility=" + this.f3002a + ", width=" + this.f3003b + ", height=" + this.f3004c + ")";
    }
}
