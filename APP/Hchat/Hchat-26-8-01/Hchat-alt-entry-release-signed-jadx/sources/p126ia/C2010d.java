package p126ia;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: ia.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2010d {

    /* JADX INFO: renamed from: a */
    public final String f6782a;

    /* JADX INFO: renamed from: b */
    public final String f6783b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2010d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f6782a = str;
        this.f6783b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2010d)) {
            return false;
        }
        C2010d c2010d = (C2010d) obj;
        return AbstractC1416l.m3825a(this.f6782a, c2010d.f6782a) && AbstractC1416l.m3825a(this.f6783b, c2010d.f6783b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6783b.hashCode() + (this.f6782a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("FakeSnsLike(wxId=", this.f6782a, ", displayName=", this.f6783b, ")");
    }
}
