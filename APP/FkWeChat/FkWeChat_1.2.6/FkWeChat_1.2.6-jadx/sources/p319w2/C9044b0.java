package p319w2;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p030c3.AbstractC1314a;
import p104h3.C2852e;
import p104h3.C2853f;
import p104h3.C2855h;
import p104h3.C2857j;
import p104h3.C2859l;
import p104h3.C2866s;
import p104h3.C2868u;
import p121i3.C3193w;
import p319w2.C9058e;

/* JADX INFO: renamed from: w2.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9044b0 implements C9058e.a {

    /* JADX INFO: renamed from: a */
    public final int f31044a;

    /* JADX INFO: renamed from: b */
    public final int f31045b;

    /* JADX INFO: renamed from: c */
    public final long f31046c;

    /* JADX INFO: renamed from: d */
    public final C2866s f31047d;

    /* JADX INFO: renamed from: e */
    public final C9064f0 f31048e;

    /* JADX INFO: renamed from: f */
    public final C2855h f31049f;

    /* JADX INFO: renamed from: g */
    public final int f31050g;

    /* JADX INFO: renamed from: h */
    public final int f31051h;

    /* JADX INFO: renamed from: i */
    public final C2868u f31052i;

    public C9044b0(int i10, int i11, long j10, C2866s c2866s, C9064f0 c9064f0, C2855h c2855h, int i12, int i13, C2868u c2868u) {
        this.f31044a = i10;
        this.f31045b = i11;
        this.f31046c = j10;
        this.f31047d = c2866s;
        this.f31048e = c9064f0;
        this.f31049f = c2855h;
        this.f31050g = i12;
        this.f31051h = i13;
        this.f31052i = c2868u;
        if (C3193w.m12100e(j10, C3193w.f8489b.m12108a())) {
            return;
        }
        if (C3193w.m12103h(j10) >= 0.0f) {
            return;
        }
        AbstractC1314a.m5293c("lineHeight can't be negative (" + C3193w.m12103h(j10) + ')');
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9044b0 m35105b(C9044b0 c9044b0, int i10, int i11, long j10, C2866s c2866s, C9064f0 c9064f0, C2855h c2855h, int i12, int i13, C2868u c2868u, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c9044b0.f31044a;
        }
        if ((i14 & 2) != 0) {
            i11 = c9044b0.f31045b;
        }
        if ((i14 & 4) != 0) {
            j10 = c9044b0.f31046c;
        }
        if ((i14 & 8) != 0) {
            c2866s = c9044b0.f31047d;
        }
        if ((i14 & 16) != 0) {
            c9064f0 = c9044b0.f31048e;
        }
        if ((i14 & 32) != 0) {
            c2855h = c9044b0.f31049f;
        }
        if ((i14 & 64) != 0) {
            i12 = c9044b0.f31050g;
        }
        if ((i14 & 128) != 0) {
            i13 = c9044b0.f31051h;
        }
        if ((i14 & 256) != 0) {
            c2868u = c9044b0.f31052i;
        }
        int i15 = i13;
        C2868u c2868u2 = c2868u;
        long j11 = j10;
        return c9044b0.m35106a(i10, i11, j11, c2866s, c9064f0, c2855h, i12, i15, c2868u2);
    }

    /* JADX INFO: renamed from: a */
    public final C9044b0 m35106a(int i10, int i11, long j10, C2866s c2866s, C9064f0 c9064f0, C2855h c2855h, int i12, int i13, C2868u c2868u) {
        return new C9044b0(i10, i11, j10, c2866s, c9064f0, c2855h, i12, i13, c2868u, null);
    }

    /* JADX INFO: renamed from: c */
    public final int m35107c() {
        return this.f31051h;
    }

    /* JADX INFO: renamed from: d */
    public final int m35108d() {
        return this.f31050g;
    }

    /* JADX INFO: renamed from: e */
    public final long m35109e() {
        return this.f31046c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9044b0)) {
            return false;
        }
        C9044b0 c9044b0 = (C9044b0) obj;
        return C2857j.m10221k(this.f31044a, c9044b0.f31044a) && C2859l.m10250j(this.f31045b, c9044b0.f31045b) && C3193w.m12100e(this.f31046c, c9044b0.f31046c) && AbstractC1061t.m3842c(this.f31047d, c9044b0.f31047d) && AbstractC1061t.m3842c(this.f31048e, c9044b0.f31048e) && AbstractC1061t.m3842c(this.f31049f, c9044b0.f31049f) && C2853f.m10124f(this.f31050g, c9044b0.f31050g) && C2852e.m10112g(this.f31051h, c9044b0.f31051h) && AbstractC1061t.m3842c(this.f31052i, c9044b0.f31052i);
    }

    /* JADX INFO: renamed from: f */
    public final C2855h m35110f() {
        return this.f31049f;
    }

    /* JADX INFO: renamed from: g */
    public final C9064f0 m35111g() {
        return this.f31048e;
    }

    /* JADX INFO: renamed from: h */
    public final int m35112h() {
        return this.f31044a;
    }

    public int hashCode() {
        int iM10222l = ((((C2857j.m10222l(this.f31044a) * 31) + C2859l.m10251k(this.f31045b)) * 31) + C3193w.m12104i(this.f31046c)) * 31;
        C2866s c2866s = this.f31047d;
        int iHashCode = (iM10222l + (c2866s != null ? c2866s.hashCode() : 0)) * 31;
        C9064f0 c9064f0 = this.f31048e;
        int iHashCode2 = (iHashCode + (c9064f0 != null ? c9064f0.hashCode() : 0)) * 31;
        C2855h c2855h = this.f31049f;
        int iHashCode3 = (((((iHashCode2 + (c2855h != null ? c2855h.hashCode() : 0)) * 31) + C2853f.m10128j(this.f31050g)) * 31) + C2852e.m10113h(this.f31051h)) * 31;
        C2868u c2868u = this.f31052i;
        return iHashCode3 + (c2868u != null ? c2868u.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final int m35113i() {
        return this.f31045b;
    }

    /* JADX INFO: renamed from: j */
    public final C2866s m35114j() {
        return this.f31047d;
    }

    /* JADX INFO: renamed from: k */
    public final C2868u m35115k() {
        return this.f31052i;
    }

    /* JADX INFO: renamed from: l */
    public final C9044b0 m35116l(C9044b0 c9044b0) {
        return c9044b0 == null ? this : AbstractC9049c0.m35135a(this, c9044b0.f31044a, c9044b0.f31045b, c9044b0.f31046c, c9044b0.f31047d, c9044b0.f31048e, c9044b0.f31049f, c9044b0.f31050g, c9044b0.f31051h, c9044b0.f31052i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C2857j.m10223m(this.f31044a)) + ", textDirection=" + ((Object) C2859l.m10252l(this.f31045b)) + ", lineHeight=" + ((Object) C3193w.m12106k(this.f31046c)) + ", textIndent=" + this.f31047d + ", platformStyle=" + this.f31048e + ", lineHeightStyle=" + this.f31049f + ", lineBreak=" + ((Object) C2853f.m10129k(this.f31050g)) + ", hyphens=" + ((Object) C2852e.m10114i(this.f31051h)) + ", textMotion=" + this.f31052i + ')';
    }

    public /* synthetic */ C9044b0(int i10, int i11, long j10, C2866s c2866s, C9064f0 c9064f0, C2855h c2855h, int i12, int i13, C2868u c2868u, AbstractC1043k abstractC1043k) {
        this(i10, i11, j10, c2866s, c9064f0, c2855h, i12, i13, c2868u);
    }
}
