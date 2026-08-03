package p230p8;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: p8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3354f {

    /* JADX INFO: renamed from: a */
    public final boolean f10805a;

    /* JADX INFO: renamed from: b */
    public final Object f10806b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3354f(Object obj, boolean z9) {
        this.f10805a = z9;
        this.f10806b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3354f)) {
            return false;
        }
        C3354f c3354f = (C3354f) obj;
        return this.f10805a == c3354f.f10805a && AbstractC1416l.m3825a(this.f10806b, c3354f.f10806b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10805a) * 31;
        Object obj = this.f10806b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SnsCachedNativeLookup(querySucceeded=" + this.f10805a + ", nativeInfo=" + this.f10806b + ")";
    }
}
