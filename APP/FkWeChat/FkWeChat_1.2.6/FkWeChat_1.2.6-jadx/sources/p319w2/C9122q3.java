package p319w2;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p104h3.EnumC2856i;
import p121i3.C3189s;
import p250r1.C6457g;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: w2.q3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9122q3 {

    /* JADX INFO: renamed from: g */
    public static final int f31183g = 8;

    /* JADX INFO: renamed from: a */
    public final C9117p3 f31184a;

    /* JADX INFO: renamed from: b */
    public final C9103n f31185b;

    /* JADX INFO: renamed from: c */
    public final long f31186c;

    /* JADX INFO: renamed from: d */
    public final float f31187d;

    /* JADX INFO: renamed from: e */
    public final float f31188e;

    /* JADX INFO: renamed from: f */
    public final List f31189f;

    public C9122q3(C9117p3 c9117p3, C9103n c9103n, long j10) {
        this.f31184a = c9117p3;
        this.f31185b = c9103n;
        this.f31186c = j10;
        this.f31187d = c9103n.m35339i();
        this.f31188e = c9103n.m35343m();
        this.f31189f = c9103n.m35324D();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9122q3 m35378b(C9122q3 c9122q3, C9117p3 c9117p3, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c9117p3 = c9122q3.f31184a;
        }
        if ((i10 & 2) != 0) {
            j10 = c9122q3.f31186c;
        }
        return c9122q3.m35383a(c9117p3, j10);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m35379p(C9122q3 c9122q3, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return c9122q3.m35396o(i10, z10);
    }

    /* JADX INFO: renamed from: A */
    public final List m35380A() {
        return this.f31189f;
    }

    /* JADX INFO: renamed from: B */
    public final long m35381B() {
        return this.f31186c;
    }

    /* JADX INFO: renamed from: C */
    public final long m35382C(int i10) {
        return this.f31185b.m35327G(i10);
    }

    /* JADX INFO: renamed from: a */
    public final C9122q3 m35383a(C9117p3 c9117p3, long j10) {
        return new C9122q3(c9117p3, this.f31185b, j10, null);
    }

    /* JADX INFO: renamed from: c */
    public final EnumC2856i m35384c(int i10) {
        return this.f31185b.m35335e(i10);
    }

    /* JADX INFO: renamed from: d */
    public final C6457g m35385d(int i10) {
        return this.f31185b.m35336f(i10);
    }

    /* JADX INFO: renamed from: e */
    public final C6457g m35386e(int i10) {
        return this.f31185b.m35337g(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9122q3)) {
            return false;
        }
        C9122q3 c9122q3 = (C9122q3) obj;
        return AbstractC1061t.m3842c(this.f31184a, c9122q3.f31184a) && AbstractC1061t.m3842c(this.f31185b, c9122q3.f31185b) && C3189s.m12084e(this.f31186c, c9122q3.f31186c) && this.f31187d == c9122q3.f31187d && this.f31188e == c9122q3.f31188e && AbstractC1061t.m3842c(this.f31189f, c9122q3.f31189f);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m35387f() {
        return this.f31185b.m35338h() || ((float) ((int) (this.f31186c & 4294967295L))) < this.f31185b.m35340j();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m35388g() {
        return ((float) ((int) (this.f31186c >> 32))) < this.f31185b.m35326F();
    }

    /* JADX INFO: renamed from: h */
    public final float m35389h() {
        return this.f31187d;
    }

    public int hashCode() {
        return (((((((((this.f31184a.hashCode() * 31) + this.f31185b.hashCode()) * 31) + C3189s.m12085f(this.f31186c)) * 31) + Float.hashCode(this.f31187d)) * 31) + Float.hashCode(this.f31188e)) * 31) + this.f31189f.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m35390i() {
        return m35388g() || m35387f();
    }

    /* JADX INFO: renamed from: j */
    public final float m35391j(int i10, boolean z10) {
        return this.f31185b.m35341k(i10, z10);
    }

    /* JADX INFO: renamed from: k */
    public final float m35392k() {
        return this.f31188e;
    }

    /* JADX INFO: renamed from: l */
    public final C9117p3 m35393l() {
        return this.f31184a;
    }

    /* JADX INFO: renamed from: m */
    public final float m35394m(int i10) {
        return this.f31185b.m35344n(i10);
    }

    /* JADX INFO: renamed from: n */
    public final int m35395n() {
        return this.f31185b.m35345o();
    }

    /* JADX INFO: renamed from: o */
    public final int m35396o(int i10, boolean z10) {
        return this.f31185b.m35346p(i10, z10);
    }

    /* JADX INFO: renamed from: q */
    public final int m35397q(int i10) {
        return this.f31185b.m35347r(i10);
    }

    /* JADX INFO: renamed from: r */
    public final int m35398r(float f10) {
        return this.f31185b.m35348s(f10);
    }

    /* JADX INFO: renamed from: s */
    public final float m35399s(int i10) {
        return this.f31185b.m35350u(i10);
    }

    /* JADX INFO: renamed from: t */
    public final float m35400t(int i10) {
        return this.f31185b.m35351v(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f31184a + ", multiParagraph=" + this.f31185b + ", size=" + ((Object) C3189s.m12086g(this.f31186c)) + ", firstBaseline=" + this.f31187d + ", lastBaseline=" + this.f31188e + ", placeholderRects=" + this.f31189f + ')';
    }

    /* JADX INFO: renamed from: u */
    public final int m35401u(int i10) {
        return this.f31185b.m35352w(i10);
    }

    /* JADX INFO: renamed from: v */
    public final float m35402v(int i10) {
        return this.f31185b.m35353x(i10);
    }

    /* JADX INFO: renamed from: w */
    public final C9103n m35403w() {
        return this.f31185b;
    }

    /* JADX INFO: renamed from: x */
    public final int m35404x(long j10) {
        return this.f31185b.m35355z(j10);
    }

    /* JADX INFO: renamed from: y */
    public final EnumC2856i m35405y(int i10) {
        return this.f31185b.m35321A(i10);
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC7144t2 m35406z(int i10, int i11) {
        return this.f31185b.m35323C(i10, i11);
    }

    public /* synthetic */ C9122q3(C9117p3 c9117p3, C9103n c9103n, long j10, AbstractC1043k abstractC1043k) {
        this(c9117p3, c9103n, j10);
    }
}
