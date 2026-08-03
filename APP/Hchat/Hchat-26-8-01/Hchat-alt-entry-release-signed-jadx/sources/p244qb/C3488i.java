package p244qb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: qb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3488i {

    /* JADX INFO: renamed from: a */
    public final String f11325a;

    /* JADX INFO: renamed from: b */
    public final int f11326b;

    /* JADX INFO: renamed from: c */
    public final boolean f11327c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3488i(String str, int i9, boolean z9) {
        this.f11325a = str;
        this.f11326b = i9;
        this.f11327c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3488i)) {
            return false;
        }
        C3488i c3488i = (C3488i) obj;
        return AbstractC1416l.m3825a(this.f11325a, c3488i.f11325a) && this.f11326b == c3488i.f11326b && this.f11327c == c3488i.f11327c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f11327c) + AbstractC0921a.m2242e(this.f11326b, this.f11325a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3199a.m6840m(")", AbstractC0921a.m2258u(this.f11326b, "VoiceSource(path=", this.f11325a, ", durationMillis=", ", deleteAfterUse="), this.f11327c);
    }
}
