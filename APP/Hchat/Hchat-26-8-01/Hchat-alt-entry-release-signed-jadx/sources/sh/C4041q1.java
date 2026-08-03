package sh;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p071f1.C1034w;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: sh.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4041q1 {

    /* JADX INFO: renamed from: a */
    public final long f13335a;

    /* JADX INFO: renamed from: b */
    public final long f13336b;

    /* JADX INFO: renamed from: c */
    public final long f13337c;

    /* JADX INFO: renamed from: d */
    public final long f13338d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4041q1(long j3, long j4, long j5, long j10) {
        this.f13335a = j3;
        this.f13336b = j4;
        this.f13337c = j5;
        this.f13338d = j10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4041q1)) {
            return false;
        }
        C4041q1 c4041q1 = (C4041q1) obj;
        return C1034w.m2635c(this.f13335a, c4041q1.f13335a) && C1034w.m2635c(this.f13336b, c4041q1.f13336b) && C1034w.m2635c(this.f13337c, c4041q1.f13337c) && C1034w.m2635c(this.f13338d, c4041q1.f13338d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13338d) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f13335a) * 31, 31, this.f13336b), 31, this.f13337c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2641i = C1034w.m2641i(this.f13335a);
        String strM2641i2 = C1034w.m2641i(this.f13336b);
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("TextButtonColors(color=", strM2641i, ", disabledColor=", strM2641i2, ", textColor="), C1034w.m2641i(this.f13337c), ", disabledTextColor=", C1034w.m2641i(this.f13338d), ")");
    }
}
