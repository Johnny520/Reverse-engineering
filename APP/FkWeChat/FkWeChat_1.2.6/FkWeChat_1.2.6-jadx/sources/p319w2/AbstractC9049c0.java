package p319w2;

import p024b9.AbstractC1061t;
import p104h3.AbstractC2867t;
import p104h3.C2852e;
import p104h3.C2853f;
import p104h3.C2855h;
import p104h3.C2857j;
import p104h3.C2859l;
import p104h3.C2866s;
import p104h3.C2868u;
import p121i3.C3193w;
import p121i3.EnumC3191u;

/* JADX INFO: renamed from: w2.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9049c0 {

    /* JADX INFO: renamed from: a */
    public static final long f31053a = C3193w.f8489b.m12108a();

    /* JADX INFO: renamed from: a */
    public static final C9044b0 m35135a(C9044b0 c9044b0, int i10, int i11, long j10, C2866s c2866s, C9064f0 c9064f0, C2855h c2855h, int i12, int i13, C2868u c2868u) {
        long j11;
        long j12;
        int iM35112h = i10;
        C2866s c2866sM35114j = c2866s;
        C2857j.a aVar = C2857j.f7471b;
        if (C2857j.m10221k(iM35112h, aVar.m10231g()) || C2857j.m10221k(iM35112h, c9044b0.m35112h())) {
            if (C3193w.m12101f(j10) == 0) {
                j11 = 0;
                j12 = j10;
            } else {
                j11 = 0;
                j12 = j10;
                if (C3193w.m12100e(j12, c9044b0.m35109e())) {
                }
            }
            if ((c2866sM35114j == null || AbstractC1061t.m3842c(c2866sM35114j, c9044b0.m35114j())) && ((C2859l.m10250j(i11, C2859l.f7485b.m10259f()) || C2859l.m10250j(i11, c9044b0.m35113i())) && ((c9064f0 == null || AbstractC1061t.m3842c(c9064f0, c9044b0.m35111g())) && ((c2855h == null || AbstractC1061t.m3842c(c2855h, c9044b0.m35110f())) && ((C2853f.m10124f(i12, C2853f.f7424b.m10132b()) || C2853f.m10124f(i12, c9044b0.m35108d())) && ((C2852e.m10112g(i13, C2852e.f7419b.m10118c()) || C2852e.m10112g(i13, c9044b0.m35107c())) && (c2868u == null || AbstractC1061t.m3842c(c2868u, c9044b0.m35115k())))))))) {
                return c9044b0;
            }
        } else {
            j11 = 0;
            j12 = j10;
        }
        long jM35109e = C3193w.m12101f(j12) == j11 ? c9044b0.m35109e() : j12;
        if (c2866sM35114j == null) {
            c2866sM35114j = c9044b0.m35114j();
        }
        C2866s c2866s2 = c2866sM35114j;
        if (C2857j.m10221k(iM35112h, aVar.m10231g())) {
            iM35112h = c9044b0.m35112h();
        }
        return new C9044b0(iM35112h, !C2859l.m10250j(i11, C2859l.f7485b.m10259f()) ? i11 : c9044b0.m35113i(), jM35109e, c2866s2, m35138d(c9044b0, c9064f0), c2855h == null ? c9044b0.m35110f() : c2855h, !C2853f.m10124f(i12, C2853f.f7424b.m10132b()) ? i12 : c9044b0.m35108d(), !C2852e.m10112g(i13, C2852e.f7419b.m10118c()) ? i13 : c9044b0.m35107c(), c2868u == null ? c9044b0.m35115k() : c2868u, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C9044b0 m35136b(C9044b0 c9044b0, C9044b0 c9044b02, float f10) {
        int iM10224n = ((C2857j) AbstractC9077h3.m35278d(C2857j.m10218h(c9044b0.m35112h()), C2857j.m10218h(c9044b02.m35112h()), f10)).m10224n();
        int iM10253m = ((C2859l) AbstractC9077h3.m35278d(C2859l.m10247g(c9044b0.m35113i()), C2859l.m10247g(c9044b02.m35113i()), f10)).m10253m();
        long jM35280f = AbstractC9077h3.m35280f(c9044b0.m35109e(), c9044b02.m35109e(), f10);
        C2866s c2866sM35114j = c9044b0.m35114j();
        if (c2866sM35114j == null) {
            c2866sM35114j = C2866s.f7502c.m10278a();
        }
        C2866s c2866sM35114j2 = c9044b02.m35114j();
        if (c2866sM35114j2 == null) {
            c2866sM35114j2 = C2866s.f7502c.m10278a();
        }
        return new C9044b0(iM10224n, iM10253m, jM35280f, AbstractC2867t.m10279a(c2866sM35114j, c2866sM35114j2, f10), m35137c(c9044b0.m35111g(), c9044b02.m35111g(), f10), (C2855h) AbstractC9077h3.m35278d(c9044b0.m35110f(), c9044b02.m35110f(), f10), ((C2853f) AbstractC9077h3.m35278d(C2853f.m10121c(c9044b0.m35108d()), C2853f.m10121c(c9044b02.m35108d()), f10)).m10130l(), ((C2852e) AbstractC9077h3.m35278d(C2852e.m10109d(c9044b0.m35107c()), C2852e.m10109d(c9044b02.m35107c()), f10)).m10115j(), (C2868u) AbstractC9077h3.m35278d(c9044b0.m35115k(), c9044b02.m35115k(), f10), null);
    }

    /* JADX INFO: renamed from: c */
    public static final C9064f0 m35137c(C9064f0 c9064f0, C9064f0 c9064f02, float f10) {
        if (c9064f0 == null && c9064f02 == null) {
            return null;
        }
        if (c9064f0 == null) {
            c9064f0 = C9064f0.f31091c.m35232a();
        }
        if (c9064f02 == null) {
            c9064f02 = C9064f0.f31091c.m35232a();
        }
        return AbstractC9053d.m35141b(c9064f0, c9064f02, f10);
    }

    /* JADX INFO: renamed from: d */
    public static final C9064f0 m35138d(C9044b0 c9044b0, C9064f0 c9064f0) {
        return c9044b0.m35111g() == null ? c9064f0 : c9064f0 == null ? c9044b0.m35111g() : c9044b0.m35111g().m35231d(c9064f0);
    }

    /* JADX INFO: renamed from: e */
    public static final C9044b0 m35139e(C9044b0 c9044b0, EnumC3191u enumC3191u) {
        int iM35112h = c9044b0.m35112h();
        C2857j.a aVar = C2857j.f7471b;
        int iM10230f = C2857j.m10221k(iM35112h, aVar.m10231g()) ? aVar.m10230f() : c9044b0.m35112h();
        int iM35602e = AbstractC9152w3.m35602e(enumC3191u, c9044b0.m35113i());
        long jM35109e = C3193w.m12101f(c9044b0.m35109e()) == 0 ? f31053a : c9044b0.m35109e();
        C2866s c2866sM35114j = c9044b0.m35114j();
        if (c2866sM35114j == null) {
            c2866sM35114j = C2866s.f7502c.m10278a();
        }
        C2866s c2866s = c2866sM35114j;
        C9064f0 c9064f0M35111g = c9044b0.m35111g();
        C2855h c2855hM35110f = c9044b0.m35110f();
        int iM35108d = c9044b0.m35108d();
        C2853f.a aVar2 = C2853f.f7424b;
        int iM10131a = C2853f.m10124f(iM35108d, aVar2.m10132b()) ? aVar2.m10131a() : c9044b0.m35108d();
        int iM35107c = c9044b0.m35107c();
        C2852e.a aVar3 = C2852e.f7419b;
        int iM10117b = C2852e.m10112g(iM35107c, aVar3.m10118c()) ? aVar3.m10117b() : c9044b0.m35107c();
        C2868u c2868uM35115k = c9044b0.m35115k();
        if (c2868uM35115k == null) {
            c2868uM35115k = C2868u.f7506c.m10283a();
        }
        return new C9044b0(iM10230f, iM35602e, jM35109e, c2866s, c9064f0M35111g, c2855hM35110f, iM10131a, iM10117b, c2868uM35115k, null);
    }
}
