package p073f2;

import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p024b9.C1042j0;
import p024b9.C1050n0;
import p073f2.AbstractC2269u;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4544g2;
import p166l2.AbstractC4549i;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4560k2;
import p166l2.C4584s;
import p166l2.EnumC4552i2;
import p166l2.InterfaceC4545h;
import p166l2.InterfaceC4556j2;
import p166l2.InterfaceC4598w1;
import p179m2.AbstractC4870l1;

/* JADX INFO: renamed from: f2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2239f extends InterfaceC4507m.c implements InterfaceC4556j2, InterfaceC4598w1, InterfaceC4545h {

    /* JADX INFO: renamed from: F */
    public C4584s f6144F;

    /* JADX INFO: renamed from: G */
    public InterfaceC2277y f6145G;

    /* JADX INFO: renamed from: H */
    public boolean f6146H;

    /* JADX INFO: renamed from: I */
    public boolean f6147I;

    /* JADX INFO: renamed from: f2.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f6148r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1050n0 c1050n0) {
            super(1);
            this.f6148r = c1050n0;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(AbstractC2239f abstractC2239f) {
            if (this.f6148r.f3208q == null && abstractC2239f.f6147I) {
                this.f6148r.f3208q = abstractC2239f;
            } else if (this.f6148r.f3208q != null && abstractC2239f.m8107O2() && abstractC2239f.f6147I) {
                this.f6148r.f3208q = abstractC2239f;
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: f2.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1042j0 f6149r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1042j0 c1042j0) {
            super(1);
            this.f6149r = c1042j0;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4552i2 mo27m(AbstractC2239f abstractC2239f) {
            if (!abstractC2239f.f6147I) {
                return EnumC4552i2.f13329q;
            }
            this.f6149r.f3202q = false;
            return EnumC4552i2.f13331s;
        }
    }

    /* JADX INFO: renamed from: f2.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f6150r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1050n0 c1050n0) {
            super(1);
            this.f6150r = c1050n0;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4552i2 mo27m(AbstractC2239f abstractC2239f) {
            EnumC4552i2 enumC4552i2 = EnumC4552i2.f13329q;
            if (abstractC2239f.f6147I) {
                this.f6150r.f3208q = abstractC2239f;
                if (abstractC2239f.m8107O2()) {
                    return EnumC4552i2.f13330r;
                }
            }
            return enumC4552i2;
        }
    }

    /* JADX INFO: renamed from: f2.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f6151r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1050n0 c1050n0) {
            super(1);
            this.f6151r = c1050n0;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(AbstractC2239f abstractC2239f) {
            if (abstractC2239f.m8107O2() && abstractC2239f.f6147I) {
                this.f6151r.f3208q = abstractC2239f;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ AbstractC2239f(InterfaceC2277y interfaceC2277y, boolean z10, C4584s c4584s, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC2277y, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : c4584s);
    }

    @Override // p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: A0 */
    public void mo8047A0(C2261q c2261q, EnumC2265s enumC2265s, long j10) {
        if (enumC2265s == EnumC2265s.f6226r) {
            List listM8216c = c2261q.m8216c();
            int size = listM8216c.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (mo8109Q2(((C2236d0) listM8216c.get(i10)).m8083n())) {
                    int iM8220g = c2261q.m8220g();
                    AbstractC2269u.a aVar = AbstractC2269u.f6230a;
                    if (AbstractC2269u.m8264i(iM8220g, aVar.m8265a())) {
                        m8110R2();
                        return;
                    } else {
                        if (AbstractC2269u.m8264i(c2261q.m8220g(), aVar.m8266b())) {
                            m8111S2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: G0 */
    public void mo8048G0() {
        m8111S2();
    }

    /* JADX INFO: renamed from: H2 */
    public final void m8100H2() {
        InterfaceC2277y interfaceC2277y;
        AbstractC2239f abstractC2239fM8106N2 = m8106N2();
        if (abstractC2239fM8106N2 == null || (interfaceC2277y = abstractC2239fM8106N2.f6145G) == null) {
            interfaceC2277y = this.f6145G;
        }
        mo8101I2(interfaceC2277y);
    }

    /* JADX INFO: renamed from: I2 */
    public abstract void mo8101I2(InterfaceC2277y interfaceC2277y);

    /* JADX INFO: renamed from: J2 */
    public final void m8102J2() {
        C1050n0 c1050n0 = new C1050n0();
        AbstractC4560k2.m18022d(this, new a(c1050n0));
        AbstractC2239f abstractC2239f = (AbstractC2239f) c1050n0.f3208q;
        if (abstractC2239f != null) {
            abstractC2239f.m8100H2();
        } else {
            mo8101I2(null);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m8103K2() {
        AbstractC2239f abstractC2239fM8105M2;
        if (this.f6147I) {
            if (this.f6146H || (abstractC2239fM8105M2 = m8105M2()) == null) {
                abstractC2239fM8105M2 = this;
            }
            abstractC2239fM8105M2.m8100H2();
        }
    }

    /* JADX INFO: renamed from: L2 */
    public final void m8104L2() {
        C1042j0 c1042j0 = new C1042j0();
        c1042j0.f3202q = true;
        if (!this.f6146H) {
            AbstractC4560k2.m18024f(this, new b(c1042j0));
        }
        if (c1042j0.f3202q) {
            m8100H2();
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final AbstractC2239f m8105M2() {
        C1050n0 c1050n0 = new C1050n0();
        AbstractC4560k2.m18024f(this, new c(c1050n0));
        return (AbstractC2239f) c1050n0.f3208q;
    }

    /* JADX INFO: renamed from: N2 */
    public final AbstractC2239f m8106N2() {
        C1050n0 c1050n0 = new C1050n0();
        AbstractC4560k2.m18022d(this, new d(c1050n0));
        return (AbstractC2239f) c1050n0.f3208q;
    }

    /* JADX INFO: renamed from: O2 */
    public final boolean m8107O2() {
        return this.f6146H;
    }

    /* JADX INFO: renamed from: P2 */
    public final InterfaceC2228a0 m8108P2() {
        return (InterfaceC2228a0) AbstractC4549i.m17816a(this, AbstractC4870l1.m19448m());
    }

    /* JADX INFO: renamed from: Q2 */
    public abstract boolean mo8109Q2(int i10);

    /* JADX INFO: renamed from: R2 */
    public final void m8110R2() {
        this.f6147I = true;
        m8104L2();
    }

    /* JADX INFO: renamed from: S2 */
    public final void m8111S2() {
        if (this.f6147I) {
            this.f6147I = false;
            if (m17461m2()) {
                m8102J2();
            }
        }
    }

    /* JADX INFO: renamed from: T2 */
    public final void m8112T2(C4584s c4584s) {
        this.f6144F = c4584s;
    }

    /* JADX INFO: renamed from: U2 */
    public final void m8113U2(InterfaceC2277y interfaceC2277y) {
        if (AbstractC1061t.m3842c(this.f6145G, interfaceC2277y)) {
            return;
        }
        this.f6145G = interfaceC2277y;
        if (this.f6147I) {
            m8104L2();
        }
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8114V2(boolean z10) {
        if (this.f6146H != z10) {
            this.f6146H = z10;
            boolean z11 = this.f6147I;
            if (z10) {
                if (z11) {
                    m8100H2();
                }
            } else if (z11) {
                m8103K2();
            }
        }
    }

    @Override // p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: W */
    public long mo8115W() {
        C4584s c4584s = this.f6144F;
        return c4584s != null ? c4584s.m18195a(AbstractC4557k.m18011m(this)) : AbstractC4544g2.f13326a.m17803b();
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        m8111S2();
        super.mo1378q2();
    }

    public AbstractC2239f(InterfaceC2277y interfaceC2277y, boolean z10, C4584s c4584s) {
        this.f6144F = c4584s;
        this.f6145G = interfaceC2277y;
        this.f6146H = z10;
    }
}
