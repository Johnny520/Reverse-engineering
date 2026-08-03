package sh;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p071f1.C1034w;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: sh.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4015i {

    /* JADX INFO: renamed from: a */
    public final long f13144a;

    /* JADX INFO: renamed from: b */
    public final long f13145b;

    /* JADX INFO: renamed from: c */
    public final long f13146c;

    /* JADX INFO: renamed from: d */
    public final long f13147d;

    /* JADX INFO: renamed from: e */
    public final long f13148e;

    /* JADX INFO: renamed from: f */
    public final long f13149f;

    /* JADX INFO: renamed from: g */
    public final long f13150g;

    /* JADX INFO: renamed from: h */
    public final long f13151h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4015i(long j3, long j4, long j5, long j10, long j11, long j12, long j13, long j14) {
        this.f13144a = j3;
        this.f13145b = j4;
        this.f13146c = j5;
        this.f13147d = j10;
        this.f13148e = j11;
        this.f13149f = j12;
        this.f13150g = j13;
        this.f13151h = j14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4015i)) {
            return false;
        }
        C4015i c4015i = (C4015i) obj;
        return C1034w.m2635c(this.f13144a, c4015i.f13144a) && C1034w.m2635c(this.f13145b, c4015i.f13145b) && C1034w.m2635c(this.f13146c, c4015i.f13146c) && C1034w.m2635c(this.f13147d, c4015i.f13147d) && C1034w.m2635c(this.f13148e, c4015i.f13148e) && C1034w.m2635c(this.f13149f, c4015i.f13149f) && C1034w.m2635c(this.f13150g, c4015i.f13150g) && C1034w.m2635c(this.f13151h, c4015i.f13151h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13151h) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f13144a) * 31, 31, this.f13145b), 31, this.f13146c), 31, this.f13147d), 31, this.f13148e), 31, this.f13149f), 31, this.f13150g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2641i = C1034w.m2641i(this.f13144a);
        String strM2641i2 = C1034w.m2641i(this.f13145b);
        String strM2641i3 = C1034w.m2641i(this.f13146c);
        String strM2641i4 = C1034w.m2641i(this.f13147d);
        String strM2641i5 = C1034w.m2641i(this.f13148e);
        String strM2641i6 = C1034w.m2641i(this.f13149f);
        String strM2641i7 = C1034w.m2641i(this.f13150g);
        String strM2641i8 = C1034w.m2641i(this.f13151h);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("CheckboxColors(checkedForegroundColor=", strM2641i, ", uncheckedForegroundColor=", strM2641i2, ", disabledCheckedForegroundColor=");
        AbstractC2091b.m5173t(sbM1027p, strM2641i3, ", disabledUncheckedForegroundColor=", strM2641i4, ", checkedBackgroundColor=");
        AbstractC2091b.m5173t(sbM1027p, strM2641i5, ", uncheckedBackgroundColor=", strM2641i6, ", disabledCheckedBackgroundColor=");
        return AbstractC2091b.m5164k(sbM1027p, strM2641i7, ", disabledUncheckedBackgroundColor=", strM2641i8, ")");
    }
}
