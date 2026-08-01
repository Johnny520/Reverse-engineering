package p316w;

import ec.InterfaceC2165o0;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p121i3.C3189s;
import p121i3.InterfaceC3175e;
import p135j2.InterfaceC3558p0;
import p185m8.AbstractC5081g0;
import p219p.EnumC5898w0;
import p233q.AbstractC6083e;

/* JADX INFO: renamed from: w.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8956i0 implements InterfaceC8935b0, InterfaceC3558p0 {

    /* JADX INFO: renamed from: a */
    public final C8963l0 f29673a;

    /* JADX INFO: renamed from: b */
    public final int f29674b;

    /* JADX INFO: renamed from: c */
    public final boolean f29675c;

    /* JADX INFO: renamed from: d */
    public final float f29676d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3558p0 f29677e;

    /* JADX INFO: renamed from: f */
    public final float f29678f;

    /* JADX INFO: renamed from: g */
    public final boolean f29679g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2165o0 f29680h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3175e f29681i;

    /* JADX INFO: renamed from: j */
    public final int f29682j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0184l f29683k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0184l f29684l;

    /* JADX INFO: renamed from: m */
    public final List f29685m;

    /* JADX INFO: renamed from: n */
    public final int f29686n;

    /* JADX INFO: renamed from: o */
    public final int f29687o;

    /* JADX INFO: renamed from: p */
    public final int f29688p;

    /* JADX INFO: renamed from: q */
    public final boolean f29689q;

    /* JADX INFO: renamed from: r */
    public final EnumC5898w0 f29690r;

    /* JADX INFO: renamed from: s */
    public final int f29691s;

    /* JADX INFO: renamed from: t */
    public final int f29692t;

    public C8956i0(C8963l0 c8963l0, int i10, boolean z10, float f10, InterfaceC3558p0 interfaceC3558p0, float f11, boolean z11, InterfaceC2165o0 interfaceC2165o0, InterfaceC3175e interfaceC3175e, int i11, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, List list, int i12, int i13, int i14, boolean z12, EnumC5898w0 enumC5898w0, int i15, int i16) {
        this.f29673a = c8963l0;
        this.f29674b = i10;
        this.f29675c = z10;
        this.f29676d = f10;
        this.f29677e = interfaceC3558p0;
        this.f29678f = f11;
        this.f29679g = z11;
        this.f29680h = interfaceC2165o0;
        this.f29681i = interfaceC3175e;
        this.f29682j = i11;
        this.f29683k = interfaceC0184l;
        this.f29684l = interfaceC0184l2;
        this.f29685m = list;
        this.f29686n = i12;
        this.f29687o = i13;
        this.f29688p = i14;
        this.f29689q = z12;
        this.f29690r = enumC5898w0;
        this.f29691s = i15;
        this.f29692t = i16;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: a */
    public int mo13077a() {
        return this.f29677e.mo13077a();
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: b */
    public long mo34306b() {
        return C3189s.m12082c((((long) mo13077a()) & 4294967295L) | (((long) mo13078e()) << 32));
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: c */
    public int mo34307c() {
        return this.f29691s;
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: d */
    public int mo34308d() {
        return this.f29687o;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: e */
    public int mo13078e() {
        return this.f29677e.mo13078e();
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: f */
    public EnumC5898w0 mo34309f() {
        return this.f29690r;
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: g */
    public int mo34310g() {
        return -mo34311h();
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: h */
    public int mo34311h() {
        return this.f29686n;
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: i */
    public int mo34312i() {
        return this.f29688p;
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: j */
    public int mo34313j() {
        return this.f29692t;
    }

    @Override // p316w.InterfaceC8935b0
    /* JADX INFO: renamed from: k */
    public List mo34314k() {
        return this.f29685m;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: l */
    public Map mo13079l() {
        return this.f29677e.mo13079l();
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: m */
    public void mo13080m() {
        this.f29677e.mo13080m();
    }

    /* JADX INFO: renamed from: n */
    public final C8956i0 m34387n(int i10, boolean z10) {
        C8963l0 c8963l0;
        if (!this.f29679g && !mo34314k().isEmpty() && (c8963l0 = this.f29673a) != null) {
            int iM34424d = c8963l0.m34424d();
            int i11 = this.f29674b - i10;
            if (i11 >= 0 && i11 < iM34424d) {
                C8959j0 c8959j0 = (C8959j0) AbstractC5081g0.m20576j0(mo34314k());
                C8959j0 c8959j02 = (C8959j0) AbstractC5081g0.m20587u0(mo34314k());
                if (!c8959j0.mo1242e() && !c8959j02.mo1242e() && (i10 >= 0 ? Math.min(mo34311h() - AbstractC6083e.m24203b(c8959j0, mo34309f()), mo34308d() - AbstractC6083e.m24203b(c8959j02, mo34309f())) > i10 : Math.min((AbstractC6083e.m24203b(c8959j0, mo34309f()) + c8959j0.mo1241d()) - mo34311h(), (AbstractC6083e.m24203b(c8959j02, mo34309f()) + c8959j02.mo1241d()) - mo34308d()) > (-i10))) {
                    List listMo34314k = mo34314k();
                    int size = listMo34314k.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((C8959j0) listMo34314k.get(i12)).m34406o(i10, z10);
                    }
                    return new C8956i0(this.f29673a, this.f29674b - i10, this.f29675c || i10 > 0, i10, this.f29677e, this.f29678f, this.f29679g, this.f29680h, this.f29681i, this.f29682j, this.f29683k, this.f29684l, mo34314k(), mo34311h(), mo34308d(), mo34312i(), m34396x(), mo34309f(), mo34307c(), mo34313j());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m34388o() {
        C8963l0 c8963l0 = this.f29673a;
        return ((c8963l0 != null ? c8963l0.m34421a() : 0) == 0 && this.f29674b == 0) ? false : true;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: p */
    public InterfaceC0184l mo13081p() {
        return this.f29677e.mo13081p();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m34389q() {
        return this.f29675c;
    }

    /* JADX INFO: renamed from: r */
    public final float m34390r() {
        return this.f29676d;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC2165o0 m34391s() {
        return this.f29680h;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC3175e m34392t() {
        return this.f29681i;
    }

    /* JADX INFO: renamed from: u */
    public final C8963l0 m34393u() {
        return this.f29673a;
    }

    /* JADX INFO: renamed from: v */
    public final int m34394v() {
        return this.f29674b;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC0184l m34395w() {
        return this.f29683k;
    }

    /* JADX INFO: renamed from: x */
    public boolean m34396x() {
        return this.f29689q;
    }

    /* JADX INFO: renamed from: y */
    public final float m34397y() {
        return this.f29678f;
    }
}
