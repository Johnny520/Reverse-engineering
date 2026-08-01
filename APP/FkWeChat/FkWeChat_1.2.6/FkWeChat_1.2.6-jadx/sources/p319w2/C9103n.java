package p319w2;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.C1044k0;
import p024b9.C1046l0;
import p030c3.AbstractC1314a;
import p059e3.AbstractC2007b;
import p080f9.AbstractC2368o;
import p104h3.C2858k;
import p104h3.EnumC2856i;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p172l8.C4700i0;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p250r1.C6457g;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7147u0;
import p265s1.C7080g3;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7144t2;
import p290u1.AbstractC8488g;
import p290u1.InterfaceC8487f;
import p319w2.C9137t3;

/* JADX INFO: renamed from: w2.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9103n {

    /* JADX INFO: renamed from: a */
    public final C9118q f31152a;

    /* JADX INFO: renamed from: b */
    public final int f31153b;

    /* JADX INFO: renamed from: c */
    public final boolean f31154c;

    /* JADX INFO: renamed from: d */
    public final float f31155d;

    /* JADX INFO: renamed from: e */
    public final float f31156e;

    /* JADX INFO: renamed from: f */
    public final int f31157f;

    /* JADX INFO: renamed from: g */
    public final List f31158g;

    /* JADX INFO: renamed from: h */
    public final List f31159h;

    public C9103n(C9118q c9118q, long j10, int i10, int i11) {
        this.f31152a = c9118q;
        this.f31153b = i10;
        boolean z10 = true;
        if (!(C3173c.m11975n(j10) == 0 && C3173c.m11974m(j10) == 0)) {
            AbstractC1314a.m5291a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listM35375h = c9118q.m35375h();
        int size = listM35375h.size();
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size) {
            C9153x c9153x = (C9153x) listM35375h.get(i13);
            InterfaceC9143v interfaceC9143vM35065c = AbstractC9039a0.m35065c(c9153x.m35604b(), AbstractC3174d.m11985b(0, C3173c.m11973l(j10), 0, C3173c.m11968g(j10) ? AbstractC2368o.m8578e(C3173c.m11972k(j10) - AbstractC9039a0.m35066d(f10), 0) : C3173c.m11972k(j10), 5, null), this.f31153b - i12, i11);
            float fMo35080a = f10 + interfaceC9143vM35065c.mo35080a();
            int iMo35104z = i12 + interfaceC9143vM35065c.mo35104z();
            arrayList.add(new C9148w(interfaceC9143vM35065c, c9153x.m35605c(), c9153x.m35603a(), i12, iMo35104z, f10, fMo35080a));
            if (interfaceC9143vM35065c.mo35069A() || (iMo35104z == this.f31153b && i13 != AbstractC5114x.m20802q(this.f31152a.m35375h()))) {
                i12 = iMo35104z;
                f10 = fMo35080a;
                break;
            } else {
                i13++;
                i12 = iMo35104z;
                f10 = fMo35080a;
            }
        }
        z10 = false;
        this.f31156e = f10;
        this.f31157f = i12;
        this.f31154c = z10;
        this.f31159h = arrayList;
        this.f31155d = C3173c.m11973l(j10);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C9148w c9148w = (C9148w) arrayList.get(i14);
            List listMo35101w = c9148w.m35583e().mo35101w();
            ArrayList arrayList3 = new ArrayList(listMo35101w.size());
            int size3 = listMo35101w.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C6457g c6457g = (C6457g) listMo35101w.get(i15);
                arrayList3.add(c6457g != null ? c9148w.m35587i(c6457g) : null);
            }
            AbstractC5070c0.m20492E(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f31152a.m35376i().size()) {
            int size4 = this.f31152a.m35376i().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = AbstractC5081g0.m20533E0(arrayList2, arrayList4);
        }
        this.f31158g = arrayList2;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m35317K(C9103n c9103n, InterfaceC7088i1 interfaceC7088i1, AbstractC7078g1 abstractC7078g1, float f10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        c9103n.m35329J(interfaceC7088i1, abstractC7078g1, f10, (i11 & 8) != 0 ? null : c7080g3, (i11 & 16) != 0 ? null : c2858k, (i11 & 32) != 0 ? null : abstractC8488g, (i11 & 64) != 0 ? InterfaceC8487f.f28340p.m32661a() : i10);
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m35318a(InterfaceC7144t2 interfaceC7144t2, int i10, int i11, C9148w c9148w) {
        InterfaceC7144t2.m28218e(interfaceC7144t2, c9148w.m35588j(c9148w.m35583e().mo35071C(c9148w.m35595r(i10), c9148w.m35595r(i11))), 0L, 2, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m35319b(long j10, float[] fArr, C1046l0 c1046l0, C1044k0 c1044k0, C9148w c9148w) {
        long jM35530b = AbstractC9142u3.m35530b(c9148w.m35595r(c9148w.m35584f() > C9137t3.m35521l(j10) ? c9148w.m35584f() : C9137t3.m35521l(j10)), c9148w.m35595r(c9148w.m35580b() < C9137t3.m35520k(j10) ? c9148w.m35580b() : C9137t3.m35520k(j10)));
        c9148w.m35583e().mo35089k(jM35530b, fArr, c1046l0.f3205q);
        int iM35519j = c1046l0.f3205q + (C9137t3.m35519j(jM35530b) * 4);
        for (int i10 = c1046l0.f3205q; i10 < iM35519j; i10 += 4) {
            int i11 = i10 + 1;
            float f10 = fArr[i11];
            float f11 = c1044k0.f3203q;
            fArr[i11] = f10 + f11;
            int i12 = i10 + 3;
            fArr[i12] = fArr[i12] + f11;
        }
        c1046l0.f3205q = iM35519j;
        c1044k0.f3203q += c9148w.m35583e().mo35080a();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m35320q(C9103n c9103n, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return c9103n.m35346p(i10, z10);
    }

    /* JADX INFO: renamed from: A */
    public final EnumC2856i m35321A(int i10) {
        m35331M(i10);
        int length = m35334d().length();
        List list = this.f31159h;
        C9148w c9148w = (C9148w) this.f31159h.get(i10 == length ? AbstractC5114x.m20802q(list) : AbstractC9133t.m35415b(list, i10));
        return c9148w.m35583e().mo35090l(c9148w.m35595r(i10));
    }

    /* JADX INFO: renamed from: B */
    public final List m35322B() {
        return this.f31159h;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC7144t2 m35323C(final int i10, final int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= m35334d().m35156k().length())) {
            AbstractC1314a.m5291a("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + m35334d().m35156k().length() + "), or start > end!");
        }
        if (i10 == i11) {
            return AbstractC7147u0.m28224a();
        }
        final InterfaceC7144t2 interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
        AbstractC9133t.m35419f(this.f31159h, AbstractC9142u3.m35530b(i10, i11), new InterfaceC0184l() { // from class: w2.m
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C9103n.m35318a(interfaceC7144t2M28224a, i10, i11, (C9148w) obj);
            }
        });
        return interfaceC7144t2M28224a;
    }

    /* JADX INFO: renamed from: D */
    public final List m35324D() {
        return this.f31158g;
    }

    /* JADX INFO: renamed from: E */
    public final long m35325E(C6457g c6457g, int i10, InterfaceC9112o3 interfaceC9112o3) {
        C9137t3.a aVar;
        C9137t3.a aVar2;
        int iM35418e = AbstractC9133t.m35418e(this.f31159h, c6457g.m25586o());
        if (((C9148w) this.f31159h.get(iM35418e)).m35579a() >= c6457g.m25580i() || iM35418e == AbstractC5114x.m20802q(this.f31159h)) {
            C9148w c9148w = (C9148w) this.f31159h.get(iM35418e);
            return C9148w.m35578l(c9148w, c9148w.m35583e().mo35088i(c9148w.m35593p(c6457g), i10, interfaceC9112o3), false, 1, null);
        }
        int iM35418e2 = AbstractC9133t.m35418e(this.f31159h, c6457g.m25580i());
        long jM35528a = C9137t3.f31232b.m35528a();
        while (true) {
            aVar = C9137t3.f31232b;
            if (!C9137t3.m35516g(jM35528a, aVar.m35528a()) || iM35418e > iM35418e2) {
                break;
            }
            C9148w c9148w2 = (C9148w) this.f31159h.get(iM35418e);
            jM35528a = C9148w.m35578l(c9148w2, c9148w2.m35583e().mo35088i(c9148w2.m35593p(c6457g), i10, interfaceC9112o3), false, 1, null);
            iM35418e++;
        }
        if (C9137t3.m35516g(jM35528a, aVar.m35528a())) {
            return aVar.m35528a();
        }
        long jM35528a2 = aVar.m35528a();
        while (true) {
            aVar2 = C9137t3.f31232b;
            if (!C9137t3.m35516g(jM35528a2, aVar2.m35528a()) || iM35418e > iM35418e2) {
                break;
            }
            C9148w c9148w3 = (C9148w) this.f31159h.get(iM35418e2);
            jM35528a2 = C9148w.m35578l(c9148w3, c9148w3.m35583e().mo35088i(c9148w3.m35593p(c6457g), i10, interfaceC9112o3), false, 1, null);
            iM35418e2--;
        }
        return C9137t3.m35516g(jM35528a2, aVar2.m35528a()) ? jM35528a : AbstractC9142u3.m35530b(C9137t3.m35523n(jM35528a), C9137t3.m35518i(jM35528a2));
    }

    /* JADX INFO: renamed from: F */
    public final float m35326F() {
        return this.f31155d;
    }

    /* JADX INFO: renamed from: G */
    public final long m35327G(int i10) {
        m35331M(i10);
        int length = m35334d().length();
        List list = this.f31159h;
        C9148w c9148w = (C9148w) this.f31159h.get(i10 == length ? AbstractC5114x.m20802q(list) : AbstractC9133t.m35415b(list, i10));
        return c9148w.m35589k(c9148w.m35583e().mo35095q(c9148w.m35595r(i10)), false);
    }

    /* JADX INFO: renamed from: H */
    public final void m35328H(InterfaceC7088i1 interfaceC7088i1, long j10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10) {
        interfaceC7088i1.mo27841n();
        List list = this.f31159h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C9148w c9148w = (C9148w) list.get(i11);
            c9148w.m35583e().mo35092n(interfaceC7088i1, j10, c7080g3, c2858k, abstractC8488g, i10);
            interfaceC7088i1.mo27832d(0.0f, c9148w.m35583e().mo35080a());
        }
        interfaceC7088i1.mo27847w();
    }

    /* JADX INFO: renamed from: J */
    public final void m35329J(InterfaceC7088i1 interfaceC7088i1, AbstractC7078g1 abstractC7078g1, float f10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10) {
        AbstractC2007b.m7253a(this, interfaceC7088i1, abstractC7078g1, f10, c7080g3, c2858k, abstractC8488g, i10);
    }

    /* JADX INFO: renamed from: L */
    public final void m35330L(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < m35334d().m35156k().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC1314a.m5291a("offset(" + i10 + ") is out of bounds [0, " + m35334d().length() + ')');
    }

    /* JADX INFO: renamed from: M */
    public final void m35331M(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= m35334d().m35156k().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC1314a.m5291a("offset(" + i10 + ") is out of bounds [0, " + m35334d().length() + ']');
    }

    /* JADX INFO: renamed from: N */
    public final void m35332N(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f31157f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC1314a.m5291a("lineIndex(" + i10 + ") is out of bounds [0, " + this.f31157f + ')');
    }

    /* JADX INFO: renamed from: c */
    public final float[] m35333c(final long j10, final float[] fArr, int i10) {
        m35330L(C9137t3.m35521l(j10));
        m35331M(C9137t3.m35520k(j10));
        final C1046l0 c1046l0 = new C1046l0();
        c1046l0.f3205q = i10;
        final C1044k0 c1044k0 = new C1044k0();
        AbstractC9133t.m35419f(this.f31159h, j10, new InterfaceC0184l() { // from class: w2.l
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C9103n.m35319b(j10, fArr, c1046l0, c1044k0, (C9148w) obj);
            }
        });
        return fArr;
    }

    /* JADX INFO: renamed from: d */
    public final C9058e m35334d() {
        return this.f31152a.m35374f();
    }

    /* JADX INFO: renamed from: e */
    public final EnumC2856i m35335e(int i10) {
        m35331M(i10);
        int length = m35334d().length();
        List list = this.f31159h;
        C9148w c9148w = (C9148w) this.f31159h.get(i10 == length ? AbstractC5114x.m20802q(list) : AbstractC9133t.m35415b(list, i10));
        return c9148w.m35583e().mo35098t(c9148w.m35595r(i10));
    }

    /* JADX INFO: renamed from: f */
    public final C6457g m35336f(int i10) {
        m35330L(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35415b(this.f31159h, i10));
        return c9148w.m35587i(c9148w.m35583e().mo35082c(c9148w.m35595r(i10)));
    }

    /* JADX INFO: renamed from: g */
    public final C6457g m35337g(int i10) {
        m35331M(i10);
        int length = m35334d().length();
        List list = this.f31159h;
        C9148w c9148w = (C9148w) this.f31159h.get(i10 == length ? AbstractC5114x.m20802q(list) : AbstractC9133t.m35415b(list, i10));
        return c9148w.m35587i(c9148w.m35583e().mo35094p(c9148w.m35595r(i10)));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m35338h() {
        return this.f31154c;
    }

    /* JADX INFO: renamed from: i */
    public final float m35339i() {
        if (this.f31159h.isEmpty()) {
            return 0.0f;
        }
        return ((C9148w) this.f31159h.get(0)).m35583e().mo35097s();
    }

    /* JADX INFO: renamed from: j */
    public final float m35340j() {
        return this.f31156e;
    }

    /* JADX INFO: renamed from: k */
    public final float m35341k(int i10, boolean z10) {
        m35331M(i10);
        int length = m35334d().length();
        List list = this.f31159h;
        C9148w c9148w = (C9148w) this.f31159h.get(i10 == length ? AbstractC5114x.m20802q(list) : AbstractC9133t.m35415b(list, i10));
        return c9148w.m35583e().mo35073E(c9148w.m35595r(i10), z10);
    }

    /* JADX INFO: renamed from: l */
    public final C9118q m35342l() {
        return this.f31152a;
    }

    /* JADX INFO: renamed from: m */
    public final float m35343m() {
        if (this.f31159h.isEmpty()) {
            return 0.0f;
        }
        C9148w c9148w = (C9148w) AbstractC5081g0.m20587u0(this.f31159h);
        return c9148w.m35592o(c9148w.m35583e().mo35093o());
    }

    /* JADX INFO: renamed from: n */
    public final float m35344n(int i10) {
        m35332N(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35417d(this.f31159h, i10));
        return c9148w.m35592o(c9148w.m35583e().mo35099u(c9148w.m35596s(i10)));
    }

    /* JADX INFO: renamed from: o */
    public final int m35345o() {
        return this.f31157f;
    }

    /* JADX INFO: renamed from: p */
    public final int m35346p(int i10, boolean z10) {
        m35332N(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35417d(this.f31159h, i10));
        return c9148w.m35590m(c9148w.m35583e().mo35103y(c9148w.m35596s(i10), z10));
    }

    /* JADX INFO: renamed from: r */
    public final int m35347r(int i10) {
        C9148w c9148w = (C9148w) this.f31159h.get(i10 >= m35334d().length() ? AbstractC5114x.m20802q(this.f31159h) : i10 < 0 ? 0 : AbstractC9133t.m35415b(this.f31159h, i10));
        return c9148w.m35591n(c9148w.m35583e().mo35096r(c9148w.m35595r(i10)));
    }

    /* JADX INFO: renamed from: s */
    public final int m35348s(float f10) {
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35418e(this.f31159h, f10));
        return c9148w.m35582d() == 0 ? c9148w.m35585g() : c9148w.m35591n(c9148w.m35583e().mo35070B(c9148w.m35597t(f10)));
    }

    /* JADX INFO: renamed from: t */
    public final float m35349t(int i10) {
        m35332N(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35417d(this.f31159h, i10));
        return c9148w.m35583e().mo35085f(c9148w.m35596s(i10));
    }

    /* JADX INFO: renamed from: u */
    public final float m35350u(int i10) {
        m35332N(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35417d(this.f31159h, i10));
        return c9148w.m35583e().mo35087h(c9148w.m35596s(i10));
    }

    /* JADX INFO: renamed from: v */
    public final float m35351v(int i10) {
        m35332N(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35417d(this.f31159h, i10));
        return c9148w.m35583e().mo35083d(c9148w.m35596s(i10));
    }

    /* JADX INFO: renamed from: w */
    public final int m35352w(int i10) {
        m35332N(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35417d(this.f31159h, i10));
        return c9148w.m35590m(c9148w.m35583e().mo35102x(c9148w.m35596s(i10)));
    }

    /* JADX INFO: renamed from: x */
    public final float m35353x(int i10) {
        m35332N(i10);
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35417d(this.f31159h, i10));
        return c9148w.m35592o(c9148w.m35583e().mo35091m(c9148w.m35596s(i10)));
    }

    /* JADX INFO: renamed from: y */
    public final int m35354y() {
        return this.f31153b;
    }

    /* JADX INFO: renamed from: z */
    public final int m35355z(long j10) {
        C9148w c9148w = (C9148w) this.f31159h.get(AbstractC9133t.m35418e(this.f31159h, Float.intBitsToFloat((int) (4294967295L & j10))));
        return c9148w.m35582d() == 0 ? c9148w.m35584f() : c9148w.m35590m(c9148w.m35583e().mo35100v(c9148w.m35594q(j10)));
    }

    public /* synthetic */ C9103n(C9118q c9118q, long j10, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(c9118q, j10, i10, i11);
    }
}
