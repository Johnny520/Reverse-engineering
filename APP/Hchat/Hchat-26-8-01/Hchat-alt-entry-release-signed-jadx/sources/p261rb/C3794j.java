package p261rb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: rb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3794j {

    /* JADX INFO: renamed from: a */
    public final String f12439a;

    /* JADX INFO: renamed from: b */
    public final int f12440b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3794j(String str, int i9) {
        str.getClass();
        this.f12439a = str;
        this.f12440b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3794j)) {
            return false;
        }
        C3794j c3794j = (C3794j) obj;
        return AbstractC1416l.m3825a(this.f12439a, c3794j.f12439a) && this.f12440b == c3794j.f12440b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f12440b) + (this.f12439a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "QueueItem(wxid=" + this.f12439a + ", attempt=" + this.f12440b + ")";
    }
}
