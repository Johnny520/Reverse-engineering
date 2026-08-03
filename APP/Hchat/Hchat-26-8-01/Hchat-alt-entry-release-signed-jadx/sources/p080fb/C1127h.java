package p080fb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1127h {

    /* JADX INFO: renamed from: a */
    public final String f3688a;

    /* JADX INFO: renamed from: b */
    public final String f3689b;

    /* JADX INFO: renamed from: c */
    public final String f3690c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1127h(String str, String str2, String str3) {
        this.f3688a = str;
        this.f3689b = str2;
        this.f3690c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1127h)) {
            return false;
        }
        C1127h c1127h = (C1127h) obj;
        return this.f3688a.equals(c1127h.f3688a) && this.f3689b.equals(c1127h.f3689b) && this.f3690c.equals(c1127h.f3690c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3690c.hashCode() + AbstractC0921a.m2244g(this.f3688a.hashCode() * 31, 31, this.f3689b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("NativeToolBinding(protocolName=", this.f3688a, ", kind=", this.f3689b, ", originalName="), this.f3690c, ")");
    }
}
