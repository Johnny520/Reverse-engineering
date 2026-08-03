package p080fb;

import p150k5.C2264o;
import p150k5.C2270u;

/* JADX INFO: renamed from: fb.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1133i1 {

    /* JADX INFO: renamed from: a */
    public final String f3708a;

    /* JADX INFO: renamed from: b */
    public final C2270u f3709b;

    /* JADX INFO: renamed from: c */
    public final C2264o f3710c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1133i1(String str, C2270u c2270u, C2264o c2264o) {
        this.f3708a = str;
        this.f3709b = c2270u;
        this.f3710c = c2264o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1133i1)) {
            return false;
        }
        C1133i1 c1133i1 = (C1133i1) obj;
        return this.f3708a.equals(c1133i1.f3708a) && this.f3709b.equals(c1133i1.f3709b) && this.f3710c.equals(c1133i1.f3710c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3710c.hashCode() + ((this.f3709b.hashCode() + (this.f3708a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LocatedClass(entryName=" + this.f3708a + ", dex=" + this.f3709b + ", classDef=" + ((Object) this.f3710c) + ")";
    }
}
