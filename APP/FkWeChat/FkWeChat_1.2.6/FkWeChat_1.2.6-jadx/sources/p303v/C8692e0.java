package p303v;

import ec.InterfaceC2165o0;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p121i3.C3189s;
import p121i3.InterfaceC3175e;
import p135j2.InterfaceC3558p0;
import p185m8.AbstractC5081g0;
import p219p.EnumC5898w0;

/* JADX INFO: renamed from: v.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8692e0 implements InterfaceC8729x, InterfaceC3558p0 {

    /* JADX INFO: renamed from: a */
    public final C8694f0 f28841a;

    /* JADX INFO: renamed from: b */
    public final int f28842b;

    /* JADX INFO: renamed from: c */
    public final boolean f28843c;

    /* JADX INFO: renamed from: d */
    public final float f28844d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3558p0 f28845e;

    /* JADX INFO: renamed from: f */
    public final float f28846f;

    /* JADX INFO: renamed from: g */
    public final boolean f28847g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2165o0 f28848h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3175e f28849i;

    /* JADX INFO: renamed from: j */
    public final long f28850j;

    /* JADX INFO: renamed from: k */
    public final List f28851k;

    /* JADX INFO: renamed from: l */
    public final int f28852l;

    /* JADX INFO: renamed from: m */
    public final int f28853m;

    /* JADX INFO: renamed from: n */
    public final int f28854n;

    /* JADX INFO: renamed from: o */
    public final boolean f28855o;

    /* JADX INFO: renamed from: p */
    public final EnumC5898w0 f28856p;

    /* JADX INFO: renamed from: q */
    public final int f28857q;

    /* JADX INFO: renamed from: r */
    public final int f28858r;

    public C8692e0(C8694f0 c8694f0, int i10, boolean z10, float f10, InterfaceC3558p0 interfaceC3558p0, float f11, boolean z11, InterfaceC2165o0 interfaceC2165o0, InterfaceC3175e interfaceC3175e, long j10, List list, int i11, int i12, int i13, boolean z12, EnumC5898w0 enumC5898w0, int i14, int i15) {
        this.f28841a = c8694f0;
        this.f28842b = i10;
        this.f28843c = z10;
        this.f28844d = f10;
        this.f28845e = interfaceC3558p0;
        this.f28846f = f11;
        this.f28847g = z11;
        this.f28848h = interfaceC2165o0;
        this.f28849i = interfaceC3175e;
        this.f28850j = j10;
        this.f28851k = list;
        this.f28852l = i11;
        this.f28853m = i12;
        this.f28854n = i13;
        this.f28855o = z12;
        this.f28856p = enumC5898w0;
        this.f28857q = i14;
        this.f28858r = i15;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: a */
    public int mo13077a() {
        return this.f28845e.mo13077a();
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: b */
    public long mo33387b() {
        return C3189s.m12082c((((long) mo13077a()) & 4294967295L) | (((long) mo13078e()) << 32));
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: c */
    public int mo33388c() {
        return this.f28857q;
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: d */
    public int mo33389d() {
        return this.f28853m;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: e */
    public int mo13078e() {
        return this.f28845e.mo13078e();
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: f */
    public EnumC5898w0 mo33390f() {
        return this.f28856p;
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: g */
    public int mo33391g() {
        return -mo33392h();
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: h */
    public int mo33392h() {
        return this.f28852l;
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: i */
    public int mo33393i() {
        return this.f28854n;
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: j */
    public int mo33394j() {
        return this.f28858r;
    }

    @Override // p303v.InterfaceC8729x
    /* JADX INFO: renamed from: k */
    public List mo33395k() {
        return this.f28851k;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: l */
    public Map mo13079l() {
        return this.f28845e.mo13079l();
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: m */
    public void mo13080m() {
        this.f28845e.mo13080m();
    }

    /* JADX INFO: renamed from: n */
    public final C8692e0 m33396n(int i10, boolean z10) {
        C8694f0 c8694f0;
        if (!this.f28847g && !mo33395k().isEmpty() && (c8694f0 = this.f28841a) != null) {
            int iMo1241d = c8694f0.mo1241d();
            int i11 = this.f28842b - i10;
            if (i11 >= 0 && i11 < iMo1241d) {
                C8694f0 c8694f02 = (C8694f0) AbstractC5081g0.m20576j0(mo33395k());
                C8694f0 c8694f03 = (C8694f0) AbstractC5081g0.m20587u0(mo33395k());
                if (!c8694f02.mo1242e() && !c8694f03.mo1242e() && (i10 >= 0 ? Math.min(mo33392h() - c8694f02.getOffset(), mo33389d() - c8694f03.getOffset()) > i10 : Math.min((c8694f02.getOffset() + c8694f02.mo1241d()) - mo33392h(), (c8694f03.getOffset() + c8694f03.mo1241d()) - mo33389d()) > (-i10))) {
                    List listMo33395k = mo33395k();
                    int size = listMo33395k.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((C8694f0) listMo33395k.get(i12)).m33409l(i10, z10);
                    }
                    return new C8692e0(this.f28841a, this.f28842b - i10, this.f28843c || i10 > 0, i10, this.f28845e, this.f28846f, this.f28847g, this.f28848h, this.f28849i, this.f28850j, mo33395k(), mo33392h(), mo33389d(), mo33393i(), m33405x(), mo33390f(), mo33388c(), mo33394j(), null);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m33397o() {
        C8694f0 c8694f0 = this.f28841a;
        return ((c8694f0 != null ? c8694f0.getIndex() : 0) == 0 && this.f28842b == 0) ? false : true;
    }

    @Override // p135j2.InterfaceC3558p0
    /* JADX INFO: renamed from: p */
    public InterfaceC0184l mo13081p() {
        return this.f28845e.mo13081p();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m33398q() {
        return this.f28843c;
    }

    /* JADX INFO: renamed from: r */
    public final long m33399r() {
        return this.f28850j;
    }

    /* JADX INFO: renamed from: s */
    public final float m33400s() {
        return this.f28844d;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC2165o0 m33401t() {
        return this.f28848h;
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC3175e m33402u() {
        return this.f28849i;
    }

    /* JADX INFO: renamed from: v */
    public final C8694f0 m33403v() {
        return this.f28841a;
    }

    /* JADX INFO: renamed from: w */
    public final int m33404w() {
        return this.f28842b;
    }

    /* JADX INFO: renamed from: x */
    public boolean m33405x() {
        return this.f28855o;
    }

    /* JADX INFO: renamed from: y */
    public final float m33406y() {
        return this.f28846f;
    }

    public /* synthetic */ C8692e0(C8694f0 c8694f0, int i10, boolean z10, float f10, InterfaceC3558p0 interfaceC3558p0, float f11, boolean z11, InterfaceC2165o0 interfaceC2165o0, InterfaceC3175e interfaceC3175e, long j10, List list, int i11, int i12, int i13, boolean z12, EnumC5898w0 enumC5898w0, int i14, int i15, AbstractC1043k abstractC1043k) {
        this(c8694f0, i10, z10, f10, interfaceC3558p0, f11, z11, interfaceC2165o0, interfaceC3175e, j10, list, i11, i12, i13, z12, enumC5898w0, i14, i15);
    }
}
