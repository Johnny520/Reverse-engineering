package p265s1;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p119i1.AbstractC3137l;
import p121i3.AbstractC3190t;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.C4503i;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4539f1;
import p166l2.AbstractC4546h0;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.InterfaceC4524b2;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;
import p277t2.AbstractC8070f0;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: s1.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7073f1 extends InterfaceC4507m.c implements InterfaceC4534e0, InterfaceC4524b2 {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f23544F;

    /* JADX INFO: renamed from: G */
    public final boolean f23545G;

    /* JADX INFO: renamed from: s1.f1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC3545l1 f23546r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C7073f1 f23547s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3545l1 abstractC3545l1, C7073f1 c7073f1) {
            super(1);
            this.f23546r = abstractC3545l1;
            this.f23547s = c7073f1;
        }

        /* JADX INFO: renamed from: a */
        public final void m27866a(AbstractC3545l1.a aVar) {
            AbstractC3545l1.a.m13277g0(aVar, this.f23546r, 0, 0, 0.0f, this.f23547s.m27863G2(), 4, null);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m27866a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    public C7073f1(InterfaceC0184l interfaceC0184l) {
        this.f23544F = interfaceC0184l;
    }

    /* JADX INFO: renamed from: G2 */
    public final InterfaceC0184l m27863G2() {
        return this.f23544F;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m27864H2() {
        AbstractC4546h0.m17811e(this, this.f23544F);
    }

    /* JADX INFO: renamed from: I2 */
    public final void m27865I2(InterfaceC0184l interfaceC0184l) {
        this.f23544F = interfaceC0184l;
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: P */
    public boolean mo17543P() {
        return this.f23545G;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new a(abstractC3545l1Mo13148X, this), 4, null);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return false;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f23544F + ')';
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
        boolean zM17697L2;
        InterfaceC7090i3 interfaceC7090i3M27794O;
        if (C4503i.f13066l) {
            AbstractC4539f1 abstractC4539f1M18010l = AbstractC4557k.m18010l(this, AbstractC4547h1.m17812a(2));
            if (abstractC4539f1M18010l.m17714V2()) {
                InterfaceC7090i3 interfaceC7090i3M17703O2 = abstractC4539f1M18010l.m17703O2();
                zM17697L2 = abstractC4539f1M18010l.m17697L2();
                interfaceC7090i3M27794O = interfaceC7090i3M17703O2;
            } else {
                if (AbstractC7074f2.f23548a == null) {
                    AbstractC7074f2.f23548a = new C7065d3();
                } else {
                    C7065d3 c7065d3 = AbstractC7074f2.f23548a;
                    c7065d3.getClass();
                    c7065d3.m27796Q();
                }
                C7065d3 c7065d32 = AbstractC7074f2.f23548a;
                c7065d32.getClass();
                c7065d32.m27797S(abstractC4539f1M18010l.mo17689I1().m17886R());
                c7065d32.m27799W(AbstractC3190t.m12092d(abstractC4539f1M18010l.mo13242a()));
                AbstractC3137l.a aVar = AbstractC3137l.f8345e;
                AbstractC3137l abstractC3137lM11765d = aVar.m11765d();
                InterfaceC0184l interfaceC0184lMo11676g = abstractC3137lM11765d != null ? abstractC3137lM11765d.mo11676g() : null;
                AbstractC3137l abstractC3137lM11767f = aVar.m11767f(abstractC3137lM11765d);
                try {
                    this.f23544F.mo27m(c7065d32);
                    C4700i0 c4700i0 = C4700i0.f13910a;
                    aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
                    interfaceC7090i3M27794O = c7065d32.m27794O();
                    zM17697L2 = c7065d32.m27813o();
                } catch (Throwable th) {
                    aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
                    throw th;
                }
            }
            if (zM17697L2) {
                AbstractC8070f0.m31125m0(interfaceC8074h0, interfaceC7090i3M27794O);
            }
        }
    }
}
