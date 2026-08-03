package p080fb;

import java.util.List;

/* JADX INFO: renamed from: fb.r2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1170r2 {

    /* JADX INFO: renamed from: a */
    public final boolean f3904a;

    /* JADX INFO: renamed from: b */
    public final Object f3905b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1170r2(List list, boolean z9) {
        this.f3904a = z9;
        this.f3905b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170r2)) {
            return false;
        }
        C1170r2 c1170r2 = (C1170r2) obj;
        return this.f3904a == c1170r2.f3904a && this.f3905b.equals(c1170r2.f3905b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3905b.hashCode() + (Boolean.hashCode(this.f3904a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TreeReplacementProbe(success=" + this.f3904a + ", issues=" + this.f3905b + ")";
    }
}
