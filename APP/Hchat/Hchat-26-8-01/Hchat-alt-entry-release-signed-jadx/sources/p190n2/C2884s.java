package p190n2;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1939m0;

/* JADX INFO: renamed from: n2.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2884s {

    /* JADX INFO: renamed from: a */
    public final C1926g f9316a;

    /* JADX INFO: renamed from: b */
    public final long f9317b;

    /* JADX INFO: renamed from: c */
    public final C1939m0 f9318c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2884s(C1926g c1926g, long j3, C1939m0 c1939m0) {
        C1939m0 c1939m02;
        this.f9316a = c1926g;
        this.f9317b = AbstractC1923e0.m4785c(c1926g.f6529h.length(), j3);
        if (c1939m0 != null) {
            c1939m02 = new C1939m0(AbstractC1923e0.m4785c(c1926g.f6529h.length(), c1939m0.f6575a));
        } else {
            c1939m02 = null;
        }
        this.f9318c = c1939m02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2884s m6290a(C2884s c2884s, C1926g c1926g, long j3, int i9) {
        if ((i9 & 1) != 0) {
            c1926g = c2884s.f9316a;
        }
        if ((i9 & 2) != 0) {
            j3 = c2884s.f9317b;
        }
        C1939m0 c1939m0 = (i9 & 4) != 0 ? c2884s.f9318c : null;
        c2884s.getClass();
        return new C2884s(c1926g, j3, c1939m0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2884s)) {
            return false;
        }
        C2884s c2884s = (C2884s) obj;
        return C1939m0.m4812b(this.f9317b, c2884s.f9317b) && AbstractC1416l.m3825a(this.f9318c, c2884s.f9318c) && AbstractC1416l.m3825a(this.f9316a, c2884s.f9316a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f9316a.hashCode() * 31;
        int i9 = C1939m0.f6574c;
        int iM2243f = AbstractC0921a.m2243f(iHashCode, 31, this.f9317b);
        C1939m0 c1939m0 = this.f9318c;
        return iM2243f + (c1939m0 != null ? Long.hashCode(c1939m0.f6575a) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f9316a) + "', selection=" + ((Object) C1939m0.m4818h(this.f9317b)) + ", composition=" + this.f9318c + ')';
    }

    public C2884s(int i9, String str, long j3) {
        this(new C1926g((i9 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str), (i9 & 2) != 0 ? C1939m0.f6573b : j3, (C1939m0) null);
    }
}
