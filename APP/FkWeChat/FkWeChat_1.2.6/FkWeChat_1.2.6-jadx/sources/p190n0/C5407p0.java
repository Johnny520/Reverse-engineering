package p190n0;

import p104h3.EnumC2856i;
import p190n0.C5419r0;
import p319w2.C9122q3;

/* JADX INFO: renamed from: n0.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5407p0 {

    /* JADX INFO: renamed from: g */
    public static final int f16647g = C9122q3.f31183g;

    /* JADX INFO: renamed from: a */
    public final long f16648a;

    /* JADX INFO: renamed from: b */
    public final int f16649b;

    /* JADX INFO: renamed from: c */
    public final int f16650c;

    /* JADX INFO: renamed from: d */
    public final int f16651d;

    /* JADX INFO: renamed from: e */
    public final int f16652e;

    /* JADX INFO: renamed from: f */
    public final C9122q3 f16653f;

    public C5407p0(long j10, int i10, int i11, int i12, int i13, C9122q3 c9122q3) {
        this.f16648a = j10;
        this.f16649b = i10;
        this.f16650c = i11;
        this.f16651d = i12;
        this.f16652e = i13;
        this.f16653f = c9122q3;
    }

    /* JADX INFO: renamed from: a */
    public final C5419r0.a m21989a(int i10) {
        return new C5419r0.a(AbstractC5420r1.m22122a(this.f16653f, i10), i10, this.f16648a);
    }

    /* JADX INFO: renamed from: b */
    public final EnumC2856i m21990b() {
        return AbstractC5420r1.m22122a(this.f16653f, this.f16651d);
    }

    /* JADX INFO: renamed from: c */
    public final String m21991c() {
        return this.f16653f.m35393l().m35370j().m35156k();
    }

    /* JADX INFO: renamed from: d */
    public final EnumC5388m m21992d() {
        int i10 = this.f16650c;
        int i11 = this.f16651d;
        return i10 < i11 ? EnumC5388m.f16585r : i10 > i11 ? EnumC5388m.f16584q : EnumC5388m.f16586s;
    }

    /* JADX INFO: renamed from: e */
    public final int m21993e() {
        return this.f16651d;
    }

    /* JADX INFO: renamed from: f */
    public final int m21994f() {
        return this.f16652e;
    }

    /* JADX INFO: renamed from: g */
    public final int m21995g() {
        return this.f16650c;
    }

    /* JADX INFO: renamed from: h */
    public final long m21996h() {
        return this.f16648a;
    }

    /* JADX INFO: renamed from: i */
    public final int m21997i() {
        return this.f16649b;
    }

    /* JADX INFO: renamed from: j */
    public final EnumC2856i m21998j() {
        return AbstractC5420r1.m22122a(this.f16653f, this.f16650c);
    }

    /* JADX INFO: renamed from: k */
    public final C9122q3 m21999k() {
        return this.f16653f;
    }

    /* JADX INFO: renamed from: l */
    public final int m22000l() {
        return m21991c().length();
    }

    /* JADX INFO: renamed from: m */
    public final C5419r0 m22001m(int i10, int i11) {
        return new C5419r0(m21989a(i10), m21989a(i11), i10 > i11);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m22002n(C5407p0 c5407p0) {
        return (this.f16648a == c5407p0.f16648a && this.f16650c == c5407p0.f16650c && this.f16651d == c5407p0.f16651d) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f16648a + ", range=(" + this.f16650c + '-' + m21998j() + ',' + this.f16651d + '-' + m21990b() + "), prevOffset=" + this.f16652e + ')';
    }
}
