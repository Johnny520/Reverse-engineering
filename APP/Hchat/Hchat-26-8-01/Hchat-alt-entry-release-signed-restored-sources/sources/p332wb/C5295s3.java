package p332wb;

import gg.AbstractC1416l;
import p197n9.C2912a;

/* JADX INFO: renamed from: wb.s3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5295s3 extends AbstractC5394v3 {

    /* JADX INFO: renamed from: a */
    public final C2912a f20564a;

    /* JADX INFO: renamed from: b */
    public final boolean f20565b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5295s3(C2912a c2912a, boolean z9) {
        c2912a.getClass();
        this.f20564a = c2912a;
        this.f20565b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5295s3)) {
            return false;
        }
        C5295s3 c5295s3 = (C5295s3) obj;
        return AbstractC1416l.m3825a(this.f20564a, c5295s3.f20564a) && this.f20565b == c5295s3.f20565b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f20565b) + (this.f20564a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Editor(label=" + this.f20564a + ", existing=" + this.f20565b + ")";
    }
}
