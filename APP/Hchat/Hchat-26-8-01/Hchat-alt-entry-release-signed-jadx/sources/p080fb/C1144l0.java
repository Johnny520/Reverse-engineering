package p080fb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: fb.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1144l0 {

    /* JADX INFO: renamed from: a */
    public final String f3773a;

    /* JADX INFO: renamed from: b */
    public final String f3774b;

    /* JADX INFO: renamed from: c */
    public final boolean f3775c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1144l0(String str, String str2, boolean z9) {
        this.f3773a = str;
        this.f3774b = str2;
        this.f3775c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144l0)) {
            return false;
        }
        C1144l0 c1144l0 = (C1144l0) obj;
        return this.f3773a.equals(c1144l0.f3773a) && this.f3774b.equals(c1144l0.f3774b) && this.f3775c == c1144l0.f3775c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3775c) + AbstractC0921a.m2244g(this.f3773a.hashCode() * 31, 31, this.f3774b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3199a.m6840m(")", AbstractC0255e.m1027p("ResourceValue(value=", this.f3773a, ", qualifiers=", this.f3774b, ", defaultValue="), this.f3775c);
    }
}
