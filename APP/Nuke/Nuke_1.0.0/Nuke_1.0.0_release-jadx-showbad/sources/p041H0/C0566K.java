package p041H0;

import com.bumptech.glide.AbstractC1925g;
import p000A.C0072l0;
import p011B4.AbstractC0231b;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2206o;
import p211o0.AbstractC2758q;
import p211o0.C2747f;
import p211o0.C2750i;
import p211o0.C2753l;
import p211o0.InterfaceC2760s;
import p222q0.AbstractC2902c;
import p222q0.C2900a;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;
import p228r0.C3029b;

/* JADX INFO: renamed from: H0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0566K implements InterfaceC2903d {

    /* JADX INFO: renamed from: d */
    public final C2901b f1742d = new C2901b();

    /* JADX INFO: renamed from: e */
    public InterfaceC0605m f1743e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: C */
    public final long mo266C(float f2) {
        return this.f1742d.mo266C(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: E */
    public final long mo267E(long j5) {
        return this.f1742d.mo267E(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: F */
    public final void mo853F(long j5, long j6, long j7, AbstractC2902c abstractC2902c, int i5) {
        this.f1742d.mo853F(j5, j6, j7, abstractC2902c, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: G */
    public final float mo268G(float f2) {
        return this.f1742d.mo272b() * f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: L */
    public final C0072l0 mo854L() {
        return this.f1742d.f9185e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: M */
    public final float mo269M(long j5) {
        return this.f1742d.mo269M(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: S */
    public final int mo270S(float f2) {
        return this.f1742d.mo270S(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: V */
    public final void mo855V(long j5, long j6, long j7, float f2, int i5) {
        this.f1742d.mo855V(j5, j6, j7, f2, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: Y */
    public final long mo856Y() {
        return this.f1742d.mo856Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m857a() {
        C2901b c2901b = this.f1742d;
        InterfaceC2760s interfaceC2760sM106j = c2901b.f9185e.m106j();
        InterfaceC0597i interfaceC0597i = this.f1743e;
        if (interfaceC0597i == null) {
            throw AbstractC0231b.m396g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC2206o abstractC2206o = (AbstractC2206o) interfaceC0597i;
        AbstractC2206o abstractC2206oM1029e = abstractC2206o.f7186d.f7191i;
        if (abstractC2206oM1029e == null || (abstractC2206oM1029e.f7189g & 4) == 0) {
            abstractC2206oM1029e = null;
        } else {
            while (abstractC2206oM1029e != null) {
                int i5 = abstractC2206oM1029e.f7188f;
                if ((i5 & 2) != 0) {
                    break;
                } else if ((i5 & 4) != 0) {
                    break;
                } else {
                    abstractC2206oM1029e = abstractC2206oM1029e.f7191i;
                }
            }
            abstractC2206oM1029e = null;
        }
        if (abstractC2206oM1029e == null) {
            AbstractC0596h0 abstractC0596h0M1042r = AbstractC0601k.m1042r(interfaceC0597i, 4);
            if (abstractC0596h0M1042r.mo981R0() == abstractC2206o.f7186d) {
                abstractC0596h0M1042r = abstractC0596h0M1042r.f1933s;
                AbstractC1665j.m2982b(abstractC0596h0M1042r);
            }
            abstractC0596h0M1042r.mo996g1(interfaceC2760sM106j, (C3029b) c2901b.f9185e.f308f);
            return;
        }
        C1483e c1483e = null;
        while (abstractC2206oM1029e != null) {
            if (abstractC2206oM1029e instanceof InterfaceC0605m) {
                InterfaceC0605m interfaceC0605m = (InterfaceC0605m) abstractC2206oM1029e;
                C3029b c3029b = (C3029b) c2901b.f9185e.f308f;
                AbstractC0596h0 abstractC0596h0M1042r2 = AbstractC0601k.m1042r(interfaceC0605m, 4);
                long jM3523F = AbstractC1925g.m3523F(abstractC0596h0M1042r2.f1208f);
                C0564I c0564i = abstractC0596h0M1042r2.f1932r;
                c0564i.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getSharedDrawScope().m860d(interfaceC2760sM106j, jM3523F, abstractC0596h0M1042r2, interfaceC0605m, c3029b);
            } else if ((abstractC2206oM1029e.f7188f & 4) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                int i6 = 0;
                for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                    if ((abstractC2206o2.f7188f & 4) != 0) {
                        i6++;
                        if (i6 == 1) {
                            abstractC2206oM1029e = abstractC2206o2;
                        } else {
                            if (c1483e == null) {
                                c1483e = new C1483e(new AbstractC2206o[16]);
                            }
                            if (abstractC2206oM1029e != null) {
                                c1483e.m2753b(abstractC2206oM1029e);
                                abstractC2206oM1029e = null;
                            }
                            c1483e.m2753b(abstractC2206o2);
                        }
                    }
                }
                if (i6 == 1) {
                }
            }
            abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: a0 */
    public final void mo858a0(long j5, float f2, long j6, AbstractC2902c abstractC2902c) {
        this.f1742d.mo858a0(j5, f2, j6, abstractC2902c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1742d.mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: c */
    public final long mo859c() {
        return this.f1742d.mo859c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: c0 */
    public final long mo273c0(long j5) {
        return this.f1742d.mo273c0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m860d(InterfaceC2760s interfaceC2760s, long j5, AbstractC0596h0 abstractC0596h0, InterfaceC0605m interfaceC0605m, C3029b c3029b) {
        InterfaceC0605m interfaceC0605m2 = this.f1743e;
        this.f1743e = interfaceC0605m;
        EnumC2017m enumC2017m = abstractC0596h0.f1932r.f1693D;
        C2901b c2901b = this.f1742d;
        C0072l0 c0072l0 = c2901b.f9185e;
        C2900a c2900a = ((C2901b) c0072l0.f309g).f9184d;
        InterfaceC2007c interfaceC2007c = c2900a.f9180a;
        EnumC2017m enumC2017m2 = c2900a.f9181b;
        InterfaceC2760s interfaceC2760sM106j = c0072l0.m106j();
        C0072l0 c0072l02 = c2901b.f9185e;
        long jM110n = c0072l02.m110n();
        C3029b c3029b2 = (C3029b) c0072l02.f308f;
        c0072l02.m117w(abstractC0596h0);
        c0072l02.m118x(enumC2017m);
        c0072l02.m116v(interfaceC2760s);
        c0072l02.m119y(j5);
        c0072l02.f308f = c3029b;
        interfaceC2760s.mo4852n();
        try {
            interfaceC0605m.mo940R(this);
            interfaceC2760s.mo4851l();
            c0072l02.m117w(interfaceC2007c);
            c0072l02.m118x(enumC2017m2);
            c0072l02.m116v(interfaceC2760sM106j);
            c0072l02.m119y(jM110n);
            c0072l02.f308f = c3029b2;
            this.f1743e = interfaceC0605m2;
        } catch (Throwable th) {
            interfaceC2760s.mo4851l();
            c0072l02.m117w(interfaceC2007c);
            c0072l02.m118x(enumC2017m2);
            c0072l02.m116v(interfaceC2760sM106j);
            c0072l02.m119y(jM110n);
            c0072l02.f308f = c3029b2;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m861e(AbstractC2758q abstractC2758q, long j5, long j6, float f2, AbstractC2902c abstractC2902c) {
        C2901b c2901b = this.f1742d;
        int i5 = (int) (j5 >> 32);
        int i6 = (int) (j5 & 4294967295L);
        c2901b.f9184d.f9182c.mo4854p(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i5), Float.intBitsToFloat(i6) + Float.intBitsToFloat((int) (j6 & 4294967295L)), c2901b.m5097d(abstractC2758q, abstractC2902c, f2, null, 3, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: e0 */
    public final float mo276e0(long j5) {
        return this.f1742d.mo276e0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    public final EnumC2017m getLayoutDirection() {
        return this.f1742d.f9184d.f9181b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: k0 */
    public final long mo280k0(float f2) {
        return this.f1742d.mo280k0(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: o */
    public final void mo862o(C2750i c2750i, long j5, AbstractC2902c abstractC2902c) {
        this.f1742d.mo862o(c2750i, j5, abstractC2902c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: o0 */
    public final void mo863o0(C2750i c2750i, AbstractC2758q abstractC2758q, float f2, AbstractC2902c abstractC2902c, int i5) {
        this.f1742d.mo863o0(c2750i, abstractC2758q, f2, abstractC2902c, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1742d.mo282p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: q0 */
    public final float mo283q0(int i5) {
        return this.f1742d.mo283q0(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: t */
    public final void mo864t(AbstractC2758q abstractC2758q, long j5, long j6, long j7, float f2, AbstractC2902c abstractC2902c) {
        this.f1742d.mo864t(abstractC2758q, j5, j6, j7, f2, abstractC2902c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: u */
    public final void mo865u(C2747f c2747f, long j5, long j6, long j7, float f2, C2753l c2753l, int i5) {
        this.f1742d.mo865u(c2747f, j5, j6, j7, f2, c2753l, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: u0 */
    public final float mo284u0(float f2) {
        return f2 / this.f1742d.mo272b();
    }
}
