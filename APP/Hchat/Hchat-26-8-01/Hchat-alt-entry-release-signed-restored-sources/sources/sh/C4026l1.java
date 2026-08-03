package sh;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p071f1.C1034w;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: sh.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4026l1 {

    /* JADX INFO: renamed from: a */
    public final long f13235a;

    /* JADX INFO: renamed from: b */
    public final long f13236b;

    /* JADX INFO: renamed from: c */
    public final long f13237c;

    /* JADX INFO: renamed from: d */
    public final long f13238d;

    /* JADX INFO: renamed from: e */
    public final long f13239e;

    /* JADX INFO: renamed from: f */
    public final long f13240f;

    /* JADX INFO: renamed from: g */
    public final long f13241g;

    /* JADX INFO: renamed from: h */
    public final long f13242h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4026l1(long j3, long j4, long j5, long j10, long j11, long j12, long j13, long j14) {
        this.f13235a = j3;
        this.f13236b = j4;
        this.f13237c = j5;
        this.f13238d = j10;
        this.f13239e = j11;
        this.f13240f = j12;
        this.f13241g = j13;
        this.f13242h = j14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4026l1)) {
            return false;
        }
        C4026l1 c4026l1 = (C4026l1) obj;
        return C1034w.m2635c(this.f13235a, c4026l1.f13235a) && C1034w.m2635c(this.f13236b, c4026l1.f13236b) && C1034w.m2635c(this.f13237c, c4026l1.f13237c) && C1034w.m2635c(this.f13238d, c4026l1.f13238d) && C1034w.m2635c(this.f13239e, c4026l1.f13239e) && C1034w.m2635c(this.f13240f, c4026l1.f13240f) && C1034w.m2635c(this.f13241g, c4026l1.f13241g) && C1034w.m2635c(this.f13242h, c4026l1.f13242h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13242h) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f13235a) * 31, 31, this.f13236b), 31, this.f13237c), 31, this.f13238d), 31, this.f13239e), 31, this.f13240f), 31, this.f13241g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2641i = C1034w.m2641i(this.f13235a);
        String strM2641i2 = C1034w.m2641i(this.f13236b);
        String strM2641i3 = C1034w.m2641i(this.f13237c);
        String strM2641i4 = C1034w.m2641i(this.f13238d);
        String strM2641i5 = C1034w.m2641i(this.f13239e);
        String strM2641i6 = C1034w.m2641i(this.f13240f);
        String strM2641i7 = C1034w.m2641i(this.f13241g);
        String strM2641i8 = C1034w.m2641i(this.f13242h);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("SwitchColors(checkedThumbColor=", strM2641i, ", uncheckedThumbColor=", strM2641i2, ", disabledCheckedThumbColor=");
        AbstractC2091b.m5173t(sbM1027p, strM2641i3, ", disabledUncheckedThumbColor=", strM2641i4, ", checkedTrackColor=");
        AbstractC2091b.m5173t(sbM1027p, strM2641i5, ", uncheckedTrackColor=", strM2641i6, ", disabledCheckedTrackColor=");
        return AbstractC2091b.m5164k(sbM1027p, strM2641i7, ", disabledUncheckedTrackColor=", strM2641i8, ")");
    }
}
