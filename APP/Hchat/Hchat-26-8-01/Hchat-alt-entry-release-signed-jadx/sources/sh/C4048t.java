package sh;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p071f1.C1034w;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: sh.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4048t {

    /* JADX INFO: renamed from: a */
    public final long f13376a;

    /* JADX INFO: renamed from: b */
    public final long f13377b;

    /* JADX INFO: renamed from: c */
    public final long f13378c;

    /* JADX INFO: renamed from: d */
    public final long f13379d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4048t(long j3, long j4, long j5, long j10) {
        this.f13376a = j3;
        this.f13377b = j4;
        this.f13378c = j5;
        this.f13379d = j10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4048t)) {
            return false;
        }
        C4048t c4048t = (C4048t) obj;
        return C1034w.m2635c(this.f13376a, c4048t.f13376a) && C1034w.m2635c(this.f13377b, c4048t.f13377b) && C1034w.m2635c(this.f13378c, c4048t.f13378c) && C1034w.m2635c(this.f13379d, c4048t.f13379d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13379d) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f13376a) * 31, 31, this.f13377b), 31, this.f13378c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2641i = C1034w.m2641i(this.f13376a);
        String strM2641i2 = C1034w.m2641i(this.f13377b);
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("DropdownColors(contentColor=", strM2641i, ", containerColor=", strM2641i2, ", selectedContentColor="), C1034w.m2641i(this.f13378c), ", selectedContainerColor=", C1034w.m2641i(this.f13379d), ")");
    }
}
