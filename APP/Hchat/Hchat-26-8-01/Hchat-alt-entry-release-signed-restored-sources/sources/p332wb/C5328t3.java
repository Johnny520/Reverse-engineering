package p332wb;

import gg.AbstractC1416l;
import p197n9.C2912a;

/* JADX INFO: renamed from: wb.t3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5328t3 extends AbstractC5394v3 {

    /* JADX INFO: renamed from: a */
    public final C2912a f20743a;

    /* JADX INFO: renamed from: b */
    public final boolean f20744b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5328t3(C2912a c2912a, boolean z9) {
        c2912a.getClass();
        this.f20743a = c2912a;
        this.f20744b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5328t3)) {
            return false;
        }
        C5328t3 c5328t3 = (C5328t3) obj;
        return AbstractC1416l.m3825a(this.f20743a, c5328t3.f20743a) && this.f20744b == c5328t3.f20744b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f20744b) + (this.f20743a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "GroupPicker(label=" + this.f20743a + ", existing=" + this.f20744b + ")";
    }
}
