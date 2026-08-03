package p080fb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: fb.m2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1150m2 {

    /* JADX INFO: renamed from: a */
    public final String f3789a;

    /* JADX INFO: renamed from: b */
    public final boolean f3790b;

    /* JADX INFO: renamed from: c */
    public final String f3791c;

    /* JADX INFO: renamed from: d */
    public final boolean f3792d;

    /* JADX INFO: renamed from: e */
    public final boolean f3793e;

    /* JADX INFO: renamed from: f */
    public final boolean f3794f;

    /* JADX INFO: renamed from: g */
    public final boolean f3795g;

    /* JADX INFO: renamed from: h */
    public final boolean f3796h;

    /* JADX INFO: renamed from: i */
    public final boolean f3797i;

    /* JADX INFO: renamed from: j */
    public final boolean f3798j;

    /* JADX INFO: renamed from: k */
    public final boolean f3799k;

    /* JADX INFO: renamed from: l */
    public final String f3800l;

    /* JADX INFO: renamed from: m */
    public final Integer f3801m;

    /* JADX INFO: renamed from: n */
    public final Integer f3802n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1150m2(String str, boolean z9, String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str3, Integer num, Integer num2) {
        this.f3789a = str;
        this.f3790b = z9;
        this.f3791c = str2;
        this.f3792d = z10;
        this.f3793e = z11;
        this.f3794f = z12;
        this.f3795g = z13;
        this.f3796h = z14;
        this.f3797i = z15;
        this.f3798j = z16;
        this.f3799k = z17;
        this.f3800l = str3;
        this.f3801m = num;
        this.f3802n = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150m2)) {
            return false;
        }
        C1150m2 c1150m2 = (C1150m2) obj;
        return this.f3789a.equals(c1150m2.f3789a) && this.f3790b == c1150m2.f3790b && this.f3791c.equals(c1150m2.f3791c) && this.f3792d == c1150m2.f3792d && this.f3793e == c1150m2.f3793e && this.f3794f == c1150m2.f3794f && this.f3795g == c1150m2.f3795g && this.f3796h == c1150m2.f3796h && this.f3797i == c1150m2.f3797i && this.f3798j == c1150m2.f3798j && this.f3799k == c1150m2.f3799k && this.f3800l.equals(c1150m2.f3800l) && AbstractC1416l.m3825a(this.f3801m, c1150m2.f3801m) && AbstractC1416l.m3825a(this.f3802n, c1150m2.f3802n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2245h(this.f3789a.hashCode() * 31, 31, this.f3790b), 31, this.f3791c), 31, this.f3792d), 31, this.f3793e), 31, this.f3794f), 31, this.f3795g), 31, this.f3796h), 31, this.f3797i), 31, this.f3798j), 31, this.f3799k), 31, this.f3800l);
        Integer num = this.f3801m;
        int iHashCode = (iM2244g + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3802n;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessState(path=");
        sb2.append(this.f3789a);
        sb2.append(", exists=");
        sb2.append(this.f3790b);
        sb2.append(", type=");
        sb2.append(this.f3791c);
        sb2.append(", readable=");
        sb2.append(this.f3792d);
        sb2.append(", writable=");
        AbstractC3199a.m6851x(sb2, this.f3793e, ", executable=", this.f3794f, ", symbolicLink=");
        AbstractC3199a.m6851x(sb2, this.f3795g, ", parentWritable=", this.f3796h, ", replaceable=");
        AbstractC3199a.m6851x(sb2, this.f3797i, ", workspaceReadable=", this.f3798j, ", modifiable=");
        sb2.append(this.f3799k);
        sb2.append(", mode=");
        sb2.append(this.f3800l);
        sb2.append(", ownerUid=");
        sb2.append(this.f3801m);
        sb2.append(", ownerGid=");
        sb2.append(this.f3802n);
        sb2.append(")");
        return sb2.toString();
    }
}
