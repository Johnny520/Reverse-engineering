package sh;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p071f1.C1034w;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: sh.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4043r0 {

    /* JADX INFO: renamed from: a */
    public final long f13340a;

    /* JADX INFO: renamed from: b */
    public final long f13341b;

    /* JADX INFO: renamed from: c */
    public final long f13342c;

    /* JADX INFO: renamed from: d */
    public final long f13343d;

    /* JADX INFO: renamed from: e */
    public final long f13344e;

    /* JADX INFO: renamed from: f */
    public final long f13345f;

    /* JADX INFO: renamed from: g */
    public final long f13346g;

    /* JADX INFO: renamed from: h */
    public final long f13347h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4043r0(long j3, long j4, long j5, long j10, long j11, long j12, long j13, long j14) {
        this.f13340a = j3;
        this.f13341b = j4;
        this.f13342c = j5;
        this.f13343d = j10;
        this.f13344e = j11;
        this.f13345f = j12;
        this.f13346g = j13;
        this.f13347h = j14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4043r0)) {
            return false;
        }
        C4043r0 c4043r0 = (C4043r0) obj;
        return C1034w.m2635c(this.f13340a, c4043r0.f13340a) && C1034w.m2635c(this.f13341b, c4043r0.f13341b) && C1034w.m2635c(this.f13342c, c4043r0.f13342c) && C1034w.m2635c(this.f13343d, c4043r0.f13343d) && C1034w.m2635c(this.f13344e, c4043r0.f13344e) && C1034w.m2635c(this.f13345f, c4043r0.f13345f) && C1034w.m2635c(this.f13346g, c4043r0.f13346g) && C1034w.m2635c(this.f13347h, c4043r0.f13347h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f13347h) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f13340a) * 31, 31, this.f13341b), 31, this.f13342c), 31, this.f13343d), 31, this.f13344e), 31, this.f13345f), 31, this.f13346g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2641i = C1034w.m2641i(this.f13340a);
        String strM2641i2 = C1034w.m2641i(this.f13341b);
        String strM2641i3 = C1034w.m2641i(this.f13342c);
        String strM2641i4 = C1034w.m2641i(this.f13343d);
        String strM2641i5 = C1034w.m2641i(this.f13344e);
        String strM2641i6 = C1034w.m2641i(this.f13345f);
        String strM2641i7 = C1034w.m2641i(this.f13346g);
        String strM2641i8 = C1034w.m2641i(this.f13347h);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("SliderColors(foregroundColor=", strM2641i, ", disabledForegroundColor=", strM2641i2, ", backgroundColor=");
        AbstractC2091b.m5173t(sbM1027p, strM2641i3, ", disabledBackgroundColor=", strM2641i4, ", thumbColor=");
        AbstractC2091b.m5173t(sbM1027p, strM2641i5, ", disabledThumbColor=", strM2641i6, ", keyPointColor=");
        return AbstractC2091b.m5164k(sbM1027p, strM2641i7, ", keyPointForegroundColor=", strM2641i8, ")");
    }
}
