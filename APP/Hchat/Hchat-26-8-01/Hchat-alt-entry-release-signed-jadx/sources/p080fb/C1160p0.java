package p080fb;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1160p0 {

    /* JADX INFO: renamed from: a */
    public final C1168r0 f3850a;

    /* JADX INFO: renamed from: b */
    public final String f3851b;

    /* JADX INFO: renamed from: c */
    public final C1156o0 f3852c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1160p0(C1168r0 c1168r0, String str, C1156o0 c1156o0) {
        this.f3850a = c1168r0;
        this.f3851b = str;
        this.f3852c = c1156o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160p0)) {
            return false;
        }
        C1160p0 c1160p0 = (C1160p0) obj;
        return this.f3850a.equals(c1160p0.f3850a) && this.f3851b.equals(c1160p0.f3851b) && this.f3852c.equals(c1160p0.f3852c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3852c.hashCode() + AbstractC0921a.m2244g(this.f3850a.hashCode() * 31, 31, this.f3851b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Entry(server=" + this.f3850a + ", namespace=" + this.f3851b + ", client=" + this.f3852c + ")";
    }
}
