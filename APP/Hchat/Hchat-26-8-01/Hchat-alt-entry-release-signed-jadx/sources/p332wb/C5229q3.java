package p332wb;

import gg.AbstractC1416l;
import p154k9.C2366j;

/* JADX INFO: renamed from: wb.q3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5229q3 {

    /* JADX INFO: renamed from: a */
    public final C2366j f20119a;

    /* JADX INFO: renamed from: b */
    public final C2366j f20120b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5229q3(C2366j c2366j, C2366j c2366j2) {
        c2366j2.getClass();
        this.f20119a = c2366j;
        this.f20120b = c2366j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C5229q3 m9737a(C5229q3 c5229q3, C2366j c2366j) {
        C2366j c2366j2 = c5229q3.f20119a;
        c5229q3.getClass();
        return new C5229q3(c2366j2, c2366j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5229q3)) {
            return false;
        }
        C5229q3 c5229q3 = (C5229q3) obj;
        return AbstractC1416l.m3825a(this.f20119a, c5229q3.f20119a) && AbstractC1416l.m3825a(this.f20120b, c5229q3.f20120b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2366j c2366j = this.f20119a;
        return this.f20120b.hashCode() + ((c2366j == null ? 0 : c2366j.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FloatingShortcutEditorRequest(original=" + this.f20119a + ", draft=" + this.f20120b + ")";
    }
}
