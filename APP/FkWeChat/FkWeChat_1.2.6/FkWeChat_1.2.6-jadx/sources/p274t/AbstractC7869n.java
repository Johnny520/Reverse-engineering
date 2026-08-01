package p274t;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0537m;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.AbstractC0603u5;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0559p0;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p117i.C3082r0;
import p121i3.C3173c;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.AbstractC4505k;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4541g;
import p172l8.C4700i0;
import p274t.AbstractC7869n;

/* JADX INFO: renamed from: t.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7869n {

    /* JADX INFO: renamed from: a */
    public static final C3082r0 f26215a = m30425e(true);

    /* JADX INFO: renamed from: b */
    public static final C3082r0 f26216b = m30425e(false);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3555o0 f26217c = new C7889r(InterfaceC4499e.f13028a.m17426o(), false);

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3555o0 f26218d = a.f26219a;

    /* JADX INFO: renamed from: t.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3555o0 {

        /* JADX INFO: renamed from: a */
        public static final a f26219a = new a();

        /* JADX INFO: renamed from: a */
        public static C4700i0 m30430a(AbstractC3545l1.a aVar) {
            return C4700i0.f13910a;
        }

        @Override // p135j2.InterfaceC3555o0
        /* JADX INFO: renamed from: c */
        public final InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, C3173c.m11975n(j10), C3173c.m11974m(j10), null, new InterfaceC0184l() { // from class: t.m
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC7869n.a.m30430a((AbstractC3545l1.a) obj);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m30421a(InterfaceC4507m interfaceC4507m, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m30422b(interfaceC4507m, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m30422b(final InterfaceC4507m interfaceC4507m, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2162U(interfaceC4507m) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 3) != 2, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            InterfaceC3555o0 interfaceC3555o0 = f26218d;
            int iHashCode = Long.hashCode(AbstractC0537m.m1915b(interfaceC0572rMo2181q, 0));
            InterfaceC4507m interfaceC4507mM17439e = AbstractC4505k.m17439e(interfaceC0572rMo2181q, interfaceC4507m);
            InterfaceC0559p0 interfaceC0559p0Mo2147F = interfaceC0572rMo2181q.mo2147F();
            InterfaceC4541g.a aVar = InterfaceC4541g.f13305j;
            InterfaceC0173a interfaceC0173aM17772b = aVar.m17772b();
            if (interfaceC0572rMo2181q.mo2186v() == null) {
                AbstractC0537m.m1917d();
            }
            interfaceC0572rMo2181q.mo2183s();
            if (interfaceC0572rMo2181q.mo2177m()) {
                interfaceC0572rMo2181q.mo2160S(interfaceC0173aM17772b);
            } else {
                interfaceC0572rMo2181q.mo2149H();
            }
            InterfaceC0572r interfaceC0572rM2231b = AbstractC0603u5.m2231b(interfaceC0572rMo2181q);
            AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC3555o0, aVar.m17774d());
            AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC0559p0Mo2147F, aVar.m17776f());
            AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC4507mM17439e, aVar.m17775e());
            InterfaceC0188p interfaceC0188pM17773c = aVar.m17773c();
            if (interfaceC0572rM2231b.mo2177m() || !AbstractC1061t.m3842c(interfaceC0572rM2231b.mo2170f(), Integer.valueOf(iHashCode))) {
                interfaceC0572rM2231b.mo2153L(Integer.valueOf(iHashCode));
                interfaceC0572rM2231b.mo2151J(Integer.valueOf(iHashCode), interfaceC0188pM17773c);
            }
            interfaceC0572rMo2181q.mo2159R();
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: t.l
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7869n.m30421a(interfaceC4507m, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C3082r0 m30425e(boolean z10) {
        C3082r0 c3082r0 = new C3082r0(9);
        InterfaceC4499e.a aVar = InterfaceC4499e.f13028a;
        c3082r0.m11529x(aVar.m17426o(), new C7889r(aVar.m17426o(), z10));
        c3082r0.m11529x(aVar.m17424m(), new C7889r(aVar.m17424m(), z10));
        c3082r0.m11529x(aVar.m17425n(), new C7889r(aVar.m17425n(), z10));
        c3082r0.m11529x(aVar.m17419h(), new C7889r(aVar.m17419h(), z10));
        c3082r0.m11529x(aVar.m17416e(), new C7889r(aVar.m17416e(), z10));
        c3082r0.m11529x(aVar.m17417f(), new C7889r(aVar.m17417f(), z10));
        c3082r0.m11529x(aVar.m17415d(), new C7889r(aVar.m17415d(), z10));
        c3082r0.m11529x(aVar.m17413b(), new C7889r(aVar.m17413b(), z10));
        c3082r0.m11529x(aVar.m17414c(), new C7889r(aVar.m17414c(), z10));
        return c3082r0;
    }

    /* JADX INFO: renamed from: f */
    public static final C7854k m30426f(InterfaceC3552n0 interfaceC3552n0) {
        Object objMo13149o = interfaceC3552n0.mo13149o();
        if (objMo13149o instanceof C7854k) {
            return (C7854k) objMo13149o;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m30427g(InterfaceC3552n0 interfaceC3552n0) {
        C7854k c7854kM30426f = m30426f(interfaceC3552n0);
        if (c7854kM30426f != null) {
            return c7854kM30426f.m30405H2();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC3555o0 m30428h(InterfaceC4499e interfaceC4499e, boolean z10) {
        InterfaceC3555o0 interfaceC3555o0 = (InterfaceC3555o0) (z10 ? f26215a : f26216b).m11238e(interfaceC4499e);
        return interfaceC3555o0 == null ? new C7889r(interfaceC4499e, z10) : interfaceC3555o0;
    }

    /* JADX INFO: renamed from: i */
    public static final void m30429i(AbstractC3545l1.a aVar, AbstractC3545l1 abstractC3545l1, InterfaceC3552n0 interfaceC3552n0, EnumC3191u enumC3191u, int i10, int i11, InterfaceC4499e interfaceC4499e) {
        InterfaceC4499e interfaceC4499eM30404G2;
        C7854k c7854kM30426f = m30426f(interfaceC3552n0);
        AbstractC3545l1.a.m13269B(aVar, abstractC3545l1, ((c7854kM30426f == null || (interfaceC4499eM30404G2 = c7854kM30426f.m30404G2()) == null) ? interfaceC4499e : interfaceC4499eM30404G2).mo17411a(C3189s.m12082c((((long) abstractC3545l1.m13264M0()) << 32) | (((long) abstractC3545l1.m13259G0()) & 4294967295L)), C3189s.m12082c((((long) i11) & 4294967295L) | (((long) i10) << 32)), enumC3191u), 0.0f, 2, null);
    }
}
