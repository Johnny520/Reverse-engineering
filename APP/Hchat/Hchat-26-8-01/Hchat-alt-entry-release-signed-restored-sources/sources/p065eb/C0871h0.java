package p065eb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: eb.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0871h0 {

    /* JADX INFO: renamed from: a */
    public final Object f2671a;

    /* JADX INFO: renamed from: b */
    public final String f2672b;

    /* JADX INFO: renamed from: c */
    public final String f2673c;

    /* JADX INFO: renamed from: d */
    public final int f2674d;

    /* JADX INFO: renamed from: e */
    public final int f2675e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0871h0(Object obj, String str, String str2, int i9, int i10) {
        str.getClass();
        str2.getClass();
        this.f2671a = obj;
        this.f2672b = str;
        this.f2673c = str2;
        this.f2674d = i9;
        this.f2675e = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0871h0)) {
            return false;
        }
        C0871h0 c0871h0 = (C0871h0) obj;
        return this.f2671a.equals(c0871h0.f2671a) && AbstractC1416l.m3825a(this.f2672b, c0871h0.f2672b) && AbstractC1416l.m3825a(this.f2673c, c0871h0.f2673c) && this.f2674d == c0871h0.f2674d && this.f2675e == c0871h0.f2675e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2675e) + AbstractC0921a.m2242e(this.f2674d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f2671a.hashCode() * 31, 31, this.f2672b), 31, this.f2673c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppliedTextDecoration(input=");
        sb2.append(this.f2671a);
        sb2.append(", originalText=");
        sb2.append(this.f2672b);
        sb2.append(", decoratedText=");
        sb2.append(this.f2673c);
        sb2.append(", prefixLength=");
        sb2.append(this.f2674d);
        sb2.append(", suffixLength=");
        return AbstractC2091b.m5163j(sb2, this.f2675e, ")");
    }
}
