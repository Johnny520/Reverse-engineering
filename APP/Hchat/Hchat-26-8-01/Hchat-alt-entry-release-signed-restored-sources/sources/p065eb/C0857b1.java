package p065eb;

import java.util.List;

/* JADX INFO: renamed from: eb.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0857b1 {

    /* JADX INFO: renamed from: a */
    public final String f2622a;

    /* JADX INFO: renamed from: b */
    public final List f2623b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0857b1(String str, List list) {
        this.f2622a = str;
        this.f2623b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0857b1)) {
            return false;
        }
        C0857b1 c0857b1 = (C0857b1) obj;
        return this.f2622a.equals(c0857b1.f2622a) && this.f2623b.equals(c0857b1.f2623b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2623b.hashCode() + (this.f2622a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParsedAtContent(content=" + this.f2622a + ", atList=" + this.f2623b + ")";
    }
}
