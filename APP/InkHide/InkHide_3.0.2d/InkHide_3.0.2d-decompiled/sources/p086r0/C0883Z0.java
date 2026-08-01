package p086r0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0883Z0 {

    /* JADX INFO: renamed from: a */
    public final int f3056a;

    /* JADX INFO: renamed from: b */
    public final Integer f3057b;

    /* JADX INFO: renamed from: c */
    public final Integer f3058c;

    /* JADX INFO: renamed from: d */
    public final int f3059d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0883Z0(int i2, Integer num, Integer num2, int i3) {
        this.f3056a = i2;
        this.f3057b = num;
        this.f3058c = num2;
        this.f3059d = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0883Z0)) {
            return false;
        }
        C0883Z0 c0883z0 = (C0883Z0) obj;
        return this.f3056a == c0883z0.f3056a && AbstractC0223g.m414a(this.f3057b, c0883z0.f3057b) && AbstractC0223g.m414a(this.f3058c, c0883z0.f3058c) && this.f3059d == c0883z0.f3059d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3056a) * 31;
        Integer num = this.f3057b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3058c;
        return Integer.hashCode(this.f3059d) + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HiddenRowState(visibility=" + this.f3056a + ", width=" + this.f3057b + ", height=" + this.f3058c + ", minimumHeight=" + this.f3059d + ")";
    }
}
